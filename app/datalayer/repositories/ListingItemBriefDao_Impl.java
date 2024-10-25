package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.DistrictNameConverter;
import com.forsale.app.datalayer.database.ExtraAttrConverter;
import com.forsale.app.datalayer.database.ItemStatusConverters;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import falcon.chat.entities.MessageKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class ListingItemBriefDao_Impl implements ListingItemBriefDao {
    private final RoomDatabase __db;
    private final i<ListingItemBrief> __insertionAdapterOfListingItemBrief;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllListingItems;
    private final ItemStatusConverters __itemStatusConverters = new ItemStatusConverters();
    private final DistrictNameConverter __districtNameConverter = new DistrictNameConverter();
    private final ExtraAttrConverter __extraAttrConverter = new ExtraAttrConverter();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$forsale$app$datalayer$network$requestsbodies$UserType;

        static {
            int[] iArr = new int[UserType.values().length];
            $SwitchMap$com$forsale$app$datalayer$network$requestsbodies$UserType = iArr;
            try {
                iArr[UserType.FOR_SALE_REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$forsale$app$datalayer$network$requestsbodies$UserType[UserType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$forsale$app$datalayer$network$requestsbodies$UserType[UserType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ListingItemBriefDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfListingItemBrief = new i<ListingItemBrief>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `listing_item_brief` (`image`,`thumb`,`cat_id`,`contact`,`date_published`,`date_sort`,`do_not_disturb`,`id`,`images_count`,`is_hide_my_number`,`is_anon`,`is_prem`,`is_video_paid`,`is_voip`,`price`,`reg_id`,`status`,`title`,`url`,`was_promoted`,`phone`,`district_name`,`district_name_localize`,`description`,`expire_soon`,`virtual_tour_thumb`,`attrs`,`user_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ListingItemBrief listingItemBrief) {
                if (listingItemBrief.getImage() == null) {
                    mVar.u1(1);
                } else {
                    mVar.Q0(1, listingItemBrief.getImage());
                }
                if (listingItemBrief.getThumb() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, listingItemBrief.getThumb());
                }
                mVar.d1(3, listingItemBrief.getCatId());
                if (listingItemBrief.getContact() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, listingItemBrief.getContact());
                }
                if (listingItemBrief.getDatePublished() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, listingItemBrief.getDatePublished());
                }
                if (listingItemBrief.getDateSort() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, listingItemBrief.getDateSort());
                }
                if (listingItemBrief.getDoNotDisturb() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, listingItemBrief.getDoNotDisturb());
                }
                mVar.d1(8, listingItemBrief.getId());
                mVar.d1(9, listingItemBrief.getImagesCount());
                mVar.d1(10, listingItemBrief.isHideMyNumber());
                mVar.d1(11, listingItemBrief.isAnon());
                mVar.d1(12, listingItemBrief.isPrem());
                mVar.d1(13, listingItemBrief.isVideoPaid());
                mVar.d1(14, listingItemBrief.isVoip());
                mVar.S(15, listingItemBrief.getPrice());
                mVar.d1(16, listingItemBrief.getRegId());
                String itemStatusConverters = ListingItemBriefDao_Impl.this.__itemStatusConverters.toString(listingItemBrief.getStatus());
                if (itemStatusConverters == null) {
                    mVar.u1(17);
                } else {
                    mVar.Q0(17, itemStatusConverters);
                }
                if (listingItemBrief.getTitle() == null) {
                    mVar.u1(18);
                } else {
                    mVar.Q0(18, listingItemBrief.getTitle());
                }
                if (listingItemBrief.getUrl() == null) {
                    mVar.u1(19);
                } else {
                    mVar.Q0(19, listingItemBrief.getUrl());
                }
                mVar.d1(20, listingItemBrief.getWasPromoted());
                if (listingItemBrief.getPhone() == null) {
                    mVar.u1(21);
                } else {
                    mVar.Q0(21, listingItemBrief.getPhone());
                }
                if (listingItemBrief.getDistrictNameDefault() == null) {
                    mVar.u1(22);
                } else {
                    mVar.Q0(22, listingItemBrief.getDistrictNameDefault());
                }
                String districtNameConverter = ListingItemBriefDao_Impl.this.__districtNameConverter.toString(listingItemBrief.getDistrictNameLocalize());
                if (districtNameConverter == null) {
                    mVar.u1(23);
                } else {
                    mVar.Q0(23, districtNameConverter);
                }
                if (listingItemBrief.getDescription() == null) {
                    mVar.u1(24);
                } else {
                    mVar.Q0(24, listingItemBrief.getDescription());
                }
                if (listingItemBrief.getExpireSoon() == null) {
                    mVar.u1(25);
                } else {
                    mVar.d1(25, listingItemBrief.getExpireSoon().intValue());
                }
                if (listingItemBrief.getVirtualTourThumb() == null) {
                    mVar.u1(26);
                } else {
                    mVar.Q0(26, listingItemBrief.getVirtualTourThumb());
                }
                String extraAttrConverter = ListingItemBriefDao_Impl.this.__extraAttrConverter.toString(listingItemBrief.getExtraAttrs());
                if (extraAttrConverter == null) {
                    mVar.u1(27);
                } else {
                    mVar.Q0(27, extraAttrConverter);
                }
                if (listingItemBrief.getUserType() != null) {
                    mVar.Q0(28, ListingItemBriefDao_Impl.this.__UserType_enumToString(listingItemBrief.getUserType()));
                } else {
                    mVar.u1(28);
                }
            }
        };
        this.__preparedStmtOfDeleteAllListingItems = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM listing_item_brief";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String __UserType_enumToString(UserType userType) {
        int i11 = AnonymousClass6.$SwitchMap$com$forsale$app$datalayer$network$requestsbodies$UserType[userType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "DEFAULT";
                }
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + userType);
            }
            return "NORMAL";
        }
        return "FOR_SALE_REALTY";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UserType __UserType_stringToEnum(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals("DEFAULT")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1986416409:
                if (str.equals("NORMAL")) {
                    c11 = 1;
                    break;
                }
                break;
            case 141221125:
                if (str.equals("FOR_SALE_REALTY")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return UserType.DEFAULT;
            case 1:
                return UserType.NORMAL;
            case 2:
                return UserType.FOR_SALE_REALTY;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ListingItemBriefDao
    public Object deleteAllListingItems(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ListingItemBriefDao_Impl.this.__preparedStmtOfDeleteAllListingItems.acquire();
                try {
                    ListingItemBriefDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ListingItemBriefDao_Impl.this.__db.setTransactionSuccessful();
                    ListingItemBriefDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ListingItemBriefDao_Impl.this.__preparedStmtOfDeleteAllListingItems.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingItemBriefDao
    public Object getAllListingItems(zz.a<? super List<ListingItemBrief>> aVar) {
        final v i11 = v.i("SELECT * FROM  listing_item_brief", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<ListingItemBrief>>() { // from class: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<ListingItemBrief> call() throws Exception {
                AnonymousClass5 anonymousClass5;
                int i12;
                int i13;
                String string;
                int i14;
                String string2;
                int i15;
                String string3;
                int i16;
                String string4;
                int i17;
                String string5;
                int i18;
                String string6;
                String string7;
                int i19;
                Integer valueOf;
                int i21;
                String string8;
                int i22;
                String string9;
                int i23;
                UserType __UserType_stringToEnum;
                Cursor c11 = j4.b.c(ListingItemBriefDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "image");
                    int e12 = j4.a.e(c11, "thumb");
                    int e13 = j4.a.e(c11, "cat_id");
                    int e14 = j4.a.e(c11, "contact");
                    int e15 = j4.a.e(c11, ListingItemBase.DATE_PUBLISHED);
                    int e16 = j4.a.e(c11, ListingItemBase.DATE_SORT);
                    int e17 = j4.a.e(c11, ListingItemBase.DO_NOT_DISTURB);
                    int e18 = j4.a.e(c11, "id");
                    int e19 = j4.a.e(c11, ListingItemBase.IMAGES_COUNT);
                    int e21 = j4.a.e(c11, ListingItemBase.IS_HIDE_MY_NUMBER);
                    int e22 = j4.a.e(c11, ListingItemBase.IS_ANON);
                    int e23 = j4.a.e(c11, ListingItemBase.IS_PREM);
                    int e24 = j4.a.e(c11, ListingItemBase.IS_VIDEO_PAID);
                    int e25 = j4.a.e(c11, ListingItemBase.IS_VOIP);
                    try {
                        int e26 = j4.a.e(c11, "price");
                        int e27 = j4.a.e(c11, ListingItemBase.REG_ID);
                        int e28 = j4.a.e(c11, MessageKt.STATUS);
                        int e29 = j4.a.e(c11, "title");
                        int e31 = j4.a.e(c11, "url");
                        int e32 = j4.a.e(c11, ListingItemBase.WAS_PROMOTED);
                        int e33 = j4.a.e(c11, "phone");
                        int e34 = j4.a.e(c11, ListingItemBase.DISTRICT_NAME);
                        int e35 = j4.a.e(c11, "district_name_localize");
                        int e36 = j4.a.e(c11, "description");
                        int e37 = j4.a.e(c11, ListingItemBase.EXPIRE_SOON);
                        int e38 = j4.a.e(c11, "virtual_tour_thumb");
                        int e39 = j4.a.e(c11, ListingItemDetails.ATTRIBUTES);
                        int e41 = j4.a.e(c11, "user_type");
                        int i24 = e25;
                        ArrayList arrayList = new ArrayList(c11.getCount());
                        while (c11.moveToNext()) {
                            String string10 = c11.isNull(e11) ? null : c11.getString(e11);
                            String string11 = c11.isNull(e12) ? null : c11.getString(e12);
                            int i25 = c11.getInt(e13);
                            String string12 = c11.isNull(e14) ? null : c11.getString(e14);
                            String string13 = c11.isNull(e15) ? null : c11.getString(e15);
                            String string14 = c11.isNull(e16) ? null : c11.getString(e16);
                            String string15 = c11.isNull(e17) ? null : c11.getString(e17);
                            int i26 = c11.getInt(e18);
                            int i27 = c11.getInt(e19);
                            int i28 = c11.getInt(e21);
                            int i29 = c11.getInt(e22);
                            int i31 = c11.getInt(e23);
                            int i32 = c11.getInt(e24);
                            int i33 = i24;
                            int i34 = c11.getInt(i33);
                            int i35 = e11;
                            int i36 = e26;
                            double d11 = c11.getDouble(i36);
                            e26 = i36;
                            int i37 = e27;
                            int i38 = c11.getInt(i37);
                            e27 = i37;
                            int i39 = e28;
                            if (c11.isNull(i39)) {
                                i12 = i39;
                                i14 = e12;
                                i13 = i33;
                                string = null;
                            } else {
                                i12 = i39;
                                i13 = i33;
                                string = c11.getString(i39);
                                i14 = e12;
                            }
                            anonymousClass5 = this;
                            try {
                                ItemStatus itemStatus = ListingItemBriefDao_Impl.this.__itemStatusConverters.toItemStatus(string);
                                int i41 = e29;
                                if (c11.isNull(i41)) {
                                    i15 = e31;
                                    string2 = null;
                                } else {
                                    string2 = c11.getString(i41);
                                    i15 = e31;
                                }
                                if (c11.isNull(i15)) {
                                    e29 = i41;
                                    i16 = e32;
                                    string3 = null;
                                } else {
                                    string3 = c11.getString(i15);
                                    e29 = i41;
                                    i16 = e32;
                                }
                                int i42 = c11.getInt(i16);
                                e32 = i16;
                                int i43 = e33;
                                if (c11.isNull(i43)) {
                                    e33 = i43;
                                    i17 = e34;
                                    string4 = null;
                                } else {
                                    e33 = i43;
                                    string4 = c11.getString(i43);
                                    i17 = e34;
                                }
                                if (c11.isNull(i17)) {
                                    e34 = i17;
                                    i18 = e35;
                                    string5 = null;
                                } else {
                                    e34 = i17;
                                    string5 = c11.getString(i17);
                                    i18 = e35;
                                }
                                if (c11.isNull(i18)) {
                                    e35 = i18;
                                    e31 = i15;
                                    string6 = null;
                                } else {
                                    e35 = i18;
                                    string6 = c11.getString(i18);
                                    e31 = i15;
                                }
                                ListingItemBrief.DistrictName district = ListingItemBriefDao_Impl.this.__districtNameConverter.toDistrict(string6);
                                int i44 = e36;
                                if (c11.isNull(i44)) {
                                    i19 = e37;
                                    string7 = null;
                                } else {
                                    string7 = c11.getString(i44);
                                    i19 = e37;
                                }
                                if (c11.isNull(i19)) {
                                    e36 = i44;
                                    i21 = e38;
                                    valueOf = null;
                                } else {
                                    valueOf = Integer.valueOf(c11.getInt(i19));
                                    e36 = i44;
                                    i21 = e38;
                                }
                                if (c11.isNull(i21)) {
                                    e38 = i21;
                                    i22 = e39;
                                    string8 = null;
                                } else {
                                    e38 = i21;
                                    string8 = c11.getString(i21);
                                    i22 = e39;
                                }
                                if (c11.isNull(i22)) {
                                    e39 = i22;
                                    e37 = i19;
                                    string9 = null;
                                } else {
                                    e39 = i22;
                                    string9 = c11.getString(i22);
                                    e37 = i19;
                                }
                                List<ExtraAttr> extraAttr = ListingItemBriefDao_Impl.this.__extraAttrConverter.toExtraAttr(string9);
                                int i45 = e41;
                                if (c11.isNull(i45)) {
                                    i23 = e13;
                                    __UserType_stringToEnum = null;
                                } else {
                                    i23 = e13;
                                    __UserType_stringToEnum = ListingItemBriefDao_Impl.this.__UserType_stringToEnum(c11.getString(i45));
                                }
                                arrayList.add(new ListingItemBrief(string10, string11, i25, string12, string13, string14, string15, i26, i27, i28, i29, i31, i32, i34, d11, i38, itemStatus, string2, string3, i42, string4, string5, district, string7, valueOf, string8, extraAttr, __UserType_stringToEnum));
                                e12 = i14;
                                e13 = i23;
                                e28 = i12;
                                e41 = i45;
                                e11 = i35;
                                i24 = i13;
                            } catch (Throwable th2) {
                                th = th2;
                                c11.close();
                                i11.release();
                                throw th;
                            }
                        }
                        c11.close();
                        i11.release();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass5 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass5 = this;
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingItemBriefDao
    public Object insertAllListingItems(final List<ListingItemBrief> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.ListingItemBriefDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                ListingItemBriefDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = ListingItemBriefDao_Impl.this.__insertionAdapterOfListingItemBrief.insertAndReturnIdsList(list);
                    ListingItemBriefDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    ListingItemBriefDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }
}
