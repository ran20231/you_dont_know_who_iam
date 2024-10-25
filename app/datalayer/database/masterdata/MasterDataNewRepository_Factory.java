package com.forsale.app.datalayer.database.masterdata;

import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class MasterDataNewRepository_Factory implements b<MasterDataNewRepository> {
    private final a<MasterDataFileManager> masterDataFileManagerProvider;
    private final a<MasterDataRemoteSource> masterDataRemoteSourceProvider;
    private final a<jj.b> prefsProvider;

    public MasterDataNewRepository_Factory(a<MasterDataRemoteSource> aVar, a<MasterDataFileManager> aVar2, a<jj.b> aVar3) {
        this.masterDataRemoteSourceProvider = aVar;
        this.masterDataFileManagerProvider = aVar2;
        this.prefsProvider = aVar3;
    }

    public static MasterDataNewRepository_Factory create(a<MasterDataRemoteSource> aVar, a<MasterDataFileManager> aVar2, a<jj.b> aVar3) {
        return new MasterDataNewRepository_Factory(aVar, aVar2, aVar3);
    }

    public static MasterDataNewRepository newInstance(MasterDataRemoteSource masterDataRemoteSource, MasterDataFileManager masterDataFileManager, jj.b bVar) {
        return new MasterDataNewRepository(masterDataRemoteSource, masterDataFileManager, bVar);
    }

    @Override // vz.a
    public MasterDataNewRepository get() {
        return newInstance(this.masterDataRemoteSourceProvider.get(), this.masterDataFileManagerProvider.get(), this.prefsProvider.get());
    }
}
