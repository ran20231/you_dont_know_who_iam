package com.forsale.designSystem.buttons;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import b1.s4;
import b1.t1;
import com.forsale.designSystem.CustomIndication;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.buttons.d;
import com.forsale.designSystem.colors.ValuesKt;
import e2.h;
import j0.d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import q1.i;
import s.f;
import s.g;
import v.j;
import v.k;
import wz.p;
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonKt {
    public static final void a(g00.a<p> onClick, Painter icon, IconButtonShape shape, IconButtonSize size, long j11, androidx.compose.ui.c cVar, boolean z11, k kVar, t1 t1Var, androidx.compose.runtime.a aVar, int i11, int i12) {
        c.a aVar2;
        boolean z12;
        k kVar2;
        t1 t1Var2;
        o.i(onClick, "onClick");
        o.i(icon, "icon");
        o.i(shape, "shape");
        o.i(size, "size");
        androidx.compose.runtime.a h11 = aVar.h(368208694);
        if ((i12 & 32) != 0) {
            aVar2 = androidx.compose.ui.c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if ((i12 & 64) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 128) != 0) {
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                h11.u(D);
            }
            h11.S();
            kVar2 = (k) D;
        } else {
            kVar2 = kVar;
        }
        if ((i12 & 256) != 0) {
            t1Var2 = null;
        } else {
            t1Var2 = t1Var;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(368208694, i11, -1, "com.forsale.designSystem.buttons.FilledIconButton (IconButton.kt:124)");
        }
        int i13 = i11 >> 3;
        b(onClick, icon, new d.a(j11, null), c.f41201a.a(shape, size), aVar2, z12, kVar2, t1Var2, h11, (i11 & 14) | 64 | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new IconButtonKt$FilledIconButton$2(onClick, icon, shape, size, j11, aVar2, z12, kVar2, t1Var2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g00.a<p> aVar, Painter painter, d dVar, c cVar, androidx.compose.ui.c cVar2, boolean z11, k kVar, t1 t1Var, androidx.compose.runtime.a aVar2, int i11, int i12) {
        c.a aVar3;
        boolean z12;
        k kVar2;
        t1 t1Var2;
        t1 g11;
        t1 t1Var3;
        f fVar;
        CustomIndication customIndication;
        long d11;
        androidx.compose.runtime.a h11 = aVar2.h(1560733945);
        if ((i12 & 16) != 0) {
            aVar3 = androidx.compose.ui.c.f7566a;
        } else {
            aVar3 = cVar2;
        }
        if ((i12 & 32) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 64) != 0) {
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                h11.u(D);
            }
            h11.S();
            kVar2 = (k) D;
        } else {
            kVar2 = kVar;
        }
        if ((i12 & 128) != 0) {
            t1Var2 = null;
        } else {
            t1Var2 = t1Var;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1560733945, i11, -1, "com.forsale.designSystem.buttons.IconButton (IconButton.kt:40)");
        }
        long g12 = dk.a.f54291a.a(h11, 6).e().g(h11, 0);
        if (!z12) {
            g11 = t1.g(t1.f15974b.d());
        } else {
            if (!(dVar instanceof d.a)) {
                if (dVar instanceof d.b) {
                    g11 = t1.g(((d.b) dVar).a());
                } else if (!o.d(dVar, d.c.f41209a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            g11 = null;
        }
        if (!z12) {
            t1Var3 = t1.g(t1.f15974b.d());
        } else if (dVar instanceof d.a) {
            t1Var3 = t1.g(((d.a) dVar).a());
        } else if ((dVar instanceof d.b) || o.d(dVar, d.c.f41209a)) {
            t1Var3 = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        h11.C(-1105474740);
        if (z12) {
            if (t1Var2 == null) {
                g12 = ((t1) h11.q(ValuesKt.d())).y();
            } else {
                g12 = t1Var2.y();
            }
        }
        long j11 = g12;
        h11.S();
        if (g11 != null) {
            fVar = g.a(h.l(1), g11.y());
        } else {
            fVar = null;
        }
        if (dVar instanceof d.b) {
            customIndication = new CustomIndication(((d.b) dVar).a(), 0L, null, null, 14, null);
        } else {
            customIndication = new CustomIndication(0L, 0L, null, null, 15, null);
        }
        CustomIndication customIndication2 = customIndication;
        s4 e11 = cVar.e();
        int a11 = i.f66253b.a();
        if (t1Var3 != null) {
            d11 = t1Var3.y();
        } else {
            d11 = t1.f15974b.d();
        }
        SurfaceKt.a(aVar, aVar3, e11, d11, 0L, fVar, 0.0f, kVar2, null, z12, null, i.h(a11), r0.b.b(h11, 2086793538, true, new IconButtonKt$IconButton$2(cVar, kVar2, customIndication2, painter, j11)), h11, (i11 & 14) | 100663296 | ((i11 >> 9) & 112) | ((i11 << 3) & 29360128) | ((i11 << 12) & 1879048192), 384, 1104);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new IconButtonKt$IconButton$3(aVar, painter, dVar, cVar, aVar3, z12, kVar2, t1Var2, i11, i12));
        }
    }

    public static final void c(g00.a<p> onClick, Painter icon, IconButtonShape shape, IconButtonSize size, androidx.compose.ui.c cVar, boolean z11, k kVar, t1 t1Var, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.c cVar2;
        boolean z12;
        k kVar2;
        t1 t1Var2;
        o.i(onClick, "onClick");
        o.i(icon, "icon");
        o.i(shape, "shape");
        o.i(size, "size");
        androidx.compose.runtime.a h11 = aVar.h(-663482296);
        if ((i12 & 16) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if ((i12 & 32) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 64) != 0) {
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                h11.u(D);
            }
            h11.S();
            kVar2 = (k) D;
        } else {
            kVar2 = kVar;
        }
        if ((i12 & 128) != 0) {
            t1Var2 = null;
        } else {
            t1Var2 = t1Var;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-663482296, i11, -1, "com.forsale.designSystem.buttons.StandardIconButton (IconButton.kt:100)");
        }
        b(onClick, icon, d.c.f41209a, c.f41201a.a(shape, size), cVar2, z12, kVar2, t1Var2, h11, (i11 & 14) | 448 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new IconButtonKt$StandardIconButton$2(onClick, icon, shape, size, cVar2, z12, kVar2, t1Var2, i11, i12));
        }
    }
}
