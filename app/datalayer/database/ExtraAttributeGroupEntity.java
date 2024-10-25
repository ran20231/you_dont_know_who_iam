package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ExtraAttributeGroupEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributeGroupEntity {
    public static final String DISPLAY_ORDER = "display_order";
    public static final String EXTRA_ATTRIBUTE_GROUPS_TABLE = "extra_attribute_groups";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String REGION_ID = "region_id";
    @c("display_order")
    private final int displayOrder;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private int f22314id;
    @c("is_active")
    private int isActive;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ExtraAttributeGroupEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExtraAttributeGroupEntity(int i11, String nameEn, String nameAr, int i12) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        this.f22314id = i11;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.displayOrder = i12;
        this.isActive = 1;
    }

    public static /* synthetic */ ExtraAttributeGroupEntity copy$default(ExtraAttributeGroupEntity extraAttributeGroupEntity, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = extraAttributeGroupEntity.f22314id;
        }
        if ((i13 & 2) != 0) {
            str = extraAttributeGroupEntity.nameEn;
        }
        if ((i13 & 4) != 0) {
            str2 = extraAttributeGroupEntity.nameAr;
        }
        if ((i13 & 8) != 0) {
            i12 = extraAttributeGroupEntity.displayOrder;
        }
        return extraAttributeGroupEntity.copy(i11, str, str2, i12);
    }

    public final int component1() {
        return this.f22314id;
    }

    public final String component2() {
        return this.nameEn;
    }

    public final String component3() {
        return this.nameAr;
    }

    public final int component4() {
        return this.displayOrder;
    }

    public final ExtraAttributeGroupEntity copy(int i11, String nameEn, String nameAr, int i12) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        return new ExtraAttributeGroupEntity(i11, nameEn, nameAr, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraAttributeGroupEntity)) {
            return false;
        }
        ExtraAttributeGroupEntity extraAttributeGroupEntity = (ExtraAttributeGroupEntity) obj;
        if (this.f22314id == extraAttributeGroupEntity.f22314id && o.d(this.nameEn, extraAttributeGroupEntity.nameEn) && o.d(this.nameAr, extraAttributeGroupEntity.nameAr) && this.displayOrder == extraAttributeGroupEntity.displayOrder) {
            return true;
        }
        return false;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final int getId() {
        return this.f22314id;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f22314id) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + Integer.hashCode(this.displayOrder);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public final void setId(int i11) {
        this.f22314id = i11;
    }

    public String toString() {
        int i11 = this.f22314id;
        String str = this.nameEn;
        String str2 = this.nameAr;
        int i12 = this.displayOrder;
        return "ExtraAttributeGroupEntity(id=" + i11 + ", nameEn=" + str + ", nameAr=" + str2 + ", displayOrder=" + i12 + ")";
    }
}
