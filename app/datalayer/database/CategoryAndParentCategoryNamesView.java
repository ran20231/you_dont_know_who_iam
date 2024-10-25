package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.o;
/* compiled from: CategoryAndParentCategoryNamesView.kt */
/* loaded from: classes2.dex */
public final class CategoryAndParentCategoryNamesView {
    public static final int $stable = 0;
    private final String nameAr;
    private final String nameEn;
    private final String parentNameAr;
    private final String parentNameEn;

    public CategoryAndParentCategoryNamesView(String nameEn, String nameAr, String str, String str2) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.parentNameEn = str;
        this.parentNameAr = str2;
    }

    public static /* synthetic */ CategoryAndParentCategoryNamesView copy$default(CategoryAndParentCategoryNamesView categoryAndParentCategoryNamesView, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryAndParentCategoryNamesView.nameEn;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryAndParentCategoryNamesView.nameAr;
        }
        if ((i11 & 4) != 0) {
            str3 = categoryAndParentCategoryNamesView.parentNameEn;
        }
        if ((i11 & 8) != 0) {
            str4 = categoryAndParentCategoryNamesView.parentNameAr;
        }
        return categoryAndParentCategoryNamesView.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.nameEn;
    }

    public final String component2() {
        return this.nameAr;
    }

    public final String component3() {
        return this.parentNameEn;
    }

    public final String component4() {
        return this.parentNameAr;
    }

    public final CategoryAndParentCategoryNamesView copy(String nameEn, String nameAr, String str, String str2) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        return new CategoryAndParentCategoryNamesView(nameEn, nameAr, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryAndParentCategoryNamesView)) {
            return false;
        }
        CategoryAndParentCategoryNamesView categoryAndParentCategoryNamesView = (CategoryAndParentCategoryNamesView) obj;
        if (o.d(this.nameEn, categoryAndParentCategoryNamesView.nameEn) && o.d(this.nameAr, categoryAndParentCategoryNamesView.nameAr) && o.d(this.parentNameEn, categoryAndParentCategoryNamesView.parentNameEn) && o.d(this.parentNameAr, categoryAndParentCategoryNamesView.parentNameAr)) {
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

    public final String getParentNameAr() {
        return this.parentNameAr;
    }

    public final String getParentNameEn() {
        return this.parentNameEn;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.nameEn.hashCode() * 31) + this.nameAr.hashCode()) * 31;
        String str = this.parentNameEn;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        String str2 = this.parentNameAr;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.nameEn;
        String str2 = this.nameAr;
        String str3 = this.parentNameEn;
        String str4 = this.parentNameAr;
        return "CategoryAndParentCategoryNamesView(nameEn=" + str + ", nameAr=" + str2 + ", parentNameEn=" + str3 + ", parentNameAr=" + str4 + ")";
    }
}
