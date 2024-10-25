package com.forsale.app.datalayer.database;

import i4.b;
import l4.i;
/* loaded from: classes2.dex */
final class AppCacheDatabase_AutoMigration_16_17_Impl extends b {
    public AppCacheDatabase_AutoMigration_16_17_Impl() {
        super(16, 17);
    }

    @Override // i4.b
    public void migrate(i iVar) {
        iVar.M("CREATE TABLE IF NOT EXISTS `USER_TABLE` (`id` INTEGER NOT NULL, `userId` INTEGER, `allowFollow` INTEGER, `email` TEXT, `firstName` TEXT, `freeAds` REAL, `premiumAds` REAL, `image` TEXT, `isEmailVerified` INTEGER, `numberOfFollowers` INTEGER, `numberOfFollowing` INTEGER, `phone` TEXT, `language` TEXT, `memberSince` TEXT, `regionId` INTEGER, `isFresh` INTEGER, `isBlock` INTEGER, `permissions` TEXT, PRIMARY KEY(`id`))");
    }
}
