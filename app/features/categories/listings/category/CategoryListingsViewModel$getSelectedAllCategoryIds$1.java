package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel", f = "CategoryListingsViewModel.kt", l = {685}, m = "getSelectedAllCategoryIds")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$getSelectedAllCategoryIds$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f28500a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28501b;

    /* renamed from: c  reason: collision with root package name */
    int f28502c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$getSelectedAllCategoryIds$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$getSelectedAllCategoryIds$1> aVar) {
        super(aVar);
        this.f28501b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object J2;
        this.f28500a = obj;
        this.f28502c |= Integer.MIN_VALUE;
        J2 = this.f28501b.J2(this);
        return J2;
    }
}
