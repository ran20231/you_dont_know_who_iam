package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {174, 176, 179, 180, 188, 191}, m = "retrieveAndDecoratePage")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$retrieveAndDecoratePage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28273a;

    /* renamed from: b  reason: collision with root package name */
    Object f28274b;

    /* renamed from: c  reason: collision with root package name */
    Object f28275c;

    /* renamed from: d  reason: collision with root package name */
    Object f28276d;

    /* renamed from: e  reason: collision with root package name */
    Object f28277e;

    /* renamed from: f  reason: collision with root package name */
    int f28278f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f28279g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28280h;

    /* renamed from: i  reason: collision with root package name */
    int f28281i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$retrieveAndDecoratePage$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$retrieveAndDecoratePage$1> aVar) {
        super(aVar);
        this.f28280h = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28279g = obj;
        this.f28281i |= Integer.MIN_VALUE;
        return this.f28280h.t(0, this);
    }
}
