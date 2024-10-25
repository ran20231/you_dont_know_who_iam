package com.forsale.app.ui.mapcompose;

import com.forsale.app.ui.mapcompose.a;
import kotlin.jvm.internal.o;
import t9.q0;
/* compiled from: Marker.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final a a(boolean z11, MapSize mapSize) {
        a c0444a;
        double d11;
        float f11;
        int i11;
        o.i(mapSize, "mapSize");
        if (z11) {
            if (mapSize == MapSize.LARGE) {
                i11 = q0.f69743e1;
            } else {
                i11 = q0.f69747f1;
            }
            c0444a = new a.b(Integer.valueOf(i11));
        } else {
            MapSize mapSize2 = MapSize.LARGE;
            if (mapSize == mapSize2) {
                d11 = 300.0d;
            } else {
                d11 = 1000.0d;
            }
            if (mapSize == mapSize2) {
                f11 = 100.0f;
            } else {
                f11 = 50.0f;
            }
            c0444a = new a.C0444a(d11, null, null, null, f11, 14, null);
        }
        return c0444a;
    }

    public static /* synthetic */ a b(boolean z11, MapSize mapSize, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mapSize = MapSize.SMALL;
        }
        return a(z11, mapSize);
    }
}
