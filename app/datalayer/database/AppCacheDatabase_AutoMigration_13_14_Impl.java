package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.database.AppCacheDatabase;
import i4.a;
import i4.b;
import l4.i;
/* loaded from: classes2.dex */
final class AppCacheDatabase_AutoMigration_13_14_Impl extends b {
    private final a callback;

    public AppCacheDatabase_AutoMigration_13_14_Impl() {
        super(13, 14);
        this.callback = new AppCacheDatabase.AppCacheDatabaseAutoMigration();
    }

    @Override // i4.b
    public void migrate(i iVar) {
        iVar.M("DROP TABLE `power_pin`");
        iVar.M("DROP TABLE `interstitial_table_name`");
        this.callback.onPostMigrate(iVar);
    }
}
