package com.forsale.app.ui.mapcompose;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.t1;
import com.forsale.app.ui.mapcompose.a;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.designSystem.buttons.ExtendedFABKt;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CircleKt;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapType;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import cq.f0;
import cq.s;
import e2.h;
import g00.l;
import g00.p;
import g00.q;
import h0.g;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import yj.d;
/* compiled from: MapPreview.kt */
/* loaded from: classes3.dex */
public final class MapPreviewKt {

    /* compiled from: MapPreview.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39425a;

        static {
            int[] iArr = new int[MapSize.values().length];
            try {
                iArr[MapSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39425a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final LatLng latLng, final a.C0444a c0444a, androidx.compose.runtime.a aVar, final int i11) {
        long y11;
        long y12;
        androidx.compose.runtime.a h11 = aVar.h(1460129937);
        if (c.I()) {
            c.U(1460129937, i11, -1, "com.forsale.app.ui.mapcompose.CustomCircle (MapPreview.kt:110)");
        }
        t1 a11 = c0444a.a();
        h11.C(-491131006);
        if (a11 == null) {
            y11 = dk.a.f54291a.a(h11, dk.a.f54292b).f().i(h11, d.f76453b);
        } else {
            y11 = a11.y();
        }
        long j11 = y11;
        h11.S();
        t1 c11 = c0444a.c();
        h11.C(-491130917);
        if (c11 == null) {
            y12 = t1.o(dk.a.f54291a.a(h11, dk.a.f54292b).f().i(h11, d.f76453b), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            y12 = c11.y();
        }
        h11.S();
        float d11 = c0444a.d();
        CircleKt.a(latLng, false, j11, c0444a.b(), y12, null, d11, null, false, 0.0f, null, h11, 8, 0, 1954);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$CustomCircle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MapPreviewKt.a(LatLng.this, c0444a, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final com.forsale.app.ui.mapcompose.a aVar, final LatLng latLng, g00.a<wz.p> aVar2, androidx.compose.runtime.a aVar3, final int i11, final int i12) {
        androidx.compose.runtime.a h11 = aVar3.h(91716171);
        if ((i12 & 4) != 0) {
            aVar2 = null;
        }
        if (c.I()) {
            c.U(91716171, i11, -1, "com.forsale.app.ui.mapcompose.CustomMarker (MapPreview.kt:96)");
        }
        if (aVar instanceof a.b) {
            h11.C(-434830323);
            c(latLng, (a.b) aVar, aVar2, h11, (i11 & 896) | 8, 0);
            h11.S();
        } else if (aVar instanceof a.C0444a) {
            h11.C(-434830171);
            a(latLng, (a.C0444a) aVar, h11, 72);
            h11.S();
        } else {
            h11.C(-434830137);
            h11.S();
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final g00.a<wz.p> aVar4 = aVar2;
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$CustomMarker$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    MapPreviewKt.b(a.this, latLng, aVar4, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final LatLng latLng, final a.b bVar, g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        final g00.a<wz.p> aVar3;
        BitmapDescriptor bitmapDescriptor;
        androidx.compose.runtime.a h11 = aVar2.h(-1889012482);
        if ((i12 & 4) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        if (c.I()) {
            c.U(-1889012482, i11, -1, "com.forsale.app.ui.mapcompose.CustomMarker (MapPreview.kt:124)");
        }
        Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        Integer a11 = bVar.a();
        if (a11 != null) {
            bitmapDescriptor = ContextExtensionsKt.d(context, a11.intValue());
        } else {
            bitmapDescriptor = null;
        }
        MarkerState markerState = new MarkerState(latLng);
        h11.C(1157296644);
        boolean T = h11.T(aVar3);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new l<Marker, Boolean>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$CustomMarker$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(Marker it2) {
                    o.i(it2, "it");
                    g00.a<wz.p> aVar4 = aVar3;
                    if (aVar4 != null) {
                        aVar4.invoke();
                    }
                    return Boolean.FALSE;
                }
            };
            h11.u(D);
        }
        h11.S();
        final g00.a<wz.p> aVar4 = aVar3;
        MarkerKt.a(markerState, 0.0f, 0L, false, false, bitmapDescriptor, 0L, 0.0f, null, null, null, false, 0.0f, (l) D, null, null, null, h11, MarkerState.f48388e | 262144, 0, 122846);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$CustomMarker$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    MapPreviewKt.c(LatLng.this, bVar, aVar4, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final LatLng latLng, final Context context, final w.c cVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-161467321);
        if (c.I()) {
            c.U(-161467321, i11, -1, "com.forsale.app.ui.mapcompose.LargeMapOptions (MapPreview.kt:191)");
        }
        float f11 = 16;
        ExtendedFABKt.a(PaddingKt.m(cVar.e(androidx.compose.ui.c.f7566a, v0.b.f74009a.c()), 0.0f, 0.0f, h.l(f11), h.l(f11), 3, null), new g00.a<wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$LargeMapOptions$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ContextExtensionsKt.D(context, latLng, 0.0f, null, 6, null);
            }
        }, 0L, null, g.e(false, 0.0f, 0L, h11, 0, 7), ComposableSingletons$MapPreviewKt.f39379a.c(), h11, 196608, 12);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$LargeMapOptions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MapPreviewKt.d(LatLng.this, context, cVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void e(final wh.a mapSettings, final androidx.compose.ui.c modifier, g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        o.i(mapSettings, "mapSettings");
        o.i(modifier, "modifier");
        androidx.compose.runtime.a h11 = aVar2.h(-2025044942);
        final g00.a<wz.p> aVar3 = (i12 & 4) != 0 ? null : aVar;
        if (c.I()) {
            c.U(-2025044942, i11, -1, "com.forsale.app.ui.mapcompose.MapPreview (MapPreview.kt:53)");
        }
        Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(new f0(false, false, false, false, false, false, false, false, false, false, 767, null), null, 2, null);
            h11.u(D);
        }
        h11.S();
        k0 k0Var = (k0) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(new s(false, false, false, false, null, null, MapType.NORMAL, 0.0f, 0.0f, 447, null), null, 2, null);
            h11.u(D2);
        }
        h11.S();
        k0 k0Var2 = (k0) D2;
        final LatLng latLng = new LatLng(mapSettings.a().latitude, mapSettings.a().longitude);
        h11.C(-1911106014);
        CameraPositionState cameraPositionState = (CameraPositionState) RememberSaveableKt.b(new Object[0], CameraPositionState.f48133h.a(), null, new g00.a<CameraPositionState>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$MapPreview$$inlined$rememberCameraPositionState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CameraPositionState invoke() {
                CameraPositionState cameraPositionState2 = new CameraPositionState(null, 1, null);
                CameraPosition fromLatLngZoom = CameraPosition.fromLatLngZoom(LatLng.this, mapSettings.d());
                o.h(fromLatLngZoom, "fromLatLngZoom(...)");
                cameraPositionState2.k(fromLatLngZoom);
                return cameraPositionState2;
            }
        }, h11, 72, 0);
        h11.S();
        v0.b e11 = v0.b.f74009a.e();
        int i13 = (i11 >> 3) & 14;
        int i14 = i13 | 48;
        h11.C(733328855);
        int i15 = i14 >> 3;
        a0 g11 = BoxKt.g(e11, false, h11, (i15 & 112) | (i15 & 14));
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(modifier);
        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a12);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a13 = Updater.a(h11);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i16 >> 3) & 112));
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        int i17 = ((i14 >> 6) & 112) | 6;
        final g00.a<wz.p> aVar4 = aVar3;
        GoogleMapKt.b(modifier, cameraPositionState, null, null, g(k0Var2), null, f(k0Var), null, new l<LatLng, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$MapPreview$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LatLng latLng2) {
                g00.a<wz.p> aVar5;
                o.i(latLng2, "latLng");
                if (wh.a.this.b() == MapSize.SMALL && (aVar5 = aVar3) != null) {
                    aVar5.invoke();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(LatLng latLng2) {
                b(latLng2);
                return wz.p.f75480a;
            }
        }, null, null, null, null, null, null, r0.b.b(h11, 1045346836, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$MapPreview$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar5, int i18) {
                if ((i18 & 11) == 2 && aVar5.i()) {
                    aVar5.L();
                    return;
                }
                if (c.I()) {
                    c.U(1045346836, i18, -1, "com.forsale.app.ui.mapcompose.MapPreview.<anonymous>.<anonymous> (MapPreview.kt:77)");
                }
                MapPreviewKt.b(wh.a.this.c(), latLng, aVar4, aVar5, (i11 & 896) | 64, 0);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                b(aVar5, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, i13 | (CameraPositionState.f48134i << 3) | (s.f53534j << 12) | (f0.f53486k << 18), 196608, 32428);
        int i18 = a.f39425a[mapSettings.b().ordinal()];
        if (i18 == 1) {
            h11.C(-1417437669);
            h(mapSettings.c(), boxScopeInstance, aVar4, h11, ((i17 << 3) & 112) | (i11 & 896), 0);
            h11.S();
        } else if (i18 != 2) {
            h11.C(-1417437366);
            h11.S();
        } else {
            h11.C(-1417437549);
            if (mapSettings.c() instanceof a.b) {
                d(mapSettings.a(), context, boxScopeInstance, h11, ((i17 << 6) & 896) | 72);
            }
            h11.S();
        }
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.ui.mapcompose.MapPreviewKt$MapPreview$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar5, int i19) {
                MapPreviewKt.e(wh.a.this, modifier, aVar4, aVar5, v0.a(i11 | 1), i12);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                b(aVar5, num.intValue());
                return wz.p.f75480a;
            }
        });
    }

    private static final f0 f(k0<f0> k0Var) {
        return k0Var.getValue();
    }

    private static final s g(k0<s> k0Var) {
        return k0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final com.forsale.app.ui.mapcompose.a r28, final w.c r29, g00.a<wz.p> r30, androidx.compose.runtime.a r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.mapcompose.MapPreviewKt.h(com.forsale.app.ui.mapcompose.a, w.c, g00.a, androidx.compose.runtime.a, int, int):void");
    }
}
