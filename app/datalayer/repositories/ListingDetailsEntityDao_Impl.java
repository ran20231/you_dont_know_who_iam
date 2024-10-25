package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.AddonsRequestedConverter;
import com.forsale.app.datalayer.database.ArrayListStringConverter;
import com.forsale.app.datalayer.database.ExtraAttrConverter;
import com.forsale.app.datalayer.database.ExtraInfoConverter;
import com.forsale.app.datalayer.database.IntegerListConverter;
import com.forsale.app.datalayer.database.LanguageConverter;
import com.forsale.app.datalayer.database.MasterDataModel;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import com.forsale.app.datalayer.database.StringListConverter;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class ListingDetailsEntityDao_Impl implements ListingDetailsEntityDao {
    private final RoomDatabase __db;
    private final i<ListingDetailsEntity> __insertionAdapterOfListingDetailsEntity;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfUpdateId;
    private final SharedSQLiteStatement __preparedStmtOfUpdatePostUpload;
    private final h<ListingDetailsEntity> __updateAdapterOfListingDetailsEntity;
    private final IntegerListConverter __integerListConverter = new IntegerListConverter();
    private final LanguageConverter __languageConverter = new LanguageConverter();
    private final AddonsRequestedConverter __addonsRequestedConverter = new AddonsRequestedConverter();
    private final ExtraAttrConverter __extraAttrConverter = new ExtraAttrConverter();
    private final StringListConverter __stringListConverter = new StringListConverter();
    private final ArrayListStringConverter __arrayListStringConverter = new ArrayListStringConverter();
    private final ExtraInfoConverter __extraInfoConverter = new ExtraInfoConverter();

    public ListingDetailsEntityDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfListingDetailsEntity = new i<ListingDetailsEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `listing_details_table` (`adv_id`,`device_id`,`region_id`,`category_id`,`districts_ids`,`title`,`description`,`contact_no`,`language`,`asking_price`,`addons_requested`,`extra_attrs`,`is_pm_enabled`,`is_voip_enabled`,`is_draft`,`is_hide_my_number`,`is_anonymous`,`attempt_abuse`,`geotag_lon`,`geotag_lat`,`repost_auto_renew`,`do_not_disturb`,`images`,`images_urls`,`video_url`,`video_network_url`,`videoThumb`,`delete_video`,`plan_id`,`prohibited_keywords`,`extra_info`,`source_item_id`,`has_addons`,`allow_edit_on_district`,`cached_adv`,`approved_addons`,`left_over_flag`,`primaryImage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, ListingDetailsEntity listingDetailsEntity) {
                mVar.d1(1, listingDetailsEntity.getId());
                if (listingDetailsEntity.getDeviceId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, listingDetailsEntity.getDeviceId());
                }
                mVar.d1(3, listingDetailsEntity.getRegionId());
                if (listingDetailsEntity.getCategoryId() == null) {
                    mVar.u1(4);
                } else {
                    mVar.d1(4, listingDetailsEntity.getCategoryId().intValue());
                }
                String fromIntList = ListingDetailsEntityDao_Impl.this.__integerListConverter.fromIntList(listingDetailsEntity.getDistrictsIds());
                if (fromIntList == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, fromIntList);
                }
                if (listingDetailsEntity.getTitle() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, listingDetailsEntity.getTitle());
                }
                if (listingDetailsEntity.getDescription() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, listingDetailsEntity.getDescription());
                }
                if (listingDetailsEntity.getContactNo() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, listingDetailsEntity.getContactNo());
                }
                String languageConverter = ListingDetailsEntityDao_Impl.this.__languageConverter.toString(listingDetailsEntity.getLanguage());
                if (languageConverter == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, languageConverter);
                }
                if (listingDetailsEntity.getPrice() == null) {
                    mVar.u1(10);
                } else {
                    mVar.S(10, listingDetailsEntity.getPrice().doubleValue());
                }
                String addonsRequestedConverter = ListingDetailsEntityDao_Impl.this.__addonsRequestedConverter.toString(listingDetailsEntity.getAddonsRequested());
                if (addonsRequestedConverter == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, addonsRequestedConverter);
                }
                String extraAttrConverter = ListingDetailsEntityDao_Impl.this.__extraAttrConverter.toString(listingDetailsEntity.getExtraAttrs());
                if (extraAttrConverter == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, extraAttrConverter);
                }
                if (listingDetailsEntity.getPmEnabled() == null) {
                    mVar.u1(13);
                } else {
                    mVar.d1(13, listingDetailsEntity.getPmEnabled().intValue());
                }
                if (listingDetailsEntity.getVoipEnabled() == null) {
                    mVar.u1(14);
                } else {
                    mVar.d1(14, listingDetailsEntity.getVoipEnabled().intValue());
                }
                if (listingDetailsEntity.getDraft() == null) {
                    mVar.u1(15);
                } else {
                    mVar.d1(15, listingDetailsEntity.getDraft().intValue());
                }
                if (listingDetailsEntity.getHideMyNumber() == null) {
                    mVar.u1(16);
                } else {
                    mVar.d1(16, listingDetailsEntity.getHideMyNumber().intValue());
                }
                if (listingDetailsEntity.getAnonymous() == null) {
                    mVar.u1(17);
                } else {
                    mVar.d1(17, listingDetailsEntity.getAnonymous().intValue());
                }
                if (listingDetailsEntity.getAttemptAbuse() == null) {
                    mVar.u1(18);
                } else {
                    mVar.d1(18, listingDetailsEntity.getAttemptAbuse().intValue());
                }
                if (listingDetailsEntity.getGeotagLon() == null) {
                    mVar.u1(19);
                } else {
                    mVar.S(19, listingDetailsEntity.getGeotagLon().floatValue());
                }
                if (listingDetailsEntity.getGeotagLat() == null) {
                    mVar.u1(20);
                } else {
                    mVar.S(20, listingDetailsEntity.getGeotagLat().floatValue());
                }
                if (listingDetailsEntity.getRepostAutoRenew() == null) {
                    mVar.u1(21);
                } else {
                    mVar.d1(21, listingDetailsEntity.getRepostAutoRenew().intValue());
                }
                if (listingDetailsEntity.getDoNotDisturb() == null) {
                    mVar.u1(22);
                } else {
                    mVar.Q0(22, listingDetailsEntity.getDoNotDisturb());
                }
                String stringListConverter = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getImages());
                if (stringListConverter == null) {
                    mVar.u1(23);
                } else {
                    mVar.Q0(23, stringListConverter);
                }
                String arrayListStringConverter = ListingDetailsEntityDao_Impl.this.__arrayListStringConverter.toString(listingDetailsEntity.getImageUrls());
                if (arrayListStringConverter == null) {
                    mVar.u1(24);
                } else {
                    mVar.Q0(24, arrayListStringConverter);
                }
                if (listingDetailsEntity.getVideoFileName() == null) {
                    mVar.u1(25);
                } else {
                    mVar.Q0(25, listingDetailsEntity.getVideoFileName());
                }
                if (listingDetailsEntity.getVideoUrl() == null) {
                    mVar.u1(26);
                } else {
                    mVar.Q0(26, listingDetailsEntity.getVideoUrl());
                }
                if (listingDetailsEntity.getVideoThumb() == null) {
                    mVar.u1(27);
                } else {
                    mVar.Q0(27, listingDetailsEntity.getVideoThumb());
                }
                if (listingDetailsEntity.getDeleteVideo() == null) {
                    mVar.u1(28);
                } else {
                    mVar.d1(28, listingDetailsEntity.getDeleteVideo().intValue());
                }
                if (listingDetailsEntity.getPlanId() == null) {
                    mVar.u1(29);
                } else {
                    mVar.d1(29, listingDetailsEntity.getPlanId().intValue());
                }
                String stringListConverter2 = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getProhibtedKeyWords());
                if (stringListConverter2 == null) {
                    mVar.u1(30);
                } else {
                    mVar.Q0(30, stringListConverter2);
                }
                String extraInfoConverter = ListingDetailsEntityDao_Impl.this.__extraInfoConverter.toString(listingDetailsEntity.getExtraInfo());
                if (extraInfoConverter == null) {
                    mVar.u1(31);
                } else {
                    mVar.Q0(31, extraInfoConverter);
                }
                if (listingDetailsEntity.getSourceItemId() == null) {
                    mVar.u1(32);
                } else {
                    mVar.d1(32, listingDetailsEntity.getSourceItemId().intValue());
                }
                Integer valueOf = listingDetailsEntity.getHasAddons() == null ? null : Integer.valueOf(listingDetailsEntity.getHasAddons().booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    mVar.u1(33);
                } else {
                    mVar.d1(33, valueOf.intValue());
                }
                if (listingDetailsEntity.getAllowEditOnDistrict() == null) {
                    mVar.u1(34);
                } else {
                    mVar.d1(34, listingDetailsEntity.getAllowEditOnDistrict().intValue());
                }
                if (listingDetailsEntity.getCachedAdv() == null) {
                    mVar.u1(35);
                } else {
                    mVar.d1(35, listingDetailsEntity.getCachedAdv().intValue());
                }
                String stringListConverter3 = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getApprovedAddons());
                if (stringListConverter3 == null) {
                    mVar.u1(36);
                } else {
                    mVar.Q0(36, stringListConverter3);
                }
                mVar.d1(37, listingDetailsEntity.getLeftOverFlag());
                if (listingDetailsEntity.getPrimaryImage() == null) {
                    mVar.u1(38);
                } else {
                    mVar.Q0(38, listingDetailsEntity.getPrimaryImage());
                }
            }
        };
        this.__updateAdapterOfListingDetailsEntity = new h<ListingDetailsEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `listing_details_table` SET `adv_id` = ?,`device_id` = ?,`region_id` = ?,`category_id` = ?,`districts_ids` = ?,`title` = ?,`description` = ?,`contact_no` = ?,`language` = ?,`asking_price` = ?,`addons_requested` = ?,`extra_attrs` = ?,`is_pm_enabled` = ?,`is_voip_enabled` = ?,`is_draft` = ?,`is_hide_my_number` = ?,`is_anonymous` = ?,`attempt_abuse` = ?,`geotag_lon` = ?,`geotag_lat` = ?,`repost_auto_renew` = ?,`do_not_disturb` = ?,`images` = ?,`images_urls` = ?,`video_url` = ?,`video_network_url` = ?,`videoThumb` = ?,`delete_video` = ?,`plan_id` = ?,`prohibited_keywords` = ?,`extra_info` = ?,`source_item_id` = ?,`has_addons` = ?,`allow_edit_on_district` = ?,`cached_adv` = ?,`approved_addons` = ?,`left_over_flag` = ?,`primaryImage` = ? WHERE `adv_id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, ListingDetailsEntity listingDetailsEntity) {
                mVar.d1(1, listingDetailsEntity.getId());
                if (listingDetailsEntity.getDeviceId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, listingDetailsEntity.getDeviceId());
                }
                mVar.d1(3, listingDetailsEntity.getRegionId());
                if (listingDetailsEntity.getCategoryId() == null) {
                    mVar.u1(4);
                } else {
                    mVar.d1(4, listingDetailsEntity.getCategoryId().intValue());
                }
                String fromIntList = ListingDetailsEntityDao_Impl.this.__integerListConverter.fromIntList(listingDetailsEntity.getDistrictsIds());
                if (fromIntList == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, fromIntList);
                }
                if (listingDetailsEntity.getTitle() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, listingDetailsEntity.getTitle());
                }
                if (listingDetailsEntity.getDescription() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, listingDetailsEntity.getDescription());
                }
                if (listingDetailsEntity.getContactNo() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, listingDetailsEntity.getContactNo());
                }
                String languageConverter = ListingDetailsEntityDao_Impl.this.__languageConverter.toString(listingDetailsEntity.getLanguage());
                if (languageConverter == null) {
                    mVar.u1(9);
                } else {
                    mVar.Q0(9, languageConverter);
                }
                if (listingDetailsEntity.getPrice() == null) {
                    mVar.u1(10);
                } else {
                    mVar.S(10, listingDetailsEntity.getPrice().doubleValue());
                }
                String addonsRequestedConverter = ListingDetailsEntityDao_Impl.this.__addonsRequestedConverter.toString(listingDetailsEntity.getAddonsRequested());
                if (addonsRequestedConverter == null) {
                    mVar.u1(11);
                } else {
                    mVar.Q0(11, addonsRequestedConverter);
                }
                String extraAttrConverter = ListingDetailsEntityDao_Impl.this.__extraAttrConverter.toString(listingDetailsEntity.getExtraAttrs());
                if (extraAttrConverter == null) {
                    mVar.u1(12);
                } else {
                    mVar.Q0(12, extraAttrConverter);
                }
                if (listingDetailsEntity.getPmEnabled() == null) {
                    mVar.u1(13);
                } else {
                    mVar.d1(13, listingDetailsEntity.getPmEnabled().intValue());
                }
                if (listingDetailsEntity.getVoipEnabled() == null) {
                    mVar.u1(14);
                } else {
                    mVar.d1(14, listingDetailsEntity.getVoipEnabled().intValue());
                }
                if (listingDetailsEntity.getDraft() == null) {
                    mVar.u1(15);
                } else {
                    mVar.d1(15, listingDetailsEntity.getDraft().intValue());
                }
                if (listingDetailsEntity.getHideMyNumber() == null) {
                    mVar.u1(16);
                } else {
                    mVar.d1(16, listingDetailsEntity.getHideMyNumber().intValue());
                }
                if (listingDetailsEntity.getAnonymous() == null) {
                    mVar.u1(17);
                } else {
                    mVar.d1(17, listingDetailsEntity.getAnonymous().intValue());
                }
                if (listingDetailsEntity.getAttemptAbuse() == null) {
                    mVar.u1(18);
                } else {
                    mVar.d1(18, listingDetailsEntity.getAttemptAbuse().intValue());
                }
                if (listingDetailsEntity.getGeotagLon() == null) {
                    mVar.u1(19);
                } else {
                    mVar.S(19, listingDetailsEntity.getGeotagLon().floatValue());
                }
                if (listingDetailsEntity.getGeotagLat() == null) {
                    mVar.u1(20);
                } else {
                    mVar.S(20, listingDetailsEntity.getGeotagLat().floatValue());
                }
                if (listingDetailsEntity.getRepostAutoRenew() == null) {
                    mVar.u1(21);
                } else {
                    mVar.d1(21, listingDetailsEntity.getRepostAutoRenew().intValue());
                }
                if (listingDetailsEntity.getDoNotDisturb() == null) {
                    mVar.u1(22);
                } else {
                    mVar.Q0(22, listingDetailsEntity.getDoNotDisturb());
                }
                String stringListConverter = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getImages());
                if (stringListConverter == null) {
                    mVar.u1(23);
                } else {
                    mVar.Q0(23, stringListConverter);
                }
                String arrayListStringConverter = ListingDetailsEntityDao_Impl.this.__arrayListStringConverter.toString(listingDetailsEntity.getImageUrls());
                if (arrayListStringConverter == null) {
                    mVar.u1(24);
                } else {
                    mVar.Q0(24, arrayListStringConverter);
                }
                if (listingDetailsEntity.getVideoFileName() == null) {
                    mVar.u1(25);
                } else {
                    mVar.Q0(25, listingDetailsEntity.getVideoFileName());
                }
                if (listingDetailsEntity.getVideoUrl() == null) {
                    mVar.u1(26);
                } else {
                    mVar.Q0(26, listingDetailsEntity.getVideoUrl());
                }
                if (listingDetailsEntity.getVideoThumb() == null) {
                    mVar.u1(27);
                } else {
                    mVar.Q0(27, listingDetailsEntity.getVideoThumb());
                }
                if (listingDetailsEntity.getDeleteVideo() == null) {
                    mVar.u1(28);
                } else {
                    mVar.d1(28, listingDetailsEntity.getDeleteVideo().intValue());
                }
                if (listingDetailsEntity.getPlanId() == null) {
                    mVar.u1(29);
                } else {
                    mVar.d1(29, listingDetailsEntity.getPlanId().intValue());
                }
                String stringListConverter2 = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getProhibtedKeyWords());
                if (stringListConverter2 == null) {
                    mVar.u1(30);
                } else {
                    mVar.Q0(30, stringListConverter2);
                }
                String extraInfoConverter = ListingDetailsEntityDao_Impl.this.__extraInfoConverter.toString(listingDetailsEntity.getExtraInfo());
                if (extraInfoConverter == null) {
                    mVar.u1(31);
                } else {
                    mVar.Q0(31, extraInfoConverter);
                }
                if (listingDetailsEntity.getSourceItemId() == null) {
                    mVar.u1(32);
                } else {
                    mVar.d1(32, listingDetailsEntity.getSourceItemId().intValue());
                }
                Integer valueOf = listingDetailsEntity.getHasAddons() == null ? null : Integer.valueOf(listingDetailsEntity.getHasAddons().booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    mVar.u1(33);
                } else {
                    mVar.d1(33, valueOf.intValue());
                }
                if (listingDetailsEntity.getAllowEditOnDistrict() == null) {
                    mVar.u1(34);
                } else {
                    mVar.d1(34, listingDetailsEntity.getAllowEditOnDistrict().intValue());
                }
                if (listingDetailsEntity.getCachedAdv() == null) {
                    mVar.u1(35);
                } else {
                    mVar.d1(35, listingDetailsEntity.getCachedAdv().intValue());
                }
                String stringListConverter3 = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(listingDetailsEntity.getApprovedAddons());
                if (stringListConverter3 == null) {
                    mVar.u1(36);
                } else {
                    mVar.Q0(36, stringListConverter3);
                }
                mVar.d1(37, listingDetailsEntity.getLeftOverFlag());
                if (listingDetailsEntity.getPrimaryImage() == null) {
                    mVar.u1(38);
                } else {
                    mVar.Q0(38, listingDetailsEntity.getPrimaryImage());
                }
                mVar.d1(39, listingDetailsEntity.getId());
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM listing_details_table";
            }
        };
        this.__preparedStmtOfUpdateId = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE listing_details_table SET adv_id = ?";
            }
        };
        this.__preparedStmtOfUpdatePostUpload = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE listing_details_table SET adv_id = ?, is_draft = ?, approved_addons = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object delete(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = ListingDetailsEntityDao_Impl.this.__preparedStmtOfDelete.acquire();
                try {
                    ListingDetailsEntityDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    ListingDetailsEntityDao_Impl.this.__db.setTransactionSuccessful();
                    ListingDetailsEntityDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    ListingDetailsEntityDao_Impl.this.__preparedStmtOfDelete.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object getSingle(zz.a<? super ListingDetailsEntity> aVar) {
        final v i11 = v.i("SELECT * FROM listing_details_table LIMIT 1", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<ListingDetailsEntity>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListingDetailsEntity call() throws Exception {
                ListingDetailsEntity listingDetailsEntity;
                Boolean valueOf;
                Cursor c11 = j4.b.c(ListingDetailsEntityDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, GetListingsBaseBody.ADV_ID);
                    int e12 = j4.a.e(c11, GetListingsBaseBody.DEVICE_ID);
                    int e13 = j4.a.e(c11, "region_id");
                    int e14 = j4.a.e(c11, "category_id");
                    int e15 = j4.a.e(c11, "districts_ids");
                    int e16 = j4.a.e(c11, "title");
                    int e17 = j4.a.e(c11, "description");
                    int e18 = j4.a.e(c11, "contact_no");
                    int e19 = j4.a.e(c11, "language");
                    int e21 = j4.a.e(c11, "asking_price");
                    int e22 = j4.a.e(c11, "addons_requested");
                    int e23 = j4.a.e(c11, AdvancedSearchBody.EXTRA_ATTRIBUTES);
                    int e24 = j4.a.e(c11, MasterDataModel.IS_PM_ENABLED);
                    int e25 = j4.a.e(c11, "is_voip_enabled");
                    int e26 = j4.a.e(c11, "is_draft");
                    int e27 = j4.a.e(c11, ListingItemBase.IS_HIDE_MY_NUMBER);
                    int e28 = j4.a.e(c11, "is_anonymous");
                    int e29 = j4.a.e(c11, "attempt_abuse");
                    int e31 = j4.a.e(c11, "geotag_lon");
                    int e32 = j4.a.e(c11, "geotag_lat");
                    int e33 = j4.a.e(c11, "repost_auto_renew");
                    int e34 = j4.a.e(c11, ListingItemBase.DO_NOT_DISTURB);
                    int e35 = j4.a.e(c11, "images");
                    int e36 = j4.a.e(c11, "images_urls");
                    int e37 = j4.a.e(c11, ListingItemDetails.VIDEO_URL);
                    int e38 = j4.a.e(c11, "video_network_url");
                    int e39 = j4.a.e(c11, "videoThumb");
                    int e41 = j4.a.e(c11, "delete_video");
                    int e42 = j4.a.e(c11, "plan_id");
                    int e43 = j4.a.e(c11, ProhibitedKeywordEntity.PROHIBITED_KEYWORDS);
                    int e44 = j4.a.e(c11, ListingItemDetails.EXTRA_INFO);
                    int e45 = j4.a.e(c11, "source_item_id");
                    int e46 = j4.a.e(c11, "has_addons");
                    int e47 = j4.a.e(c11, "allow_edit_on_district");
                    int e48 = j4.a.e(c11, "cached_adv");
                    int e49 = j4.a.e(c11, "approved_addons");
                    int e50 = j4.a.e(c11, "left_over_flag");
                    int e51 = j4.a.e(c11, "primaryImage");
                    if (c11.moveToFirst()) {
                        listingDetailsEntity = new ListingDetailsEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13));
                        listingDetailsEntity.setCategoryId(c11.isNull(e14) ? null : Integer.valueOf(c11.getInt(e14)));
                        listingDetailsEntity.setDistrictsIds(ListingDetailsEntityDao_Impl.this.__integerListConverter.fromString(c11.isNull(e15) ? null : c11.getString(e15)));
                        listingDetailsEntity.setTitle(c11.isNull(e16) ? null : c11.getString(e16));
                        listingDetailsEntity.setDescription(c11.isNull(e17) ? null : c11.getString(e17));
                        listingDetailsEntity.setContactNo(c11.isNull(e18) ? null : c11.getString(e18));
                        listingDetailsEntity.setLanguage(ListingDetailsEntityDao_Impl.this.__languageConverter.toLanguages(c11.isNull(e19) ? null : c11.getString(e19)));
                        listingDetailsEntity.setPrice(c11.isNull(e21) ? null : Double.valueOf(c11.getDouble(e21)));
                        listingDetailsEntity.setAddonsRequested(ListingDetailsEntityDao_Impl.this.__addonsRequestedConverter.toAddonsRequested(c11.isNull(e22) ? null : c11.getString(e22)));
                        listingDetailsEntity.setExtraAttrs(ListingDetailsEntityDao_Impl.this.__extraAttrConverter.toExtraAttr(c11.isNull(e23) ? null : c11.getString(e23)));
                        listingDetailsEntity.setPmEnabled(c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24)));
                        listingDetailsEntity.setVoipEnabled(c11.isNull(e25) ? null : Integer.valueOf(c11.getInt(e25)));
                        listingDetailsEntity.setDraft(c11.isNull(e26) ? null : Integer.valueOf(c11.getInt(e26)));
                        listingDetailsEntity.setHideMyNumber(c11.isNull(e27) ? null : Integer.valueOf(c11.getInt(e27)));
                        listingDetailsEntity.setAnonymous(c11.isNull(e28) ? null : Integer.valueOf(c11.getInt(e28)));
                        listingDetailsEntity.setAttemptAbuse(c11.isNull(e29) ? null : Integer.valueOf(c11.getInt(e29)));
                        listingDetailsEntity.setGeotagLon(c11.isNull(e31) ? null : Float.valueOf(c11.getFloat(e31)));
                        listingDetailsEntity.setGeotagLat(c11.isNull(e32) ? null : Float.valueOf(c11.getFloat(e32)));
                        listingDetailsEntity.setRepostAutoRenew(c11.isNull(e33) ? null : Integer.valueOf(c11.getInt(e33)));
                        listingDetailsEntity.setDoNotDisturb(c11.isNull(e34) ? null : c11.getString(e34));
                        listingDetailsEntity.setImages(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e35) ? null : c11.getString(e35)));
                        listingDetailsEntity.setImageUrls(ListingDetailsEntityDao_Impl.this.__arrayListStringConverter.toArrayListString(c11.isNull(e36) ? null : c11.getString(e36)));
                        listingDetailsEntity.setVideoFileName(c11.isNull(e37) ? null : c11.getString(e37));
                        listingDetailsEntity.setVideoUrl(c11.isNull(e38) ? null : c11.getString(e38));
                        listingDetailsEntity.setVideoThumb(c11.isNull(e39) ? null : c11.getString(e39));
                        listingDetailsEntity.setDeleteVideo(c11.isNull(e41) ? null : Integer.valueOf(c11.getInt(e41)));
                        listingDetailsEntity.setPlanId(c11.isNull(e42) ? null : Integer.valueOf(c11.getInt(e42)));
                        listingDetailsEntity.setProhibtedKeyWords(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e43) ? null : c11.getString(e43)));
                        listingDetailsEntity.setExtraInfo(ListingDetailsEntityDao_Impl.this.__extraInfoConverter.toExtraInfo(c11.isNull(e44) ? null : c11.getString(e44)));
                        listingDetailsEntity.setSourceItemId(c11.isNull(e45) ? null : Integer.valueOf(c11.getInt(e45)));
                        Integer valueOf2 = c11.isNull(e46) ? null : Integer.valueOf(c11.getInt(e46));
                        if (valueOf2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        listingDetailsEntity.setHasAddons(valueOf);
                        listingDetailsEntity.setAllowEditOnDistrict(c11.isNull(e47) ? null : Integer.valueOf(c11.getInt(e47)));
                        listingDetailsEntity.setCachedAdv(c11.isNull(e48) ? null : Integer.valueOf(c11.getInt(e48)));
                        listingDetailsEntity.setApprovedAddons(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e49) ? null : c11.getString(e49)));
                        listingDetailsEntity.setLeftOverFlag(c11.getInt(e50));
                        listingDetailsEntity.setPrimaryImage(c11.isNull(e51) ? null : c11.getString(e51));
                    } else {
                        listingDetailsEntity = null;
                    }
                    return listingDetailsEntity;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Flow<ListingDetailsEntity> getUserListingFlow() {
        final v i11 = v.i("SELECT * FROM listing_details_table LIMIT 1", 0);
        return CoroutinesRoom.a(this.__db, false, new String[]{"listing_details_table"}, new Callable<ListingDetailsEntity>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.11
            protected void finalize() {
                i11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ListingDetailsEntity call() throws Exception {
                ListingDetailsEntity listingDetailsEntity;
                Boolean valueOf;
                Cursor c11 = j4.b.c(ListingDetailsEntityDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, GetListingsBaseBody.ADV_ID);
                    int e12 = j4.a.e(c11, GetListingsBaseBody.DEVICE_ID);
                    int e13 = j4.a.e(c11, "region_id");
                    int e14 = j4.a.e(c11, "category_id");
                    int e15 = j4.a.e(c11, "districts_ids");
                    int e16 = j4.a.e(c11, "title");
                    int e17 = j4.a.e(c11, "description");
                    int e18 = j4.a.e(c11, "contact_no");
                    int e19 = j4.a.e(c11, "language");
                    int e21 = j4.a.e(c11, "asking_price");
                    int e22 = j4.a.e(c11, "addons_requested");
                    int e23 = j4.a.e(c11, AdvancedSearchBody.EXTRA_ATTRIBUTES);
                    int e24 = j4.a.e(c11, MasterDataModel.IS_PM_ENABLED);
                    int e25 = j4.a.e(c11, "is_voip_enabled");
                    int e26 = j4.a.e(c11, "is_draft");
                    int e27 = j4.a.e(c11, ListingItemBase.IS_HIDE_MY_NUMBER);
                    int e28 = j4.a.e(c11, "is_anonymous");
                    int e29 = j4.a.e(c11, "attempt_abuse");
                    int e31 = j4.a.e(c11, "geotag_lon");
                    int e32 = j4.a.e(c11, "geotag_lat");
                    int e33 = j4.a.e(c11, "repost_auto_renew");
                    int e34 = j4.a.e(c11, ListingItemBase.DO_NOT_DISTURB);
                    int e35 = j4.a.e(c11, "images");
                    int e36 = j4.a.e(c11, "images_urls");
                    int e37 = j4.a.e(c11, ListingItemDetails.VIDEO_URL);
                    int e38 = j4.a.e(c11, "video_network_url");
                    int e39 = j4.a.e(c11, "videoThumb");
                    int e41 = j4.a.e(c11, "delete_video");
                    int e42 = j4.a.e(c11, "plan_id");
                    int e43 = j4.a.e(c11, ProhibitedKeywordEntity.PROHIBITED_KEYWORDS);
                    int e44 = j4.a.e(c11, ListingItemDetails.EXTRA_INFO);
                    int e45 = j4.a.e(c11, "source_item_id");
                    int e46 = j4.a.e(c11, "has_addons");
                    int e47 = j4.a.e(c11, "allow_edit_on_district");
                    int e48 = j4.a.e(c11, "cached_adv");
                    int e49 = j4.a.e(c11, "approved_addons");
                    int e50 = j4.a.e(c11, "left_over_flag");
                    int e51 = j4.a.e(c11, "primaryImage");
                    if (c11.moveToFirst()) {
                        listingDetailsEntity = new ListingDetailsEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13));
                        listingDetailsEntity.setCategoryId(c11.isNull(e14) ? null : Integer.valueOf(c11.getInt(e14)));
                        listingDetailsEntity.setDistrictsIds(ListingDetailsEntityDao_Impl.this.__integerListConverter.fromString(c11.isNull(e15) ? null : c11.getString(e15)));
                        listingDetailsEntity.setTitle(c11.isNull(e16) ? null : c11.getString(e16));
                        listingDetailsEntity.setDescription(c11.isNull(e17) ? null : c11.getString(e17));
                        listingDetailsEntity.setContactNo(c11.isNull(e18) ? null : c11.getString(e18));
                        listingDetailsEntity.setLanguage(ListingDetailsEntityDao_Impl.this.__languageConverter.toLanguages(c11.isNull(e19) ? null : c11.getString(e19)));
                        listingDetailsEntity.setPrice(c11.isNull(e21) ? null : Double.valueOf(c11.getDouble(e21)));
                        listingDetailsEntity.setAddonsRequested(ListingDetailsEntityDao_Impl.this.__addonsRequestedConverter.toAddonsRequested(c11.isNull(e22) ? null : c11.getString(e22)));
                        listingDetailsEntity.setExtraAttrs(ListingDetailsEntityDao_Impl.this.__extraAttrConverter.toExtraAttr(c11.isNull(e23) ? null : c11.getString(e23)));
                        listingDetailsEntity.setPmEnabled(c11.isNull(e24) ? null : Integer.valueOf(c11.getInt(e24)));
                        listingDetailsEntity.setVoipEnabled(c11.isNull(e25) ? null : Integer.valueOf(c11.getInt(e25)));
                        listingDetailsEntity.setDraft(c11.isNull(e26) ? null : Integer.valueOf(c11.getInt(e26)));
                        listingDetailsEntity.setHideMyNumber(c11.isNull(e27) ? null : Integer.valueOf(c11.getInt(e27)));
                        listingDetailsEntity.setAnonymous(c11.isNull(e28) ? null : Integer.valueOf(c11.getInt(e28)));
                        listingDetailsEntity.setAttemptAbuse(c11.isNull(e29) ? null : Integer.valueOf(c11.getInt(e29)));
                        listingDetailsEntity.setGeotagLon(c11.isNull(e31) ? null : Float.valueOf(c11.getFloat(e31)));
                        listingDetailsEntity.setGeotagLat(c11.isNull(e32) ? null : Float.valueOf(c11.getFloat(e32)));
                        listingDetailsEntity.setRepostAutoRenew(c11.isNull(e33) ? null : Integer.valueOf(c11.getInt(e33)));
                        listingDetailsEntity.setDoNotDisturb(c11.isNull(e34) ? null : c11.getString(e34));
                        listingDetailsEntity.setImages(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e35) ? null : c11.getString(e35)));
                        listingDetailsEntity.setImageUrls(ListingDetailsEntityDao_Impl.this.__arrayListStringConverter.toArrayListString(c11.isNull(e36) ? null : c11.getString(e36)));
                        listingDetailsEntity.setVideoFileName(c11.isNull(e37) ? null : c11.getString(e37));
                        listingDetailsEntity.setVideoUrl(c11.isNull(e38) ? null : c11.getString(e38));
                        listingDetailsEntity.setVideoThumb(c11.isNull(e39) ? null : c11.getString(e39));
                        listingDetailsEntity.setDeleteVideo(c11.isNull(e41) ? null : Integer.valueOf(c11.getInt(e41)));
                        listingDetailsEntity.setPlanId(c11.isNull(e42) ? null : Integer.valueOf(c11.getInt(e42)));
                        listingDetailsEntity.setProhibtedKeyWords(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e43) ? null : c11.getString(e43)));
                        listingDetailsEntity.setExtraInfo(ListingDetailsEntityDao_Impl.this.__extraInfoConverter.toExtraInfo(c11.isNull(e44) ? null : c11.getString(e44)));
                        listingDetailsEntity.setSourceItemId(c11.isNull(e45) ? null : Integer.valueOf(c11.getInt(e45)));
                        Integer valueOf2 = c11.isNull(e46) ? null : Integer.valueOf(c11.getInt(e46));
                        if (valueOf2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        listingDetailsEntity.setHasAddons(valueOf);
                        listingDetailsEntity.setAllowEditOnDistrict(c11.isNull(e47) ? null : Integer.valueOf(c11.getInt(e47)));
                        listingDetailsEntity.setCachedAdv(c11.isNull(e48) ? null : Integer.valueOf(c11.getInt(e48)));
                        listingDetailsEntity.setApprovedAddons(ListingDetailsEntityDao_Impl.this.__stringListConverter.toStringList(c11.isNull(e49) ? null : c11.getString(e49)));
                        listingDetailsEntity.setLeftOverFlag(c11.getInt(e50));
                        listingDetailsEntity.setPrimaryImage(c11.isNull(e51) ? null : c11.getString(e51));
                    } else {
                        listingDetailsEntity = null;
                    }
                    return listingDetailsEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object insert(final ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.6
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                ListingDetailsEntityDao_Impl.this.__db.beginTransaction();
                try {
                    ListingDetailsEntityDao_Impl.this.__insertionAdapterOfListingDetailsEntity.insert((i) listingDetailsEntity);
                    ListingDetailsEntityDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    ListingDetailsEntityDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object update(final ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.7
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                ListingDetailsEntityDao_Impl.this.__db.beginTransaction();
                try {
                    ListingDetailsEntityDao_Impl.this.__updateAdapterOfListingDetailsEntity.handle(listingDetailsEntity);
                    ListingDetailsEntityDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    ListingDetailsEntityDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object updateId(final int i11, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.9
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = ListingDetailsEntityDao_Impl.this.__preparedStmtOfUpdateId.acquire();
                acquire.d1(1, i11);
                try {
                    ListingDetailsEntityDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    ListingDetailsEntityDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    ListingDetailsEntityDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    ListingDetailsEntityDao_Impl.this.__preparedStmtOfUpdateId.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.ListingDetailsEntityDao
    public Object updatePostUpload(final int i11, final int i12, final List<String> list, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.ListingDetailsEntityDao_Impl.10
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = ListingDetailsEntityDao_Impl.this.__preparedStmtOfUpdatePostUpload.acquire();
                acquire.d1(1, i11);
                acquire.d1(2, i12);
                String stringListConverter = ListingDetailsEntityDao_Impl.this.__stringListConverter.toString(list);
                if (stringListConverter == null) {
                    acquire.u1(3);
                } else {
                    acquire.Q0(3, stringListConverter);
                }
                try {
                    ListingDetailsEntityDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    ListingDetailsEntityDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    ListingDetailsEntityDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    ListingDetailsEntityDao_Impl.this.__preparedStmtOfUpdatePostUpload.release(acquire);
                }
            }
        }, aVar);
    }
}
