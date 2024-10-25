package com.forsale.app.datalayer.repositories;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import g00.l;
import g00.p;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.LocationRepository$retrieveLastKnownLocation$2", f = "LocationRepository.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationRepository$retrieveLastKnownLocation$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Pair<? extends Double, ? extends Double>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepository$retrieveLastKnownLocation$2(LocationRepository locationRepository, zz.a<? super LocationRepository$retrieveLastKnownLocation$2> aVar) {
        super(2, aVar);
        this.this$0 = locationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationRepository$retrieveLastKnownLocation$2(this.this$0, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super Pair<? extends Double, ? extends Double>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super Pair<Double, Double>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        zz.a d11;
        Context context;
        Object f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                LocationRepository locationRepository = (LocationRepository) this.L$0;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            LocationRepository locationRepository2 = this.this$0;
            this.L$0 = locationRepository2;
            this.label = 1;
            d11 = IntrinsicsKt__IntrinsicsJvmKt.d(this);
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(d11, 1);
            cancellableContinuationImpl.initCancellability();
            context = locationRepository2.context;
            Task<Location> lastLocation = LocationServices.getFusedLocationProviderClient(context).getLastLocation();
            final l<Location, wz.p> lVar = new l<Location, wz.p>() { // from class: com.forsale.app.datalayer.repositories.LocationRepository$retrieveLastKnownLocation$2$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(Location location) {
                    invoke2(location);
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Location location) {
                    cancellableContinuationImpl.resumeWith(Result.b(location != null ? i.a(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())) : null));
                }
            };
            lastLocation.addOnSuccessListener(new OnSuccessListener(lVar) { // from class: com.forsale.app.datalayer.repositories.LocationRepository$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ l function;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    o.i(lVar, "function");
                    this.function = lVar;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj2) {
                    this.function.invoke(obj2);
                }
            });
            lastLocation.addOnFailureListener(new OnFailureListener() { // from class: com.forsale.app.datalayer.repositories.LocationRepository$retrieveLastKnownLocation$2$1$1$2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception it2) {
                    o.i(it2, "it");
                    CancellableContinuation<Pair<Double, Double>> cancellableContinuation = cancellableContinuationImpl;
                    Result.a aVar = Result.f61613b;
                    cancellableContinuation.resumeWith(Result.b(f.a(it2)));
                }
            });
            lastLocation.addOnCanceledListener(new OnCanceledListener() { // from class: com.forsale.app.datalayer.repositories.LocationRepository$retrieveLastKnownLocation$2$1$1$3
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                }
            });
            obj = cancellableContinuationImpl.getResult();
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (obj == f12) {
                kotlin.coroutines.jvm.internal.f.c(this);
            }
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super Pair<Double, Double>> aVar) {
        return ((LocationRepository$retrieveLastKnownLocation$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
