package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {587, 588}, m = "buildListingViewModelAsync")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$buildListingViewModelAsync$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28117a;

    /* renamed from: b  reason: collision with root package name */
    Object f28118b;

    /* renamed from: c  reason: collision with root package name */
    Object f28119c;

    /* renamed from: d  reason: collision with root package name */
    Object f28120d;

    /* renamed from: e  reason: collision with root package name */
    int f28121e;

    /* renamed from: f  reason: collision with root package name */
    int f28122f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f28123g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28124h;

    /* renamed from: i  reason: collision with root package name */
    int f28125i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$buildListingViewModelAsync$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$buildListingViewModelAsync$1> aVar) {
        super(aVar);
        this.f28124h = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28123g = obj;
        this.f28125i |= Integer.MIN_VALUE;
        return this.f28124h.f(null, null, null, 0, 0, null, this);
    }
}
