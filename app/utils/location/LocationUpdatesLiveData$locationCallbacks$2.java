package com.forsale.app.utils.location;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationUpdatesLiveData.kt */
/* loaded from: classes3.dex */
public final class LocationUpdatesLiveData$locationCallbacks$2 extends Lambda implements g00.a<a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LocationUpdatesLiveData f40366a;

    /* compiled from: LocationUpdatesLiveData.kt */
    /* loaded from: classes3.dex */
    public static final class a extends LocationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationUpdatesLiveData f40367a;

        a(LocationUpdatesLiveData locationUpdatesLiveData) {
            this.f40367a = locationUpdatesLiveData;
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            o.i(locationResult, "locationResult");
            Location lastLocation = locationResult.getLastLocation();
            if (lastLocation != null) {
                this.f40367a.postValue(i.a(Double.valueOf(lastLocation.getLatitude()), Double.valueOf(lastLocation.getLongitude())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationUpdatesLiveData$locationCallbacks$2(LocationUpdatesLiveData locationUpdatesLiveData) {
        super(0);
        this.f40366a = locationUpdatesLiveData;
    }

    @Override // g00.a
    /* renamed from: b */
    public final a invoke() {
        return new a(this.f40366a);
    }
}
