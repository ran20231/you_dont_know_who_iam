package com.forsale.app.utils.facades.map;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.jvm.internal.Lambda;
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
final class PinMarker$markerOptions$2 extends Lambda implements g00.a<MarkerOptions> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LatLng f40190a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMarker$markerOptions$2(LatLng latLng) {
        super(0);
        this.f40190a = latLng;
    }

    @Override // g00.a
    /* renamed from: b */
    public final MarkerOptions invoke() {
        return new MarkerOptions().position(this.f40190a);
    }
}
