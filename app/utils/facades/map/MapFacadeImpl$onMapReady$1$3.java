package com.forsale.app.utils.facades.map;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: MapFacadeImpl.kt */
/* loaded from: classes3.dex */
final class MapFacadeImpl$onMapReady$1$3 extends Lambda implements g00.a<p> {

    /* renamed from: a */
    final /* synthetic */ MapFacadeImpl f40186a;

    /* renamed from: b */
    final /* synthetic */ GoogleMap f40187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl$onMapReady$1$3(MapFacadeImpl mapFacadeImpl, GoogleMap googleMap) {
        super(0);
        this.f40186a = mapFacadeImpl;
        this.f40187b = googleMap;
    }

    public static final void c(MapFacadeImpl this$0, LatLng it2) {
        g00.a aVar;
        o.i(this$0, "this$0");
        o.i(it2, "it");
        aVar = this$0.f40177j;
        aVar.invoke();
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        Context context;
        context = this.f40186a.f40174g;
        if (context == null) {
            o.w("appContext");
            context = null;
        }
        MapsInitializer.initialize(context);
        this.f40187b.setOnMapClickListener(new c(this.f40186a));
    }
}
