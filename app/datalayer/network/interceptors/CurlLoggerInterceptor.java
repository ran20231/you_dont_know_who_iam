package com.forsale.app.datalayer.network.interceptors;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.c;
import x10.a;
/* compiled from: CurlLoggerInterceptor.kt */
/* loaded from: classes2.dex */
public final class CurlLoggerInterceptor implements Interceptor {
    public static final int $stable = 0;

    private final void addHeader(StringBuilder sb2, String str, String str2) {
        sb2.append("-H \"" + str + ": " + str2 + "\" \\\n");
    }

    private final void print(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\n');
        o.h(sb2, "append(...)");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        sb2.append("URL: " + str);
        sb2.append('\n');
        o.h(sb2, "append(...)");
        sb2.append("────────────────────────────────────────────");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        sb2.append(str2);
        sb2.append('\n');
        o.h(sb2, "append(...)");
        sb2.append("────────────────────────────────────────────");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        a.g("cURL").a(sb3, new Object[0]);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        o.i(chain, "chain");
        Request request = chain.request();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cURL \\\n");
        String method = request.method();
        sb2.append("-X " + method + " \\\n");
        Iterator<Pair<? extends String, ? extends String>> it2 = request.headers().iterator();
        while (it2.hasNext()) {
            Pair<? extends String, ? extends String> next = it2.next();
            addHeader(sb2, next.a(), next.b());
        }
        RequestBody body = request.body();
        if (body != null) {
            c cVar = new c();
            body.writeTo(cVar);
            MediaType contentType = body.contentType();
            if (contentType != null) {
                addHeader(sb2, "Content-Type", contentType.toString());
                Charset charset$default = MediaType.charset$default(contentType, null, 1, null);
                if (charset$default == null) {
                    charset$default = Charset.forName(Constants.ENCODING);
                }
                o.f(charset$default);
                String z11 = cVar.z(charset$default);
                sb2.append("-d '" + z11 + "' \\\n");
            }
        }
        HttpUrl url = request.url();
        sb2.append("\"" + url + "\" \\\n");
        sb2.append("-L");
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        print(request.url().toString(), sb3);
        return chain.proceed(request);
    }
}
