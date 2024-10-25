package com.forsale.app.utils.facades.map;

import androidx.lifecycle.LiveData;
import com.google.android.gms.maps.OnMapReadyCallback;
import kotlin.Pair;
/* compiled from: MapFacade.kt */
/* loaded from: classes3.dex */
public interface a extends OnMapReadyCallback {

    /* compiled from: MapFacade.kt */
    /* renamed from: com.forsale.app.utils.facades.map.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0458a {
        public static /* synthetic */ void a(a aVar, double d11, double d12, Float f11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    f11 = null;
                }
                aVar.d0(d11, d12, f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCoordinates");
        }
    }

    void d0(double d11, double d12, Float f11);

    LiveData<Pair<Double, Double>> p();

    void r(MarkerType markerType);
}
