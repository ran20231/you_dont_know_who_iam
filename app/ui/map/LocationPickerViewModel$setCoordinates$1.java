package com.forsale.app.ui.map;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.LocationRepository;
import g00.p;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationPickerViewModel.kt */
@d(c = "com.forsale.app.ui.map.LocationPickerViewModel$setCoordinates$1", f = "LocationPickerViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LocationPickerViewModel$setCoordinates$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39370a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationPickerViewModel f39371b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f39372c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f39373d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPickerViewModel$setCoordinates$1(LocationPickerViewModel locationPickerViewModel, double d11, double d12, zz.a<? super LocationPickerViewModel$setCoordinates$1> aVar) {
        super(2, aVar);
        this.f39371b = locationPickerViewModel;
        this.f39372c = d11;
        this.f39373d = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationPickerViewModel$setCoordinates$1(this.f39371b, this.f39372c, this.f39373d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LocationRepository locationRepository;
        b0 b0Var;
        List list;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39370a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            locationRepository = this.f39371b.f39355k0;
            double d11 = this.f39372c;
            double d12 = this.f39373d;
            this.f39370a = 1;
            obj = locationRepository.retrieveAddress(d11, d12, this);
            if (obj == f11) {
                return f11;
            }
        }
        String str = (String) obj;
        b0Var = this.f39371b.f39360p0;
        if (str != null) {
            list = q.e(str);
        } else {
            list = null;
        }
        b0Var.postValue(list);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocationPickerViewModel$setCoordinates$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
