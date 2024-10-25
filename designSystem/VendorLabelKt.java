package com.forsale.designSystem;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import v0.b;
import wz.p;
/* compiled from: VendorLabel.kt */
/* loaded from: classes3.dex */
public final class VendorLabelKt {
    public static final void a(c cVar, Painter painter, long j11, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(587333439);
        if ((i12 & 1) != 0) {
            cVar = c.f7566a;
        }
        if ((i12 & 4) != 0) {
            j11 = dk.a.f54291a.a(h11, 6).f().i(h11, 0);
            i13 = i11 & (-897);
        } else {
            i13 = i11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(587333439, i13, -1, "com.forsale.designSystem.VendorLabel (VendorLabel.kt:37)");
        }
        b(cVar, painter, j11, h11, (i13 & 14) | 64 | (i13 & 896), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new VendorLabelKt$VendorLabel$1(cVar, painter, j11, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(c cVar, Painter painter, long j11, androidx.compose.runtime.a aVar, int i11, int i12) {
        c.a aVar2;
        long j12;
        androidx.compose.runtime.a h11 = aVar.h(-689034950);
        if ((i12 & 1) != 0) {
            aVar2 = c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if ((i12 & 4) != 0) {
            j12 = dk.a.f54291a.a(h11, 6).f().i(h11, 0);
        } else {
            j12 = j11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-689034950, i11, -1, "com.forsale.designSystem.VendorLabelDefault (VendorLabel.kt:17)");
        }
        c.a aVar3 = c.f7566a;
        c k11 = BackgroundKt.a(SizeKt.i(aVar3, h.l(20)), j12, g.c(h.l(2))).k(aVar2);
        h11.C(733328855);
        b.a aVar4 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
        if (!(h11.k() instanceof d)) {
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        c e11 = BoxScopeInstance.f3756a.e(aVar3, aVar4.e());
        float f11 = 6;
        ImageKt.a(painter, null, PaddingKt.m(e11, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), null, null, 0.0f, null, h11, 56, 120);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new VendorLabelKt$VendorLabelDefault$2(aVar2, painter, j12, i11, i12));
        }
    }
}
