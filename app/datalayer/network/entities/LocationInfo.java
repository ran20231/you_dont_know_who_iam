package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.leanplum.internal.Constants;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class LocationInfo implements Parcelable {
    @c("landmarks")
    private List<String> landMarks;
    @c("lat")
    private Double lat;
    @c(Constants.Keys.LOCATION)
    private Location location;
    @c("lon")
    private Double lon;
    @c("street_name")
    private String streetName;
    public static final Parcelable.Creator<LocationInfo> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LocationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationInfo createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new LocationInfo(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Location.valueOf(parcel.readString()));
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

    public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, String str, List list, Double d11, Double d12, Location location, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = locationInfo.streetName;
        }
        List<String> list2 = list;
        if ((i11 & 2) != 0) {
            list2 = locationInfo.landMarks;
        }
        List list3 = list2;
        if ((i11 & 4) != 0) {
            d11 = locationInfo.lat;
        }
        Double d13 = d11;
        if ((i11 & 8) != 0) {
            d12 = locationInfo.lon;
        }
        Double d14 = d12;
        if ((i11 & 16) != 0) {
            location = locationInfo.location;
        }
        return locationInfo.copy(str, list3, d13, d14, location);
    }

    public final String component1() {
        return this.streetName;
    }

    public final List<String> component2() {
        return this.landMarks;
    }

    public final Double component3() {
        return this.lat;
    }

    public final Double component4() {
        return this.lon;
    }

    public final Location component5() {
        return this.location;
    }

    public final LocationInfo copy(String str, List<String> list, Double d11, Double d12, Location location) {
        return new LocationInfo(str, list, d11, d12, location);
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
        if (o.d(this.streetName, locationInfo.streetName) && o.d(this.landMarks, locationInfo.landMarks) && o.d(this.lat, locationInfo.lat) && o.d(this.lon, locationInfo.lon) && this.location == locationInfo.location) {
            return true;
        }
        return false;
    }

    public final List<String> getLandMarks() {
        return this.landMarks;
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
        String str = this.streetName;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        List<String> list = this.landMarks;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Double d11 = this.lat;
        if (d11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d11.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Double d12 = this.lon;
        if (d12 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d12.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Location location = this.location;
        if (location != null) {
            i11 = location.hashCode();
        }
        return i15 + i11;
    }

    public final void setLandMarks(List<String> list) {
        this.landMarks = list;
    }

    public final void setLat(Double d11) {
        this.lat = d11;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public final void setLon(Double d11) {
        this.lon = d11;
    }

    public final void setStreetName(String str) {
        this.streetName = str;
    }

    public String toString() {
        String str = this.streetName;
        List<String> list = this.landMarks;
        Double d11 = this.lat;
        Double d12 = this.lon;
        Location location = this.location;
        return "LocationInfo(streetName=" + str + ", landMarks=" + list + ", lat=" + d11 + ", lon=" + d12 + ", location=" + location + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.streetName);
        out.writeStringList(this.landMarks);
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
        Location location = this.location;
        if (location == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(location.name());
    }

    public LocationInfo(String str, List<String> list, Double d11, Double d12, Location location) {
        this.streetName = str;
        this.landMarks = list;
        this.lat = d11;
        this.lon = d12;
        this.location = location;
    }

    public /* synthetic */ LocationInfo(String str, List list, Double d11, Double d12, Location location, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? r.n() : list, (i11 & 4) != 0 ? null : d11, (i11 & 8) == 0 ? d12 : null, (i11 & 16) != 0 ? Location.APPROXIMATE : location);
    }
}
