package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import dagger.internal.b;
import dagger.internal.d;
import vz.a;
/* loaded from: classes2.dex */
public final class ResultAdapterModule_ProvideGeneralCallAdapterFactory implements b<ResultCallAdapterFactory> {
    private final a<ErrorMapper> errorMapperProvider;
    private final a<ErrorModelSerializer> errorModelSerializerProvider;
    private final ResultAdapterModule module;

    public ResultAdapterModule_ProvideGeneralCallAdapterFactory(ResultAdapterModule resultAdapterModule, a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        this.module = resultAdapterModule;
        this.errorModelSerializerProvider = aVar;
        this.errorMapperProvider = aVar2;
    }

    public static ResultAdapterModule_ProvideGeneralCallAdapterFactory create(ResultAdapterModule resultAdapterModule, a<ErrorModelSerializer> aVar, a<ErrorMapper> aVar2) {
        return new ResultAdapterModule_ProvideGeneralCallAdapterFactory(resultAdapterModule, aVar, aVar2);
    }

    public static ResultCallAdapterFactory provideGeneralCallAdapter(ResultAdapterModule resultAdapterModule, ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        return (ResultCallAdapterFactory) d.e(resultAdapterModule.provideGeneralCallAdapter(errorModelSerializer, errorMapper));
    }

    @Override // vz.a
    public ResultCallAdapterFactory get() {
        return provideGeneralCallAdapter(this.module, this.errorModelSerializerProvider.get(), this.errorMapperProvider.get());
    }
}
