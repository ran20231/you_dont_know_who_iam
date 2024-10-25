package com.forsale.app.datalayer.database;

import i4.b;
import l4.i;
/* loaded from: classes2.dex */
final class AppCacheDatabase_AutoMigration_17_18_Impl extends b {
    public AppCacheDatabase_AutoMigration_17_18_Impl() {
        super(17, 18);
    }

    @Override // i4.b
    public void migrate(i iVar) {
        iVar.M("ALTER TABLE `search_history_table` ADD COLUMN `source` TEXT DEFAULT NULL");
    }
}
