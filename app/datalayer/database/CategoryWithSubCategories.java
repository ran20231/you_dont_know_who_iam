package com.forsale.app.datalayer.database;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
/* compiled from: CategoryWithSubCategories.kt */
/* loaded from: classes2.dex */
public final class CategoryWithSubCategories {
    public static final int $stable = 8;
    private CategoryEntity category;
    private List<CategoryEntity> subCategories;

    public final CategoryEntity getCategory() {
        return this.category;
    }

    public final List<CategoryEntity> getSubCategories() {
        return this.subCategories;
    }

    public final void setCategory(CategoryEntity categoryEntity) {
        this.category = categoryEntity;
    }

    public final void setSubCategories(List<CategoryEntity> list) {
        this.subCategories = list;
    }

    public final List<CategoryEntity> sortedSubCategories() {
        List<CategoryEntity> L0;
        List<CategoryEntity> list = this.subCategories;
        if (list != null) {
            L0 = CollectionsKt___CollectionsKt.L0(list);
            return L0;
        }
        return null;
    }
}
