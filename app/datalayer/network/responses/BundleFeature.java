package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BundlesResponse.kt */
/* loaded from: classes2.dex */
public final class BundleFeature implements Parcelable {
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f22348id;
    @c("image")
    private final String image;
    @c("name")
    private final String name;
    public static final Parcelable.Creator<BundleFeature> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BundlesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BundleFeature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BundleFeature createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new BundleFeature(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BundleFeature[] newArray(int i11) {
            return new BundleFeature[i11];
        }
    }

    public BundleFeature(String id2, String name, String image) {
        o.i(id2, "id");
        o.i(name, "name");
        o.i(image, "image");
        this.f22348id = id2;
        this.name = name;
        this.image = image;
    }

    public static /* synthetic */ BundleFeature copy$default(BundleFeature bundleFeature, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bundleFeature.f22348id;
        }
        if ((i11 & 2) != 0) {
            str2 = bundleFeature.name;
        }
        if ((i11 & 4) != 0) {
            str3 = bundleFeature.image;
        }
        return bundleFeature.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f22348id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.image;
    }

    public final BundleFeature copy(String id2, String name, String image) {
        o.i(id2, "id");
        o.i(name, "name");
        o.i(image, "image");
        return new BundleFeature(id2, name, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleFeature)) {
            return false;
        }
        BundleFeature bundleFeature = (BundleFeature) obj;
        if (o.d(this.f22348id, bundleFeature.f22348id) && o.d(this.name, bundleFeature.name) && o.d(this.image, bundleFeature.image)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f22348id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.f22348id.hashCode() * 31) + this.name.hashCode()) * 31) + this.image.hashCode();
    }

    public String toString() {
        String str = this.f22348id;
        String str2 = this.name;
        String str3 = this.image;
        return "BundleFeature(id=" + str + ", name=" + str2 + ", image=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f22348id);
        out.writeString(this.name);
        out.writeString(this.image);
    }
}
