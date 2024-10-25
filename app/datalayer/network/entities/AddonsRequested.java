package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.network.responses.Addon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class AddonsRequested implements Parcelable {
    @c("addon")
    private final String addon;
    @c("cat_id")
    private final int catId;
    @c(CategoryDistrict.DISTRICT_ID)
    private final int districtId;
    private transient boolean includedInBundle;
    private transient Float price;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AddonsRequested> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddonsRequested createFrom(Addon addon) {
            o.i(addon, "addon");
            return new AddonsRequested(addon.getId(), addon.getCatId(), addon.getDistrictId(), Float.valueOf(addon.getPrice()), addon.getIncludedInBundle());
        }
    }

    /* compiled from: ListingDetailsEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AddonsRequested> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddonsRequested createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new AddonsRequested(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddonsRequested[] newArray(int i11) {
            return new AddonsRequested[i11];
        }
    }

    public AddonsRequested(String addon, int i11, int i12, Float f11, boolean z11) {
        o.i(addon, "addon");
        this.addon = addon;
        this.catId = i11;
        this.districtId = i12;
        this.price = f11;
        this.includedInBundle = z11;
    }

    public static /* synthetic */ AddonsRequested copy$default(AddonsRequested addonsRequested, String str, int i11, int i12, Float f11, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = addonsRequested.addon;
        }
        if ((i13 & 2) != 0) {
            i11 = addonsRequested.catId;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = addonsRequested.districtId;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            f11 = addonsRequested.price;
        }
        Float f12 = f11;
        if ((i13 & 16) != 0) {
            z11 = addonsRequested.includedInBundle;
        }
        return addonsRequested.copy(str, i14, i15, f12, z11);
    }

    public final String component1() {
        return this.addon;
    }

    public final int component2() {
        return this.catId;
    }

    public final int component3() {
        return this.districtId;
    }

    public final Float component4() {
        return this.price;
    }

    public final boolean component5() {
        return this.includedInBundle;
    }

    public final AddonsRequested copy(String addon, int i11, int i12, Float f11, boolean z11) {
        o.i(addon, "addon");
        return new AddonsRequested(addon, i11, i12, f11, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonsRequested)) {
            return false;
        }
        AddonsRequested addonsRequested = (AddonsRequested) obj;
        if (o.d(this.addon, addonsRequested.addon) && this.catId == addonsRequested.catId && this.districtId == addonsRequested.districtId && o.d(this.price, addonsRequested.price) && this.includedInBundle == addonsRequested.includedInBundle) {
            return true;
        }
        return false;
    }

    public final String getAddon() {
        return this.addon;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final int getDistrictId() {
        return this.districtId;
    }

    public final boolean getIncludedInBundle() {
        return this.includedInBundle;
    }

    public final Float getPrice() {
        return this.price;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.addon.hashCode() * 31) + Integer.hashCode(this.catId)) * 31) + Integer.hashCode(this.districtId)) * 31;
        Float f11 = this.price;
        if (f11 == null) {
            hashCode = 0;
        } else {
            hashCode = f11.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        boolean z11 = this.includedInBundle;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public final void setIncludedInBundle(boolean z11) {
        this.includedInBundle = z11;
    }

    public final void setPrice(Float f11) {
        this.price = f11;
    }

    public String toString() {
        String str = this.addon;
        int i11 = this.catId;
        int i12 = this.districtId;
        Float f11 = this.price;
        boolean z11 = this.includedInBundle;
        return "AddonsRequested(addon=" + str + ", catId=" + i11 + ", districtId=" + i12 + ", price=" + f11 + ", includedInBundle=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.addon);
        out.writeInt(this.catId);
        out.writeInt(this.districtId);
        Float f11 = this.price;
        if (f11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f11.floatValue());
        }
        out.writeInt(this.includedInBundle ? 1 : 0);
    }

    public /* synthetic */ AddonsRequested(String str, int i11, int i12, Float f11, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? null : f11, (i13 & 16) != 0 ? false : z11);
    }
}
