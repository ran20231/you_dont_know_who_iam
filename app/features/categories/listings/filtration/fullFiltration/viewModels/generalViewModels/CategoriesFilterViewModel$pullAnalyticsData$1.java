package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel", f = "CategoriesFilterViewModel.kt", l = {131}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29489a;

    /* renamed from: b  reason: collision with root package name */
    Object f29490b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29491c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29492d;

    /* renamed from: e  reason: collision with root package name */
    int f29493e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$pullAnalyticsData$1(CategoriesFilterViewModel categoriesFilterViewModel, a<? super CategoriesFilterViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29492d = categoriesFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29491c = obj;
        this.f29493e |= Integer.MIN_VALUE;
        return this.f29492d.N(this);
    }
}
