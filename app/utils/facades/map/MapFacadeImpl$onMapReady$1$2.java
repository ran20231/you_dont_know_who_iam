package com.forsale.app.utils.facades.map;

import com.forsale.app.utils.facades.map.a;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: MapFacadeImpl.kt */
/* loaded from: classes3.dex */
final class MapFacadeImpl$onMapReady$1$2 extends Lambda implements g00.a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GoogleMap f40184a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MapFacadeImpl f40185b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl$onMapReady$1$2(GoogleMap googleMap, MapFacadeImpl mapFacadeImpl) {
        super(0);
        this.f40184a = googleMap;
        this.f40185b = mapFacadeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MapFacadeImpl this$0, LatLng it2) {
        o.i(this$0, "this$0");
        o.i(it2, "it");
        a.C0458a.a(this$0, it2.latitude, it2.longitude, null, 4, null);
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.f40184a.setOnMapClickListener(new b(this.f40185b));
    }
}
