<?php


use Illuminate\Support\Facades\Http;

class AuthorizationService
{
    private $context;
    private $prefs;
    
    const HMAC_SECRET = "45cdbe4aca65f6a52725d6e1b55fd007b4223529";

    public function __construct($context, $prefs)
    {
        $this->context = $context;
        $this->prefs = $prefs;
    }
    
    private function asBase64($str)
    {
        return base64_encode($str);
    }
    
    private function asSHA1($str)
    {
        return sha1($str, true);
    }
    
    private function generateHMAC($request)
    {
        $currentTimeMillis = time();
        $signature = $this->asSHA1($this->asBase64("com.forsale.forsale:" . $this->extractRequestPath($request) . ":" . $this->extractRequestBody($request) . ":$currentTimeMillis:" . self::HMAC_SECRET));
        
        return "com.forsale.forsale $currentTimeMillis $signature";
    }
    
    private function getVersionNumber($str)
    {
        return explode('-', $str, 2)[0];
    }

    public function intercept($request)
    {
        $deviceId = ''; // implement logic to get deviceId
        $accessToken = ''; // implement logic to get accessToken
        $locale = ''; // implement logic to get locale

        $headers = [
            'Content-Type' => 'application/json',
            'Accept' => 'application/json',
            'X-Custom-Authorization' => $this->generateHMAC($request),
            'Device-Id' => $deviceId,
            'Version-Number' => $this->getVersionNumber("28.3.1"),
            'Accept-Language' => $locale,
            'Device-Type' => '', // implement logic to get device type
            'Application-Source' => 'q84sale'
        ];
        
        if (!empty($accessToken)) {
            $headers['Authorization'] = 'Bearer ' . $accessToken;
        }

        return Http::withHeaders($headers)->send($request->getMethod(), $request->getUri());
    }

    // Other private methods remain unchanged

    private function extractRequestBody($request)
    {
        $body = $request->getContent();
        return $body ?: "";
    }

    private function extractRequestPath($request)
    {
        return implode('/', array_slice(explode('/', $request->getUri()->getPath()), 0, 3));
    }
}
