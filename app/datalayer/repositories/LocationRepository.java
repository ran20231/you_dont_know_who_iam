package com.forsale.app.datalayer.repositories;

import android.content.Context;
import com.forsale.app.utils.location.LocationUpdatesLiveData;
import kotlin.Pair;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import wz.h;
/* compiled from: LocationRepository.kt */
/* loaded from: classes2.dex */
public final class LocationRepository {
    private static final String CACHED_LAT = "cached_lat";
    private static final String CACHED_LONG = "cached_long";
    private static final double LATITUDE_MAX = 90.0d;
    private static final double LATITUDE_MIN = -90.0d;
    private static final double LONGITUDE_MAX = 180.0d;
    private static final double LONGITUDE_MIN = -180.0d;
    private final Context context;
    private final h locationUpdatesLiveData$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LocationRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocationRepository(Context context) {
        h a11;
        o.i(context, "context");
        this.context = context;
        a11 = d.a(new g00.a<LocationUpdatesLiveData>() { // from class: com.forsale.app.datalayer.repositories.LocationRepository$locationUpdatesLiveData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final LocationUpdatesLiveData invoke() {
                Context context2;
                context2 = LocationRepository.this.context;
                return new LocationUpdatesLiveData(context2, true);
            }
        });
        this.locationUpdatesLiveData$delegate = a11;
    }

    public final LocationUpdatesLiveData getLocationUpdatesLiveData() {
        return (LocationUpdatesLiveData) this.locationUpdatesLiveData$delegate.getValue();
    }

    public final Object retrieveAddress(double d11, double d12, zz.a<? super String> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LocationRepository$retrieveAddress$2(d11, d12, this, null), aVar);
    }

    public final Object retrieveLastKnownLocation(zz.a<? super Pair<Double, Double>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LocationRepository$retrieveLastKnownLocation$2(this, null), aVar);
    }
}
