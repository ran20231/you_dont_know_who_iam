package com.forsale.app.utils.composeUtils;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import e2.h;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import java.util.List;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: FixedGridView.kt */
/* loaded from: classes3.dex */
public final class FixedGridViewKt {
    public static final <T> void a(List<? extends T> data, int i11, c modifier, float f11, float f12, r<? super w.c, ? super T, ? super a, ? super Integer, p> itemContent, a aVar, int i12, int i13) {
        float f13;
        float f14;
        int i14;
        int i15;
        o.i(data, "data");
        o.i(modifier, "modifier");
        o.i(itemContent, "itemContent");
        a h11 = aVar.h(1045390698);
        if ((i13 & 8) != 0) {
            f13 = h.l(0);
        } else {
            f13 = f11;
        }
        if ((i13 & 16) != 0) {
            f14 = h.l(0);
        } else {
            f14 = f12;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1045390698, i12, -1, "com.forsale.app.utils.composeUtils.FixedGridView (FixedGridView.kt:17)");
        }
        int size = data.size();
        if (size == 0) {
            i14 = 0;
        } else {
            i14 = ((size - 1) / i11) + 1;
        }
        Arrangement.f o11 = Arrangement.f3698a.o(f14);
        int i16 = (i12 >> 6) & 14;
        h11.C(-483455358);
        int i17 = i16 >> 3;
        a0 a11 = e.a(o11, b.f74009a.k(), h11, (i17 & 14) | (i17 & 112));
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(modifier);
        int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
        float f15 = f14;
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i18 >> 3) & 112));
        h11.C(2058660585);
        f fVar = f.f74891a;
        h11.C(943865542);
        int i19 = 0;
        while (i19 < i14) {
            Arrangement.f o12 = Arrangement.f3698a.o(f13);
            h11.C(693286680);
            c.a aVar2 = c.f7566a;
            a0 a15 = androidx.compose.foundation.layout.o.a(o12, b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a17 = companion2.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar2);
            int i21 = i14;
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion2.e());
            Updater.c(a18, s12, companion2.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion2.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(2073096438);
            int i22 = 0;
            while (i22 < i11) {
                int i23 = (i19 * i11) + i22;
                if (i23 < size) {
                    h11.C(313612374);
                    c a19 = uVar.a(c.f7566a, 1.0f, true);
                    h11.C(733328855);
                    a0 g11 = BoxKt.g(b.f74009a.o(), true, h11, 48);
                    h11.C(-1323940314);
                    int a21 = j0.e.a(h11, 0);
                    k s13 = h11.s();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a22 = companion3.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(a19);
                    i15 = size;
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a22);
                    } else {
                        h11.t();
                    }
                    a a23 = Updater.a(h11);
                    Updater.c(a23, g11, companion3.e());
                    Updater.c(a23, s13, companion3.g());
                    g00.p<ComposeUiNode, Integer, p> b13 = companion3.b();
                    if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                        a23.u(Integer.valueOf(a21));
                        a23.p(Integer.valueOf(a21), b13);
                    }
                    c13.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    itemContent.d(BoxScopeInstance.f3756a, (T) data.get(i23), h11, Integer.valueOf(6 | ((i12 >> 9) & 896)));
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    h11.S();
                } else {
                    i15 = size;
                    h11.C(313612675);
                    SpacerKt.a(uVar.a(c.f7566a, 1.0f, true), h11, 0);
                    h11.S();
                }
                i22++;
                size = i15;
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            i19++;
            i14 = i21;
            size = size;
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new FixedGridViewKt$FixedGridView$2(data, i11, modifier, f13, f15, itemContent, i12, i13));
        }
    }
}
