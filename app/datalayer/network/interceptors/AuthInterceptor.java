package com.forsale.app.datalayer.network.interceptors;

import com.forsale.app.datalayer.network.entities.errors.AuthErrorModel;
import com.google.gson.d;
import jj.b;
import kotlin.jvm.internal.o;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import x10.a;
/* compiled from: AuthInterceptor.kt */
/* loaded from: classes2.dex */
public final class AuthInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final b pref;

    public AuthInterceptor(b pref) {
        o.i(pref, "pref");
        this.pref = pref;
    }

    public final b getPref() {
        return this.pref;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        o.i(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        if (!proceed.isSuccessful()) {
            int code = proceed.code();
            String str = null;
            if (code != 401) {
                if (code != 403) {
                    if (code == 422) {
                        d dVar = new d();
                        ResponseBody body = proceed.body();
                        if (body != null) {
                            str = body.string();
                        }
                        AuthErrorModel authErrorModel = (AuthErrorModel) dVar.k(str, AuthErrorModel.class);
                        a.b("AuthInterceptor: errorModel: 422:: " + authErrorModel, new Object[0]);
                        throw new ServerException(proceed.code(), String.valueOf(authErrorModel.getMessage()));
                    }
                } else {
                    d dVar2 = new d();
                    ResponseBody body2 = proceed.body();
                    if (body2 != null) {
                        str = body2.string();
                    }
                    AuthErrorModel authErrorModel2 = (AuthErrorModel) dVar2.k(str, AuthErrorModel.class);
                    a.b("AuthInterceptor: errorModel: 403:: " + authErrorModel2, new Object[0]);
                    throw new ServerException(proceed.code(), String.valueOf(authErrorModel2.getMessage()));
                }
            } else {
                d dVar3 = new d();
                ResponseBody body3 = proceed.body();
                if (body3 != null) {
                    str = body3.string();
                }
                AuthErrorModel authErrorModel3 = (AuthErrorModel) dVar3.k(str, AuthErrorModel.class);
                a.b("AuthInterceptor: errorModel: 401:: " + authErrorModel3, new Object[0]);
                throw new ServerException(proceed.code(), String.valueOf(authErrorModel3.getMessage()));
            }
        }
        return proceed;
    }
}
