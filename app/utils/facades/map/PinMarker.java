package com.forsale.app.utils.facades.map;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
public final class PinMarker extends XMarker<Marker> {

    /* renamed from: f  reason: collision with root package name */
    private final h f40189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMarker(LatLng latLng, Context ctx) {
        super(latLng, ctx, null);
        h a11;
        o.i(latLng, "latLng");
        o.i(ctx, "ctx");
        a11 = d.a(new PinMarker$markerOptions$2(latLng));
        this.f40189f = a11;
    }

    private final MarkerOptions g() {
        return (MarkerOptions) this.f40189f.getValue();
    }

    @Override // com.forsale.app.utils.facades.map.XMarker
    public XMarker<Marker> a(GoogleMap googleMap) {
        o.i(googleMap, "googleMap");
        Marker addMarker = googleMap.addMarker(g());
        if (addMarker != null) {
            d().set(addMarker);
        }
        return this;
    }

    @Override // com.forsale.app.utils.facades.map.XMarker
    public void f() {
        Marker marker = d().get();
        if (marker != null) {
            marker.remove();
        }
    }
}
