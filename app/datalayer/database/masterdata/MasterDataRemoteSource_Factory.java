package com.forsale.app.datalayer.database.masterdata;

import com.forsale.app.datalayer.network.services.MasterDataService;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class MasterDataRemoteSource_Factory implements b<MasterDataRemoteSource> {
    private final a<MasterDataService> masterDataServiceProvider;
    private final a<jj.b> prefsProvider;

    public MasterDataRemoteSource_Factory(a<MasterDataService> aVar, a<jj.b> aVar2) {
        this.masterDataServiceProvider = aVar;
        this.prefsProvider = aVar2;
    }

    public static MasterDataRemoteSource_Factory create(a<MasterDataService> aVar, a<jj.b> aVar2) {
        return new MasterDataRemoteSource_Factory(aVar, aVar2);
    }

    public static MasterDataRemoteSource newInstance(MasterDataService masterDataService, jj.b bVar) {
        return new MasterDataRemoteSource(masterDataService, bVar);
    }

    @Override // vz.a
    public MasterDataRemoteSource get() {
        return newInstance(this.masterDataServiceProvider.get(), this.prefsProvider.get());
    }
}
