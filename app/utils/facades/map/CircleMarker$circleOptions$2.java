package com.forsale.app.utils.facades.map;

import android.content.Context;
import com.forsale.app.utils.ContextExtensionsKt;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.Lambda;
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
final class CircleMarker$circleOptions$2 extends Lambda implements g00.a<CircleOptions> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LatLng f40166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f40167b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleMarker$circleOptions$2(LatLng latLng, Context context) {
        super(0);
        this.f40166a = latLng;
        this.f40167b = context;
    }

    @Override // g00.a
    /* renamed from: b */
    public final CircleOptions invoke() {
        return new CircleOptions().center(this.f40166a).radius(700.0d).fillColor(ContextExtensionsKt.i(this.f40167b, sj.c.J, 64)).strokeColor(ContextExtensionsKt.j(this.f40167b, sj.c.J, 0, 2, null));
    }
}
