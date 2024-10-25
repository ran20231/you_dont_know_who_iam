package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel", f = "FilterViewModel.kt", l = {204}, m = "hasData")
/* loaded from: classes2.dex */
public final class FilterViewModel$hasData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29448a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FilterViewModel<FD, FR, E> f29449b;

    /* renamed from: c  reason: collision with root package name */
    int f29450c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterViewModel$hasData$1(FilterViewModel<FD, FR, E> filterViewModel, a<? super FilterViewModel$hasData$1> aVar) {
        super(aVar);
        this.f29449b = filterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object z11;
        this.f29448a = obj;
        this.f29450c |= Integer.MIN_VALUE;
        z11 = this.f29449b.z(this);
        return z11;
    }
}
