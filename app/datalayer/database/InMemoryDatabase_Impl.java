package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import androidx.room.f;
import androidx.room.n;
import androidx.room.u;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import com.forsale.app.datalayer.repositories.FollowUserDao;
import com.forsale.app.datalayer.repositories.FollowUserDao_Impl;
import com.forsale.app.datalayer.repositories.SessionDao;
import com.forsale.app.datalayer.repositories.SessionDao_Impl;
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
import tv.teads.sdk.TeadsMediationSettings;
/* loaded from: classes2.dex */
public final class InMemoryDatabase_Impl extends InMemoryDatabase {
    private volatile FollowUserDao _followUserDao;
    private volatile SessionDao _sessionDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        i k12 = super.getOpenHelper().k1();
        try {
            super.beginTransaction();
            k12.M("DELETE FROM `session_table`");
            k12.M("DELETE FROM `follow_user`");
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
        return new n(this, new HashMap(0), new HashMap(0), SessionEntity.SESSION_TABLE, FollowResponse.User.FOLLOW_USER_TABLE_NAME);
    }

    @Override // androidx.room.RoomDatabase
    protected j createOpenHelper(f fVar) {
        return fVar.f14982c.a(j.b.a(fVar.f14980a).c(fVar.f14981b).b(new u(fVar, new u.b(6) { // from class: com.forsale.app.datalayer.database.InMemoryDatabase_Impl.1
            @Override // androidx.room.u.b
            public void createAllTables(i iVar) {
                iVar.M("CREATE TABLE IF NOT EXISTS `session_table` (`id` INTEGER NOT NULL, `appStatus` TEXT, `sessionStatus` TEXT NOT NULL, `version` TEXT, `rankedVerticalId` INTEGER, `landingPage` TEXT, `imageUrl` TEXT, `timeout` INTEGER, `contactNumbers` TEXT, `nameAr` TEXT, `nameEn` TEXT, `allowBannerNotifications` INTEGER, `allowFollow` INTEGER, `dob` TEXT, `email` TEXT, `firstName` TEXT, `freeAds` REAL, `gender` TEXT, `image` TEXT, `isEmailVerified` INTEGER, `lastName` TEXT, `locationLat` REAL, `locationLon` REAL, `numberOfFollowers` INTEGER, `numberOfFollowing` INTEGER, `phone` TEXT, `pointsActive` INTEGER, `pointsLifetime` INTEGER, `premiumAds` REAL, `language` TEXT, `memberSince` TEXT, `regionId` INTEGER, `isFresh` INTEGER, `userId` INTEGER, `status` TEXT, `body` TEXT, `to` TEXT, PRIMARY KEY(`id`))");
                iVar.M("CREATE TABLE IF NOT EXISTS `follow_user` (`allowFollow` INTEGER NOT NULL, `followerId` TEXT, `user_server_id` TEXT NOT NULL, `user_local_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `image` TEXT, `is_following` INTEGER NOT NULL, `lastUploadDate` TEXT, `name` TEXT, `phone` TEXT, `regionId` TEXT, `status` TEXT, `pageName` INTEGER NOT NULL)");
                iVar.M("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                iVar.M("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'adc1523c3bd42b3264a6508460e14b2c')");
            }

            @Override // androidx.room.u.b
            public void dropAllTables(i iVar) {
                iVar.M("DROP TABLE IF EXISTS `session_table`");
                iVar.M("DROP TABLE IF EXISTS `follow_user`");
                List<RoomDatabase.b> list = ((RoomDatabase) InMemoryDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.b(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onCreate(i iVar) {
                List<RoomDatabase.b> list = ((RoomDatabase) InMemoryDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    for (RoomDatabase.b bVar : list) {
                        bVar.a(iVar);
                    }
                }
            }

            @Override // androidx.room.u.b
            public void onOpen(i iVar) {
                ((RoomDatabase) InMemoryDatabase_Impl.this).mDatabase = iVar;
                InMemoryDatabase_Impl.this.internalInitInvalidationTracker(iVar);
                List<RoomDatabase.b> list = ((RoomDatabase) InMemoryDatabase_Impl.this).mCallbacks;
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
                hashMap.put("appStatus", new f.a("appStatus", "TEXT", false, 0, null, 1));
                hashMap.put("sessionStatus", new f.a("sessionStatus", "TEXT", true, 0, null, 1));
                hashMap.put(TeadsMediationSettings.MEDIATION_VERSION_KEY, new f.a(TeadsMediationSettings.MEDIATION_VERSION_KEY, "TEXT", false, 0, null, 1));
                hashMap.put("rankedVerticalId", new f.a("rankedVerticalId", "INTEGER", false, 0, null, 1));
                hashMap.put("landingPage", new f.a("landingPage", "TEXT", false, 0, null, 1));
                hashMap.put("imageUrl", new f.a("imageUrl", "TEXT", false, 0, null, 1));
                hashMap.put("timeout", new f.a("timeout", "INTEGER", false, 0, null, 1));
                hashMap.put("contactNumbers", new f.a("contactNumbers", "TEXT", false, 0, null, 1));
                hashMap.put("nameAr", new f.a("nameAr", "TEXT", false, 0, null, 1));
                hashMap.put("nameEn", new f.a("nameEn", "TEXT", false, 0, null, 1));
                hashMap.put("allowBannerNotifications", new f.a("allowBannerNotifications", "INTEGER", false, 0, null, 1));
                hashMap.put("allowFollow", new f.a("allowFollow", "INTEGER", false, 0, null, 1));
                hashMap.put("dob", new f.a("dob", "TEXT", false, 0, null, 1));
                hashMap.put("email", new f.a("email", "TEXT", false, 0, null, 1));
                hashMap.put("firstName", new f.a("firstName", "TEXT", false, 0, null, 1));
                hashMap.put("freeAds", new f.a("freeAds", "REAL", false, 0, null, 1));
                hashMap.put("gender", new f.a("gender", "TEXT", false, 0, null, 1));
                hashMap.put("image", new f.a("image", "TEXT", false, 0, null, 1));
                hashMap.put("isEmailVerified", new f.a("isEmailVerified", "INTEGER", false, 0, null, 1));
                hashMap.put("lastName", new f.a("lastName", "TEXT", false, 0, null, 1));
                hashMap.put("locationLat", new f.a("locationLat", "REAL", false, 0, null, 1));
                hashMap.put("locationLon", new f.a("locationLon", "REAL", false, 0, null, 1));
                hashMap.put("numberOfFollowers", new f.a("numberOfFollowers", "INTEGER", false, 0, null, 1));
                hashMap.put("numberOfFollowing", new f.a("numberOfFollowing", "INTEGER", false, 0, null, 1));
                hashMap.put("phone", new f.a("phone", "TEXT", false, 0, null, 1));
                hashMap.put("pointsActive", new f.a("pointsActive", "INTEGER", false, 0, null, 1));
                hashMap.put("pointsLifetime", new f.a("pointsLifetime", "INTEGER", false, 0, null, 1));
                hashMap.put("premiumAds", new f.a("premiumAds", "REAL", false, 0, null, 1));
                hashMap.put("language", new f.a("language", "TEXT", false, 0, null, 1));
                hashMap.put("memberSince", new f.a("memberSince", "TEXT", false, 0, null, 1));
                hashMap.put("regionId", new f.a("regionId", "INTEGER", false, 0, null, 1));
                hashMap.put("isFresh", new f.a("isFresh", "INTEGER", false, 0, null, 1));
                hashMap.put(Constants.Params.USER_ID, new f.a(Constants.Params.USER_ID, "INTEGER", false, 0, null, 1));
                hashMap.put(MessageKt.STATUS, new f.a(MessageKt.STATUS, "TEXT", false, 0, null, 1));
                hashMap.put("body", new f.a("body", "TEXT", false, 0, null, 1));
                hashMap.put("to", new f.a("to", "TEXT", false, 0, null, 1));
                j4.f fVar2 = new j4.f(SessionEntity.SESSION_TABLE, hashMap, new HashSet(0), new HashSet(0));
                j4.f a11 = j4.f.a(iVar, SessionEntity.SESSION_TABLE);
                if (!fVar2.equals(a11)) {
                    return new u.c(false, "session_table(com.forsale.app.datalayer.network.entities.SessionEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap2 = new HashMap(12);
                hashMap2.put("allowFollow", new f.a("allowFollow", "INTEGER", true, 0, null, 1));
                hashMap2.put("followerId", new f.a("followerId", "TEXT", false, 0, null, 1));
                hashMap2.put(FollowResponse.User.USER_SERVER_ID, new f.a(FollowResponse.User.USER_SERVER_ID, "TEXT", true, 0, null, 1));
                hashMap2.put(FollowResponse.User.USER_LOCAL_ID, new f.a(FollowResponse.User.USER_LOCAL_ID, "INTEGER", true, 1, null, 1));
                hashMap2.put("image", new f.a("image", "TEXT", false, 0, null, 1));
                hashMap2.put(FollowResponse.User.IS_FOLLOWING, new f.a(FollowResponse.User.IS_FOLLOWING, "INTEGER", true, 0, null, 1));
                hashMap2.put("lastUploadDate", new f.a("lastUploadDate", "TEXT", false, 0, null, 1));
                hashMap2.put("name", new f.a("name", "TEXT", false, 0, null, 1));
                hashMap2.put("phone", new f.a("phone", "TEXT", false, 0, null, 1));
                hashMap2.put("regionId", new f.a("regionId", "TEXT", false, 0, null, 1));
                hashMap2.put(MessageKt.STATUS, new f.a(MessageKt.STATUS, "TEXT", false, 0, null, 1));
                hashMap2.put("pageName", new f.a("pageName", "INTEGER", true, 0, null, 1));
                j4.f fVar3 = new j4.f(FollowResponse.User.FOLLOW_USER_TABLE_NAME, hashMap2, new HashSet(0), new HashSet(0));
                j4.f a12 = j4.f.a(iVar, FollowResponse.User.FOLLOW_USER_TABLE_NAME);
                if (!fVar3.equals(a12)) {
                    return new u.c(false, "follow_user(com.forsale.app.datalayer.network.responses.FollowResponse.User).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
                }
                return new u.c(true, null);
            }

            @Override // androidx.room.u.b
            public void onPostMigrate(i iVar) {
            }
        }, "adc1523c3bd42b3264a6508460e14b2c", "f623f947d01b889e5d4ea856ad959a7c")).a());
    }

    @Override // com.forsale.app.datalayer.database.InMemoryDatabase
    public FollowUserDao followUserDao() {
        FollowUserDao followUserDao;
        if (this._followUserDao != null) {
            return this._followUserDao;
        }
        synchronized (this) {
            if (this._followUserDao == null) {
                this._followUserDao = new FollowUserDao_Impl(this);
            }
            followUserDao = this._followUserDao;
        }
        return followUserDao;
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
        hashMap.put(SessionDao.class, SessionDao_Impl.getRequiredConverters());
        hashMap.put(FollowUserDao.class, FollowUserDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.forsale.app.datalayer.database.InMemoryDatabase
    public SessionDao sessionDao() {
        SessionDao sessionDao;
        if (this._sessionDao != null) {
            return this._sessionDao;
        }
        synchronized (this) {
            if (this._sessionDao == null) {
                this._sessionDao = new SessionDao_Impl(this);
            }
            sessionDao = this._sessionDao;
        }
        return sessionDao;
    }
}
