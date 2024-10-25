package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.RegionEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
/* loaded from: classes2.dex */
public final class RegionDao_Impl implements RegionDao {
    private final RoomDatabase __db;
    private final h<RegionEntity> __deletionAdapterOfRegionEntity;
    private final i<RegionEntity> __insertionAdapterOfRegionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllRegions;
    private final h<RegionEntity> __updateAdapterOfRegionEntity;

    public RegionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfRegionEntity = new i<RegionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `regions` (`id`,`main_district_id`,`name_en`,`name_ar`,`region_code_en`,`region_code_ar`,`phone_prefix`,`utc_diff`,`allow_messaging`,`allow_guest_messaging`,`contact_data`,`contact_email`,`profile_not_complete_message_en`,`email_not_verified_message_en`,`profile_not_complete_message_ar`,`email_not_verified_message_ar`,`support_message_en`,`support_message_ar`,`address_en`,`address_ar`,`min_points_for_redemption`,`amount_per_redemption`,`points_per_paid_amount`,`point_levels`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, RegionEntity regionEntity) {
                mVar.d1(1, regionEntity.getId());
                if (regionEntity.getMainDistrictId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.d1(2, regionEntity.getMainDistrictId().intValue());
                }
                if (regionEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, regionEntity.getNameEn());
                }
                if (regionEntity.getNameAr() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, regionEntity.getNameAr());
                }
                if (regionEntity.getRegionCodeEn() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, regionEntity.getRegionCodeEn());
                }
                if (regionEntity.getRegionCodeAr() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, regionEntity.getRegionCodeAr());
                }
                if (regionEntity.getPhonePrefix() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, regionEntity.getPhonePrefix());
                }
                if (regionEntity.getUtcDiff() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, regionEntity.getUtcDiff());
                }
                mVar.d1(9, regionEntity.getAllowMessaging());
                mVar.d1(10, regionEntity.getAllowGuestMessaging());
                if (regionEntity.getContactDataString() == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, regionEntity.getContactDataString());
                }
                if (regionEntity.getContactEmail() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, regionEntity.getContactEmail());
                }
                if (regionEntity.getProfileNotCompleteMessageEn() == null) {
                    mVar.u1(13);
                } else {
                    mVar.Q0(13, regionEntity.getProfileNotCompleteMessageEn());
                }
                if (regionEntity.getEmailNotVerifiedMessageEn() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, regionEntity.getEmailNotVerifiedMessageEn());
                }
                if (regionEntity.getProfileNotCompleteMessageAr() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, regionEntity.getProfileNotCompleteMessageAr());
                }
                if (regionEntity.getEmailNotVerifiedMessageAr() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, regionEntity.getEmailNotVerifiedMessageAr());
                }
                if (regionEntity.getSupportMessageEn() == null) {
                    mVar.u1(17);
                } else {
                    mVar.Q0(17, regionEntity.getSupportMessageEn());
                }
                if (regionEntity.getSupportMessageAr() == null) {
                    mVar.u1(18);
                } else {
                    mVar.Q0(18, regionEntity.getSupportMessageAr());
                }
                if (regionEntity.getAddressEn() == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, regionEntity.getAddressEn());
                }
                if (regionEntity.getAddressAr() == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, regionEntity.getAddressAr());
                }
                mVar.S(21, regionEntity.getMinPointsForRedemption());
                mVar.S(22, regionEntity.getAmountPerRedemption());
                mVar.S(23, regionEntity.getPointsPerPaidAmount());
                if (regionEntity.getPointLevelsString() == null) {
                    mVar.u1(24);
                } else {
                    mVar.Q0(24, regionEntity.getPointLevelsString());
                }
            }
        };
        this.__deletionAdapterOfRegionEntity = new h<RegionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `regions` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, RegionEntity regionEntity) {
                mVar.d1(1, regionEntity.getId());
            }
        };
        this.__updateAdapterOfRegionEntity = new h<RegionEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `regions` SET `id` = ?,`main_district_id` = ?,`name_en` = ?,`name_ar` = ?,`region_code_en` = ?,`region_code_ar` = ?,`phone_prefix` = ?,`utc_diff` = ?,`allow_messaging` = ?,`allow_guest_messaging` = ?,`contact_data` = ?,`contact_email` = ?,`profile_not_complete_message_en` = ?,`email_not_verified_message_en` = ?,`profile_not_complete_message_ar` = ?,`email_not_verified_message_ar` = ?,`support_message_en` = ?,`support_message_ar` = ?,`address_en` = ?,`address_ar` = ?,`min_points_for_redemption` = ?,`amount_per_redemption` = ?,`points_per_paid_amount` = ?,`point_levels` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, RegionEntity regionEntity) {
                mVar.d1(1, regionEntity.getId());
                if (regionEntity.getMainDistrictId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.d1(2, regionEntity.getMainDistrictId().intValue());
                }
                if (regionEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, regionEntity.getNameEn());
                }
                if (regionEntity.getNameAr() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, regionEntity.getNameAr());
                }
                if (regionEntity.getRegionCodeEn() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, regionEntity.getRegionCodeEn());
                }
                if (regionEntity.getRegionCodeAr() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, regionEntity.getRegionCodeAr());
                }
                if (regionEntity.getPhonePrefix() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, regionEntity.getPhonePrefix());
                }
                if (regionEntity.getUtcDiff() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, regionEntity.getUtcDiff());
                }
                mVar.d1(9, regionEntity.getAllowMessaging());
                mVar.d1(10, regionEntity.getAllowGuestMessaging());
                if (regionEntity.getContactDataString() == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, regionEntity.getContactDataString());
                }
                if (regionEntity.getContactEmail() == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, regionEntity.getContactEmail());
                }
                if (regionEntity.getProfileNotCompleteMessageEn() == null) {
                    mVar.u1(13);
                } else {
                    mVar.Q0(13, regionEntity.getProfileNotCompleteMessageEn());
                }
                if (regionEntity.getEmailNotVerifiedMessageEn() == null) {
                    mVar.u1(14);
                } else {
                    mVar.Q0(14, regionEntity.getEmailNotVerifiedMessageEn());
                }
                if (regionEntity.getProfileNotCompleteMessageAr() == null) {
                    mVar.u1(15);
                } else {
                    mVar.Q0(15, regionEntity.getProfileNotCompleteMessageAr());
                }
                if (regionEntity.getEmailNotVerifiedMessageAr() == null) {
                    mVar.u1(16);
                } else {
                    mVar.Q0(16, regionEntity.getEmailNotVerifiedMessageAr());
                }
                if (regionEntity.getSupportMessageEn() == null) {
                    mVar.u1(17);
                } else {
                    mVar.Q0(17, regionEntity.getSupportMessageEn());
                }
                if (regionEntity.getSupportMessageAr() == null) {
                    mVar.u1(18);
                } else {
                    mVar.Q0(18, regionEntity.getSupportMessageAr());
                }
                if (regionEntity.getAddressEn() == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, regionEntity.getAddressEn());
                }
                if (regionEntity.getAddressAr() == null) {
                    mVar.u1(20);
                } else {
                    mVar.Q0(20, regionEntity.getAddressAr());
                }
                mVar.S(21, regionEntity.getMinPointsForRedemption());
                mVar.S(22, regionEntity.getAmountPerRedemption());
                mVar.S(23, regionEntity.getPointsPerPaidAmount());
                if (regionEntity.getPointLevelsString() == null) {
                    mVar.u1(24);
                } else {
                    mVar.Q0(24, regionEntity.getPointLevelsString());
                }
                mVar.d1(25, regionEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllRegions = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM regions";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object deleteAllRegions(final List<RegionEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(RegionDao_Impl.this.__deletionAdapterOfRegionEntity.handleMultiple(list) + 0);
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object deleteRegion(final RegionEntity regionEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(RegionDao_Impl.this.__deletionAdapterOfRegionEntity.handle(regionEntity) + 0);
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public LiveData<List<RegionEntity>> getAllRegions() {
        final v i11 = v.i("SELECT * FROM  regions", 0);
        return this.__db.getInvalidationTracker().e(new String[]{"regions"}, true, new Callable<List<RegionEntity>>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.15
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<RegionEntity> call() throws Exception {
                String string;
                int i12;
                String string2;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i11, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                            int e13 = j4.a.e(c11, "name_en");
                            int e14 = j4.a.e(c11, "name_ar");
                            int e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                            int e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                            int e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                            int e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                            int e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                            int e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                            int e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                            int e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                            int e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                            int e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                            try {
                                int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                                int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                                int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                                int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                                int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                                int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                                int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                                int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                                int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                                int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                                int i13 = e25;
                                ArrayList arrayList = new ArrayList(c11.getCount());
                                while (c11.moveToNext()) {
                                    int i14 = c11.getInt(e11);
                                    Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string4 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string5 = c11.isNull(e15) ? null : c11.getString(e15);
                                    String string6 = c11.isNull(e16) ? null : c11.getString(e16);
                                    String string7 = c11.isNull(e17) ? null : c11.getString(e17);
                                    String string8 = c11.isNull(e18) ? null : c11.getString(e18);
                                    int i15 = c11.getInt(e19);
                                    int i16 = c11.getInt(e21);
                                    String string9 = c11.isNull(e22) ? null : c11.getString(e22);
                                    String string10 = c11.isNull(e23) ? null : c11.getString(e23);
                                    if (c11.isNull(e24)) {
                                        i12 = i13;
                                        string = null;
                                    } else {
                                        string = c11.getString(e24);
                                        i12 = i13;
                                    }
                                    String string11 = c11.isNull(i12) ? null : c11.getString(i12);
                                    int i17 = e26;
                                    int i18 = e11;
                                    String string12 = c11.isNull(i17) ? null : c11.getString(i17);
                                    int i19 = e27;
                                    String string13 = c11.isNull(i19) ? null : c11.getString(i19);
                                    int i21 = e28;
                                    String string14 = c11.isNull(i21) ? null : c11.getString(i21);
                                    int i22 = e29;
                                    String string15 = c11.isNull(i22) ? null : c11.getString(i22);
                                    int i23 = e31;
                                    String string16 = c11.isNull(i23) ? null : c11.getString(i23);
                                    int i24 = e32;
                                    String string17 = c11.isNull(i24) ? null : c11.getString(i24);
                                    int i25 = e33;
                                    float f11 = c11.getFloat(i25);
                                    int i26 = e34;
                                    float f12 = c11.getFloat(i26);
                                    e34 = i26;
                                    int i27 = e35;
                                    float f13 = c11.getFloat(i27);
                                    e35 = i27;
                                    int i28 = e36;
                                    if (c11.isNull(i28)) {
                                        e36 = i28;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(i28);
                                        e36 = i28;
                                    }
                                    arrayList.add(new RegionEntity(i14, valueOf, string3, string4, string5, string6, string7, string8, i15, i16, string9, string10, string, string11, string12, string13, string14, string15, string16, string17, f11, f12, f13, string2));
                                    e11 = i18;
                                    e26 = i17;
                                    e27 = i19;
                                    e28 = i21;
                                    e29 = i22;
                                    e31 = i23;
                                    e32 = i24;
                                    e33 = i25;
                                    i13 = i12;
                                }
                                try {
                                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                                    c11.close();
                                    RegionDao_Impl.this.__db.endTransaction();
                                    return arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c11.close();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        RegionDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    RegionDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object getAllRegionsSuspend(zz.a<? super List<RegionEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  regions", 0);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<List<RegionEntity>>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<RegionEntity> call() throws Exception {
                AnonymousClass16 anonymousClass16;
                String string;
                int i12;
                String string2;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    try {
                        Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i11, false, null);
                        try {
                            int e11 = j4.a.e(c11, "id");
                            int e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                            int e13 = j4.a.e(c11, "name_en");
                            int e14 = j4.a.e(c11, "name_ar");
                            int e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                            int e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                            int e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                            int e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                            int e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                            int e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                            int e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                            int e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                            int e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                            int e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                            try {
                                int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                                int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                                int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                                int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                                int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                                int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                                int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                                int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                                int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                                int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                                int i13 = e25;
                                ArrayList arrayList = new ArrayList(c11.getCount());
                                while (c11.moveToNext()) {
                                    int i14 = c11.getInt(e11);
                                    Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                                    String string4 = c11.isNull(e14) ? null : c11.getString(e14);
                                    String string5 = c11.isNull(e15) ? null : c11.getString(e15);
                                    String string6 = c11.isNull(e16) ? null : c11.getString(e16);
                                    String string7 = c11.isNull(e17) ? null : c11.getString(e17);
                                    String string8 = c11.isNull(e18) ? null : c11.getString(e18);
                                    int i15 = c11.getInt(e19);
                                    int i16 = c11.getInt(e21);
                                    String string9 = c11.isNull(e22) ? null : c11.getString(e22);
                                    String string10 = c11.isNull(e23) ? null : c11.getString(e23);
                                    if (c11.isNull(e24)) {
                                        i12 = i13;
                                        string = null;
                                    } else {
                                        string = c11.getString(e24);
                                        i12 = i13;
                                    }
                                    String string11 = c11.isNull(i12) ? null : c11.getString(i12);
                                    int i17 = e26;
                                    int i18 = e11;
                                    String string12 = c11.isNull(i17) ? null : c11.getString(i17);
                                    int i19 = e27;
                                    String string13 = c11.isNull(i19) ? null : c11.getString(i19);
                                    int i21 = e28;
                                    String string14 = c11.isNull(i21) ? null : c11.getString(i21);
                                    int i22 = e29;
                                    String string15 = c11.isNull(i22) ? null : c11.getString(i22);
                                    int i23 = e31;
                                    String string16 = c11.isNull(i23) ? null : c11.getString(i23);
                                    int i24 = e32;
                                    String string17 = c11.isNull(i24) ? null : c11.getString(i24);
                                    int i25 = e33;
                                    float f11 = c11.getFloat(i25);
                                    int i26 = e34;
                                    float f12 = c11.getFloat(i26);
                                    e34 = i26;
                                    int i27 = e35;
                                    float f13 = c11.getFloat(i27);
                                    e35 = i27;
                                    int i28 = e36;
                                    if (c11.isNull(i28)) {
                                        e36 = i28;
                                        string2 = null;
                                    } else {
                                        string2 = c11.getString(i28);
                                        e36 = i28;
                                    }
                                    arrayList.add(new RegionEntity(i14, valueOf, string3, string4, string5, string6, string7, string8, i15, i16, string9, string10, string, string11, string12, string13, string14, string15, string16, string17, f11, f12, f13, string2));
                                    e11 = i18;
                                    e26 = i17;
                                    e27 = i19;
                                    e28 = i21;
                                    e29 = i22;
                                    e31 = i23;
                                    e32 = i24;
                                    e33 = i25;
                                    i13 = i12;
                                }
                                anonymousClass16 = this;
                                try {
                                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                                    c11.close();
                                    i11.release();
                                    RegionDao_Impl.this.__db.endTransaction();
                                    return arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c11.close();
                                    i11.release();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                anonymousClass16 = this;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            anonymousClass16 = this;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        RegionDao_Impl.this.__db.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    RegionDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public LiveData<RegionEntity> getRegionById(int i11) {
        final v i12 = v.i("SELECT * FROM  regions WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{"regions"}, true, new Callable<RegionEntity>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RegionEntity call() throws Exception {
                int e11;
                int e12;
                int e13;
                int e14;
                int e15;
                int e16;
                int e17;
                int e18;
                int e19;
                int e21;
                int e22;
                int e23;
                int e24;
                int e25;
                RegionEntity regionEntity;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                String string6;
                int i18;
                String string7;
                int i19;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i12, false, null);
                    try {
                        e11 = j4.a.e(c11, "id");
                        e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                        e13 = j4.a.e(c11, "name_en");
                        e14 = j4.a.e(c11, "name_ar");
                        e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                        e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                        e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                        e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                        e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                        e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                        e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                        e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                        e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                        e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                        int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                        int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                        int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                        int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                        int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                        int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                        int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                        int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                        int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                        if (c11.moveToFirst()) {
                            int i21 = c11.getInt(e11);
                            Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                            String string8 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string9 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string10 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string11 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string12 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string13 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string14 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string15 = c11.isNull(e23) ? null : c11.getString(e23);
                            String string16 = c11.isNull(e24) ? null : c11.getString(e24);
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                string = null;
                            } else {
                                string = c11.getString(e25);
                                i13 = e26;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e27;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i13);
                                i14 = e27;
                            }
                            if (c11.isNull(i14)) {
                                i15 = e28;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i14);
                                i15 = e28;
                            }
                            if (c11.isNull(i15)) {
                                i16 = e29;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i15);
                                i16 = e29;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e31;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i16);
                                i17 = e31;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e32;
                                string6 = null;
                            } else {
                                string6 = c11.getString(i17);
                                i18 = e32;
                            }
                            if (c11.isNull(i18)) {
                                i19 = e33;
                                string7 = null;
                            } else {
                                string7 = c11.getString(i18);
                                i19 = e33;
                            }
                            regionEntity = new RegionEntity(i21, valueOf, string8, string9, string10, string11, string12, string13, i22, i23, string14, string15, string16, string, string2, string3, string4, string5, string6, string7, c11.getFloat(i19), c11.getFloat(e34), c11.getFloat(e35), c11.isNull(e36) ? null : c11.getString(e36));
                        } else {
                            regionEntity = null;
                        }
                        RegionDao_Impl.this.__db.setTransactionSuccessful();
                        c11.close();
                        return regionEntity;
                    } catch (Throwable th3) {
                        th = th3;
                        c11.close();
                        throw th;
                    }
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object getRegionByIdAsync(int i11, zz.a<? super RegionEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  regions WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<RegionEntity>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RegionEntity call() throws Exception {
                RegionEntity regionEntity;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                String string6;
                int i18;
                String string7;
                int i19;
                AnonymousClass14 anonymousClass14 = this;
                Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "name_ar");
                    int e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                    int e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                    int e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                    int e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                    int e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                    int e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                    int e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                    int e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                    int e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                    int e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                    try {
                        int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                        int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                        int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                        int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                        int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                        int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                        int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                        int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                        int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                        int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                        if (c11.moveToFirst()) {
                            int i21 = c11.getInt(e11);
                            Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                            String string8 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string9 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string10 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string11 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string12 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string13 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string14 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string15 = c11.isNull(e23) ? null : c11.getString(e23);
                            String string16 = c11.isNull(e24) ? null : c11.getString(e24);
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                string = null;
                            } else {
                                string = c11.getString(e25);
                                i13 = e26;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e27;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i13);
                                i14 = e27;
                            }
                            if (c11.isNull(i14)) {
                                i15 = e28;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i14);
                                i15 = e28;
                            }
                            if (c11.isNull(i15)) {
                                i16 = e29;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i15);
                                i16 = e29;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e31;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i16);
                                i17 = e31;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e32;
                                string6 = null;
                            } else {
                                string6 = c11.getString(i17);
                                i18 = e32;
                            }
                            if (c11.isNull(i18)) {
                                i19 = e33;
                                string7 = null;
                            } else {
                                string7 = c11.getString(i18);
                                i19 = e33;
                            }
                            regionEntity = new RegionEntity(i21, valueOf, string8, string9, string10, string11, string12, string13, i22, i23, string14, string15, string16, string, string2, string3, string4, string5, string6, string7, c11.getFloat(i19), c11.getFloat(e34), c11.getFloat(e35), c11.isNull(e36) ? null : c11.getString(e36));
                        } else {
                            regionEntity = null;
                        }
                        c11.close();
                        i12.release();
                        return regionEntity;
                    } catch (Throwable th2) {
                        th = th2;
                        anonymousClass14 = this;
                        c11.close();
                        i12.release();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object getRegionByIdNullable(int i11, zz.a<? super RegionEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  regions WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<RegionEntity>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RegionEntity call() throws Exception {
                RegionEntity regionEntity;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                String string6;
                int i18;
                String string7;
                int i19;
                AnonymousClass17 anonymousClass17 = this;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i12, false, null);
                    try {
                        int e11 = j4.a.e(c11, "id");
                        int e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                        int e13 = j4.a.e(c11, "name_en");
                        int e14 = j4.a.e(c11, "name_ar");
                        int e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                        int e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                        int e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                        int e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                        int e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                        int e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                        int e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                        int e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                        int e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                        int e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                        try {
                            int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                            int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                            int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                            int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                            int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                            int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                            int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                            int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                            int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                            int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                            if (c11.moveToFirst()) {
                                int i21 = c11.getInt(e11);
                                Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                                String string8 = c11.isNull(e13) ? null : c11.getString(e13);
                                String string9 = c11.isNull(e14) ? null : c11.getString(e14);
                                String string10 = c11.isNull(e15) ? null : c11.getString(e15);
                                String string11 = c11.isNull(e16) ? null : c11.getString(e16);
                                String string12 = c11.isNull(e17) ? null : c11.getString(e17);
                                String string13 = c11.isNull(e18) ? null : c11.getString(e18);
                                int i22 = c11.getInt(e19);
                                int i23 = c11.getInt(e21);
                                String string14 = c11.isNull(e22) ? null : c11.getString(e22);
                                String string15 = c11.isNull(e23) ? null : c11.getString(e23);
                                String string16 = c11.isNull(e24) ? null : c11.getString(e24);
                                if (c11.isNull(e25)) {
                                    i13 = e26;
                                    string = null;
                                } else {
                                    string = c11.getString(e25);
                                    i13 = e26;
                                }
                                if (c11.isNull(i13)) {
                                    i14 = e27;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i13);
                                    i14 = e27;
                                }
                                if (c11.isNull(i14)) {
                                    i15 = e28;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i14);
                                    i15 = e28;
                                }
                                if (c11.isNull(i15)) {
                                    i16 = e29;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i15);
                                    i16 = e29;
                                }
                                if (c11.isNull(i16)) {
                                    i17 = e31;
                                    string5 = null;
                                } else {
                                    string5 = c11.getString(i16);
                                    i17 = e31;
                                }
                                if (c11.isNull(i17)) {
                                    i18 = e32;
                                    string6 = null;
                                } else {
                                    string6 = c11.getString(i17);
                                    i18 = e32;
                                }
                                if (c11.isNull(i18)) {
                                    i19 = e33;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i18);
                                    i19 = e33;
                                }
                                regionEntity = new RegionEntity(i21, valueOf, string8, string9, string10, string11, string12, string13, i22, i23, string14, string15, string16, string, string2, string3, string4, string5, string6, string7, c11.getFloat(i19), c11.getFloat(e34), c11.getFloat(e35), c11.isNull(e36) ? null : c11.getString(e36));
                            } else {
                                regionEntity = null;
                            }
                            anonymousClass17 = this;
                            RegionDao_Impl.this.__db.setTransactionSuccessful();
                            c11.close();
                            i12.release();
                            return regionEntity;
                        } catch (Throwable th2) {
                            th = th2;
                            anonymousClass17 = this;
                            c11.close();
                            i12.release();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Flow<RegionEntity> getRegionFlowById(int i11) {
        final v i12 = v.i("SELECT * FROM  regions WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.a(this.__db, true, new String[]{"regions"}, new Callable<RegionEntity>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.13
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RegionEntity call() throws Exception {
                int e11;
                int e12;
                int e13;
                int e14;
                int e15;
                int e16;
                int e17;
                int e18;
                int e19;
                int e21;
                int e22;
                int e23;
                int e24;
                int e25;
                RegionEntity regionEntity;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                String string6;
                int i18;
                String string7;
                int i19;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i12, false, null);
                    try {
                        e11 = j4.a.e(c11, "id");
                        e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                        e13 = j4.a.e(c11, "name_en");
                        e14 = j4.a.e(c11, "name_ar");
                        e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                        e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                        e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                        e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                        e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                        e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                        e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                        e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                        e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                        e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                        int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                        int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                        int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                        int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                        int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                        int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                        int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                        int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                        int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                        if (c11.moveToFirst()) {
                            int i21 = c11.getInt(e11);
                            Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                            String string8 = c11.isNull(e13) ? null : c11.getString(e13);
                            String string9 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string10 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string11 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string12 = c11.isNull(e17) ? null : c11.getString(e17);
                            String string13 = c11.isNull(e18) ? null : c11.getString(e18);
                            int i22 = c11.getInt(e19);
                            int i23 = c11.getInt(e21);
                            String string14 = c11.isNull(e22) ? null : c11.getString(e22);
                            String string15 = c11.isNull(e23) ? null : c11.getString(e23);
                            String string16 = c11.isNull(e24) ? null : c11.getString(e24);
                            if (c11.isNull(e25)) {
                                i13 = e26;
                                string = null;
                            } else {
                                string = c11.getString(e25);
                                i13 = e26;
                            }
                            if (c11.isNull(i13)) {
                                i14 = e27;
                                string2 = null;
                            } else {
                                string2 = c11.getString(i13);
                                i14 = e27;
                            }
                            if (c11.isNull(i14)) {
                                i15 = e28;
                                string3 = null;
                            } else {
                                string3 = c11.getString(i14);
                                i15 = e28;
                            }
                            if (c11.isNull(i15)) {
                                i16 = e29;
                                string4 = null;
                            } else {
                                string4 = c11.getString(i15);
                                i16 = e29;
                            }
                            if (c11.isNull(i16)) {
                                i17 = e31;
                                string5 = null;
                            } else {
                                string5 = c11.getString(i16);
                                i17 = e31;
                            }
                            if (c11.isNull(i17)) {
                                i18 = e32;
                                string6 = null;
                            } else {
                                string6 = c11.getString(i17);
                                i18 = e32;
                            }
                            if (c11.isNull(i18)) {
                                i19 = e33;
                                string7 = null;
                            } else {
                                string7 = c11.getString(i18);
                                i19 = e33;
                            }
                            regionEntity = new RegionEntity(i21, valueOf, string8, string9, string10, string11, string12, string13, i22, i23, string14, string15, string16, string, string2, string3, string4, string5, string6, string7, c11.getFloat(i19), c11.getFloat(e34), c11.getFloat(e35), c11.isNull(e36) ? null : c11.getString(e36));
                        } else {
                            regionEntity = null;
                        }
                        RegionDao_Impl.this.__db.setTransactionSuccessful();
                        c11.close();
                        return regionEntity;
                    } catch (Throwable th3) {
                        th = th3;
                        c11.close();
                        throw th;
                    }
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object getRegionObjectById(int i11, zz.a<? super RegionEntity> aVar) {
        final v i12 = v.i("SELECT * FROM  regions WHERE id == ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, true, j4.b.a(), new Callable<RegionEntity>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RegionEntity call() throws Exception {
                RegionEntity regionEntity;
                String string;
                int i13;
                String string2;
                int i14;
                String string3;
                int i15;
                String string4;
                int i16;
                String string5;
                int i17;
                String string6;
                int i18;
                String string7;
                int i19;
                AnonymousClass12 anonymousClass12 = this;
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor c11 = j4.b.c(RegionDao_Impl.this.__db, i12, false, null);
                    try {
                        int e11 = j4.a.e(c11, "id");
                        int e12 = j4.a.e(c11, RegionEntity.MAIN_DISTRICT_ID);
                        int e13 = j4.a.e(c11, "name_en");
                        int e14 = j4.a.e(c11, "name_ar");
                        int e15 = j4.a.e(c11, RegionEntity.REGION_CODE_EN);
                        int e16 = j4.a.e(c11, RegionEntity.REGION_CODE_AR);
                        int e17 = j4.a.e(c11, RegionEntity.PHONE_PREFIX);
                        int e18 = j4.a.e(c11, RegionEntity.UTC_DIFF);
                        int e19 = j4.a.e(c11, RegionEntity.ALLOW_MESSAGING);
                        int e21 = j4.a.e(c11, RegionEntity.ALLOW_GUEST_MESSAGING);
                        int e22 = j4.a.e(c11, RegionEntity.CONTACT_DATA);
                        int e23 = j4.a.e(c11, RegionEntity.CONTACT_EMAIL);
                        int e24 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_EN);
                        int e25 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_EN);
                        try {
                            int e26 = j4.a.e(c11, RegionEntity.PROFILE_NOT_COMPLETE_MESSAGE_AR);
                            int e27 = j4.a.e(c11, RegionEntity.EMAIL_NOT_VERIFIED_MESSAGE_AR);
                            int e28 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_EN);
                            int e29 = j4.a.e(c11, RegionEntity.SUPPORT_MESSAGE_AR);
                            int e31 = j4.a.e(c11, RegionEntity.ADDRESS_EN);
                            int e32 = j4.a.e(c11, RegionEntity.ADDRESS_AR);
                            int e33 = j4.a.e(c11, RegionEntity.MIN_POINTS_FOR_REDEMPTION);
                            int e34 = j4.a.e(c11, RegionEntity.AMOUNT_PER_REDEMPTION);
                            int e35 = j4.a.e(c11, RegionEntity.POINTS_PER_PAID_AMOUNT);
                            int e36 = j4.a.e(c11, RegionEntity.POINT_LEVELS);
                            if (c11.moveToFirst()) {
                                int i21 = c11.getInt(e11);
                                Integer valueOf = c11.isNull(e12) ? null : Integer.valueOf(c11.getInt(e12));
                                String string8 = c11.isNull(e13) ? null : c11.getString(e13);
                                String string9 = c11.isNull(e14) ? null : c11.getString(e14);
                                String string10 = c11.isNull(e15) ? null : c11.getString(e15);
                                String string11 = c11.isNull(e16) ? null : c11.getString(e16);
                                String string12 = c11.isNull(e17) ? null : c11.getString(e17);
                                String string13 = c11.isNull(e18) ? null : c11.getString(e18);
                                int i22 = c11.getInt(e19);
                                int i23 = c11.getInt(e21);
                                String string14 = c11.isNull(e22) ? null : c11.getString(e22);
                                String string15 = c11.isNull(e23) ? null : c11.getString(e23);
                                String string16 = c11.isNull(e24) ? null : c11.getString(e24);
                                if (c11.isNull(e25)) {
                                    i13 = e26;
                                    string = null;
                                } else {
                                    string = c11.getString(e25);
                                    i13 = e26;
                                }
                                if (c11.isNull(i13)) {
                                    i14 = e27;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i13);
                                    i14 = e27;
                                }
                                if (c11.isNull(i14)) {
                                    i15 = e28;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i14);
                                    i15 = e28;
                                }
                                if (c11.isNull(i15)) {
                                    i16 = e29;
                                    string4 = null;
                                } else {
                                    string4 = c11.getString(i15);
                                    i16 = e29;
                                }
                                if (c11.isNull(i16)) {
                                    i17 = e31;
                                    string5 = null;
                                } else {
                                    string5 = c11.getString(i16);
                                    i17 = e31;
                                }
                                if (c11.isNull(i17)) {
                                    i18 = e32;
                                    string6 = null;
                                } else {
                                    string6 = c11.getString(i17);
                                    i18 = e32;
                                }
                                if (c11.isNull(i18)) {
                                    i19 = e33;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i18);
                                    i19 = e33;
                                }
                                regionEntity = new RegionEntity(i21, valueOf, string8, string9, string10, string11, string12, string13, i22, i23, string14, string15, string16, string, string2, string3, string4, string5, string6, string7, c11.getFloat(i19), c11.getFloat(e34), c11.getFloat(e35), c11.isNull(e36) ? null : c11.getString(e36));
                            } else {
                                regionEntity = null;
                            }
                            anonymousClass12 = this;
                            RegionDao_Impl.this.__db.setTransactionSuccessful();
                            c11.close();
                            i12.release();
                            return regionEntity;
                        } catch (Throwable th2) {
                            th = th2;
                            anonymousClass12 = this;
                            c11.close();
                            i12.release();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object insertAllRegions(final List<RegionEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = RegionDao_Impl.this.__insertionAdapterOfRegionEntity.insertAndReturnIdsList(list);
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object insertRegion(final RegionEntity regionEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RegionDao_Impl.this.__insertionAdapterOfRegionEntity.insertAndReturnId(regionEntity));
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object updateRegion(final RegionEntity regionEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                RegionDao_Impl.this.__db.beginTransaction();
                try {
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(RegionDao_Impl.this.__updateAdapterOfRegionEntity.handle(regionEntity) + 0);
                } finally {
                    RegionDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.RegionDao
    public Object deleteAllRegions(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.RegionDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = RegionDao_Impl.this.__preparedStmtOfDeleteAllRegions.acquire();
                try {
                    RegionDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    RegionDao_Impl.this.__db.setTransactionSuccessful();
                    RegionDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    RegionDao_Impl.this.__preparedStmtOfDeleteAllRegions.release(acquire);
                }
            }
        }, aVar);
    }
}
