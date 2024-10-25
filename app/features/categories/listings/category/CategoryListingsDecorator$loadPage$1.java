package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {224, 219}, m = "loadPage")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$loadPage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28215a;

    /* renamed from: b  reason: collision with root package name */
    Object f28216b;

    /* renamed from: c  reason: collision with root package name */
    Object f28217c;

    /* renamed from: d  reason: collision with root package name */
    Object f28218d;

    /* renamed from: e  reason: collision with root package name */
    Object f28219e;

    /* renamed from: f  reason: collision with root package name */
    int f28220f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f28221g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28222h;

    /* renamed from: i  reason: collision with root package name */
    int f28223i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$loadPage$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$loadPage$1> aVar) {
        super(aVar);
        this.f28222h = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O0;
        this.f28221g = obj;
        this.f28223i |= Integer.MIN_VALUE;
        O0 = this.f28222h.O0(0, null, this);
        return O0;
    }
}
