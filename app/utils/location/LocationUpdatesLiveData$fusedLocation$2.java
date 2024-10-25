package com.forsale.app.utils.location;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import g00.a;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationUpdatesLiveData.kt */
/* loaded from: classes3.dex */
public final class LocationUpdatesLiveData$fusedLocation$2 extends Lambda implements a<FusedLocationProviderClient> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f40365a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationUpdatesLiveData$fusedLocation$2(Context context) {
        super(0);
        this.f40365a = context;
    }

    @Override // g00.a
    /* renamed from: b */
    public final FusedLocationProviderClient invoke() {
        return LocationServices.getFusedLocationProviderClient(this.f40365a);
    }
}
