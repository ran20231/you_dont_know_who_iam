package com.forsale.app.datalayer.database;

import i4.b;
import l4.i;
/* loaded from: classes2.dex */
final class AppCacheDatabase_AutoMigration_14_15_Impl extends b {
    public AppCacheDatabase_AutoMigration_14_15_Impl() {
        super(14, 15);
    }

    @Override // i4.b
    public void migrate(i iVar) {
        iVar.M("ALTER TABLE `search_history_table` ADD COLUMN `category_id` INTEGER DEFAULT NULL");
        iVar.M("ALTER TABLE `search_history_table` ADD COLUMN `category_name` TEXT DEFAULT NULL");
        iVar.M("CREATE TABLE IF NOT EXISTS `recent_locations` (`id` INTEGER NOT NULL, `level` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, `title` TEXT NOT NULL, `arTitle` TEXT NOT NULL, `enTitle` TEXT NOT NULL, `path` TEXT NOT NULL, `enPath` TEXT NOT NULL, `arPath` TEXT NOT NULL, `insertDate` INTEGER NOT NULL, `verticalId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
