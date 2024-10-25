package com.forsale.app.datalayer.repositories;

import android.content.Context;
import com.forsale.app.datalayer.database.MasterDataDatabase;
/* loaded from: classes2.dex */
public final class MasterDataMigrationRepository_Factory implements dagger.internal.b<MasterDataMigrationRepository> {
    private final vz.a<Context> contextProvider;
    private final vz.a<MasterDataDatabase> realMasterDataDatabaseProvider;

    public MasterDataMigrationRepository_Factory(vz.a<MasterDataDatabase> aVar, vz.a<Context> aVar2) {
        this.realMasterDataDatabaseProvider = aVar;
        this.contextProvider = aVar2;
    }

    public static MasterDataMigrationRepository_Factory create(vz.a<MasterDataDatabase> aVar, vz.a<Context> aVar2) {
        return new MasterDataMigrationRepository_Factory(aVar, aVar2);
    }

    public static MasterDataMigrationRepository newInstance(MasterDataDatabase masterDataDatabase, Context context) {
        return new MasterDataMigrationRepository(masterDataDatabase, context);
    }

    @Override // vz.a
    public MasterDataMigrationRepository get() {
        return newInstance(this.realMasterDataDatabaseProvider.get(), this.contextProvider.get());
    }
}
