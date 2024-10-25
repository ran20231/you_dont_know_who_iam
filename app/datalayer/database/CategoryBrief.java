package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CategoryBrief.kt */
/* loaded from: classes2.dex */
public final class CategoryBrief {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final int f22302id;
    @c("name_en")
    private final String nameEn;

    public CategoryBrief(int i11, String nameEn) {
        o.i(nameEn, "nameEn");
        this.f22302id = i11;
        this.nameEn = nameEn;
    }

    public static /* synthetic */ CategoryBrief copy$default(CategoryBrief categoryBrief, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = categoryBrief.f22302id;
        }
        if ((i12 & 2) != 0) {
            str = categoryBrief.nameEn;
        }
        return categoryBrief.copy(i11, str);
    }

    public final int component1() {
        return this.f22302id;
    }

    public final String component2() {
        return this.nameEn;
    }

    public final CategoryBrief copy(int i11, String nameEn) {
        o.i(nameEn, "nameEn");
        return new CategoryBrief(i11, nameEn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryBrief)) {
            return false;
        }
        CategoryBrief categoryBrief = (CategoryBrief) obj;
        if (this.f22302id == categoryBrief.f22302id && o.d(this.nameEn, categoryBrief.nameEn)) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22302id;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f22302id) * 31) + this.nameEn.hashCode();
    }

    public String toString() {
        int i11 = this.f22302id;
        String str = this.nameEn;
        return "CategoryBrief(id=" + i11 + ", nameEn=" + str + ")";
    }

    public /* synthetic */ CategoryBrief(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, str);
    }
}
