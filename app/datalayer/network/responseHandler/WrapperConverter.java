package com.forsale.app.datalayer.network.responseHandler;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.responseHandler.WrapperConverter;
import com.google.gson.reflect.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.x;
/* compiled from: WrapperConverter.kt */
/* loaded from: classes2.dex */
public final class WrapperConverter extends f.a {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object responseBodyConverter$lambda$0(f delegate, ResponseBody responseBody) {
        ResponseWrapper.ResponseError responseError;
        o.i(delegate, "$delegate");
        ResponseWrapper responseWrapper = (ResponseWrapper) delegate.a(responseBody);
        if (responseWrapper != null) {
            responseError = responseWrapper.getError();
        } else {
            responseError = null;
        }
        if (responseError == null) {
            if (responseWrapper != null) {
                return responseWrapper.getResponse();
            }
            throw new ResponseWrapper.EmptyResponseWrapperException();
        }
        throw responseWrapper.getError().asServerErrorException();
    }

    @Override // retrofit2.f.a
    public f<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, x retrofit) {
        o.i(type, "type");
        o.i(annotations, "annotations");
        o.i(retrofit, "retrofit");
        final f g11 = retrofit.g(this, a.getParameterized(ResponseWrapper.class, type).getType(), annotations);
        o.h(g11, "nextResponseBodyConverter(...)");
        return new f() { // from class: ba.a
            @Override // retrofit2.f
            public final Object a(Object obj) {
                Object responseBodyConverter$lambda$0;
                responseBodyConverter$lambda$0 = WrapperConverter.responseBodyConverter$lambda$0(f.this, (ResponseBody) obj);
                return responseBodyConverter$lambda$0;
            }
        };
    }
}
