package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {812, 814}, m = "getFilterNames")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$getFilterNames$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28196a;

    /* renamed from: b  reason: collision with root package name */
    Object f28197b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f28198c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28199d;

    /* renamed from: e  reason: collision with root package name */
    int f28200e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$getFilterNames$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$getFilterNames$1> aVar) {
        super(aVar);
        this.f28199d = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y02;
        this.f28198c = obj;
        this.f28200e |= Integer.MIN_VALUE;
        y02 = this.f28199d.y0(this);
        return y02;
    }
}
