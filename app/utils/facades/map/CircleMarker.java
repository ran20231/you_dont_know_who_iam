package com.forsale.app.utils.facades.map;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
public final class CircleMarker extends XMarker<Circle> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40163g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f40164h = 8;

    /* renamed from: f  reason: collision with root package name */
    private final h f40165f;

    /* compiled from: XMarker.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleMarker(LatLng latLng, Context ctx) {
        super(latLng, ctx, null);
        h a11;
        o.i(latLng, "latLng");
        o.i(ctx, "ctx");
        a11 = d.a(new CircleMarker$circleOptions$2(latLng, ctx));
        this.f40165f = a11;
    }

    private final CircleOptions g() {
        return (CircleOptions) this.f40165f.getValue();
    }

    @Override // com.forsale.app.utils.facades.map.XMarker
    public XMarker<Circle> a(GoogleMap googleMap) {
        o.i(googleMap, "googleMap");
        Circle addCircle = googleMap.addCircle(g());
        if (addCircle != null) {
            d().set(addCircle);
        }
        return this;
    }

    @Override // com.forsale.app.utils.facades.map.XMarker
    public void f() {
        Circle circle = d().get();
        if (circle != null) {
            circle.remove();
        }
    }
}
