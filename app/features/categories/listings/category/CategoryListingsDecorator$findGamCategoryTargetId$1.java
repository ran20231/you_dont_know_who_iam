package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {701, 703}, m = "findGamCategoryTargetId")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$findGamCategoryTargetId$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28146a;

    /* renamed from: b  reason: collision with root package name */
    Object f28147b;

    /* renamed from: c  reason: collision with root package name */
    int f28148c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f28149d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28150e;

    /* renamed from: f  reason: collision with root package name */
    int f28151f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$findGamCategoryTargetId$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$findGamCategoryTargetId$1> aVar) {
        super(aVar);
        this.f28150e = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o02;
        this.f28149d = obj;
        this.f28151f |= Integer.MIN_VALUE;
        o02 = this.f28150e.o0(0, null, this);
        return o02;
    }
}
