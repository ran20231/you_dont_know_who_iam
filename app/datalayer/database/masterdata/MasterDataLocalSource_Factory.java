package com.forsale.app.datalayer.database.masterdata;

import dagger.internal.b;
/* loaded from: classes2.dex */
public final class MasterDataLocalSource_Factory implements b<MasterDataLocalSource> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final MasterDataLocalSource_Factory INSTANCE = new MasterDataLocalSource_Factory();

        private InstanceHolder() {
        }
    }

    public static MasterDataLocalSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MasterDataLocalSource newInstance() {
        return new MasterDataLocalSource();
    }

    @Override // vz.a
    public MasterDataLocalSource get() {
        return newInstance();
    }
}
