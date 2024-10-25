package com.forsale.adserver.datalayer.local;

import androidx.room.RoomDatabase;
import androidx.room.n;
import androidx.room.u;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.leanplum.core.BuildConfig;
import j4.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.j;
import x8.b;
import x8.c;
import x8.d;
import x8.e;
import x8.f;
import x8.g;
import x8.h;
import x8.i;
import x8.k;
import x8.l;
/* loaded from: classes2.dex */
public final class AdDatabase_Impl extends AdDatabase {

    /* renamed from: a  reason: collision with root package name */
    private volatile x8.a f20668a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f20669b;

    /* renamed from: c  reason: collision with root package name */
    private volatile i f20670c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f20671d;

    @Override // com.forsale.adserver.datalayer.local.AdDatabase
    public x8.a a() {
        x8.a aVar;
        if (this.f20668a != null) {
            return this.f20668a;
        }
        synchronized (this) {
            if (this.f20668a == null) {
                this.f20668a = new b(this);
            }
            aVar = this.f20668a;
        }
        return aVar;
    }

    @Override // com.forsale.adserver.datalayer.local.AdDatabase
    public e b() {
        e eVar;
        if (this.f20669b != null) {
            return this.f20669b;
        }
        synchronized (this) {
            if (this.f20669b == null) {
                this.f20669b = new f(this);
            }
            eVar = this.f20669b;
        }
        return eVar;
    }

    @Override // com.forsale.adserver.datalayer.local.AdDatabase
    public g c() {
        g gVar;
        if (this.f20671d != null) {
            return this.f20671d;
        }
        synchronized (this) {
            if (this.f20671d == null) {
                this.f20671d = new h(this);
            }
            gVar = this.f20671d;
        }
        return gVar;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        l4.i k12 = super.getOpenHelper().k1();
        try {
            super.beginTransaction();
            k12.M("DELETE FROM `banners`");
            k12.M("DELETE FROM `banner_identifiers`");
            k12.M("DELETE FROM `categories`");
            k12.M("DELETE FROM `screens`");
            k12.M("DELETE FROM `offers`");
            k12.M("DELETE FROM `master_categories`");
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
        return new n(this, new HashMap(0), new HashMap(0), "banners", "banner_identifiers", CategoryEntity.CATEGORIES_TABLE, "screens", "offers", "master_categories");
    }

    @Override // androidx.room.RoomDatabase
    protected j createOpenHelper(androidx.room.f fVar) {
        return fVar.f14982c.a(j.b.a(fVar.f14980a).c(fVar.f14981b).b(new u(fVar, new a(6), "f75d43ccb95191bb21f47d0ac7712ed8", "78a8a02c72e36c453aa838b42400154a")).a());
    }

    @Override // com.forsale.adserver.datalayer.local.AdDatabase
    public i d() {
        i iVar;
        if (this.f20670c != null) {
            return this.f20670c;
        }
        synchronized (this) {
            if (this.f20670c == null) {
                this.f20670c = new x8.j(this);
            }
            iVar = this.f20670c;
        }
        return iVar;
    }

    @Override // androidx.room.RoomDatabase
    public List<i4.b> getAutoMigrations(Map<Class<? extends i4.a>, i4.a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends i4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(x8.a.class, b.e());
        hashMap.put(c.class, d.a());
        hashMap.put(e.class, f.c());
        hashMap.put(k.class, l.a());
        hashMap.put(i.class, x8.j.p());
        hashMap.put(g.class, h.c());
        return hashMap;
    }

    /* loaded from: classes2.dex */
    class a extends u.b {
        a(int i11) {
            super(i11);
        }

        @Override // androidx.room.u.b
        public void createAllTables(l4.i iVar) {
            iVar.M("CREATE TABLE IF NOT EXISTS `banners` (`id` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `screen_id` INTEGER NOT NULL, `banner_type` TEXT NOT NULL, `sub_type` TEXT NOT NULL, `display_order` INTEGER NOT NULL, `title_en` TEXT NOT NULL, `title_ar` TEXT NOT NULL, `phone` TEXT NOT NULL, `target_url` TEXT, `open_target_url` INTEGER NOT NULL DEFAULT 0, `is_read` INTEGER NOT NULL DEFAULT 0, `video` TEXT, `small_image_en` TEXT, `small_image_ar` TEXT, `large_image_en` TEXT, `large_image_ar` TEXT, `html_url` TEXT, `extra_images_en` TEXT, `extra_images_ar` TEXT, PRIMARY KEY(`id`))");
            iVar.M("CREATE TABLE IF NOT EXISTS `banner_identifiers` (`id` INTEGER NOT NULL, `banner_id` INTEGER NOT NULL, `identifier_type` TEXT, `identifier_id` TEXT, PRIMARY KEY(`id`))");
            iVar.M("CREATE TABLE IF NOT EXISTS `categories` (`row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `icon` TEXT, `name_en` TEXT NOT NULL, `name_ar` TEXT NOT NULL)");
            iVar.M("CREATE TABLE IF NOT EXISTS `screens` (`id` INTEGER NOT NULL, `screen_identifier` TEXT NOT NULL, PRIMARY KEY(`id`))");
            iVar.M("CREATE TABLE IF NOT EXISTS `offers` (`id` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `weight` INTEGER NOT NULL, `category_id` INTEGER, `is_splash` INTEGER NOT NULL DEFAULT 0, `is_default_splash` INTEGER NOT NULL DEFAULT 0, `title_en` TEXT NOT NULL, `title_ar` TEXT NOT NULL, `phone` TEXT NOT NULL, `target_url` TEXT, `open_target_url` INTEGER NOT NULL DEFAULT 0, `large_image_en` TEXT NOT NULL, `large_image_ar` TEXT NOT NULL, `video` TEXT, `html` TEXT, `html_url` TEXT, `sub_type` TEXT, `is_landing` INTEGER NOT NULL DEFAULT 0, `extra_images_en` TEXT, `extra_images_ar` TEXT, `is_featured` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            iVar.M("CREATE TABLE IF NOT EXISTS `master_categories` (`id` INTEGER NOT NULL, `cat_id` INTEGER NOT NULL, `master_cat_id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            iVar.M("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            iVar.M("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f75d43ccb95191bb21f47d0ac7712ed8')");
        }

        @Override // androidx.room.u.b
        public void dropAllTables(l4.i iVar) {
            iVar.M("DROP TABLE IF EXISTS `banners`");
            iVar.M("DROP TABLE IF EXISTS `banner_identifiers`");
            iVar.M("DROP TABLE IF EXISTS `categories`");
            iVar.M("DROP TABLE IF EXISTS `screens`");
            iVar.M("DROP TABLE IF EXISTS `offers`");
            iVar.M("DROP TABLE IF EXISTS `master_categories`");
            List<RoomDatabase.b> list = ((RoomDatabase) AdDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.b(iVar);
                }
            }
        }

        @Override // androidx.room.u.b
        public void onCreate(l4.i iVar) {
            List<RoomDatabase.b> list = ((RoomDatabase) AdDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.a(iVar);
                }
            }
        }

        @Override // androidx.room.u.b
        public void onOpen(l4.i iVar) {
            ((RoomDatabase) AdDatabase_Impl.this).mDatabase = iVar;
            AdDatabase_Impl.this.internalInitInvalidationTracker(iVar);
            List<RoomDatabase.b> list = ((RoomDatabase) AdDatabase_Impl.this).mCallbacks;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.c(iVar);
                }
            }
        }

        @Override // androidx.room.u.b
        public void onPreMigrate(l4.i iVar) {
            j4.b.b(iVar);
        }

        @Override // androidx.room.u.b
        public u.c onValidateSchema(l4.i iVar) {
            HashMap hashMap = new HashMap(20);
            hashMap.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
            hashMap.put("screen_id", new f.a("screen_id", "INTEGER", true, 0, null, 1));
            hashMap.put("banner_type", new f.a("banner_type", "TEXT", true, 0, null, 1));
            hashMap.put("sub_type", new f.a("sub_type", "TEXT", true, 0, null, 1));
            hashMap.put("display_order", new f.a("display_order", "INTEGER", true, 0, null, 1));
            hashMap.put("title_en", new f.a("title_en", "TEXT", true, 0, null, 1));
            hashMap.put("title_ar", new f.a("title_ar", "TEXT", true, 0, null, 1));
            hashMap.put("phone", new f.a("phone", "TEXT", true, 0, null, 1));
            hashMap.put("target_url", new f.a("target_url", "TEXT", false, 0, null, 1));
            hashMap.put("open_target_url", new f.a("open_target_url", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap.put("is_read", new f.a("is_read", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap.put("video", new f.a("video", "TEXT", false, 0, null, 1));
            hashMap.put("small_image_en", new f.a("small_image_en", "TEXT", false, 0, null, 1));
            hashMap.put("small_image_ar", new f.a("small_image_ar", "TEXT", false, 0, null, 1));
            hashMap.put("large_image_en", new f.a("large_image_en", "TEXT", false, 0, null, 1));
            hashMap.put("large_image_ar", new f.a("large_image_ar", "TEXT", false, 0, null, 1));
            hashMap.put("html_url", new f.a("html_url", "TEXT", false, 0, null, 1));
            hashMap.put("extra_images_en", new f.a("extra_images_en", "TEXT", false, 0, null, 1));
            hashMap.put("extra_images_ar", new f.a("extra_images_ar", "TEXT", false, 0, null, 1));
            j4.f fVar = new j4.f("banners", hashMap, new HashSet(0), new HashSet(0));
            j4.f a11 = j4.f.a(iVar, "banners");
            if (!fVar.equals(a11)) {
                return new u.c(false, "banners(com.forsale.adserver.datalayer.local.tables.BannersEntity).\n Expected:\n" + fVar + "\n Found:\n" + a11);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("banner_id", new f.a("banner_id", "INTEGER", true, 0, null, 1));
            hashMap2.put("identifier_type", new f.a("identifier_type", "TEXT", false, 0, null, 1));
            hashMap2.put("identifier_id", new f.a("identifier_id", "TEXT", false, 0, null, 1));
            j4.f fVar2 = new j4.f("banner_identifiers", hashMap2, new HashSet(0), new HashSet(0));
            j4.f a12 = j4.f.a(iVar, "banner_identifiers");
            if (!fVar2.equals(a12)) {
                return new u.c(false, "banner_identifiers(com.forsale.adserver.datalayer.local.tables.BannersIdentifiersEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a12);
            }
            HashMap hashMap3 = new HashMap(5);
            hashMap3.put("row_id", new f.a("row_id", "INTEGER", true, 1, null, 1));
            hashMap3.put("id", new f.a("id", "INTEGER", true, 0, null, 1));
            hashMap3.put("icon", new f.a("icon", "TEXT", false, 0, null, 1));
            hashMap3.put("name_en", new f.a("name_en", "TEXT", true, 0, null, 1));
            hashMap3.put("name_ar", new f.a("name_ar", "TEXT", true, 0, null, 1));
            j4.f fVar3 = new j4.f(CategoryEntity.CATEGORIES_TABLE, hashMap3, new HashSet(0), new HashSet(0));
            j4.f a13 = j4.f.a(iVar, CategoryEntity.CATEGORIES_TABLE);
            if (!fVar3.equals(a13)) {
                return new u.c(false, "categories(com.forsale.adserver.datalayer.local.tables.CategoriesEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a13);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
            hashMap4.put("screen_identifier", new f.a("screen_identifier", "TEXT", true, 0, null, 1));
            j4.f fVar4 = new j4.f("screens", hashMap4, new HashSet(0), new HashSet(0));
            j4.f a14 = j4.f.a(iVar, "screens");
            if (!fVar4.equals(a14)) {
                return new u.c(false, "screens(com.forsale.adserver.datalayer.local.tables.ScreenEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a14);
            }
            HashMap hashMap5 = new HashMap(21);
            hashMap5.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
            hashMap5.put("region_id", new f.a("region_id", "INTEGER", true, 0, null, 1));
            hashMap5.put("weight", new f.a("weight", "INTEGER", true, 0, null, 1));
            hashMap5.put("category_id", new f.a("category_id", "INTEGER", false, 0, null, 1));
            hashMap5.put("is_splash", new f.a("is_splash", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap5.put("is_default_splash", new f.a("is_default_splash", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap5.put("title_en", new f.a("title_en", "TEXT", true, 0, null, 1));
            hashMap5.put("title_ar", new f.a("title_ar", "TEXT", true, 0, null, 1));
            hashMap5.put("phone", new f.a("phone", "TEXT", true, 0, null, 1));
            hashMap5.put("target_url", new f.a("target_url", "TEXT", false, 0, null, 1));
            hashMap5.put("open_target_url", new f.a("open_target_url", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap5.put("large_image_en", new f.a("large_image_en", "TEXT", true, 0, null, 1));
            hashMap5.put("large_image_ar", new f.a("large_image_ar", "TEXT", true, 0, null, 1));
            hashMap5.put("video", new f.a("video", "TEXT", false, 0, null, 1));
            hashMap5.put("html", new f.a("html", "TEXT", false, 0, null, 1));
            hashMap5.put("html_url", new f.a("html_url", "TEXT", false, 0, null, 1));
            hashMap5.put("sub_type", new f.a("sub_type", "TEXT", false, 0, null, 1));
            hashMap5.put("is_landing", new f.a("is_landing", "INTEGER", true, 0, BuildConfig.BUILD_NUMBER, 1));
            hashMap5.put("extra_images_en", new f.a("extra_images_en", "TEXT", false, 0, null, 1));
            hashMap5.put("extra_images_ar", new f.a("extra_images_ar", "TEXT", false, 0, null, 1));
            hashMap5.put("is_featured", new f.a("is_featured", "INTEGER", true, 0, null, 1));
            j4.f fVar5 = new j4.f("offers", hashMap5, new HashSet(0), new HashSet(0));
            j4.f a15 = j4.f.a(iVar, "offers");
            if (!fVar5.equals(a15)) {
                return new u.c(false, "offers(com.forsale.adserver.datalayer.local.tables.OffersEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a15);
            }
            HashMap hashMap6 = new HashMap(3);
            hashMap6.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
            hashMap6.put("cat_id", new f.a("cat_id", "INTEGER", true, 0, null, 1));
            hashMap6.put("master_cat_id", new f.a("master_cat_id", "INTEGER", true, 0, null, 1));
            j4.f fVar6 = new j4.f("master_categories", hashMap6, new HashSet(0), new HashSet(0));
            j4.f a16 = j4.f.a(iVar, "master_categories");
            if (!fVar6.equals(a16)) {
                return new u.c(false, "master_categories(com.forsale.adserver.datalayer.local.tables.MasterCategories).\n Expected:\n" + fVar6 + "\n Found:\n" + a16);
            }
            return new u.c(true, null);
        }

        @Override // androidx.room.u.b
        public void onPostMigrate(l4.i iVar) {
        }
    }
}
