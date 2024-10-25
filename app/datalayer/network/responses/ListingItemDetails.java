package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.ExtraStatusNote;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingExtendStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSource;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.datalayer.network.responses.listingdetails.OtherStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.OtherStatusAll;
import com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType;
import com.forsale.app.features.categories.listingdetails.a;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingItemDetails.kt */
/* loaded from: classes2.dex */
public final class ListingItemDetails extends ListingItemBase {
    public static final String ARCHIVED_BY = "archived_by";
    public static final String ARCHIVED_ON = "archived_on";
    public static final String ARCHIVE_REASON = "archive_reason";
    public static final String ATTRIBUTES = "attrs";
    public static final String CALL_COUNT = "call_count";
    public static final String DATE_CREATED = "date_created";
    public static final String DATE_EXPIRED = "date_expired";
    public static final String DISTRICTS = "districts";
    public static final String DISTRICTS_IDs = "districts_ids";
    public static final String DIST_ID = "dist_id";
    public static final String ENC_ID = "enc_id";
    public static final String EXTEND_STATUS = "extend_status";
    public static final String EXTRA_INFO = "extra_info";
    public static final String FAVOURITE_COUNT = "favourite_count";
    public static final String IS_AUTO_REPOST = "is_auto_repost";
    public static final String IS_FAVORITE = "is_favorite";
    public static final String IS_PM = "is_pm";
    public static final String OTHER_STATUS = "other_status";
    public static final String OTHER_STATUS_ALL = "other_status_all";
    public static final String PIN_STATUS = "pin_status";
    public static final String PLAN = "plan";
    public static final String PM_IDENTIFIER = "pm_identifier";
    public static final String PROMOTE_STATUS = "promote_status";
    public static final String SOURCE_APP = "source_app";
    public static final String STATUS_NOTES = "status_notes";
    public static final String TRANSLATION_DESC = "translation_desc";
    public static final String TRANSLATION_ORIGINAL_LANG = "translation_original_lang";
    public static final String TRANSLATION_TITLE = "translation_title";
    public static final String VIDEO_THUMB = "video_thumb";
    public static final String VIDEO_URL = "video_url";
    public static final String VIEW_COUNT = "view_count";
    public static final String VIRTUAL_TOUR_THUMB = "virtual_tour_thumb";
    public static final String VIRTUAL_TOUR_URL = "virtual_tour_url";
    @c("allow_edit_on_district")
    private final Integer allowEditOnDistrict;
    @c(ARCHIVE_REASON)
    private final String archiveReason;
    @c(ARCHIVED_BY)
    private final ListingArchivedBy archivedBy;
    @c(ARCHIVED_ON)
    private final String archived_on;
    @c(ATTRIBUTES)
    private final List<ExtraAttr> attrs;
    @c("bundle")
    private final BundleDetails bundle;
    @c(CALL_COUNT)
    private final int callCount;
    @c("cat_id")
    private final int catId;
    private final String contact;
    private final String contacts;
    @c(DATE_CREATED)
    private final String dateCreated;
    @c(DATE_EXPIRED)
    private final String dateExpired;
    @c(ListingItemBase.DATE_PUBLISHED)
    private final String datePublished;
    @c(ListingItemBase.DATE_SORT)
    private final String dateSort;
    private final String desc;
    @c(DIST_ID)
    private final int distId;
    @c("districts")
    private transient List<DistrictEntity> districts;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c(ListingItemBase.DO_NOT_DISTURB)
    private final String doNotDisturb;
    @c(ENC_ID)
    private final int encId;
    @c(ListingItemBase.EXPIRE_SOON)
    private transient Integer expireSoon;
    @c(EXTEND_STATUS)
    private final ListingExtendStatus extendStatus;
    @c(EXTRA_INFO)
    private final ExtraInfo extraInfo;
    @c(STATUS_NOTES)
    private final List<ExtraStatusNote> extraStatusNotes;
    @c(FAVOURITE_COUNT)
    private final int favCount;
    @c("has_addons")
    private final Boolean hasAddons;

    /* renamed from: id  reason: collision with root package name */
    private final int f22353id;
    private final List<String> images;
    @c(ListingItemBase.IMAGES_COUNT)
    private final int imagesCount;
    @c(ListingItemBase.IS_ANON)
    private final int isAnon;
    @c(IS_AUTO_REPOST)
    private final int isAutoRepost;
    @c(IS_FAVORITE)
    private int isFavorite;
    @c(ListingItemBase.IS_HIDE_MY_NUMBER)
    private final int isHideMyNumber;
    @c(IS_PM)
    private final int isPm;
    @c(ListingItemBase.IS_PREM)
    private final int isPrem;
    @c(ListingItemBase.IS_VIDEO_PAID)
    private final int isVideoPaid;
    @c(ListingItemBase.IS_VOIP)
    private final int isVoip;
    private final float lat;
    @c("listing_type")
    private final UploadedListingType listingType;
    private final float lon;
    @c(OTHER_STATUS)
    private final List<OtherStatus> otherStatus;
    @c(OTHER_STATUS_ALL)
    private final List<OtherStatusAll> otherStatusAll;
    private final int paid;
    private final String phone;
    @c(PIN_STATUS)
    private final List<ListingPinOption> pinStatus;
    @c(PLAN)
    private final PlansResponse.Plan plan;
    @c("plan_id")
    private final Integer planId;
    @c(PM_IDENTIFIER)
    private final String pmIdentifier;
    private final double price;
    @c(PROMOTE_STATUS)
    private final List<ListingPinOption> promoteStatus;
    @c(ListingItemBase.REG_ID)
    private final int regId;
    @c(CategoryEntity.SLUG)
    private final String slug;
    private final ListingSource source;
    @c(SOURCE_APP)
    private final ListingSourceApp sourceApp;
    private final ItemStatus status;
    private final String title;
    @c(TRANSLATION_DESC)
    private final String translationDesc;
    @c(TRANSLATION_ORIGINAL_LANG)
    private final String translationOriginalLang;
    @c(TRANSLATION_TITLE)
    private final String translationTitle;
    private final ListingType type;
    private final String url;
    private final ListingUser user;
    @c(VIDEO_THUMB)
    private final String videoThumb;
    @c(VIDEO_URL)
    private final String videoUrl;
    @c(VIEW_COUNT)
    private final int viewCount;
    @c("virtual_tour_thumb")
    private final String virtualTourThumb;
    @c(VIRTUAL_TOUR_URL)
    private final String virtualTourUrl;
    @c(ListingItemBase.WAS_PROMOTED)
    private final int wasPromoted;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ListingItemDetails.kt */
    /* loaded from: classes2.dex */
    public static final class BundleDetails implements Parcelable {
        @c("bundle_status")
        private final List<BundleStatus> bundleStatus;
        @c("name")
        private final String name;
        @c("price")
        private final float price;
        public static final Parcelable.Creator<BundleDetails> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ListingItemDetails.kt */
        /* loaded from: classes2.dex */
        public static final class BundleStatus implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<BundleStatus> CREATOR = new Creator();
            @c("hint")
            private final Hint hint;
            @c("icon")
            private final String icon;
            @c("text")
            private final String text;

            /* compiled from: ListingItemDetails.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BundleStatus> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BundleStatus createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    return new BundleStatus(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BundleStatus[] newArray(int i11) {
                    return new BundleStatus[i11];
                }
            }

            public BundleStatus(String icon, String text, Hint hint) {
                o.i(icon, "icon");
                o.i(text, "text");
                this.icon = icon;
                this.text = text;
                this.hint = hint;
            }

            public static /* synthetic */ BundleStatus copy$default(BundleStatus bundleStatus, String str, String str2, Hint hint, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bundleStatus.icon;
                }
                if ((i11 & 2) != 0) {
                    str2 = bundleStatus.text;
                }
                if ((i11 & 4) != 0) {
                    hint = bundleStatus.hint;
                }
                return bundleStatus.copy(str, str2, hint);
            }

            public final String component1() {
                return this.icon;
            }

            public final String component2() {
                return this.text;
            }

            public final Hint component3() {
                return this.hint;
            }

            public final BundleStatus copy(String icon, String text, Hint hint) {
                o.i(icon, "icon");
                o.i(text, "text");
                return new BundleStatus(icon, text, hint);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BundleStatus)) {
                    return false;
                }
                BundleStatus bundleStatus = (BundleStatus) obj;
                if (o.d(this.icon, bundleStatus.icon) && o.d(this.text, bundleStatus.text) && o.d(this.hint, bundleStatus.hint)) {
                    return true;
                }
                return false;
            }

            public final Hint getHint() {
                return this.hint;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((this.icon.hashCode() * 31) + this.text.hashCode()) * 31;
                Hint hint = this.hint;
                if (hint == null) {
                    hashCode = 0;
                } else {
                    hashCode = hint.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                String str = this.icon;
                String str2 = this.text;
                Hint hint = this.hint;
                return "BundleStatus(icon=" + str + ", text=" + str2 + ", hint=" + hint + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeString(this.icon);
                out.writeString(this.text);
                Hint hint = this.hint;
                if (hint == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                hint.writeToParcel(out, i11);
            }
        }

        /* compiled from: ListingItemDetails.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<BundleDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BundleDetails createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                o.i(parcel, "parcel");
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(BundleStatus.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new BundleDetails(readString, readFloat, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BundleDetails[] newArray(int i11) {
                return new BundleDetails[i11];
            }
        }

        public BundleDetails(String name, float f11, List<BundleStatus> list) {
            o.i(name, "name");
            this.name = name;
            this.price = f11;
            this.bundleStatus = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BundleDetails copy$default(BundleDetails bundleDetails, String str, float f11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bundleDetails.name;
            }
            if ((i11 & 2) != 0) {
                f11 = bundleDetails.price;
            }
            if ((i11 & 4) != 0) {
                list = bundleDetails.bundleStatus;
            }
            return bundleDetails.copy(str, f11, list);
        }

        public final String component1() {
            return this.name;
        }

        public final float component2() {
            return this.price;
        }

        public final List<BundleStatus> component3() {
            return this.bundleStatus;
        }

        public final BundleDetails copy(String name, float f11, List<BundleStatus> list) {
            o.i(name, "name");
            return new BundleDetails(name, f11, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundleDetails)) {
                return false;
            }
            BundleDetails bundleDetails = (BundleDetails) obj;
            if (o.d(this.name, bundleDetails.name) && Float.compare(this.price, bundleDetails.price) == 0 && o.d(this.bundleStatus, bundleDetails.bundleStatus)) {
                return true;
            }
            return false;
        }

        public final List<BundleStatus> getBundleStatus() {
            return this.bundleStatus;
        }

        public final String getName() {
            return this.name;
        }

        public final float getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.name.hashCode() * 31) + Float.hashCode(this.price)) * 31;
            List<BundleStatus> list = this.bundleStatus;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            String str = this.name;
            float f11 = this.price;
            List<BundleStatus> list = this.bundleStatus;
            return "BundleDetails(name=" + str + ", price=" + f11 + ", bundleStatus=" + list + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.name);
            out.writeFloat(this.price);
            List<BundleStatus> list = this.bundleStatus;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (BundleStatus bundleStatus : list) {
                bundleStatus.writeToParcel(out, i11);
            }
        }
    }

    /* compiled from: ListingItemDetails.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ListingItemDetails(int r72, int r73, java.lang.String r74, com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp r75, com.forsale.app.datalayer.network.responses.listingdetails.ListingSource r76, java.lang.String r77, java.lang.String r78, com.forsale.app.datalayer.network.responses.listingdetails.ListingType r79, java.lang.String r80, com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy r81, int r82, int r83, float r84, float r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.util.List r94, int r95, java.util.List r96, java.util.List r97, java.util.List r98, com.forsale.app.datalayer.network.responses.listingdetails.ListingExtendStatus r99, java.util.List r100, java.util.List r101, java.util.List r102, int r103, int r104, com.forsale.app.datalayer.network.responses.listingdetails.ListingUser r105, int r106, java.util.List r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.String r111, java.lang.String r112, java.lang.String r113, java.lang.String r114, int r115, int r116, int r117, int r118, int r119, int r120, int r121, double r122, int r124, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus r125, java.lang.String r126, java.lang.String r127, int r128, com.forsale.app.datalayer.network.responses.PlansResponse.Plan r129, java.lang.Integer r130, com.forsale.app.datalayer.network.entities.ExtraInfo r131, int r132, int r133, java.lang.Boolean r134, java.lang.Integer r135, java.util.List r136, java.lang.Integer r137, com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType r138, com.forsale.app.datalayer.network.responses.ListingItemDetails.BundleDetails r139, java.lang.String r140, int r141, int r142, int r143, kotlin.jvm.internal.DefaultConstructorMarker r144) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingItemDetails.<init>(int, int, java.lang.String, com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp, com.forsale.app.datalayer.network.responses.listingdetails.ListingSource, java.lang.String, java.lang.String, com.forsale.app.datalayer.network.responses.listingdetails.ListingType, java.lang.String, com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy, int, int, float, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.util.List, java.util.List, java.util.List, com.forsale.app.datalayer.network.responses.listingdetails.ListingExtendStatus, java.util.List, java.util.List, java.util.List, int, int, com.forsale.app.datalayer.network.responses.listingdetails.ListingUser, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, int, double, int, com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus, java.lang.String, java.lang.String, int, com.forsale.app.datalayer.network.responses.PlansResponse$Plan, java.lang.Integer, com.forsale.app.datalayer.network.entities.ExtraInfo, int, int, java.lang.Boolean, java.lang.Integer, java.util.List, java.lang.Integer, com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType, com.forsale.app.datalayer.network.responses.ListingItemDetails$BundleDetails, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ AdsModel toAdsModel$default(ListingItemDetails listingItemDetails, AdType adType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            adType = AdType.PIN;
        }
        return listingItemDetails.toAdsModel(adType);
    }

    public final int component1() {
        return this.encId;
    }

    public final ListingArchivedBy component10() {
        return this.archivedBy;
    }

    public final int component11() {
        return this.isPm;
    }

    public final int component12() {
        return this.isAutoRepost;
    }

    public final float component13() {
        return this.lon;
    }

    public final float component14() {
        return this.lat;
    }

    public final String component15() {
        return this.pmIdentifier;
    }

    public final String component16() {
        return this.desc;
    }

    public final String component17() {
        return this.translationDesc;
    }

    public final String component18() {
        return this.translationOriginalLang;
    }

    public final String component19() {
        return this.videoUrl;
    }

    public final int component2() {
        return this.distId;
    }

    public final String component20() {
        return this.videoThumb;
    }

    public final String component21() {
        return this.virtualTourThumb;
    }

    public final String component22() {
        return this.virtualTourUrl;
    }

    public final List<String> component23() {
        return this.images;
    }

    public final int component24() {
        return this.paid;
    }

    public final List<ListingPinOption> component25() {
        return this.pinStatus;
    }

    public final List<ListingPinOption> component26() {
        return this.promoteStatus;
    }

    public final List<ExtraStatusNote> component27() {
        return this.extraStatusNotes;
    }

    public final ListingExtendStatus component28() {
        return this.extendStatus;
    }

    public final List<OtherStatus> component29() {
        return this.otherStatus;
    }

    public final String component3() {
        return this.translationTitle;
    }

    public final List<OtherStatusAll> component30() {
        return this.otherStatusAll;
    }

    public final List<ExtraAttr> component31() {
        return this.attrs;
    }

    public final int component32() {
        return this.isFavorite;
    }

    public final int component33() {
        return this.viewCount;
    }

    public final ListingUser component34() {
        return this.user;
    }

    public final int component35() {
        return this.catId;
    }

    public final List<Integer> component36() {
        return this.districtsIds;
    }

    public final String component37() {
        return this.contact;
    }

    public final String component38() {
        return this.dateSort;
    }

    public final String component39() {
        return this.datePublished;
    }

    public final ListingSourceApp component4() {
        return this.sourceApp;
    }

    public final String component40() {
        return this.dateExpired;
    }

    public final String component41() {
        return this.dateCreated;
    }

    public final String component42() {
        return this.archived_on;
    }

    public final String component43() {
        return this.doNotDisturb;
    }

    public final int component44() {
        return this.f22353id;
    }

    public final int component45() {
        return this.imagesCount;
    }

    public final int component46() {
        return this.isHideMyNumber;
    }

    public final int component47() {
        return this.isAnon;
    }

    public final int component48() {
        return this.isPrem;
    }

    public final int component49() {
        return this.isVideoPaid;
    }

    public final ListingSource component5() {
        return this.source;
    }

    public final int component50() {
        return this.isVoip;
    }

    public final double component51() {
        return this.price;
    }

    public final int component52() {
        return this.regId;
    }

    public final ItemStatus component53() {
        return this.status;
    }

    public final String component54() {
        return this.title;
    }

    public final String component55() {
        return this.url;
    }

    public final int component56() {
        return this.wasPromoted;
    }

    public final PlansResponse.Plan component57() {
        return this.plan;
    }

    public final Integer component58() {
        return this.planId;
    }

    public final ExtraInfo component59() {
        return this.extraInfo;
    }

    public final String component6() {
        return this.phone;
    }

    public final int component60() {
        return this.callCount;
    }

    public final int component61() {
        return this.favCount;
    }

    public final Boolean component62() {
        return this.hasAddons;
    }

    public final Integer component63() {
        return this.allowEditOnDistrict;
    }

    public final List<DistrictEntity> component64() {
        return this.districts;
    }

    public final Integer component65() {
        return this.expireSoon;
    }

    public final UploadedListingType component66() {
        return this.listingType;
    }

    public final BundleDetails component67() {
        return this.bundle;
    }

    public final String component68() {
        return this.slug;
    }

    public final String component7() {
        return this.contacts;
    }

    public final ListingType component8() {
        return this.type;
    }

    public final String component9() {
        return this.archiveReason;
    }

    public final ListingItemDetails copy(int i11, int i12, String translationTitle, ListingSourceApp sourceApp, ListingSource listingSource, String phone, String str, ListingType type, String str2, ListingArchivedBy listingArchivedBy, int i13, int i14, float f11, float f12, String str3, String str4, String translationDesc, String translationOriginalLang, String str5, String str6, String str7, String str8, List<String> list, int i15, List<ListingPinOption> list2, List<ListingPinOption> list3, List<ExtraStatusNote> extraStatusNotes, ListingExtendStatus listingExtendStatus, List<OtherStatus> list4, List<OtherStatusAll> list5, List<ExtraAttr> attrs, int i16, int i17, ListingUser user, int i18, List<Integer> list6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i19, int i21, int i22, int i23, int i24, int i25, int i26, double d11, int i27, ItemStatus itemStatus, String title, String str16, int i28, PlansResponse.Plan plan, Integer num, ExtraInfo extraInfo, int i29, int i31, Boolean bool, Integer num2, List<DistrictEntity> list7, Integer num3, UploadedListingType uploadedListingType, BundleDetails bundleDetails, String slug) {
        o.i(translationTitle, "translationTitle");
        o.i(sourceApp, "sourceApp");
        o.i(phone, "phone");
        o.i(type, "type");
        o.i(translationDesc, "translationDesc");
        o.i(translationOriginalLang, "translationOriginalLang");
        o.i(extraStatusNotes, "extraStatusNotes");
        o.i(attrs, "attrs");
        o.i(user, "user");
        o.i(title, "title");
        o.i(slug, "slug");
        return new ListingItemDetails(i11, i12, translationTitle, sourceApp, listingSource, phone, str, type, str2, listingArchivedBy, i13, i14, f11, f12, str3, str4, translationDesc, translationOriginalLang, str5, str6, str7, str8, list, i15, list2, list3, extraStatusNotes, listingExtendStatus, list4, list5, attrs, i16, i17, user, i18, list6, str9, str10, str11, str12, str13, str14, str15, i19, i21, i22, i23, i24, i25, i26, d11, i27, itemStatus, title, str16, i28, plan, num, extraInfo, i29, i31, bool, num2, list7, num3, uploadedListingType, bundleDetails, slug);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingItemDetails)) {
            return false;
        }
        ListingItemDetails listingItemDetails = (ListingItemDetails) obj;
        if (this.encId == listingItemDetails.encId && this.distId == listingItemDetails.distId && o.d(this.translationTitle, listingItemDetails.translationTitle) && this.sourceApp == listingItemDetails.sourceApp && this.source == listingItemDetails.source && o.d(this.phone, listingItemDetails.phone) && o.d(this.contacts, listingItemDetails.contacts) && this.type == listingItemDetails.type && o.d(this.archiveReason, listingItemDetails.archiveReason) && this.archivedBy == listingItemDetails.archivedBy && this.isPm == listingItemDetails.isPm && this.isAutoRepost == listingItemDetails.isAutoRepost && Float.compare(this.lon, listingItemDetails.lon) == 0 && Float.compare(this.lat, listingItemDetails.lat) == 0 && o.d(this.pmIdentifier, listingItemDetails.pmIdentifier) && o.d(this.desc, listingItemDetails.desc) && o.d(this.translationDesc, listingItemDetails.translationDesc) && o.d(this.translationOriginalLang, listingItemDetails.translationOriginalLang) && o.d(this.videoUrl, listingItemDetails.videoUrl) && o.d(this.videoThumb, listingItemDetails.videoThumb) && o.d(this.virtualTourThumb, listingItemDetails.virtualTourThumb) && o.d(this.virtualTourUrl, listingItemDetails.virtualTourUrl) && o.d(this.images, listingItemDetails.images) && this.paid == listingItemDetails.paid && o.d(this.pinStatus, listingItemDetails.pinStatus) && o.d(this.promoteStatus, listingItemDetails.promoteStatus) && o.d(this.extraStatusNotes, listingItemDetails.extraStatusNotes) && o.d(this.extendStatus, listingItemDetails.extendStatus) && o.d(this.otherStatus, listingItemDetails.otherStatus) && o.d(this.otherStatusAll, listingItemDetails.otherStatusAll) && o.d(this.attrs, listingItemDetails.attrs) && this.isFavorite == listingItemDetails.isFavorite && this.viewCount == listingItemDetails.viewCount && o.d(this.user, listingItemDetails.user) && this.catId == listingItemDetails.catId && o.d(this.districtsIds, listingItemDetails.districtsIds) && o.d(this.contact, listingItemDetails.contact) && o.d(this.dateSort, listingItemDetails.dateSort) && o.d(this.datePublished, listingItemDetails.datePublished) && o.d(this.dateExpired, listingItemDetails.dateExpired) && o.d(this.dateCreated, listingItemDetails.dateCreated) && o.d(this.archived_on, listingItemDetails.archived_on) && o.d(this.doNotDisturb, listingItemDetails.doNotDisturb) && this.f22353id == listingItemDetails.f22353id && this.imagesCount == listingItemDetails.imagesCount && this.isHideMyNumber == listingItemDetails.isHideMyNumber && this.isAnon == listingItemDetails.isAnon && this.isPrem == listingItemDetails.isPrem && this.isVideoPaid == listingItemDetails.isVideoPaid && this.isVoip == listingItemDetails.isVoip && Double.compare(this.price, listingItemDetails.price) == 0 && this.regId == listingItemDetails.regId && this.status == listingItemDetails.status && o.d(this.title, listingItemDetails.title) && o.d(this.url, listingItemDetails.url) && this.wasPromoted == listingItemDetails.wasPromoted && o.d(this.plan, listingItemDetails.plan) && o.d(this.planId, listingItemDetails.planId) && o.d(this.extraInfo, listingItemDetails.extraInfo) && this.callCount == listingItemDetails.callCount && this.favCount == listingItemDetails.favCount && o.d(this.hasAddons, listingItemDetails.hasAddons) && o.d(this.allowEditOnDistrict, listingItemDetails.allowEditOnDistrict) && o.d(this.districts, listingItemDetails.districts) && o.d(this.expireSoon, listingItemDetails.expireSoon) && this.listingType == listingItemDetails.listingType && o.d(this.bundle, listingItemDetails.bundle) && o.d(this.slug, listingItemDetails.slug)) {
            return true;
        }
        return false;
    }

    public final Integer getAllowEditOnDistrict() {
        return this.allowEditOnDistrict;
    }

    public final String getArchiveReason() {
        return this.archiveReason;
    }

    public final ListingArchivedBy getArchivedBy() {
        return this.archivedBy;
    }

    public final String getArchived_on() {
        return this.archived_on;
    }

    public final List<ExtraAttr> getAttrs() {
        return this.attrs;
    }

    public final BundleDetails getBundle() {
        return this.bundle;
    }

    public final int getCallCount() {
        return this.callCount;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getCatId() {
        return this.catId;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getContact() {
        return this.contact;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        r0 = kotlin.text.StringsKt__StringsKt.F0(r0, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> getContactNumbers() {
        /*
            r6 = this;
            java.lang.String r0 = r6.contacts
            if (r0 == 0) goto L14
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r0 = kotlin.text.k.F0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L1e
        L14:
            java.lang.String r0 = r6.contacts
            if (r0 == 0) goto L1d
            java.util.List r0 = kotlin.collections.p.e(r0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingItemDetails.getContactNumbers():java.util.List");
    }

    public final String getContacts() {
        return this.contacts;
    }

    public final String getDateCreated() {
        return this.dateCreated;
    }

    public final String getDateExpired() {
        return this.dateExpired;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDatePublished() {
        return this.datePublished;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDateSort() {
        return this.dateSort;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getDistId() {
        return this.distId;
    }

    public final List<DistrictEntity> getDistricts() {
        return this.districts;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final int getEncId() {
        return this.encId;
    }

    public final Integer getExpireSoon() {
        return this.expireSoon;
    }

    public final ListingExtendStatus getExtendStatus() {
        return this.extendStatus;
    }

    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final List<ExtraStatusNote> getExtraStatusNotes() {
        return this.extraStatusNotes;
    }

    public final int getFavCount() {
        return this.favCount;
    }

    public final Boolean getHasAddons() {
        return this.hasAddons;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getId() {
        return this.f22353id;
    }

    public final List<String> getImages() {
        return this.images;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getImagesCount() {
        return this.imagesCount;
    }

    public final float getLat() {
        return this.lat;
    }

    public final UploadedListingType getListingType() {
        return this.listingType;
    }

    public final float getLon() {
        return this.lon;
    }

    public final List<OtherStatus> getOtherStatus() {
        return this.otherStatus;
    }

    public final List<OtherStatusAll> getOtherStatusAll() {
        return this.otherStatusAll;
    }

    public final int getPaid() {
        return this.paid;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getPhone() {
        return this.phone;
    }

    public final List<ListingPinOption> getPinStatus() {
        return this.pinStatus;
    }

    public final PlansResponse.Plan getPlan() {
        return this.plan;
    }

    public final Integer getPlanId() {
        return this.planId;
    }

    public final String getPmIdentifier() {
        return this.pmIdentifier;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public double getPrice() {
        return this.price;
    }

    public final List<ListingPinOption> getPromoteStatus() {
        return this.promoteStatus;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getRegId() {
        return this.regId;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final ListingSource getSource() {
        return this.source;
    }

    public final ListingSourceApp getSourceApp() {
        return this.sourceApp;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public ItemStatus getStatus() {
        return this.status;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getTitle() {
        return this.title;
    }

    public final String getTranslationDesc() {
        return this.translationDesc;
    }

    public final String getTranslationOriginalLang() {
        return this.translationOriginalLang;
    }

    public final String getTranslationTitle() {
        return this.translationTitle;
    }

    public final ListingType getType() {
        return this.type;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public String getUrl() {
        return this.url;
    }

    public final ListingUser getUser() {
        return this.user;
    }

    public final String getVideoThumb() {
        return this.videoThumb;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final String getVirtualTourThumb() {
        return this.virtualTourThumb;
    }

    public final String getVirtualTourUrl() {
        return this.virtualTourUrl;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int getWasPromoted() {
        return this.wasPromoted;
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
        int hashCode35 = ((((((Integer.hashCode(this.encId) * 31) + Integer.hashCode(this.distId)) * 31) + this.translationTitle.hashCode()) * 31) + this.sourceApp.hashCode()) * 31;
        ListingSource listingSource = this.source;
        int i11 = 0;
        if (listingSource == null) {
            hashCode = 0;
        } else {
            hashCode = listingSource.hashCode();
        }
        int hashCode36 = (((hashCode35 + hashCode) * 31) + this.phone.hashCode()) * 31;
        String str = this.contacts;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode37 = (((hashCode36 + hashCode2) * 31) + this.type.hashCode()) * 31;
        String str2 = this.archiveReason;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (hashCode37 + hashCode3) * 31;
        ListingArchivedBy listingArchivedBy = this.archivedBy;
        if (listingArchivedBy == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = listingArchivedBy.hashCode();
        }
        int hashCode38 = (((((((((i12 + hashCode4) * 31) + Integer.hashCode(this.isPm)) * 31) + Integer.hashCode(this.isAutoRepost)) * 31) + Float.hashCode(this.lon)) * 31) + Float.hashCode(this.lat)) * 31;
        String str3 = this.pmIdentifier;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (hashCode38 + hashCode5) * 31;
        String str4 = this.desc;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int hashCode39 = (((((i13 + hashCode6) * 31) + this.translationDesc.hashCode()) * 31) + this.translationOriginalLang.hashCode()) * 31;
        String str5 = this.videoUrl;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i14 = (hashCode39 + hashCode7) * 31;
        String str6 = this.videoThumb;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        String str7 = this.virtualTourThumb;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        String str8 = this.virtualTourUrl;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        List<String> list = this.images;
        if (list == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list.hashCode();
        }
        int hashCode40 = (((i17 + hashCode11) * 31) + Integer.hashCode(this.paid)) * 31;
        List<ListingPinOption> list2 = this.pinStatus;
        if (list2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list2.hashCode();
        }
        int i18 = (hashCode40 + hashCode12) * 31;
        List<ListingPinOption> list3 = this.promoteStatus;
        if (list3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list3.hashCode();
        }
        int hashCode41 = (((i18 + hashCode13) * 31) + this.extraStatusNotes.hashCode()) * 31;
        ListingExtendStatus listingExtendStatus = this.extendStatus;
        if (listingExtendStatus == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = listingExtendStatus.hashCode();
        }
        int i19 = (hashCode41 + hashCode14) * 31;
        List<OtherStatus> list4 = this.otherStatus;
        if (list4 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list4.hashCode();
        }
        int i21 = (i19 + hashCode15) * 31;
        List<OtherStatusAll> list5 = this.otherStatusAll;
        if (list5 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = list5.hashCode();
        }
        int hashCode42 = (((((((((((i21 + hashCode16) * 31) + this.attrs.hashCode()) * 31) + Integer.hashCode(this.isFavorite)) * 31) + Integer.hashCode(this.viewCount)) * 31) + this.user.hashCode()) * 31) + Integer.hashCode(this.catId)) * 31;
        List<Integer> list6 = this.districtsIds;
        if (list6 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list6.hashCode();
        }
        int i22 = (hashCode42 + hashCode17) * 31;
        String str9 = this.contact;
        if (str9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str9.hashCode();
        }
        int i23 = (i22 + hashCode18) * 31;
        String str10 = this.dateSort;
        if (str10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str10.hashCode();
        }
        int i24 = (i23 + hashCode19) * 31;
        String str11 = this.datePublished;
        if (str11 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str11.hashCode();
        }
        int i25 = (i24 + hashCode20) * 31;
        String str12 = this.dateExpired;
        if (str12 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str12.hashCode();
        }
        int i26 = (i25 + hashCode21) * 31;
        String str13 = this.dateCreated;
        if (str13 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str13.hashCode();
        }
        int i27 = (i26 + hashCode22) * 31;
        String str14 = this.archived_on;
        if (str14 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str14.hashCode();
        }
        int i28 = (i27 + hashCode23) * 31;
        String str15 = this.doNotDisturb;
        if (str15 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str15.hashCode();
        }
        int hashCode43 = (((((((((((((((((((i28 + hashCode24) * 31) + Integer.hashCode(this.f22353id)) * 31) + Integer.hashCode(this.imagesCount)) * 31) + Integer.hashCode(this.isHideMyNumber)) * 31) + Integer.hashCode(this.isAnon)) * 31) + Integer.hashCode(this.isPrem)) * 31) + Integer.hashCode(this.isVideoPaid)) * 31) + Integer.hashCode(this.isVoip)) * 31) + Double.hashCode(this.price)) * 31) + Integer.hashCode(this.regId)) * 31;
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = itemStatus.hashCode();
        }
        int hashCode44 = (((hashCode43 + hashCode25) * 31) + this.title.hashCode()) * 31;
        String str16 = this.url;
        if (str16 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str16.hashCode();
        }
        int hashCode45 = (((hashCode44 + hashCode26) * 31) + Integer.hashCode(this.wasPromoted)) * 31;
        PlansResponse.Plan plan = this.plan;
        if (plan == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = plan.hashCode();
        }
        int i29 = (hashCode45 + hashCode27) * 31;
        Integer num = this.planId;
        if (num == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = num.hashCode();
        }
        int i31 = (i29 + hashCode28) * 31;
        ExtraInfo extraInfo = this.extraInfo;
        if (extraInfo == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = extraInfo.hashCode();
        }
        int hashCode46 = (((((i31 + hashCode29) * 31) + Integer.hashCode(this.callCount)) * 31) + Integer.hashCode(this.favCount)) * 31;
        Boolean bool = this.hasAddons;
        if (bool == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool.hashCode();
        }
        int i32 = (hashCode46 + hashCode30) * 31;
        Integer num2 = this.allowEditOnDistrict;
        if (num2 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = num2.hashCode();
        }
        int i33 = (i32 + hashCode31) * 31;
        List<DistrictEntity> list7 = this.districts;
        if (list7 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = list7.hashCode();
        }
        int i34 = (i33 + hashCode32) * 31;
        Integer num3 = this.expireSoon;
        if (num3 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = num3.hashCode();
        }
        int i35 = (i34 + hashCode33) * 31;
        UploadedListingType uploadedListingType = this.listingType;
        if (uploadedListingType == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = uploadedListingType.hashCode();
        }
        int i36 = (i35 + hashCode34) * 31;
        BundleDetails bundleDetails = this.bundle;
        if (bundleDetails != null) {
            i11 = bundleDetails.hashCode();
        }
        return ((i36 + i11) * 31) + this.slug.hashCode();
    }

    public final boolean isAboutToExpire() {
        a t11;
        boolean z11;
        String str = this.dateExpired;
        if (str == null || (t11 = TypeExtensionsKt.t(str, "yyyy-MM-dd HH:mm:ss")) == null) {
            return false;
        }
        String str2 = this.dateExpired;
        if (str2 != null && !TypeExtensionsKt.O(str2, "yyyy-MM-dd HH:mm:ss")) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || t11.a() >= 1) {
            return false;
        }
        return true;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isAnon() {
        return this.isAnon;
    }

    public final int isAutoRepost() {
        return this.isAutoRepost;
    }

    public final int isFavorite() {
        return this.isFavorite;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isHideMyNumber() {
        return this.isHideMyNumber;
    }

    public final int isPm() {
        return this.isPm;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isPrem() {
        return this.isPrem;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isVideoPaid() {
        return this.isVideoPaid;
    }

    @Override // com.forsale.app.datalayer.network.responses.ListingItemBase
    public int isVoip() {
        return this.isVoip;
    }

    public final void setDistricts(List<DistrictEntity> list) {
        this.districts = list;
    }

    public final void setExpireSoon(Integer num) {
        this.expireSoon = num;
    }

    public final void setFavorite(int i11) {
        this.isFavorite = i11;
    }

    public final AdsModel toAdsModel(AdType adType) {
        String str;
        String phone;
        o.i(adType, "adType");
        int id2 = getId();
        String title = getTitle();
        if (title == null) {
            title = "";
        }
        String str2 = title;
        List<String> list = this.images;
        if (list != null) {
            str = list.get(0);
        } else {
            str = null;
        }
        String str3 = str;
        List<String> contactNumbers = getContactNumbers();
        if (contactNumbers == null || (phone = contactNumbers.get(0)) == null) {
            phone = getPhone();
        }
        AdsModel adsModel = new AdsModel(id2, str2, str3, phone, Integer.valueOf(getCatId()), adType, null, null, null, null, Integer.valueOf(this.viewCount), getUrl(), 768, null);
        adsModel.p(false);
        return adsModel;
    }

    public final ListingItemDetails toExpireSoonItem() {
        this.expireSoon = 1;
        return this;
    }

    public String toString() {
        int i11 = this.encId;
        int i12 = this.distId;
        String str = this.translationTitle;
        ListingSourceApp listingSourceApp = this.sourceApp;
        ListingSource listingSource = this.source;
        String str2 = this.phone;
        String str3 = this.contacts;
        ListingType listingType = this.type;
        String str4 = this.archiveReason;
        ListingArchivedBy listingArchivedBy = this.archivedBy;
        int i13 = this.isPm;
        int i14 = this.isAutoRepost;
        float f11 = this.lon;
        float f12 = this.lat;
        String str5 = this.pmIdentifier;
        String str6 = this.desc;
        String str7 = this.translationDesc;
        String str8 = this.translationOriginalLang;
        String str9 = this.videoUrl;
        String str10 = this.videoThumb;
        String str11 = this.virtualTourThumb;
        String str12 = this.virtualTourUrl;
        List<String> list = this.images;
        int i15 = this.paid;
        List<ListingPinOption> list2 = this.pinStatus;
        List<ListingPinOption> list3 = this.promoteStatus;
        List<ExtraStatusNote> list4 = this.extraStatusNotes;
        ListingExtendStatus listingExtendStatus = this.extendStatus;
        List<OtherStatus> list5 = this.otherStatus;
        List<OtherStatusAll> list6 = this.otherStatusAll;
        List<ExtraAttr> list7 = this.attrs;
        int i16 = this.isFavorite;
        int i17 = this.viewCount;
        ListingUser listingUser = this.user;
        int i18 = this.catId;
        List<Integer> list8 = this.districtsIds;
        String str13 = this.contact;
        String str14 = this.dateSort;
        String str15 = this.datePublished;
        String str16 = this.dateExpired;
        String str17 = this.dateCreated;
        String str18 = this.archived_on;
        String str19 = this.doNotDisturb;
        int i19 = this.f22353id;
        int i21 = this.imagesCount;
        int i22 = this.isHideMyNumber;
        int i23 = this.isAnon;
        int i24 = this.isPrem;
        int i25 = this.isVideoPaid;
        int i26 = this.isVoip;
        double d11 = this.price;
        int i27 = this.regId;
        ItemStatus itemStatus = this.status;
        String str20 = this.title;
        String str21 = this.url;
        int i28 = this.wasPromoted;
        PlansResponse.Plan plan = this.plan;
        Integer num = this.planId;
        ExtraInfo extraInfo = this.extraInfo;
        int i29 = this.callCount;
        int i31 = this.favCount;
        Boolean bool = this.hasAddons;
        Integer num2 = this.allowEditOnDistrict;
        List<DistrictEntity> list9 = this.districts;
        Integer num3 = this.expireSoon;
        UploadedListingType uploadedListingType = this.listingType;
        BundleDetails bundleDetails = this.bundle;
        String str22 = this.slug;
        return "ListingItemDetails(encId=" + i11 + ", distId=" + i12 + ", translationTitle=" + str + ", sourceApp=" + listingSourceApp + ", source=" + listingSource + ", phone=" + str2 + ", contacts=" + str3 + ", type=" + listingType + ", archiveReason=" + str4 + ", archivedBy=" + listingArchivedBy + ", isPm=" + i13 + ", isAutoRepost=" + i14 + ", lon=" + f11 + ", lat=" + f12 + ", pmIdentifier=" + str5 + ", desc=" + str6 + ", translationDesc=" + str7 + ", translationOriginalLang=" + str8 + ", videoUrl=" + str9 + ", videoThumb=" + str10 + ", virtualTourThumb=" + str11 + ", virtualTourUrl=" + str12 + ", images=" + list + ", paid=" + i15 + ", pinStatus=" + list2 + ", promoteStatus=" + list3 + ", extraStatusNotes=" + list4 + ", extendStatus=" + listingExtendStatus + ", otherStatus=" + list5 + ", otherStatusAll=" + list6 + ", attrs=" + list7 + ", isFavorite=" + i16 + ", viewCount=" + i17 + ", user=" + listingUser + ", catId=" + i18 + ", districtsIds=" + list8 + ", contact=" + str13 + ", dateSort=" + str14 + ", datePublished=" + str15 + ", dateExpired=" + str16 + ", dateCreated=" + str17 + ", archived_on=" + str18 + ", doNotDisturb=" + str19 + ", id=" + i19 + ", imagesCount=" + i21 + ", isHideMyNumber=" + i22 + ", isAnon=" + i23 + ", isPrem=" + i24 + ", isVideoPaid=" + i25 + ", isVoip=" + i26 + ", price=" + d11 + ", regId=" + i27 + ", status=" + itemStatus + ", title=" + str20 + ", url=" + str21 + ", wasPromoted=" + i28 + ", plan=" + plan + ", planId=" + num + ", extraInfo=" + extraInfo + ", callCount=" + i29 + ", favCount=" + i31 + ", hasAddons=" + bool + ", allowEditOnDistrict=" + num2 + ", districts=" + list9 + ", expireSoon=" + num3 + ", listingType=" + uploadedListingType + ", bundle=" + bundleDetails + ", slug=" + str22 + ")";
    }

    public ListingItemDetails(int i11, int i12, String translationTitle, ListingSourceApp sourceApp, ListingSource listingSource, String phone, String str, ListingType type, String str2, ListingArchivedBy listingArchivedBy, int i13, int i14, float f11, float f12, String str3, String str4, String translationDesc, String translationOriginalLang, String str5, String str6, String str7, String str8, List<String> list, int i15, List<ListingPinOption> list2, List<ListingPinOption> list3, List<ExtraStatusNote> extraStatusNotes, ListingExtendStatus listingExtendStatus, List<OtherStatus> list4, List<OtherStatusAll> list5, List<ExtraAttr> attrs, int i16, int i17, ListingUser user, int i18, List<Integer> list6, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i19, int i21, int i22, int i23, int i24, int i25, int i26, double d11, int i27, ItemStatus itemStatus, String title, String str16, int i28, PlansResponse.Plan plan, Integer num, ExtraInfo extraInfo, int i29, int i31, Boolean bool, Integer num2, List<DistrictEntity> list7, Integer num3, UploadedListingType uploadedListingType, BundleDetails bundleDetails, String slug) {
        o.i(translationTitle, "translationTitle");
        o.i(sourceApp, "sourceApp");
        o.i(phone, "phone");
        o.i(type, "type");
        o.i(translationDesc, "translationDesc");
        o.i(translationOriginalLang, "translationOriginalLang");
        o.i(extraStatusNotes, "extraStatusNotes");
        o.i(attrs, "attrs");
        o.i(user, "user");
        o.i(title, "title");
        o.i(slug, "slug");
        this.encId = i11;
        this.distId = i12;
        this.translationTitle = translationTitle;
        this.sourceApp = sourceApp;
        this.source = listingSource;
        this.phone = phone;
        this.contacts = str;
        this.type = type;
        this.archiveReason = str2;
        this.archivedBy = listingArchivedBy;
        this.isPm = i13;
        this.isAutoRepost = i14;
        this.lon = f11;
        this.lat = f12;
        this.pmIdentifier = str3;
        this.desc = str4;
        this.translationDesc = translationDesc;
        this.translationOriginalLang = translationOriginalLang;
        this.videoUrl = str5;
        this.videoThumb = str6;
        this.virtualTourThumb = str7;
        this.virtualTourUrl = str8;
        this.images = list;
        this.paid = i15;
        this.pinStatus = list2;
        this.promoteStatus = list3;
        this.extraStatusNotes = extraStatusNotes;
        this.extendStatus = listingExtendStatus;
        this.otherStatus = list4;
        this.otherStatusAll = list5;
        this.attrs = attrs;
        this.isFavorite = i16;
        this.viewCount = i17;
        this.user = user;
        this.catId = i18;
        this.districtsIds = list6;
        this.contact = str9;
        this.dateSort = str10;
        this.datePublished = str11;
        this.dateExpired = str12;
        this.dateCreated = str13;
        this.archived_on = str14;
        this.doNotDisturb = str15;
        this.f22353id = i19;
        this.imagesCount = i21;
        this.isHideMyNumber = i22;
        this.isAnon = i23;
        this.isPrem = i24;
        this.isVideoPaid = i25;
        this.isVoip = i26;
        this.price = d11;
        this.regId = i27;
        this.status = itemStatus;
        this.title = title;
        this.url = str16;
        this.wasPromoted = i28;
        this.plan = plan;
        this.planId = num;
        this.extraInfo = extraInfo;
        this.callCount = i29;
        this.favCount = i31;
        this.hasAddons = bool;
        this.allowEditOnDistrict = num2;
        this.districts = list7;
        this.expireSoon = num3;
        this.listingType = uploadedListingType;
        this.bundle = bundleDetails;
        this.slug = slug;
    }
}
