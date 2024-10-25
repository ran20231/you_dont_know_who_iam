package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.AttributeValue;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.TypeExtensionsKt;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.AdRequest;
import com.leanplum.internal.Constants;
import falcon.chat.entities.UserEntityKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import up.c;
/* compiled from: BuyerListingDetailsResponseModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsResponseModel implements Parcelable {
    @c("data")
    private final Data data;
    @c(Constants.Params.MESSAGE)
    private final String message;
    public static final Parcelable.Creator<BuyerListingDetailsResponseModel> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BuyerListingDetailsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BuyerListingDetailsResponseModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyerListingDetailsResponseModel createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new BuyerListingDetailsResponseModel(Data.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyerListingDetailsResponseModel[] newArray(int i11) {
            return new BuyerListingDetailsResponseModel[i11];
        }
    }

    /* compiled from: BuyerListingDetailsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class Data implements Parcelable {
        @c("listing")
        private final Listing listing;
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: BuyerListingDetailsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Data(Listing.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        /* compiled from: BuyerListingDetailsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Listing implements Parcelable {
            @c("category")
            private final Category category;
            @c("contacts")
            private final List<String> contacts;
            @c(ListingItemDetails.DATE_CREATED)
            private final String dateCreated;
            @c(ListingItemDetails.DATE_EXPIRED)
            private final String dateExpired;
            @c(ListingItemBase.DATE_PUBLISHED)
            private final String datePublished;
            @c(ListingItemBase.DATE_SORT)
            private final String dateSort;
            @c("description")
            private final String description;
            @c("district")
            private final District district;
            @c(CategoryDistrict.DISTRICT_ID)
            private final Integer districtId;
            @c(ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE)
            private final List<ExtraAttribute> extraAttributes;
            @c(ListingItemDetails.EXTRA_INFO)
            private final ExtraInfo extraInfo;
            @c("images")
            private final List<String> images;
            @c(ListingItemDetails.IS_FAVORITE)
            private final Boolean isFavorite;
            @c(ListingItemBase.IS_HIDE_MY_NUMBER)
            private final Boolean isHideMyNumber;
            @c("is_private_message_enabled")
            private final Boolean isPrivateMessageEnabled;
            @c("lat")
            private final Double lat;
            @c("listing_type")
            private final ListingType listingType;
            @c("lon")
            private final Double lon;
            @c("phone")
            private final String phone;
            @c("price")
            private final String price;
            @c("regions_id")
            private final Integer regionsId;
            @c(CategoryEntity.SLUG)
            private final String slug;
            @c("source")
            private final String source;
            @c("title")
            private final String title;
            @c("user")
            private final User user;
            @c("user_adv_id")
            private final int userAdvId;
            @c("user_view_count")
            private final int userViewCount;
            @c(ListingItemDetails.VIDEO_URL)
            private final String videoUrl;
            public static final Parcelable.Creator<Listing> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<Listing> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Listing createFromParcel(Parcel parcel) {
                    District district;
                    ArrayList arrayList;
                    Boolean valueOf;
                    Boolean valueOf2;
                    Boolean valueOf3;
                    o.i(parcel, "parcel");
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    Category createFromParcel = Category.CREATOR.createFromParcel(parcel);
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    District createFromParcel2 = parcel.readInt() == 0 ? null : District.CREATOR.createFromParcel(parcel);
                    Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        district = createFromParcel2;
                        arrayList = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt3);
                        district = createFromParcel2;
                        int i11 = 0;
                        while (i11 != readInt3) {
                            arrayList2.add(ExtraAttribute.CREATOR.createFromParcel(parcel));
                            i11++;
                            readInt3 = readInt3;
                        }
                        arrayList = arrayList2;
                    }
                    ExtraInfo createFromParcel3 = parcel.readInt() == 0 ? null : ExtraInfo.CREATOR.createFromParcel(parcel);
                    ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Listing(readInt, readString, readInt2, readString2, readString3, createFromParcel, createStringArrayList, readString4, readString5, readString6, readString7, readString8, district, valueOf4, arrayList, createFromParcel3, createStringArrayList2, valueOf, valueOf2, valueOf3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : ListingType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Listing[] newArray(int i11) {
                    return new Listing[i11];
                }
            }

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class District implements Parcelable {
                @c(CategoryDistrict.DISTRICT_ID)
                private final Integer districtId;
                @c(CategoryEntity.FULL_PATH)
                private final String fullPath;
                @c("full_path_en")
                private final String fullPathEn;
                @c("name")
                private final String name;
                public static final Parcelable.Creator<District> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Creator implements Parcelable.Creator<District> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final District createFromParcel(Parcel parcel) {
                        o.i(parcel, "parcel");
                        return new District(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final District[] newArray(int i11) {
                        return new District[i11];
                    }
                }

                public District() {
                    this(null, null, null, null, 15, null);
                }

                public static /* synthetic */ District copy$default(District district, Integer num, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        num = district.districtId;
                    }
                    if ((i11 & 2) != 0) {
                        str = district.fullPath;
                    }
                    if ((i11 & 4) != 0) {
                        str2 = district.fullPathEn;
                    }
                    if ((i11 & 8) != 0) {
                        str3 = district.name;
                    }
                    return district.copy(num, str, str2, str3);
                }

                public final Integer component1() {
                    return this.districtId;
                }

                public final String component2() {
                    return this.fullPath;
                }

                public final String component3() {
                    return this.fullPathEn;
                }

                public final String component4() {
                    return this.name;
                }

                public final District copy(Integer num, String str, String str2, String str3) {
                    return new District(num, str, str2, str3);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof District)) {
                        return false;
                    }
                    District district = (District) obj;
                    if (o.d(this.districtId, district.districtId) && o.d(this.fullPath, district.fullPath) && o.d(this.fullPathEn, district.fullPathEn) && o.d(this.name, district.name)) {
                        return true;
                    }
                    return false;
                }

                public final Integer getDistrictId() {
                    return this.districtId;
                }

                public final String getFullPath() {
                    return this.fullPath;
                }

                public final String getFullPathEn() {
                    return this.fullPathEn;
                }

                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    Integer num = this.districtId;
                    int i11 = 0;
                    if (num == null) {
                        hashCode = 0;
                    } else {
                        hashCode = num.hashCode();
                    }
                    int i12 = hashCode * 31;
                    String str = this.fullPath;
                    if (str == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    String str2 = this.fullPathEn;
                    if (str2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str2.hashCode();
                    }
                    int i14 = (i13 + hashCode3) * 31;
                    String str3 = this.name;
                    if (str3 != null) {
                        i11 = str3.hashCode();
                    }
                    return i14 + i11;
                }

                public String toString() {
                    Integer num = this.districtId;
                    String str = this.fullPath;
                    String str2 = this.fullPathEn;
                    String str3 = this.name;
                    return "District(districtId=" + num + ", fullPath=" + str + ", fullPathEn=" + str2 + ", name=" + str3 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    int intValue;
                    o.i(out, "out");
                    Integer num = this.districtId;
                    if (num == null) {
                        intValue = 0;
                    } else {
                        out.writeInt(1);
                        intValue = num.intValue();
                    }
                    out.writeInt(intValue);
                    out.writeString(this.fullPath);
                    out.writeString(this.fullPathEn);
                    out.writeString(this.name);
                }

                public District(Integer num, String str, String str2, String str3) {
                    this.districtId = num;
                    this.fullPath = str;
                    this.fullPathEn = str2;
                    this.name = str3;
                }

                public /* synthetic */ District(Integer num, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
                }
            }

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class ExtraInfo implements Parcelable {
                @c("location_info")
                private final LocationInfo locationInfo;
                @c("type")
                private final String type;
                @c("virtual_tour")
                private final VirtualTour virtualTour;
                public static final Parcelable.Creator<ExtraInfo> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Creator implements Parcelable.Creator<ExtraInfo> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ExtraInfo createFromParcel(Parcel parcel) {
                        o.i(parcel, "parcel");
                        return new ExtraInfo(parcel.readInt() == 0 ? null : LocationInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VirtualTour.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ExtraInfo[] newArray(int i11) {
                        return new ExtraInfo[i11];
                    }
                }

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class LocationInfo implements Parcelable {
                    @c("landmarks")
                    private final List<String> landmarks;
                    @c("lat")
                    private final Double lat;
                    @c(Constants.Keys.LOCATION)
                    private final Location location;
                    @c("lon")
                    private final Double lon;
                    @c("street_name")
                    private final String streetName;
                    public static final Parcelable.Creator<LocationInfo> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* compiled from: BuyerListingDetailsResponseModel.kt */
                    /* loaded from: classes2.dex */
                    public static final class Creator implements Parcelable.Creator<LocationInfo> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final LocationInfo createFromParcel(Parcel parcel) {
                            o.i(parcel, "parcel");
                            return new LocationInfo(parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? Location.CREATOR.createFromParcel(parcel) : null);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final LocationInfo[] newArray(int i11) {
                            return new LocationInfo[i11];
                        }
                    }

                    public LocationInfo() {
                        this(null, null, null, null, null, 31, null);
                    }

                    public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, List list, Double d11, Double d12, String str, Location location, int i11, Object obj) {
                        List<String> list2 = list;
                        if ((i11 & 1) != 0) {
                            list2 = locationInfo.landmarks;
                        }
                        if ((i11 & 2) != 0) {
                            d11 = locationInfo.lat;
                        }
                        Double d13 = d11;
                        if ((i11 & 4) != 0) {
                            d12 = locationInfo.lon;
                        }
                        Double d14 = d12;
                        if ((i11 & 8) != 0) {
                            str = locationInfo.streetName;
                        }
                        String str2 = str;
                        if ((i11 & 16) != 0) {
                            location = locationInfo.location;
                        }
                        return locationInfo.copy(list2, d13, d14, str2, location);
                    }

                    public final List<String> component1() {
                        return this.landmarks;
                    }

                    public final Double component2() {
                        return this.lat;
                    }

                    public final Double component3() {
                        return this.lon;
                    }

                    public final String component4() {
                        return this.streetName;
                    }

                    public final Location component5() {
                        return this.location;
                    }

                    public final LocationInfo copy(List<String> list, Double d11, Double d12, String str, Location location) {
                        return new LocationInfo(list, d11, d12, str, location);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof LocationInfo)) {
                            return false;
                        }
                        LocationInfo locationInfo = (LocationInfo) obj;
                        if (o.d(this.landmarks, locationInfo.landmarks) && o.d(this.lat, locationInfo.lat) && o.d(this.lon, locationInfo.lon) && o.d(this.streetName, locationInfo.streetName) && this.location == locationInfo.location) {
                            return true;
                        }
                        return false;
                    }

                    public final List<String> getLandmarks() {
                        return this.landmarks;
                    }

                    public final Double getLat() {
                        return this.lat;
                    }

                    public final Location getLocation() {
                        return this.location;
                    }

                    public final Double getLon() {
                        return this.lon;
                    }

                    public final String getStreetName() {
                        return this.streetName;
                    }

                    public int hashCode() {
                        int hashCode;
                        int hashCode2;
                        int hashCode3;
                        int hashCode4;
                        List<String> list = this.landmarks;
                        int i11 = 0;
                        if (list == null) {
                            hashCode = 0;
                        } else {
                            hashCode = list.hashCode();
                        }
                        int i12 = hashCode * 31;
                        Double d11 = this.lat;
                        if (d11 == null) {
                            hashCode2 = 0;
                        } else {
                            hashCode2 = d11.hashCode();
                        }
                        int i13 = (i12 + hashCode2) * 31;
                        Double d12 = this.lon;
                        if (d12 == null) {
                            hashCode3 = 0;
                        } else {
                            hashCode3 = d12.hashCode();
                        }
                        int i14 = (i13 + hashCode3) * 31;
                        String str = this.streetName;
                        if (str == null) {
                            hashCode4 = 0;
                        } else {
                            hashCode4 = str.hashCode();
                        }
                        int i15 = (i14 + hashCode4) * 31;
                        Location location = this.location;
                        if (location != null) {
                            i11 = location.hashCode();
                        }
                        return i15 + i11;
                    }

                    public final boolean isLocationDisabled() {
                        Double d11;
                        if (this.location != Location.DISABLED && (((d11 = this.lat) != null || this.lon != null) && (!o.a(d11, Utils.DOUBLE_EPSILON) || !o.a(this.lon, Utils.DOUBLE_EPSILON)))) {
                            return false;
                        }
                        return true;
                    }

                    public String toString() {
                        List<String> list = this.landmarks;
                        Double d11 = this.lat;
                        Double d12 = this.lon;
                        String str = this.streetName;
                        Location location = this.location;
                        return "LocationInfo(landmarks=" + list + ", lat=" + d11 + ", lon=" + d12 + ", streetName=" + str + ", location=" + location + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i11) {
                        o.i(out, "out");
                        out.writeStringList(this.landmarks);
                        Double d11 = this.lat;
                        if (d11 == null) {
                            out.writeInt(0);
                        } else {
                            out.writeInt(1);
                            out.writeDouble(d11.doubleValue());
                        }
                        Double d12 = this.lon;
                        if (d12 == null) {
                            out.writeInt(0);
                        } else {
                            out.writeInt(1);
                            out.writeDouble(d12.doubleValue());
                        }
                        out.writeString(this.streetName);
                        Location location = this.location;
                        if (location == null) {
                            out.writeInt(0);
                            return;
                        }
                        out.writeInt(1);
                        location.writeToParcel(out, i11);
                    }

                    public LocationInfo(List<String> list, Double d11, Double d12, String str, Location location) {
                        this.landmarks = list;
                        this.lat = d11;
                        this.lon = d12;
                        this.streetName = str;
                        this.location = location;
                    }

                    public /* synthetic */ LocationInfo(List list, Double d11, Double d12, String str, Location location, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : d11, (i11 & 4) != 0 ? null : d12, (i11 & 8) == 0 ? str : null, (i11 & 16) != 0 ? Location.APPROXIMATE : location);
                    }
                }

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class VirtualTour implements Parcelable {
                    @c("thumb")
                    private final String thumb;
                    @c("url")
                    private final String url;
                    public static final Parcelable.Creator<VirtualTour> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* compiled from: BuyerListingDetailsResponseModel.kt */
                    /* loaded from: classes2.dex */
                    public static final class Creator implements Parcelable.Creator<VirtualTour> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final VirtualTour createFromParcel(Parcel parcel) {
                            o.i(parcel, "parcel");
                            return new VirtualTour(parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final VirtualTour[] newArray(int i11) {
                            return new VirtualTour[i11];
                        }
                    }

                    public VirtualTour() {
                        this(null, null, 3, null);
                    }

                    public static /* synthetic */ VirtualTour copy$default(VirtualTour virtualTour, String str, String str2, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = virtualTour.thumb;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = virtualTour.url;
                        }
                        return virtualTour.copy(str, str2);
                    }

                    public final String component1() {
                        return this.thumb;
                    }

                    public final String component2() {
                        return this.url;
                    }

                    public final VirtualTour copy(String str, String str2) {
                        return new VirtualTour(str, str2);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof VirtualTour)) {
                            return false;
                        }
                        VirtualTour virtualTour = (VirtualTour) obj;
                        if (o.d(this.thumb, virtualTour.thumb) && o.d(this.url, virtualTour.url)) {
                            return true;
                        }
                        return false;
                    }

                    public final String getThumb() {
                        return this.thumb;
                    }

                    public final String getUrl() {
                        return this.url;
                    }

                    public int hashCode() {
                        int hashCode;
                        String str = this.thumb;
                        int i11 = 0;
                        if (str == null) {
                            hashCode = 0;
                        } else {
                            hashCode = str.hashCode();
                        }
                        int i12 = hashCode * 31;
                        String str2 = this.url;
                        if (str2 != null) {
                            i11 = str2.hashCode();
                        }
                        return i12 + i11;
                    }

                    public String toString() {
                        String str = this.thumb;
                        String str2 = this.url;
                        return "VirtualTour(thumb=" + str + ", url=" + str2 + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i11) {
                        o.i(out, "out");
                        out.writeString(this.thumb);
                        out.writeString(this.url);
                    }

                    public VirtualTour(String str, String str2) {
                        this.thumb = str;
                        this.url = str2;
                    }

                    public /* synthetic */ VirtualTour(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
                    }
                }

                public ExtraInfo() {
                    this(null, null, null, 7, null);
                }

                public static /* synthetic */ ExtraInfo copy$default(ExtraInfo extraInfo, LocationInfo locationInfo, VirtualTour virtualTour, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        locationInfo = extraInfo.locationInfo;
                    }
                    if ((i11 & 2) != 0) {
                        virtualTour = extraInfo.virtualTour;
                    }
                    if ((i11 & 4) != 0) {
                        str = extraInfo.type;
                    }
                    return extraInfo.copy(locationInfo, virtualTour, str);
                }

                public final LocationInfo component1() {
                    return this.locationInfo;
                }

                public final VirtualTour component2() {
                    return this.virtualTour;
                }

                public final String component3() {
                    return this.type;
                }

                public final ExtraInfo copy(LocationInfo locationInfo, VirtualTour virtualTour, String str) {
                    return new ExtraInfo(locationInfo, virtualTour, str);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ExtraInfo)) {
                        return false;
                    }
                    ExtraInfo extraInfo = (ExtraInfo) obj;
                    if (o.d(this.locationInfo, extraInfo.locationInfo) && o.d(this.virtualTour, extraInfo.virtualTour) && o.d(this.type, extraInfo.type)) {
                        return true;
                    }
                    return false;
                }

                public final LocationInfo getLocationInfo() {
                    return this.locationInfo;
                }

                public final String getType() {
                    return this.type;
                }

                public final VirtualTour getVirtualTour() {
                    return this.virtualTour;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    LocationInfo locationInfo = this.locationInfo;
                    int i11 = 0;
                    if (locationInfo == null) {
                        hashCode = 0;
                    } else {
                        hashCode = locationInfo.hashCode();
                    }
                    int i12 = hashCode * 31;
                    VirtualTour virtualTour = this.virtualTour;
                    if (virtualTour == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = virtualTour.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    String str = this.type;
                    if (str != null) {
                        i11 = str.hashCode();
                    }
                    return i13 + i11;
                }

                public String toString() {
                    LocationInfo locationInfo = this.locationInfo;
                    VirtualTour virtualTour = this.virtualTour;
                    String str = this.type;
                    return "ExtraInfo(locationInfo=" + locationInfo + ", virtualTour=" + virtualTour + ", type=" + str + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    o.i(out, "out");
                    LocationInfo locationInfo = this.locationInfo;
                    if (locationInfo == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        locationInfo.writeToParcel(out, i11);
                    }
                    VirtualTour virtualTour = this.virtualTour;
                    if (virtualTour == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        virtualTour.writeToParcel(out, i11);
                    }
                    out.writeString(this.type);
                }

                public ExtraInfo(LocationInfo locationInfo, VirtualTour virtualTour, String str) {
                    this.locationInfo = locationInfo;
                    this.virtualTour = virtualTour;
                    this.type = str;
                }

                public /* synthetic */ ExtraInfo(LocationInfo locationInfo, VirtualTour virtualTour, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : locationInfo, (i11 & 2) != 0 ? null : virtualTour, (i11 & 4) != 0 ? null : str);
                }
            }

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class User implements Parcelable {
                @c("allow_follow")
                private final Boolean allowFollow;
                @c("email")
                private final String email;
                @c("first_name")
                private final String firstName;
                @c("image")
                private final String image;
                @c("is_follower")
                private final Boolean isFollower;
                @c(CategoryDistrict.LISTINGS_COUNT)
                private final Integer listingsCount;
                @c("member_since")
                private final String memberSince;
                @c("phone")
                private final String phone;
                @c("region_id")
                private final Integer regionId;
                @c(UserEntityKt.USER_ID)
                private final Integer userId;
                @c("user_type")
                private final UserType userType;
                public static final Parcelable.Creator<User> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Creator implements Parcelable.Creator<User> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final User createFromParcel(Parcel parcel) {
                        Boolean valueOf;
                        Boolean valueOf2;
                        o.i(parcel, "parcel");
                        if (parcel.readInt() == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                        Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                        Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                        if (parcel.readInt() == 0) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new User(valueOf, readString, readString2, readString3, readString4, readString5, valueOf3, valueOf4, valueOf5, valueOf2, parcel.readInt() != 0 ? UserType.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final User[] newArray(int i11) {
                        return new User[i11];
                    }
                }

                public User() {
                    this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
                }

                public static /* synthetic */ User copy$default(User user, Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool2, UserType userType, int i11, Object obj) {
                    Boolean bool3;
                    String str6;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    Integer num4;
                    Integer num5;
                    Integer num6;
                    Boolean bool4;
                    UserType userType2;
                    if ((i11 & 1) != 0) {
                        bool3 = user.allowFollow;
                    } else {
                        bool3 = bool;
                    }
                    if ((i11 & 2) != 0) {
                        str6 = user.email;
                    } else {
                        str6 = str;
                    }
                    if ((i11 & 4) != 0) {
                        str7 = user.firstName;
                    } else {
                        str7 = str2;
                    }
                    if ((i11 & 8) != 0) {
                        str8 = user.image;
                    } else {
                        str8 = str3;
                    }
                    if ((i11 & 16) != 0) {
                        str9 = user.memberSince;
                    } else {
                        str9 = str4;
                    }
                    if ((i11 & 32) != 0) {
                        str10 = user.phone;
                    } else {
                        str10 = str5;
                    }
                    if ((i11 & 64) != 0) {
                        num4 = user.regionId;
                    } else {
                        num4 = num;
                    }
                    if ((i11 & 128) != 0) {
                        num5 = user.userId;
                    } else {
                        num5 = num2;
                    }
                    if ((i11 & 256) != 0) {
                        num6 = user.listingsCount;
                    } else {
                        num6 = num3;
                    }
                    if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                        bool4 = user.isFollower;
                    } else {
                        bool4 = bool2;
                    }
                    if ((i11 & 1024) != 0) {
                        userType2 = user.userType;
                    } else {
                        userType2 = userType;
                    }
                    return user.copy(bool3, str6, str7, str8, str9, str10, num4, num5, num6, bool4, userType2);
                }

                public static /* synthetic */ UserProfileData mapToUserProfileData$default(User user, Integer num, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        num = null;
                    }
                    return user.mapToUserProfileData(num);
                }

                public final Boolean component1() {
                    return this.allowFollow;
                }

                public final Boolean component10() {
                    return this.isFollower;
                }

                public final UserType component11() {
                    return this.userType;
                }

                public final String component2() {
                    return this.email;
                }

                public final String component3() {
                    return this.firstName;
                }

                public final String component4() {
                    return this.image;
                }

                public final String component5() {
                    return this.memberSince;
                }

                public final String component6() {
                    return this.phone;
                }

                public final Integer component7() {
                    return this.regionId;
                }

                public final Integer component8() {
                    return this.userId;
                }

                public final Integer component9() {
                    return this.listingsCount;
                }

                public final User copy(Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool2, UserType userType) {
                    return new User(bool, str, str2, str3, str4, str5, num, num2, num3, bool2, userType);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof User)) {
                        return false;
                    }
                    User user = (User) obj;
                    if (o.d(this.allowFollow, user.allowFollow) && o.d(this.email, user.email) && o.d(this.firstName, user.firstName) && o.d(this.image, user.image) && o.d(this.memberSince, user.memberSince) && o.d(this.phone, user.phone) && o.d(this.regionId, user.regionId) && o.d(this.userId, user.userId) && o.d(this.listingsCount, user.listingsCount) && o.d(this.isFollower, user.isFollower) && this.userType == user.userType) {
                        return true;
                    }
                    return false;
                }

                public final Boolean getAllowFollow() {
                    return this.allowFollow;
                }

                public final String getEmail() {
                    return this.email;
                }

                public final String getFirstName() {
                    return this.firstName;
                }

                public final String getImage() {
                    return this.image;
                }

                public final Integer getListingsCount() {
                    return this.listingsCount;
                }

                public final String getMemberSince() {
                    return this.memberSince;
                }

                public final String getPhone() {
                    return this.phone;
                }

                public final Integer getRegionId() {
                    return this.regionId;
                }

                public final Integer getUserId() {
                    return this.userId;
                }

                public final UserType getUserType() {
                    return this.userType;
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
                    Boolean bool = this.allowFollow;
                    int i11 = 0;
                    if (bool == null) {
                        hashCode = 0;
                    } else {
                        hashCode = bool.hashCode();
                    }
                    int i12 = hashCode * 31;
                    String str = this.email;
                    if (str == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    String str2 = this.firstName;
                    if (str2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str2.hashCode();
                    }
                    int i14 = (i13 + hashCode3) * 31;
                    String str3 = this.image;
                    if (str3 == null) {
                        hashCode4 = 0;
                    } else {
                        hashCode4 = str3.hashCode();
                    }
                    int i15 = (i14 + hashCode4) * 31;
                    String str4 = this.memberSince;
                    if (str4 == null) {
                        hashCode5 = 0;
                    } else {
                        hashCode5 = str4.hashCode();
                    }
                    int i16 = (i15 + hashCode5) * 31;
                    String str5 = this.phone;
                    if (str5 == null) {
                        hashCode6 = 0;
                    } else {
                        hashCode6 = str5.hashCode();
                    }
                    int i17 = (i16 + hashCode6) * 31;
                    Integer num = this.regionId;
                    if (num == null) {
                        hashCode7 = 0;
                    } else {
                        hashCode7 = num.hashCode();
                    }
                    int i18 = (i17 + hashCode7) * 31;
                    Integer num2 = this.userId;
                    if (num2 == null) {
                        hashCode8 = 0;
                    } else {
                        hashCode8 = num2.hashCode();
                    }
                    int i19 = (i18 + hashCode8) * 31;
                    Integer num3 = this.listingsCount;
                    if (num3 == null) {
                        hashCode9 = 0;
                    } else {
                        hashCode9 = num3.hashCode();
                    }
                    int i21 = (i19 + hashCode9) * 31;
                    Boolean bool2 = this.isFollower;
                    if (bool2 == null) {
                        hashCode10 = 0;
                    } else {
                        hashCode10 = bool2.hashCode();
                    }
                    int i22 = (i21 + hashCode10) * 31;
                    UserType userType = this.userType;
                    if (userType != null) {
                        i11 = userType.hashCode();
                    }
                    return i22 + i11;
                }

                public final Boolean isFollower() {
                    return this.isFollower;
                }

                public final UserProfileData mapToUserProfileData(Integer num) {
                    long j11;
                    Integer num2;
                    Integer num3;
                    String str;
                    Integer num4 = this.userId;
                    if (num4 != null) {
                        j11 = num4.intValue();
                    } else {
                        j11 = 0;
                    }
                    long j12 = j11;
                    String str2 = this.firstName;
                    String str3 = this.phone;
                    String str4 = this.image;
                    String str5 = this.memberSince;
                    Boolean bool = this.isFollower;
                    if (bool != null) {
                        num2 = Integer.valueOf(TypeExtensionsKt.H0(bool.booleanValue()));
                    } else {
                        num2 = null;
                    }
                    Boolean bool2 = this.allowFollow;
                    if (bool2 != null) {
                        num3 = Integer.valueOf(TypeExtensionsKt.H0(bool2.booleanValue()));
                    } else {
                        num3 = null;
                    }
                    String str6 = this.phone;
                    if (str6 != null) {
                        str = TypeExtensionsKt.W(str6);
                    } else {
                        str = null;
                    }
                    return new UserProfileData(j12, str2, str3, str4, num, str5, num2, num3, str);
                }

                public String toString() {
                    Boolean bool = this.allowFollow;
                    String str = this.email;
                    String str2 = this.firstName;
                    String str3 = this.image;
                    String str4 = this.memberSince;
                    String str5 = this.phone;
                    Integer num = this.regionId;
                    Integer num2 = this.userId;
                    Integer num3 = this.listingsCount;
                    Boolean bool2 = this.isFollower;
                    UserType userType = this.userType;
                    return "User(allowFollow=" + bool + ", email=" + str + ", firstName=" + str2 + ", image=" + str3 + ", memberSince=" + str4 + ", phone=" + str5 + ", regionId=" + num + ", userId=" + num2 + ", listingsCount=" + num3 + ", isFollower=" + bool2 + ", userType=" + userType + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    o.i(out, "out");
                    Boolean bool = this.allowFollow;
                    if (bool == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeInt(bool.booleanValue() ? 1 : 0);
                    }
                    out.writeString(this.email);
                    out.writeString(this.firstName);
                    out.writeString(this.image);
                    out.writeString(this.memberSince);
                    out.writeString(this.phone);
                    Integer num = this.regionId;
                    if (num == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeInt(num.intValue());
                    }
                    Integer num2 = this.userId;
                    if (num2 == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeInt(num2.intValue());
                    }
                    Integer num3 = this.listingsCount;
                    if (num3 == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeInt(num3.intValue());
                    }
                    Boolean bool2 = this.isFollower;
                    if (bool2 == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeInt(bool2.booleanValue() ? 1 : 0);
                    }
                    UserType userType = this.userType;
                    if (userType == null) {
                        out.writeInt(0);
                        return;
                    }
                    out.writeInt(1);
                    userType.writeToParcel(out, i11);
                }

                public User(Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool2, UserType userType) {
                    this.allowFollow = bool;
                    this.email = str;
                    this.firstName = str2;
                    this.image = str3;
                    this.memberSince = str4;
                    this.phone = str5;
                    this.regionId = num;
                    this.userId = num2;
                    this.listingsCount = num3;
                    this.isFollower = bool2;
                    this.userType = userType;
                }

                public /* synthetic */ User(Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool2, UserType userType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : num3, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bool2, (i11 & 1024) == 0 ? userType : null);
                }
            }

            public Listing(int i11, String slug, int i12, String title, String phone, Category category, List<String> list, String str, String str2, String str3, String str4, String str5, District district, Integer num, List<ExtraAttribute> list2, ExtraInfo extraInfo, List<String> list3, Boolean bool, Boolean bool2, Boolean bool3, Double d11, ListingType listingType, Double d12, String str6, Integer num2, String str7, User user, String str8) {
                o.i(slug, "slug");
                o.i(title, "title");
                o.i(phone, "phone");
                o.i(category, "category");
                this.userAdvId = i11;
                this.slug = slug;
                this.userViewCount = i12;
                this.title = title;
                this.phone = phone;
                this.category = category;
                this.contacts = list;
                this.dateCreated = str;
                this.dateExpired = str2;
                this.datePublished = str3;
                this.dateSort = str4;
                this.description = str5;
                this.district = district;
                this.districtId = num;
                this.extraAttributes = list2;
                this.extraInfo = extraInfo;
                this.images = list3;
                this.isFavorite = bool;
                this.isHideMyNumber = bool2;
                this.isPrivateMessageEnabled = bool3;
                this.lat = d11;
                this.listingType = listingType;
                this.lon = d12;
                this.price = str6;
                this.regionsId = num2;
                this.source = str7;
                this.user = user;
                this.videoUrl = str8;
            }

            public final int component1() {
                return this.userAdvId;
            }

            public final String component10() {
                return this.datePublished;
            }

            public final String component11() {
                return this.dateSort;
            }

            public final String component12() {
                return this.description;
            }

            public final District component13() {
                return this.district;
            }

            public final Integer component14() {
                return this.districtId;
            }

            public final List<ExtraAttribute> component15() {
                return this.extraAttributes;
            }

            public final ExtraInfo component16() {
                return this.extraInfo;
            }

            public final List<String> component17() {
                return this.images;
            }

            public final Boolean component18() {
                return this.isFavorite;
            }

            public final Boolean component19() {
                return this.isHideMyNumber;
            }

            public final String component2() {
                return this.slug;
            }

            public final Boolean component20() {
                return this.isPrivateMessageEnabled;
            }

            public final Double component21() {
                return this.lat;
            }

            public final ListingType component22() {
                return this.listingType;
            }

            public final Double component23() {
                return this.lon;
            }

            public final String component24() {
                return this.price;
            }

            public final Integer component25() {
                return this.regionsId;
            }

            public final String component26() {
                return this.source;
            }

            public final User component27() {
                return this.user;
            }

            public final String component28() {
                return this.videoUrl;
            }

            public final int component3() {
                return this.userViewCount;
            }

            public final String component4() {
                return this.title;
            }

            public final String component5() {
                return this.phone;
            }

            public final Category component6() {
                return this.category;
            }

            public final List<String> component7() {
                return this.contacts;
            }

            public final String component8() {
                return this.dateCreated;
            }

            public final String component9() {
                return this.dateExpired;
            }

            public final Listing copy(int i11, String slug, int i12, String title, String phone, Category category, List<String> list, String str, String str2, String str3, String str4, String str5, District district, Integer num, List<ExtraAttribute> list2, ExtraInfo extraInfo, List<String> list3, Boolean bool, Boolean bool2, Boolean bool3, Double d11, ListingType listingType, Double d12, String str6, Integer num2, String str7, User user, String str8) {
                o.i(slug, "slug");
                o.i(title, "title");
                o.i(phone, "phone");
                o.i(category, "category");
                return new Listing(i11, slug, i12, title, phone, category, list, str, str2, str3, str4, str5, district, num, list2, extraInfo, list3, bool, bool2, bool3, d11, listingType, d12, str6, num2, str7, user, str8);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Listing)) {
                    return false;
                }
                Listing listing = (Listing) obj;
                if (this.userAdvId == listing.userAdvId && o.d(this.slug, listing.slug) && this.userViewCount == listing.userViewCount && o.d(this.title, listing.title) && o.d(this.phone, listing.phone) && o.d(this.category, listing.category) && o.d(this.contacts, listing.contacts) && o.d(this.dateCreated, listing.dateCreated) && o.d(this.dateExpired, listing.dateExpired) && o.d(this.datePublished, listing.datePublished) && o.d(this.dateSort, listing.dateSort) && o.d(this.description, listing.description) && o.d(this.district, listing.district) && o.d(this.districtId, listing.districtId) && o.d(this.extraAttributes, listing.extraAttributes) && o.d(this.extraInfo, listing.extraInfo) && o.d(this.images, listing.images) && o.d(this.isFavorite, listing.isFavorite) && o.d(this.isHideMyNumber, listing.isHideMyNumber) && o.d(this.isPrivateMessageEnabled, listing.isPrivateMessageEnabled) && o.d(this.lat, listing.lat) && this.listingType == listing.listingType && o.d(this.lon, listing.lon) && o.d(this.price, listing.price) && o.d(this.regionsId, listing.regionsId) && o.d(this.source, listing.source) && o.d(this.user, listing.user) && o.d(this.videoUrl, listing.videoUrl)) {
                    return true;
                }
                return false;
            }

            public final Category getCategory() {
                return this.category;
            }

            public final List<String> getContacts() {
                return this.contacts;
            }

            public final String getDateCreated() {
                return this.dateCreated;
            }

            public final String getDateExpired() {
                return this.dateExpired;
            }

            public final String getDatePublished() {
                return this.datePublished;
            }

            public final String getDateSort() {
                return this.dateSort;
            }

            public final String getDescription() {
                return this.description;
            }

            public final District getDistrict() {
                return this.district;
            }

            public final Integer getDistrictId() {
                return this.districtId;
            }

            public final List<ExtraAttribute> getExtraAttributes() {
                return this.extraAttributes;
            }

            public final ExtraInfo getExtraInfo() {
                return this.extraInfo;
            }

            public final List<String> getImages() {
                return this.images;
            }

            public final Double getLat() {
                return this.lat;
            }

            public final ListingType getListingType() {
                return this.listingType;
            }

            public final Double getLon() {
                return this.lon;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getPrice() {
                return this.price;
            }

            public final Integer getRegionsId() {
                return this.regionsId;
            }

            public final String getSlug() {
                return this.slug;
            }

            public final String getSource() {
                return this.source;
            }

            public final String getTitle() {
                return this.title;
            }

            public final User getUser() {
                return this.user;
            }

            public final int getUserAdvId() {
                return this.userAdvId;
            }

            public final int getUserViewCount() {
                return this.userViewCount;
            }

            public final String getVideoUrl() {
                return this.videoUrl;
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
                int hashCode22 = ((((((((((Integer.hashCode(this.userAdvId) * 31) + this.slug.hashCode()) * 31) + Integer.hashCode(this.userViewCount)) * 31) + this.title.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.category.hashCode()) * 31;
                List<String> list = this.contacts;
                int i11 = 0;
                if (list == null) {
                    hashCode = 0;
                } else {
                    hashCode = list.hashCode();
                }
                int i12 = (hashCode22 + hashCode) * 31;
                String str = this.dateCreated;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                String str2 = this.dateExpired;
                if (str2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str2.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                String str3 = this.datePublished;
                if (str3 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str3.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str4 = this.dateSort;
                if (str4 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str4.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                String str5 = this.description;
                if (str5 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = str5.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                District district = this.district;
                if (district == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = district.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                Integer num = this.districtId;
                if (num == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = num.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                List<ExtraAttribute> list2 = this.extraAttributes;
                if (list2 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = list2.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                ExtraInfo extraInfo = this.extraInfo;
                if (extraInfo == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = extraInfo.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                List<String> list3 = this.images;
                if (list3 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = list3.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Boolean bool = this.isFavorite;
                if (bool == null) {
                    hashCode12 = 0;
                } else {
                    hashCode12 = bool.hashCode();
                }
                int i24 = (i23 + hashCode12) * 31;
                Boolean bool2 = this.isHideMyNumber;
                if (bool2 == null) {
                    hashCode13 = 0;
                } else {
                    hashCode13 = bool2.hashCode();
                }
                int i25 = (i24 + hashCode13) * 31;
                Boolean bool3 = this.isPrivateMessageEnabled;
                if (bool3 == null) {
                    hashCode14 = 0;
                } else {
                    hashCode14 = bool3.hashCode();
                }
                int i26 = (i25 + hashCode14) * 31;
                Double d11 = this.lat;
                if (d11 == null) {
                    hashCode15 = 0;
                } else {
                    hashCode15 = d11.hashCode();
                }
                int i27 = (i26 + hashCode15) * 31;
                ListingType listingType = this.listingType;
                if (listingType == null) {
                    hashCode16 = 0;
                } else {
                    hashCode16 = listingType.hashCode();
                }
                int i28 = (i27 + hashCode16) * 31;
                Double d12 = this.lon;
                if (d12 == null) {
                    hashCode17 = 0;
                } else {
                    hashCode17 = d12.hashCode();
                }
                int i29 = (i28 + hashCode17) * 31;
                String str6 = this.price;
                if (str6 == null) {
                    hashCode18 = 0;
                } else {
                    hashCode18 = str6.hashCode();
                }
                int i31 = (i29 + hashCode18) * 31;
                Integer num2 = this.regionsId;
                if (num2 == null) {
                    hashCode19 = 0;
                } else {
                    hashCode19 = num2.hashCode();
                }
                int i32 = (i31 + hashCode19) * 31;
                String str7 = this.source;
                if (str7 == null) {
                    hashCode20 = 0;
                } else {
                    hashCode20 = str7.hashCode();
                }
                int i33 = (i32 + hashCode20) * 31;
                User user = this.user;
                if (user == null) {
                    hashCode21 = 0;
                } else {
                    hashCode21 = user.hashCode();
                }
                int i34 = (i33 + hashCode21) * 31;
                String str8 = this.videoUrl;
                if (str8 != null) {
                    i11 = str8.hashCode();
                }
                return i34 + i11;
            }

            public final Boolean isFavorite() {
                return this.isFavorite;
            }

            public final Boolean isHideMyNumber() {
                return this.isHideMyNumber;
            }

            public final Boolean isPrivateMessageEnabled() {
                return this.isPrivateMessageEnabled;
            }

            public final boolean isValidResponse() {
                boolean z11;
                boolean z12;
                if (this.category == null) {
                    return false;
                }
                String str = this.phone;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    return false;
                }
                String str2 = this.title;
                if (str2 != null && str2.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    return false;
                }
                return true;
            }

            public String toString() {
                int i11 = this.userAdvId;
                String str = this.slug;
                int i12 = this.userViewCount;
                String str2 = this.title;
                String str3 = this.phone;
                Category category = this.category;
                List<String> list = this.contacts;
                String str4 = this.dateCreated;
                String str5 = this.dateExpired;
                String str6 = this.datePublished;
                String str7 = this.dateSort;
                String str8 = this.description;
                District district = this.district;
                Integer num = this.districtId;
                List<ExtraAttribute> list2 = this.extraAttributes;
                ExtraInfo extraInfo = this.extraInfo;
                List<String> list3 = this.images;
                Boolean bool = this.isFavorite;
                Boolean bool2 = this.isHideMyNumber;
                Boolean bool3 = this.isPrivateMessageEnabled;
                Double d11 = this.lat;
                ListingType listingType = this.listingType;
                Double d12 = this.lon;
                String str9 = this.price;
                Integer num2 = this.regionsId;
                String str10 = this.source;
                User user = this.user;
                String str11 = this.videoUrl;
                return "Listing(userAdvId=" + i11 + ", slug=" + str + ", userViewCount=" + i12 + ", title=" + str2 + ", phone=" + str3 + ", category=" + category + ", contacts=" + list + ", dateCreated=" + str4 + ", dateExpired=" + str5 + ", datePublished=" + str6 + ", dateSort=" + str7 + ", description=" + str8 + ", district=" + district + ", districtId=" + num + ", extraAttributes=" + list2 + ", extraInfo=" + extraInfo + ", images=" + list3 + ", isFavorite=" + bool + ", isHideMyNumber=" + bool2 + ", isPrivateMessageEnabled=" + bool3 + ", lat=" + d11 + ", listingType=" + listingType + ", lon=" + d12 + ", price=" + str9 + ", regionsId=" + num2 + ", source=" + str10 + ", user=" + user + ", videoUrl=" + str11 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(this.userAdvId);
                out.writeString(this.slug);
                out.writeInt(this.userViewCount);
                out.writeString(this.title);
                out.writeString(this.phone);
                this.category.writeToParcel(out, i11);
                out.writeStringList(this.contacts);
                out.writeString(this.dateCreated);
                out.writeString(this.dateExpired);
                out.writeString(this.datePublished);
                out.writeString(this.dateSort);
                out.writeString(this.description);
                District district = this.district;
                if (district == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    district.writeToParcel(out, i11);
                }
                Integer num = this.districtId;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                List<ExtraAttribute> list = this.extraAttributes;
                if (list == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(list.size());
                    for (ExtraAttribute extraAttribute : list) {
                        extraAttribute.writeToParcel(out, i11);
                    }
                }
                ExtraInfo extraInfo = this.extraInfo;
                if (extraInfo == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    extraInfo.writeToParcel(out, i11);
                }
                out.writeStringList(this.images);
                Boolean bool = this.isFavorite;
                if (bool == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.isHideMyNumber;
                if (bool2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                Boolean bool3 = this.isPrivateMessageEnabled;
                if (bool3 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                Double d11 = this.lat;
                if (d11 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeDouble(d11.doubleValue());
                }
                ListingType listingType = this.listingType;
                if (listingType == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    listingType.writeToParcel(out, i11);
                }
                Double d12 = this.lon;
                if (d12 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeDouble(d12.doubleValue());
                }
                out.writeString(this.price);
                Integer num2 = this.regionsId;
                if (num2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num2.intValue());
                }
                out.writeString(this.source);
                User user = this.user;
                if (user == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    user.writeToParcel(out, i11);
                }
                out.writeString(this.videoUrl);
            }

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class Category implements Parcelable {
                @c("breadcrumb")
                private final List<Breadcrumb> breadcrumb;
                @c("cat_id")
                private final int catId;
                @c("description")
                private final String description;
                @c(CategoryEntity.FULL_PATH)
                private final String fullPath;
                @c("name")
                private final String name;
                public static final Parcelable.Creator<Category> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Creator implements Parcelable.Creator<Category> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Category createFromParcel(Parcel parcel) {
                        o.i(parcel, "parcel");
                        int readInt = parcel.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            arrayList.add(Breadcrumb.CREATOR.createFromParcel(parcel));
                        }
                        return new Category(arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Category[] newArray(int i11) {
                        return new Category[i11];
                    }
                }

                public Category(List<Breadcrumb> breadcrumb, int i11, String description, String name, String fullPath) {
                    o.i(breadcrumb, "breadcrumb");
                    o.i(description, "description");
                    o.i(name, "name");
                    o.i(fullPath, "fullPath");
                    this.breadcrumb = breadcrumb;
                    this.catId = i11;
                    this.description = description;
                    this.name = name;
                    this.fullPath = fullPath;
                }

                public static /* synthetic */ Category copy$default(Category category, List list, int i11, String str, String str2, String str3, int i12, Object obj) {
                    List<Breadcrumb> list2 = list;
                    if ((i12 & 1) != 0) {
                        list2 = category.breadcrumb;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = category.catId;
                    }
                    int i13 = i11;
                    if ((i12 & 4) != 0) {
                        str = category.description;
                    }
                    String str4 = str;
                    if ((i12 & 8) != 0) {
                        str2 = category.name;
                    }
                    String str5 = str2;
                    if ((i12 & 16) != 0) {
                        str3 = category.fullPath;
                    }
                    return category.copy(list2, i13, str4, str5, str3);
                }

                public final List<Breadcrumb> component1() {
                    return this.breadcrumb;
                }

                public final int component2() {
                    return this.catId;
                }

                public final String component3() {
                    return this.description;
                }

                public final String component4() {
                    return this.name;
                }

                public final String component5() {
                    return this.fullPath;
                }

                public final Category copy(List<Breadcrumb> breadcrumb, int i11, String description, String name, String fullPath) {
                    o.i(breadcrumb, "breadcrumb");
                    o.i(description, "description");
                    o.i(name, "name");
                    o.i(fullPath, "fullPath");
                    return new Category(breadcrumb, i11, description, name, fullPath);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Category)) {
                        return false;
                    }
                    Category category = (Category) obj;
                    if (o.d(this.breadcrumb, category.breadcrumb) && this.catId == category.catId && o.d(this.description, category.description) && o.d(this.name, category.name) && o.d(this.fullPath, category.fullPath)) {
                        return true;
                    }
                    return false;
                }

                public final List<Breadcrumb> getBreadcrumb() {
                    return this.breadcrumb;
                }

                public final int getCatId() {
                    return this.catId;
                }

                public final String getDescription() {
                    return this.description;
                }

                public final String getFullPath() {
                    return this.fullPath;
                }

                public final String getName() {
                    return this.name;
                }

                public int hashCode() {
                    return (((((((this.breadcrumb.hashCode() * 31) + Integer.hashCode(this.catId)) * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31) + this.fullPath.hashCode();
                }

                public String toString() {
                    List<Breadcrumb> list = this.breadcrumb;
                    int i11 = this.catId;
                    String str = this.description;
                    String str2 = this.name;
                    String str3 = this.fullPath;
                    return "Category(breadcrumb=" + list + ", catId=" + i11 + ", description=" + str + ", name=" + str2 + ", fullPath=" + str3 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    o.i(out, "out");
                    List<Breadcrumb> list = this.breadcrumb;
                    out.writeInt(list.size());
                    for (Breadcrumb breadcrumb : list) {
                        breadcrumb.writeToParcel(out, i11);
                    }
                    out.writeInt(this.catId);
                    out.writeString(this.description);
                    out.writeString(this.name);
                    out.writeString(this.fullPath);
                }

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Breadcrumb implements Parcelable {
                    @c("id")

                    /* renamed from: id  reason: collision with root package name */
                    private final String f22369id;
                    @c(AttributeValue.VALUE)
                    private final String value;
                    public static final Parcelable.Creator<Breadcrumb> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* compiled from: BuyerListingDetailsResponseModel.kt */
                    /* loaded from: classes2.dex */
                    public static final class Creator implements Parcelable.Creator<Breadcrumb> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Breadcrumb createFromParcel(Parcel parcel) {
                            o.i(parcel, "parcel");
                            return new Breadcrumb(parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final Breadcrumb[] newArray(int i11) {
                            return new Breadcrumb[i11];
                        }
                    }

                    public Breadcrumb(String id2, String str) {
                        o.i(id2, "id");
                        this.f22369id = id2;
                        this.value = str;
                    }

                    public static /* synthetic */ Breadcrumb copy$default(Breadcrumb breadcrumb, String str, String str2, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = breadcrumb.f22369id;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = breadcrumb.value;
                        }
                        return breadcrumb.copy(str, str2);
                    }

                    public final String component1() {
                        return this.f22369id;
                    }

                    public final String component2() {
                        return this.value;
                    }

                    public final Breadcrumb copy(String id2, String str) {
                        o.i(id2, "id");
                        return new Breadcrumb(id2, str);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Breadcrumb)) {
                            return false;
                        }
                        Breadcrumb breadcrumb = (Breadcrumb) obj;
                        if (o.d(this.f22369id, breadcrumb.f22369id) && o.d(this.value, breadcrumb.value)) {
                            return true;
                        }
                        return false;
                    }

                    public final String getId() {
                        return this.f22369id;
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        int hashCode;
                        int hashCode2 = this.f22369id.hashCode() * 31;
                        String str = this.value;
                        if (str == null) {
                            hashCode = 0;
                        } else {
                            hashCode = str.hashCode();
                        }
                        return hashCode2 + hashCode;
                    }

                    public String toString() {
                        String str = this.f22369id;
                        String str2 = this.value;
                        return "Breadcrumb(id=" + str + ", value=" + str2 + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i11) {
                        o.i(out, "out");
                        out.writeString(this.f22369id);
                        out.writeString(this.value);
                    }

                    public /* synthetic */ Breadcrumb(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, (i11 & 2) != 0 ? null : str2);
                    }
                }
            }

            /* compiled from: BuyerListingDetailsResponseModel.kt */
            /* loaded from: classes2.dex */
            public static final class ExtraAttribute implements Parcelable {
                @c("id")

                /* renamed from: id  reason: collision with root package name */
                private final int f22370id;
                @c(Constants.Keys.SIZE)
                private final String size;
                @c(AttributeValue.VALUE)
                private final String value;
                public static final Parcelable.Creator<ExtraAttribute> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: BuyerListingDetailsResponseModel.kt */
                /* loaded from: classes2.dex */
                public static final class Creator implements Parcelable.Creator<ExtraAttribute> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ExtraAttribute createFromParcel(Parcel parcel) {
                        o.i(parcel, "parcel");
                        return new ExtraAttribute(parcel.readInt(), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ExtraAttribute[] newArray(int i11) {
                        return new ExtraAttribute[i11];
                    }
                }

                public ExtraAttribute(int i11, String value, String str) {
                    o.i(value, "value");
                    this.f22370id = i11;
                    this.value = value;
                    this.size = str;
                }

                public static /* synthetic */ ExtraAttribute copy$default(ExtraAttribute extraAttribute, int i11, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = extraAttribute.f22370id;
                    }
                    if ((i12 & 2) != 0) {
                        str = extraAttribute.value;
                    }
                    if ((i12 & 4) != 0) {
                        str2 = extraAttribute.size;
                    }
                    return extraAttribute.copy(i11, str, str2);
                }

                public final int component1() {
                    return this.f22370id;
                }

                public final String component2() {
                    return this.value;
                }

                public final String component3() {
                    return this.size;
                }

                public final ExtraAttribute copy(int i11, String value, String str) {
                    o.i(value, "value");
                    return new ExtraAttribute(i11, value, str);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ExtraAttribute)) {
                        return false;
                    }
                    ExtraAttribute extraAttribute = (ExtraAttribute) obj;
                    if (this.f22370id == extraAttribute.f22370id && o.d(this.value, extraAttribute.value) && o.d(this.size, extraAttribute.size)) {
                        return true;
                    }
                    return false;
                }

                public final int getId() {
                    return this.f22370id;
                }

                public final String getSize() {
                    return this.size;
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2 = ((Integer.hashCode(this.f22370id) * 31) + this.value.hashCode()) * 31;
                    String str = this.size;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return hashCode2 + hashCode;
                }

                public String toString() {
                    int i11 = this.f22370id;
                    String str = this.value;
                    String str2 = this.size;
                    return "ExtraAttribute(id=" + i11 + ", value=" + str + ", size=" + str2 + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    o.i(out, "out");
                    out.writeInt(this.f22370id);
                    out.writeString(this.value);
                    out.writeString(this.size);
                }

                public /* synthetic */ ExtraAttribute(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                    this(i11, str, (i12 & 4) != 0 ? null : str2);
                }
            }

            public /* synthetic */ Listing(int i11, String str, int i12, String str2, String str3, Category category, List list, String str4, String str5, String str6, String str7, String str8, District district, Integer num, List list2, ExtraInfo extraInfo, List list3, Boolean bool, Boolean bool2, Boolean bool3, Double d11, ListingType listingType, Double d12, String str9, Integer num2, String str10, User user, String str11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, str, i12, str2, str3, category, (i13 & 64) != 0 ? null : list, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : str8, (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : district, (i13 & 8192) != 0 ? null : num, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list2, (32768 & i13) != 0 ? null : extraInfo, (65536 & i13) != 0 ? null : list3, (131072 & i13) != 0 ? null : bool, (262144 & i13) != 0 ? null : bool2, (524288 & i13) != 0 ? null : bool3, (1048576 & i13) != 0 ? null : d11, (2097152 & i13) != 0 ? null : listingType, (4194304 & i13) != 0 ? null : d12, (8388608 & i13) != 0 ? null : str9, (16777216 & i13) != 0 ? null : num2, (33554432 & i13) != 0 ? null : str10, (67108864 & i13) != 0 ? null : user, (i13 & 134217728) != 0 ? null : str11);
            }
        }

        public Data(Listing listing) {
            o.i(listing, "listing");
            this.listing = listing;
        }

        public static /* synthetic */ Data copy$default(Data data, Listing listing, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                listing = data.listing;
            }
            return data.copy(listing);
        }

        public final Listing component1() {
            return this.listing;
        }

        public final Data copy(Listing listing) {
            o.i(listing, "listing");
            return new Data(listing);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Data) && o.d(this.listing, ((Data) obj).listing)) {
                return true;
            }
            return false;
        }

        public final Listing getListing() {
            return this.listing;
        }

        public int hashCode() {
            return this.listing.hashCode();
        }

        public String toString() {
            Listing listing = this.listing;
            return "Data(listing=" + listing + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            this.listing.writeToParcel(out, i11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyerListingDetailsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class ListingType implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ListingType[] $VALUES;
        public static final Parcelable.Creator<ListingType> CREATOR;
        private final String value;
        @c("commercial")
        public static final ListingType COMMERCIAL = new ListingType("COMMERCIAL", 0, "commercial");
        @c("pinned")
        public static final ListingType PINNED = new ListingType("PINNED", 1, "pinned");
        @c("commercial_banner")
        public static final ListingType COMMERCIAL_BANNER = new ListingType("COMMERCIAL_BANNER", 2, "commercial_banner");
        @c("waitng")
        public static final ListingType WAITNG = new ListingType("WAITNG", 3, "waitng");
        @c(com.adjust.sdk.Constants.NORMAL)
        public static final ListingType NORMAL = new ListingType("NORMAL", 4, com.adjust.sdk.Constants.NORMAL);

        /* compiled from: BuyerListingDetailsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ListingType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ListingType createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return ListingType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ListingType[] newArray(int i11) {
                return new ListingType[i11];
            }
        }

        private static final /* synthetic */ ListingType[] $values() {
            return new ListingType[]{COMMERCIAL, PINNED, COMMERCIAL_BANNER, WAITNG, NORMAL};
        }

        static {
            ListingType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private ListingType(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a<ListingType> getEntries() {
            return $ENTRIES;
        }

        public static ListingType valueOf(String str) {
            return (ListingType) Enum.valueOf(ListingType.class, str);
        }

        public static ListingType[] values() {
            return (ListingType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyerListingDetailsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class Location implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Location[] $VALUES;
        public static final Parcelable.Creator<Location> CREATOR;
        @c("disabled")
        public static final Location DISABLED = new Location("DISABLED", 0);
        @c("approximate")
        public static final Location APPROXIMATE = new Location("APPROXIMATE", 1);
        @c("exact")
        public static final Location EXACT = new Location("EXACT", 2);

        /* compiled from: BuyerListingDetailsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Location> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Location createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return Location.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Location[] newArray(int i11) {
                return new Location[i11];
            }
        }

        private static final /* synthetic */ Location[] $values() {
            return new Location[]{DISABLED, APPROXIMATE, EXACT};
        }

        static {
            Location[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private Location(String str, int i11) {
        }

        public static a<Location> getEntries() {
            return $ENTRIES;
        }

        public static Location valueOf(String str) {
            return (Location) Enum.valueOf(Location.class, str);
        }

        public static Location[] values() {
            return (Location[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyerListingDetailsResponseModel.kt */
    /* loaded from: classes2.dex */
    public static final class UserType implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ UserType[] $VALUES;
        public static final Parcelable.Creator<UserType> CREATOR;
        private final String value;
        @c("4sale_realty")
        public static final UserType FOR_SALE_REALTY = new UserType("FOR_SALE_REALTY", 0, "4sale_realty");
        @c(com.adjust.sdk.Constants.NORMAL)
        public static final UserType NORMAL = new UserType("NORMAL", 1, com.adjust.sdk.Constants.NORMAL);
        @c("automotive_office")
        public static final UserType AUTOMOTIVE_OFFICE = new UserType("AUTOMOTIVE_OFFICE", 2, "automotive_office");
        @c("property_office")
        public static final UserType PROPERTY_OFFICE = new UserType("PROPERTY_OFFICE", 3, "property_office");
        @c("electronics-office")
        public static final UserType ELECTRONICS_OFFICE = new UserType("ELECTRONICS_OFFICE", 4, "electronics-office");
        @c("automotive_rental_office")
        public static final UserType AUTOMOTIVE_RENTAL_OFFICE = new UserType("AUTOMOTIVE_RENTAL_OFFICE", 5, "automotive_rental_office");
        @c("")
        public static final UserType DEFAULT = new UserType("DEFAULT", 6, "");

        /* compiled from: BuyerListingDetailsResponseModel.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UserType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserType createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return UserType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserType[] newArray(int i11) {
                return new UserType[i11];
            }
        }

        private static final /* synthetic */ UserType[] $values() {
            return new UserType[]{FOR_SALE_REALTY, NORMAL, AUTOMOTIVE_OFFICE, PROPERTY_OFFICE, ELECTRONICS_OFFICE, AUTOMOTIVE_RENTAL_OFFICE, DEFAULT};
        }

        static {
            UserType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private UserType(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a<UserType> getEntries() {
            return $ENTRIES;
        }

        public static UserType valueOf(String str) {
            return (UserType) Enum.valueOf(UserType.class, str);
        }

        public static UserType[] values() {
            return (UserType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(name());
        }
    }

    public BuyerListingDetailsResponseModel(Data data, String str) {
        o.i(data, "data");
        this.data = data;
        this.message = str;
    }

    public static /* synthetic */ BuyerListingDetailsResponseModel copy$default(BuyerListingDetailsResponseModel buyerListingDetailsResponseModel, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = buyerListingDetailsResponseModel.data;
        }
        if ((i11 & 2) != 0) {
            str = buyerListingDetailsResponseModel.message;
        }
        return buyerListingDetailsResponseModel.copy(data, str);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final BuyerListingDetailsResponseModel copy(Data data, String str) {
        o.i(data, "data");
        return new BuyerListingDetailsResponseModel(data, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerListingDetailsResponseModel)) {
            return false;
        }
        BuyerListingDetailsResponseModel buyerListingDetailsResponseModel = (BuyerListingDetailsResponseModel) obj;
        if (o.d(this.data, buyerListingDetailsResponseModel.data) && o.d(this.message, buyerListingDetailsResponseModel.message)) {
            return true;
        }
        return false;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.data.hashCode() * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        Data data = this.data;
        String str = this.message;
        return "BuyerListingDetailsResponseModel(data=" + data + ", message=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        this.data.writeToParcel(out, i11);
        out.writeString(this.message);
    }

    public /* synthetic */ BuyerListingDetailsResponseModel(Data data, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, (i11 & 2) != 0 ? null : str);
    }
}
