package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class ResultCallAdapterFactory_Factory implements b<ResultCallAdapterFactory> {
    private final a<ErrorMapper> errorMapperProvider;
    private final a<ErrorModelSerializer> errorModelSerializerProvider;

    public ResultCallAdapterFactory_Factory(a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        this.errorModelSerializerProvider = aVar;
        this.errorMapperProvider = aVar2;
    }

    public static ResultCallAdapterFactory_Factory create(a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        return new ResultCallAdapterFactory_Factory(aVar, aVar2);
    }

    public static ResultCallAdapterFactory newInstance(ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        return new ResultCallAdapterFactory(errorModelSerializer, errorMapper);
    }

    @Override // vz.a
    public ResultCallAdapterFactory get() {
        return newInstance(this.errorModelSerializerProvider.get(), this.errorMapperProvider.get());
    }
}
