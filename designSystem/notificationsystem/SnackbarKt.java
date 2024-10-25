package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.n;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.t0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.u;
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt {

    /* renamed from: c  reason: collision with root package name */
    private static final float f41961c;

    /* renamed from: e  reason: collision with root package name */
    private static final float f41963e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f41964f;

    /* renamed from: a  reason: collision with root package name */
    private static final float f41959a = h.l(30);

    /* renamed from: b  reason: collision with root package name */
    private static final float f41960b = h.l(16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f41962d = h.l(4);

    /* renamed from: g  reason: collision with root package name */
    private static final float f41965g = h.l(48);

    /* renamed from: h  reason: collision with root package name */
    private static final float f41966h = h.l(68);

    static {
        float f11 = 12;
        f41961c = h.l(f11);
        f41963e = h.l(f11);
        f41964f = h.l(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ak.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(-514852301);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
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
            if (c.I()) {
                c.U(-514852301, i11, -1, "com.forsale.designSystem.notificationsystem.OneRowSnackBar (Snackbar.kt:94)");
            }
            if (aVar.f() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                p<androidx.compose.runtime.a, Integer, wz.p> g11 = aVar.g();
                h11.C(-334357428);
                if (g11 != null) {
                    g11.invoke(h11, 0);
                    wz.p pVar = wz.p.f75480a;
                }
                h11.S();
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                if (aVar.g() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                androidx.compose.ui.c m11 = PaddingKt.m(aVar3, m(z12, h11, 0), 0.0f, f41962d, 0.0f, 10, null);
                SnackbarKt$OneRowSnackBar$2 snackbarKt$OneRowSnackBar$2 = SnackbarKt$OneRowSnackBar$2.f41967a;
                h11.C(-1323940314);
                int a11 = e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a12 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
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
                Updater.c(a13, snackbarKt$OneRowSnackBar$2, companion.e());
                Updater.c(a13, s11, companion.g());
                p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.p(Integer.valueOf(a11), b11);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                androidx.compose.ui.c b12 = n.b(aVar3, "text");
                h11.C(733328855);
                a0 g12 = BoxKt.g(b.f74009a.o(), false, h11, 0);
                h11.C(-1323940314);
                int a14 = e.a(h11, 0);
                k s12 = h11.s();
                g00.a<ComposeUiNode> a15 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(b12);
                if (!(h11.k() instanceof d)) {
                    e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a15);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a16 = Updater.a(h11);
                Updater.c(a16, g12, companion.e());
                Updater.c(a16, s12, companion.g());
                p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
                if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.p(Integer.valueOf(a14), b13);
                }
                c12.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                aVar.h().invoke(h11, 0);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                CompositionLocalKt.b(new t0[]{ValuesKt.c().c(dk.a.f54291a.c(h11, 6).f()), TextKt.i().c(2)}, r0.b.b(h11, 182879082, true, new SnackbarKt$OneRowSnackBar$3$2(aVar)), h11, 56);
                h11.S();
                h11.w();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            } else {
                throw new IllegalArgumentException("action can not be null, 'Regular' snackbar style must contain an Action button  ; if you need a snackbar with no action button use 'WithoutAction' style instead  ".toString());
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new SnackbarKt$OneRowSnackBar$4(aVar, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ak.a r18, androidx.compose.ui.c r19, float r20, androidx.compose.runtime.a r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.notificationsystem.SnackbarKt.b(ak.a, androidx.compose.ui.c, float, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ak.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(858333918);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
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
                androidx.compose.runtime.c.U(858333918, i11, -1, "com.forsale.designSystem.notificationsystem.TwoRowsSnackbar (Snackbar.kt:172)");
            }
            if (aVar.f() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar3, 0.0f, 1, null), 0.0f, f41963e, 0.0f, 0.0f, 13, null);
                h11.C(-483455358);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.m h12 = arrangement.h();
                b.a aVar4 = b.f74009a;
                a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar4.k(), h11, 0);
                h11.C(-1323940314);
                int a12 = e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
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
                p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                f fVar = f.f74891a;
                androidx.compose.ui.c m12 = PaddingKt.m(aVar3, 0.0f, 0.0f, f41960b, 0.0f, 11, null);
                b.c i14 = aVar4.i();
                if (aVar.g() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Arrangement.f o11 = arrangement.o(m(z12, h11, 0));
                h11.C(693286680);
                a0 a15 = androidx.compose.foundation.layout.o.a(o11, i14, h11, 48);
                h11.C(-1323940314);
                int a16 = e.a(h11, 0);
                k s12 = h11.s();
                g00.a<ComposeUiNode> a17 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(m12);
                if (!(h11.k() instanceof d)) {
                    e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a17);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a18 = Updater.a(h11);
                Updater.c(a18, a15, companion.e());
                Updater.c(a18, s12, companion.g());
                p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.p(Integer.valueOf(a16), b12);
                }
                c12.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                u uVar = u.f74924a;
                p<androidx.compose.runtime.a, Integer, wz.p> g11 = aVar.g();
                h11.C(112472130);
                if (g11 != null) {
                    g11.invoke(h11, 0);
                }
                h11.S();
                aVar.h().invoke(h11, 0);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                androidx.compose.ui.c i15 = PaddingKt.i(fVar.b(aVar3, aVar4.j()), f41962d);
                h11.C(693286680);
                a0 a19 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar4.l(), h11, 0);
                h11.C(-1323940314);
                int a21 = e.a(h11, 0);
                k s13 = h11.s();
                g00.a<ComposeUiNode> a22 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(i15);
                if (!(h11.k() instanceof d)) {
                    e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a22);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a23 = Updater.a(h11);
                Updater.c(a23, a19, companion.e());
                Updater.c(a23, s13, companion.g());
                p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
                if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                    a23.u(Integer.valueOf(a21));
                    a23.p(Integer.valueOf(a21), b13);
                }
                c13.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                p<androidx.compose.runtime.a, Integer, wz.p> f11 = aVar.f();
                h11.C(791303794);
                if (f11 != null) {
                    f11.invoke(h11, 0);
                }
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            } else {
                throw new IllegalArgumentException("action can not be null, 'Stacked' snackbar style must contain an Action button  ; if you need a snackbar with no action button use 'WithoutAction' style instead  ".toString());
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new SnackbarKt$TwoRowsSnackbar$3(aVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(-1643771212);
        if ((i11 & 14) == 0) {
            if (h11.F(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(pVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1643771212, i12, -1, "com.forsale.designSystem.notificationsystem.WithoutActionSnackbar (Snackbar.kt:67)");
            }
            h11.C(109852916);
            if (pVar2 != null) {
                pVar2.invoke(h11, Integer.valueOf((i12 >> 3) & 14));
            }
            h11.S();
            SnackbarKt$WithoutActionSnackbar$2 snackbarKt$WithoutActionSnackbar$2 = SnackbarKt$WithoutActionSnackbar$2.f41987a;
            h11.C(-1323940314);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
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
            Updater.c(a13, snackbarKt$WithoutActionSnackbar$2, companion.e());
            Updater.c(a13, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            if (pVar2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            float m11 = m(z11, h11, 0);
            float f11 = f41960b;
            float f12 = f41963e;
            androidx.compose.ui.c l11 = PaddingKt.l(aVar2, m11, f12, f11, f12);
            h11.C(733328855);
            a0 g11 = BoxKt.g(b.f74009a.o(), false, h11, 0);
            h11.C(-1323940314);
            int a14 = e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a15 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(l11);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a15);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a16 = Updater.a(h11);
            Updater.c(a16, g11, companion.e());
            Updater.c(a16, s12, companion.g());
            p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
            if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.p(Integer.valueOf(a14), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            pVar.invoke(h11, Integer.valueOf(i12 & 14));
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new SnackbarKt$WithoutActionSnackbar$3(pVar, pVar2, i11));
        }
    }

    private static final float m(boolean z11, androidx.compose.runtime.a aVar, int i11) {
        float f11;
        aVar.C(1902037727);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1902037727, i11, -1, "com.forsale.designSystem.notificationsystem.getTextStartPadding (Snackbar.kt:208)");
        }
        if (z11) {
            f11 = h.f54555b.a();
        } else {
            f11 = f41961c;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return f11;
    }
}
