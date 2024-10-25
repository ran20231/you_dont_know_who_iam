package com.forsale.designSystem.tabs;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.w;
import androidx.recyclerview.widget.RecyclerView;
import ck.b;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import e2.d;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import w.u;
import wz.p;
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(List<b> list, int i11, float f11, a aVar, int i12, int i13) {
        a h11 = aVar.h(1003400280);
        if ((i13 & 4) != 0) {
            f11 = h.l(3);
        }
        float f12 = f11;
        if (c.I()) {
            c.U(1003400280, i12, -1, "com.forsale.designSystem.tabs.TabIndicatorAndDivider (TabRow.kt:125)");
        }
        SubcomposeLayoutKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), new TabRowKt$TabIndicatorAndDivider$1(f12, list, i11), h11, 6, 0);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new TabRowKt$TabIndicatorAndDivider$2(list, i11, f12, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<b> b(List<String> list, l<? super Integer, p> lVar, int i11, a aVar, int i12, int i13) {
        int i14;
        boolean z11;
        long i15;
        aVar.C(-1867151032);
        int i16 = 0;
        if ((i13 & 4) != 0) {
            i14 = 0;
        } else {
            i14 = i11;
        }
        if (c.I()) {
            c.U(-1867151032, i12, -1, "com.forsale.designSystem.tabs.TabRow (TabRow.kt:65)");
        }
        d dVar = (d) aVar.q(CompositionLocalsKt.e());
        float f11 = 16;
        float l11 = h.l(f11);
        SnapshotStateList<h> o11 = o(list.size(), aVar, 0);
        List<b> n11 = n(list, o11, l11);
        Object valueOf = Integer.valueOf(i14);
        aVar.C(1157296644);
        boolean T = aVar.T(valueOf);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = c0.e(Integer.valueOf(i14), null, 2, null);
            aVar.u(D);
        }
        aVar.S();
        k0 k0Var = (k0) D;
        aVar.C(-492369756);
        Object D2 = aVar.D();
        if (D2 == a.f7182a.a()) {
            D2 = c0.e(Boolean.FALSE, null, 2, null);
            aVar.u(D2);
        }
        aVar.S();
        k0 k0Var2 = (k0) D2;
        androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, l11, 0.0f, 0.0f, h.l(8), 6, null);
        Arrangement.f o12 = Arrangement.f3698a.o(h.l(f11));
        aVar.C(693286680);
        a0 a11 = o.a(o12, v0.b.f74009a.l(), aVar, 6);
        aVar.C(-1323940314);
        int a12 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(m11);
        if (!(aVar.k() instanceof j0.d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a13);
        } else {
            aVar.t();
        }
        a a14 = Updater.a(aVar);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        u uVar = u.f74924a;
        aVar.C(735192301);
        int i17 = 0;
        for (Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                r.x();
            }
            String str = (String) obj;
            if (i17 == c(k0Var)) {
                z11 = 1;
            } else {
                z11 = i16;
            }
            f(k0Var2, z11);
            if (e(k0Var2)) {
                aVar.C(840961420);
                i15 = dk.a.f54291a.a(aVar, 6).f().i(aVar, i16);
                aVar.S();
            } else {
                aVar.C(840961484);
                i15 = dk.a.f54291a.a(aVar, 6).e().i(aVar, i16);
                aVar.S();
            }
            Object valueOf2 = Integer.valueOf(i17);
            aVar.C(1618982084);
            boolean T2 = aVar.T(k0Var) | aVar.T(valueOf2) | aVar.T(lVar);
            Object D3 = aVar.D();
            if (T2 || D3 == a.f7182a.a()) {
                D3 = new TabRowKt$TabRow$1$1$2$1(i17, lVar, k0Var);
                aVar.u(D3);
            }
            aVar.S();
            g00.a aVar2 = (g00.a) D3;
            Object valueOf3 = Integer.valueOf(i17);
            aVar.C(1618982084);
            boolean T3 = aVar.T(valueOf3) | aVar.T(o11) | aVar.T(dVar);
            Object D4 = aVar.D();
            if (T3 || D4 == a.f7182a.a()) {
                D4 = new TabRowKt$TabRow$1$1$3$1(o11, i17, dVar);
                aVar.u(D4);
            }
            aVar.S();
            g(str, i15, aVar2, (l) D4, aVar, 0);
            k0Var2 = k0Var2;
            i17 = i18;
            k0Var = k0Var;
            o11 = o11;
            i16 = 0;
        }
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return n11;
    }

    private static final int c(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k0<Integer> k0Var, int i11) {
        k0Var.setValue(Integer.valueOf(i11));
    }

    private static final boolean e(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    private static final void f(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, long j11, g00.a<p> aVar, l<? super w, p> lVar, a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        a h11 = aVar2.h(148291316);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.e(j11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(lVar)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(148291316, i12, -1, "com.forsale.designSystem.tabs.TabText (TabRow.kt:108)");
            }
            androidx.compose.ui.text.a0 c11 = dk.a.f54291a.c(h11, 6).c();
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new TabRowKt$TabText$1$1(aVar);
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c e11 = ClickableKt.e(aVar3, false, null, null, (g00.a) D, 7, null);
            h11.C(1157296644);
            boolean T2 = h11.T(lVar);
            Object D2 = h11.D();
            if (T2 || D2 == a.f7182a.a()) {
                D2 = new TabRowKt$TabText$2$1(lVar);
                h11.u(D2);
            }
            h11.S();
            TextKt.a(str, e11, 0, 0, false, 1, 0, (l) D2, c11, j11, 0, h11, (i12 & 14) | 196608 | ((i12 << 24) & 1879048192), 0, 1116);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new TabRowKt$TabText$3(str, j11, aVar, lVar, i11));
        }
    }

    public static final void h(List<String> tabItems, l<? super Integer, p> onTabIndexChange, int i11, androidx.compose.ui.c cVar, a aVar, int i12, int i13) {
        androidx.compose.ui.c cVar2;
        kotlin.jvm.internal.o.i(tabItems, "tabItems");
        kotlin.jvm.internal.o.i(onTabIndexChange, "onTabIndexChange");
        a h11 = aVar.h(-454552326);
        if ((i13 & 8) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-454552326, i12, -1, "com.forsale.designSystem.tabs.TabsRow (TabRow.kt:39)");
        }
        androidx.compose.ui.c a11 = SelectableGroupKt.a(cVar2);
        dk.a aVar2 = dk.a.f54291a;
        SurfaceKt.c(a11, null, aVar2.a(h11, 6).g().c(h11, 0), aVar2.a(h11, 6).f().i(h11, 0), null, 0.0f, r0.b.b(h11, -1992431818, true, new TabRowKt$TabsRow$1(tabItems, onTabIndexChange, i12, i11)), h11, 1572864, 50);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new TabRowKt$TabsRow$2(tabItems, onTabIndexChange, i11, cVar2, i12, i13));
        }
    }

    private static final List<b> n(List<String> list, List<h> list2, float f11) {
        float l11;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                float f12 = i11;
                l11 = h.l(h.l(h.l(list2.get(i11 - 1).q() * f12) + h.l(f12 * f11)) + f11);
            } else {
                l11 = h.l(16);
            }
            arrayList.add(new b(l11, list2.get(i11).q(), null));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0 == androidx.compose.runtime.a.f7182a.a()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.runtime.snapshots.SnapshotStateList<e2.h> o(int r3, androidx.compose.runtime.a r4, int r5) {
        /*
            r0 = 214190602(0xcc44a0a, float:3.0243142E-31)
            r4.C(r0)
            boolean r1 = androidx.compose.runtime.c.I()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "com.forsale.designSystem.tabs.getTabWidth (TabRow.kt:165)"
            androidx.compose.runtime.c.U(r0, r5, r1, r2)
        L12:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.C(r0)
            boolean r5 = r4.T(r5)
            java.lang.Object r0 = r4.D()
            if (r5 != 0) goto L2e
            androidx.compose.runtime.a$a r5 = androidx.compose.runtime.a.f7182a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L48
        L2e:
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.z.f()
            r5 = 0
            r1 = r5
        L34:
            if (r1 >= r3) goto L45
            float r2 = (float) r5
            float r2 = e2.h.l(r2)
            e2.h r2 = e2.h.f(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L34
        L45:
            r4.u(r0)
        L48:
            r4.S()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            boolean r3 = androidx.compose.runtime.c.I()
            if (r3 == 0) goto L56
            androidx.compose.runtime.c.T()
        L56:
            r4.S()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.tabs.TabRowKt.o(int, androidx.compose.runtime.a, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(w wVar, d dVar) {
        return dVar.x(e2.r.g(wVar.B()));
    }
}
