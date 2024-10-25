package com.forsale.app.datalayer.network.interceptors;

import android.content.Context;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.forsale.app.utils.ContextExtensionsKt;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import jj.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.d;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.c;
/* compiled from: AuthorizationInterceptor.kt */
/* loaded from: classes2.dex */
public final class AuthorizationInterceptor implements Interceptor {
    private static final String ACCEPT = "Accept";
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String APPLICATION_SOURCE_HEADER_KEY = "Application-Source";
    private static final String AUTHORIZATION = "Authorization";
    private static final String AUTH_HEADER_KEY = "X-Custom-Authorization";
    private static final String COLON_SEPARATOR = ":";
    private static final String CONTENT_JSON = "application/json";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String DEVICE_ID_HEADER_KEY = "Device-Id";
    private static final String DEVICE_TYPE = "Device-Type";
    private static final String HMAC_SECRET = "45cdbe4aca65f6a52725d6e1b55fd007b4223529";
    private static final String SPACE_SEPARATOR = " ";
    private static final String VERSION_NUMBER_HEADER_KEY = "Version-Number";
    private final Context context;
    private final b prefs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AuthorizationInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthorizationInterceptor(Context context, b prefs) {
        o.i(context, "context");
        o.i(prefs, "prefs");
        this.context = context;
        this.prefs = prefs;
    }

    private final String asBase64(String str) {
        byte[] bytes = str.getBytes(d.f61861b);
        o.h(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        o.h(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    private final String asSHA1(String str) {
        StringBuilder sb2 = new StringBuilder();
        MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA1);
        byte[] bytes = str.getBytes(d.f61861b);
        o.h(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        o.h(digest, "digest(...)");
        ArrayList<Number> arrayList = new ArrayList(digest.length);
        for (byte b11 : digest) {
            arrayList.add(Integer.valueOf(b11));
        }
        for (Number number : arrayList) {
            String num = Integer.toString((number.intValue() & 255) + 256, 16);
            o.h(num, "toString(...)");
            String substring = num.substring(1);
            o.h(substring, "substring(...)");
            sb2.append(substring);
        }
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        return sb3;
    }

    private final String extractRequestBody(Request request) {
        RequestBody body = request.body();
        if (body != null) {
            c cVar = new c();
            body.writeTo(cVar);
            String y12 = cVar.y1();
            if (y12 != null) {
                return y12;
            }
        }
        return "";
    }

    private final String extractRequestPath(Request request) {
        List U;
        List U2;
        String t02;
        U = x.U(request.url().pathSegments());
        U2 = x.U(U.subList(0, 3));
        t02 = CollectionsKt___CollectionsKt.t0(U2, "/", "/", null, 0, null, null, 60, null);
        return t02;
    }

    private final String formHMAC(String str, long j11, String str2) {
        String str3 = str + SPACE_SEPARATOR + j11 + SPACE_SEPARATOR + str2;
        o.h(str3, "toString(...)");
        return str3;
    }

    private final String formRawSignature(String str, String str2, String str3, long j11) {
        String str4 = str + COLON_SEPARATOR + str2 + COLON_SEPARATOR + str3 + COLON_SEPARATOR + j11 + COLON_SEPARATOR + HMAC_SECRET;
        o.h(str4, "toString(...)");
        return str4;
    }

    private final String generateHMAC(Request request) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return formHMAC("com.forsale.forsale", currentTimeMillis, asSHA1(asBase64(formRawSignature("com.forsale.forsale", extractRequestPath(request), extractRequestBody(request), currentTimeMillis))));
    }

    private final String getVersionNumber(String str) {
        List E0;
        E0 = StringsKt__StringsKt.E0(str, new char[]{'-'}, false, 0, 6, null);
        if (E0.size() > 0) {
            return (String) E0.get(0);
        }
        return str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Object runBlocking$default;
        Object runBlocking$default2;
        Object runBlocking$default3;
        o.i(chain, "chain");
        boolean z11 = true;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor$intercept$deviceId$1(this, null), 1, null);
        runBlocking$default2 = BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor$intercept$accessToken$1(this, null), 1, null);
        String str = (String) runBlocking$default2;
        runBlocking$default3 = BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor$intercept$locale$1(this, null), 1, null);
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader(CONTENT_TYPE_KEY, "application/json");
        newBuilder.addHeader("Accept", "application/json");
        newBuilder.addHeader(AUTH_HEADER_KEY, generateHMAC(chain.request()));
        newBuilder.addHeader(DEVICE_ID_HEADER_KEY, (String) runBlocking$default);
        newBuilder.addHeader(VERSION_NUMBER_HEADER_KEY, getVersionNumber("28.3.1"));
        newBuilder.addHeader("Accept-Language", (String) runBlocking$default3);
        newBuilder.addHeader(DEVICE_TYPE, ContextExtensionsKt.n(this.context));
        newBuilder.addHeader(APPLICATION_SOURCE_HEADER_KEY, "q84sale");
        if (str.length() <= 0) {
            z11 = false;
        }
        if (z11) {
            newBuilder.addHeader("Authorization", "Bearer " + str);
        }
        return chain.proceed(newBuilder.build());
    }
}
