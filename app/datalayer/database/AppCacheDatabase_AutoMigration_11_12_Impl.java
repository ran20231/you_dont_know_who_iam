package com.forsale.app.datalayer.database;

import i4.b;
import l4.i;
/* loaded from: classes2.dex */
final class AppCacheDatabase_AutoMigration_11_12_Impl extends b {
    public AppCacheDatabase_AutoMigration_11_12_Impl() {
        super(11, 12);
    }

    @Override // i4.b
    public void migrate(i iVar) {
        iVar.M("ALTER TABLE `listing_item_brief` ADD COLUMN `district_name_localize` TEXT DEFAULT NULL");
        iVar.M("ALTER TABLE `listing_item_brief` ADD COLUMN `attrs` TEXT DEFAULT NULL");
    }
}
