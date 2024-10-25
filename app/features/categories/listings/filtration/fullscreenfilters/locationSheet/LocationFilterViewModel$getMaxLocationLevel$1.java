package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel", f = "LocationFilterViewModel.kt", l = {97}, m = "getMaxLocationLevel")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$getMaxLocationLevel$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f29875a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29876b;

    /* renamed from: c  reason: collision with root package name */
    int f29877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$getMaxLocationLevel$1(LocationFilterViewModel locationFilterViewModel, zz.a<? super LocationFilterViewModel$getMaxLocationLevel$1> aVar) {
        super(aVar);
        this.f29876b = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29875a = obj;
        this.f29877c |= Integer.MIN_VALUE;
        return this.f29876b.L0(this);
    }
}
