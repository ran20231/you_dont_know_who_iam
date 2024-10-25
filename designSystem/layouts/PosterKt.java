package com.forsale.designSystem.layouts;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import e2.h;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: Poster.kt */
/* loaded from: classes3.dex */
public final class PosterKt {
    public static final void a(Painter painter, androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(1690066093);
        if ((i12 & 2) != 0) {
            cVar = androidx.compose.ui.c.f7566a;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1690066093, i11, -1, "com.forsale.designSystem.layouts.Poster (Poster.kt:48)");
        }
        androidx.compose.ui.c b11 = androidx.compose.ui.draw.c.b(y0.e.a(cVar, g.c(h.l(8))).k(cVar), painter, false, v0.b.f74009a.e(), androidx.compose.ui.layout.c.f8188a.a(), 0.0f, null, 50, null);
        PosterKt$Poster$6 posterKt$Poster$6 = PosterKt$Poster$6.f41802a;
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
        Updater.c(a13, posterKt$Poster$6, companion.e());
        Updater.c(a13, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        h11.S();
        h11.w();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PosterKt$Poster$7(painter, cVar, i11, i12));
        }
    }

    public static final void b(Painter painter, boolean z11, androidx.compose.ui.c cVar, boolean z12, float f11, g00.a<p> aVar, androidx.compose.runtime.a aVar2, int i11, int i12) {
        c.a aVar3;
        boolean z13;
        float f12;
        PosterKt$Poster$1 posterKt$Poster$1;
        androidx.compose.ui.c cVar2;
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar2.h(1352343441);
        if ((i12 & 4) != 0) {
            aVar3 = androidx.compose.ui.c.f7566a;
        } else {
            aVar3 = cVar;
        }
        if ((i12 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z12;
        }
        if ((i12 & 16) != 0) {
            f12 = 0.75f;
        } else {
            f12 = f11;
        }
        if ((i12 & 32) != 0) {
            posterKt$Poster$1 = PosterKt$Poster$1.f41791a;
        } else {
            posterKt$Poster$1 = aVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1352343441, i11, -1, "com.forsale.designSystem.layouts.Poster (Poster.kt:23)");
        }
        androidx.compose.ui.c a11 = y0.e.a(aVar3, g.c(h.l(8)));
        if (z13) {
            cVar2 = ClickableKt.e(androidx.compose.ui.c.f7566a, false, null, null, posterKt$Poster$1, 7, null);
        } else {
            cVar2 = androidx.compose.ui.c.f7566a;
        }
        androidx.compose.ui.c b11 = androidx.compose.ui.draw.c.b(AspectRatioKt.a(a11.k(cVar2), f12, !z11), painter, false, v0.b.f74009a.e(), androidx.compose.ui.layout.c.f8188a.a(), 0.0f, null, 50, null);
        PosterKt$Poster$3 posterKt$Poster$3 = PosterKt$Poster$3.f41792a;
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, posterKt$Poster$3, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        h11.S();
        h11.w();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PosterKt$Poster$4(painter, z11, aVar3, z13, f12, posterKt$Poster$1, i11, i12));
        }
    }
}
