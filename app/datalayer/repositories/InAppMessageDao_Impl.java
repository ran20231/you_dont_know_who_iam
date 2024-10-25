package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.InAppAction;
import com.forsale.app.datalayer.database.InAppActionConverter;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import com.forsale.app.datalayer.database.InAppTypeConverter;
import com.forsale.app.datalayer.database.IntegerListConverter;
import com.forsale.app.datalayer.database.NotificationTypesConverter;
import com.forsale.app.utils.NotificationTypes;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class InAppMessageDao_Impl implements InAppMessageDao {
    private final RoomDatabase __db;
    private final h<InAppMessageEntity> __deletionAdapterOfInAppMessageEntity;
    private final i<InAppMessageEntity> __insertionAdapterOfInAppMessageEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteExpiredInAppMessages;
    private final SharedSQLiteStatement __preparedStmtOfDeleteInAppMessageById;
    private final h<InAppMessageEntity> __updateAdapterOfInAppMessageEntity;
    private final InAppActionConverter __inAppActionConverter = new InAppActionConverter();
    private final NotificationTypesConverter __notificationTypesConverter = new NotificationTypesConverter();
    private final InAppTypeConverter __inAppTypeConverter = new InAppTypeConverter();
    private final IntegerListConverter __integerListConverter = new IntegerListConverter();

    public InAppMessageDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfInAppMessageEntity = new i<InAppMessageEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `in_app_message` (`id`,`action`,`cat_id`,`duration`,`expiry`,`image`,`item_id`,`notification_type`,`promote_animation`,`region_id`,`target_id`,`text`,`type`,`url`,`districts_ids`,`universal_link`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, InAppMessageEntity inAppMessageEntity) {
                mVar.d1(1, inAppMessageEntity.getId());
                String inAppActionConverter = InAppMessageDao_Impl.this.__inAppActionConverter.toString(inAppMessageEntity.getAction());
                if (inAppActionConverter == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, inAppActionConverter);
                }
                if (inAppMessageEntity.getCatId() == null) {
                    mVar.u1(3);
                } else {
                    mVar.d1(3, inAppMessageEntity.getCatId().intValue());
                }
                mVar.d1(4, inAppMessageEntity.getDuration());
                if (inAppMessageEntity.getExpiry() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, inAppMessageEntity.getExpiry());
                }
                if (inAppMessageEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, inAppMessageEntity.getImage());
                }
                if (inAppMessageEntity.getItemId() == null) {
                    mVar.u1(7);
                } else {
                    mVar.d1(7, inAppMessageEntity.getItemId().intValue());
                }
                String notificationTypesConverter = InAppMessageDao_Impl.this.__notificationTypesConverter.toString(inAppMessageEntity.getNotificationType());
                if (notificationTypesConverter == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, notificationTypesConverter);
                }
                if (inAppMessageEntity.getPromoteAnimation() == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, inAppMessageEntity.getPromoteAnimation());
                }
                if (inAppMessageEntity.getRegionId() == null) {
                    mVar.u1(10);
                } else {
                    mVar.d1(10, inAppMessageEntity.getRegionId().intValue());
                }
                if (inAppMessageEntity.getTargetId() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, inAppMessageEntity.getTargetId().intValue());
                }
                if (inAppMessageEntity.getText() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, inAppMessageEntity.getText());
                }
                String inAppTypeConverter = InAppMessageDao_Impl.this.__inAppTypeConverter.toString(inAppMessageEntity.getType());
                if (inAppTypeConverter == null) {
                    mVar.u1(13);
                } else {
                    mVar.Q0(13, inAppTypeConverter);
                }
                if (inAppMessageEntity.getUrl() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, inAppMessageEntity.getUrl());
                }
                String fromIntList = InAppMessageDao_Impl.this.__integerListConverter.fromIntList(inAppMessageEntity.getDistrictsIds());
                if (fromIntList == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, fromIntList);
                }
                if (inAppMessageEntity.getUniversalLink() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, inAppMessageEntity.getUniversalLink());
                }
            }
        };
        this.__deletionAdapterOfInAppMessageEntity = new h<InAppMessageEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `in_app_message` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, InAppMessageEntity inAppMessageEntity) {
                mVar.d1(1, inAppMessageEntity.getId());
            }
        };
        this.__updateAdapterOfInAppMessageEntity = new h<InAppMessageEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `in_app_message` SET `id` = ?,`action` = ?,`cat_id` = ?,`duration` = ?,`expiry` = ?,`image` = ?,`item_id` = ?,`notification_type` = ?,`promote_animation` = ?,`region_id` = ?,`target_id` = ?,`text` = ?,`type` = ?,`url` = ?,`districts_ids` = ?,`universal_link` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, InAppMessageEntity inAppMessageEntity) {
                mVar.d1(1, inAppMessageEntity.getId());
                String inAppActionConverter = InAppMessageDao_Impl.this.__inAppActionConverter.toString(inAppMessageEntity.getAction());
                if (inAppActionConverter == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, inAppActionConverter);
                }
                if (inAppMessageEntity.getCatId() == null) {
                    mVar.u1(3);
                } else {
                    mVar.d1(3, inAppMessageEntity.getCatId().intValue());
                }
                mVar.d1(4, inAppMessageEntity.getDuration());
                if (inAppMessageEntity.getExpiry() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, inAppMessageEntity.getExpiry());
                }
                if (inAppMessageEntity.getImage() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, inAppMessageEntity.getImage());
                }
                if (inAppMessageEntity.getItemId() == null) {
                    mVar.u1(7);
                } else {
                    mVar.d1(7, inAppMessageEntity.getItemId().intValue());
                }
                String notificationTypesConverter = InAppMessageDao_Impl.this.__notificationTypesConverter.toString(inAppMessageEntity.getNotificationType());
                if (notificationTypesConverter == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, notificationTypesConverter);
                }
                if (inAppMessageEntity.getPromoteAnimation() == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, inAppMessageEntity.getPromoteAnimation());
                }
                if (inAppMessageEntity.getRegionId() == null) {
                    mVar.u1(10);
                } else {
                    mVar.d1(10, inAppMessageEntity.getRegionId().intValue());
                }
                if (inAppMessageEntity.getTargetId() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, inAppMessageEntity.getTargetId().intValue());
                }
                if (inAppMessageEntity.getText() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, inAppMessageEntity.getText());
                }
                String inAppTypeConverter = InAppMessageDao_Impl.this.__inAppTypeConverter.toString(inAppMessageEntity.getType());
                if (inAppTypeConverter == null) {
                    mVar.u1(13);
                } else {
                    mVar.Q0(13, inAppTypeConverter);
                }
                if (inAppMessageEntity.getUrl() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, inAppMessageEntity.getUrl());
                }
                String fromIntList = InAppMessageDao_Impl.this.__integerListConverter.fromIntList(inAppMessageEntity.getDistrictsIds());
                if (fromIntList == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, fromIntList);
                }
                if (inAppMessageEntity.getUniversalLink() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, inAppMessageEntity.getUniversalLink());
                }
                mVar.d1(17, inAppMessageEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteInAppMessageById = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM in_app_message WHERE id == ?";
            }
        };
        this.__preparedStmtOfDeleteExpiredInAppMessages = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM in_app_message WHERE Datetime(expiry) <= Datetime(?)";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object deleteAllInAppMessages(final List<InAppMessageEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                InAppMessageDao_Impl.this.__db.beginTransaction();
                try {
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(InAppMessageDao_Impl.this.__deletionAdapterOfInAppMessageEntity.handleMultiple(list) + 0);
                } finally {
                    InAppMessageDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object deleteExpiredInAppMessages(final String str, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = InAppMessageDao_Impl.this.__preparedStmtOfDeleteExpiredInAppMessages.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.u1(1);
                } else {
                    acquire.Q0(1, str2);
                }
                try {
                    InAppMessageDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    InAppMessageDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    InAppMessageDao_Impl.this.__preparedStmtOfDeleteExpiredInAppMessages.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object deleteInAppMessage(final InAppMessageEntity inAppMessageEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                InAppMessageDao_Impl.this.__db.beginTransaction();
                try {
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(InAppMessageDao_Impl.this.__deletionAdapterOfInAppMessageEntity.handle(inAppMessageEntity) + 0);
                } finally {
                    InAppMessageDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object deleteInAppMessageById(final int i11, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = InAppMessageDao_Impl.this.__preparedStmtOfDeleteInAppMessageById.acquire();
                acquire.d1(1, i11);
                try {
                    InAppMessageDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    InAppMessageDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    InAppMessageDao_Impl.this.__preparedStmtOfDeleteInAppMessageById.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getAllInAppMessageSuspendedByTypeAndCat(InAppType inAppType, int i11, zz.a<? super List<InAppMessageEntity>> aVar) {
        final v i12 = v.i("SELECT * FROM  in_app_message WHERE type == ? AND cat_id == ?", 2);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i12.u1(1);
        } else {
            i12.Q0(1, inAppTypeConverter);
        }
        i12.d1(2, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<InAppMessageEntity>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.21
            @Override // java.util.concurrent.Callable
            public List<InAppMessageEntity> call() throws Exception {
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                String string4;
                int i15;
                int i16;
                String string5;
                int i17;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    int i18 = e24;
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        int i19 = c11.getInt(e11);
                        if (c11.isNull(e12)) {
                            i13 = e11;
                            string = null;
                        } else {
                            string = c11.getString(e12);
                            i13 = e11;
                        }
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(string);
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i21 = c11.getInt(e14);
                        String string6 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string7 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string8 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        if (c11.isNull(e23)) {
                            i14 = i18;
                            string2 = null;
                        } else {
                            string2 = c11.getString(e23);
                            i14 = i18;
                        }
                        if (c11.isNull(i14)) {
                            i18 = i14;
                            string3 = null;
                        } else {
                            string3 = c11.getString(i14);
                            i18 = i14;
                        }
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(string3);
                        int i22 = e25;
                        if (c11.isNull(i22)) {
                            i15 = e26;
                            string4 = null;
                        } else {
                            string4 = c11.getString(i22);
                            i15 = e26;
                        }
                        if (c11.isNull(i15)) {
                            i16 = i22;
                            i17 = e12;
                            string5 = null;
                        } else {
                            i16 = i22;
                            string5 = c11.getString(i15);
                            i17 = e12;
                        }
                        List<Integer> fromString = InAppMessageDao_Impl.this.__integerListConverter.fromString(string5);
                        int i23 = e27;
                        arrayList.add(new InAppMessageEntity(i19, inAppAction, valueOf, i21, string6, string7, valueOf2, inAppNotificationType, string8, valueOf3, valueOf4, string2, inAppType2, string4, fromString, c11.isNull(i23) ? null : c11.getString(i23)));
                        e27 = i23;
                        e12 = i17;
                        e25 = i16;
                        e11 = i13;
                        e26 = i15;
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public LiveData<List<InAppMessageEntity>> getAllInAppMessages() {
        final v i11 = v.i("SELECT * FROM  in_app_message", 0);
        return this.__db.getInvalidationTracker().e(new String[]{InAppMessageEntity.IN_APP_MESSAGE_TABLE}, false, new Callable<List<InAppMessageEntity>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.23
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<InAppMessageEntity> call() throws Exception {
                String string;
                int i12;
                String string2;
                int i13;
                String string3;
                String string4;
                int i14;
                int i15;
                String string5;
                int i16;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    int i17 = e24;
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        int i18 = c11.getInt(e11);
                        if (c11.isNull(e12)) {
                            i12 = e11;
                            string = null;
                        } else {
                            string = c11.getString(e12);
                            i12 = e11;
                        }
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(string);
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i19 = c11.getInt(e14);
                        String string6 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string7 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string8 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        if (c11.isNull(e23)) {
                            i13 = i17;
                            string2 = null;
                        } else {
                            string2 = c11.getString(e23);
                            i13 = i17;
                        }
                        if (c11.isNull(i13)) {
                            i17 = i13;
                            string3 = null;
                        } else {
                            string3 = c11.getString(i13);
                            i17 = i13;
                        }
                        InAppType inAppType = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(string3);
                        int i21 = e25;
                        if (c11.isNull(i21)) {
                            i14 = e26;
                            string4 = null;
                        } else {
                            string4 = c11.getString(i21);
                            i14 = e26;
                        }
                        if (c11.isNull(i14)) {
                            i15 = i21;
                            i16 = e12;
                            string5 = null;
                        } else {
                            i15 = i21;
                            string5 = c11.getString(i14);
                            i16 = e12;
                        }
                        List<Integer> fromString = InAppMessageDao_Impl.this.__integerListConverter.fromString(string5);
                        int i22 = e27;
                        arrayList.add(new InAppMessageEntity(i18, inAppAction, valueOf, i19, string6, string7, valueOf2, inAppNotificationType, string8, valueOf3, valueOf4, string2, inAppType, string4, fromString, c11.isNull(i22) ? null : c11.getString(i22)));
                        e27 = i22;
                        e12 = i16;
                        e25 = i15;
                        e11 = i12;
                        e26 = i14;
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getAllInAppMessagesSuspended(zz.a<? super List<InAppMessageEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  in_app_message", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<InAppMessageEntity>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.24
            @Override // java.util.concurrent.Callable
            public List<InAppMessageEntity> call() throws Exception {
                String string;
                int i12;
                String string2;
                int i13;
                String string3;
                String string4;
                int i14;
                int i15;
                String string5;
                int i16;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    int i17 = e24;
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        int i18 = c11.getInt(e11);
                        if (c11.isNull(e12)) {
                            i12 = e11;
                            string = null;
                        } else {
                            string = c11.getString(e12);
                            i12 = e11;
                        }
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(string);
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i19 = c11.getInt(e14);
                        String string6 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string7 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string8 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        if (c11.isNull(e23)) {
                            i13 = i17;
                            string2 = null;
                        } else {
                            string2 = c11.getString(e23);
                            i13 = i17;
                        }
                        if (c11.isNull(i13)) {
                            i17 = i13;
                            string3 = null;
                        } else {
                            string3 = c11.getString(i13);
                            i17 = i13;
                        }
                        InAppType inAppType = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(string3);
                        int i21 = e25;
                        if (c11.isNull(i21)) {
                            i14 = e26;
                            string4 = null;
                        } else {
                            string4 = c11.getString(i21);
                            i14 = e26;
                        }
                        if (c11.isNull(i14)) {
                            i15 = i21;
                            i16 = e12;
                            string5 = null;
                        } else {
                            i15 = i21;
                            string5 = c11.getString(i14);
                            i16 = e12;
                        }
                        List<Integer> fromString = InAppMessageDao_Impl.this.__integerListConverter.fromString(string5);
                        int i22 = e27;
                        arrayList.add(new InAppMessageEntity(i18, inAppAction, valueOf, i19, string6, string7, valueOf2, inAppNotificationType, string8, valueOf3, valueOf4, string2, inAppType, string4, fromString, c11.isNull(i22) ? null : c11.getString(i22)));
                        e27 = i22;
                        e12 = i16;
                        e25 = i15;
                        e11 = i12;
                        e26 = i14;
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getExpiredInAppMessages(String str, zz.a<? super List<InAppMessageEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM in_app_message WHERE Datetime(expiry) <= Datetime(?)", 1);
        if (str == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, str);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<InAppMessageEntity>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<InAppMessageEntity> call() throws Exception {
                String string;
                int i12;
                String string2;
                int i13;
                String string3;
                String string4;
                int i14;
                int i15;
                String string5;
                int i16;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    int i17 = e24;
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        int i18 = c11.getInt(e11);
                        if (c11.isNull(e12)) {
                            i12 = e11;
                            string = null;
                        } else {
                            string = c11.getString(e12);
                            i12 = e11;
                        }
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(string);
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i19 = c11.getInt(e14);
                        String string6 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string7 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string8 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        if (c11.isNull(e23)) {
                            i13 = i17;
                            string2 = null;
                        } else {
                            string2 = c11.getString(e23);
                            i13 = i17;
                        }
                        if (c11.isNull(i13)) {
                            i17 = i13;
                            string3 = null;
                        } else {
                            string3 = c11.getString(i13);
                            i17 = i13;
                        }
                        InAppType inAppType = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(string3);
                        int i21 = e25;
                        if (c11.isNull(i21)) {
                            i14 = e26;
                            string4 = null;
                        } else {
                            string4 = c11.getString(i21);
                            i14 = e26;
                        }
                        if (c11.isNull(i14)) {
                            i15 = i21;
                            i16 = e12;
                            string5 = null;
                        } else {
                            i15 = i21;
                            string5 = c11.getString(i14);
                            i16 = e12;
                        }
                        List<Integer> fromString = InAppMessageDao_Impl.this.__integerListConverter.fromString(string5);
                        int i22 = e27;
                        arrayList.add(new InAppMessageEntity(i18, inAppAction, valueOf, i19, string6, string7, valueOf2, inAppNotificationType, string8, valueOf3, valueOf4, string2, inAppType, string4, fromString, c11.isNull(i22) ? null : c11.getString(i22)));
                        e27 = i22;
                        e12 = i16;
                        e25 = i15;
                        e11 = i12;
                        e26 = i14;
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public LiveData<InAppMessageEntity> getInAppMessageById(int i11) {
        final v i12 = v.i("SELECT * FROM  in_app_message WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{InAppMessageEntity.IN_APP_MESSAGE_TABLE}, false, new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.14
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i13;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i14 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i15 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i13 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i13 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i14, inAppAction, valueOf, i15, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i13) ? null : c11.getString(i13)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public LiveData<InAppMessageEntity> getInAppMessageByType(InAppType inAppType) {
        final v i11 = v.i("SELECT * FROM  in_app_message WHERE type == ? LIMIT 1", 1);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, inAppTypeConverter);
        }
        return this.__db.getInvalidationTracker().e(new String[]{InAppMessageEntity.IN_APP_MESSAGE_TABLE}, false, new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.16
            protected void finalize() {
                i11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i12;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i14 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i12 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i12 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i13, inAppAction, valueOf, i14, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType2, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i12) ? null : c11.getString(i12)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public LiveData<InAppMessageEntity> getInAppMessageByTypeAndCategoryId(InAppType inAppType, int i11) {
        final v i12 = v.i("SELECT * FROM  in_app_message WHERE type == ? AND cat_id == ? LIMIT 1", 2);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i12.u1(1);
        } else {
            i12.Q0(1, inAppTypeConverter);
        }
        i12.d1(2, i11);
        return this.__db.getInvalidationTracker().e(new String[]{InAppMessageEntity.IN_APP_MESSAGE_TABLE}, false, new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.18
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i13;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i14 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i15 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i13 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i13 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i14, inAppAction, valueOf, i15, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType2, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i13) ? null : c11.getString(i13)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getInAppMessageSuspendedById(int i11, zz.a<? super InAppMessageEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  in_app_message WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i13;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i14 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i15 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i13 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i13 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i14, inAppAction, valueOf, i15, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i13) ? null : c11.getString(i13)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getInAppMessageSuspendedByType(InAppType inAppType, zz.a<? super InAppMessageEntity> aVar) {
        final v i11 = v.i("SELECT * FROM  in_app_message WHERE type == ? LIMIT 1", 1);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, inAppTypeConverter);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i12;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i13 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i14 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i12 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i12 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i13, inAppAction, valueOf, i14, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType2, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i12) ? null : c11.getString(i12)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getInAppMessageSuspendedByTypeAndCategoryId(InAppType inAppType, int i11, zz.a<? super InAppMessageEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  in_app_message WHERE type == ? AND cat_id == ? LIMIT 1", 2);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i12.u1(1);
        } else {
            i12.Q0(1, inAppTypeConverter);
        }
        i12.d1(2, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i13;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i14 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i15 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i13 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i13 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i14, inAppAction, valueOf, i15, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType2, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i13) ? null : c11.getString(i13)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object insertAllInAppMessages(final List<InAppMessageEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                InAppMessageDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = InAppMessageDao_Impl.this.__insertionAdapterOfInAppMessageEntity.insertAndReturnIdsList(list);
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    InAppMessageDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object insertInAppMessage(final InAppMessageEntity inAppMessageEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                InAppMessageDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(InAppMessageDao_Impl.this.__insertionAdapterOfInAppMessageEntity.insertAndReturnId(inAppMessageEntity));
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    InAppMessageDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object updateInAppMessage(final InAppMessageEntity inAppMessageEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                InAppMessageDao_Impl.this.__db.beginTransaction();
                try {
                    InAppMessageDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(InAppMessageDao_Impl.this.__updateAdapterOfInAppMessageEntity.handle(inAppMessageEntity) + 0);
                } finally {
                    InAppMessageDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getAllInAppMessageSuspendedByTypeAndCat(InAppType inAppType, List<Integer> list, zz.a<? super List<InAppMessageEntity>> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM  in_app_message WHERE type == ");
        b11.append("?");
        b11.append(" AND cat_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(")");
        final v i11 = v.i(b11.toString(), size + 1);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, inAppTypeConverter);
        }
        int i12 = 2;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<InAppMessageEntity>>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.22
            @Override // java.util.concurrent.Callable
            public List<InAppMessageEntity> call() throws Exception {
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                String string4;
                int i15;
                int i16;
                String string5;
                int i17;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    int i18 = e24;
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        int i19 = c11.getInt(e11);
                        if (c11.isNull(e12)) {
                            i13 = e11;
                            string = null;
                        } else {
                            string = c11.getString(e12);
                            i13 = e11;
                        }
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(string);
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i21 = c11.getInt(e14);
                        String string6 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string7 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string8 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        if (c11.isNull(e23)) {
                            i14 = i18;
                            string2 = null;
                        } else {
                            string2 = c11.getString(e23);
                            i14 = i18;
                        }
                        if (c11.isNull(i14)) {
                            i18 = i14;
                            string3 = null;
                        } else {
                            string3 = c11.getString(i14);
                            i18 = i14;
                        }
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(string3);
                        int i22 = e25;
                        if (c11.isNull(i22)) {
                            i15 = e26;
                            string4 = null;
                        } else {
                            string4 = c11.getString(i22);
                            i15 = e26;
                        }
                        if (c11.isNull(i15)) {
                            i16 = i22;
                            i17 = e12;
                            string5 = null;
                        } else {
                            i16 = i22;
                            string5 = c11.getString(i15);
                            i17 = e12;
                        }
                        List<Integer> fromString = InAppMessageDao_Impl.this.__integerListConverter.fromString(string5);
                        int i23 = e27;
                        arrayList.add(new InAppMessageEntity(i19, inAppAction, valueOf, i21, string6, string7, valueOf2, inAppNotificationType, string8, valueOf3, valueOf4, string2, inAppType2, string4, fromString, c11.isNull(i23) ? null : c11.getString(i23)));
                        e27 = i23;
                        e12 = i17;
                        e25 = i16;
                        e11 = i13;
                        e26 = i15;
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.InAppMessageDao
    public Object getInAppMessageSuspendedByTypeAndCategoryId(InAppType inAppType, List<Integer> list, zz.a<? super InAppMessageEntity> aVar) {
        StringBuilder b11 = e.b();
        b11.append("SELECT * FROM  in_app_message WHERE type == ");
        b11.append("?");
        b11.append(" AND cat_id in (");
        int size = list.size();
        e.a(b11, size);
        b11.append(") LIMIT 1");
        final v i11 = v.i(b11.toString(), size + 1);
        String inAppTypeConverter = this.__inAppTypeConverter.toString(inAppType);
        if (inAppTypeConverter == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, inAppTypeConverter);
        }
        int i12 = 2;
        for (Integer num : list) {
            if (num == null) {
                i11.u1(i12);
            } else {
                i11.d1(i12, num.intValue());
            }
            i12++;
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<InAppMessageEntity>() { // from class: com.forsale.app.datalayer.repositories.InAppMessageDao_Impl.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public InAppMessageEntity call() throws Exception {
                InAppMessageEntity inAppMessageEntity;
                String string;
                int i13;
                Cursor c11 = j4.b.c(InAppMessageDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "action");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "duration");
                    int e15 = j4.a.e(c11, InAppMessageEntity.EXPIRY);
                    int e16 = j4.a.e(c11, "image");
                    int e17 = j4.a.e(c11, InAppMessageEntity.ITEM_ID);
                    int e18 = j4.a.e(c11, InAppMessageEntity.NOTIFICATION_TYPE);
                    int e19 = j4.a.e(c11, "promote_animation");
                    int e21 = j4.a.e(c11, "region_id");
                    int e22 = j4.a.e(c11, InAppMessageEntity.TARGET_ID);
                    int e23 = j4.a.e(c11, "text");
                    int e24 = j4.a.e(c11, "type");
                    int e25 = j4.a.e(c11, "url");
                    int e26 = j4.a.e(c11, "districts_ids");
                    int e27 = j4.a.e(c11, "universal_link");
                    if (c11.moveToFirst()) {
                        int i14 = c11.getInt(e11);
                        InAppAction inAppAction = InAppMessageDao_Impl.this.__inAppActionConverter.toInAppAction(c11.isNull(e12) ? null : c11.getString(e12));
                        Integer valueOf = c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13));
                        int i15 = c11.getInt(e14);
                        String string2 = c11.isNull(e15) ? null : c11.getString(e15);
                        String string3 = c11.isNull(e16) ? null : c11.getString(e16);
                        Integer valueOf2 = c11.isNull(e17) ? null : Integer.valueOf(c11.getInt(e17));
                        NotificationTypes inAppNotificationType = InAppMessageDao_Impl.this.__notificationTypesConverter.toInAppNotificationType(c11.isNull(e18) ? null : c11.getString(e18));
                        String string4 = c11.isNull(e19) ? null : c11.getString(e19);
                        Integer valueOf3 = c11.isNull(e21) ? null : Integer.valueOf(c11.getInt(e21));
                        Integer valueOf4 = c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22));
                        String string5 = c11.isNull(e23) ? null : c11.getString(e23);
                        InAppType inAppType2 = InAppMessageDao_Impl.this.__inAppTypeConverter.toInAppType(c11.isNull(e24) ? null : c11.getString(e24));
                        if (c11.isNull(e25)) {
                            i13 = e26;
                            string = null;
                        } else {
                            string = c11.getString(e25);
                            i13 = e26;
                        }
                        inAppMessageEntity = new InAppMessageEntity(i14, inAppAction, valueOf, i15, string2, string3, valueOf2, inAppNotificationType, string4, valueOf3, valueOf4, string5, inAppType2, string, InAppMessageDao_Impl.this.__integerListConverter.fromString(c11.isNull(i13) ? null : c11.getString(i13)), c11.isNull(e27) ? null : c11.getString(e27));
                    } else {
                        inAppMessageEntity = null;
                    }
                    return inAppMessageEntity;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }
}
