package com.forsale.app.ui.map;

import com.forsale.app.datalayer.repositories.LocationRepository;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationPickerViewModel.kt */
@d(c = "com.forsale.app.ui.map.LocationPickerViewModel$retrieveLastKnownLocation$1", f = "LocationPickerViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LocationPickerViewModel$retrieveLastKnownLocation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationPickerViewModel f39369b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPickerViewModel$retrieveLastKnownLocation$1(LocationPickerViewModel locationPickerViewModel, zz.a<? super LocationPickerViewModel$retrieveLastKnownLocation$1> aVar) {
        super(2, aVar);
        this.f39369b = locationPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationPickerViewModel$retrieveLastKnownLocation$1(this.f39369b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LocationRepository locationRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39368a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            locationRepository = this.f39369b.f39355k0;
            this.f39368a = 1;
            obj = locationRepository.retrieveLastKnownLocation(this);
            if (obj == f11) {
                return f11;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            this.f39369b.H0();
        } else {
            this.f39369b.J0(((Number) pair.c()).doubleValue(), ((Number) pair.d()).doubleValue());
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocationPickerViewModel$retrieveLastKnownLocation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
