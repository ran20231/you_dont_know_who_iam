package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import dagger.internal.b;
import dagger.internal.d;
/* loaded from: classes2.dex */
public final class ResultAdapterModule_ProvideErrorMapperFactory implements b<ErrorMapper> {
    private final ResultAdapterModule module;

    public ResultAdapterModule_ProvideErrorMapperFactory(ResultAdapterModule resultAdapterModule) {
        this.module = resultAdapterModule;
    }

    public static ResultAdapterModule_ProvideErrorMapperFactory create(ResultAdapterModule resultAdapterModule) {
        return new ResultAdapterModule_ProvideErrorMapperFactory(resultAdapterModule);
    }

    public static ErrorMapper provideErrorMapper(ResultAdapterModule resultAdapterModule) {
        return (ErrorMapper) d.e(resultAdapterModule.provideErrorMapper());
    }

    @Override // vz.a
    public ErrorMapper get() {
        return provideErrorMapper(this.module);
    }
}
