package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel", f = "CategoryListingsViewModel.kt", l = {689, 689}, m = "getSelectedAllDistrictIds")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$getSelectedAllDistrictIds$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f28503a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28504b;

    /* renamed from: c  reason: collision with root package name */
    int f28505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$getSelectedAllDistrictIds$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$getSelectedAllDistrictIds$1> aVar) {
        super(aVar);
        this.f28504b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28503a = obj;
        this.f28505c |= Integer.MIN_VALUE;
        return this.f28504b.K2(this);
    }
}
