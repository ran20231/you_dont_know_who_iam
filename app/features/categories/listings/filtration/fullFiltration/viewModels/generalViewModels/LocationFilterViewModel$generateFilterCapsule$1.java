package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.LocationFilterViewModel", f = "LocationFilterViewModel.kt", l = {98, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "generateFilterCapsule")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$generateFilterCapsule$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29507a;

    /* renamed from: b  reason: collision with root package name */
    Object f29508b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29509c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29510d;

    /* renamed from: e  reason: collision with root package name */
    int f29511e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$generateFilterCapsule$1(LocationFilterViewModel locationFilterViewModel, a<? super LocationFilterViewModel$generateFilterCapsule$1> aVar) {
        super(aVar);
        this.f29510d = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29509c = obj;
        this.f29511e |= Integer.MIN_VALUE;
        return this.f29510d.j(this);
    }
}
