package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {715}, m = "findGamDistrictTargetId")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$findGamDistrictTargetId$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28152a;

    /* renamed from: b  reason: collision with root package name */
    Object f28153b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f28154c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28155d;

    /* renamed from: e  reason: collision with root package name */
    int f28156e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$findGamDistrictTargetId$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$findGamDistrictTargetId$1> aVar) {
        super(aVar);
        this.f28155d = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p02;
        this.f28154c = obj;
        this.f28156e |= Integer.MIN_VALUE;
        p02 = this.f28155d.p0(null, null, this);
        return p02;
    }
}
