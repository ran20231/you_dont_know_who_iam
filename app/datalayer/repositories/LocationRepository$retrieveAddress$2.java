package com.forsale.app.datalayer.repositories;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import g00.p;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import m00.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.LocationRepository$retrieveAddress$2", f = "LocationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationRepository$retrieveAddress$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super String>, Object> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    int label;
    final /* synthetic */ LocationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepository$retrieveAddress$2(double d11, double d12, LocationRepository locationRepository, zz.a<? super LocationRepository$retrieveAddress$2> aVar) {
        super(2, aVar);
        this.$latitude = d11;
        this.$longitude = d12;
        this.this$0 = locationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationRepository$retrieveAddress$2(this.$latitude, this.$longitude, this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object m02;
        String t02;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            double d11 = this.$latitude;
            if (d11 < -90.0d || d11 > 90.0d) {
                return null;
            }
            double d12 = this.$longitude;
            if (d12 >= -180.0d && d12 <= 180.0d && Geocoder.isPresent()) {
                context = this.this$0.context;
                List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(this.$latitude, this.$longitude, 1);
                if (fromLocation != null) {
                    m02 = CollectionsKt___CollectionsKt.m0(fromLocation);
                    Address address = (Address) m02;
                    if (address != null) {
                        t02 = CollectionsKt___CollectionsKt.t0(new i(0, address.getMaxAddressLineIndex()), ", ", null, null, 0, null, new LocationRepository$retrieveAddress$2$1$1(address), 30, null);
                        return t02;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super String> aVar) {
        return ((LocationRepository$retrieveAddress$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
