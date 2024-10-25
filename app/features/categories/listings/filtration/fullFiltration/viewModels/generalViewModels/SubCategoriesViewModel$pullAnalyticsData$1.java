package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.SubCategoriesViewModel", f = "SubCategoriesViewModel.kt", l = {172}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29615a;

    /* renamed from: b  reason: collision with root package name */
    Object f29616b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29617c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f29618d;

    /* renamed from: e  reason: collision with root package name */
    int f29619e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$pullAnalyticsData$1(SubCategoriesViewModel subCategoriesViewModel, a<? super SubCategoriesViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29618d = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29617c = obj;
        this.f29619e |= Integer.MIN_VALUE;
        return this.f29618d.N(this);
    }
}
