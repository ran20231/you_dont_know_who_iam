package com.forsale.app.datalayer.database;

import android.content.Context;
import com.forsale.app.datalayer.repositories.MasterDataMigrationRepository;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class DBManager_Factory implements b<DBManager> {
    private final a<Context> appContextProvider;
    private final a<MasterDataMigrationRepository> masterDataMigrationRepositoryProvider;

    public DBManager_Factory(a<Context> aVar, a<MasterDataMigrationRepository> aVar2) {
        this.appContextProvider = aVar;
        this.masterDataMigrationRepositoryProvider = aVar2;
    }

    public static DBManager_Factory create(a<Context> aVar, a<MasterDataMigrationRepository> aVar2) {
        return new DBManager_Factory(aVar, aVar2);
    }

    public static DBManager newInstance(Context context, MasterDataMigrationRepository masterDataMigrationRepository) {
        return new DBManager(context, masterDataMigrationRepository);
    }

    @Override // vz.a
    public DBManager get() {
        return newInstance(this.appContextProvider.get(), this.masterDataMigrationRepositoryProvider.get());
    }
}
