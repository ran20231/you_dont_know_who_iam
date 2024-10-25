package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import dagger.internal.b;
import dagger.internal.d;
import vz.a;
/* loaded from: classes2.dex */
public final class ResultAdapterModule_ProvideAuthCallAdapterFactory implements b<ResultCallAdapterFactory> {
    private final a<ErrorMapper> errorMapperProvider;
    private final a<ErrorModelSerializer> errorModelSerializerProvider;
    private final ResultAdapterModule module;

    public ResultAdapterModule_ProvideAuthCallAdapterFactory(ResultAdapterModule resultAdapterModule, a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        this.module = resultAdapterModule;
        this.errorModelSerializerProvider = aVar;
        this.errorMapperProvider = aVar2;
    }

    public static ResultAdapterModule_ProvideAuthCallAdapterFactory create(ResultAdapterModule resultAdapterModule, a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        return new ResultAdapterModule_ProvideAuthCallAdapterFactory(resultAdapterModule, aVar, aVar2);
    }

    public static ResultCallAdapterFactory provideAuthCallAdapter(ResultAdapterModule resultAdapterModule, ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        return (ResultCallAdapterFactory) d.e(resultAdapterModule.provideAuthCallAdapter(errorModelSerializer, errorMapper));
    }

    @Override // vz.a
    public ResultCallAdapterFactory get() {
        return provideAuthCallAdapter(this.module, this.errorModelSerializerProvider.get(), this.errorMapperProvider.get());
    }
}
