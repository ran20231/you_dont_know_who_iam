package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.LanguageConverter;
import com.forsale.app.datalayer.database.StringListConverter;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.utils.Languages;
import com.leanplum.internal.Constants;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class UserDao_Impl implements UserDao {
    private final RoomDatabase __db;
    private final i<UserEntity> __insertionAdapterOfUserEntity;
    private final LanguageConverter __languageConverter = new LanguageConverter();
    private final StringListConverter __stringListConverter = new StringListConverter();

    public UserDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfUserEntity = new i<UserEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.UserDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `USER_TABLE` (`id`,`userId`,`allowFollow`,`email`,`firstName`,`freeAds`,`premiumAds`,`image`,`isEmailVerified`,`numberOfFollowers`,`numberOfFollowing`,`phone`,`language`,`memberSince`,`regionId`,`isFresh`,`isBlock`,`permissions`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, UserEntity userEntity) {
                mVar.d1(1, userEntity.getId());
                if (userEntity.getUserId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.d1(2, userEntity.getUserId().intValue());
                }
                if (userEntity.getAllowFollow() == null) {
                    mVar.u1(3);
                } else {
                    mVar.d1(3, userEntity.getAllowFollow().intValue());
                }
                if (userEntity.getEmail() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, userEntity.getEmail());
                }
                if (userEntity.getFirstName() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, userEntity.getFirstName());
                }
                if (userEntity.getFreeAds() == null) {
                    mVar.u1(6);
                } else {
                    mVar.S(6, userEntity.getFreeAds().floatValue());
                }
                if (userEntity.getPremiumAds() == null) {
                    mVar.u1(7);
                } else {
                    mVar.S(7, userEntity.getPremiumAds().floatValue());
                }
                if (userEntity.getImage() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, userEntity.getImage());
                }
                if (userEntity.isEmailVerified() == null) {
                    mVar.u1(9);
                } else {
                    mVar.d1(9, userEntity.isEmailVerified().intValue());
                }
                if (userEntity.getNumberOfFollowers() == null) {
                    mVar.u1(10);
                } else {
                    mVar.d1(10, userEntity.getNumberOfFollowers().intValue());
                }
                if (userEntity.getNumberOfFollowing() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, userEntity.getNumberOfFollowing().intValue());
                }
                if (userEntity.getPhone() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, userEntity.getPhone());
                }
                String languageConverter = UserDao_Impl.this.__languageConverter.toString(userEntity.getLanguage());
                if (languageConverter == null) {
                    mVar.u1(13);
                } else {
                    mVar.Q0(13, languageConverter);
                }
                if (userEntity.getMemberSince() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, userEntity.getMemberSince());
                }
                if (userEntity.getRegionId() == null) {
                    mVar.u1(15);
                } else {
                    mVar.d1(15, userEntity.getRegionId().intValue());
                }
                if (userEntity.isFresh() == null) {
                    mVar.u1(16);
                } else {
                    mVar.d1(16, userEntity.isFresh().intValue());
                }
                if (userEntity.isBlock() == null) {
                    mVar.u1(17);
                } else {
                    mVar.d1(17, userEntity.isBlock().intValue());
                }
                UserEntity.UserType userType = userEntity.getUserType();
                if (userType != null) {
                    String stringListConverter = UserDao_Impl.this.__stringListConverter.toString(userType.getPermissions());
                    if (stringListConverter == null) {
                        mVar.u1(18);
                        return;
                    } else {
                        mVar.Q0(18, stringListConverter);
                        return;
                    }
                }
                mVar.u1(18);
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.UserDao
    public Object getUser(zz.a<? super UserEntity> aVar) {
        final v i11 = v.i("SELECT * FROM  USER_TABLE", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<UserEntity>() { // from class: com.forsale.app.datalayer.repositories.UserDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserEntity call() throws Exception {
                UserEntity userEntity;
                String string;
                int i12;
                Integer valueOf;
                int i13;
                Integer valueOf2;
                int i14;
                UserEntity.UserType userType;
                Cursor c11 = j4.b.c(UserDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, Constants.Params.USER_ID);
                    int e13 = j4.a.e(c11, "allowFollow");
                    int e14 = j4.a.e(c11, "email");
                    int e15 = j4.a.e(c11, "firstName");
                    int e16 = j4.a.e(c11, "freeAds");
                    int e17 = j4.a.e(c11, "premiumAds");
                    int e18 = j4.a.e(c11, "image");
                    int e19 = j4.a.e(c11, "isEmailVerified");
                    int e21 = j4.a.e(c11, "numberOfFollowers");
                    int e22 = j4.a.e(c11, "numberOfFollowing");
                    int e23 = j4.a.e(c11, "phone");
                    int e24 = j4.a.e(c11, "language");
                    int e25 = j4.a.e(c11, "memberSince");
                    int e26 = j4.a.e(c11, "regionId");
                    int e27 = j4.a.e(c11, "isFresh");
                    int e28 = j4.a.e(c11, "isBlock");
                    int e29 = j4.a.e(c11, "permissions");
                    if (c11.moveToFirst()) {
                        int i15 = c11.getInt(e11);
                        Integer valueOf3 = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                        Integer valueOf4 = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                        String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                        Float valueOf5 = c11.isNull(e16) ? null : Float.valueOf(c11.getFloat(e16));
                        Float valueOf6 = c11.isNull(e17) ? null : Float.valueOf(c11.getFloat(e17));
                        String string4 = c11.isNull(e18) ? null : c11.getString(e18);
                        Integer valueOf7 = c11.isNull(e19) ? null : Integer.valueOf(c11.getInt(e19));
                        Integer valueOf8 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf9 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        Languages languages = UserDao_Impl.this.__languageConverter.toLanguages(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i12 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i12 = e26;
                        }
                        if (c11.isNull(i12)) {
                            i13 = e27;
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(c11.getInt(i12));
                            i13 = e27;
                        }
                        if (c11.isNull(i13)) {
                            i14 = e28;
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf(c11.getInt(i13));
                            i14 = e28;
                        }
                        Integer valueOf10 = c11.isNull(i14) ? null : Integer.valueOf(c11.getInt(i14));
                        if (c11.isNull(e29)) {
                            userType = null;
                        } else {
                            userType = new UserEntity.UserType(UserDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e29) ? null : c11.getString(e29)));
                        }
                        userEntity = new UserEntity(i15, valueOf3, valueOf4, string2, string3, valueOf5, valueOf6, string4, valueOf7, valueOf8, valueOf9, string5, languages, string, valueOf, valueOf2, valueOf10, userType);
                    } else {
                        userEntity = null;
                    }
                    return userEntity;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.UserDao
    public Flow<UserEntity> getUserAsFlow() {
        final v i11 = v.i("SELECT * FROM  USER_TABLE", 0);
        return CoroutinesRoom.a(this.__db, false, new String[]{"USER_TABLE"}, new Callable<UserEntity>() { // from class: com.forsale.app.datalayer.repositories.UserDao_Impl.4
            protected void finalize() {
                i11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserEntity call() throws Exception {
                UserEntity userEntity;
                String string;
                int i12;
                Integer valueOf;
                int i13;
                Integer valueOf2;
                int i14;
                UserEntity.UserType userType;
                Cursor c11 = j4.b.c(UserDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, Constants.Params.USER_ID);
                    int e13 = j4.a.e(c11, "allowFollow");
                    int e14 = j4.a.e(c11, "email");
                    int e15 = j4.a.e(c11, "firstName");
                    int e16 = j4.a.e(c11, "freeAds");
                    int e17 = j4.a.e(c11, "premiumAds");
                    int e18 = j4.a.e(c11, "image");
                    int e19 = j4.a.e(c11, "isEmailVerified");
                    int e21 = j4.a.e(c11, "numberOfFollowers");
                    int e22 = j4.a.e(c11, "numberOfFollowing");
                    int e23 = j4.a.e(c11, "phone");
                    int e24 = j4.a.e(c11, "language");
                    int e25 = j4.a.e(c11, "memberSince");
                    int e26 = j4.a.e(c11, "regionId");
                    int e27 = j4.a.e(c11, "isFresh");
                    int e28 = j4.a.e(c11, "isBlock");
                    int e29 = j4.a.e(c11, "permissions");
                    if (c11.moveToFirst()) {
                        int i15 = c11.getInt(e11);
                        Integer valueOf3 = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                        Integer valueOf4 = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        String string2 = c11.isNull(e14) ? null : c11.getString(e14);
                        String string3 = c11.isNull(e15) ? null : c11.getString(e15);
                        Float valueOf5 = c11.isNull(e16) ? null : Float.valueOf(c11.getFloat(e16));
                        Float valueOf6 = c11.isNull(e17) ? null : Float.valueOf(c11.getFloat(e17));
                        String string4 = c11.isNull(e18) ? null : c11.getString(e18);
                        Integer valueOf7 = c11.isNull(e19) ? null : Integer.valueOf(c11.getInt(e19));
                        Integer valueOf8 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf9 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        Languages languages = UserDao_Impl.this.__languageConverter.toLanguages(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i12 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i12 = e26;
                        }
                        if (c11.isNull(i12)) {
                            i13 = e27;
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(c11.getInt(i12));
                            i13 = e27;
                        }
                        if (c11.isNull(i13)) {
                            i14 = e28;
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf(c11.getInt(i13));
                            i14 = e28;
                        }
                        Integer valueOf10 = c11.isNull(i14) ? null : Integer.valueOf(c11.getInt(i14));
                        if (c11.isNull(e29)) {
                            userType = null;
                        } else {
                            userType = new UserEntity.UserType(UserDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e29) ? null : c11.getString(e29)));
                        }
                        userEntity = new UserEntity(i15, valueOf3, valueOf4, string2, string3, valueOf5, valueOf6, string4, valueOf7, valueOf8, valueOf9, string5, languages, string, valueOf, valueOf2, valueOf10, userType);
                    } else {
                        userEntity = null;
                    }
                    return userEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.UserDao
    public Object insertUser(final UserEntity userEntity, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.UserDao_Impl.2
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                UserDao_Impl.this.__db.beginTransaction();
                try {
                    UserDao_Impl.this.__insertionAdapterOfUserEntity.insert((i) userEntity);
                    UserDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    UserDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }
}
