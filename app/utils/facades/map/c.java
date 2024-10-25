package com.forsale.app.utils.facades.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements GoogleMap.OnMapClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapFacadeImpl f40199a;

    public /* synthetic */ c(MapFacadeImpl mapFacadeImpl) {
        this.f40199a = mapFacadeImpl;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
    public final void onMapClick(LatLng latLng) {
        MapFacadeImpl$onMapReady$1$3.b(this.f40199a, latLng);
    }
}
