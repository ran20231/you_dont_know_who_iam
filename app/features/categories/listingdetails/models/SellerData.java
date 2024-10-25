package com.forsale.app.features.categories.listingdetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: DetailsModel.kt */
/* loaded from: classes2.dex */
public final class SellerData implements Parcelable {
    public static final Parcelable.Creator<SellerData> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f27002d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f27003a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f27004b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingItemDetails.BundleDetails f27005c;

    /* compiled from: DetailsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<SellerData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SellerData createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new SellerData(parcel.readInt(), parcel.createStringArrayList(), ListingItemDetails.BundleDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final SellerData[] newArray(int i11) {
            return new SellerData[i11];
        }
    }

    public SellerData(int i11, List<String> list, ListingItemDetails.BundleDetails bundle) {
        o.i(bundle, "bundle");
        this.f27003a = i11;
        this.f27004b = list;
        this.f27005c = bundle;
    }

    public final ListingItemDetails.BundleDetails a() {
        return this.f27005c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerData)) {
            return false;
        }
        SellerData sellerData = (SellerData) obj;
        if (this.f27003a == sellerData.f27003a && o.d(this.f27004b, sellerData.f27004b) && o.d(this.f27005c, sellerData.f27005c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f27003a) * 31;
        List<String> list = this.f27004b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f27005c.hashCode();
    }

    public String toString() {
        int i11 = this.f27003a;
        List<String> list = this.f27004b;
        ListingItemDetails.BundleDetails bundleDetails = this.f27005c;
        return "SellerData(planId=" + i11 + ", addonsIds=" + list + ", bundle=" + bundleDetails + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f27003a);
        out.writeStringList(this.f27004b);
        this.f27005c.writeToParcel(out, i11);
    }
}
