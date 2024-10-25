package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel", f = "LocationFilterViewModel.kt", l = {53}, m = "pullFiltrationRange")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$pullFiltrationRange$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29521a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29522b;

    /* renamed from: c  reason: collision with root package name */
    int f29523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$pullFiltrationRange$1(LocationFilterViewModel locationFilterViewModel, a<? super LocationFilterViewModel$pullFiltrationRange$1> aVar) {
        super(aVar);
        this.f29522b = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29521a = obj;
        this.f29523c |= Integer.MIN_VALUE;
        return this.f29522b.S(this);
    }
}
