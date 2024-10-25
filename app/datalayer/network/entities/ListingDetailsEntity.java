package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.MasterDataModel;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import com.forsale.app.datalayer.network.responses.Bundle;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.OtherStatusAll;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsEntity implements Parcelable {
    public static final String IMAGE_BASE_URL = "https://media.q84sale.com/images/user_adv/resize1000/";
    public static final String VIDEO_BASE_URL = "https://media.q84sale.com/videos/";
    @c("addons_requested")
    private List<AddonsRequested> addonsRequested;
    @c("allow_edit_on_district")
    private Integer allowEditOnDistrict;
    @c("is_anonymous")
    private Integer anonymous;
    private transient List<String> approvedAddons;
    @c("attempt_abuse")
    private Integer attemptAbuse;
    private transient Bundle bundle;
    @c("cached_adv")
    private Integer cachedAdv;
    private transient CategoryEntity category;
    private transient CategoryDistrict categoryDistrict;
    @c("category_id")
    private Integer categoryId;
    @c("contact_no")
    private String contactNo;
    @c("delete_video")
    private Integer deleteVideo;
    @c("description")
    private String description;
    @c(GetListingsBaseBody.DEVICE_ID)
    private String deviceId;
    private transient List<DistrictEntity> districts;
    @c("districts_ids")
    private List<Integer> districtsIds;
    @c(ListingItemBase.DO_NOT_DISTURB)
    private String doNotDisturb;
    @c("is_draft")
    private Integer draft;
    private transient Integer expireSoon;
    @c(AdvancedSearchBody.EXTRA_ATTRIBUTES)
    private List<ExtraAttr> extraAttrs;
    @c(ListingItemDetails.EXTRA_INFO)
    private ExtraInfo extraInfo;
    @c("geotag_lat")
    private Float geotagLat;
    @c("geotag_lon")
    private Float geotagLon;
    @c("has_addons")
    private Boolean hasAddons;
    private transient Boolean hasBundle;
    @c(ListingItemBase.IS_HIDE_MY_NUMBER)
    private Integer hideMyNumber;
    @c(GetListingsBaseBody.ADV_ID)

    /* renamed from: id  reason: collision with root package name */
    private int f22332id;
    private transient ArrayList<String> imageUrls;
    @c("images")
    private List<String> images;
    @c("language")
    private Languages language;
    @c("left_over_flag")
    private int leftOverFlag;
    private transient List<OtherStatusAll> otherStatusAll;
    private transient String phone;
    private transient Integer planExtendPeriod;
    @c("plan_id")
    private Integer planId;
    private transient Integer planIsFree;
    private transient Float planPrice;
    @c(MasterDataModel.IS_PM_ENABLED)
    private Integer pmEnabled;
    @c("asking_price")
    private Double price;
    private String primaryImage;
    @c(ProhibitedKeywordEntity.PROHIBITED_KEYWORDS)
    private List<String> prohibtedKeyWords;
    @c("region_id")
    private int regionId;
    @c("repost_auto_renew")
    private Integer repostAutoRenew;
    private transient String slug;
    @c("source_item_id")
    private Integer sourceItemId;
    private final transient ItemStatus status;
    @c("title")
    private String title;
    @c(ListingItemDetails.VIDEO_URL)
    private String videoFileName;
    private String videoThumb;
    @c("video_network_url")
    private transient String videoUrl;
    private transient String virtualTourLink;
    private transient String virtualTourThumb;
    @c("is_voip_enabled")
    private Integer voipEnabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ListingDetailsEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingDetailsEntity from(ListingItemDetails item, String deviceId) {
            boolean z11;
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            Integer planId;
            Float f11;
            Integer num;
            int y11;
            o.i(item, "item");
            o.i(deviceId, "deviceId");
            int id2 = item.getId();
            String slug = item.getSlug();
            int regId = item.getRegId();
            int catId = item.getCatId();
            String title = item.getTitle();
            String desc = item.getDesc();
            String contacts = item.getContacts();
            String phone = item.getPhone();
            double price = item.getPrice();
            List<ExtraAttr> attrs = item.getAttrs();
            int isPm = item.isPm();
            int isVoip = item.isVoip();
            boolean z12 = true;
            if (item.getStatus() == ItemStatus.DRAFT) {
                z11 = true;
            } else {
                z11 = false;
            }
            int H0 = TypeExtensionsKt.H0(z11);
            ItemStatus status = item.getStatus();
            int isHideMyNumber = item.isHideMyNumber();
            int isAnon = item.isAnon();
            float lon = item.getLon();
            float lat = item.getLat();
            int isAutoRepost = item.isAutoRepost();
            String doNotDisturb = item.getDoNotDisturb();
            List<String> images = item.getImages();
            Integer num2 = null;
            if (images != null) {
                List<String> list = images;
                y11 = s.y(list, 10);
                ArrayList arrayList3 = new ArrayList(y11);
                for (String str2 : list) {
                    arrayList3.add(TypeExtensionsKt.V0(str2));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            List<String> images2 = item.getImages();
            if (images2 != null) {
                arrayList2 = new ArrayList(images2);
            } else {
                arrayList2 = new ArrayList();
            }
            String videoUrl = item.getVideoUrl();
            if (videoUrl != null) {
                str = TypeExtensionsKt.V0(videoUrl);
            } else {
                str = null;
            }
            String videoUrl2 = item.getVideoUrl();
            String videoThumb = item.getVideoThumb();
            PlansResponse.Plan plan = item.getPlan();
            if (plan == null || (planId = plan.getId()) == null) {
                planId = item.getPlanId();
            }
            ListingDetailsEntity listingDetailsEntity = new ListingDetailsEntity(id2, slug, deviceId, regId, Integer.valueOf(catId), item.getDistrictsIds(), title, desc, contacts, null, Double.valueOf(price), null, attrs, Integer.valueOf(isPm), Integer.valueOf(isVoip), Integer.valueOf(H0), status, Integer.valueOf(isHideMyNumber), Integer.valueOf(isAnon), null, Float.valueOf(lon), Float.valueOf(lat), Integer.valueOf(isAutoRepost), doNotDisturb, arrayList, arrayList2, str, videoUrl2, videoThumb, null, planId, null, phone, item.getExtraInfo(), null, item.getHasAddons(), item.getAllowEditOnDistrict(), null, null, null, null, null, null, null, 0, -1610085888, 8164, null);
            PlansResponse.Plan plan2 = item.getPlan();
            if (plan2 != null) {
                f11 = plan2.getPrice();
            } else {
                f11 = null;
            }
            listingDetailsEntity.setPlanPrice(f11);
            PlansResponse.Plan plan3 = item.getPlan();
            if (plan3 != null) {
                num = plan3.isFree();
            } else {
                num = null;
            }
            listingDetailsEntity.setPlanIsFree(num);
            PlansResponse.Plan plan4 = item.getPlan();
            if (plan4 != null) {
                num2 = plan4.getExtendPeriod();
            }
            listingDetailsEntity.setPlanExtendPeriod(num2);
            listingDetailsEntity.setDistricts(item.getDistricts());
            listingDetailsEntity.setOtherStatusAll(item.getOtherStatusAll());
            listingDetailsEntity.setExpireSoon(item.getExpireSoon());
            listingDetailsEntity.setVirtualTourLink(item.getVirtualTourUrl());
            listingDetailsEntity.setVirtualTourThumb(item.getVirtualTourThumb());
            if (item.getBundle() == null) {
                z12 = false;
            }
            listingDetailsEntity.setHasBundle(Boolean.valueOf(z12));
            return listingDetailsEntity;
        }
    }

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ListingDetailsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListingDetailsEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i11 = 0; i11 != readInt3; i11++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Languages valueOf2 = Languages.valueOf(parcel.readString());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            for (int i12 = 0; i12 != readInt4; i12++) {
                arrayList3.add(AddonsRequested.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt5);
                int i13 = 0;
                while (i13 != readInt5) {
                    arrayList4.add(ExtraAttr.CREATOR.createFromParcel(parcel));
                    i13++;
                    readInt5 = readInt5;
                }
                arrayList2 = arrayList4;
            }
            return new ListingDetailsEntity(readInt, readString, readString2, readInt2, valueOf, arrayList, readString3, readString4, readString5, valueOf2, valueOf3, arrayList3, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ItemStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : ExtraInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListingDetailsEntity[] newArray(int i11) {
            return new ListingDetailsEntity[i11];
        }
    }

    public ListingDetailsEntity(int i11, String str, String deviceId, int i12, Integer num, List<Integer> list, String str2, String str3, String str4, Languages language, Double d11, List<AddonsRequested> addonsRequested, List<ExtraAttr> list2, Integer num2, Integer num3, Integer num4, ItemStatus itemStatus, Integer num5, Integer num6, Integer num7, Float f11, Float f12, Integer num8, String str5, List<String> list3, ArrayList<String> imageUrls, String str6, String str7, String str8, Integer num9, Integer num10, List<String> list4, String str9, ExtraInfo extraInfo, Integer num11, Boolean bool, Integer num12, Integer num13, List<String> list5, Float f13, Integer num14, Integer num15, Boolean bool2, Integer num16, int i13) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        o.i(addonsRequested, "addonsRequested");
        o.i(imageUrls, "imageUrls");
        this.f22332id = i11;
        this.slug = str;
        this.deviceId = deviceId;
        this.regionId = i12;
        this.categoryId = num;
        this.districtsIds = list;
        this.title = str2;
        this.description = str3;
        this.contactNo = str4;
        this.language = language;
        this.price = d11;
        this.addonsRequested = addonsRequested;
        this.extraAttrs = list2;
        this.pmEnabled = num2;
        this.voipEnabled = num3;
        this.draft = num4;
        this.status = itemStatus;
        this.hideMyNumber = num5;
        this.anonymous = num6;
        this.attemptAbuse = num7;
        this.geotagLon = f11;
        this.geotagLat = f12;
        this.repostAutoRenew = num8;
        this.doNotDisturb = str5;
        this.images = list3;
        this.imageUrls = imageUrls;
        this.videoFileName = str6;
        this.videoUrl = str7;
        this.videoThumb = str8;
        this.deleteVideo = num9;
        this.planId = num10;
        this.prohibtedKeyWords = list4;
        this.phone = str9;
        this.extraInfo = extraInfo;
        this.sourceItemId = num11;
        this.hasAddons = bool;
        this.allowEditOnDistrict = num12;
        this.cachedAdv = num13;
        this.approvedAddons = list5;
        this.planPrice = f13;
        this.planIsFree = num14;
        this.planExtendPeriod = num15;
        this.hasBundle = bool2;
        this.expireSoon = num16;
        this.leftOverFlag = i13;
    }

    private final boolean isVideoUploaded() {
        boolean z11;
        boolean v11;
        String str = this.videoUrl;
        if (str != null) {
            v11 = kotlin.text.s.v(str);
            if (!v11) {
                z11 = false;
                if (z11 && URLUtil.isNetworkUrl(this.videoUrl)) {
                    return true;
                }
            }
        }
        z11 = true;
        return z11 ? false : false;
    }

    public final int component1() {
        return this.f22332id;
    }

    public final Languages component10() {
        return this.language;
    }

    public final Double component11() {
        return this.price;
    }

    public final List<AddonsRequested> component12() {
        return this.addonsRequested;
    }

    public final List<ExtraAttr> component13() {
        return this.extraAttrs;
    }

    public final Integer component14() {
        return this.pmEnabled;
    }

    public final Integer component15() {
        return this.voipEnabled;
    }

    public final Integer component16() {
        return this.draft;
    }

    public final ItemStatus component17() {
        return this.status;
    }

    public final Integer component18() {
        return this.hideMyNumber;
    }

    public final Integer component19() {
        return this.anonymous;
    }

    public final String component2() {
        return this.slug;
    }

    public final Integer component20() {
        return this.attemptAbuse;
    }

    public final Float component21() {
        return this.geotagLon;
    }

    public final Float component22() {
        return this.geotagLat;
    }

    public final Integer component23() {
        return this.repostAutoRenew;
    }

    public final String component24() {
        return this.doNotDisturb;
    }

    public final List<String> component25() {
        return this.images;
    }

    public final ArrayList<String> component26() {
        return this.imageUrls;
    }

    public final String component27() {
        return this.videoFileName;
    }

    public final String component28() {
        return this.videoUrl;
    }

    public final String component29() {
        return this.videoThumb;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final Integer component30() {
        return this.deleteVideo;
    }

    public final Integer component31() {
        return this.planId;
    }

    public final List<String> component32() {
        return this.prohibtedKeyWords;
    }

    public final String component33() {
        return this.phone;
    }

    public final ExtraInfo component34() {
        return this.extraInfo;
    }

    public final Integer component35() {
        return this.sourceItemId;
    }

    public final Boolean component36() {
        return this.hasAddons;
    }

    public final Integer component37() {
        return this.allowEditOnDistrict;
    }

    public final Integer component38() {
        return this.cachedAdv;
    }

    public final List<String> component39() {
        return this.approvedAddons;
    }

    public final int component4() {
        return this.regionId;
    }

    public final Float component40() {
        return this.planPrice;
    }

    public final Integer component41() {
        return this.planIsFree;
    }

    public final Integer component42() {
        return this.planExtendPeriod;
    }

    public final Boolean component43() {
        return this.hasBundle;
    }

    public final Integer component44() {
        return this.expireSoon;
    }

    public final int component45() {
        return this.leftOverFlag;
    }

    public final Integer component5() {
        return this.categoryId;
    }

    public final List<Integer> component6() {
        return this.districtsIds;
    }

    public final String component7() {
        return this.title;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.contactNo;
    }

    public final ListingDetailsEntity copy(int i11, String str, String deviceId, int i12, Integer num, List<Integer> list, String str2, String str3, String str4, Languages language, Double d11, List<AddonsRequested> addonsRequested, List<ExtraAttr> list2, Integer num2, Integer num3, Integer num4, ItemStatus itemStatus, Integer num5, Integer num6, Integer num7, Float f11, Float f12, Integer num8, String str5, List<String> list3, ArrayList<String> imageUrls, String str6, String str7, String str8, Integer num9, Integer num10, List<String> list4, String str9, ExtraInfo extraInfo, Integer num11, Boolean bool, Integer num12, Integer num13, List<String> list5, Float f13, Integer num14, Integer num15, Boolean bool2, Integer num16, int i13) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        o.i(addonsRequested, "addonsRequested");
        o.i(imageUrls, "imageUrls");
        return new ListingDetailsEntity(i11, str, deviceId, i12, num, list, str2, str3, str4, language, d11, addonsRequested, list2, num2, num3, num4, itemStatus, num5, num6, num7, f11, f12, num8, str5, list3, imageUrls, str6, str7, str8, num9, num10, list4, str9, extraInfo, num11, bool, num12, num13, list5, f13, num14, num15, bool2, num16, i13);
    }

    public final void deleteVideo() {
        if (URLUtil.isNetworkUrl(this.videoUrl)) {
            this.deleteVideo = Integer.valueOf(TypeExtensionsKt.H0(true));
        }
        this.videoUrl = null;
        this.videoFileName = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingDetailsEntity)) {
            return false;
        }
        ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) obj;
        if (this.f22332id == listingDetailsEntity.f22332id && o.d(this.slug, listingDetailsEntity.slug) && o.d(this.deviceId, listingDetailsEntity.deviceId) && this.regionId == listingDetailsEntity.regionId && o.d(this.categoryId, listingDetailsEntity.categoryId) && o.d(this.districtsIds, listingDetailsEntity.districtsIds) && o.d(this.title, listingDetailsEntity.title) && o.d(this.description, listingDetailsEntity.description) && o.d(this.contactNo, listingDetailsEntity.contactNo) && this.language == listingDetailsEntity.language && o.d(this.price, listingDetailsEntity.price) && o.d(this.addonsRequested, listingDetailsEntity.addonsRequested) && o.d(this.extraAttrs, listingDetailsEntity.extraAttrs) && o.d(this.pmEnabled, listingDetailsEntity.pmEnabled) && o.d(this.voipEnabled, listingDetailsEntity.voipEnabled) && o.d(this.draft, listingDetailsEntity.draft) && this.status == listingDetailsEntity.status && o.d(this.hideMyNumber, listingDetailsEntity.hideMyNumber) && o.d(this.anonymous, listingDetailsEntity.anonymous) && o.d(this.attemptAbuse, listingDetailsEntity.attemptAbuse) && o.d(this.geotagLon, listingDetailsEntity.geotagLon) && o.d(this.geotagLat, listingDetailsEntity.geotagLat) && o.d(this.repostAutoRenew, listingDetailsEntity.repostAutoRenew) && o.d(this.doNotDisturb, listingDetailsEntity.doNotDisturb) && o.d(this.images, listingDetailsEntity.images) && o.d(this.imageUrls, listingDetailsEntity.imageUrls) && o.d(this.videoFileName, listingDetailsEntity.videoFileName) && o.d(this.videoUrl, listingDetailsEntity.videoUrl) && o.d(this.videoThumb, listingDetailsEntity.videoThumb) && o.d(this.deleteVideo, listingDetailsEntity.deleteVideo) && o.d(this.planId, listingDetailsEntity.planId) && o.d(this.prohibtedKeyWords, listingDetailsEntity.prohibtedKeyWords) && o.d(this.phone, listingDetailsEntity.phone) && o.d(this.extraInfo, listingDetailsEntity.extraInfo) && o.d(this.sourceItemId, listingDetailsEntity.sourceItemId) && o.d(this.hasAddons, listingDetailsEntity.hasAddons) && o.d(this.allowEditOnDistrict, listingDetailsEntity.allowEditOnDistrict) && o.d(this.cachedAdv, listingDetailsEntity.cachedAdv) && o.d(this.approvedAddons, listingDetailsEntity.approvedAddons) && o.d(this.planPrice, listingDetailsEntity.planPrice) && o.d(this.planIsFree, listingDetailsEntity.planIsFree) && o.d(this.planExtendPeriod, listingDetailsEntity.planExtendPeriod) && o.d(this.hasBundle, listingDetailsEntity.hasBundle) && o.d(this.expireSoon, listingDetailsEntity.expireSoon) && this.leftOverFlag == listingDetailsEntity.leftOverFlag) {
            return true;
        }
        return false;
    }

    public final List<AddonsRequested> getAddonsRequested() {
        return this.addonsRequested;
    }

    public final Integer getAllowEditOnDistrict() {
        return this.allowEditOnDistrict;
    }

    public final Integer getAnonymous() {
        return this.anonymous;
    }

    public final List<String> getApprovedAddons() {
        return this.approvedAddons;
    }

    public final Integer getAttemptAbuse() {
        return this.attemptAbuse;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final Integer getCachedAdv() {
        return this.cachedAdv;
    }

    public final CategoryEntity getCategory() {
        return this.category;
    }

    public final CategoryDistrict getCategoryDistrict() {
        return this.categoryDistrict;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final Integer getDeleteVideo() {
        return this.deleteVideo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<DistrictEntity> getDistricts() {
        return this.districts;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final String getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final Integer getDraft() {
        return this.draft;
    }

    public final Integer getExpireSoon() {
        return this.expireSoon;
    }

    public final List<ExtraAttr> getExtraAttrs() {
        return this.extraAttrs;
    }

    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final Float getGeotagLat() {
        return this.geotagLat;
    }

    public final Float getGeotagLon() {
        return this.geotagLon;
    }

    public final Boolean getHasAddons() {
        return this.hasAddons;
    }

    public final Boolean getHasBundle() {
        return this.hasBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasMedia() {
        /*
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.imageUrls
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L2d
            java.lang.String r0 = r3.videoFileName
            r2 = 0
            if (r0 == 0) goto L18
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L16
            goto L18
        L16:
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L2d
            java.lang.String r0 = r3.videoUrl
            if (r0 == 0) goto L28
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.ListingDetailsEntity.getHasMedia():boolean");
    }

    public final boolean getHasMediaUploaded() {
        if (!isImagesUploaded() && !isVideoUploaded()) {
            return false;
        }
        return true;
    }

    public final Integer getHideMyNumber() {
        return this.hideMyNumber;
    }

    public final int getId() {
        return this.f22332id;
    }

    public final ArrayList<String> getImageUrls() {
        return this.imageUrls;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final Languages getLanguage() {
        return this.language;
    }

    public final int getLeftOverFlag() {
        return this.leftOverFlag;
    }

    public final List<OtherStatusAll> getOtherStatusAll() {
        return this.otherStatusAll;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Integer getPlanExtendPeriod() {
        return this.planExtendPeriod;
    }

    public final Integer getPlanId() {
        return this.planId;
    }

    public final Integer getPlanIsFree() {
        return this.planIsFree;
    }

    public final Float getPlanPrice() {
        return this.planPrice;
    }

    public final Integer getPmEnabled() {
        return this.pmEnabled;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final String getPrimaryImage() {
        return this.primaryImage;
    }

    public final List<String> getProhibtedKeyWords() {
        return this.prohibtedKeyWords;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final Integer getRepostAutoRenew() {
        return this.repostAutoRenew;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final Integer getSourceItemId() {
        return this.sourceItemId;
    }

    public final ItemStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVideoFileName() {
        return this.videoFileName;
    }

    public final String getVideoThumb() {
        return this.videoThumb;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getVirtualTourLink() {
        return this.virtualTourLink;
    }

    public final String getVirtualTourThumb() {
        return this.virtualTourThumb;
    }

    public final Integer getVoipEnabled() {
        return this.voipEnabled;
    }

    public final boolean hasLocation() {
        float f11;
        boolean z11;
        float f12;
        boolean z12;
        Float f13 = this.geotagLat;
        if (f13 != null) {
            f11 = f13.floatValue();
        } else {
            f11 = 0.0f;
        }
        if (f11 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Float f14 = this.geotagLon;
            if (f14 != null) {
                f12 = f14.floatValue();
            } else {
                f12 = 0.0f;
            }
            if (f12 == 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38 = Integer.hashCode(this.f22332id) * 31;
        String str = this.slug;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode39 = (((((hashCode38 + hashCode) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31;
        Integer num = this.categoryId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (hashCode39 + hashCode2) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.title;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str4 = this.contactNo;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int hashCode40 = (((i15 + hashCode6) * 31) + this.language.hashCode()) * 31;
        Double d11 = this.price;
        if (d11 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = d11.hashCode();
        }
        int hashCode41 = (((hashCode40 + hashCode7) * 31) + this.addonsRequested.hashCode()) * 31;
        List<ExtraAttr> list2 = this.extraAttrs;
        if (list2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list2.hashCode();
        }
        int i16 = (hashCode41 + hashCode8) * 31;
        Integer num2 = this.pmEnabled;
        if (num2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num2.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        Integer num3 = this.voipEnabled;
        if (num3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num3.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Integer num4 = this.draft;
        if (num4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num4.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = itemStatus.hashCode();
        }
        int i21 = (i19 + hashCode12) * 31;
        Integer num5 = this.hideMyNumber;
        if (num5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num5.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        Integer num6 = this.anonymous;
        if (num6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num6.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        Integer num7 = this.attemptAbuse;
        if (num7 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num7.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        Float f11 = this.geotagLon;
        if (f11 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = f11.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        Float f12 = this.geotagLat;
        if (f12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = f12.hashCode();
        }
        int i26 = (i25 + hashCode17) * 31;
        Integer num8 = this.repostAutoRenew;
        if (num8 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num8.hashCode();
        }
        int i27 = (i26 + hashCode18) * 31;
        String str5 = this.doNotDisturb;
        if (str5 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str5.hashCode();
        }
        int i28 = (i27 + hashCode19) * 31;
        List<String> list3 = this.images;
        if (list3 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = list3.hashCode();
        }
        int hashCode42 = (((i28 + hashCode20) * 31) + this.imageUrls.hashCode()) * 31;
        String str6 = this.videoFileName;
        if (str6 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str6.hashCode();
        }
        int i29 = (hashCode42 + hashCode21) * 31;
        String str7 = this.videoUrl;
        if (str7 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str7.hashCode();
        }
        int i31 = (i29 + hashCode22) * 31;
        String str8 = this.videoThumb;
        if (str8 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str8.hashCode();
        }
        int i32 = (i31 + hashCode23) * 31;
        Integer num9 = this.deleteVideo;
        if (num9 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = num9.hashCode();
        }
        int i33 = (i32 + hashCode24) * 31;
        Integer num10 = this.planId;
        if (num10 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = num10.hashCode();
        }
        int i34 = (i33 + hashCode25) * 31;
        List<String> list4 = this.prohibtedKeyWords;
        if (list4 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = list4.hashCode();
        }
        int i35 = (i34 + hashCode26) * 31;
        String str9 = this.phone;
        if (str9 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str9.hashCode();
        }
        int i36 = (i35 + hashCode27) * 31;
        ExtraInfo extraInfo = this.extraInfo;
        if (extraInfo == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = extraInfo.hashCode();
        }
        int i37 = (i36 + hashCode28) * 31;
        Integer num11 = this.sourceItemId;
        if (num11 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = num11.hashCode();
        }
        int i38 = (i37 + hashCode29) * 31;
        Boolean bool = this.hasAddons;
        if (bool == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool.hashCode();
        }
        int i39 = (i38 + hashCode30) * 31;
        Integer num12 = this.allowEditOnDistrict;
        if (num12 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = num12.hashCode();
        }
        int i41 = (i39 + hashCode31) * 31;
        Integer num13 = this.cachedAdv;
        if (num13 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = num13.hashCode();
        }
        int i42 = (i41 + hashCode32) * 31;
        List<String> list5 = this.approvedAddons;
        if (list5 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = list5.hashCode();
        }
        int i43 = (i42 + hashCode33) * 31;
        Float f13 = this.planPrice;
        if (f13 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = f13.hashCode();
        }
        int i44 = (i43 + hashCode34) * 31;
        Integer num14 = this.planIsFree;
        if (num14 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = num14.hashCode();
        }
        int i45 = (i44 + hashCode35) * 31;
        Integer num15 = this.planExtendPeriod;
        if (num15 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = num15.hashCode();
        }
        int i46 = (i45 + hashCode36) * 31;
        Boolean bool2 = this.hasBundle;
        if (bool2 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = bool2.hashCode();
        }
        int i47 = (i46 + hashCode37) * 31;
        Integer num16 = this.expireSoon;
        if (num16 != null) {
            i11 = num16.hashCode();
        }
        return ((i47 + i11) * 31) + Integer.hashCode(this.leftOverFlag);
    }

    public final boolean isEditMode() {
        if (this.f22332id != -1) {
            return true;
        }
        return false;
    }

    public final boolean isImagesUploaded() {
        Object obj;
        if (!this.imageUrls.isEmpty()) {
            Iterator<T> it2 = this.imageUrls.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (URLUtil.isNetworkUrl((String) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void prepareAttributesBeforeSave() {
        ArrayList<ExtraAttr> arrayList;
        List<ExtraAttr> list = this.extraAttrs;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!o.d(((ExtraAttr) obj).getValue(), "-1")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.extraAttrs = arrayList;
        if (arrayList != null) {
            for (ExtraAttr extraAttr : arrayList) {
                if (TypeExtensionsKt.P(extraAttr.getValue())) {
                    extraAttr.setValue(TypeExtensionsKt.V0(extraAttr.getValue()));
                }
            }
        }
    }

    public final void prepareMedia() {
        int y11;
        Iterator<String> it2 = this.imageUrls.iterator();
        o.h(it2, "iterator(...)");
        while (it2.hasNext()) {
            String next = it2.next();
            o.h(next, "next(...)");
            if (!URLUtil.isNetworkUrl(next)) {
                it2.remove();
            }
        }
        ArrayList<String> arrayList = this.imageUrls;
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (String str : arrayList) {
            arrayList2.add(TypeExtensionsKt.V0(str));
        }
        this.images = arrayList2;
        if (!URLUtil.isNetworkUrl(this.videoUrl)) {
            this.videoUrl = null;
            this.videoFileName = null;
        }
    }

    public final void setAddonsRequested(List<AddonsRequested> list) {
        o.i(list, "<set-?>");
        this.addonsRequested = list;
    }

    public final void setAllowEditOnDistrict(Integer num) {
        this.allowEditOnDistrict = num;
    }

    public final void setAnonymous(Integer num) {
        this.anonymous = num;
    }

    public final void setApprovedAddons(List<String> list) {
        this.approvedAddons = list;
    }

    public final void setAttemptAbuse(Integer num) {
        this.attemptAbuse = num;
    }

    public final void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setCachedAdv(Integer num) {
        this.cachedAdv = num;
    }

    public final void setCategory(CategoryEntity categoryEntity) {
        if (categoryEntity != null) {
            this.categoryId = Integer.valueOf(categoryEntity.getId());
            this.category = categoryEntity;
        }
    }

    public final void setCategoryDistrict(CategoryDistrict categoryDistrict) {
        if (categoryDistrict != null) {
            this.categoryDistrict = categoryDistrict;
        }
    }

    public final void setCategoryId(Integer num) {
        this.categoryId = num;
    }

    public final void setContactNo(String str) {
        this.contactNo = str;
    }

    public final void setDeleteVideo(Integer num) {
        this.deleteVideo = num;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDeviceId(String str) {
        o.i(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setDistricts(List<DistrictEntity> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (DistrictEntity districtEntity : list) {
                arrayList.add(Integer.valueOf(districtEntity.getId()));
            }
            this.districtsIds = arrayList;
            this.districts = list;
        }
    }

    public final void setDistrictsIds(List<Integer> list) {
        this.districtsIds = list;
    }

    public final void setDoNotDisturb(String str) {
        this.doNotDisturb = str;
    }

    public final void setDraft(Integer num) {
        this.draft = num;
    }

    public final void setExpireSoon(Integer num) {
        this.expireSoon = num;
    }

    public final void setExtraAttrs(List<ExtraAttr> list) {
        this.extraAttrs = list;
    }

    public final void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public final void setGeotagLat(Float f11) {
        this.geotagLat = f11;
    }

    public final void setGeotagLon(Float f11) {
        this.geotagLon = f11;
    }

    public final void setHasAddons(Boolean bool) {
        this.hasAddons = bool;
    }

    public final void setHasBundle(Boolean bool) {
        this.hasBundle = bool;
    }

    public final void setHideMyNumber(Integer num) {
        this.hideMyNumber = num;
    }

    public final void setId(int i11) {
        this.f22332id = i11;
    }

    public final void setImageUrls(ArrayList<String> arrayList) {
        o.i(arrayList, "<set-?>");
        this.imageUrls = arrayList;
    }

    public final void setImages(List<String> list) {
        this.images = list;
    }

    public final void setLanguage(Languages languages) {
        o.i(languages, "<set-?>");
        this.language = languages;
    }

    public final void setLeftOverFlag(int i11) {
        this.leftOverFlag = i11;
    }

    public final void setMediaData(ArrayList<String> arrayList, String str) {
        boolean z11;
        boolean N;
        int y11;
        int y12;
        boolean N2;
        String str2 = null;
        if (arrayList != null) {
            this.imageUrls.clear();
            ArrayList<String> arrayList2 = this.imageUrls;
            y11 = s.y(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(y11);
            for (String str3 : arrayList) {
                if (!URLUtil.isNetworkUrl(str3)) {
                    N2 = StringsKt__StringsKt.N(str3, "/", false, 2, null);
                    if (!N2) {
                        str3 = IMAGE_BASE_URL + str3;
                    }
                }
                arrayList3.add(str3);
            }
            arrayList2.addAll(arrayList3);
            ArrayList<String> arrayList4 = this.imageUrls;
            y12 = s.y(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(y12);
            for (String str4 : arrayList4) {
                arrayList5.add(TypeExtensionsKt.V0(str4));
            }
            this.images = arrayList5;
        }
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!(true ^ z11)) {
            str = null;
        }
        if (str != null) {
            if (!URLUtil.isNetworkUrl(str)) {
                N = StringsKt__StringsKt.N(str, "/", false, 2, null);
                if (!N) {
                    str = VIDEO_BASE_URL + str;
                }
            }
            this.videoUrl = str;
            if (str != null) {
                str2 = TypeExtensionsKt.V0(str);
            }
            this.videoFileName = str2;
        }
    }

    public final void setOtherStatusAll(List<OtherStatusAll> list) {
        if (list != null) {
            this.otherStatusAll = list;
        }
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPlanExtendPeriod(Integer num) {
        this.planExtendPeriod = num;
    }

    public final void setPlanId(Integer num) {
        this.planId = num;
    }

    public final void setPlanIsFree(Integer num) {
        this.planIsFree = num;
    }

    public final void setPlanPrice(Float f11) {
        this.planPrice = f11;
    }

    public final void setPmEnabled(Integer num) {
        this.pmEnabled = num;
    }

    public final void setPrice(Double d11) {
        this.price = d11;
    }

    public final void setPrimaryImage(String str) {
        this.primaryImage = str;
    }

    public final void setProhibtedKeyWords(List<String> list) {
        this.prohibtedKeyWords = list;
    }

    public final void setRegionId(int i11) {
        this.regionId = i11;
    }

    public final void setRepostAutoRenew(Integer num) {
        this.repostAutoRenew = num;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final void setSourceItemId(Integer num) {
        this.sourceItemId = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVideoFileName(String str) {
        this.videoFileName = str;
    }

    public final void setVideoThumb(String str) {
        this.videoThumb = str;
    }

    public final void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public final void setVirtualTourLink(String str) {
        this.virtualTourLink = str;
    }

    public final void setVirtualTourThumb(String str) {
        this.virtualTourThumb = str;
    }

    public final void setVoipEnabled(Integer num) {
        this.voipEnabled = num;
    }

    public String toString() {
        int i11 = this.f22332id;
        String str = this.slug;
        String str2 = this.deviceId;
        int i12 = this.regionId;
        Integer num = this.categoryId;
        List<Integer> list = this.districtsIds;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.contactNo;
        Languages languages = this.language;
        Double d11 = this.price;
        List<AddonsRequested> list2 = this.addonsRequested;
        List<ExtraAttr> list3 = this.extraAttrs;
        Integer num2 = this.pmEnabled;
        Integer num3 = this.voipEnabled;
        Integer num4 = this.draft;
        ItemStatus itemStatus = this.status;
        Integer num5 = this.hideMyNumber;
        Integer num6 = this.anonymous;
        Integer num7 = this.attemptAbuse;
        Float f11 = this.geotagLon;
        Float f12 = this.geotagLat;
        Integer num8 = this.repostAutoRenew;
        String str6 = this.doNotDisturb;
        List<String> list4 = this.images;
        ArrayList<String> arrayList = this.imageUrls;
        String str7 = this.videoFileName;
        String str8 = this.videoUrl;
        String str9 = this.videoThumb;
        Integer num9 = this.deleteVideo;
        Integer num10 = this.planId;
        List<String> list5 = this.prohibtedKeyWords;
        String str10 = this.phone;
        ExtraInfo extraInfo = this.extraInfo;
        Integer num11 = this.sourceItemId;
        Boolean bool = this.hasAddons;
        Integer num12 = this.allowEditOnDistrict;
        Integer num13 = this.cachedAdv;
        List<String> list6 = this.approvedAddons;
        Float f13 = this.planPrice;
        Integer num14 = this.planIsFree;
        Integer num15 = this.planExtendPeriod;
        Boolean bool2 = this.hasBundle;
        Integer num16 = this.expireSoon;
        int i13 = this.leftOverFlag;
        return "ListingDetailsEntity(id=" + i11 + ", slug=" + str + ", deviceId=" + str2 + ", regionId=" + i12 + ", categoryId=" + num + ", districtsIds=" + list + ", title=" + str3 + ", description=" + str4 + ", contactNo=" + str5 + ", language=" + languages + ", price=" + d11 + ", addonsRequested=" + list2 + ", extraAttrs=" + list3 + ", pmEnabled=" + num2 + ", voipEnabled=" + num3 + ", draft=" + num4 + ", status=" + itemStatus + ", hideMyNumber=" + num5 + ", anonymous=" + num6 + ", attemptAbuse=" + num7 + ", geotagLon=" + f11 + ", geotagLat=" + f12 + ", repostAutoRenew=" + num8 + ", doNotDisturb=" + str6 + ", images=" + list4 + ", imageUrls=" + arrayList + ", videoFileName=" + str7 + ", videoUrl=" + str8 + ", videoThumb=" + str9 + ", deleteVideo=" + num9 + ", planId=" + num10 + ", prohibtedKeyWords=" + list5 + ", phone=" + str10 + ", extraInfo=" + extraInfo + ", sourceItemId=" + num11 + ", hasAddons=" + bool + ", allowEditOnDistrict=" + num12 + ", cachedAdv=" + num13 + ", approvedAddons=" + list6 + ", planPrice=" + f13 + ", planIsFree=" + num14 + ", planExtendPeriod=" + num15 + ", hasBundle=" + bool2 + ", expireSoon=" + num16 + ", leftOverFlag=" + i13 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f22332id);
        out.writeString(this.slug);
        out.writeString(this.deviceId);
        out.writeInt(this.regionId);
        Integer num = this.categoryId;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<Integer> list = this.districtsIds;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Integer num2 : list) {
                out.writeInt(num2.intValue());
            }
        }
        out.writeString(this.title);
        out.writeString(this.description);
        out.writeString(this.contactNo);
        out.writeString(this.language.name());
        Double d11 = this.price;
        if (d11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d11.doubleValue());
        }
        List<AddonsRequested> list2 = this.addonsRequested;
        out.writeInt(list2.size());
        for (AddonsRequested addonsRequested : list2) {
            addonsRequested.writeToParcel(out, i11);
        }
        List<ExtraAttr> list3 = this.extraAttrs;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list3.size());
            for (ExtraAttr extraAttr : list3) {
                extraAttr.writeToParcel(out, i11);
            }
        }
        Integer num3 = this.pmEnabled;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.voipEnabled;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.draft;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(itemStatus.name());
        }
        Integer num6 = this.hideMyNumber;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num6.intValue());
        }
        Integer num7 = this.anonymous;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num7.intValue());
        }
        Integer num8 = this.attemptAbuse;
        if (num8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num8.intValue());
        }
        Float f11 = this.geotagLon;
        if (f11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f11.floatValue());
        }
        Float f12 = this.geotagLat;
        if (f12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f12.floatValue());
        }
        Integer num9 = this.repostAutoRenew;
        if (num9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num9.intValue());
        }
        out.writeString(this.doNotDisturb);
        out.writeStringList(this.images);
        out.writeStringList(this.imageUrls);
        out.writeString(this.videoFileName);
        out.writeString(this.videoUrl);
        out.writeString(this.videoThumb);
        Integer num10 = this.deleteVideo;
        if (num10 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num10.intValue());
        }
        Integer num11 = this.planId;
        if (num11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num11.intValue());
        }
        out.writeStringList(this.prohibtedKeyWords);
        out.writeString(this.phone);
        ExtraInfo extraInfo = this.extraInfo;
        if (extraInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            extraInfo.writeToParcel(out, i11);
        }
        Integer num12 = this.sourceItemId;
        if (num12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num12.intValue());
        }
        Boolean bool = this.hasAddons;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num13 = this.allowEditOnDistrict;
        if (num13 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num13.intValue());
        }
        Integer num14 = this.cachedAdv;
        if (num14 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num14.intValue());
        }
        out.writeStringList(this.approvedAddons);
        Float f13 = this.planPrice;
        if (f13 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f13.floatValue());
        }
        Integer num15 = this.planIsFree;
        if (num15 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num15.intValue());
        }
        Integer num16 = this.planExtendPeriod;
        if (num16 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num16.intValue());
        }
        Boolean bool2 = this.hasBundle;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num17 = this.expireSoon;
        if (num17 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num17.intValue());
        }
        out.writeInt(this.leftOverFlag);
    }

    public final void setHideMyNumber(int i11) {
        this.hideMyNumber = Integer.valueOf(i11);
        this.anonymous = Integer.valueOf(i11);
    }

    public static /* synthetic */ void getBundle$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCategoryDistrict$annotations() {
    }

    public static /* synthetic */ void getDistricts$annotations() {
    }

    public static /* synthetic */ void getOtherStatusAll$annotations() {
    }

    public static /* synthetic */ void getPrimaryImage$annotations() {
    }

    public static /* synthetic */ void getVirtualTourLink$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ListingDetailsEntity(int r50, java.lang.String r51, java.lang.String r52, int r53, java.lang.Integer r54, java.util.List r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, com.forsale.app.utils.Languages r59, java.lang.Double r60, java.util.List r61, java.util.List r62, java.lang.Integer r63, java.lang.Integer r64, java.lang.Integer r65, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r66, java.lang.Integer r67, java.lang.Integer r68, java.lang.Integer r69, java.lang.Float r70, java.lang.Float r71, java.lang.Integer r72, java.lang.String r73, java.util.List r74, java.util.ArrayList r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.Integer r79, java.lang.Integer r80, java.util.List r81, java.lang.String r82, com.forsale.app.datalayer.network.entities.ExtraInfo r83, java.lang.Integer r84, java.lang.Boolean r85, java.lang.Integer r86, java.lang.Integer r87, java.util.List r88, java.lang.Float r89, java.lang.Integer r90, java.lang.Integer r91, java.lang.Boolean r92, java.lang.Integer r93, int r94, int r95, int r96, kotlin.jvm.internal.DefaultConstructorMarker r97) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.ListingDetailsEntity.<init>(int, java.lang.String, java.lang.String, int, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.forsale.app.utils.Languages, java.lang.Double, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.String, java.util.List, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.String, com.forsale.app.datalayer.network.entities.ExtraInfo, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ListingDetailsEntity(int r50, java.lang.String r51, int r52) {
        /*
            r49 = this;
            r0 = r49
            r1 = r50
            r3 = r51
            r4 = r52
            java.lang.String r2 = "deviceId"
            r5 = r51
            kotlin.jvm.internal.o.i(r5, r2)
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.forsale.app.utils.LocaleManager r10 = com.forsale.app.utils.LocaleManager.f39597a
            com.forsale.app.utils.Languages r10 = r10.g()
            r11 = 0
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            java.util.List r12 = kotlin.collections.p.n()
            r13 = 0
            r14 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = r14
            r16 = r14
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            java.util.ArrayList r27 = new java.util.ArrayList
            r26 = r27
            r27.<init>()
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 8160(0x1fe0, float:1.1435E-41)
            r48 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.ListingDetailsEntity.<init>(int, java.lang.String, int):void");
    }
}
