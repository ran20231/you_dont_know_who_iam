package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import falcon.chat.entities.MessageKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class FollowUserDao_Impl implements FollowUserDao {
    private final RoomDatabase __db;
    private final h<FollowResponse.User> __deletionAdapterOfUser;
    private final i<FollowResponse.User> __insertionAdapterOfUser;
    private final SharedSQLiteStatement __preparedStmtOfClearAllUsers;
    private final SharedSQLiteStatement __preparedStmtOfUpdateFollow;

    public FollowUserDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfUser = new i<FollowResponse.User>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `follow_user` (`allowFollow`,`followerId`,`user_server_id`,`user_local_id`,`image`,`is_following`,`lastUploadDate`,`name`,`phone`,`regionId`,`status`,`pageName`) VALUES (?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, FollowResponse.User user) {
                mVar.d1(1, user.getAllowFollow());
                if (user.getFollowerId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, user.getFollowerId());
                }
                if (user.getId() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, user.getId());
                }
                mVar.d1(4, user.getLocalId());
                if (user.getImage() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, user.getImage());
                }
                mVar.d1(6, user.isFollowing());
                if (user.getLastUploadDate() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, user.getLastUploadDate());
                }
                if (user.getName() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, user.getName());
                }
                if (user.getPhone() == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, user.getPhone());
                }
                if (user.getRegionId() == null) {
                    mVar.u1(10);
                } else {
                    mVar.Q0(10, user.getRegionId());
                }
                if (user.getStatus() == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, user.getStatus());
                }
                mVar.d1(12, user.getPageNumber());
            }
        };
        this.__deletionAdapterOfUser = new h<FollowResponse.User>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `follow_user` WHERE `user_local_id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, FollowResponse.User user) {
                mVar.d1(1, user.getLocalId());
            }
        };
        this.__preparedStmtOfClearAllUsers = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE  FROM follow_user";
            }
        };
        this.__preparedStmtOfUpdateFollow = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE follow_user SET is_following=? WHERE phone==?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.FollowUserDao
    public DataSource.Factory<Integer, FollowResponse.User> allUsers() {
        final v i11 = v.i("SELECT * FROM follow_user", 0);
        return new DataSource.Factory<Integer, FollowResponse.User>() { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.9
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, FollowResponse.User> create() {
                return new androidx.room.paging.a<FollowResponse.User>(FollowUserDao_Impl.this.__db, i11, false, true, FollowResponse.User.FOLLOW_USER_TABLE_NAME) { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.9.1
                    @Override // androidx.room.paging.a
                    protected List<FollowResponse.User> convertRows(Cursor cursor) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        String string5;
                        String string6;
                        String string7;
                        String string8;
                        int e11 = j4.a.e(cursor, "allowFollow");
                        int e12 = j4.a.e(cursor, "followerId");
                        int e13 = j4.a.e(cursor, FollowResponse.User.USER_SERVER_ID);
                        int e14 = j4.a.e(cursor, FollowResponse.User.USER_LOCAL_ID);
                        int e15 = j4.a.e(cursor, "image");
                        int e16 = j4.a.e(cursor, FollowResponse.User.IS_FOLLOWING);
                        int e17 = j4.a.e(cursor, "lastUploadDate");
                        int e18 = j4.a.e(cursor, "name");
                        int e19 = j4.a.e(cursor, "phone");
                        int e21 = j4.a.e(cursor, "regionId");
                        int e22 = j4.a.e(cursor, MessageKt.STATUS);
                        int e23 = j4.a.e(cursor, "pageName");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            int i12 = cursor.getInt(e11);
                            if (cursor.isNull(e12)) {
                                string = null;
                            } else {
                                string = cursor.getString(e12);
                            }
                            if (cursor.isNull(e13)) {
                                string2 = null;
                            } else {
                                string2 = cursor.getString(e13);
                            }
                            long j11 = cursor.getLong(e14);
                            if (cursor.isNull(e15)) {
                                string3 = null;
                            } else {
                                string3 = cursor.getString(e15);
                            }
                            int i13 = cursor.getInt(e16);
                            if (cursor.isNull(e17)) {
                                string4 = null;
                            } else {
                                string4 = cursor.getString(e17);
                            }
                            if (cursor.isNull(e18)) {
                                string5 = null;
                            } else {
                                string5 = cursor.getString(e18);
                            }
                            if (cursor.isNull(e19)) {
                                string6 = null;
                            } else {
                                string6 = cursor.getString(e19);
                            }
                            if (cursor.isNull(e21)) {
                                string7 = null;
                            } else {
                                string7 = cursor.getString(e21);
                            }
                            if (cursor.isNull(e22)) {
                                string8 = null;
                            } else {
                                string8 = cursor.getString(e22);
                            }
                            FollowResponse.User user = new FollowResponse.User(i12, string, string2, j11, string3, i13, string4, string5, string6, string7, string8);
                            user.setPageNumber(cursor.getInt(e23));
                            arrayList.add(user);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }

    @Override // com.forsale.app.datalayer.repositories.FollowUserDao
    public Object clearAllUsers(zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.7
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = FollowUserDao_Impl.this.__preparedStmtOfClearAllUsers.acquire();
                try {
                    FollowUserDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    FollowUserDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    FollowUserDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    FollowUserDao_Impl.this.__preparedStmtOfClearAllUsers.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.FollowUserDao
    public Object deleteUser(final FollowResponse.User user, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.6
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                FollowUserDao_Impl.this.__db.beginTransaction();
                try {
                    FollowUserDao_Impl.this.__deletionAdapterOfUser.handle(user);
                    FollowUserDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    FollowUserDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.FollowUserDao
    public Object insertUsers(final FollowResponse.User[] userArr, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                FollowUserDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = FollowUserDao_Impl.this.__insertionAdapterOfUser.insertAndReturnIdsList(userArr);
                    FollowUserDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    FollowUserDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.FollowUserDao
    public Object updateFollow(final String str, final int i11, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.FollowUserDao_Impl.8
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = FollowUserDao_Impl.this.__preparedStmtOfUpdateFollow.acquire();
                acquire.d1(1, i11);
                String str2 = str;
                if (str2 == null) {
                    acquire.u1(2);
                } else {
                    acquire.Q0(2, str2);
                }
                try {
                    FollowUserDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    FollowUserDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    FollowUserDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    FollowUserDao_Impl.this.__preparedStmtOfUpdateFollow.release(acquire);
                }
            }
        }, aVar);
    }
}
