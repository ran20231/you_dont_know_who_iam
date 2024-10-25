package com.forsale.app.datalayer.network.responses;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.features.categories.listings.ListingCardDisplayStyle;
import com.forsale.app.features.categories.listings.ListingDecoratorTypes;
import com.forsale.app.features.categories.listings.ListingPlaceHolderImage;
import com.forsale.app.features.categories.listings.ListingsVerticalStyles;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.stats.CodePackage;
import com.google.gson.d;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingsResponse.kt */
/* loaded from: classes2.dex */
public final class ListingsResponse {
    public static final String DEFAULT_LABEL = "N/A";
    public static final String RECOMMENDED_EXPIRY_DATE = "recommended_expiry_date";
    @c("listings")
    private final Listings listings;
    private final int page;
    @c(RECOMMENDED_EXPIRY_DATE)
    private final String recommendedExpiryDate;
    @c("source")
    private final String source;
    @c("total_commercial_items")
    private final int totalCommercialItems;
    @c("total_listings")
    private final int totalListings;
    @c("total_pages")
    private final int totalPages;
    @c("ui_settings")
    private final UISettings uiSettings;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ListingsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ListingsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Listings {
        public static final int $stable = 8;
        @c("business_commercial_items")
        private final List<ListingItemBrief> businessCommercialItems;
        @c("commercial_pinned_shuffle_items")
        private final List<ListingItemBrief> commercialPinnedShuffleItems;
        @c("normal_items")
        private final List<ListingItemBrief> normalItems;
        @c("pinned_items")
        private final List<ListingItemBrief> pinnedItems;
        @c("pinned_shuffle_items")
        private final List<ListingItemBrief> pinnedShuffleItems;
        @c("user_type_pinned_shuffle_items")
        private final List<ListingItemBrief> userTypePinnedShuffleItems;

        public Listings() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Listings copy$default(Listings listings, List list, List list2, List list3, List list4, List list5, List list6, int i11, Object obj) {
            List<ListingItemBrief> list7 = list;
            if ((i11 & 1) != 0) {
                list7 = listings.normalItems;
            }
            List<ListingItemBrief> list8 = list2;
            if ((i11 & 2) != 0) {
                list8 = listings.pinnedItems;
            }
            List list9 = list8;
            List<ListingItemBrief> list10 = list3;
            if ((i11 & 4) != 0) {
                list10 = listings.pinnedShuffleItems;
            }
            List list11 = list10;
            List<ListingItemBrief> list12 = list4;
            if ((i11 & 8) != 0) {
                list12 = listings.commercialPinnedShuffleItems;
            }
            List list13 = list12;
            List<ListingItemBrief> list14 = list5;
            if ((i11 & 16) != 0) {
                list14 = listings.userTypePinnedShuffleItems;
            }
            List list15 = list14;
            List<ListingItemBrief> list16 = list6;
            if ((i11 & 32) != 0) {
                list16 = listings.businessCommercialItems;
            }
            return listings.copy(list7, list9, list11, list13, list15, list16);
        }

        public final List<ListingItemBrief> component1() {
            return this.normalItems;
        }

        public final List<ListingItemBrief> component2() {
            return this.pinnedItems;
        }

        public final List<ListingItemBrief> component3() {
            return this.pinnedShuffleItems;
        }

        public final List<ListingItemBrief> component4() {
            return this.commercialPinnedShuffleItems;
        }

        public final List<ListingItemBrief> component5() {
            return this.userTypePinnedShuffleItems;
        }

        public final List<ListingItemBrief> component6() {
            return this.businessCommercialItems;
        }

        public final Listings copy(List<ListingItemBrief> normalItems, List<ListingItemBrief> pinnedItems, List<ListingItemBrief> list, List<ListingItemBrief> list2, List<ListingItemBrief> list3, List<ListingItemBrief> list4) {
            o.i(normalItems, "normalItems");
            o.i(pinnedItems, "pinnedItems");
            return new Listings(normalItems, pinnedItems, list, list2, list3, list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Listings)) {
                return false;
            }
            Listings listings = (Listings) obj;
            if (o.d(this.normalItems, listings.normalItems) && o.d(this.pinnedItems, listings.pinnedItems) && o.d(this.pinnedShuffleItems, listings.pinnedShuffleItems) && o.d(this.commercialPinnedShuffleItems, listings.commercialPinnedShuffleItems) && o.d(this.userTypePinnedShuffleItems, listings.userTypePinnedShuffleItems) && o.d(this.businessCommercialItems, listings.businessCommercialItems)) {
                return true;
            }
            return false;
        }

        public final List<ListingItemBrief> getBusinessCommercialItems() {
            return this.businessCommercialItems;
        }

        public final List<ListingItemBrief> getCommercialPinnedShuffleItems() {
            return this.commercialPinnedShuffleItems;
        }

        public final List<ListingItemBrief> getNormalItems() {
            return this.normalItems;
        }

        public final List<ListingItemBrief> getPinnedItems() {
            return this.pinnedItems;
        }

        public final List<ListingItemBrief> getPinnedShuffleItems() {
            return this.pinnedShuffleItems;
        }

        public final List<ListingItemBrief> getUserTypePinnedShuffleItems() {
            return this.userTypePinnedShuffleItems;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = ((this.normalItems.hashCode() * 31) + this.pinnedItems.hashCode()) * 31;
            List<ListingItemBrief> list = this.pinnedShuffleItems;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i12 = (hashCode4 + hashCode) * 31;
            List<ListingItemBrief> list2 = this.commercialPinnedShuffleItems;
            if (list2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = list2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            List<ListingItemBrief> list3 = this.userTypePinnedShuffleItems;
            if (list3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            List<ListingItemBrief> list4 = this.businessCommercialItems;
            if (list4 != null) {
                i11 = list4.hashCode();
            }
            return i14 + i11;
        }

        public String toString() {
            List<ListingItemBrief> list = this.normalItems;
            List<ListingItemBrief> list2 = this.pinnedItems;
            List<ListingItemBrief> list3 = this.pinnedShuffleItems;
            List<ListingItemBrief> list4 = this.commercialPinnedShuffleItems;
            List<ListingItemBrief> list5 = this.userTypePinnedShuffleItems;
            List<ListingItemBrief> list6 = this.businessCommercialItems;
            return "Listings(normalItems=" + list + ", pinnedItems=" + list2 + ", pinnedShuffleItems=" + list3 + ", commercialPinnedShuffleItems=" + list4 + ", userTypePinnedShuffleItems=" + list5 + ", businessCommercialItems=" + list6 + ")";
        }

        public Listings(List<ListingItemBrief> normalItems, List<ListingItemBrief> pinnedItems, List<ListingItemBrief> list, List<ListingItemBrief> list2, List<ListingItemBrief> list3, List<ListingItemBrief> list4) {
            o.i(normalItems, "normalItems");
            o.i(pinnedItems, "pinnedItems");
            this.normalItems = normalItems;
            this.pinnedItems = pinnedItems;
            this.pinnedShuffleItems = list;
            this.commercialPinnedShuffleItems = list2;
            this.userTypePinnedShuffleItems = list3;
            this.businessCommercialItems = list4;
        }

        public /* synthetic */ Listings(List list, List list2, List list3, List list4, List list5, List list6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? r.n() : list, (i11 & 2) != 0 ? r.n() : list2, (i11 & 4) != 0 ? null : list3, (i11 & 8) != 0 ? null : list4, (i11 & 16) != 0 ? null : list5, (i11 & 32) == 0 ? list6 : null);
        }
    }

    /* compiled from: ListingsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class UISettings {
        public static final int $stable = 8;
        @c("banner_settings")
        private final BannerSettings _bannerSetting;
        @c("fillers_settings")
        private final FillersSettings _fillersSettings;
        @c("listings_settings")
        private final ListingsSettings _listingsSettings;
        @c(CategoryEntity.FILTRATION_SETTINGS)
        private final List<FiltrationSetting> filtrationSettings;
        @c("pinning_settings")
        private final PinningSettings pinningSettings;

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class BannerSettings {
            public static final int $stable = 0;
            @c("has_native_banners")
            private final Boolean _hasNativeBanner;

            public BannerSettings() {
                this(null, 1, null);
            }

            private final Boolean component1() {
                return this._hasNativeBanner;
            }

            public static /* synthetic */ BannerSettings copy$default(BannerSettings bannerSettings, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    bool = bannerSettings._hasNativeBanner;
                }
                return bannerSettings.copy(bool);
            }

            public final BannerSettings copy(Boolean bool) {
                return new BannerSettings(bool);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof BannerSettings) && o.d(this._hasNativeBanner, ((BannerSettings) obj)._hasNativeBanner)) {
                    return true;
                }
                return false;
            }

            public final boolean getHasNativeBanners() {
                Boolean bool = this._hasNativeBanner;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }

            public int hashCode() {
                Boolean bool = this._hasNativeBanner;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public String toString() {
                Boolean bool = this._hasNativeBanner;
                return "BannerSettings(_hasNativeBanner=" + bool + ")";
            }

            public BannerSettings(Boolean bool) {
                this._hasNativeBanner = bool;
            }

            public /* synthetic */ BannerSettings(Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : bool);
            }
        }

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class FillersSettings {
            public static final int $stable = 0;
            @c("commercial")

            /* renamed from: commercial  reason: collision with root package name */
            private final Commercial f22354commercial;
            @c("pinned")
            private final Pinned pinned;

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class Commercial {
                public static final int $stable = 0;
                @c("image_ar")
                private final String imageAr;
                @c("image_en")
                private final String imageEn;
                @c("phone")
                private final String phone;

                public Commercial() {
                    this(null, null, null, 7, null);
                }

                public static /* synthetic */ Commercial copy$default(Commercial commercial2, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = commercial2.imageAr;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = commercial2.imageEn;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = commercial2.phone;
                    }
                    return commercial2.copy(str, str2, str3);
                }

                public final String component1() {
                    return this.imageAr;
                }

                public final String component2() {
                    return this.imageEn;
                }

                public final String component3() {
                    return this.phone;
                }

                public final Commercial copy(String str, String str2, String str3) {
                    return new Commercial(str, str2, str3);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Commercial)) {
                        return false;
                    }
                    Commercial commercial2 = (Commercial) obj;
                    if (o.d(this.imageAr, commercial2.imageAr) && o.d(this.imageEn, commercial2.imageEn) && o.d(this.phone, commercial2.phone)) {
                        return true;
                    }
                    return false;
                }

                public final String getImage() {
                    if (LocaleManager.f39597a.g() == Languages.ENGLISH) {
                        return this.imageEn;
                    }
                    return this.imageAr;
                }

                public final String getImageAr() {
                    return this.imageAr;
                }

                public final String getImageEn() {
                    return this.imageEn;
                }

                public final String getPhone() {
                    return this.phone;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    String str = this.imageAr;
                    int i11 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i12 = hashCode * 31;
                    String str2 = this.imageEn;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    String str3 = this.phone;
                    if (str3 != null) {
                        i11 = str3.hashCode();
                    }
                    return i13 + i11;
                }

                public String toString() {
                    String str = this.imageAr;
                    String str2 = this.imageEn;
                    String str3 = this.phone;
                    return "Commercial(imageAr=" + str + ", imageEn=" + str2 + ", phone=" + str3 + ")";
                }

                public Commercial(String str, String str2, String str3) {
                    this.imageAr = str;
                    this.imageEn = str2;
                    this.phone = str3;
                }

                public /* synthetic */ Commercial(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
                }
            }

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class Pinned {
                public static final int $stable = 0;
                @c("image_ar")
                private final String imageAr;
                @c("image_en")
                private final String imageEn;

                public Pinned() {
                    this(null, null, 3, null);
                }

                public static /* synthetic */ Pinned copy$default(Pinned pinned, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = pinned.imageAr;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = pinned.imageEn;
                    }
                    return pinned.copy(str, str2);
                }

                public final String component1() {
                    return this.imageAr;
                }

                public final String component2() {
                    return this.imageEn;
                }

                public final Pinned copy(String str, String str2) {
                    return new Pinned(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Pinned)) {
                        return false;
                    }
                    Pinned pinned = (Pinned) obj;
                    if (o.d(this.imageAr, pinned.imageAr) && o.d(this.imageEn, pinned.imageEn)) {
                        return true;
                    }
                    return false;
                }

                public final String getImage() {
                    if (LocaleManager.f39597a.g() == Languages.ENGLISH) {
                        return this.imageEn;
                    }
                    return this.imageAr;
                }

                public final String getImageAr() {
                    return this.imageAr;
                }

                public final String getImageEn() {
                    return this.imageEn;
                }

                public int hashCode() {
                    int hashCode;
                    String str = this.imageAr;
                    int i11 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i12 = hashCode * 31;
                    String str2 = this.imageEn;
                    if (str2 != null) {
                        i11 = str2.hashCode();
                    }
                    return i12 + i11;
                }

                public String toString() {
                    String str = this.imageAr;
                    String str2 = this.imageEn;
                    return "Pinned(imageAr=" + str + ", imageEn=" + str2 + ")";
                }

                public Pinned(String str, String str2) {
                    this.imageAr = str;
                    this.imageEn = str2;
                }

                public /* synthetic */ Pinned(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
                }
            }

            public FillersSettings() {
                this(null, null, 3, null);
            }

            public static /* synthetic */ FillersSettings copy$default(FillersSettings fillersSettings, Commercial commercial2, Pinned pinned, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    commercial2 = fillersSettings.f22354commercial;
                }
                if ((i11 & 2) != 0) {
                    pinned = fillersSettings.pinned;
                }
                return fillersSettings.copy(commercial2, pinned);
            }

            public final Commercial component1() {
                return this.f22354commercial;
            }

            public final Pinned component2() {
                return this.pinned;
            }

            public final FillersSettings copy(Commercial commercial2, Pinned pinned) {
                return new FillersSettings(commercial2, pinned);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FillersSettings)) {
                    return false;
                }
                FillersSettings fillersSettings = (FillersSettings) obj;
                if (o.d(this.f22354commercial, fillersSettings.f22354commercial) && o.d(this.pinned, fillersSettings.pinned)) {
                    return true;
                }
                return false;
            }

            public final Commercial getCommercial() {
                return this.f22354commercial;
            }

            public final Pinned getPinned() {
                return this.pinned;
            }

            public int hashCode() {
                int hashCode;
                Commercial commercial2 = this.f22354commercial;
                int i11 = 0;
                if (commercial2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = commercial2.hashCode();
                }
                int i12 = hashCode * 31;
                Pinned pinned = this.pinned;
                if (pinned != null) {
                    i11 = pinned.hashCode();
                }
                return i12 + i11;
            }

            public String toString() {
                Commercial commercial2 = this.f22354commercial;
                Pinned pinned = this.pinned;
                return "FillersSettings(commercial=" + commercial2 + ", pinned=" + pinned + ")";
            }

            public FillersSettings(Commercial commercial2, Pinned pinned) {
                this.f22354commercial = commercial2;
                this.pinned = pinned;
            }

            public /* synthetic */ FillersSettings(Commercial commercial2, Pinned pinned, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : commercial2, (i11 & 2) != 0 ? null : pinned);
            }
        }

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class FiltrationSetting implements Parcelable {
            @c("depend_on_parent")
            private final Integer _dependOnParent;
            @c("selection_type")
            private final SelectionType _selectionType;
            @c("sub_filters")
            private final List<FiltrationSetting> _subFilters;
            @c("id")
            private final Integer attributeId;
            private final String attributeType;
            @c("expose_type")
            private final ExposeType exposeType;
            @c("filter_type")
            private final FilterType filterType;

            /* renamed from: id  reason: collision with root package name */
            private final transient UUID f22355id;
            @c("label")
            private final Label label;
            private final transient UUID parentId;
            @c("view_type")
            private final ViewType viewType;
            public static final Parcelable.Creator<FiltrationSetting> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<FiltrationSetting> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FiltrationSetting createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    UUID uuid = (UUID) parcel.readSerializable();
                    UUID uuid2 = (UUID) parcel.readSerializable();
                    FilterType valueOf = parcel.readInt() == 0 ? null : FilterType.valueOf(parcel.readString());
                    ViewType valueOf2 = parcel.readInt() == 0 ? null : ViewType.valueOf(parcel.readString());
                    ExposeType valueOf3 = parcel.readInt() == 0 ? null : ExposeType.valueOf(parcel.readString());
                    Label createFromParcel = Label.CREATOR.createFromParcel(parcel);
                    SelectionType valueOf4 = parcel.readInt() == 0 ? null : SelectionType.valueOf(parcel.readString());
                    Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(FiltrationSetting.CREATOR.createFromParcel(parcel));
                    }
                    return new FiltrationSetting(uuid, uuid2, valueOf, valueOf2, valueOf3, createFromParcel, valueOf4, valueOf5, valueOf6, readString, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FiltrationSetting[] newArray(int i11) {
                    return new FiltrationSetting[i11];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class ExposeType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ ExposeType[] $VALUES;
                @c("exposed")
                public static final ExposeType EXPOSED = new ExposeType("EXPOSED", 0);
                @c("none")
                public static final ExposeType NONE = new ExposeType("NONE", 1);

                private static final /* synthetic */ ExposeType[] $values() {
                    return new ExposeType[]{EXPOSED, NONE};
                }

                static {
                    ExposeType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private ExposeType(String str, int i11) {
                }

                public static a<ExposeType> getEntries() {
                    return $ENTRIES;
                }

                public static ExposeType valueOf(String str) {
                    return (ExposeType) Enum.valueOf(ExposeType.class, str);
                }

                public static ExposeType[] values() {
                    return (ExposeType[]) $VALUES.clone();
                }
            }

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class ExposeTypeConverter {
                public static final int $stable = 0;

                public final ExposeType toExposeType(String data) {
                    boolean z11;
                    Object k11;
                    o.i(data, "data");
                    if (data.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        k11 = null;
                    } else {
                        k11 = new d().k(data, ExposeType.class);
                    }
                    ExposeType exposeType = (ExposeType) k11;
                    if (exposeType == null) {
                        return ExposeType.NONE;
                    }
                    return exposeType;
                }

                public final String toString(ExposeType data) {
                    o.i(data, "data");
                    String f11 = TopLevelUtilityFunctionsKt.f(data);
                    if (f11 == null) {
                        return "NONE";
                    }
                    return f11;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class FilterType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ FilterType[] $VALUES;
                @c("category")
                public static final FilterType CATEGORY = new FilterType("CATEGORY", 0);
                @c("sub_category")
                public static final FilterType SUB_CATEGORY = new FilterType("SUB_CATEGORY", 1);
                @c("district")
                public static final FilterType DISTRICT = new FilterType("DISTRICT", 2);
                @c("area")
                public static final FilterType AREA = new FilterType("AREA", 3);
                @c("area_block")
                public static final FilterType AREA_BLOCK = new FilterType("AREA_BLOCK", 4);
                @c("attribute")
                public static final FilterType ATTRIBUTE = new FilterType("ATTRIBUTE", 5);
                @c("price")
                public static final FilterType PRICE = new FilterType("PRICE", 6);
                @c(Constants.Keys.LOCATION)
                public static final FilterType LOCATION = new FilterType(CodePackage.LOCATION, 7);

                private static final /* synthetic */ FilterType[] $values() {
                    return new FilterType[]{CATEGORY, SUB_CATEGORY, DISTRICT, AREA, AREA_BLOCK, ATTRIBUTE, PRICE, LOCATION};
                }

                static {
                    FilterType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private FilterType(String str, int i11) {
                }

                public static a<FilterType> getEntries() {
                    return $ENTRIES;
                }

                public static FilterType valueOf(String str) {
                    return (FilterType) Enum.valueOf(FilterType.class, str);
                }

                public static FilterType[] values() {
                    return (FilterType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class SelectionType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ SelectionType[] $VALUES;
                @c("single")
                public static final SelectionType SINGLE = new SelectionType("SINGLE", 0);
                @c(RequestBuilder.ACTION_MULTI)
                public static final SelectionType MULTI = new SelectionType("MULTI", 1);

                private static final /* synthetic */ SelectionType[] $values() {
                    return new SelectionType[]{SINGLE, MULTI};
                }

                static {
                    SelectionType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private SelectionType(String str, int i11) {
                }

                public static a<SelectionType> getEntries() {
                    return $ENTRIES;
                }

                public static SelectionType valueOf(String str) {
                    return (SelectionType) Enum.valueOf(SelectionType.class, str);
                }

                public static SelectionType[] values() {
                    return (SelectionType[]) $VALUES.clone();
                }
            }

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class SelectionTypeConverter {
                public static final int $stable = 0;

                public final SelectionType toSelectionType(String data) {
                    boolean z11;
                    Object k11;
                    o.i(data, "data");
                    if (data.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        k11 = null;
                    } else {
                        k11 = new d().k(data, SelectionType.class);
                    }
                    SelectionType selectionType = (SelectionType) k11;
                    if (selectionType == null) {
                        return SelectionType.SINGLE;
                    }
                    return selectionType;
                }

                public final String toString(SelectionType data) {
                    o.i(data, "data");
                    String f11 = TopLevelUtilityFunctionsKt.f(data);
                    if (f11 == null) {
                        return "SINGLE";
                    }
                    return f11;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class ViewType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ ViewType[] $VALUES;
                @c("horizontal")
                public static final ViewType HORIZONTAL = new ViewType("HORIZONTAL", 0);
                @c("full_screen")
                public static final ViewType FULL_SCREEN = new ViewType("FULL_SCREEN", 1);
                @c("full_screen_search")
                public static final ViewType FULL_SCREEN_WITH_SEARCH = new ViewType("FULL_SCREEN_WITH_SEARCH", 2);
                @c("range")
                public static final ViewType RANGE = new ViewType("RANGE", 3);

                private static final /* synthetic */ ViewType[] $values() {
                    return new ViewType[]{HORIZONTAL, FULL_SCREEN, FULL_SCREEN_WITH_SEARCH, RANGE};
                }

                static {
                    ViewType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private ViewType(String str, int i11) {
                }

                public static a<ViewType> getEntries() {
                    return $ENTRIES;
                }

                public static ViewType valueOf(String str) {
                    return (ViewType) Enum.valueOf(ViewType.class, str);
                }

                public static ViewType[] values() {
                    return (ViewType[]) $VALUES.clone();
                }
            }

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class ViewTypeConverter {
                public static final int $stable = 0;

                public final String toString(ViewType data) {
                    o.i(data, "data");
                    String f11 = TopLevelUtilityFunctionsKt.f(data);
                    if (f11 == null) {
                        return "HORIZONTAL";
                    }
                    return f11;
                }

                public final ViewType toViewType(String data) {
                    boolean z11;
                    Object k11;
                    o.i(data, "data");
                    if (data.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        k11 = null;
                    } else {
                        k11 = new d().k(data, ViewType.class);
                    }
                    ViewType viewType = (ViewType) k11;
                    if (viewType == null) {
                        return ViewType.HORIZONTAL;
                    }
                    return viewType;
                }
            }

            public FiltrationSetting() {
                this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
            }

            private final List<FiltrationSetting> component11() {
                return this._subFilters;
            }

            private final SelectionType component7() {
                return this._selectionType;
            }

            private final Integer component8() {
                return this._dependOnParent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FiltrationSetting copy$default(FiltrationSetting filtrationSetting, UUID uuid, UUID uuid2, FilterType filterType, ViewType viewType, ExposeType exposeType, Label label, SelectionType selectionType, Integer num, Integer num2, String str, List list, int i11, Object obj) {
                UUID uuid3;
                UUID uuid4;
                FilterType filterType2;
                ViewType viewType2;
                ExposeType exposeType2;
                Label label2;
                SelectionType selectionType2;
                Integer num3;
                Integer num4;
                String str2;
                List<FiltrationSetting> list2;
                if ((i11 & 1) != 0) {
                    uuid3 = filtrationSetting.f22355id;
                } else {
                    uuid3 = uuid;
                }
                if ((i11 & 2) != 0) {
                    uuid4 = filtrationSetting.parentId;
                } else {
                    uuid4 = uuid2;
                }
                if ((i11 & 4) != 0) {
                    filterType2 = filtrationSetting.filterType;
                } else {
                    filterType2 = filterType;
                }
                if ((i11 & 8) != 0) {
                    viewType2 = filtrationSetting.viewType;
                } else {
                    viewType2 = viewType;
                }
                if ((i11 & 16) != 0) {
                    exposeType2 = filtrationSetting.exposeType;
                } else {
                    exposeType2 = exposeType;
                }
                if ((i11 & 32) != 0) {
                    label2 = filtrationSetting.label;
                } else {
                    label2 = label;
                }
                if ((i11 & 64) != 0) {
                    selectionType2 = filtrationSetting._selectionType;
                } else {
                    selectionType2 = selectionType;
                }
                if ((i11 & 128) != 0) {
                    num3 = filtrationSetting._dependOnParent;
                } else {
                    num3 = num;
                }
                if ((i11 & 256) != 0) {
                    num4 = filtrationSetting.attributeId;
                } else {
                    num4 = num2;
                }
                if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    str2 = filtrationSetting.attributeType;
                } else {
                    str2 = str;
                }
                if ((i11 & 1024) != 0) {
                    list2 = filtrationSetting._subFilters;
                } else {
                    list2 = list;
                }
                return filtrationSetting.copy(uuid3, uuid4, filterType2, viewType2, exposeType2, label2, selectionType2, num3, num4, str2, list2);
            }

            public final UUID component1() {
                return this.f22355id;
            }

            public final String component10() {
                return this.attributeType;
            }

            public final UUID component2() {
                return this.parentId;
            }

            public final FilterType component3() {
                return this.filterType;
            }

            public final ViewType component4() {
                return this.viewType;
            }

            public final ExposeType component5() {
                return this.exposeType;
            }

            public final Label component6() {
                return this.label;
            }

            public final Integer component9() {
                return this.attributeId;
            }

            public final FiltrationSetting copy(UUID id2, UUID uuid, FilterType filterType, ViewType viewType, ExposeType exposeType, Label label, SelectionType selectionType, Integer num, Integer num2, String str, List<FiltrationSetting> _subFilters) {
                o.i(id2, "id");
                o.i(label, "label");
                o.i(_subFilters, "_subFilters");
                return new FiltrationSetting(id2, uuid, filterType, viewType, exposeType, label, selectionType, num, num2, str, _subFilters);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FiltrationSetting)) {
                    return false;
                }
                FiltrationSetting filtrationSetting = (FiltrationSetting) obj;
                if (o.d(this.f22355id, filtrationSetting.f22355id) && o.d(this.parentId, filtrationSetting.parentId) && this.filterType == filtrationSetting.filterType && this.viewType == filtrationSetting.viewType && this.exposeType == filtrationSetting.exposeType && o.d(this.label, filtrationSetting.label) && this._selectionType == filtrationSetting._selectionType && o.d(this._dependOnParent, filtrationSetting._dependOnParent) && o.d(this.attributeId, filtrationSetting.attributeId) && o.d(this.attributeType, filtrationSetting.attributeType) && o.d(this._subFilters, filtrationSetting._subFilters)) {
                    return true;
                }
                return false;
            }

            public final Integer getAttributeId() {
                return this.attributeId;
            }

            public final String getAttributeType() {
                return this.attributeType;
            }

            public final boolean getDependOnParent() {
                return TypeExtensionsKt.i0(this._dependOnParent);
            }

            public final ExposeType getExposeType() {
                return this.exposeType;
            }

            public final FilterType getFilterType() {
                return this.filterType;
            }

            public final UUID getId() {
                return this.f22355id;
            }

            public final Label getLabel() {
                return this.label;
            }

            public final String getLocalizedLabel() {
                return this.label.getLocalized();
            }

            public final UUID getParentId() {
                return this.parentId;
            }

            public final SelectionType getSelectionType() {
                SelectionType selectionType = this._selectionType;
                if (selectionType == null) {
                    return SelectionType.SINGLE;
                }
                return selectionType;
            }

            public final List<FiltrationSetting> getSubFilters() {
                int y11;
                List<FiltrationSetting> list = this._subFilters;
                y11 = s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (FiltrationSetting filtrationSetting : list) {
                    arrayList.add(copy$default(filtrationSetting, null, this.f22355id, null, null, null, null, null, null, null, null, null, 2045, null));
                }
                return arrayList;
            }

            public final ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int hashCode5;
                int hashCode6;
                int hashCode7;
                int hashCode8 = this.f22355id.hashCode() * 31;
                UUID uuid = this.parentId;
                int i11 = 0;
                if (uuid == null) {
                    hashCode = 0;
                } else {
                    hashCode = uuid.hashCode();
                }
                int i12 = (hashCode8 + hashCode) * 31;
                FilterType filterType = this.filterType;
                if (filterType == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = filterType.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                ViewType viewType = this.viewType;
                if (viewType == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = viewType.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                ExposeType exposeType = this.exposeType;
                if (exposeType == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = exposeType.hashCode();
                }
                int hashCode9 = (((i14 + hashCode4) * 31) + this.label.hashCode()) * 31;
                SelectionType selectionType = this._selectionType;
                if (selectionType == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = selectionType.hashCode();
                }
                int i15 = (hashCode9 + hashCode5) * 31;
                Integer num = this._dependOnParent;
                if (num == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num.hashCode();
                }
                int i16 = (i15 + hashCode6) * 31;
                Integer num2 = this.attributeId;
                if (num2 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = num2.hashCode();
                }
                int i17 = (i16 + hashCode7) * 31;
                String str = this.attributeType;
                if (str != null) {
                    i11 = str.hashCode();
                }
                return ((i17 + i11) * 31) + this._subFilters.hashCode();
            }

            public final boolean isExposed() {
                if (this.exposeType == ExposeType.EXPOSED) {
                    return true;
                }
                return false;
            }

            public String toString() {
                UUID uuid = this.f22355id;
                UUID uuid2 = this.parentId;
                FilterType filterType = this.filterType;
                ViewType viewType = this.viewType;
                ExposeType exposeType = this.exposeType;
                Label label = this.label;
                SelectionType selectionType = this._selectionType;
                Integer num = this._dependOnParent;
                Integer num2 = this.attributeId;
                String str = this.attributeType;
                List<FiltrationSetting> list = this._subFilters;
                return "FiltrationSetting(id=" + uuid + ", parentId=" + uuid2 + ", filterType=" + filterType + ", viewType=" + viewType + ", exposeType=" + exposeType + ", label=" + label + ", _selectionType=" + selectionType + ", _dependOnParent=" + num + ", attributeId=" + num2 + ", attributeType=" + str + ", _subFilters=" + list + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeSerializable(this.f22355id);
                out.writeSerializable(this.parentId);
                FilterType filterType = this.filterType;
                if (filterType == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(filterType.name());
                }
                ViewType viewType = this.viewType;
                if (viewType == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(viewType.name());
                }
                ExposeType exposeType = this.exposeType;
                if (exposeType == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(exposeType.name());
                }
                this.label.writeToParcel(out, i11);
                SelectionType selectionType = this._selectionType;
                if (selectionType == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(selectionType.name());
                }
                Integer num = this._dependOnParent;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                Integer num2 = this.attributeId;
                if (num2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num2.intValue());
                }
                out.writeString(this.attributeType);
                List<FiltrationSetting> list = this._subFilters;
                out.writeInt(list.size());
                for (FiltrationSetting filtrationSetting : list) {
                    filtrationSetting.writeToParcel(out, i11);
                }
            }

            public FiltrationSetting(UUID id2, UUID uuid, FilterType filterType, ViewType viewType, ExposeType exposeType, Label label, SelectionType selectionType, Integer num, Integer num2, String str, List<FiltrationSetting> _subFilters) {
                o.i(id2, "id");
                o.i(label, "label");
                o.i(_subFilters, "_subFilters");
                this.f22355id = id2;
                this.parentId = uuid;
                this.filterType = filterType;
                this.viewType = viewType;
                this.exposeType = exposeType;
                this.label = label;
                this._selectionType = selectionType;
                this._dependOnParent = num;
                this.attributeId = num2;
                this.attributeType = str;
                this._subFilters = _subFilters;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public /* synthetic */ FiltrationSetting(java.util.UUID r13, java.util.UUID r14, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.FilterType r15, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.ViewType r16, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.ExposeType r17, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.Label r18, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.SelectionType r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
                /*
                    r12 = this;
                    r0 = r24
                    r1 = r0 & 1
                    if (r1 == 0) goto L10
                    java.util.UUID r1 = java.util.UUID.randomUUID()
                    java.lang.String r2 = "randomUUID(...)"
                    kotlin.jvm.internal.o.h(r1, r2)
                    goto L11
                L10:
                    r1 = r13
                L11:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L18
                    r2 = r3
                    goto L19
                L18:
                    r2 = r14
                L19:
                    r4 = r0 & 4
                    if (r4 == 0) goto L1f
                    r4 = r3
                    goto L20
                L1f:
                    r4 = r15
                L20:
                    r5 = r0 & 8
                    if (r5 == 0) goto L26
                    r5 = r3
                    goto L28
                L26:
                    r5 = r16
                L28:
                    r6 = r0 & 16
                    if (r6 == 0) goto L2f
                    com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$ExposeType r6 = com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.ExposeType.NONE
                    goto L31
                L2f:
                    r6 = r17
                L31:
                    r7 = r0 & 32
                    if (r7 == 0) goto L3c
                    com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label r7 = new com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label
                    r8 = 3
                    r7.<init>(r3, r3, r8, r3)
                    goto L3e
                L3c:
                    r7 = r18
                L3e:
                    r8 = r0 & 64
                    if (r8 == 0) goto L44
                    r8 = r3
                    goto L46
                L44:
                    r8 = r19
                L46:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L50
                    r9 = 0
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    goto L52
                L50:
                    r9 = r20
                L52:
                    r10 = r0 & 256(0x100, float:3.59E-43)
                    if (r10 == 0) goto L58
                    r10 = r3
                    goto L5a
                L58:
                    r10 = r21
                L5a:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L5f
                    goto L61
                L5f:
                    r3 = r22
                L61:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L6a
                    java.util.List r0 = kotlin.collections.p.n()
                    goto L6c
                L6a:
                    r0 = r23
                L6c:
                    r13 = r12
                    r14 = r1
                    r15 = r2
                    r16 = r4
                    r17 = r5
                    r18 = r6
                    r19 = r7
                    r20 = r8
                    r21 = r9
                    r22 = r10
                    r23 = r3
                    r24 = r0
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.<init>(java.util.UUID, java.util.UUID, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$FilterType, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$ViewType, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$ExposeType, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$SelectionType, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class Label implements Parcelable {
            @c(SearchPlaceholderKeywordEntity.AR)

            /* renamed from: ar  reason: collision with root package name */
            private final String f22356ar;
            @c(SearchPlaceholderKeywordEntity.EN)

            /* renamed from: en  reason: collision with root package name */
            private final String f22357en;
            public static final Parcelable.Creator<Label> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<Label> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Label createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    return new Label(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Label[] newArray(int i11) {
                    return new Label[i11];
                }
            }

            public Label() {
                this(null, null, 3, null);
            }

            public static /* synthetic */ Label copy$default(Label label, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = label.f22356ar;
                }
                if ((i11 & 2) != 0) {
                    str2 = label.f22357en;
                }
                return label.copy(str, str2);
            }

            public final String component1() {
                return this.f22356ar;
            }

            public final String component2() {
                return this.f22357en;
            }

            public final Label copy(String ar2, String en2) {
                o.i(ar2, "ar");
                o.i(en2, "en");
                return new Label(ar2, en2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Label)) {
                    return false;
                }
                Label label = (Label) obj;
                if (o.d(this.f22356ar, label.f22356ar) && o.d(this.f22357en, label.f22357en)) {
                    return true;
                }
                return false;
            }

            public final String getAr() {
                return this.f22356ar;
            }

            public final String getEn() {
                return this.f22357en;
            }

            public final String getLocalized() {
                if (LocaleManager.f39597a.r()) {
                    return this.f22356ar;
                }
                return this.f22357en;
            }

            public int hashCode() {
                return (this.f22356ar.hashCode() * 31) + this.f22357en.hashCode();
            }

            public String toString() {
                String str = this.f22356ar;
                String str2 = this.f22357en;
                return "Label(ar=" + str + ", en=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeString(this.f22356ar);
                out.writeString(this.f22357en);
            }

            public Label(String ar2, String en2) {
                o.i(ar2, "ar");
                o.i(en2, "en");
                this.f22356ar = ar2;
                this.f22357en = en2;
            }

            public /* synthetic */ Label(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? ListingsResponse.DEFAULT_LABEL : str, (i11 & 2) != 0 ? ListingsResponse.DEFAULT_LABEL : str2);
            }
        }

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class ListingsSettings {
            public static final int $stable = 8;
            @c("card_display_style")
            private final ListingCardDisplayStyle _cardDisplayStyle;
            @c("card_display_style_history")
            private final List<String> _cardDisplayStyleHistory;
            @c("placeholder_image")
            private final ListingPlaceHolderImage _placeholderImage;
            @c("vertical_style")
            private final List<ListingsVerticalStyles> _verticalStyle;
            @c(Constants.Kinds.COLOR)
            private final String color;
            @c("mpu_frequency")
            private final int mpuFrequency;
            @c("number_of_lines")
            private final int numberOfLines;

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ListingCardDisplayStyle.values().length];
                    try {
                        iArr[ListingCardDisplayStyle.FULL_SCREEN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_DESCRIPTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_ATTRIBUTES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.FULL_SCREEN_FOR_PROPERTY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.GENERAL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ListingCardDisplayStyle.HALF_SCREEN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public ListingsSettings() {
                this(null, null, null, null, null, 0, 0, 127, null);
            }

            private final ListingPlaceHolderImage component2() {
                return this._placeholderImage;
            }

            private final ListingCardDisplayStyle component3() {
                return this._cardDisplayStyle;
            }

            private final List<ListingsVerticalStyles> component4() {
                return this._verticalStyle;
            }

            private final List<String> component5() {
                return this._cardDisplayStyleHistory;
            }

            public static /* synthetic */ ListingsSettings copy$default(ListingsSettings listingsSettings, String str, ListingPlaceHolderImage listingPlaceHolderImage, ListingCardDisplayStyle listingCardDisplayStyle, List list, List list2, int i11, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = listingsSettings.color;
                }
                if ((i13 & 2) != 0) {
                    listingPlaceHolderImage = listingsSettings._placeholderImage;
                }
                ListingPlaceHolderImage listingPlaceHolderImage2 = listingPlaceHolderImage;
                if ((i13 & 4) != 0) {
                    listingCardDisplayStyle = listingsSettings._cardDisplayStyle;
                }
                ListingCardDisplayStyle listingCardDisplayStyle2 = listingCardDisplayStyle;
                List<ListingsVerticalStyles> list3 = list;
                if ((i13 & 8) != 0) {
                    list3 = listingsSettings._verticalStyle;
                }
                List list4 = list3;
                List<String> list5 = list2;
                if ((i13 & 16) != 0) {
                    list5 = listingsSettings._cardDisplayStyleHistory;
                }
                List list6 = list5;
                if ((i13 & 32) != 0) {
                    i11 = listingsSettings.numberOfLines;
                }
                int i14 = i11;
                if ((i13 & 64) != 0) {
                    i12 = listingsSettings.mpuFrequency;
                }
                return listingsSettings.copy(str, listingPlaceHolderImage2, listingCardDisplayStyle2, list4, list6, i14, i12);
            }

            private final ListingCardDisplayStyle getCardDisplayStyleValue(ListingDecoratorTypes listingDecoratorTypes) {
                boolean z11;
                List<String> list = this._cardDisplayStyleHistory;
                if (list != null && !list.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    List<String> list2 = this._cardDisplayStyleHistory;
                    if (list2 == null) {
                        list2 = r.n();
                    }
                    return getStyle(listingDecoratorTypes, list2);
                }
                ListingCardDisplayStyle listingCardDisplayStyle = this._cardDisplayStyle;
                if (listingCardDisplayStyle != null) {
                    return listingCardDisplayStyle;
                }
                return listingDecoratorTypes.getDefaultItem();
            }

            public final String component1() {
                return this.color;
            }

            public final int component6() {
                return this.numberOfLines;
            }

            public final int component7() {
                return this.mpuFrequency;
            }

            public final ListingsSettings copy(String str, ListingPlaceHolderImage listingPlaceHolderImage, ListingCardDisplayStyle listingCardDisplayStyle, List<? extends ListingsVerticalStyles> list, List<String> list2, int i11, int i12) {
                return new ListingsSettings(str, listingPlaceHolderImage, listingCardDisplayStyle, list, list2, i11, i12);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ListingsSettings)) {
                    return false;
                }
                ListingsSettings listingsSettings = (ListingsSettings) obj;
                if (o.d(this.color, listingsSettings.color) && this._placeholderImage == listingsSettings._placeholderImage && this._cardDisplayStyle == listingsSettings._cardDisplayStyle && o.d(this._verticalStyle, listingsSettings._verticalStyle) && o.d(this._cardDisplayStyleHistory, listingsSettings._cardDisplayStyleHistory) && this.numberOfLines == listingsSettings.numberOfLines && this.mpuFrequency == listingsSettings.mpuFrequency) {
                    return true;
                }
                return false;
            }

            public final ListingCardDisplayStyle getCardDisplay(ListingDecoratorTypes listingDecoratorType) {
                o.i(listingDecoratorType, "listingDecoratorType");
                ListingCardDisplayStyle cardDisplayStyleValue = getCardDisplayStyleValue(listingDecoratorType);
                if (cardDisplayStyleValue == null) {
                    return ListingCardDisplayStyle.HALF_SCREEN;
                }
                return cardDisplayStyleValue;
            }

            public final String getColor() {
                return this.color;
            }

            public final int getMpuFrequency() {
                return this.mpuFrequency;
            }

            public final int getNumberOfLines() {
                return this.numberOfLines;
            }

            public final ListingPlaceHolderImage getPlaceholderImage() {
                ListingPlaceHolderImage listingPlaceHolderImage = this._placeholderImage;
                if (listingPlaceHolderImage == null) {
                    return ListingPlaceHolderImage.DEFAULT;
                }
                return listingPlaceHolderImage;
            }

            public final ListingCardDisplayStyle getStyle(ListingDecoratorTypes listingDecoratorType, List<String> history) {
                Object w02;
                o.i(listingDecoratorType, "listingDecoratorType");
                o.i(history, "history");
                ArrayList arrayList = new ArrayList();
                for (String str : history) {
                    ListingCardDisplayStyle a11 = ListingCardDisplayStyle.Companion.a(str);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (ListingCardDisplayStyle.Companion.b(listingDecoratorType).contains((ListingCardDisplayStyle) obj)) {
                        arrayList2.add(obj);
                    }
                }
                w02 = CollectionsKt___CollectionsKt.w0(arrayList2);
                ListingCardDisplayStyle listingCardDisplayStyle = (ListingCardDisplayStyle) w02;
                if (listingCardDisplayStyle == null) {
                    return listingDecoratorType.getDefaultItem();
                }
                return listingCardDisplayStyle;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.H0(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.h0(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.H0(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.c1(r0);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.forsale.app.features.categories.listings.ListingsVerticalStyles getVerticalStyle() {
                /*
                    r1 = this;
                    java.util.List<com.forsale.app.features.categories.listings.ListingsVerticalStyles> r0 = r1._verticalStyle
                    if (r0 == 0) goto L2b
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.List r0 = kotlin.collections.p.h0(r0)
                    if (r0 == 0) goto L2b
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.List r0 = kotlin.collections.p.H0(r0)
                    if (r0 == 0) goto L2b
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Set r0 = kotlin.collections.p.c1(r0)
                    if (r0 == 0) goto L2b
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.List r0 = kotlin.collections.p.H0(r0)
                    if (r0 == 0) goto L2b
                    java.lang.Object r0 = kotlin.collections.p.w0(r0)
                    com.forsale.app.features.categories.listings.ListingsVerticalStyles r0 = (com.forsale.app.features.categories.listings.ListingsVerticalStyles) r0
                    goto L2c
                L2b:
                    r0 = 0
                L2c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.ListingsSettings.getVerticalStyle():com.forsale.app.features.categories.listings.ListingsVerticalStyles");
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                String str = this.color;
                int i11 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i12 = hashCode * 31;
                ListingPlaceHolderImage listingPlaceHolderImage = this._placeholderImage;
                if (listingPlaceHolderImage == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = listingPlaceHolderImage.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                ListingCardDisplayStyle listingCardDisplayStyle = this._cardDisplayStyle;
                if (listingCardDisplayStyle == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = listingCardDisplayStyle.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                List<ListingsVerticalStyles> list = this._verticalStyle;
                if (list == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = list.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                List<String> list2 = this._cardDisplayStyleHistory;
                if (list2 != null) {
                    i11 = list2.hashCode();
                }
                return ((((i15 + i11) * 31) + Integer.hashCode(this.numberOfLines)) * 31) + Integer.hashCode(this.mpuFrequency);
            }

            public final int mapCardDisplayStyleToSpinCount(ListingDecoratorTypes listingDecoratorType) {
                o.i(listingDecoratorType, "listingDecoratorType");
                switch (WhenMappings.$EnumSwitchMapping$0[getCardDisplay(listingDecoratorType).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return 1;
                    case 7:
                        return 2;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public String toString() {
                String str = this.color;
                ListingPlaceHolderImage listingPlaceHolderImage = this._placeholderImage;
                ListingCardDisplayStyle listingCardDisplayStyle = this._cardDisplayStyle;
                List<ListingsVerticalStyles> list = this._verticalStyle;
                List<String> list2 = this._cardDisplayStyleHistory;
                int i11 = this.numberOfLines;
                int i12 = this.mpuFrequency;
                return "ListingsSettings(color=" + str + ", _placeholderImage=" + listingPlaceHolderImage + ", _cardDisplayStyle=" + listingCardDisplayStyle + ", _verticalStyle=" + list + ", _cardDisplayStyleHistory=" + list2 + ", numberOfLines=" + i11 + ", mpuFrequency=" + i12 + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ListingsSettings(String str, ListingPlaceHolderImage listingPlaceHolderImage, ListingCardDisplayStyle listingCardDisplayStyle, List<? extends ListingsVerticalStyles> list, List<String> list2, int i11, int i12) {
                this.color = str;
                this._placeholderImage = listingPlaceHolderImage;
                this._cardDisplayStyle = listingCardDisplayStyle;
                this._verticalStyle = list;
                this._cardDisplayStyleHistory = list2;
                this.numberOfLines = i11;
                this.mpuFrequency = i12;
            }

            public /* synthetic */ ListingsSettings(String str, ListingPlaceHolderImage listingPlaceHolderImage, ListingCardDisplayStyle listingCardDisplayStyle, List list, List list2, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : listingPlaceHolderImage, (i13 & 4) != 0 ? null : listingCardDisplayStyle, (i13 & 8) != 0 ? null : list, (i13 & 16) == 0 ? list2 : null, (i13 & 32) != 0 ? 1 : i11, (i13 & 64) != 0 ? 5 : i12);
            }
        }

        /* compiled from: ListingsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class PinningSettings {
            public static final int $stable = 0;
            @c("empty_artwork")
            private final EmptyArtwork emptyArtwork;
            @c(CategoryDistrict.PINNING_SHUFFLE_FACTOR)
            private final Integer pinningShuffleFactor;
            @c("subtitle")
            private final Label subtitle;
            @c("title")
            private final Label title;

            /* compiled from: ListingsResponse.kt */
            /* loaded from: classes2.dex */
            public static final class EmptyArtwork {
                public static final int $stable = 0;
                @c("image_ar")

                /* renamed from: ar  reason: collision with root package name */
                private final String f22358ar;
                @c("image_en")

                /* renamed from: en  reason: collision with root package name */
                private final String f22359en;

                public EmptyArtwork(String ar2, String en2) {
                    o.i(ar2, "ar");
                    o.i(en2, "en");
                    this.f22358ar = ar2;
                    this.f22359en = en2;
                }

                public static /* synthetic */ EmptyArtwork copy$default(EmptyArtwork emptyArtwork, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = emptyArtwork.f22358ar;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = emptyArtwork.f22359en;
                    }
                    return emptyArtwork.copy(str, str2);
                }

                public final String component1() {
                    return this.f22358ar;
                }

                public final String component2() {
                    return this.f22359en;
                }

                public final EmptyArtwork copy(String ar2, String en2) {
                    o.i(ar2, "ar");
                    o.i(en2, "en");
                    return new EmptyArtwork(ar2, en2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EmptyArtwork)) {
                        return false;
                    }
                    EmptyArtwork emptyArtwork = (EmptyArtwork) obj;
                    if (o.d(this.f22358ar, emptyArtwork.f22358ar) && o.d(this.f22359en, emptyArtwork.f22359en)) {
                        return true;
                    }
                    return false;
                }

                public final String getAr() {
                    return this.f22358ar;
                }

                public final String getEn() {
                    return this.f22359en;
                }

                public final String getLocalized() {
                    if (LocaleManager.f39597a.r()) {
                        return this.f22358ar;
                    }
                    return this.f22359en;
                }

                public int hashCode() {
                    return (this.f22358ar.hashCode() * 31) + this.f22359en.hashCode();
                }

                public String toString() {
                    String str = this.f22358ar;
                    String str2 = this.f22359en;
                    return "EmptyArtwork(ar=" + str + ", en=" + str2 + ")";
                }
            }

            public PinningSettings() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ PinningSettings copy$default(PinningSettings pinningSettings, Label label, Label label2, EmptyArtwork emptyArtwork, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    label = pinningSettings.title;
                }
                if ((i11 & 2) != 0) {
                    label2 = pinningSettings.subtitle;
                }
                if ((i11 & 4) != 0) {
                    emptyArtwork = pinningSettings.emptyArtwork;
                }
                if ((i11 & 8) != 0) {
                    num = pinningSettings.pinningShuffleFactor;
                }
                return pinningSettings.copy(label, label2, emptyArtwork, num);
            }

            public final Label component1() {
                return this.title;
            }

            public final Label component2() {
                return this.subtitle;
            }

            public final EmptyArtwork component3() {
                return this.emptyArtwork;
            }

            public final Integer component4() {
                return this.pinningShuffleFactor;
            }

            public final PinningSettings copy(Label title, Label subtitle, EmptyArtwork emptyArtwork, Integer num) {
                o.i(title, "title");
                o.i(subtitle, "subtitle");
                return new PinningSettings(title, subtitle, emptyArtwork, num);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PinningSettings)) {
                    return false;
                }
                PinningSettings pinningSettings = (PinningSettings) obj;
                if (o.d(this.title, pinningSettings.title) && o.d(this.subtitle, pinningSettings.subtitle) && o.d(this.emptyArtwork, pinningSettings.emptyArtwork) && o.d(this.pinningShuffleFactor, pinningSettings.pinningShuffleFactor)) {
                    return true;
                }
                return false;
            }

            public final EmptyArtwork getEmptyArtwork() {
                return this.emptyArtwork;
            }

            public final Integer getPinningShuffleFactor() {
                return this.pinningShuffleFactor;
            }

            public final Label getSubtitle() {
                return this.subtitle;
            }

            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
                EmptyArtwork emptyArtwork = this.emptyArtwork;
                int i11 = 0;
                if (emptyArtwork == null) {
                    hashCode = 0;
                } else {
                    hashCode = emptyArtwork.hashCode();
                }
                int i12 = (hashCode2 + hashCode) * 31;
                Integer num = this.pinningShuffleFactor;
                if (num != null) {
                    i11 = num.hashCode();
                }
                return i12 + i11;
            }

            public String toString() {
                Label label = this.title;
                Label label2 = this.subtitle;
                EmptyArtwork emptyArtwork = this.emptyArtwork;
                Integer num = this.pinningShuffleFactor;
                return "PinningSettings(title=" + label + ", subtitle=" + label2 + ", emptyArtwork=" + emptyArtwork + ", pinningShuffleFactor=" + num + ")";
            }

            public PinningSettings(Label title, Label subtitle, EmptyArtwork emptyArtwork, Integer num) {
                o.i(title, "title");
                o.i(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
                this.emptyArtwork = emptyArtwork;
                this.pinningShuffleFactor = num;
            }

            public /* synthetic */ PinningSettings(Label label, Label label2, EmptyArtwork emptyArtwork, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? new Label(null, null, 3, null) : label, (i11 & 2) != 0 ? new Label(null, null, 3, null) : label2, (i11 & 4) != 0 ? null : emptyArtwork, (i11 & 8) != 0 ? null : num);
            }
        }

        public UISettings() {
            this(null, null, null, null, null, 31, null);
        }

        private final ListingsSettings component3() {
            return this._listingsSettings;
        }

        private final FillersSettings component4() {
            return this._fillersSettings;
        }

        private final BannerSettings component5() {
            return this._bannerSetting;
        }

        public static /* synthetic */ UISettings copy$default(UISettings uISettings, PinningSettings pinningSettings, List list, ListingsSettings listingsSettings, FillersSettings fillersSettings, BannerSettings bannerSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pinningSettings = uISettings.pinningSettings;
            }
            List<FiltrationSetting> list2 = list;
            if ((i11 & 2) != 0) {
                list2 = uISettings.filtrationSettings;
            }
            List list3 = list2;
            if ((i11 & 4) != 0) {
                listingsSettings = uISettings._listingsSettings;
            }
            ListingsSettings listingsSettings2 = listingsSettings;
            if ((i11 & 8) != 0) {
                fillersSettings = uISettings._fillersSettings;
            }
            FillersSettings fillersSettings2 = fillersSettings;
            if ((i11 & 16) != 0) {
                bannerSettings = uISettings._bannerSetting;
            }
            return uISettings.copy(pinningSettings, list3, listingsSettings2, fillersSettings2, bannerSettings);
        }

        public final PinningSettings component1() {
            return this.pinningSettings;
        }

        public final List<FiltrationSetting> component2() {
            return this.filtrationSettings;
        }

        public final UISettings copy(PinningSettings pinningSettings, List<FiltrationSetting> list, ListingsSettings listingsSettings, FillersSettings fillersSettings, BannerSettings bannerSettings) {
            o.i(pinningSettings, "pinningSettings");
            return new UISettings(pinningSettings, list, listingsSettings, fillersSettings, bannerSettings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UISettings)) {
                return false;
            }
            UISettings uISettings = (UISettings) obj;
            if (o.d(this.pinningSettings, uISettings.pinningSettings) && o.d(this.filtrationSettings, uISettings.filtrationSettings) && o.d(this._listingsSettings, uISettings._listingsSettings) && o.d(this._fillersSettings, uISettings._fillersSettings) && o.d(this._bannerSetting, uISettings._bannerSetting)) {
                return true;
            }
            return false;
        }

        public final BannerSettings getBannerSetting() {
            BannerSettings bannerSettings = this._bannerSetting;
            if (bannerSettings == null) {
                return new BannerSettings(null, 1, null);
            }
            return bannerSettings;
        }

        public final FillersSettings getFillersSettings() {
            FillersSettings fillersSettings = this._fillersSettings;
            if (fillersSettings == null) {
                return new FillersSettings(null, null, 3, null);
            }
            return fillersSettings;
        }

        public final List<FiltrationSetting> getFiltrationSettings() {
            return this.filtrationSettings;
        }

        public final ListingsSettings getListingsSettings() {
            ListingsSettings listingsSettings = this._listingsSettings;
            if (listingsSettings == null) {
                return new ListingsSettings(null, null, null, null, null, 0, 0, 127, null);
            }
            return listingsSettings;
        }

        public final PinningSettings getPinningSettings() {
            return this.pinningSettings;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.pinningSettings.hashCode() * 31;
            List<FiltrationSetting> list = this.filtrationSettings;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i12 = (hashCode4 + hashCode) * 31;
            ListingsSettings listingsSettings = this._listingsSettings;
            if (listingsSettings == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = listingsSettings.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            FillersSettings fillersSettings = this._fillersSettings;
            if (fillersSettings == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = fillersSettings.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            BannerSettings bannerSettings = this._bannerSetting;
            if (bannerSettings != null) {
                i11 = bannerSettings.hashCode();
            }
            return i14 + i11;
        }

        public String toString() {
            PinningSettings pinningSettings = this.pinningSettings;
            List<FiltrationSetting> list = this.filtrationSettings;
            ListingsSettings listingsSettings = this._listingsSettings;
            FillersSettings fillersSettings = this._fillersSettings;
            BannerSettings bannerSettings = this._bannerSetting;
            return "UISettings(pinningSettings=" + pinningSettings + ", filtrationSettings=" + list + ", _listingsSettings=" + listingsSettings + ", _fillersSettings=" + fillersSettings + ", _bannerSetting=" + bannerSettings + ")";
        }

        public UISettings(PinningSettings pinningSettings, List<FiltrationSetting> list, ListingsSettings listingsSettings, FillersSettings fillersSettings, BannerSettings bannerSettings) {
            o.i(pinningSettings, "pinningSettings");
            this.pinningSettings = pinningSettings;
            this.filtrationSettings = list;
            this._listingsSettings = listingsSettings;
            this._fillersSettings = fillersSettings;
            this._bannerSetting = bannerSettings;
        }

        public /* synthetic */ UISettings(PinningSettings pinningSettings, List list, ListingsSettings listingsSettings, FillersSettings fillersSettings, BannerSettings bannerSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new PinningSettings(null, null, null, null, 15, null) : pinningSettings, (i11 & 2) != 0 ? r.n() : list, (i11 & 4) != 0 ? null : listingsSettings, (i11 & 8) != 0 ? null : fillersSettings, (i11 & 16) == 0 ? bannerSettings : null);
        }
    }

    public ListingsResponse() {
        this(0, 0, 0, null, 0, null, null, null, 255, null);
    }

    public static /* synthetic */ ListingsResponse copy$default(ListingsResponse listingsResponse, int i11, int i12, int i13, Listings listings, int i14, String str, String str2, UISettings uISettings, int i15, Object obj) {
        int i16;
        int i17;
        int i18;
        Listings listings2;
        int i19;
        String str3;
        String str4;
        UISettings uISettings2;
        if ((i15 & 1) != 0) {
            i16 = listingsResponse.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 2) != 0) {
            i17 = listingsResponse.totalListings;
        } else {
            i17 = i12;
        }
        if ((i15 & 4) != 0) {
            i18 = listingsResponse.totalPages;
        } else {
            i18 = i13;
        }
        if ((i15 & 8) != 0) {
            listings2 = listingsResponse.listings;
        } else {
            listings2 = listings;
        }
        if ((i15 & 16) != 0) {
            i19 = listingsResponse.totalCommercialItems;
        } else {
            i19 = i14;
        }
        if ((i15 & 32) != 0) {
            str3 = listingsResponse.recommendedExpiryDate;
        } else {
            str3 = str;
        }
        if ((i15 & 64) != 0) {
            str4 = listingsResponse.source;
        } else {
            str4 = str2;
        }
        if ((i15 & 128) != 0) {
            uISettings2 = listingsResponse.uiSettings;
        } else {
            uISettings2 = uISettings;
        }
        return listingsResponse.copy(i16, i17, i18, listings2, i19, str3, str4, uISettings2);
    }

    public final int component1() {
        return this.page;
    }

    public final int component2() {
        return this.totalListings;
    }

    public final int component3() {
        return this.totalPages;
    }

    public final Listings component4() {
        return this.listings;
    }

    public final int component5() {
        return this.totalCommercialItems;
    }

    public final String component6() {
        return this.recommendedExpiryDate;
    }

    public final String component7() {
        return this.source;
    }

    public final UISettings component8() {
        return this.uiSettings;
    }

    public final ListingsResponse copy(int i11, int i12, int i13, Listings listings, int i14, String str, String str2, UISettings uiSettings) {
        o.i(listings, "listings");
        o.i(uiSettings, "uiSettings");
        return new ListingsResponse(i11, i12, i13, listings, i14, str, str2, uiSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingsResponse)) {
            return false;
        }
        ListingsResponse listingsResponse = (ListingsResponse) obj;
        if (this.page == listingsResponse.page && this.totalListings == listingsResponse.totalListings && this.totalPages == listingsResponse.totalPages && o.d(this.listings, listingsResponse.listings) && this.totalCommercialItems == listingsResponse.totalCommercialItems && o.d(this.recommendedExpiryDate, listingsResponse.recommendedExpiryDate) && o.d(this.source, listingsResponse.source) && o.d(this.uiSettings, listingsResponse.uiSettings)) {
            return true;
        }
        return false;
    }

    public final Listings getListings() {
        return this.listings;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getRecommendedExpiryDate() {
        return this.recommendedExpiryDate;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getTotalCommercialItems() {
        return this.totalCommercialItems;
    }

    public final int getTotalListings() {
        return this.totalListings;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final UISettings getUiSettings() {
        return this.uiSettings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.totalListings)) * 31) + Integer.hashCode(this.totalPages)) * 31) + this.listings.hashCode()) * 31) + Integer.hashCode(this.totalCommercialItems)) * 31;
        String str = this.recommendedExpiryDate;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        String str2 = this.source;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i12 + i11) * 31) + this.uiSettings.hashCode();
    }

    public String toString() {
        int i11 = this.page;
        int i12 = this.totalListings;
        int i13 = this.totalPages;
        Listings listings = this.listings;
        int i14 = this.totalCommercialItems;
        String str = this.recommendedExpiryDate;
        String str2 = this.source;
        UISettings uISettings = this.uiSettings;
        return "ListingsResponse(page=" + i11 + ", totalListings=" + i12 + ", totalPages=" + i13 + ", listings=" + listings + ", totalCommercialItems=" + i14 + ", recommendedExpiryDate=" + str + ", source=" + str2 + ", uiSettings=" + uISettings + ")";
    }

    public ListingsResponse(int i11, int i12, int i13, Listings listings, int i14, String str, String str2, UISettings uiSettings) {
        o.i(listings, "listings");
        o.i(uiSettings, "uiSettings");
        this.page = i11;
        this.totalListings = i12;
        this.totalPages = i13;
        this.listings = listings;
        this.totalCommercialItems = i14;
        this.recommendedExpiryDate = str;
        this.source = str2;
        this.uiSettings = uiSettings;
    }

    public /* synthetic */ ListingsResponse(int i11, int i12, int i13, Listings listings, int i14, String str, String str2, UISettings uISettings, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i11, (i15 & 2) != 0 ? -1 : i12, (i15 & 4) == 0 ? i13 : -1, (i15 & 8) != 0 ? new Listings(null, null, null, null, null, null, 63, null) : listings, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : str, (i15 & 64) == 0 ? str2 : null, (i15 & 128) != 0 ? new UISettings(null, null, null, null, null, 31, null) : uISettings);
    }
}
