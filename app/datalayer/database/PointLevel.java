package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PointLevel.kt */
/* loaded from: classes2.dex */
public final class PointLevel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String POINTS = "points";
    public static final String URL = "url";
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("points")
    private final int points;
    @c("url")
    private final String url;

    /* compiled from: PointLevel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PointLevel(String nameAr, String nameEn, String url, int i11) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(url, "url");
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.url = url;
        this.points = i11;
    }

    public static /* synthetic */ PointLevel copy$default(PointLevel pointLevel, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pointLevel.nameAr;
        }
        if ((i12 & 2) != 0) {
            str2 = pointLevel.nameEn;
        }
        if ((i12 & 4) != 0) {
            str3 = pointLevel.url;
        }
        if ((i12 & 8) != 0) {
            i11 = pointLevel.points;
        }
        return pointLevel.copy(str, str2, str3, i11);
    }

    public final String component1() {
        return this.nameAr;
    }

    public final String component2() {
        return this.nameEn;
    }

    public final String component3() {
        return this.url;
    }

    public final int component4() {
        return this.points;
    }

    public final PointLevel copy(String nameAr, String nameEn, String url, int i11) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(url, "url");
        return new PointLevel(nameAr, nameEn, url, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointLevel)) {
            return false;
        }
        PointLevel pointLevel = (PointLevel) obj;
        if (o.d(this.nameAr, pointLevel.nameAr) && o.d(this.nameEn, pointLevel.nameEn) && o.d(this.url, pointLevel.url) && this.points == pointLevel.points) {
            return true;
        }
        return false;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final int getPoints() {
        return this.points;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.nameAr.hashCode() * 31) + this.nameEn.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.points);
    }

    public String toString() {
        String str = this.nameAr;
        String str2 = this.nameEn;
        String str3 = this.url;
        int i11 = this.points;
        return "PointLevel(nameAr=" + str + ", nameEn=" + str2 + ", url=" + str3 + ", points=" + i11 + ")";
    }
}
