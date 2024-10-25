package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraInfo implements Parcelable {
    @c("location_info")
    private LocationInfo locationInfo;
    @c("type")
    private BusinessType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExtraInfo> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* compiled from: ListingDetailsEntity.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BuyerListingDetailsResponseModel.Location.values().length];
                try {
                    iArr[BuyerListingDetailsResponseModel.Location.APPROXIMATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BuyerListingDetailsResponseModel.Location.EXACT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExtraInfo fromDetailsExtraInfo(BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo extraInfo) {
            String str;
            BusinessType businessType;
            String str2;
            List<String> list;
            Double d11;
            Double d12;
            int i11;
            Location location;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo2;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo3;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo4;
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo5;
            BuyerListingDetailsResponseModel.Location location2 = null;
            if (extraInfo != null) {
                str = extraInfo.getType();
            } else {
                str = null;
            }
            if (o.d(str, "BUSINESS")) {
                businessType = BusinessType.BUSINESS;
            } else if (o.d(str, "PERSONAL")) {
                businessType = BusinessType.PERSONAL;
            } else {
                businessType = BusinessType.PERSONAL;
            }
            if (extraInfo != null && (locationInfo5 = extraInfo.getLocationInfo()) != null) {
                str2 = locationInfo5.getStreetName();
            } else {
                str2 = null;
            }
            if (extraInfo != null && (locationInfo4 = extraInfo.getLocationInfo()) != null) {
                list = locationInfo4.getLandmarks();
            } else {
                list = null;
            }
            if (extraInfo != null && (locationInfo3 = extraInfo.getLocationInfo()) != null) {
                d11 = locationInfo3.getLat();
            } else {
                d11 = null;
            }
            if (extraInfo != null && (locationInfo2 = extraInfo.getLocationInfo()) != null) {
                d12 = locationInfo2.getLon();
            } else {
                d12 = null;
            }
            if (extraInfo != null && (locationInfo = extraInfo.getLocationInfo()) != null) {
                location2 = locationInfo.getLocation();
            }
            if (location2 == null) {
                i11 = -1;
            } else {
                i11 = WhenMappings.$EnumSwitchMapping$0[location2.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    location = Location.APPROXIMATE;
                } else {
                    location = Location.EXACT;
                }
            } else {
                location = Location.APPROXIMATE;
            }
            return new ExtraInfo(businessType, new LocationInfo(str2, list, d11, d12, location));
        }
    }

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ExtraInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraInfo createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ExtraInfo(parcel.readInt() == 0 ? null : BusinessType.valueOf(parcel.readString()), parcel.readInt() != 0 ? LocationInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtraInfo[] newArray(int i11) {
            return new ExtraInfo[i11];
        }
    }

    public ExtraInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ExtraInfo copy$default(ExtraInfo extraInfo, BusinessType businessType, LocationInfo locationInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            businessType = extraInfo.type;
        }
        if ((i11 & 2) != 0) {
            locationInfo = extraInfo.locationInfo;
        }
        return extraInfo.copy(businessType, locationInfo);
    }

    public final BusinessType component1() {
        return this.type;
    }

    public final LocationInfo component2() {
        return this.locationInfo;
    }

    public final ExtraInfo copy(BusinessType businessType, LocationInfo locationInfo) {
        return new ExtraInfo(businessType, locationInfo);
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
        if (this.type == extraInfo.type && o.d(this.locationInfo, extraInfo.locationInfo)) {
            return true;
        }
        return false;
    }

    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final BusinessType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        BusinessType businessType = this.type;
        int i11 = 0;
        if (businessType == null) {
            hashCode = 0;
        } else {
            hashCode = businessType.hashCode();
        }
        int i12 = hashCode * 31;
        LocationInfo locationInfo = this.locationInfo;
        if (locationInfo != null) {
            i11 = locationInfo.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isPersonal() {
        if (this.type == BusinessType.PERSONAL) {
            return true;
        }
        return false;
    }

    public final void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public final void setType(BusinessType businessType) {
        this.type = businessType;
    }

    public String toString() {
        BusinessType businessType = this.type;
        LocationInfo locationInfo = this.locationInfo;
        return "ExtraInfo(type=" + businessType + ", locationInfo=" + locationInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        BusinessType businessType = this.type;
        if (businessType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(businessType.name());
        }
        LocationInfo locationInfo = this.locationInfo;
        if (locationInfo == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        locationInfo.writeToParcel(out, i11);
    }

    public ExtraInfo(BusinessType businessType, LocationInfo locationInfo) {
        this.type = businessType;
        this.locationInfo = locationInfo;
    }

    public /* synthetic */ ExtraInfo(BusinessType businessType, LocationInfo locationInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BusinessType.PERSONAL : businessType, (i11 & 2) != 0 ? null : locationInfo);
    }
}
