package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel", f = "LocationFilterViewModel.kt", l = {121}, m = "pullAnalyticsData")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$pullAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29516a;

    /* renamed from: b  reason: collision with root package name */
    Object f29517b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29518c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29519d;

    /* renamed from: e  reason: collision with root package name */
    int f29520e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$pullAnalyticsData$1(LocationFilterViewModel locationFilterViewModel, a<? super LocationFilterViewModel$pullAnalyticsData$1> aVar) {
        super(aVar);
        this.f29519d = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29518c = obj;
        this.f29520e |= Integer.MIN_VALUE;
        return this.f29519d.N(this);
    }
}
