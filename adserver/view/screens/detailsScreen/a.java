package com.forsale.adserver.view.screens.detailsScreen;

import commercial.CommercialTabName;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CommercialDetailsAnalyticPayload.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final int f21347j = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f21348a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f21349b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21350c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f21351d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f21352e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f21353f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f21354g;

    /* renamed from: h  reason: collision with root package name */
    private final CommercialTabName f21355h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f21356i;

    public a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final CommercialTabName a() {
        return this.f21355h;
    }

    public final Integer b() {
        return this.f21356i;
    }

    public final Integer c() {
        return this.f21353f;
    }

    public final Integer d() {
        return this.f21354g;
    }

    public final Integer e() {
        return this.f21349b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.o.d(this.f21348a, aVar.f21348a) && kotlin.jvm.internal.o.d(this.f21349b, aVar.f21349b) && kotlin.jvm.internal.o.d(this.f21350c, aVar.f21350c) && kotlin.jvm.internal.o.d(this.f21351d, aVar.f21351d) && kotlin.jvm.internal.o.d(this.f21352e, aVar.f21352e) && kotlin.jvm.internal.o.d(this.f21353f, aVar.f21353f) && kotlin.jvm.internal.o.d(this.f21354g, aVar.f21354g) && this.f21355h == aVar.f21355h && kotlin.jvm.internal.o.d(this.f21356i, aVar.f21356i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f21350c;
    }

    public final Integer g() {
        return this.f21351d;
    }

    public final Boolean h() {
        return this.f21348a;
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
        Boolean bool = this.f21348a;
        int i11 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.f21349b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.f21350c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num2 = this.f21351d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num3 = this.f21352e;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num4 = this.f21353f;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Integer num5 = this.f21354g;
        if (num5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num5.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        CommercialTabName commercialTabName = this.f21355h;
        if (commercialTabName == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = commercialTabName.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        Integer num6 = this.f21356i;
        if (num6 != null) {
            i11 = num6.hashCode();
        }
        return i19 + i11;
    }

    public String toString() {
        Boolean bool = this.f21348a;
        Integer num = this.f21349b;
        String str = this.f21350c;
        Integer num2 = this.f21351d;
        Integer num3 = this.f21352e;
        Integer num4 = this.f21353f;
        Integer num5 = this.f21354g;
        CommercialTabName commercialTabName = this.f21355h;
        Integer num6 = this.f21356i;
        return "CommercialDetailsAnalyticPayload(isSourceSectionSelectedByUser=" + bool + ", sourceCarouselTotalItems=" + num + ", sourceCategoryFullPath=" + str + ", sourceItemOrder=" + num2 + ", sourceCarouselOrder=" + num3 + ", positionCategoryId=" + num4 + ", sourceCarouselRowsCount=" + num5 + ", commercialTabName=" + commercialTabName + ", commercialWeight=" + num6 + ")";
    }

    public a(Boolean bool, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, CommercialTabName commercialTabName, Integer num6) {
        this.f21348a = bool;
        this.f21349b = num;
        this.f21350c = str;
        this.f21351d = num2;
        this.f21352e = num3;
        this.f21353f = num4;
        this.f21354g = num5;
        this.f21355h = commercialTabName;
        this.f21356i = num6;
    }

    public /* synthetic */ a(Boolean bool, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, CommercialTabName commercialTabName, Integer num6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : num4, (i11 & 64) != 0 ? null : num5, (i11 & 128) == 0 ? commercialTabName : null, (i11 & 256) != 0 ? 0 : num6);
    }
}
