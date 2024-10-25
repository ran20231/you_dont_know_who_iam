package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {141, 143, 144, 145, 158, 162, 153}, m = "retrieveAndDecorateInitPage")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$retrieveAndDecorateInitPage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28261a;

    /* renamed from: b  reason: collision with root package name */
    Object f28262b;

    /* renamed from: c  reason: collision with root package name */
    Object f28263c;

    /* renamed from: d  reason: collision with root package name */
    Object f28264d;

    /* renamed from: e  reason: collision with root package name */
    Object f28265e;

    /* renamed from: f  reason: collision with root package name */
    Object f28266f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f28267g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28268h;

    /* renamed from: i  reason: collision with root package name */
    int f28269i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$retrieveAndDecorateInitPage$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$retrieveAndDecorateInitPage$1> aVar) {
        super(aVar);
        this.f28268h = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28267g = obj;
        this.f28269i |= Integer.MIN_VALUE;
        return this.f28268h.s(this);
    }
}
