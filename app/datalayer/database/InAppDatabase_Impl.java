package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import androidx.room.f;
import androidx.room.n;
import androidx.room.u;
import com.forsale.app.datalayer.repositories.InAppMessageDao;
import com.forsale.app.datalayer.repositories.InAppMessageDao_Impl;
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
public final class InAppDatabase_Impl extends InAppDatabase {
    private volatile InAppMessageDao _inAppMessageDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        i k12 = super.getOpenHelper().k1();
        try {
            super.beginTransaction();
            k12.M("DELETE FROM `in_app_message`");
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
        return new n(this, new HashMap(0), new HashMap(0), InAppMessageEntity.IN_APP_MESSAGE_TABLE);
    }

    @Override // androidx.room.RoomDatabase
    protected j createOpenHelper(f fVar) {
        return fVar.f14982c.a(j.b.a(fVar.f14980a).c(fVar.f14981b).b(new u(fVar, new u.b(3) { // from class: com.forsale.app.datalayer.database.InAppDatabase_Impl.1
            @Override // androidx.room.u.b
            public void createAllTables(i iVar) {
                iVar.M("CREATE TABLE IF NOT EXISTS `in_app_message` (`id` INTEGER NOT NULL, `action` TEXT NOT NULL, `cat_id` INTEGER, `duration` INTEGER NOT NULL, `expiry` TEXT, `image` TEXT, `item_id` INTEGER, `notification_type` TEXT, `promote_animation` TEXT, `region_id` INTEGER, `target_id` INTEGER, `text` TEXT, `type` TEXT, `url` TEXT, `districts_ids` TEXT, `universal_link` TEXT, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                iVar.M("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6a20855aff1f00d0f974cf149aba6797')");
            }

            @Override // androidx.room.u.b
            public void dropAllTables(i iVar) {
                iVar.M("DROP TABLE IF EXISTS `in_app_message`");
                List<RoomDatabase.b> list = ((RoomDatabase) InAppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.b(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onCreate(i iVar) {
                List<RoomDatabase.b> list = ((RoomDatabase) InAppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.a(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onOpen(i iVar) {
                ((RoomDatabase) InAppDatabase_Impl.this).mDatabase = iVar;
                InAppDatabase_Impl.this.internalInitInvalidationTracker(iVar);
                List<RoomDatabase.b> list = ((RoomDatabase) InAppDatabase_Impl.this).mCallbacks;
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
                HashMap hashMap = new HashMap(16);
                hashMap.put("id", new f.a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("action", new f.a("action", "TEXT", true, 0, null, 1));
                hashMap.put("cat_id", new f.a("cat_id", "INTEGER", false, 0, null, 1));
                hashMap.put("duration", new f.a("duration", "INTEGER", true, 0, null, 1));
                hashMap.put(InAppMessageEntity.EXPIRY, new f.a(InAppMessageEntity.EXPIRY, "TEXT", false, 0, null, 1));
                hashMap.put("image", new f.a("image", "TEXT", false, 0, null, 1));
                hashMap.put(InAppMessageEntity.ITEM_ID, new f.a(InAppMessageEntity.ITEM_ID, "INTEGER", false, 0, null, 1));
                hashMap.put(InAppMessageEntity.NOTIFICATION_TYPE, new f.a(InAppMessageEntity.NOTIFICATION_TYPE, "TEXT", false, 0, null, 1));
                hashMap.put("promote_animation", new f.a("promote_animation", "TEXT", false, 0, null, 1));
                hashMap.put("region_id", new f.a("region_id", "INTEGER", false, 0, null, 1));
                hashMap.put(InAppMessageEntity.TARGET_ID, new f.a(InAppMessageEntity.TARGET_ID, "INTEGER", false, 0, null, 1));
                hashMap.put("text", new f.a("text", "TEXT", false, 0, null, 1));
                hashMap.put("type", new f.a("type", "TEXT", false, 0, null, 1));
                hashMap.put("url", new f.a("url", "TEXT", false, 0, null, 1));
                hashMap.put("districts_ids", new f.a("districts_ids", "TEXT", false, 0, null, 1));
                hashMap.put("universal_link", new f.a("universal_link", "TEXT", false, 0, null, 1));
                j4.f fVar2 = new j4.f(InAppMessageEntity.IN_APP_MESSAGE_TABLE, hashMap, new HashSet(0), new HashSet(0));
                j4.f a11 = j4.f.a(iVar, InAppMessageEntity.IN_APP_MESSAGE_TABLE);
                if (!fVar2.equals(a11)) {
                    return new u.c(false, "in_app_message(com.forsale.app.datalayer.database.InAppMessageEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
                }
                return new u.c(true, null);
            }

            @Override // androidx.room.u.b
            public void onPostMigrate(i iVar) {
            }
        }, "6a20855aff1f00d0f974cf149aba6797", "5517506e89eb9c4da9a6ef59b1835a44")).a());
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
        hashMap.put(InAppMessageDao.class, InAppMessageDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.forsale.app.datalayer.database.InAppDatabase
    public InAppMessageDao inAppMessageDao() {
        InAppMessageDao inAppMessageDao;
        if (this._inAppMessageDao != null) {
            return this._inAppMessageDao;
        }
        synchronized (this) {
            if (this._inAppMessageDao == null) {
                this._inAppMessageDao = new InAppMessageDao_Impl(this);
            }
            inAppMessageDao = this._inAppMessageDao;
        }
        return inAppMessageDao;
    }
}
