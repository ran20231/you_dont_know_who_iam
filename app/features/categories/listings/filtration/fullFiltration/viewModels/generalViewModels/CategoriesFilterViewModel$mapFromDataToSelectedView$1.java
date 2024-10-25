package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel", f = "CategoriesFilterViewModel.kt", l = {59}, m = "mapFromDataToSelectedView")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$mapFromDataToSelectedView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29485a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29486b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29487c;

    /* renamed from: d  reason: collision with root package name */
    int f29488d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$mapFromDataToSelectedView$1(CategoriesFilterViewModel categoriesFilterViewModel, a<? super CategoriesFilterViewModel$mapFromDataToSelectedView$1> aVar) {
        super(aVar);
        this.f29487c = categoriesFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29486b = obj;
        this.f29488d |= Integer.MIN_VALUE;
        return this.f29487c.H(null, this);
    }
}
