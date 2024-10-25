package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.f0;
import androidx.compose.ui.input.pointer.m0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import e2.r;
import e2.s;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ZoomableImage.kt */
/* loaded from: classes2.dex */
public final class ZoomableImageKt {
    public static final void a(final Painter painter, float f11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final float f12;
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(-201842689);
        if ((i12 & 2) != 0) {
            f12 = 3.0f;
        } else {
            f12 = f11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-201842689, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImage (ZoomableImage.kt:54)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(Float.valueOf(1.0f), null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(a1.f.d(a1.f.f62b.c()), null, 2, null);
            h11.u(D2);
        }
        h11.S();
        final k0 k0Var2 = (k0) D2;
        h11.C(-492369756);
        Object D3 = h11.D();
        if (D3 == c0064a.a()) {
            D3 = c0.e(r.b(r.f54578b.a()), null, 2, null);
            h11.u(D3);
        }
        h11.S();
        final k0 k0Var3 = (k0) D3;
        ((e2.d) h11.q(CompositionLocalsKt.e())).getDensity();
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c b11 = y0.e.b(SizeKt.f(aVar2, 0.0f, 1, null));
        h11.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
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
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        boolean z11 = true;
        androidx.compose.ui.c f13 = SizeKt.f(aVar2, 0.0f, 1, null);
        if (b(k0Var) <= 1.0f) {
            z11 = false;
        }
        Boolean valueOf = Boolean.valueOf(z11);
        h11.C(511388516);
        boolean T = h11.T(k0Var) | h11.T(k0Var2);
        Object D4 = h11.D();
        if (T || D4 == c0064a.a()) {
            D4 = new ZoomableImageKt$ZoomableImage$1$1$1(k0Var, k0Var2, null);
            h11.u(D4);
        }
        h11.S();
        androidx.compose.ui.c c12 = m0.c(f13, valueOf, (g00.p) D4);
        p pVar = p.f75480a;
        Float valueOf2 = Float.valueOf(f12);
        h11.C(1618982084);
        boolean T2 = h11.T(valueOf2) | h11.T(k0Var) | h11.T(k0Var2);
        Object D5 = h11.D();
        if (T2 || D5 == c0064a.a()) {
            D5 = new ZoomableImageKt$ZoomableImage$1$2$1(f12, k0Var, k0Var2, null);
            h11.u(D5);
        }
        h11.S();
        androidx.compose.ui.c c13 = m0.c(c12, pVar, (g00.p) D5);
        Float valueOf3 = Float.valueOf(f12);
        h11.C(1618982084);
        boolean T3 = h11.T(valueOf3) | h11.T(k0Var) | h11.T(k0Var2);
        Object D6 = h11.D();
        if (T3 || D6 == c0064a.a()) {
            D6 = new ZoomableImageKt$ZoomableImage$1$3$1(f12, k0Var, k0Var2, null);
            h11.u(D6);
        }
        h11.S();
        androidx.compose.ui.c c14 = m0.c(c13, pVar, (g00.p) D6);
        h11.C(1157296644);
        boolean T4 = h11.T(k0Var3);
        Object D7 = h11.D();
        if (T4 || D7 == c0064a.a()) {
            D7 = new l<androidx.compose.ui.layout.l, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$4$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.layout.l coordinates) {
                    o.i(coordinates, "coordinates");
                    ZoomableImageKt.g(k0Var3, s.a(r.g(coordinates.a()), r.f(coordinates.a())));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.layout.l lVar) {
                    b(lVar);
                    return p.f75480a;
                }
            };
            h11.u(D7);
        }
        h11.S();
        androidx.compose.ui.c a14 = g0.a(c14, (l) D7);
        h11.C(1618982084);
        boolean T5 = h11.T(k0Var3) | h11.T(k0Var) | h11.T(k0Var2);
        Object D8 = h11.D();
        if (T5 || D8 == c0064a.a()) {
            D8 = new l<androidx.compose.ui.graphics.c, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$5$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.graphics.c graphicsLayer) {
                    long f14;
                    long f15;
                    float b13;
                    float b14;
                    long f16;
                    long f17;
                    long d11;
                    float k11;
                    long d12;
                    float k12;
                    float b15;
                    float b16;
                    o.i(graphicsLayer, "$this$graphicsLayer");
                    f14 = ZoomableImageKt.f(k0Var3);
                    f15 = ZoomableImageKt.f(k0Var3);
                    b13 = ZoomableImageKt.b(k0Var);
                    float g12 = r.g(f14) * b13;
                    b14 = ZoomableImageKt.b(k0Var);
                    float f18 = r.f(f15) * b14;
                    f16 = ZoomableImageKt.f(k0Var3);
                    float g13 = g12 - r.g(f16);
                    float f19 = 2;
                    float f21 = g13 / f19;
                    f17 = ZoomableImageKt.f(k0Var3);
                    float f22 = (f18 - r.f(f17)) / f19;
                    d11 = ZoomableImageKt.d(k0Var2);
                    k11 = m00.o.k(a1.f.o(d11), -f21, f21);
                    graphicsLayer.D(k11);
                    d12 = ZoomableImageKt.d(k0Var2);
                    k12 = m00.o.k(a1.f.p(d12), -f22, f22);
                    graphicsLayer.h(k12);
                    b15 = ZoomableImageKt.b(k0Var);
                    graphicsLayer.m(b15);
                    b16 = ZoomableImageKt.b(k0Var);
                    graphicsLayer.w(b16);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.graphics.c cVar) {
                    b(cVar);
                    return p.f75480a;
                }
            };
            h11.u(D8);
        }
        h11.S();
        ImageKt.a(painter, null, androidx.compose.ui.graphics.b.a(a14, (l) D8), null, androidx.compose.ui.layout.c.f8188a.d(), 0.0f, null, h11, 24632, 104);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    ZoomableImageKt.a(Painter.this, f12, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(k0<Float> k0Var) {
        return k0Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Float> k0Var, float f11) {
        k0Var.setValue(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(k0<a1.f> k0Var) {
        return k0Var.getValue().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k0<a1.f> k0Var, long j11) {
        k0Var.setValue(a1.f.d(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(k0<r> k0Var) {
        return k0Var.getValue().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(k0<r> k0Var, long j11) {
        k0Var.setValue(r.b(j11));
    }

    public static final Object n(f0 f0Var, g00.p<? super Float, ? super a1.f, p> pVar, zz.a<? super p> aVar) {
        Object f11;
        Object e11 = ForEachGestureKt.e(f0Var, new ZoomableImageKt$detectZoom$2(pVar, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (e11 == f11) {
            return e11;
        }
        return p.f75480a;
    }
}
