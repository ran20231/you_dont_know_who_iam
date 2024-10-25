package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import com.forsale.app.datalayer.repositories.BottomTipDao;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityDao;
import com.forsale.app.datalayer.repositories.ListingItemBriefDao;
import com.forsale.app.datalayer.repositories.RecentFilterLocationsDao;
import com.forsale.app.datalayer.repositories.SearchHistoryDao;
import com.forsale.app.datalayer.repositories.TrendDao;
import com.forsale.app.datalayer.repositories.UserDao;
import i4.a;
import kotlin.jvm.internal.o;
import l4.i;
/* compiled from: AppCacheDatabase.kt */
/* loaded from: classes2.dex */
public abstract class AppCacheDatabase extends RoomDatabase {
    public static final int $stable = 0;

    /* compiled from: AppCacheDatabase.kt */
    /* loaded from: classes2.dex */
    public static final class AppCacheDatabaseAutoMigration implements a {
        public static final int $stable = 0;

        @Override // i4.a
        public void onPostMigrate(i db2) {
            o.i(db2, "db");
            super.onPostMigrate(db2);
            x10.a.e("Database app_cache.sqlite  migrated successfully", new Object[0]);
        }
    }

    public abstract BottomTipDao bottomTipDao();

    public abstract ListingDetailsEntityDao listingDetailsEntityDao();

    public abstract ListingItemBriefDao listingItemBriefDao();

    public abstract RecentFilterLocationsDao recentLocationsDao();

    public abstract SearchHistoryDao searchHistoryDao();

    public abstract TrendDao trendDao();

    public abstract UserDao userDao();
}
