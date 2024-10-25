package com.forsale.app.datalayer.network.interceptors;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import kotlin.jvm.internal.o;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: JsonValidationInterceptor.kt */
/* loaded from: classes2.dex */
public final class JsonValidationInterceptor implements Interceptor {
    public static final int $stable = 0;

    /* compiled from: JsonValidationInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final class JsonParsingException extends IOException {
        public static final int $stable = 0;

        public JsonParsingException() {
            super("The call response is ambiguous");
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        o.i(chain, "chain");
        try {
            return chain.proceed(chain.request());
        } catch (JsonSyntaxException unused) {
            throw new JsonParsingException();
        }
    }
}
