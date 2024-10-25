package com.forsale.app.datalayer.network.interceptors;

import android.app.Application;
import android.content.Context;
import com.forsale.app.utils.ContextExtensionsKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: ConnectivityInterceptor.kt */
/* loaded from: classes2.dex */
public final class ConnectivityInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final WeakReference<Context> ctx;

    /* compiled from: ConnectivityInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final class ConnectivityException extends IOException {
        public static final int $stable = 0;

        public ConnectivityException() {
            super("Connection Not Found Exception");
        }
    }

    public ConnectivityInterceptor(WeakReference<Context> ctx) {
        o.i(ctx, "ctx");
        this.ctx = ctx;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response proceed;
        o.i(chain, "chain");
        if (this.ctx.get() instanceof Application) {
            Context context = this.ctx.get();
            if (context != null) {
                if (!ContextExtensionsKt.v(context)) {
                    context = null;
                }
                if (context != null && (proceed = chain.proceed(chain.request())) != null) {
                    return proceed;
                }
            }
            throw new ConnectivityException();
        }
        throw new IllegalArgumentException("You mast provide an application context to don't cause memory leaks");
    }
}
