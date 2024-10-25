package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
import retrofit2.b;
import retrofit2.c;
import retrofit2.x;
/* compiled from: ResultAdapterFactory.kt */
/* loaded from: classes2.dex */
public final class ResultCallAdapterFactory extends c.a {
    public static final int $stable = 0;
    private final ErrorMapper errorMapper;
    private final ErrorModelSerializer errorModelSerializer;

    public ResultCallAdapterFactory(ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        o.i(errorModelSerializer, "errorModelSerializer");
        o.i(errorMapper, "errorMapper");
        this.errorModelSerializer = errorModelSerializer;
        this.errorMapper = errorMapper;
    }

    @Override // retrofit2.c.a
    public c<?, ?> get(Type returnType, Annotation[] annotations, x retrofit) {
        o.i(returnType, "returnType");
        o.i(annotations, "annotations");
        o.i(retrofit, "retrofit");
        if (!o.d(c.a.getRawType(returnType), b.class) || !(returnType instanceof ParameterizedType)) {
            return null;
        }
        final Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!(parameterUpperBound instanceof ParameterizedType) || !o.d(((ParameterizedType) parameterUpperBound).getRawType(), ForSaleDataResult.class)) {
            return null;
        }
        return new c<Object, b<ForSaleDataResult<?>>>() { // from class: com.forsale.app.datalayer.network.adapters.ResultCallAdapterFactory$get$1
            @Override // retrofit2.c
            public Type responseType() {
                Type parameterUpperBound2;
                parameterUpperBound2 = c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                o.h(parameterUpperBound2, "access$getParameterUpperBound$s572770538(...)");
                return parameterUpperBound2;
            }

            @Override // retrofit2.c
            public b<ForSaleDataResult<?>> adapt(b<Object> call) {
                ErrorModelSerializer errorModelSerializer;
                ErrorMapper errorMapper;
                o.i(call, "call");
                errorModelSerializer = this.errorModelSerializer;
                errorMapper = this.errorMapper;
                return new ResultCallAdapter(call, errorModelSerializer, errorMapper);
            }
        };
    }
}
