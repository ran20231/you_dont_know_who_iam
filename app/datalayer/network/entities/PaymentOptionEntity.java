package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PaymentOptionEntity.kt */
/* loaded from: classes2.dex */
public final class PaymentOptionEntity implements Parcelable {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final String ID = "id";
    public static final String IMAGE_AR = "image_ar";
    public static final String IMAGE_EN = "image_en";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String REGION_ID = "region_id";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22333id;
    @c("image_ar")
    private final String imageAr;
    @c("image_en")
    private final String imageEn;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("region_id")
    private final int regionId;

    /* compiled from: PaymentOptionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<PaymentOptionEntity> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentOptionEntity createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new PaymentOptionEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentOptionEntity[] newArray(int i11) {
            return new PaymentOptionEntity[i11];
        }
    }

    public PaymentOptionEntity(int i11, String imageAr, String imageEn, String nameAr, String nameEn, int i12) {
        o.i(imageAr, "imageAr");
        o.i(imageEn, "imageEn");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        this.f22333id = i11;
        this.imageAr = imageAr;
        this.imageEn = imageEn;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.regionId = i12;
    }

    public static /* synthetic */ PaymentOptionEntity copy$default(PaymentOptionEntity paymentOptionEntity, int i11, String str, String str2, String str3, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = paymentOptionEntity.f22333id;
        }
        if ((i13 & 2) != 0) {
            str = paymentOptionEntity.imageAr;
        }
        String str5 = str;
        if ((i13 & 4) != 0) {
            str2 = paymentOptionEntity.imageEn;
        }
        String str6 = str2;
        if ((i13 & 8) != 0) {
            str3 = paymentOptionEntity.nameAr;
        }
        String str7 = str3;
        if ((i13 & 16) != 0) {
            str4 = paymentOptionEntity.nameEn;
        }
        String str8 = str4;
        if ((i13 & 32) != 0) {
            i12 = paymentOptionEntity.regionId;
        }
        return paymentOptionEntity.copy(i11, str5, str6, str7, str8, i12);
    }

    public final int component1() {
        return this.f22333id;
    }

    public final String component2() {
        return this.imageAr;
    }

    public final String component3() {
        return this.imageEn;
    }

    public final String component4() {
        return this.nameAr;
    }

    public final String component5() {
        return this.nameEn;
    }

    public final int component6() {
        return this.regionId;
    }

    public final PaymentOptionEntity copy(int i11, String imageAr, String imageEn, String nameAr, String nameEn, int i12) {
        o.i(imageAr, "imageAr");
        o.i(imageEn, "imageEn");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        return new PaymentOptionEntity(i11, imageAr, imageEn, nameAr, nameEn, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptionEntity)) {
            return false;
        }
        PaymentOptionEntity paymentOptionEntity = (PaymentOptionEntity) obj;
        if (this.f22333id == paymentOptionEntity.f22333id && o.d(this.imageAr, paymentOptionEntity.imageAr) && o.d(this.imageEn, paymentOptionEntity.imageEn) && o.d(this.nameAr, paymentOptionEntity.nameAr) && o.d(this.nameEn, paymentOptionEntity.nameEn) && this.regionId == paymentOptionEntity.regionId) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22333id;
    }

    public final String getImage() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
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

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f22333id) * 31) + this.imageAr.hashCode()) * 31) + this.imageEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + Integer.hashCode(this.regionId);
    }

    public String toString() {
        int i11 = this.f22333id;
        String str = this.imageAr;
        String str2 = this.imageEn;
        String str3 = this.nameAr;
        String str4 = this.nameEn;
        int i12 = this.regionId;
        return "PaymentOptionEntity(id=" + i11 + ", imageAr=" + str + ", imageEn=" + str2 + ", nameAr=" + str3 + ", nameEn=" + str4 + ", regionId=" + i12 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        o.i(parcel, "parcel");
        parcel.writeInt(this.f22333id);
        parcel.writeString(this.imageAr);
        parcel.writeString(this.imageEn);
        parcel.writeString(this.nameAr);
        parcel.writeString(this.nameEn);
        parcel.writeInt(this.regionId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaymentOptionEntity(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.i(r9, r0)
            int r2 = r9.readInt()
            java.lang.String r3 = r9.readString()
            kotlin.jvm.internal.o.f(r3)
            java.lang.String r4 = r9.readString()
            kotlin.jvm.internal.o.f(r4)
            java.lang.String r5 = r9.readString()
            kotlin.jvm.internal.o.f(r5)
            java.lang.String r6 = r9.readString()
            kotlin.jvm.internal.o.f(r6)
            int r7 = r9.readInt()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.PaymentOptionEntity.<init>(android.os.Parcel):void");
    }
}
