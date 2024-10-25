package com.forsale.app.utils.location;

import com.google.android.gms.location.LocationRequest;
import g00.a;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationUpdatesLiveData.kt */
/* loaded from: classes3.dex */
public final class LocationUpdatesLiveData$locationRequest$2 extends Lambda implements a<LocationRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final LocationUpdatesLiveData$locationRequest$2 f40368a = new LocationUpdatesLiveData$locationRequest$2();

    LocationUpdatesLiveData$locationRequest$2() {
        super(0);
    }

    @Override // g00.a
    /* renamed from: b */
    public final LocationRequest invoke() {
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        create.setInterval(60000L);
        create.setFastestInterval(2000L);
        return create;
    }
}
