package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {790, 792}, m = "pullAnalyticsFilters")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$pullAnalyticsFilters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28249a;

    /* renamed from: b  reason: collision with root package name */
    Object f28250b;

    /* renamed from: c  reason: collision with root package name */
    Object f28251c;

    /* renamed from: d  reason: collision with root package name */
    boolean f28252d;

    /* renamed from: e  reason: collision with root package name */
    boolean f28253e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f28254f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28255g;

    /* renamed from: h  reason: collision with root package name */
    int f28256h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$pullAnalyticsFilters$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$pullAnalyticsFilters$1> aVar) {
        super(aVar);
        this.f28255g = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28254f = obj;
        this.f28256h |= Integer.MIN_VALUE;
        return this.f28255g.T0(false, false, this);
    }
}
