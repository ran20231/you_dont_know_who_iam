package com.forsale.adserver.view.models;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AdGeneralModel.kt */
/* loaded from: classes2.dex */
public final class AdGeneralModel implements Serializable {
    private int A;
    private int B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private int f21036a;

    /* renamed from: b  reason: collision with root package name */
    private String f21037b;

    /* renamed from: c  reason: collision with root package name */
    private String f21038c;

    /* renamed from: d  reason: collision with root package name */
    private String f21039d;

    /* renamed from: e  reason: collision with root package name */
    private String f21040e;

    /* renamed from: f  reason: collision with root package name */
    private String f21041f;

    /* renamed from: g  reason: collision with root package name */
    private String f21042g;

    /* renamed from: h  reason: collision with root package name */
    private String f21043h;

    /* renamed from: i  reason: collision with root package name */
    private String f21044i;

    /* renamed from: j  reason: collision with root package name */
    private int f21045j;

    /* renamed from: x  reason: collision with root package name */
    private Integer f21046x;

    /* renamed from: y  reason: collision with root package name */
    private String f21047y;

    /* renamed from: z  reason: collision with root package name */
    private Integer f21048z;

    public AdGeneralModel(int i11, String title, String str, String str2, String subType, String str3, String str4, String str5, String str6, int i12, Integer num, String str7, Integer num2) {
        o.i(title, "title");
        o.i(subType, "subType");
        this.f21036a = i11;
        this.f21037b = title;
        this.f21038c = str;
        this.f21039d = str2;
        this.f21040e = subType;
        this.f21041f = str3;
        this.f21042g = str4;
        this.f21043h = str5;
        this.f21044i = str6;
        this.f21045j = i12;
        this.f21046x = num;
        this.f21047y = str7;
        this.f21048z = num2;
    }

    public static /* synthetic */ AdsModel s(AdGeneralModel adGeneralModel, Integer num, AdType adType, ScreenBannerTypes screenBannerTypes, Screens screens, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            screenBannerTypes = null;
        }
        if ((i11 & 8) != 0) {
            screens = null;
        }
        return adGeneralModel.r(num, adType, screenBannerTypes, screens);
    }

    public final String a() {
        return this.f21044i;
    }

    public final int b() {
        return this.f21036a;
    }

    public final String c() {
        return this.f21038c;
    }

    public final int d() {
        return this.A;
    }

    public final Integer e() {
        return this.f21046x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGeneralModel)) {
            return false;
        }
        AdGeneralModel adGeneralModel = (AdGeneralModel) obj;
        if (this.f21036a == adGeneralModel.f21036a && o.d(this.f21037b, adGeneralModel.f21037b) && o.d(this.f21038c, adGeneralModel.f21038c) && o.d(this.f21039d, adGeneralModel.f21039d) && o.d(this.f21040e, adGeneralModel.f21040e) && o.d(this.f21041f, adGeneralModel.f21041f) && o.d(this.f21042g, adGeneralModel.f21042g) && o.d(this.f21043h, adGeneralModel.f21043h) && o.d(this.f21044i, adGeneralModel.f21044i) && this.f21045j == adGeneralModel.f21045j && o.d(this.f21046x, adGeneralModel.f21046x) && o.d(this.f21047y, adGeneralModel.f21047y) && o.d(this.f21048z, adGeneralModel.f21048z)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f21047y;
    }

    public final String g() {
        return this.f21042g;
    }

    public final String h() {
        return this.f21039d;
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
        int hashCode9 = ((Integer.hashCode(this.f21036a) * 31) + this.f21037b.hashCode()) * 31;
        String str = this.f21038c;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode9 + hashCode) * 31;
        String str2 = this.f21039d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode10 = (((i12 + hashCode2) * 31) + this.f21040e.hashCode()) * 31;
        String str3 = this.f21041f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (hashCode10 + hashCode3) * 31;
        String str4 = this.f21042g;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.f21043h;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.f21044i;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int hashCode11 = (((i15 + hashCode6) * 31) + Integer.hashCode(this.f21045j)) * 31;
        Integer num = this.f21046x;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i16 = (hashCode11 + hashCode7) * 31;
        String str7 = this.f21047y;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Integer num2 = this.f21048z;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i17 + i11;
    }

    public final String i() {
        return this.f21040e;
    }

    public final String j() {
        return this.f21043h;
    }

    public final String k() {
        return this.f21037b;
    }

    public final String l() {
        return this.f21041f;
    }

    public final int m() {
        return this.B;
    }

    public final boolean n() {
        return this.C;
    }

    public final void o(boolean z11) {
        this.C = z11;
    }

    public final void p(int i11) {
        this.A = i11;
    }

    public final void q(int i11) {
        this.B = i11;
    }

    public final AdsModel r(Integer num, AdType adType, ScreenBannerTypes screenBannerTypes, Screens screens) {
        String str;
        String str2;
        o.i(adType, "adType");
        int i11 = this.f21036a;
        String str3 = this.f21037b;
        String str4 = this.f21038c;
        String str5 = this.f21042g;
        String str6 = null;
        if (screenBannerTypes != null) {
            str = screenBannerTypes.getType();
        } else {
            str = null;
        }
        if (screens != null) {
            str2 = screens.getScreenName();
        } else {
            str2 = null;
        }
        Integer num2 = this.f21046x;
        String str7 = this.f21047y;
        if (this.f21045j == 1) {
            str6 = this.f21043h;
        }
        return new AdsModel(i11, str3, str4, str5, num, adType, str, str2, num2, str7, null, str6, 1024, null);
    }

    public String toString() {
        int i11 = this.f21036a;
        String str = this.f21037b;
        String str2 = this.f21038c;
        String str3 = this.f21039d;
        String str4 = this.f21040e;
        String str5 = this.f21041f;
        String str6 = this.f21042g;
        String str7 = this.f21043h;
        String str8 = this.f21044i;
        int i12 = this.f21045j;
        Integer num = this.f21046x;
        String str9 = this.f21047y;
        Integer num2 = this.f21048z;
        return "AdGeneralModel(id=" + i11 + ", title=" + str + ", largeImage=" + str2 + ", smallImage=" + str3 + ", subType=" + str4 + ", video=" + str5 + ", phone=" + str6 + ", targetUrl=" + str7 + ", extraImage=" + str8 + ", openTargetUrl=" + i12 + ", offerCategoryId=" + num + ", offerCategoryName=" + str9 + ", weight=" + num2 + ")";
    }

    public /* synthetic */ AdGeneralModel(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, Integer num, String str9, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, str7, str8, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 0 : i12, (i13 & 1024) != 0 ? null : num, (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : str9, (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : num2);
    }
}
