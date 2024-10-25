package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.ErrorMapperI;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.AuthSerializer;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ValidationSerializer;
import kotlin.jvm.internal.o;
/* compiled from: ResultAdapterModule.kt */
/* loaded from: classes2.dex */
public final class ResultAdapterModule {
    public static final int $stable = 0;

    @AuthResultCallAdapter
    public final ResultCallAdapterFactory provideAuthCallAdapter(@AuthSerializer ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        o.i(errorModelSerializer, "errorModelSerializer");
        o.i(errorMapper, "errorMapper");
        return new ResultCallAdapterFactory(errorModelSerializer, errorMapper);
    }

    public final ErrorMapper provideErrorMapper() {
        return new ErrorMapperI();
    }

    @GeneralResultCallAdapter
    public final ResultCallAdapterFactory provideGeneralCallAdapter(@ValidationSerializer ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        o.i(errorModelSerializer, "errorModelSerializer");
        o.i(errorMapper, "errorMapper");
        return new ResultCallAdapterFactory(errorModelSerializer, errorMapper);
    }
}
