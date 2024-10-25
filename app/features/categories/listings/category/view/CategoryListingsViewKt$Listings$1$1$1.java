package com.forsale.app.features.categories.listings.category.view;

import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.l;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsView.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsViewKt$Listings$1$1$1 extends AdaptedFunctionReference implements l<SortingStates, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsViewKt$Listings$1$1$1(Object obj) {
        super(1, obj, CategoryListingsViewModel.class, "onSortingButtonClicked", "onSortingButtonClicked(Lcom/forsale/app/features/categories/listings/SortingStates;)Lkotlinx/coroutines/Job;", 8);
    }

    public final void b(SortingStates p02) {
        o.i(p02, "p0");
        ((CategoryListingsViewModel) this.f61766a).n3(p02);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(SortingStates sortingStates) {
        b(sortingStates);
        return p.f75480a;
    }
}
