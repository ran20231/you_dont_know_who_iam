package com.forsale.app.features.categories.listings.category;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator", f = "CategoryListingsDecorator.kt", l = {243}, m = "purifyCategories")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$purifyCategories$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28257a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28258b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28259c;

    /* renamed from: d  reason: collision with root package name */
    int f28260d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$purifyCategories$1(CategoryListingsDecorator categoryListingsDecorator, zz.a<? super CategoryListingsDecorator$purifyCategories$1> aVar) {
        super(aVar);
        this.f28259c = categoryListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object V0;
        this.f28258b = obj;
        this.f28260d |= Integer.MIN_VALUE;
        V0 = this.f28259c.V0(null, this);
        return V0;
    }
}
