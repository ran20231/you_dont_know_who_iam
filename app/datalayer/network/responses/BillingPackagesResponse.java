package com.forsale.app.datalayer.network.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BillingPackagesResponse.kt */
/* loaded from: classes2.dex */
public final class BillingPackagesResponse implements Parcelable {
    @c("data")
    private final List<Package> packages;
    public static final Parcelable.Creator<BillingPackagesResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BillingPackagesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BillingPackagesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingPackagesResponse createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Package.CREATOR.createFromParcel(parcel));
            }
            return new BillingPackagesResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingPackagesResponse[] newArray(int i11) {
            return new BillingPackagesResponse[i11];
        }
    }

    /* compiled from: BillingPackagesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Package implements Parcelable {
        @c("currency_ar")
        private final String currencyAr;
        @c("currency_en")
        private final String currencyEn;
        @c(AgentEntity.DESCRIPTION_AR)
        private final String descriptionAr;
        @c(AgentEntity.DESCRIPTION_EN)
        private final String descriptionEn;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final int f22346id;
        @c("is_in_app")
        private final int isInApp;
        @c("name_ar")
        private final String nameAr;
        @c("name_en")
        private final String nameEn;
        @c("number_of_ads")
        private final int numberOfAds;
        @c("payment_url")
        private final String paymentUrl;
        @c("price")
        private final float price;
        public static final Parcelable.Creator<Package> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: BillingPackagesResponse.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Package> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Package createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Package(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Package[] newArray(int i11) {
                return new Package[i11];
            }
        }

        public Package(String currencyAr, String currencyEn, String descriptionAr, String descriptionEn, int i11, int i12, String nameAr, String nameEn, int i13, String paymentUrl, float f11) {
            o.i(currencyAr, "currencyAr");
            o.i(currencyEn, "currencyEn");
            o.i(descriptionAr, "descriptionAr");
            o.i(descriptionEn, "descriptionEn");
            o.i(nameAr, "nameAr");
            o.i(nameEn, "nameEn");
            o.i(paymentUrl, "paymentUrl");
            this.currencyAr = currencyAr;
            this.currencyEn = currencyEn;
            this.descriptionAr = descriptionAr;
            this.descriptionEn = descriptionEn;
            this.f22346id = i11;
            this.isInApp = i12;
            this.nameAr = nameAr;
            this.nameEn = nameEn;
            this.numberOfAds = i13;
            this.paymentUrl = paymentUrl;
            this.price = f11;
        }

        public static /* synthetic */ Package copy$default(Package r12, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, int i13, String str7, float f11, int i14, Object obj) {
            String str8;
            String str9;
            String str10;
            String str11;
            int i15;
            int i16;
            String str12;
            String str13;
            int i17;
            String str14;
            float f12;
            if ((i14 & 1) != 0) {
                str8 = r12.currencyAr;
            } else {
                str8 = str;
            }
            if ((i14 & 2) != 0) {
                str9 = r12.currencyEn;
            } else {
                str9 = str2;
            }
            if ((i14 & 4) != 0) {
                str10 = r12.descriptionAr;
            } else {
                str10 = str3;
            }
            if ((i14 & 8) != 0) {
                str11 = r12.descriptionEn;
            } else {
                str11 = str4;
            }
            if ((i14 & 16) != 0) {
                i15 = r12.f22346id;
            } else {
                i15 = i11;
            }
            if ((i14 & 32) != 0) {
                i16 = r12.isInApp;
            } else {
                i16 = i12;
            }
            if ((i14 & 64) != 0) {
                str12 = r12.nameAr;
            } else {
                str12 = str5;
            }
            if ((i14 & 128) != 0) {
                str13 = r12.nameEn;
            } else {
                str13 = str6;
            }
            if ((i14 & 256) != 0) {
                i17 = r12.numberOfAds;
            } else {
                i17 = i13;
            }
            if ((i14 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                str14 = r12.paymentUrl;
            } else {
                str14 = str7;
            }
            if ((i14 & 1024) != 0) {
                f12 = r12.price;
            } else {
                f12 = f11;
            }
            return r12.copy(str8, str9, str10, str11, i15, i16, str12, str13, i17, str14, f12);
        }

        public final String component1() {
            return this.currencyAr;
        }

        public final String component10() {
            return this.paymentUrl;
        }

        public final float component11() {
            return this.price;
        }

        public final String component2() {
            return this.currencyEn;
        }

        public final String component3() {
            return this.descriptionAr;
        }

        public final String component4() {
            return this.descriptionEn;
        }

        public final int component5() {
            return this.f22346id;
        }

        public final int component6() {
            return this.isInApp;
        }

        public final String component7() {
            return this.nameAr;
        }

        public final String component8() {
            return this.nameEn;
        }

        public final int component9() {
            return this.numberOfAds;
        }

        public final Package copy(String currencyAr, String currencyEn, String descriptionAr, String descriptionEn, int i11, int i12, String nameAr, String nameEn, int i13, String paymentUrl, float f11) {
            o.i(currencyAr, "currencyAr");
            o.i(currencyEn, "currencyEn");
            o.i(descriptionAr, "descriptionAr");
            o.i(descriptionEn, "descriptionEn");
            o.i(nameAr, "nameAr");
            o.i(nameEn, "nameEn");
            o.i(paymentUrl, "paymentUrl");
            return new Package(currencyAr, currencyEn, descriptionAr, descriptionEn, i11, i12, nameAr, nameEn, i13, paymentUrl, f11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Package)) {
                return false;
            }
            Package r52 = (Package) obj;
            if (o.d(this.currencyAr, r52.currencyAr) && o.d(this.currencyEn, r52.currencyEn) && o.d(this.descriptionAr, r52.descriptionAr) && o.d(this.descriptionEn, r52.descriptionEn) && this.f22346id == r52.f22346id && this.isInApp == r52.isInApp && o.d(this.nameAr, r52.nameAr) && o.d(this.nameEn, r52.nameEn) && this.numberOfAds == r52.numberOfAds && o.d(this.paymentUrl, r52.paymentUrl) && Float.compare(this.price, r52.price) == 0) {
                return true;
            }
            return false;
        }

        public final String getCurrency() {
            if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
                return this.currencyEn;
            }
            return this.currencyAr;
        }

        public final String getCurrencyAr() {
            return this.currencyAr;
        }

        public final String getCurrencyEn() {
            return this.currencyEn;
        }

        public final String getDescription() {
            if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
                return this.descriptionEn;
            }
            return this.descriptionAr;
        }

        public final String getDescriptionAr() {
            return this.descriptionAr;
        }

        public final String getDescriptionEn() {
            return this.descriptionEn;
        }

        public final int getId() {
            return this.f22346id;
        }

        public final String getName() {
            if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
                return this.nameEn;
            }
            return this.nameAr;
        }

        public final String getNameAr() {
            return this.nameAr;
        }

        public final String getNameEn() {
            return this.nameEn;
        }

        public final int getNumberOfAds() {
            return this.numberOfAds;
        }

        public final String getPaymentUrl() {
            return this.paymentUrl;
        }

        public final float getPrice() {
            return this.price;
        }

        public int hashCode() {
            return (((((((((((((((((((this.currencyAr.hashCode() * 31) + this.currencyEn.hashCode()) * 31) + this.descriptionAr.hashCode()) * 31) + this.descriptionEn.hashCode()) * 31) + Integer.hashCode(this.f22346id)) * 31) + Integer.hashCode(this.isInApp)) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + Integer.hashCode(this.numberOfAds)) * 31) + this.paymentUrl.hashCode()) * 31) + Float.hashCode(this.price);
        }

        public final int isInApp() {
            return this.isInApp;
        }

        public String toString() {
            String str = this.currencyAr;
            String str2 = this.currencyEn;
            String str3 = this.descriptionAr;
            String str4 = this.descriptionEn;
            int i11 = this.f22346id;
            int i12 = this.isInApp;
            String str5 = this.nameAr;
            String str6 = this.nameEn;
            int i13 = this.numberOfAds;
            String str7 = this.paymentUrl;
            float f11 = this.price;
            return "Package(currencyAr=" + str + ", currencyEn=" + str2 + ", descriptionAr=" + str3 + ", descriptionEn=" + str4 + ", id=" + i11 + ", isInApp=" + i12 + ", nameAr=" + str5 + ", nameEn=" + str6 + ", numberOfAds=" + i13 + ", paymentUrl=" + str7 + ", price=" + f11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.currencyAr);
            out.writeString(this.currencyEn);
            out.writeString(this.descriptionAr);
            out.writeString(this.descriptionEn);
            out.writeInt(this.f22346id);
            out.writeInt(this.isInApp);
            out.writeString(this.nameAr);
            out.writeString(this.nameEn);
            out.writeInt(this.numberOfAds);
            out.writeString(this.paymentUrl);
            out.writeFloat(this.price);
        }
    }

    public BillingPackagesResponse(List<Package> packages) {
        o.i(packages, "packages");
        this.packages = packages;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<Package> getPackages() {
        return this.packages;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        List<Package> list = this.packages;
        out.writeInt(list.size());
        for (Package r12 : list) {
            r12.writeToParcel(out, i11);
        }
    }
}
