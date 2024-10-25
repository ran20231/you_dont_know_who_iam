package com.forsale.app.datalayer.network.interceptors;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.google.gson.d;
import com.google.gson.j;
import kotlin.jvm.internal.o;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.e;
/* compiled from: ForSaleResponseInterceptor.kt */
/* loaded from: classes2.dex */
public final class ForSaleResponseInterceptor implements Interceptor {
    public static final int $stable = 0;

    private final Response mapToNewBody(Response response, MediaType mediaType, j jVar) {
        Response.Builder newBuilder = response.newBuilder();
        ResponseBody.Companion companion = ResponseBody.Companion;
        String jVar2 = jVar.toString();
        o.h(jVar2, "toString(...)");
        return newBuilder.body(companion.create(jVar2, mediaType)).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response response;
        ResponseBody body;
        ResponseWrapper.ResponseErrorException asServerErrorException;
        o.i(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        String str = null;
        if (proceed.isSuccessful()) {
            response = proceed;
        } else {
            response = null;
        }
        if (response != null && (body = response.body()) != null) {
            d dVar = new d();
            e peek = body.source().peek();
            if (peek != null) {
                str = peek.y1();
            }
            ResponseWrapper responseWrapper = (ResponseWrapper) dVar.k(str, ResponseWrapper.class);
            if (responseWrapper.getResponse() == null) {
                ResponseWrapper.ResponseError error = responseWrapper.getError();
                if (error != null && (asServerErrorException = error.asServerErrorException()) != null) {
                    throw asServerErrorException;
                }
                throw new ResponseWrapper.EmptyResponseWrapperException();
            }
        }
        return proceed;
    }
}
