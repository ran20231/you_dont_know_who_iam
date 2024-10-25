package com.forsale.adserver.datalayer.network.interceptors;

import android.app.Application;
import android.content.Context;
import com.forsale.adserver.utils.extensions.ContextExtensionsKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: ConnectivityInterceptor.kt */
/* loaded from: classes2.dex */
public final class ConnectivityInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f20742a;

    /* compiled from: ConnectivityInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final class ConnectivityException extends IOException {

        /* renamed from: a  reason: collision with root package name */
        private final String f20743a = "Connection Not Found Exception";

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f20743a;
        }
    }

    public ConnectivityInterceptor(WeakReference<Context> ctx) {
        o.i(ctx, "ctx");
        this.f20742a = ctx;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response proceed;
        o.i(chain, "chain");
        if (this.f20742a.get() instanceof Application) {
            Context context = this.f20742a.get();
            if (context != null) {
                if (!ContextExtensionsKt.b(context)) {
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
