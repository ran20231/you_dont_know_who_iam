package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import androidx.room.f;
import androidx.room.n;
import androidx.room.u;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl;
import com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao;
import com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao_Impl;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.repositories.AgentDao;
import com.forsale.app.datalayer.repositories.AgentDao_Impl;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.CategoryDao_Impl;
import com.forsale.app.datalayer.repositories.CategoryDistrictDao;
import com.forsale.app.datalayer.repositories.CategoryDistrictDao_Impl;
import com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao;
import com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao_Impl;
import com.forsale.app.datalayer.repositories.DirectoryCategoryDao;
import com.forsale.app.datalayer.repositories.DirectoryCategoryDao_Impl;
import com.forsale.app.datalayer.repositories.DistrictDao;
import com.forsale.app.datalayer.repositories.DistrictDao_Impl;
import com.forsale.app.datalayer.repositories.ExtraAttributeDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeDao_Impl;
import com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao_Impl;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao_Impl;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawDao_Impl;
import com.forsale.app.datalayer.repositories.LocationDao;
import com.forsale.app.datalayer.repositories.LocationDao_Impl;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordDao;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordDao_Impl;
import com.forsale.app.datalayer.repositories.RegionDao;
import com.forsale.app.datalayer.repositories.RegionDao_Impl;
import com.leanplum.core.BuildConfig;
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
public final class MasterDataDatabase_Impl extends MasterDataDatabase {
    private volatile AgentDao _agentDao;
    private volatile AgentLocationDao _agentLocationDao;
    private volatile CategoryDao _categoryDao;
    private volatile CategoryDistrictDao _categoryDistrictDao;
    private volatile CategoryExtraAttributeDao _categoryExtraAttributeDao;
    private volatile CategoryWithSubCategoriesDao _categoryWithSubCategoriesDao;
    private volatile DirectoryCategoryDao _directoryCategoryDao;
    private volatile DistrictDao _districtDao;
    private volatile ExtraAttributeDao _extraAttributeDao;
    private volatile ExtraAttributeGroupDao _extraAttributeGroupDao;
    private volatile ExtraAttributeOptionDao _extraAttributeOptionDao;
    private volatile ExtraAttributeRawDao _extraAttributeRawDao;
    private volatile LocationDao _locationDao;
    private volatile ProhibitedKeywordDao _prohibitedKeywordDao;
    private volatile RegionDao _regionDao;

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public AgentDao agentDao() {
        AgentDao agentDao;
        if (this._agentDao != null) {
            return this._agentDao;
        }
        synchronized (this) {
            if (this._agentDao == null) {
                this._agentDao = new AgentDao_Impl(this);
            }
            agentDao = this._agentDao;
        }
        return agentDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public AgentLocationDao agentLocationDao() {
        AgentLocationDao agentLocationDao;
        if (this._agentLocationDao != null) {
            return this._agentLocationDao;
        }
        synchronized (this) {
            if (this._agentLocationDao == null) {
                this._agentLocationDao = new AgentLocationDao_Impl(this);
            }
            agentLocationDao = this._agentLocationDao;
        }
        return agentLocationDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public CategoryDao categoryDao() {
        CategoryDao categoryDao;
        if (this._categoryDao != null) {
            return this._categoryDao;
        }
        synchronized (this) {
            if (this._categoryDao == null) {
                this._categoryDao = new CategoryDao_Impl(this);
            }
            categoryDao = this._categoryDao;
        }
        return categoryDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public CategoryDistrictDao categoryDistrictDao() {
        CategoryDistrictDao categoryDistrictDao;
        if (this._categoryDistrictDao != null) {
            return this._categoryDistrictDao;
        }
        synchronized (this) {
            if (this._categoryDistrictDao == null) {
                this._categoryDistrictDao = new CategoryDistrictDao_Impl(this);
            }
            categoryDistrictDao = this._categoryDistrictDao;
        }
        return categoryDistrictDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public CategoryExtraAttributeDao categoryExtraAttributeDao() {
        CategoryExtraAttributeDao categoryExtraAttributeDao;
        if (this._categoryExtraAttributeDao != null) {
            return this._categoryExtraAttributeDao;
        }
        synchronized (this) {
            if (this._categoryExtraAttributeDao == null) {
                this._categoryExtraAttributeDao = new CategoryExtraAttributeDao_Impl(this);
            }
            categoryExtraAttributeDao = this._categoryExtraAttributeDao;
        }
        return categoryExtraAttributeDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public CategoryWithSubCategoriesDao categoryWithSubCategoriesDao() {
        CategoryWithSubCategoriesDao categoryWithSubCategoriesDao;
        if (this._categoryWithSubCategoriesDao != null) {
            return this._categoryWithSubCategoriesDao;
        }
        synchronized (this) {
            if (this._categoryWithSubCategoriesDao == null) {
                this._categoryWithSubCategoriesDao = new CategoryWithSubCategoriesDao_Impl(this);
            }
            categoryWithSubCategoriesDao = this._categoryWithSubCategoriesDao;
        }
        return categoryWithSubCategoriesDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        i k12 = super.getOpenHelper().k1();
        try {
            super.beginTransaction();
            k12.M("DELETE FROM `categories`");
            k12.M("DELETE FROM `extra_attributes`");
            k12.M("DELETE FROM `extra_attribute_options`");
            k12.M("DELETE FROM `extra_attribute_groups`");
            k12.M("DELETE FROM `categories_extra_attributes`");
            k12.M("DELETE FROM `agents`");
            k12.M("DELETE FROM `locations`");
            k12.M("DELETE FROM `agents_locations`");
            k12.M("DELETE FROM `regions`");
            k12.M("DELETE FROM `districts`");
            k12.M("DELETE FROM `prohibited_keywords`");
            k12.M("DELETE FROM `directory_categories`");
            k12.M("DELETE FROM `categories_districts`");
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
        return new n(this, new HashMap(0), new HashMap(0), CategoryEntity.CATEGORIES_TABLE, ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE, ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE, ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE, CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES, AgentEntity.AGENTS_TABLE, LocationEntity.LOCATIONS_TABLE, AgentLocationEntity.AGENTS_LOCATIONS_TABLE, "regions", "districts", ProhibitedKeywordEntity.PROHIBITED_KEYWORDS, DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE, CategoryDistrict.CATEGORY_DISTRICT_TABLE);
    }

    @Override // androidx.room.RoomDatabase
    protected j createOpenHelper(f fVar) {
        return fVar.f14982c.a(j.b.a(fVar.f14980a).c(fVar.f14981b).b(new u(fVar, new u.b(17) { // from class: com.forsale.app.datalayer.database.MasterDataDatabase_Impl.1
            @Override // androidx.room.u.b
            public void createAllTables(i iVar) {
                iVar.M("CREATE TABLE IF NOT EXISTS `categories` (`id` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `system_name` TEXT NOT NULL, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `image` TEXT NOT NULL, `parent_id` INTEGER NOT NULL DEFAULT 0, `display_order` INTEGER NOT NULL DEFAULT 0, `allow_uploading` INTEGER NOT NULL DEFAULT 1, `is_filterable` INTEGER NOT NULL DEFAULT 0, `steps` INTEGER NOT NULL DEFAULT 100, `promote_animation` TEXT DEFAULT null, `is_alternate_view` INTEGER DEFAULT null, `allow_search` INTEGER DEFAULT 0, `attribute_values` TEXT DEFAULT null, `is_expendable` INTEGER DEFAULT 0, `allow_district_filtering` INTEGER NOT NULL DEFAULT 0, `has_plans` INTEGER NOT NULL DEFAULT 0, `filterable_label_en` TEXT DEFAULT null, `filterable_label_ar` TEXT DEFAULT null, `ruleset` TEXT DEFAULT null, `classification` TEXT DEFAULT null, `allow_power_pin_view` INTEGER NOT NULL DEFAULT 1, `allow_power_pin_add` INTEGER NOT NULL DEFAULT 1, `full_path` TEXT NOT NULL, `category_type` TEXT NOT NULL, `filtering_classification_ar` TEXT DEFAULT null, `filtering_classification_en` TEXT DEFAULT null, `is_indexed` INTEGER DEFAULT 0, `vertical_image` TEXT DEFAULT null, `max_home_top_banners` INTEGER NOT NULL DEFAULT 0, `relatives` TEXT DEFAULT null, `featured_image` TEXT NOT NULL, `is_alt_cat` INTEGER NOT NULL DEFAULT 0, `filtration_settings` TEXT DEFAULT null, `sections` TEXT DEFAULT null, `slug` TEXT DEFAULT null, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `extra_attributes` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `name_en` TEXT NOT NULL, `system_name` TEXT NOT NULL, `is_required` INTEGER DEFAULT null, `display_order` INTEGER DEFAULT null, `min` INTEGER NOT NULL, `max` INTEGER NOT NULL, `validate_min` INTEGER NOT NULL, `validate_max` INTEGER NOT NULL, `slider_steps` INTEGER DEFAULT null, `is_int` INTEGER NOT NULL, `image` TEXT NOT NULL, `extra_attribute_group_id` INTEGER DEFAULT null, `sub_type` TEXT DEFAULT null, `scope` TEXT NOT NULL, `unit` TEXT, `selection_type` TEXT NOT NULL DEFAULT 'single', `exposed_type` TEXT NOT NULL DEFAULT 'none', `view_type` TEXT NOT NULL DEFAULT 'horizontal', `is_filterable` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `extra_attribute_options` (`id` INTEGER NOT NULL, `attribute_id` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `extra_attribute_groups` (`id` INTEGER NOT NULL, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `display_order` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `categories_extra_attributes` (`id` INTEGER NOT NULL, `cat_id` INTEGER NOT NULL, `attribute_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `agents` (`id` INTEGER NOT NULL, `name_ar` TEXT NOT NULL, `name_en` TEXT NOT NULL, `description_ar` TEXT NOT NULL, `description_en` TEXT NOT NULL, `phone` TEXT NOT NULL, `image` TEXT NOT NULL, `email` TEXT NOT NULL, `region_id` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, `is_indexed` INTEGER DEFAULT null, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `locations` (`id` INTEGER NOT NULL, `name_ar` TEXT NOT NULL, `name_en` TEXT NOT NULL, `region_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `agents_locations` (`id` INTEGER NOT NULL, `agent_id` INTEGER NOT NULL, `location_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `regions` (`id` INTEGER NOT NULL, `main_district_id` INTEGER, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `region_code_en` TEXT NOT NULL, `region_code_ar` TEXT NOT NULL, `phone_prefix` TEXT NOT NULL, `utc_diff` TEXT NOT NULL, `allow_messaging` INTEGER NOT NULL DEFAULT 1, `allow_guest_messaging` INTEGER NOT NULL DEFAULT 1, `contact_data` TEXT NOT NULL, `contact_email` TEXT DEFAULT null, `profile_not_complete_message_en` TEXT DEFAULT null, `email_not_verified_message_en` TEXT DEFAULT null, `profile_not_complete_message_ar` TEXT DEFAULT null, `email_not_verified_message_ar` TEXT DEFAULT null, `support_message_en` TEXT DEFAULT null, `support_message_ar` TEXT DEFAULT null, `address_en` TEXT DEFAULT null, `address_ar` TEXT DEFAULT null, `min_points_for_redemption` REAL NOT NULL DEFAULT 0, `amount_per_redemption` REAL NOT NULL DEFAULT 0.000, `points_per_paid_amount` REAL NOT NULL DEFAULT 0, `point_levels` TEXT DEFAULT null, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `districts` (`id` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `display_order` INTEGER NOT NULL DEFAULT 0, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `image` TEXT DEFAULT null, `image_en` TEXT DEFAULT null, `image_ar` TEXT DEFAULT null, `parent_id` INTEGER NOT NULL, `level` INTEGER NOT NULL, `children` TEXT DEFAULT null, `parents` TEXT DEFAULT null, `geo_lat` REAL DEFAULT null, `geo_lon` REAL DEFAULT null, `full_path_ar` TEXT DEFAULT null, `full_path_en` TEXT DEFAULT null, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `prohibited_keywords` (`id` INTEGER NOT NULL, `keyword` TEXT NOT NULL, `is_active` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `directory_categories` (`id` INTEGER NOT NULL, `name_ar` TEXT NOT NULL, `name_en` TEXT NOT NULL, `parent_id` INTEGER NOT NULL DEFAULT 0, `image` TEXT DEFAULT null, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `categories_districts` (`id` INTEGER NOT NULL, `cat_id` INTEGER NOT NULL, `district_id` INTEGER NOT NULL, `price` REAL NOT NULL DEFAULT 1.0, `pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 3, `user_type_pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 2, `max_price` INTEGER NOT NULL DEFAULT 100000, `commercial_pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 3, `allow_upload_on_free` INTEGER NOT NULL DEFAULT 1, `listings_count` INTEGER NOT NULL DEFAULT 0, `is_active` INTEGER DEFAULT 1, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                iVar.M("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9fd70adc1f06bda434e41e97db2e0937')");
            }

            @Override // androidx.room.u.b
            public void dropAllTables(i iVar) {
                iVar.M("DROP TABLE IF EXISTS `categories`");
                iVar.M("DROP TABLE IF EXISTS `extra_attributes`");
                iVar.M("DROP TABLE IF EXISTS `extra_attribute_options`");
                iVar.M("DROP TABLE IF EXISTS `extra_attribute_groups`");
                iVar.M("DROP TABLE IF EXISTS `categories_extra_attributes`");
                iVar.M("DROP TABLE IF EXISTS `agents`");
                iVar.M("DROP TABLE IF EXISTS `locations`");
                iVar.M("DROP TABLE IF EXISTS `agents_locations`");
                iVar.M("DROP TABLE IF EXISTS `regions`");
                iVar.M("DROP TABLE IF EXISTS `districts`");
                iVar.M("DROP TABLE IF EXISTS `prohibited_keywords`");
                iVar.M("DROP TABLE IF EXISTS `directory_categories`");
                iVar.M("DROP TABLE IF EXISTS `categories_districts`");
                List<RoomDatabase.b> list = ((RoomDatabase) MasterDataDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.b(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onCreate(i iVar) {
                List<RoomDatabase.b> list = ((RoomDatabase) MasterDataDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.a(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onOpen(i iVar) {
                ((RoomDatabase) MasterDataDatabase_Impl.this).mDatabase = iVar;
                MasterDataDatabase_Impl.this.internalInitInvalidationTracker(iVar);
                List<RoomDatabase.b> list = ((RoomDatabase) MasterDataDatabase_Impl.this).mCallbacks;
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
                HashMap hashMap = new HashMap(37);
                hashMap.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
                hashMap.put("system_name", new f.a("system_name", "TEXT", true, 0, null, 1));
                hashMap.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap.put("image", new f.a("image", "TEXT", true, 0, null, 1));
                hashMap.put("parent_id", new f.a("parent_id", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put("display_order", new f.a("display_order", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.ALLOW_UPLOADING, new f.a(CategoryEntity.ALLOW_UPLOADING, "INTEGER", true, 0, "1", 1));
                hashMap.put(CategoryEntity.IS_FILTERABLE, new f.a(CategoryEntity.IS_FILTERABLE, "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.STEPS, new f.a(CategoryEntity.STEPS, "INTEGER", true, 0, "100", 1));
                hashMap.put("promote_animation", new f.a("promote_animation", "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.IS_ALTERNATE_VIEW, new f.a(CategoryEntity.IS_ALTERNATE_VIEW, "INTEGER", false, 0, "null", 1));
                hashMap.put(CategoryEntity.ALLOW_SEARCH, new f.a(CategoryEntity.ALLOW_SEARCH, "INTEGER", false, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.ATTRIBUTE_VALUES, new f.a(CategoryEntity.ATTRIBUTE_VALUES, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.IS_EXPENDABLE, new f.a(CategoryEntity.IS_EXPENDABLE, "INTEGER", false, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.ALLOW_DISTRICT_FILTERING, new f.a(CategoryEntity.ALLOW_DISTRICT_FILTERING, "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.HAS_PLANS, new f.a(CategoryEntity.HAS_PLANS, "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.FILTERABLE_LABEL_EN, new f.a(CategoryEntity.FILTERABLE_LABEL_EN, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.FILTERABLE_LABEL_AR, new f.a(CategoryEntity.FILTERABLE_LABEL_AR, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.RULE_SET, new f.a(CategoryEntity.RULE_SET, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.CLASSIFICATION, new f.a(CategoryEntity.CLASSIFICATION, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.ALLOW_POWER_PIN_VIEW, new f.a(CategoryEntity.ALLOW_POWER_PIN_VIEW, "INTEGER", true, 0, "1", 1));
                hashMap.put(CategoryEntity.ALLOW_POWER_PIN_ADD, new f.a(CategoryEntity.ALLOW_POWER_PIN_ADD, "INTEGER", true, 0, "1", 1));
                hashMap.put(CategoryEntity.FULL_PATH, new f.a(CategoryEntity.FULL_PATH, "TEXT", true, 0, null, 1));
                hashMap.put("category_type", new f.a("category_type", "TEXT", true, 0, null, 1));
                hashMap.put("filtering_classification_ar", new f.a("filtering_classification_ar", "TEXT", false, 0, "null", 1));
                hashMap.put("filtering_classification_en", new f.a("filtering_classification_en", "TEXT", false, 0, "null", 1));
                hashMap.put("is_indexed", new f.a("is_indexed", "INTEGER", false, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.VERTICAL_IMAGE, new f.a(CategoryEntity.VERTICAL_IMAGE, "TEXT", false, 0, "null", 1));
                hashMap.put("max_home_top_banners", new f.a("max_home_top_banners", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put("relatives", new f.a("relatives", "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.FEATURED_IMAGE, new f.a(CategoryEntity.FEATURED_IMAGE, "TEXT", true, 0, null, 1));
                hashMap.put("is_alt_cat", new f.a("is_alt_cat", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap.put(CategoryEntity.FILTRATION_SETTINGS, new f.a(CategoryEntity.FILTRATION_SETTINGS, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.SECTIONS, new f.a(CategoryEntity.SECTIONS, "TEXT", false, 0, "null", 1));
                hashMap.put(CategoryEntity.SLUG, new f.a(CategoryEntity.SLUG, "TEXT", false, 0, "null", 1));
                j4.f fVar2 = new j4.f(CategoryEntity.CATEGORIES_TABLE, hashMap, new HashSet(0), new HashSet(0));
                j4.f a11 = j4.f.a(iVar, CategoryEntity.CATEGORIES_TABLE);
                if (!fVar2.equals(a11)) {
                    return new u.c(false, "categories(com.forsale.app.datalayer.database.CategoryEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap2 = new HashMap(22);
                hashMap2.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("type", new f.a("type", "TEXT", true, 0, null, 1));
                hashMap2.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap2.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap2.put("system_name", new f.a("system_name", "TEXT", true, 0, null, 1));
                hashMap2.put("is_required", new f.a("is_required", "INTEGER", false, 0, "null", 1));
                hashMap2.put("display_order", new f.a("display_order", "INTEGER", false, 0, "null", 1));
                hashMap2.put("min", new f.a("min", "INTEGER", true, 0, null, 1));
                hashMap2.put("max", new f.a("max", "INTEGER", true, 0, null, 1));
                hashMap2.put("validate_min", new f.a("validate_min", "INTEGER", true, 0, null, 1));
                hashMap2.put("validate_max", new f.a("validate_max", "INTEGER", true, 0, null, 1));
                hashMap2.put("slider_steps", new f.a("slider_steps", "INTEGER", false, 0, "null", 1));
                hashMap2.put("is_int", new f.a("is_int", "INTEGER", true, 0, null, 1));
                hashMap2.put("image", new f.a("image", "TEXT", true, 0, null, 1));
                hashMap2.put("extra_attribute_group_id", new f.a("extra_attribute_group_id", "INTEGER", false, 0, "null", 1));
                hashMap2.put("sub_type", new f.a("sub_type", "TEXT", false, 0, "null", 1));
                hashMap2.put("scope", new f.a("scope", "TEXT", true, 0, null, 1));
                hashMap2.put("unit", new f.a("unit", "TEXT", false, 0, null, 1));
                hashMap2.put("selection_type", new f.a("selection_type", "TEXT", true, 0, "'single'", 1));
                hashMap2.put("exposed_type", new f.a("exposed_type", "TEXT", true, 0, "'none'", 1));
                hashMap2.put("view_type", new f.a("view_type", "TEXT", true, 0, "'horizontal'", 1));
                hashMap2.put(CategoryEntity.IS_FILTERABLE, new f.a(CategoryEntity.IS_FILTERABLE, "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                j4.f fVar3 = new j4.f(ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE, hashMap2, new HashSet(0), new HashSet(0));
                j4.f a12 = j4.f.a(iVar, ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE);
                if (!fVar3.equals(a12)) {
                    return new u.c(false, "extra_attributes(com.forsale.app.datalayer.database.ExtraAttributeEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
                }
                HashMap hashMap3 = new HashMap(5);
                hashMap3.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("attribute_id", new f.a("attribute_id", "INTEGER", true, 0, null, 1));
                hashMap3.put("display_order", new f.a("display_order", "INTEGER", true, 0, null, 1));
                hashMap3.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap3.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                j4.f fVar4 = new j4.f(ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE, hashMap3, new HashSet(0), new HashSet(0));
                j4.f a13 = j4.f.a(iVar, ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE);
                if (!fVar4.equals(a13)) {
                    return new u.c(false, "extra_attribute_options(com.forsale.app.datalayer.database.ExtraAttributeOptionEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
                }
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap4.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap4.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap4.put("display_order", new f.a("display_order", "INTEGER", true, 0, null, 1));
                j4.f fVar5 = new j4.f(ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE, hashMap4, new HashSet(0), new HashSet(0));
                j4.f a14 = j4.f.a(iVar, ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE);
                if (!fVar5.equals(a14)) {
                    return new u.c(false, "extra_attribute_groups(com.forsale.app.datalayer.database.ExtraAttributeGroupEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
                }
                HashMap hashMap5 = new HashMap(3);
                hashMap5.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap5.put("cat_id", new f.a("cat_id", "INTEGER", true, 0, null, 1));
                hashMap5.put("attribute_id", new f.a("attribute_id", "INTEGER", true, 0, null, 1));
                j4.f fVar6 = new j4.f(CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES, hashMap5, new HashSet(0), new HashSet(0));
                j4.f a15 = j4.f.a(iVar, CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES);
                if (!fVar6.equals(a15)) {
                    return new u.c(false, "categories_extra_attributes(com.forsale.app.datalayer.database.CategoryExtraAttributeEntity).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
                }
                HashMap hashMap6 = new HashMap(11);
                hashMap6.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap6.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap6.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap6.put(AgentEntity.DESCRIPTION_AR, new f.a(AgentEntity.DESCRIPTION_AR, "TEXT", true, 0, null, 1));
                hashMap6.put(AgentEntity.DESCRIPTION_EN, new f.a(AgentEntity.DESCRIPTION_EN, "TEXT", true, 0, null, 1));
                hashMap6.put("phone", new f.a("phone", "TEXT", true, 0, null, 1));
                hashMap6.put("image", new f.a("image", "TEXT", true, 0, null, 1));
                hashMap6.put("email", new f.a("email", "TEXT", true, 0, null, 1));
                hashMap6.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
                hashMap6.put("display_order", new f.a("display_order", "INTEGER", true, 0, null, 1));
                hashMap6.put("is_indexed", new f.a("is_indexed", "INTEGER", false, 0, "null", 1));
                j4.f fVar7 = new j4.f(AgentEntity.AGENTS_TABLE, hashMap6, new HashSet(0), new HashSet(0));
                j4.f a16 = j4.f.a(iVar, AgentEntity.AGENTS_TABLE);
                if (!fVar7.equals(a16)) {
                    return new u.c(false, "agents(com.forsale.app.datalayer.database.AgentEntity).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
                }
                HashMap hashMap7 = new HashMap(4);
                hashMap7.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap7.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap7.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap7.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
                j4.f fVar8 = new j4.f(LocationEntity.LOCATIONS_TABLE, hashMap7, new HashSet(0), new HashSet(0));
                j4.f a17 = j4.f.a(iVar, LocationEntity.LOCATIONS_TABLE);
                if (!fVar8.equals(a17)) {
                    return new u.c(false, "locations(com.forsale.app.datalayer.database.LocationEntity).\n Expected:\n" + fVar8 + "\n Found:\n" + a17);
                }
                HashMap hashMap8 = new HashMap(3);
                hashMap8.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap8.put(AgentLocationEntity.AGENT_ID, new f.a(AgentLocationEntity.AGENT_ID, "INTEGER", true, 0, null, 1));
                hashMap8.put(AgentLocationEntity.LOCATION_ID, new f.a(AgentLocationEntity.LOCATION_ID, "INTEGER", true, 0, null, 1));
                j4.f fVar9 = new j4.f(AgentLocationEntity.AGENTS_LOCATIONS_TABLE, hashMap8, new HashSet(0), new HashSet(0));
                j4.f a18 = j4.f.a(iVar, AgentLocationEntity.AGENTS_LOCATIONS_TABLE);
                if (!fVar9.equals(a18)) {
                    return new u.c(false, "agents_locations(com.forsale.app.datalayer.database.AgentLocationEntity).\n Expected:\n" + fVar9 + "\n Found:\n" + a18);
                }
                HashMap hashMap9 = new HashMap(24);
                hashMap9.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap9.put(RegionEntity.MAIN_DISTRICT_ID, new f.a(RegionEntity.MAIN_DISTRICT_ID, "INTEGER", false, 0, null, 1));
                hashMap9.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap9.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.REGION_CODE_EN, new f.a(RegionEntity.REGION_CODE_EN, "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.REGION_CODE_AR, new f.a(RegionEntity.REGION_CODE_AR, "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.PHONE_PREFIX, new f.a(RegionEntity.PHONE_PREFIX, "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.UTC_DIFF, new f.a(RegionEntity.UTC_DIFF, "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.ALLOW_MESSAGING, new f.a(RegionEntity.ALLOW_MESSAGING, "INTEGER", true, 0, "1", 1));
                hashMap9.put(RegionEntity.ALLOW_GUEST_MESSAGING, new f.a(RegionEntity.ALLOW_GUEST_MESSAGING, "INTEGER", true, 0, "1", 1));
                hashMap9.put(RegionEntity.CONTACT_DATA, new f.a(RegionEntity.CONTACT_DATA, "TEXT", true, 0, null, 1));
                hashMap9.put(RegionEntity.CONTACT_EMAIL, new f.a(RegionEntity.CONTACT_EMAIL, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN, new f.a(RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN, new f.a(RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR, new f.a(RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR, new f.a(RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.SUPPORT_MESSAGE_EN, new f.a(RegionEntity.SUPPORT_MESSAGE_EN, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.SUPPORT_MESSAGE_AR, new f.a(RegionEntity.SUPPORT_MESSAGE_AR, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.ADDRESS_EN, new f.a(RegionEntity.ADDRESS_EN, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.ADDRESS_AR, new f.a(RegionEntity.ADDRESS_AR, "TEXT", false, 0, "null", 1));
                hashMap9.put(RegionEntity.MIN_POINTS_FOR_REDEMPTION, new f.a(RegionEntity.MIN_POINTS_FOR_REDEMPTION, "REAL", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap9.put(RegionEntity.AMOUNT_PER_REDEMPTION, new f.a(RegionEntity.AMOUNT_PER_REDEMPTION, "REAL", true, 0, "0.000", 1));
                hashMap9.put(RegionEntity.POINTS_PER_PAID_AMOUNT, new f.a(RegionEntity.POINTS_PER_PAID_AMOUNT, "REAL", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap9.put(RegionEntity.POINT_LEVELS, new f.a(RegionEntity.POINT_LEVELS, "TEXT", false, 0, "null", 1));
                j4.f fVar10 = new j4.f("regions", hashMap9, new HashSet(0), new HashSet(0));
                j4.f a19 = j4.f.a(iVar, "regions");
                if (!fVar10.equals(a19)) {
                    return new u.c(false, "regions(com.forsale.app.datalayer.database.RegionEntity).\n Expected:\n" + fVar10 + "\n Found:\n" + a19);
                }
                HashMap hashMap10 = new HashMap(16);
                hashMap10.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap10.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
                hashMap10.put("display_order", new f.a("display_order", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap10.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap10.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap10.put("image", new f.a("image", "TEXT", false, 0, "null", 1));
                hashMap10.put("image_en", new f.a("image_en", "TEXT", false, 0, "null", 1));
                hashMap10.put("image_ar", new f.a("image_ar", "TEXT", false, 0, "null", 1));
                hashMap10.put("parent_id", new f.a("parent_id", "INTEGER", true, 0, null, 1));
                hashMap10.put(DistrictEntity.LEVEL, new f.a(DistrictEntity.LEVEL, "INTEGER", true, 0, null, 1));
                hashMap10.put(DistrictEntity.CHILDREN, new f.a(DistrictEntity.CHILDREN, "TEXT", false, 0, "null", 1));
                hashMap10.put(DistrictEntity.PARENTS, new f.a(DistrictEntity.PARENTS, "TEXT", false, 0, "null", 1));
                hashMap10.put(AdvancedSearchBody.GEO_LAT, new f.a(AdvancedSearchBody.GEO_LAT, "REAL", false, 0, "null", 1));
                hashMap10.put(AdvancedSearchBody.GEO_LON, new f.a(AdvancedSearchBody.GEO_LON, "REAL", false, 0, "null", 1));
                hashMap10.put("full_path_ar", new f.a("full_path_ar", "TEXT", false, 0, "null", 1));
                hashMap10.put("full_path_en", new f.a("full_path_en", "TEXT", false, 0, "null", 1));
                j4.f fVar11 = new j4.f("districts", hashMap10, new HashSet(0), new HashSet(0));
                j4.f a21 = j4.f.a(iVar, "districts");
                if (!fVar11.equals(a21)) {
                    return new u.c(false, "districts(com.forsale.app.datalayer.database.DistrictEntity).\n Expected:\n" + fVar11 + "\n Found:\n" + a21);
                }
                HashMap hashMap11 = new HashMap(3);
                hashMap11.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap11.put(ProhibitedKeywordEntity.KEYWORD, new f.a(ProhibitedKeywordEntity.KEYWORD, "TEXT", true, 0, null, 1));
                hashMap11.put("is_active", new f.a("is_active", "INTEGER", true, 0, "1", 1));
                j4.f fVar12 = new j4.f(ProhibitedKeywordEntity.PROHIBITED_KEYWORDS, hashMap11, new HashSet(0), new HashSet(0));
                j4.f a22 = j4.f.a(iVar, ProhibitedKeywordEntity.PROHIBITED_KEYWORDS);
                if (!fVar12.equals(a22)) {
                    return new u.c(false, "prohibited_keywords(com.forsale.app.datalayer.database.ProhibitedKeywordEntity).\n Expected:\n" + fVar12 + "\n Found:\n" + a22);
                }
                HashMap hashMap12 = new HashMap(5);
                hashMap12.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap12.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
                hashMap12.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
                hashMap12.put("parent_id", new f.a("parent_id", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap12.put("image", new f.a("image", "TEXT", false, 0, "null", 1));
                j4.f fVar13 = new j4.f(DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE, hashMap12, new HashSet(0), new HashSet(0));
                j4.f a23 = j4.f.a(iVar, DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE);
                if (!fVar13.equals(a23)) {
                    return new u.c(false, "directory_categories(com.forsale.app.datalayer.database.DirectoryCategoryEntity).\n Expected:\n" + fVar13 + "\n Found:\n" + a23);
                }
                HashMap hashMap13 = new HashMap(11);
                hashMap13.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap13.put("cat_id", new f.a("cat_id", "INTEGER", true, 0, null, 1));
                hashMap13.put(CategoryDistrict.DISTRICT_ID, new f.a(CategoryDistrict.DISTRICT_ID, "INTEGER", true, 0, null, 1));
                hashMap13.put("price", new f.a("price", "REAL", true, 0, "1.0", 1));
                hashMap13.put(CategoryDistrict.PINNING_SHUFFLE_FACTOR, new f.a(CategoryDistrict.PINNING_SHUFFLE_FACTOR, "INTEGER", true, 0, "3", 1));
                hashMap13.put(CategoryDistrict.USER_TYPE_PINNING_SHUFFLE_FACTOR, new f.a(CategoryDistrict.USER_TYPE_PINNING_SHUFFLE_FACTOR, "INTEGER", true, 0, "2", 1));
                hashMap13.put(CategoryDistrict.MAX_PRICE, new f.a(CategoryDistrict.MAX_PRICE, "INTEGER", true, 0, "100000", 1));
                hashMap13.put(CategoryDistrict.COMMERCIAL_PINNING_SHUFFLE_FACTOR, new f.a(CategoryDistrict.COMMERCIAL_PINNING_SHUFFLE_FACTOR, "INTEGER", true, 0, "3", 1));
                hashMap13.put(CategoryDistrict.ALLOW_UPLOAD_ON_FREE, new f.a(CategoryDistrict.ALLOW_UPLOAD_ON_FREE, "INTEGER", true, 0, "1", 1));
                hashMap13.put(CategoryDistrict.LISTINGS_COUNT, new f.a(CategoryDistrict.LISTINGS_COUNT, "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
                hashMap13.put("is_active", new f.a("is_active", "INTEGER", false, 0, "1", 1));
                j4.f fVar14 = new j4.f(CategoryDistrict.CATEGORY_DISTRICT_TABLE, hashMap13, new HashSet(0), new HashSet(0));
                j4.f a24 = j4.f.a(iVar, CategoryDistrict.CATEGORY_DISTRICT_TABLE);
                if (!fVar14.equals(a24)) {
                    return new u.c(false, "categories_districts(com.forsale.app.datalayer.database.CategoryDistrict).\n Expected:\n" + fVar14 + "\n Found:\n" + a24);
                }
                return new u.c(true, null);
            }

            @Override // androidx.room.u.b
            public void onPostMigrate(i iVar) {
            }
        }, "9fd70adc1f06bda434e41e97db2e0937", "9cf0e9790fc8e2157a4359327fc7018b")).a());
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public DirectoryCategoryDao directoryCategoryDao() {
        DirectoryCategoryDao directoryCategoryDao;
        if (this._directoryCategoryDao != null) {
            return this._directoryCategoryDao;
        }
        synchronized (this) {
            if (this._directoryCategoryDao == null) {
                this._directoryCategoryDao = new DirectoryCategoryDao_Impl(this);
            }
            directoryCategoryDao = this._directoryCategoryDao;
        }
        return directoryCategoryDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public DistrictDao districtDao() {
        DistrictDao districtDao;
        if (this._districtDao != null) {
            return this._districtDao;
        }
        synchronized (this) {
            if (this._districtDao == null) {
                this._districtDao = new DistrictDao_Impl(this);
            }
            districtDao = this._districtDao;
        }
        return districtDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public ExtraAttributeDao extraAttributeDao() {
        ExtraAttributeDao extraAttributeDao;
        if (this._extraAttributeDao != null) {
            return this._extraAttributeDao;
        }
        synchronized (this) {
            if (this._extraAttributeDao == null) {
                this._extraAttributeDao = new ExtraAttributeDao_Impl(this);
            }
            extraAttributeDao = this._extraAttributeDao;
        }
        return extraAttributeDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public ExtraAttributeGroupDao extraAttributeGroupDao() {
        ExtraAttributeGroupDao extraAttributeGroupDao;
        if (this._extraAttributeGroupDao != null) {
            return this._extraAttributeGroupDao;
        }
        synchronized (this) {
            if (this._extraAttributeGroupDao == null) {
                this._extraAttributeGroupDao = new ExtraAttributeGroupDao_Impl(this);
            }
            extraAttributeGroupDao = this._extraAttributeGroupDao;
        }
        return extraAttributeGroupDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public ExtraAttributeOptionDao extraAttributeOptionDao() {
        ExtraAttributeOptionDao extraAttributeOptionDao;
        if (this._extraAttributeOptionDao != null) {
            return this._extraAttributeOptionDao;
        }
        synchronized (this) {
            if (this._extraAttributeOptionDao == null) {
                this._extraAttributeOptionDao = new ExtraAttributeOptionDao_Impl(this);
            }
            extraAttributeOptionDao = this._extraAttributeOptionDao;
        }
        return extraAttributeOptionDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public ExtraAttributeRawDao extraAttributeRawDao() {
        ExtraAttributeRawDao extraAttributeRawDao;
        if (this._extraAttributeRawDao != null) {
            return this._extraAttributeRawDao;
        }
        synchronized (this) {
            if (this._extraAttributeRawDao == null) {
                this._extraAttributeRawDao = new ExtraAttributeRawDao_Impl(this);
            }
            extraAttributeRawDao = this._extraAttributeRawDao;
        }
        return extraAttributeRawDao;
    }

    @Override // androidx.room.RoomDatabase
    public List<i4.b> getAutoMigrations(Map<Class<? extends a>, a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(CategoryDao.class, CategoryDao_Impl.getRequiredConverters());
        hashMap.put(ExtraAttributeDao.class, ExtraAttributeDao_Impl.getRequiredConverters());
        hashMap.put(CategoryExtraAttributeDao.class, CategoryExtraAttributeDao_Impl.getRequiredConverters());
        hashMap.put(ExtraAttributeGroupDao.class, ExtraAttributeGroupDao_Impl.getRequiredConverters());
        hashMap.put(ExtraAttributeOptionDao.class, ExtraAttributeOptionDao_Impl.getRequiredConverters());
        hashMap.put(AgentDao.class, AgentDao_Impl.getRequiredConverters());
        hashMap.put(LocationDao.class, LocationDao_Impl.getRequiredConverters());
        hashMap.put(AgentLocationDao.class, AgentLocationDao_Impl.getRequiredConverters());
        hashMap.put(DistrictDao.class, DistrictDao_Impl.getRequiredConverters());
        hashMap.put(ProhibitedKeywordDao.class, ProhibitedKeywordDao_Impl.getRequiredConverters());
        hashMap.put(DirectoryCategoryDao.class, DirectoryCategoryDao_Impl.getRequiredConverters());
        hashMap.put(RegionDao.class, RegionDao_Impl.getRequiredConverters());
        hashMap.put(CategoryWithSubCategoriesDao.class, CategoryWithSubCategoriesDao_Impl.getRequiredConverters());
        hashMap.put(ExtraAttributeRawDao.class, ExtraAttributeRawDao_Impl.getRequiredConverters());
        hashMap.put(CategoryDistrictDao.class, CategoryDistrictDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public LocationDao locationDao() {
        LocationDao locationDao;
        if (this._locationDao != null) {
            return this._locationDao;
        }
        synchronized (this) {
            if (this._locationDao == null) {
                this._locationDao = new LocationDao_Impl(this);
            }
            locationDao = this._locationDao;
        }
        return locationDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public ProhibitedKeywordDao prohibitedKeywordDao() {
        ProhibitedKeywordDao prohibitedKeywordDao;
        if (this._prohibitedKeywordDao != null) {
            return this._prohibitedKeywordDao;
        }
        synchronized (this) {
            if (this._prohibitedKeywordDao == null) {
                this._prohibitedKeywordDao = new ProhibitedKeywordDao_Impl(this);
            }
            prohibitedKeywordDao = this._prohibitedKeywordDao;
        }
        return prohibitedKeywordDao;
    }

    @Override // com.forsale.app.datalayer.database.MasterDataDatabase
    public RegionDao regionDao() {
        RegionDao regionDao;
        if (this._regionDao != null) {
            return this._regionDao;
        }
        synchronized (this) {
            if (this._regionDao == null) {
                this._regionDao = new RegionDao_Impl(this);
            }
            regionDao = this._regionDao;
        }
        return regionDao;
    }
}
