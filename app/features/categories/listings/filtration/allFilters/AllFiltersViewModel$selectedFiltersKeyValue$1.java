package com.forsale.app.features.categories.listings.filtration.allFilters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel", f = "AllFiltersViewModel.kt", l = {157}, m = "selectedFiltersKeyValue")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$selectedFiltersKeyValue$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29042a;

    /* renamed from: b  reason: collision with root package name */
    Object f29043b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29044c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29045d;

    /* renamed from: e  reason: collision with root package name */
    int f29046e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$selectedFiltersKeyValue$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$selectedFiltersKeyValue$1> aVar) {
        super(aVar);
        this.f29045d = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object R0;
        this.f29044c = obj;
        this.f29046e |= Integer.MIN_VALUE;
        R0 = this.f29045d.R0(this);
        return R0;
    }
}
