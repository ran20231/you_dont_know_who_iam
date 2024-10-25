package com.forsale.app.utils.facades.map;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.MapView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: MapFacadeImpl.kt */
/* loaded from: classes3.dex */
final class MapFacadeImpl$onCreate$2 extends Lambda implements g00.a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MapFacadeImpl f40183a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl$onCreate$2(MapFacadeImpl mapFacadeImpl) {
        super(0);
        this.f40183a = mapFacadeImpl;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view;
        int i11;
        view = this.f40183a.f40176i;
        if (view == null) {
            o.w("rootView");
            view = null;
        }
        i11 = this.f40183a.f40168a;
        MapView mapView = (MapView) view.findViewById(i11);
        if (mapView != null) {
            MapFacadeImpl mapFacadeImpl = this.f40183a;
            Context applicationContext = mapView.getContext().getApplicationContext();
            o.h(applicationContext, "getApplicationContext(...)");
            mapFacadeImpl.f40174g = applicationContext;
            mapView.onCreate(null);
            mapView.getMapAsync(this.f40183a);
        }
    }
}
