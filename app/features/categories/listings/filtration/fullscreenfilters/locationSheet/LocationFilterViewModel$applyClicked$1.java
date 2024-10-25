package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.a;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fc.c;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$applyClicked$1", f = "LocationFilterViewModel.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 112}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$applyClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29870a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$applyClicked$1(LocationFilterViewModel locationFilterViewModel, zz.a<? super LocationFilterViewModel$applyClicked$1> aVar) {
        super(2, aVar);
        this.f29871b = locationFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationFilterViewModel$applyClicked$1(this.f29871b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object D0;
        a.b X0;
        int y11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29870a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            this.f29871b.P0().setValue(kotlin.coroutines.jvm.internal.a.a(false));
            this.f29871b.Z0();
            LocationFilterViewModel locationFilterViewModel = this.f29871b;
            this.f29870a = 1;
            D0 = locationFilterViewModel.D0(locationFilterViewModel.S0().getValue(), this);
            if (D0 == f11) {
                return f11;
            }
        }
        X0 = this.f29871b.X0();
        MutableSharedFlow<LocationFilterViewModel.a> I0 = this.f29871b.I0();
        List<LocationTreeNode> value = this.f29871b.S0().getValue();
        y11 = s.y(value, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (LocationTreeNode locationTreeNode : value) {
            arrayList.add(kotlin.coroutines.jvm.internal.a.d(locationTreeNode.i().e()));
        }
        LocationFilterViewModel.a.C0331a c0331a = new LocationFilterViewModel.a.C0331a(new c.a(arrayList, X0));
        this.f29870a = 2;
        if (I0.emit(c0331a, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocationFilterViewModel$applyClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
