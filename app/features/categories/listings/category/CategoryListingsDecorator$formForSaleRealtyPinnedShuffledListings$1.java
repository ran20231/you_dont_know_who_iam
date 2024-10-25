package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {273}, m = "formForSaleRealtyPinnedShuffledListings")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28157a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28158b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28159c;

    /* renamed from: d  reason: collision with root package name */
    int f28160d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1> aVar) {
        super(aVar);
        this.f28159c = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r02;
        this.f28158b = obj;
        this.f28160d |= Integer.MIN_VALUE;
        r02 = this.f28159c.r0(null, null, this);
        return r02;
    }
}
