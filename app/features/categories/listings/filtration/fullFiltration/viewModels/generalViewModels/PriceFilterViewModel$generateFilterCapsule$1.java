package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PriceFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel", f = "PriceFilterViewModel.kt", l = {114}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class PriceFilterViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29554a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PriceFilterViewModel f29556c;

    /* renamed from: d  reason: collision with root package name */
    int f29557d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceFilterViewModel$generateFilterCapsule$1(PriceFilterViewModel priceFilterViewModel, a<? super PriceFilterViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29556c = priceFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29555b = obj;
        this.f29557d |= Integer.MIN_VALUE;
        return this.f29556c.j(this);
    }
}
