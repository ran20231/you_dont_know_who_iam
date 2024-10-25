package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel", f = "LocationFilterViewModel.kt", l = {45}, m = "mapFromDataToSelectedView")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$mapFromDataToSelectedView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29512a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29513b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29514c;

    /* renamed from: d  reason: collision with root package name */
    int f29515d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$mapFromDataToSelectedView$1(LocationFilterViewModel locationFilterViewModel, a<? super LocationFilterViewModel$mapFromDataToSelectedView$1> aVar) {
        super(aVar);
        this.f29514c = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29513b = obj;
        this.f29515d |= Integer.MIN_VALUE;
        return this.f29514c.H(null, this);
    }
}
