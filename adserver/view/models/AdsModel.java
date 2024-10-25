package com.forsale.adserver.view.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AdsModel.kt */
/* loaded from: classes2.dex */
public final class AdsModel implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final int f21050a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21051b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21052c;

    /* renamed from: d  reason: collision with root package name */
    private final String f21053d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f21054e;

    /* renamed from: f  reason: collision with root package name */
    private final AdType f21055f;

    /* renamed from: g  reason: collision with root package name */
    private final String f21056g;

    /* renamed from: h  reason: collision with root package name */
    private final String f21057h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f21058i;

    /* renamed from: j  reason: collision with root package name */
    private final String f21059j;

    /* renamed from: x  reason: collision with root package name */
    private final Integer f21060x;

    /* renamed from: y  reason: collision with root package name */
    private final String f21061y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f21062z;
    public static final Parcelable.Creator<AdsModel> CREATOR = new a();
    public static final int A = 8;

    /* compiled from: AdsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<AdsModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AdsModel createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            AdType valueOf4 = AdType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new AdsModel(readInt, readString, readString2, readString3, valueOf, valueOf4, readString4, readString5, valueOf2, readString6, valueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AdsModel[] newArray(int i11) {
            return new AdsModel[i11];
        }
    }

    public AdsModel(int i11, String title, String str, String str2, Integer num, AdType adType, String str3, String str4, Integer num2, String str5, Integer num3, String str6) {
        o.i(title, "title");
        o.i(adType, "adType");
        this.f21050a = i11;
        this.f21051b = title;
        this.f21052c = str;
        this.f21053d = str2;
        this.f21054e = num;
        this.f21055f = adType;
        this.f21056g = str3;
        this.f21057h = str4;
        this.f21058i = num2;
        this.f21059j = str5;
        this.f21060x = num3;
        this.f21061y = str6;
        this.f21062z = true;
    }

    public final AdType a() {
        return this.f21055f;
    }

    public final String b() {
        return this.f21057h;
    }

    public final String c() {
        return this.f21056g;
    }

    public final Integer d() {
        return this.f21054e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f21062z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsModel)) {
            return false;
        }
        AdsModel adsModel = (AdsModel) obj;
        if (this.f21050a == adsModel.f21050a && o.d(this.f21051b, adsModel.f21051b) && o.d(this.f21052c, adsModel.f21052c) && o.d(this.f21053d, adsModel.f21053d) && o.d(this.f21054e, adsModel.f21054e) && this.f21055f == adsModel.f21055f && o.d(this.f21056g, adsModel.f21056g) && o.d(this.f21057h, adsModel.f21057h) && o.d(this.f21058i, adsModel.f21058i) && o.d(this.f21059j, adsModel.f21059j) && o.d(this.f21060x, adsModel.f21060x) && o.d(this.f21061y, adsModel.f21061y)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z11;
        String str = this.f21061y;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    public final int g() {
        return this.f21050a;
    }

    public final String h() {
        return this.f21052c;
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
        int hashCode9 = ((Integer.hashCode(this.f21050a) * 31) + this.f21051b.hashCode()) * 31;
        String str = this.f21052c;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode9 + hashCode) * 31;
        String str2 = this.f21053d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num = this.f21054e;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int hashCode10 = (((i13 + hashCode3) * 31) + this.f21055f.hashCode()) * 31;
        String str3 = this.f21056g;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (hashCode10 + hashCode4) * 31;
        String str4 = this.f21057h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num2 = this.f21058i;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str5 = this.f21059j;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num3 = this.f21060x;
        if (num3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num3.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str6 = this.f21061y;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return i18 + i11;
    }

    public final Integer i() {
        return this.f21058i;
    }

    public final String j() {
        return this.f21059j;
    }

    public final String k() {
        return this.f21053d;
    }

    public final String l() {
        return this.f21051b;
    }

    public final String m() {
        return this.f21061y;
    }

    public final Integer n() {
        return this.f21060x;
    }

    public final boolean o() {
        AdType adType = this.f21055f;
        if (adType != AdType.PIN && adType != AdType.BUSINESS_COMMERCIAL) {
            return false;
        }
        return true;
    }

    public final void p(boolean z11) {
        this.f21062z = z11;
    }

    public String toString() {
        int i11 = this.f21050a;
        String str = this.f21051b;
        String str2 = this.f21052c;
        String str3 = this.f21053d;
        Integer num = this.f21054e;
        AdType adType = this.f21055f;
        String str4 = this.f21056g;
        String str5 = this.f21057h;
        Integer num2 = this.f21058i;
        String str6 = this.f21059j;
        Integer num3 = this.f21060x;
        String str7 = this.f21061y;
        return "AdsModel(id=" + i11 + ", title=" + str + ", image=" + str2 + ", phone=" + str3 + ", categoryId=" + num + ", adType=" + adType + ", bannerType=" + str4 + ", bannerScreen=" + str5 + ", offerCategoryId=" + num2 + ", offerCategoryName=" + str6 + ", viewsCount=" + num3 + ", url=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f21050a);
        out.writeString(this.f21051b);
        out.writeString(this.f21052c);
        out.writeString(this.f21053d);
        Integer num = this.f21054e;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f21055f.name());
        out.writeString(this.f21056g);
        out.writeString(this.f21057h);
        Integer num2 = this.f21058i;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f21059j);
        Integer num3 = this.f21060x;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeString(this.f21061y);
    }

    public /* synthetic */ AdsModel(int i11, String str, String str2, String str3, Integer num, AdType adType, String str4, String str5, Integer num2, String str6, Integer num3, String str7, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, (i12 & 16) != 0 ? null : num, adType, str4, str5, (i12 & 256) != 0 ? null : num2, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str6, (i12 & 1024) != 0 ? null : num3, str7);
    }
}
