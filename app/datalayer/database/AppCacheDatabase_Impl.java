package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import androidx.room.f;
import androidx.room.n;
import androidx.room.u;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.BottomTipDao;
import com.forsale.app.datalayer.repositories.BottomTipDao_Impl;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityDao;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl;
import com.forsale.app.datalayer.repositories.ListingItemBriefDao;
import com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl;
import com.forsale.app.datalayer.repositories.RecentFilterLocationsDao;
import com.forsale.app.datalayer.repositories.RecentFilterLocationsDao_Impl;
import com.forsale.app.datalayer.repositories.SearchHistoryDao;
import com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl;
import com.forsale.app.datalayer.repositories.TrendDao;
import com.forsale.app.datalayer.repositories.TrendDao_Impl;
import com.forsale.app.datalayer.repositories.UserDao;
import com.forsale.app.datalayer.repositories.UserDao_Impl;
import com.leanplum.internal.Constants;
import falcon.chat.entities.MessageKt;
import i4.a;
import j4.b;
import j4.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.i;
import l4.j;
/* loaded from: classes2.dex */
public final class AppCacheDatabase_Impl extends AppCacheDatabase {
    private volatile BottomTipDao _bottomTipDao;
    private volatile ListingDetailsEntityDao _listingDetailsEntityDao;
    private volatile ListingItemBriefDao _listingItemBriefDao;
    private volatile RecentFilterLocationsDao _recentFilterLocationsDao;
    private volatile SearchHistoryDao _searchHistoryDao;
    private volatile TrendDao _trendDao;
    private volatile UserDao _userDao;

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public BottomTipDao bottomTipDao() {
        BottomTipDao bottomTipDao;
        if (this._bottomTipDao != null) {
            return this._bottomTipDao;
        }
        synchronized (this) {
            if (this._bottomTipDao == null) {
                this._bottomTipDao = new BottomTipDao_Impl(this);
            }
            bottomTipDao = this._bottomTipDao;
        }
        return bottomTipDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        i k12 = super.getOpenHelper().k1();
        try {
            super.beginTransaction();
            k12.M("DELETE FROM `listing_item_brief`");
            k12.M("DELETE FROM `search_placeholder_keyword_table`");
            k12.M("DELETE FROM `search_history_table`");
            k12.M("DELETE FROM `trends`");
            k12.M("DELETE FROM `bottom_tips_table`");
            k12.M("DELETE FROM `listing_details_table`");
            k12.M("DELETE FROM `recent_locations`");
            k12.M("DELETE FROM `USER_TABLE`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            k12.o1("PRAGMA wal_checkpoint(FULL)").close();
            if (!k12.x1()) {
                k12.M("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected n createInvalidationTracker() {
        return new n(this, new HashMap(0), new HashMap(0), ListingItemBrief.LISTING_ITEM_BRIEF_TABLE, SearchPlaceholderKeywordEntity.SEARCH_PLACEHOLDER_KEYWORD_TABLE, SearchHistoryEntity.tableName, "trends", "bottom_tips_table", "listing_details_table", "recent_locations", "USER_TABLE");
    }

    @Override // androidx.room.RoomDatabase
    protected j createOpenHelper(f fVar) {
        return fVar.f14982c.a(j.b.a(fVar.f14980a).c(fVar.f14981b).b(new u(fVar, new u.b(18) { // from class: com.forsale.app.datalayer.database.AppCacheDatabase_Impl.1
            @Override // androidx.room.u.b
            public void createAllTables(i iVar) {
                iVar.M("CREATE TABLE IF NOT EXISTS `listing_item_brief` (`image` TEXT, `thumb` TEXT, `cat_id` INTEGER NOT NULL, `contact` TEXT, `date_published` TEXT, `date_sort` TEXT, `do_not_disturb` TEXT, `id` INTEGER NOT NULL, `images_count` INTEGER NOT NULL, `is_hide_my_number` INTEGER NOT NULL, `is_anon` INTEGER NOT NULL, `is_prem` INTEGER NOT NULL, `is_video_paid` INTEGER NOT NULL, `is_voip` INTEGER NOT NULL, `price` REAL NOT NULL, `reg_id` INTEGER NOT NULL, `status` TEXT, `title` TEXT, `url` TEXT, `was_promoted` INTEGER NOT NULL, `phone` TEXT, `district_name` TEXT, `district_name_localize` TEXT, `description` TEXT, `expire_soon` INTEGER, `virtual_tour_thumb` TEXT, `attrs` TEXT, `user_type` TEXT, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `search_placeholder_keyword_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ar` TEXT NOT NULL, `en` TEXT NOT NULL)");
                iVar.M("CREATE TABLE IF NOT EXISTS `search_history_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `search_text` TEXT NOT NULL, `category_id` INTEGER, `category_name` TEXT, `category` TEXT, `filters` TEXT, `source` TEXT)");
                iVar.M("CREATE TABLE IF NOT EXISTS `trends` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ar` TEXT NOT NULL, `en` TEXT NOT NULL, `is_title` INTEGER NOT NULL)");
                iVar.M("CREATE TABLE IF NOT EXISTS `bottom_tips_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tab_id` TEXT NOT NULL, `reset_count` INTEGER NOT NULL, `tab_order` INTEGER NOT NULL, `max_views_sessions` INTEGER NOT NULL, `duration_milliseconds` INTEGER NOT NULL, `count_views` INTEGER NOT NULL, `is_last_show` INTEGER NOT NULL)");
                iVar.M("CREATE TABLE IF NOT EXISTS `listing_details_table` (`adv_id` INTEGER NOT NULL, `device_id` TEXT NOT NULL, `region_id` INTEGER NOT NULL, `category_id` INTEGER, `districts_ids` TEXT, `title` TEXT, `description` TEXT, `contact_no` TEXT, `language` TEXT NOT NULL, `asking_price` REAL, `addons_requested` TEXT NOT NULL, `extra_attrs` TEXT, `is_pm_enabled` INTEGER, `is_voip_enabled` INTEGER, `is_draft` INTEGER, `is_hide_my_number` INTEGER, `is_anonymous` INTEGER, `attempt_abuse` INTEGER, `geotag_lon` REAL, `geotag_lat` REAL, `repost_auto_renew` INTEGER, `do_not_disturb` TEXT, `images` TEXT, `images_urls` TEXT NOT NULL, `video_url` TEXT, `video_network_url` TEXT, `videoThumb` TEXT, `delete_video` INTEGER, `plan_id` INTEGER, `prohibited_keywords` TEXT, `extra_info` TEXT, `source_item_id` INTEGER, `has_addons` INTEGER, `allow_edit_on_district` INTEGER, `cached_adv` INTEGER, `approved_addons` TEXT, `left_over_flag` INTEGER NOT NULL, `primaryImage` TEXT, PRIMARY KEY(`adv_id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `recent_locations` (`id` INTEGER NOT NULL, `level` INTEGER NOT NULL, `parentId` INTEGER NOT NULL, `title` TEXT NOT NULL, `arTitle` TEXT NOT NULL, `enTitle` TEXT NOT NULL, `path` TEXT NOT NULL, `enPath` TEXT NOT NULL, `arPath` TEXT NOT NULL, `insertDate` INTEGER NOT NULL, `verticalId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `USER_TABLE` (`id` INTEGER NOT NULL, `userId` INTEGER, `allowFollow` INTEGER, `email` TEXT, `firstName` TEXT, `freeAds` REAL, `premiumAds` REAL, `image` TEXT, `isEmailVerified` INTEGER, `numberOfFollowers` INTEGER, `numberOfFollowing` INTEGER, `phone` TEXT, `language` TEXT, `memberSince` TEXT, `regionId` INTEGER, `isFresh` INTEGER, `isBlock` INTEGER, `permissions` TEXT, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                iVar.M("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '32ef437e9f10a0fb7cb886d1f36210f7')");
            }

            @Override // androidx.room.u.b
            public void dropAllTables(i iVar) {
                iVar.M("DROP TABLE IF EXISTS `listing_item_brief`");
                iVar.M("DROP TABLE IF EXISTS `search_placeholder_keyword_table`");
                iVar.M("DROP TABLE IF EXISTS `search_history_table`");
                iVar.M("DROP TABLE IF EXISTS `trends`");
                iVar.M("DROP TABLE IF EXISTS `bottom_tips_table`");
                iVar.M("DROP TABLE IF EXISTS `listing_details_table`");
                iVar.M("DROP TABLE IF EXISTS `recent_locations`");
                iVar.M("DROP TABLE IF EXISTS `USER_TABLE`");
                List<RoomDatabase.b> list = ((RoomDatabase) AppCacheDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.b(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onCreate(i iVar) {
                List<RoomDatabase.b> list = ((RoomDatabase) AppCacheDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.a(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onOpen(i iVar) {
                ((RoomDatabase) AppCacheDatabase_Impl.this).mDatabase = iVar;
                AppCacheDatabase_Impl.this.internalInitInvalidationTracker(iVar);
                List<RoomDatabase.b> list = ((RoomDatabase) AppCacheDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.c(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onPreMigrate(i iVar) {
                b.b(iVar);
            }

            @Override // androidx.room.u.b
            public u.c onValidateSchema(i iVar) {
                HashMap hashMap = new HashMap(28);
                hashMap.put("image", new f.a("image", "TEXT", false, 0, null, 1));
                hashMap.put("thumb", new f.a("thumb", "TEXT", false, 0, null, 1));
                hashMap.put("cat_id", new f.a("cat_id", "INTEGER", true, 0, null, 1));
                hashMap.put("contact", new f.a("contact", "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.DATE_PUBLISHED, new f.a(ListingItemBase.DATE_PUBLISHED, "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.DATE_SORT, new f.a(ListingItemBase.DATE_SORT, "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.DO_NOT_DISTURB, new f.a(ListingItemBase.DO_NOT_DISTURB, "TEXT", false, 0, null, 1));
                hashMap.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap.put(ListingItemBase.IMAGES_COUNT, new f.a(ListingItemBase.IMAGES_COUNT, "INTEGER", true, 0, null, 1));
                hashMap.put(ListingItemBase.IS_HIDE_MY_NUMBER, new f.a(ListingItemBase.IS_HIDE_MY_NUMBER, "INTEGER", true, 0, null, 1));
                hashMap.put(ListingItemBase.IS_ANON, new f.a(ListingItemBase.IS_ANON, "INTEGER", true, 0, null, 1));
                hashMap.put(ListingItemBase.IS_PREM, new f.a(ListingItemBase.IS_PREM, "INTEGER", true, 0, null, 1));
                hashMap.put(ListingItemBase.IS_VIDEO_PAID, new f.a(ListingItemBase.IS_VIDEO_PAID, "INTEGER", true, 0, null, 1));
                hashMap.put(ListingItemBase.IS_VOIP, new f.a(ListingItemBase.IS_VOIP, "INTEGER", true, 0, null, 1));
                hashMap.put("price", new f.a("price", "REAL", true, 0, null, 1));
                hashMap.put(ListingItemBase.REG_ID, new f.a(ListingItemBase.REG_ID, "INTEGER", true, 0, null, 1));
                hashMap.put(MessageKt.STATUS, new f.a(MessageKt.STATUS, "TEXT", false, 0, null, 1));
                hashMap.put("title", new f.a("title", "TEXT", false, 0, null, 1));
                hashMap.put("url", new f.a("url", "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.WAS_PROMOTED, new f.a(ListingItemBase.WAS_PROMOTED, "INTEGER", true, 0, null, 1));
                hashMap.put("phone", new f.a("phone", "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.DISTRICT_NAME, new f.a(ListingItemBase.DISTRICT_NAME, "TEXT", false, 0, null, 1));
                hashMap.put("district_name_localize", new f.a("district_name_localize", "TEXT", false, 0, null, 1));
                hashMap.put("description", new f.a("description", "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemBase.EXPIRE_SOON, new f.a(ListingItemBase.EXPIRE_SOON, "INTEGER", false, 0, null, 1));
                hashMap.put("virtual_tour_thumb", new f.a("virtual_tour_thumb", "TEXT", false, 0, null, 1));
                hashMap.put(ListingItemDetails.ATTRIBUTES, new f.a(ListingItemDetails.ATTRIBUTES, "TEXT", false, 0, null, 1));
                hashMap.put("user_type", new f.a("user_type", "TEXT", false, 0, null, 1));
                j4.f fVar2 = new j4.f(ListingItemBrief.LISTING_ITEM_BRIEF_TABLE, hashMap, new HashSet(0), new HashSet(0));
                j4.f a11 = j4.f.a(iVar, ListingItemBrief.LISTING_ITEM_BRIEF_TABLE);
                if (!fVar2.equals(a11)) {
                    return new u.c(false, "listing_item_brief(com.forsale.app.datalayer.network.responses.ListingItemBrief).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap2.put(SearchPlaceholderKeywordEntity.AR, new f.a(SearchPlaceholderKeywordEntity.AR, "TEXT", true, 0, null, 1));
                hashMap2.put(SearchPlaceholderKeywordEntity.EN, new f.a(SearchPlaceholderKeywordEntity.EN, "TEXT", true, 0, null, 1));
                j4.f fVar3 = new j4.f(SearchPlaceholderKeywordEntity.SEARCH_PLACEHOLDER_KEYWORD_TABLE, hashMap2, new HashSet(0), new HashSet(0));
                j4.f a12 = j4.f.a(iVar, SearchPlaceholderKeywordEntity.SEARCH_PLACEHOLDER_KEYWORD_TABLE);
                if (!fVar3.equals(a12)) {
                    return new u.c(false, "search_placeholder_keyword_table(com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
                }
                HashMap hashMap3 = new HashMap(7);
                hashMap3.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("search_text", new f.a("search_text", "TEXT", true, 0, null, 1));
                hashMap3.put("category_id", new f.a("category_id", "INTEGER", false, 0, null, 1));
                hashMap3.put("category_name", new f.a("category_name", "TEXT", false, 0, null, 1));
                hashMap3.put("category", new f.a("category", "TEXT", false, 0, null, 1));
                hashMap3.put("filters", new f.a("filters", "TEXT", false, 0, null, 1));
                hashMap3.put("source", new f.a("source", "TEXT", false, 0, null, 1));
                j4.f fVar4 = new j4.f(SearchHistoryEntity.tableName, hashMap3, new HashSet(0), new HashSet(0));
                j4.f a13 = j4.f.a(iVar, SearchHistoryEntity.tableName);
                if (!fVar4.equals(a13)) {
                    return new u.c(false, "search_history_table(com.forsale.app.datalayer.database.SearchHistoryEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
                }
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap4.put(SearchPlaceholderKeywordEntity.AR, new f.a(SearchPlaceholderKeywordEntity.AR, "TEXT", true, 0, null, 1));
                hashMap4.put(SearchPlaceholderKeywordEntity.EN, new f.a(SearchPlaceholderKeywordEntity.EN, "TEXT", true, 0, null, 1));
                hashMap4.put("is_title", new f.a("is_title", "INTEGER", true, 0, null, 1));
                j4.f fVar5 = new j4.f("trends", hashMap4, new HashSet(0), new HashSet(0));
                j4.f a14 = j4.f.a(iVar, "trends");
                if (!fVar5.equals(a14)) {
                    return new u.c(false, "trends(com.forsale.app.datalayer.database.TrendEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
                }
                HashMap hashMap5 = new HashMap(8);
                hashMap5.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap5.put(MasterDataBottomTooltipSettings.TAB_ID, new f.a(MasterDataBottomTooltipSettings.TAB_ID, "TEXT", true, 0, null, 1));
                hashMap5.put(MasterDataBottomTooltipSettings.RESET_COUNT, new f.a(MasterDataBottomTooltipSettings.RESET_COUNT, "INTEGER", true, 0, null, 1));
                hashMap5.put("tab_order", new f.a("tab_order", "INTEGER", true, 0, null, 1));
                hashMap5.put("max_views_sessions", new f.a("max_views_sessions", "INTEGER", true, 0, null, 1));
                hashMap5.put("duration_milliseconds", new f.a("duration_milliseconds", "INTEGER", true, 0, null, 1));
                hashMap5.put("count_views", new f.a("count_views", "INTEGER", true, 0, null, 1));
                hashMap5.put("is_last_show", new f.a("is_last_show", "INTEGER", true, 0, null, 1));
                j4.f fVar6 = new j4.f("bottom_tips_table", hashMap5, new HashSet(0), new HashSet(0));
                j4.f a15 = j4.f.a(iVar, "bottom_tips_table");
                if (!fVar6.equals(a15)) {
                    return new u.c(false, "bottom_tips_table(com.forsale.app.datalayer.database.BottomTipEntity).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
                }
                HashMap hashMap6 = new HashMap(38);
                hashMap6.put(GetListingsBaseBody.ADV_ID, new f.a(GetListingsBaseBody.ADV_ID, "INTEGER", true, 1, null, 1));
                hashMap6.put(GetListingsBaseBody.DEVICE_ID, new f.a(GetListingsBaseBody.DEVICE_ID, "TEXT", true, 0, null, 1));
                hashMap6.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
                hashMap6.put("category_id", new f.a("category_id", "INTEGER", false, 0, null, 1));
                hashMap6.put("districts_ids", new f.a("districts_ids", "TEXT", false, 0, null, 1));
                hashMap6.put("title", new f.a("title", "TEXT", false, 0, null, 1));
                hashMap6.put("description", new f.a("description", "TEXT", false, 0, null, 1));
                hashMap6.put("contact_no", new f.a("contact_no", "TEXT", false, 0, null, 1));
                hashMap6.put("language", new f.a("language", "TEXT", true, 0, null, 1));
                hashMap6.put("asking_price", new f.a("asking_price", "REAL", false, 0, null, 1));
                hashMap6.put("addons_requested", new f.a("addons_requested", "TEXT", true, 0, null, 1));
                hashMap6.put(AdvancedSearchBody.EXTRA_ATTRIBUTES, new f.a(AdvancedSearchBody.EXTRA_ATTRIBUTES, "TEXT", false, 0, null, 1));
                hashMap6.put(MasterDataModel.IS_PM_ENABLED, new f.a(MasterDataModel.IS_PM_ENABLED, "INTEGER", false, 0, null, 1));
                hashMap6.put("is_voip_enabled", new f.a("is_voip_enabled", "INTEGER", false, 0, null, 1));
                hashMap6.put("is_draft", new f.a("is_draft", "INTEGER", false, 0, null, 1));
                hashMap6.put(ListingItemBase.IS_HIDE_MY_NUMBER, new f.a(ListingItemBase.IS_HIDE_MY_NUMBER, "INTEGER", false, 0, null, 1));
                hashMap6.put("is_anonymous", new f.a("is_anonymous", "INTEGER", false, 0, null, 1));
                hashMap6.put("attempt_abuse", new f.a("attempt_abuse", "INTEGER", false, 0, null, 1));
                hashMap6.put("geotag_lon", new f.a("geotag_lon", "REAL", false, 0, null, 1));
                hashMap6.put("geotag_lat", new f.a("geotag_lat", "REAL", false, 0, null, 1));
                hashMap6.put("repost_auto_renew", new f.a("repost_auto_renew", "INTEGER", false, 0, null, 1));
                hashMap6.put(ListingItemBase.DO_NOT_DISTURB, new f.a(ListingItemBase.DO_NOT_DISTURB, "TEXT", false, 0, null, 1));
                hashMap6.put("images", new f.a("images", "TEXT", false, 0, null, 1));
                hashMap6.put("images_urls", new f.a("images_urls", "TEXT", true, 0, null, 1));
                hashMap6.put(ListingItemDetails.VIDEO_URL, new f.a(ListingItemDetails.VIDEO_URL, "TEXT", false, 0, null, 1));
                hashMap6.put("video_network_url", new f.a("video_network_url", "TEXT", false, 0, null, 1));
                hashMap6.put("videoThumb", new f.a("videoThumb", "TEXT", false, 0, null, 1));
                hashMap6.put("delete_video", new f.a("delete_video", "INTEGER", false, 0, null, 1));
                hashMap6.put("plan_id", new f.a("plan_id", "INTEGER", false, 0, null, 1));
                hashMap6.put(ProhibitedKeywordEntity.PROHIBITED_KEYWORDS, new f.a(ProhibitedKeywordEntity.PROHIBITED_KEYWORDS, "TEXT", false, 0, null, 1));
                hashMap6.put(ListingItemDetails.EXTRA_INFO, new f.a(ListingItemDetails.EXTRA_INFO, "TEXT", false, 0, null, 1));
                hashMap6.put("source_item_id", new f.a("source_item_id", "INTEGER", false, 0, null, 1));
                hashMap6.put("has_addons", new f.a("has_addons", "INTEGER", false, 0, null, 1));
                hashMap6.put("allow_edit_on_district", new f.a("allow_edit_on_district", "INTEGER", false, 0, null, 1));
                hashMap6.put("cached_adv", new f.a("cached_adv", "INTEGER", false, 0, null, 1));
                hashMap6.put("approved_addons", new f.a("approved_addons", "TEXT", false, 0, null, 1));
                hashMap6.put("left_over_flag", new f.a("left_over_flag", "INTEGER", true, 0, null, 1));
                hashMap6.put("primaryImage", new f.a("primaryImage", "TEXT", false, 0, null, 1));
                j4.f fVar7 = new j4.f("listing_details_table", hashMap6, new HashSet(0), new HashSet(0));
                j4.f a16 = j4.f.a(iVar, "listing_details_table");
                if (!fVar7.equals(a16)) {
                    return new u.c(false, "listing_details_table(com.forsale.app.datalayer.network.entities.ListingDetailsEntity).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
                }
                HashMap hashMap7 = new HashMap(11);
                hashMap7.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap7.put(DistrictEntity.LEVEL, new f.a(DistrictEntity.LEVEL, "INTEGER", true, 0, null, 1));
                hashMap7.put("parentId", new f.a("parentId", "INTEGER", true, 0, null, 1));
                hashMap7.put("title", new f.a("title", "TEXT", true, 0, null, 1));
                hashMap7.put("arTitle", new f.a("arTitle", "TEXT", true, 0, null, 1));
                hashMap7.put("enTitle", new f.a("enTitle", "TEXT", true, 0, null, 1));
                hashMap7.put("path", new f.a("path", "TEXT", true, 0, null, 1));
                hashMap7.put("enPath", new f.a("enPath", "TEXT", true, 0, null, 1));
                hashMap7.put("arPath", new f.a("arPath", "TEXT", true, 0, null, 1));
                hashMap7.put("insertDate", new f.a("insertDate", "INTEGER", true, 0, null, 1));
                hashMap7.put("verticalId", new f.a("verticalId", "INTEGER", true, 0, null, 1));
                j4.f fVar8 = new j4.f("recent_locations", hashMap7, new HashSet(0), new HashSet(0));
                j4.f a17 = j4.f.a(iVar, "recent_locations");
                if (!fVar8.equals(a17)) {
                    return new u.c(false, "recent_locations(com.forsale.app.datalayer.database.RecentLocationsEntity).\n Expected:\n" + fVar8 + "\n Found:\n" + a17);
                }
                HashMap hashMap8 = new HashMap(18);
                hashMap8.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap8.put(Constants.Params.USER_ID, new f.a(Constants.Params.USER_ID, "INTEGER", false, 0, null, 1));
                hashMap8.put("allowFollow", new f.a("allowFollow", "INTEGER", false, 0, null, 1));
                hashMap8.put("email", new f.a("email", "TEXT", false, 0, null, 1));
                hashMap8.put("firstName", new f.a("firstName", "TEXT", false, 0, null, 1));
                hashMap8.put("freeAds", new f.a("freeAds", "REAL", false, 0, null, 1));
                hashMap8.put("premiumAds", new f.a("premiumAds", "REAL", false, 0, null, 1));
                hashMap8.put("image", new f.a("image", "TEXT", false, 0, null, 1));
                hashMap8.put("isEmailVerified", new f.a("isEmailVerified", "INTEGER", false, 0, null, 1));
                hashMap8.put("numberOfFollowers", new f.a("numberOfFollowers", "INTEGER", false, 0, null, 1));
                hashMap8.put("numberOfFollowing", new f.a("numberOfFollowing", "INTEGER", false, 0, null, 1));
                hashMap8.put("phone", new f.a("phone", "TEXT", false, 0, null, 1));
                hashMap8.put("language", new f.a("language", "TEXT", false, 0, null, 1));
                hashMap8.put("memberSince", new f.a("memberSince", "TEXT", false, 0, null, 1));
                hashMap8.put("regionId", new f.a("regionId", "INTEGER", false, 0, null, 1));
                hashMap8.put("isFresh", new f.a("isFresh", "INTEGER", false, 0, null, 1));
                hashMap8.put("isBlock", new f.a("isBlock", "INTEGER", false, 0, null, 1));
                hashMap8.put("permissions", new f.a("permissions", "TEXT", false, 0, null, 1));
                j4.f fVar9 = new j4.f("USER_TABLE", hashMap8, new HashSet(0), new HashSet(0));
                j4.f a18 = j4.f.a(iVar, "USER_TABLE");
                if (!fVar9.equals(a18)) {
                    return new u.c(false, "USER_TABLE(com.forsale.app.datalayer.database.UserEntity).\n Expected:\n" + fVar9 + "\n Found:\n" + a18);
                }
                return new u.c(true, null);
            }

            @Override // androidx.room.u.b
            public void onPostMigrate(i iVar) {
            }
        }, "32ef437e9f10a0fb7cb886d1f36210f7", "7baa794d8a1f08b3550c45cae7ffb925")).a());
    }

    @Override // androidx.room.RoomDatabase
    public List<i4.b> getAutoMigrations(Map<Class<? extends a>, a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppCacheDatabase_AutoMigration_11_12_Impl());
        arrayList.add(new AppCacheDatabase_AutoMigration_13_14_Impl());
        arrayList.add(new AppCacheDatabase_AutoMigration_14_15_Impl());
        arrayList.add(new AppCacheDatabase_AutoMigration_16_17_Impl());
        arrayList.add(new AppCacheDatabase_AutoMigration_17_18_Impl());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ListingItemBriefDao.class, ListingItemBriefDao_Impl.getRequiredConverters());
        hashMap.put(SearchHistoryDao.class, SearchHistoryDao_Impl.getRequiredConverters());
        hashMap.put(TrendDao.class, TrendDao_Impl.getRequiredConverters());
        hashMap.put(BottomTipDao.class, BottomTipDao_Impl.getRequiredConverters());
        hashMap.put(ListingDetailsEntityDao.class, ListingDetailsEntityDao_Impl.getRequiredConverters());
        hashMap.put(RecentFilterLocationsDao.class, RecentFilterLocationsDao_Impl.getRequiredConverters());
        hashMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public ListingDetailsEntityDao listingDetailsEntityDao() {
        ListingDetailsEntityDao listingDetailsEntityDao;
        if (this._listingDetailsEntityDao != null) {
            return this._listingDetailsEntityDao;
        }
        synchronized (this) {
            if (this._listingDetailsEntityDao == null) {
                this._listingDetailsEntityDao = new ListingDetailsEntityDao_Impl(this);
            }
            listingDetailsEntityDao = this._listingDetailsEntityDao;
        }
        return listingDetailsEntityDao;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public ListingItemBriefDao listingItemBriefDao() {
        ListingItemBriefDao listingItemBriefDao;
        if (this._listingItemBriefDao != null) {
            return this._listingItemBriefDao;
        }
        synchronized (this) {
            if (this._listingItemBriefDao == null) {
                this._listingItemBriefDao = new ListingItemBriefDao_Impl(this);
            }
            listingItemBriefDao = this._listingItemBriefDao;
        }
        return listingItemBriefDao;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public RecentFilterLocationsDao recentLocationsDao() {
        RecentFilterLocationsDao recentFilterLocationsDao;
        if (this._recentFilterLocationsDao != null) {
            return this._recentFilterLocationsDao;
        }
        synchronized (this) {
            if (this._recentFilterLocationsDao == null) {
                this._recentFilterLocationsDao = new RecentFilterLocationsDao_Impl(this);
            }
            recentFilterLocationsDao = this._recentFilterLocationsDao;
        }
        return recentFilterLocationsDao;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public SearchHistoryDao searchHistoryDao() {
        SearchHistoryDao searchHistoryDao;
        if (this._searchHistoryDao != null) {
            return this._searchHistoryDao;
        }
        synchronized (this) {
            if (this._searchHistoryDao == null) {
                this._searchHistoryDao = new SearchHistoryDao_Impl(this);
            }
            searchHistoryDao = this._searchHistoryDao;
        }
        return searchHistoryDao;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public TrendDao trendDao() {
        TrendDao trendDao;
        if (this._trendDao != null) {
            return this._trendDao;
        }
        synchronized (this) {
            if (this._trendDao == null) {
                this._trendDao = new TrendDao_Impl(this);
            }
            trendDao = this._trendDao;
        }
        return trendDao;
    }

    @Override // com.forsale.app.datalayer.database.AppCacheDatabase
    public UserDao userDao() {
        UserDao userDao;
        if (this._userDao != null) {
            return this._userDao;
        }
        synchronized (this) {
            if (this._userDao == null) {
                this._userDao = new UserDao_Impl(this);
            }
            userDao = this._userDao;
        }
        return userDao;
    }
}
