package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {290}, m = "formPinnedAndPinnedShuffledListings")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28188a;

    /* renamed from: b  reason: collision with root package name */
    Object f28189b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f28190c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28191d;

    /* renamed from: e  reason: collision with root package name */
    int f28192e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1> aVar) {
        super(aVar);
        this.f28191d = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object v02;
        this.f28190c = obj;
        this.f28192e |= Integer.MIN_VALUE;
        v02 = this.f28191d.v0(null, null, this);
        return v02;
    }
}
