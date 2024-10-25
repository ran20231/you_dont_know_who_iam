package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {726}, m = "getFiltrationDistricts")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$getFiltrationDistricts$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f28201a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28202b;

    /* renamed from: c  reason: collision with root package name */
    int f28203c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$getFiltrationDistricts$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$getFiltrationDistricts$1> aVar) {
        super(aVar);
        this.f28202b = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B0;
        this.f28201a = obj;
        this.f28203c |= Integer.MIN_VALUE;
        B0 = this.f28202b.B0(this);
        return B0;
    }
}
