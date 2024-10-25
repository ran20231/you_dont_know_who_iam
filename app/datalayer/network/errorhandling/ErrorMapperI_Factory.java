package com.forsale.app.datalayer.network.errorhandling;

import dagger.internal.b;
/* loaded from: classes2.dex */
public final class ErrorMapperI_Factory implements b<ErrorMapperI> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final ErrorMapperI_Factory INSTANCE = new ErrorMapperI_Factory();

        private InstanceHolder() {
        }
    }

    public static ErrorMapperI_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ErrorMapperI newInstance() {
        return new ErrorMapperI();
    }

    @Override // vz.a
    public ErrorMapperI get() {
        return newInstance();
    }
}
