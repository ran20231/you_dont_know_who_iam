package com.forsale.app.datalayer;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import androidx.room.RoomDatabase;
import com.forsale.app.datalayer.DataBaseHandler;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.database.AgentLocationEntity;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryExtraAttributeEntity;
import com.forsale.app.datalayer.database.DirectoryCategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.database.ExtraAttributeGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.database.LocationEntity;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import l4.i;
import x10.a;
/* compiled from: DataBaseHandler.kt */
@SuppressLint({"Range"})
/* loaded from: classes2.dex */
public final class DataBaseHandler {
    public static final int $stable;
    public static final int DATA_BASE_VERSION = 17;
    private static final List<String> currentStructureTables;
    private static final RoomDatabase.e prePkgDbCallback;
    public static final DataBaseHandler INSTANCE = new DataBaseHandler();
    private static final String SQLITE_MASTER_TABLE_NAME = "sqlite_master";
    private static final String SQLITE_MASTER_COL_NAME = "name";
    private static final String SQLITE_MASTER_COL_TYPE = "type";
    private static final String SQLITE_MASTER_COL_TABLE_NAME = "tbl_name";
    private static final String SQLITE_MASTER_COL_SQL = "sql";

    /* compiled from: DataBaseHandler.kt */
    /* loaded from: classes2.dex */
    public static final class SQLiteMasterComponent {
        public static final int $stable = 8;
        private int foreignKeyCount;
        private int foreignKeyFlag;
        private String name;
        private String owningTable;
        private String sql;
        private String type;

        public SQLiteMasterComponent(String name, String type, String owningTable, String sql, int i11, int i12) {
            o.i(name, "name");
            o.i(type, "type");
            o.i(owningTable, "owningTable");
            o.i(sql, "sql");
            this.name = name;
            this.type = type;
            this.owningTable = owningTable;
            this.sql = sql;
            this.foreignKeyFlag = i11;
            this.foreignKeyCount = i12;
        }

        public final int getForeignKeyCount() {
            return this.foreignKeyCount;
        }

        public final int getForeignKeyFlag() {
            return this.foreignKeyFlag;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOwningTable() {
            return this.owningTable;
        }

        public final String getSql() {
            return this.sql;
        }

        public final String getType() {
            return this.type;
        }

        public final boolean isForeignKey() {
            if (this.foreignKeyFlag > 0) {
                return true;
            }
            return false;
        }

        public final void setForeignKeyCount(int i11) {
            this.foreignKeyCount = i11;
        }

        public final void setForeignKeyFlag(int i11) {
            this.foreignKeyFlag = i11;
        }

        public final void setName(String str) {
            o.i(str, "<set-?>");
            this.name = str;
        }

        public final void setOwningTable(String str) {
            o.i(str, "<set-?>");
            this.owningTable = str;
        }

        public final void setSql(String str) {
            o.i(str, "<set-?>");
            this.sql = str;
        }

        public final void setType(String str) {
            o.i(str, "<set-?>");
            this.type = str;
        }

        public final int getForeignKeyCount(i db2) {
            o.i(db2, "db");
            String str = this.name;
            Cursor o12 = db2.o1("SELECT count(*) FROM pragma_foreign_key_list('" + str + "');");
            int i11 = o12.moveToFirst() ? o12.getInt(0) : 0;
            o12.close();
            return i11;
        }
    }

    static {
        List<String> q11;
        q11 = r.q(CategoryEntity.CATEGORIES_TABLE, ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE, ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE, ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE, CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES, AgentEntity.AGENTS_TABLE, LocationEntity.LOCATIONS_TABLE, AgentLocationEntity.AGENTS_LOCATIONS_TABLE, AgentLocationEntity.AGENTS_LOCATIONS_TABLE, "regions", "districts", ProhibitedKeywordEntity.PROHIBITED_KEYWORDS, DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE, CategoryDistrict.CATEGORY_DISTRICT_TABLE);
        currentStructureTables = q11;
        prePkgDbCallback = new RoomDatabase.e() { // from class: com.forsale.app.datalayer.DataBaseHandler$prePkgDbCallback$1
            private final String assetTablePrefix = "asset_";
            private List<DataBaseHandler.SQLiteMasterComponent> sqLiteMasterComponentArray;

            public final String getAssetTablePrefix() {
                return this.assetTablePrefix;
            }

            @Override // androidx.room.RoomDatabase.e
            public void onOpenPrepackagedDatabase(i db2) {
                o.i(db2, "db");
                super.onOpenPrepackagedDatabase(db2);
                DataBaseHandler dataBaseHandler = DataBaseHandler.INSTANCE;
                List<DataBaseHandler.SQLiteMasterComponent> buildComponentsList = dataBaseHandler.buildComponentsList(db2);
                this.sqLiteMasterComponentArray = buildComponentsList;
                dataBaseHandler.dropNonTableComponents(buildComponentsList, db2);
                dataBaseHandler.renameTableComponents(this.sqLiteMasterComponentArray, this.assetTablePrefix, db2);
                dataBaseHandler.createDataBaseTables(db2);
                dataBaseHandler.copyData(this.sqLiteMasterComponentArray, this.assetTablePrefix, db2, dataBaseHandler.getCurrentStructureTables());
                dataBaseHandler.dropRenamedTableComponents(this.sqLiteMasterComponentArray, this.assetTablePrefix, db2);
                db2.M("VACUUM");
                db2.M("PRAGMA user_version = 17");
            }
        };
        $stable = 8;
    }

    private DataBaseHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDataBaseTables(i iVar) {
        iVar.M("CREATE TABLE IF NOT EXISTS `categories` (`id` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `system_name` TEXT NOT NULL, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `image` TEXT NOT NULL, `parent_id` INTEGER NOT NULL DEFAULT 0, `display_order` INTEGER NOT NULL DEFAULT 0, `allow_uploading` INTEGER NOT NULL DEFAULT 1, `is_filterable` INTEGER NOT NULL DEFAULT 0, `steps` INTEGER NOT NULL DEFAULT 100, `promote_animation` TEXT DEFAULT null, `is_alternate_view` INTEGER DEFAULT null, `allow_search` INTEGER DEFAULT 0, `attribute_values` TEXT DEFAULT null, `is_expendable` INTEGER DEFAULT 0, `allow_district_filtering` INTEGER NOT NULL DEFAULT 0, `has_plans` INTEGER NOT NULL DEFAULT 0, `filterable_label_en` TEXT DEFAULT null, `filterable_label_ar` TEXT DEFAULT null, `ruleset` TEXT DEFAULT null, `classification` TEXT DEFAULT null, `allow_power_pin_view` INTEGER NOT NULL DEFAULT 1, `allow_power_pin_add` INTEGER NOT NULL DEFAULT 1, `full_path` TEXT NOT NULL, `category_type` TEXT NOT NULL, `filtering_classification_ar` TEXT DEFAULT null, `filtering_classification_en` TEXT DEFAULT null, `is_indexed` INTEGER DEFAULT 0, `vertical_image` TEXT DEFAULT null, `max_home_top_banners` INTEGER NOT NULL DEFAULT 0, `relatives` TEXT DEFAULT null, `featured_image` TEXT NOT NULL, `is_alt_cat` INTEGER NOT NULL DEFAULT 0, `filtration_settings` TEXT DEFAULT null, `sections` TEXT DEFAULT null, `slug` TEXT DEFAULT null, PRIMARY KEY(`id`))");
        iVar.M("CREATE TABLE IF NOT EXISTS `extra_attributes` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `name_ar` TEXT NOT NULL, `name_en` TEXT NOT NULL, `system_name` TEXT NOT NULL, `is_required` INTEGER DEFAULT null, `display_order` INTEGER DEFAULT null, `min` INTEGER NOT NULL, `max` INTEGER NOT NULL, `validate_min` INTEGER NOT NULL, `validate_max` INTEGER NOT NULL, `slider_steps` INTEGER DEFAULT null, `is_int` INTEGER NOT NULL, `image` TEXT NOT NULL, `extra_attribute_group_id` INTEGER DEFAULT null, `sub_type` TEXT DEFAULT null, `scope` TEXT NOT NULL, `unit` TEXT DEFAULT null, `selection_type` TEXT NOT NULL DEFAULT 'single', `exposed_type` TEXT NOT NULL DEFAULT 'none', `view_type` TEXT NOT NULL DEFAULT 'horizontal', `is_filterable` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
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
        iVar.M("CREATE TABLE IF NOT EXISTS `categories_districts` (`id` INTEGER NOT NULL, `cat_id` INTEGER NOT NULL, `district_id` INTEGER NOT NULL, `price` REAL NOT NULL DEFAULT 1.0, `pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 3, `max_price` INTEGER NOT NULL DEFAULT 100000, `commercial_pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 3,`user_type_pinning_shuffle_factor` INTEGER NOT NULL DEFAULT 2 , `allow_upload_on_free` INTEGER NOT NULL DEFAULT 1, `listings_count` INTEGER NOT NULL DEFAULT 0, `is_active` INTEGER DEFAULT 1, PRIMARY KEY(`id`))");
    }

    @SuppressLint({"Range"})
    public final List<SQLiteMasterComponent> buildComponentsList(i db2) {
        o.i(db2, "db");
        ArrayList arrayList = new ArrayList();
        String str = SQLITE_MASTER_COL_SQL;
        String str2 = SQLITE_MASTER_TABLE_NAME;
        String str3 = SQLITE_MASTER_COL_NAME;
        Cursor o12 = db2.o1("SELECT *,(instr(" + str + ",'FOREIGN KEY') > 0) + (instr(" + str + ",' REFERENCES ')> 0) AS foreign_key_flag FROM " + str2 + " WHERE lower(" + str3 + ") NOT LIKE 'sqlite_%' AND lower(" + str3 + ") NOT LIKE 'android_%'");
        while (o12.moveToNext()) {
            String string = o12.getString(o12.getColumnIndex(SQLITE_MASTER_COL_NAME));
            o.h(string, "getString(...)");
            String string2 = o12.getString(o12.getColumnIndex(SQLITE_MASTER_COL_TYPE));
            o.h(string2, "getString(...)");
            String string3 = o12.getString(o12.getColumnIndex(SQLITE_MASTER_COL_TABLE_NAME));
            o.h(string3, "getString(...)");
            String string4 = o12.getString(o12.getColumnIndex(SQLITE_MASTER_COL_SQL));
            o.h(string4, "getString(...)");
            SQLiteMasterComponent sQLiteMasterComponent = new SQLiteMasterComponent(string, string2, string3, string4, o12.getInt(o12.getColumnIndex("foreign_key_flag")), 0);
            if (o12.getInt(o12.getColumnIndex("foreign_key_flag")) > 0) {
                sQLiteMasterComponent.setForeignKeyCount(sQLiteMasterComponent.getForeignKeyCount(db2));
            }
            arrayList.add(sQLiteMasterComponent);
        }
        o12.close();
        return arrayList;
    }

    public final int copyData(List<SQLiteMasterComponent> list, String prefix, i db2, List<String> list2) {
        List t02;
        List t03;
        Set c12;
        Set p02;
        String t04;
        String str;
        SQLiteMasterComponent sQLiteMasterComponent;
        List<String> currentStructureTables2 = list2;
        o.i(prefix, "prefix");
        o.i(db2, "db");
        o.i(currentStructureTables2, "currentStructureTables");
        o.f(list);
        int i11 = 0;
        for (SQLiteMasterComponent sQLiteMasterComponent2 : list) {
            if (o.d(sQLiteMasterComponent2.getType(), "table") && sQLiteMasterComponent2.getForeignKeyCount() > 0) {
                i11 = sQLiteMasterComponent2.getForeignKeyCount();
            }
        }
        if (i11 >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                ArrayList<SQLiteMasterComponent> arrayList = new ArrayList();
                for (SQLiteMasterComponent sQLiteMasterComponent3 : list) {
                    if (currentStructureTables2.contains(sQLiteMasterComponent3.getName())) {
                        sQLiteMasterComponent = sQLiteMasterComponent3;
                    } else {
                        sQLiteMasterComponent = null;
                    }
                    if (sQLiteMasterComponent != null) {
                        arrayList.add(sQLiteMasterComponent);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int i14 = i12;
                    for (SQLiteMasterComponent sQLiteMasterComponent4 : arrayList) {
                        if (o.d(sQLiteMasterComponent4.getType(), "table") && sQLiteMasterComponent4.getForeignKeyCount() == i13) {
                            try {
                                Cursor o12 = db2.o1("select * from " + sQLiteMasterComponent4.getName() + " where 1=2");
                                o.g(o12, "null cannot be cast to non-null type android.database.sqlite.SQLiteCursor");
                                String[] columnNames = ((SQLiteCursor) o12).getColumnNames();
                                o.h(columnNames, "getColumnNames(...)");
                                t02 = ArraysKt___ArraysKt.t0(columnNames);
                                Cursor o13 = db2.o1("select * from " + prefix + sQLiteMasterComponent4.getName() + " where 1=2");
                                o.g(o13, "null cannot be cast to non-null type android.database.sqlite.SQLiteCursor");
                                String[] columnNames2 = ((SQLiteCursor) o13).getColumnNames();
                                o.h(columnNames2, "getColumnNames(...)");
                                t03 = ArraysKt___ArraysKt.t0(columnNames2);
                                c12 = CollectionsKt___CollectionsKt.c1(t03);
                                p02 = CollectionsKt___CollectionsKt.p0(t02, c12);
                                t04 = CollectionsKt___CollectionsKt.t0(p02, ",", null, null, 0, null, null, 62, null);
                                str = "INSERT Or Ignore INTO " + sQLiteMasterComponent4.getName() + " (" + t04 + ") SELECT " + t04 + " FROM " + prefix + sQLiteMasterComponent4.getName();
                            } catch (Exception e11) {
                                e = e11;
                            }
                            try {
                                a.b("******************* columns to copy : " + t04, new Object[0]);
                                db2.M(str);
                                i14++;
                            } catch (Exception e12) {
                                e = e12;
                                dj.i.f54287a.invoke().f(e);
                                a.c(e);
                            }
                        }
                    }
                    i12 = i14;
                }
                if (i13 != i11) {
                    i13++;
                    currentStructureTables2 = list2;
                } else {
                    return i12;
                }
            }
        } else {
            return 0;
        }
    }

    public final int createTriggers(List<SQLiteMasterComponent> list, i db2) {
        o.i(db2, "db");
        o.f(list);
        int i11 = 0;
        for (SQLiteMasterComponent sQLiteMasterComponent : list) {
            if (o.d(sQLiteMasterComponent.getType(), "trigger")) {
                db2.M(sQLiteMasterComponent.getSql());
                i11++;
            }
        }
        return i11;
    }

    public final int dropNonTableComponents(List<SQLiteMasterComponent> list, i db2) {
        o.i(db2, "db");
        o.f(list);
        int i11 = 0;
        for (SQLiteMasterComponent sQLiteMasterComponent : list) {
            if (!o.d(sQLiteMasterComponent.getType(), "table")) {
                String type = sQLiteMasterComponent.getType();
                String name = sQLiteMasterComponent.getName();
                db2.M("DROP " + type + " IF EXISTS " + name);
                i11++;
            }
        }
        return i11;
    }

    public final int dropRenamedTableComponents(List<SQLiteMasterComponent> list, String prefix, i db2) {
        o.i(prefix, "prefix");
        o.i(db2, "db");
        o.f(list);
        int i11 = 0;
        for (SQLiteMasterComponent sQLiteMasterComponent : list) {
            if (o.d(sQLiteMasterComponent.getType(), "table") && sQLiteMasterComponent.getForeignKeyCount() > i11) {
                i11 = sQLiteMasterComponent.getForeignKeyCount();
            }
        }
        int i12 = 0;
        while (-1 < i11) {
            for (SQLiteMasterComponent sQLiteMasterComponent2 : list) {
                if (o.d(sQLiteMasterComponent2.getType(), "table") && sQLiteMasterComponent2.getForeignKeyCount() == i11) {
                    a.b("*********** tabe to drop  " + prefix + sQLiteMasterComponent2.getName(), new Object[0]);
                    db2.M("DROP " + sQLiteMasterComponent2.getType() + " IF EXISTS " + prefix + sQLiteMasterComponent2.getName());
                    i12++;
                }
            }
            i11--;
        }
        return i12;
    }

    public final List<String> getCurrentStructureTables() {
        return currentStructureTables;
    }

    public final RoomDatabase.e getPrePkgDbCallback() {
        return prePkgDbCallback;
    }

    public final int renameTableComponents(List<SQLiteMasterComponent> list, String prefix, i db2) {
        o.i(prefix, "prefix");
        o.i(db2, "db");
        db2.M("PRAGMA foreign_keys = ON");
        o.f(list);
        int i11 = 0;
        for (SQLiteMasterComponent sQLiteMasterComponent : list) {
            if (o.d(sQLiteMasterComponent.getType(), "table")) {
                String name = sQLiteMasterComponent.getName();
                String name2 = sQLiteMasterComponent.getName();
                db2.M("ALTER TABLE " + name + " RENAME TO " + prefix + name2);
                i11++;
            }
        }
        return i11;
    }
}
