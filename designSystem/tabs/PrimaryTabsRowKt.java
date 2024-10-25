package com.forsale.designSystem.tabs;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import b2.f;
import ck.a;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.badges.BadgesKt;
import com.forsale.designSystem.colors.ValuesKt;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.t0;
import kotlin.jvm.internal.o;
import p1.g;
import r.m;
import v0.b;
import w.u;
import wz.p;
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt {
    public static final void a(a primaryTabItem, long j11, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        o.i(primaryTabItem, "primaryTabItem");
        androidx.compose.runtime.a h11 = aVar.h(-208779621);
        if ((i11 & 14) == 0) {
            if (h11.T(primaryTabItem)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.e(j11)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(-208779621, i12, -1, "com.forsale.designSystem.tabs.PrimaryTabItem (PrimaryTabsRow.kt:131)");
            }
            b.c i15 = b.f74009a.i();
            Arrangement.f b11 = Arrangement.f3698a.b();
            h11.C(693286680);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(b11, i15, h11, 54);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            String b13 = g.b(primaryTabItem.b(), h11, 0);
            dk.a aVar4 = dk.a.f54291a;
            TextKt.a(b13, PaddingKt.j(aVar3, h.l(8), h.l(12)), f.f16081b.a(), 0, false, 1, 1, null, aVar4.c(h11, 6).r(), j11, 0, h11, ((i12 << 24) & 1879048192) | 1769472, 0, 1176);
            aVar2 = h11;
            aVar2.C(-1797536721);
            if (primaryTabItem.a() != null) {
                BadgesKt.b(null, aVar4.a(aVar2, 6).d().i(aVar2, 0), r0.b.b(aVar2, -1863207476, true, new PrimaryTabsRowKt$PrimaryTabItem$1$1(primaryTabItem)), aVar2, 384, 1);
            }
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new PrimaryTabsRowKt$PrimaryTabItem$2(primaryTabItem, j11, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
        if ((r32 & 8) != 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r23, androidx.compose.ui.c r24, long r25, long r27, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r29, androidx.compose.runtime.a r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.tabs.PrimaryTabsRowKt.b(int, androidx.compose.ui.c, long, long, g00.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void c(boolean z11, g00.a<p> onClick, androidx.compose.ui.c cVar, q<? super w.e, ? super androidx.compose.runtime.a, ? super Integer, p> content, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(onClick, "onClick");
        o.i(content, "content");
        androidx.compose.runtime.a h11 = aVar.h(-122314927);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.F(onClick)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.T(cVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (h11.F(content)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (i18 != 0) {
                cVar = androidx.compose.ui.c.f7566a;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-122314927, i13, -1, "com.forsale.designSystem.tabs.TabScaffold (PrimaryTabsRow.kt:172)");
            }
            d(z11, r0.b.b(h11, -696143981, true, new PrimaryTabsRowKt$TabScaffold$1(z11, cVar, onClick, content, i13)), h11, (i13 & 14) | 48);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        androidx.compose.ui.c cVar2 = cVar;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PrimaryTabsRowKt$TabScaffold$2(z11, onClick, cVar2, content, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(boolean z11, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        long d11;
        long d12;
        long d13;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(1376340722);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        if ((i15 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1376340722, i15, -1, "com.forsale.designSystem.tabs.TabTransition (PrimaryTabsRow.kt:212)");
            }
            Transition e11 = TransitionKt.e(Boolean.valueOf(z11), "TabTransition", h11, (i15 & 14) | 48, 0);
            PrimaryTabsRowKt$TabTransition$color$2 primaryTabsRowKt$TabTransition$color$2 = PrimaryTabsRowKt$TabTransition$color$2.f42131a;
            h11.C(-1939694975);
            boolean booleanValue = ((Boolean) e11.n()).booleanValue();
            h11.C(-578451889);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-578451889, 0, -1, "com.forsale.designSystem.tabs.TabTransition.<anonymous> (PrimaryTabsRow.kt:230)");
            }
            if (booleanValue) {
                h11.C(-1446222806);
                d11 = dk.a.f54291a.a(h11, 6).f().i(h11, 0);
            } else {
                h11.C(-1446222758);
                d11 = dk.a.f54291a.a(h11, 6).e().d(h11, 0);
            }
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            h11.S();
            androidx.compose.ui.graphics.colorspace.c t11 = t1.t(d11);
            h11.C(1157296644);
            boolean T = h11.T(t11);
            r.e1<t1, m> D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = ColorVectorConverterKt.a(t1.f15974b).invoke(t11);
                h11.u(D);
            }
            h11.S();
            r.e1 e1Var = (r.e1) D;
            h11.C(-142660079);
            boolean booleanValue2 = ((Boolean) e11.h()).booleanValue();
            h11.C(-578451889);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-578451889, 0, -1, "com.forsale.designSystem.tabs.TabTransition.<anonymous> (PrimaryTabsRow.kt:230)");
            }
            if (booleanValue2) {
                h11.C(-1446222806);
                long i16 = dk.a.f54291a.a(h11, 6).f().i(h11, 0);
                h11.S();
                d12 = i16;
            } else {
                h11.C(-1446222758);
                d12 = dk.a.f54291a.a(h11, 6).e().d(h11, 0);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            h11.S();
            t1 g11 = t1.g(d12);
            boolean booleanValue3 = ((Boolean) e11.n()).booleanValue();
            h11.C(-578451889);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-578451889, 0, -1, "com.forsale.designSystem.tabs.TabTransition.<anonymous> (PrimaryTabsRow.kt:230)");
            }
            if (booleanValue3) {
                h11.C(-1446222806);
                d13 = dk.a.f54291a.a(h11, 6).f().i(h11, 0);
            } else {
                h11.C(-1446222758);
                d13 = dk.a.f54291a.a(h11, 6).e().d(h11, 0);
            }
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            h11.S();
            n1 c11 = TransitionKt.c(e11, g11, t1.g(d13), primaryTabsRowKt$TabTransition$color$2.invoke(e11.l(), h11, 0), e1Var, "TabTransitionSpec", h11, 229376);
            h11.S();
            h11.S();
            CompositionLocalKt.a(ValuesKt.d().c(t1.g(e(c11))), pVar, h11, t0.f59917d | 0 | (i15 & 112));
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PrimaryTabsRowKt$TabTransition$1(z11, pVar, i11));
        }
    }

    private static final long e(n1<t1> n1Var) {
        return n1Var.getValue().y();
    }
}
