package com.forsale.app.features.categories.listingdetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: DetailsModel.kt */
/* loaded from: classes2.dex */
public final class BuyerData implements Parcelable {
    public static final Parcelable.Creator<BuyerData> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f26982b = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26983a;

    /* compiled from: DetailsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<BuyerData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BuyerData createFromParcel(Parcel parcel) {
            boolean z11;
            o.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new BuyerData(z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final BuyerData[] newArray(int i11) {
            return new BuyerData[i11];
        }
    }

    public BuyerData(boolean z11) {
        this.f26983a = z11;
    }

    public final boolean a() {
        return this.f26983a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BuyerData) && this.f26983a == ((BuyerData) obj).f26983a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z11 = this.f26983a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.f26983a;
        return "BuyerData(isFavourite=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f26983a ? 1 : 0);
    }
}
