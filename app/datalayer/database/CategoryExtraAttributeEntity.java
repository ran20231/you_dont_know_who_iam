package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import up.c;
/* compiled from: CategoryExtraAttributeEntity.kt */
/* loaded from: classes2.dex */
public final class CategoryExtraAttributeEntity {
    public static final String ATTRIBUTE_ID = "attribute_id";
    public static final String CATEGORIES_EXTRA_ATTRIBUTES = "categories_extra_attributes";
    public static final String CAT_ID = "cat_id";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    @c("attribute_id")
    private final int attributeId;
    @c("cat_id")
    private final int catId;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22305id;
    @c("is_active")
    private int isActive = 1;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CategoryExtraAttributeEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CategoryExtraAttributeEntity(int i11, int i12, int i13) {
        this.f22305id = i11;
        this.catId = i12;
        this.attributeId = i13;
    }

    public static /* synthetic */ CategoryExtraAttributeEntity copy$default(CategoryExtraAttributeEntity categoryExtraAttributeEntity, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = categoryExtraAttributeEntity.f22305id;
        }
        if ((i14 & 2) != 0) {
            i12 = categoryExtraAttributeEntity.catId;
        }
        if ((i14 & 4) != 0) {
            i13 = categoryExtraAttributeEntity.attributeId;
        }
        return categoryExtraAttributeEntity.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.f22305id;
    }

    public final int component2() {
        return this.catId;
    }

    public final int component3() {
        return this.attributeId;
    }

    public final CategoryExtraAttributeEntity copy(int i11, int i12, int i13) {
        return new CategoryExtraAttributeEntity(i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryExtraAttributeEntity)) {
            return false;
        }
        CategoryExtraAttributeEntity categoryExtraAttributeEntity = (CategoryExtraAttributeEntity) obj;
        if (this.f22305id == categoryExtraAttributeEntity.f22305id && this.catId == categoryExtraAttributeEntity.catId && this.attributeId == categoryExtraAttributeEntity.attributeId) {
            return true;
        }
        return false;
    }

    public final int getAttributeId() {
        return this.attributeId;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final int getId() {
        return this.f22305id;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f22305id) * 31) + Integer.hashCode(this.catId)) * 31) + Integer.hashCode(this.attributeId);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22305id;
        int i12 = this.catId;
        int i13 = this.attributeId;
        return "CategoryExtraAttributeEntity(id=" + i11 + ", catId=" + i12 + ", attributeId=" + i13 + ")";
    }
}
