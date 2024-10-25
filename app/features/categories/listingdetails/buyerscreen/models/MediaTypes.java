package com.forsale.app.features.categories.listingdetails.buyerscreen.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData;
import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import kotlin.jvm.internal.o;
/* compiled from: MediaTypes.kt */
/* loaded from: classes2.dex */
public interface MediaTypes extends Serializable {

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class Images implements MediaTypes, Parcelable {
        public static final Parcelable.Creator<Images> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f26304c = 8;

        /* renamed from: a  reason: collision with root package name */
        private final int f26305a;

        /* renamed from: b  reason: collision with root package name */
        private final String f26306b;

        /* compiled from: MediaTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Images> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Images createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Images(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Images[] newArray(int i11) {
                return new Images[i11];
            }
        }

        public Images(int i11, String images) {
            o.i(images, "images");
            this.f26305a = i11;
            this.f26306b = images;
        }

        public final int a() {
            return this.f26305a;
        }

        public final String b() {
            return this.f26306b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            if (this.f26305a == images.f26305a && o.d(this.f26306b, images.f26306b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f26305a) * 31) + this.f26306b.hashCode();
        }

        public String toString() {
            int i11 = this.f26305a;
            String str = this.f26306b;
            return "Images(currentIndex=" + i11 + ", images=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.f26305a);
            out.writeString(this.f26306b);
        }
    }

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class Map implements MediaTypes, Parcelable {
        public static final Parcelable.Creator<Map> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f26307c = 8;

        /* renamed from: a  reason: collision with root package name */
        private final LatLng f26308a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f26309b;

        /* compiled from: MediaTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Map> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Map createFromParcel(Parcel parcel) {
                boolean z11;
                o.i(parcel, "parcel");
                LatLng latLng = (LatLng) parcel.readParcelable(Map.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new Map(latLng, z11);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Map[] newArray(int i11) {
                return new Map[i11];
            }
        }

        public Map(LatLng latLng, boolean z11) {
            o.i(latLng, "latLng");
            this.f26308a = latLng;
            this.f26309b = z11;
        }

        public final LatLng a() {
            return this.f26308a;
        }

        public final boolean b() {
            return this.f26309b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (o.d(this.f26308a, map.f26308a) && this.f26309b == map.f26309b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f26308a.hashCode() * 31;
            boolean z11 = this.f26309b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            LatLng latLng = this.f26308a;
            boolean z11 = this.f26309b;
            return "Map(latLng=" + latLng + ", isExact=" + z11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeParcelable(this.f26308a, i11);
            out.writeInt(this.f26309b ? 1 : 0);
        }
    }

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class PDF implements MediaTypes, Parcelable {
        public static final Parcelable.Creator<PDF> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f26310b = 8;

        /* renamed from: a  reason: collision with root package name */
        private final FileMetaData f26311a;

        /* compiled from: MediaTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<PDF> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final PDF createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new PDF((FileMetaData) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final PDF[] newArray(int i11) {
                return new PDF[i11];
            }
        }

        public PDF(FileMetaData mediaFile) {
            o.i(mediaFile, "mediaFile");
            this.f26311a = mediaFile;
        }

        public final FileMetaData a() {
            return this.f26311a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PDF) && o.d(this.f26311a, ((PDF) obj).f26311a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f26311a.hashCode();
        }

        public String toString() {
            FileMetaData fileMetaData = this.f26311a;
            return "PDF(mediaFile=" + fileMetaData + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeSerializable(this.f26311a);
        }
    }

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class ThreeDTour implements MediaTypes, Parcelable {
        public static final Parcelable.Creator<ThreeDTour> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour f26312a;

        /* compiled from: MediaTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ThreeDTour> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ThreeDTour createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new ThreeDTour(BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final ThreeDTour[] newArray(int i11) {
                return new ThreeDTour[i11];
            }
        }

        public ThreeDTour(BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour) {
            o.i(virtualTour, "virtualTour");
            this.f26312a = virtualTour;
        }

        public final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour a() {
            return this.f26312a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ThreeDTour) && o.d(this.f26312a, ((ThreeDTour) obj).f26312a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f26312a.hashCode();
        }

        public String toString() {
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour = this.f26312a;
            return "ThreeDTour(virtualTour=" + virtualTour + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            this.f26312a.writeToParcel(out, i11);
        }
    }

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class Video implements MediaTypes, Parcelable {

        /* renamed from: a  reason: collision with root package name */
        public static final Video f26313a = new Video();
        public static final Parcelable.Creator<Video> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f26314b = 8;

        /* compiled from: MediaTypes.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Video createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                parcel.readInt();
                return Video.f26313a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final Video[] newArray(int i11) {
                return new Video[i11];
            }
        }

        private Video() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(1);
        }
    }
}
