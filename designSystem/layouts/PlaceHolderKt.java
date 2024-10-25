package com.forsale.designSystem.layouts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import v0.b;
import wz.p;
/* compiled from: PlaceHolder.kt */
/* loaded from: classes3.dex */
public final class PlaceHolderKt {
    public static final void a(androidx.compose.ui.c modifier, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        o.i(modifier, "modifier");
        androidx.compose.runtime.a h11 = aVar.h(-2144248746);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-2144248746, i11, -1, "com.forsale.designSystem.layouts.Placeholder (PlaceHolder.kt:17)");
            }
            dk.a aVar2 = dk.a.f54291a;
            androidx.compose.ui.c b11 = BackgroundKt.b(modifier, aVar2.a(h11, 6).e().d(h11, 0), null, 2, null);
            h11.C(733328855);
            b.a aVar3 = v0.b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
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
            IconKt.a(p1.e.d(sj.d.A, h11, 0), BoxScopeInstance.f3756a.e(androidx.compose.ui.c.f7566a, aVar3.e()), null, aVar2.a(h11, 6).e().f(h11, 0), false, h.l(72), h11, 196616, 20);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PlaceHolderKt$Placeholder$2(modifier, i11));
        }
    }
}
