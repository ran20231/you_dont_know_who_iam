package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CategoryWithParentName.kt */
/* loaded from: classes2.dex */
public final class CategoryWithParentName {
    public static final int $stable = 8;
    private final CategoryEntity category;
    private final String parentNameAr;
    private final String parentNameEn;

    public CategoryWithParentName(String parentNameAr, String parentNameEn, CategoryEntity category) {
        o.i(parentNameAr, "parentNameAr");
        o.i(parentNameEn, "parentNameEn");
        o.i(category, "category");
        this.parentNameAr = parentNameAr;
        this.parentNameEn = parentNameEn;
        this.category = category;
    }

    public static /* synthetic */ CategoryWithParentName copy$default(CategoryWithParentName categoryWithParentName, String str, String str2, CategoryEntity categoryEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryWithParentName.parentNameAr;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryWithParentName.parentNameEn;
        }
        if ((i11 & 4) != 0) {
            categoryEntity = categoryWithParentName.category;
        }
        return categoryWithParentName.copy(str, str2, categoryEntity);
    }

    public final String component1() {
        return this.parentNameAr;
    }

    public final String component2() {
        return this.parentNameEn;
    }

    public final CategoryEntity component3() {
        return this.category;
    }

    public final CategoryWithParentName copy(String parentNameAr, String parentNameEn, CategoryEntity category) {
        o.i(parentNameAr, "parentNameAr");
        o.i(parentNameEn, "parentNameEn");
        o.i(category, "category");
        return new CategoryWithParentName(parentNameAr, parentNameEn, category);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryWithParentName)) {
            return false;
        }
        CategoryWithParentName categoryWithParentName = (CategoryWithParentName) obj;
        if (o.d(this.parentNameAr, categoryWithParentName.parentNameAr) && o.d(this.parentNameEn, categoryWithParentName.parentNameEn) && o.d(this.category, categoryWithParentName.category)) {
            return true;
        }
        return false;
    }

    public final CategoryEntity getCategory() {
        return this.category;
    }

    public final String getParentNameAr() {
        return this.parentNameAr;
    }

    public final String getParentNameEn() {
        return this.parentNameEn;
    }

    public int hashCode() {
        return (((this.parentNameAr.hashCode() * 31) + this.parentNameEn.hashCode()) * 31) + this.category.hashCode();
    }

    public String toString() {
        String str = this.parentNameAr;
        String str2 = this.parentNameEn;
        CategoryEntity categoryEntity = this.category;
        return "CategoryWithParentName(parentNameAr=" + str + ", parentNameEn=" + str2 + ", category=" + categoryEntity + ")";
    }

    public /* synthetic */ CategoryWithParentName(String str, String str2, CategoryEntity categoryEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, categoryEntity);
    }
}
