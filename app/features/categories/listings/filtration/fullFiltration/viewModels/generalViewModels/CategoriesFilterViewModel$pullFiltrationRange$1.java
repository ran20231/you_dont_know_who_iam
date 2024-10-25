package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.CategoriesFilterViewModel", f = "CategoriesFilterViewModel.kt", l = {52}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class CategoriesFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29494a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoriesFilterViewModel f29495b;

    /* renamed from: c  reason: collision with root package name */
    int f29496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesFilterViewModel$pullFiltrationRange$1(CategoriesFilterViewModel categoriesFilterViewModel, a<? super CategoriesFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29495b = categoriesFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29494a = obj;
        this.f29496c |= Integer.MIN_VALUE;
        return this.f29495b.S(this);
    }
}
