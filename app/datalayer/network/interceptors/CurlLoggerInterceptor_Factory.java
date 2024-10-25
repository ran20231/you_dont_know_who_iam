package com.forsale.app.datalayer.network.interceptors;

import dagger.internal.b;
/* loaded from: classes2.dex */
public final class CurlLoggerInterceptor_Factory implements b<CurlLoggerInterceptor> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final CurlLoggerInterceptor_Factory INSTANCE = new CurlLoggerInterceptor_Factory();

        private InstanceHolder() {
        }
    }

    public static CurlLoggerInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CurlLoggerInterceptor newInstance() {
        return new CurlLoggerInterceptor();
    }

    @Override // vz.a
    public CurlLoggerInterceptor get() {
        return newInstance();
    }
}
