package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel", f = "CategoryListingsViewModel.kt", l = {599, 602, 607, 610}, m = "findAndPublishCategoryDisplayViewModels")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$findAndPublishCategoryDisplayViewModels$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28491a;

    /* renamed from: b  reason: collision with root package name */
    Object f28492b;

    /* renamed from: c  reason: collision with root package name */
    Object f28493c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f28494d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28495e;

    /* renamed from: f  reason: collision with root package name */
    int f28496f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$findAndPublishCategoryDisplayViewModels$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$findAndPublishCategoryDisplayViewModels$1> aVar) {
        super(aVar);
        this.f28495e = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28494d = obj;
        this.f28496f |= Integer.MIN_VALUE;
        return this.f28495e.X1(null, this);
    }
}
