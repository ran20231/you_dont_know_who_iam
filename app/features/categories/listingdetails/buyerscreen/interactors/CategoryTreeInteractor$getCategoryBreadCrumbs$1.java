package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryTreeInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor", f = "CategoryTreeInteractor.kt", l = {16, 19}, m = "getCategoryBreadCrumbs")
/* loaded from: classes2.dex */
public final class CategoryTreeInteractor$getCategoryBreadCrumbs$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25878a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25879b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryTreeInteractor f25880c;

    /* renamed from: d  reason: collision with root package name */
    int f25881d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryTreeInteractor$getCategoryBreadCrumbs$1(CategoryTreeInteractor categoryTreeInteractor, zz.a<? super CategoryTreeInteractor$getCategoryBreadCrumbs$1> aVar) {
        super(aVar);
        this.f25880c = categoryTreeInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25879b = obj;
        this.f25881d |= Integer.MIN_VALUE;
        return this.f25880c.a(0, this);
    }
}
