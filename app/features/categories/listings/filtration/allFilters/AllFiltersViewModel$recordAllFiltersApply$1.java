package com.forsale.app.features.categories.listings.filtration.allFilters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel", f = "AllFiltersViewModel.kt", l = {152, 152}, m = "recordAllFiltersApply")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$recordAllFiltersApply$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29030a;

    /* renamed from: b  reason: collision with root package name */
    int f29031b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29032c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29033d;

    /* renamed from: e  reason: collision with root package name */
    int f29034e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$recordAllFiltersApply$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$recordAllFiltersApply$1> aVar) {
        super(aVar);
        this.f29033d = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object N0;
        this.f29032c = obj;
        this.f29034e |= Integer.MIN_VALUE;
        N0 = this.f29033d.N0(this);
        return N0;
    }
}
