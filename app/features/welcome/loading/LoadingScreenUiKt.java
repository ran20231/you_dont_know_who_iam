package com.forsale.app.features.welcome.loading;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.ui.components.AnimatedIconKt;
import com.google.logging.type.LogSeverity;
import g00.p;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import r.f0;
import r.n0;
import v0.b;
/* compiled from: LoadingScreenUi.kt */
/* loaded from: classes2.dex */
public final class LoadingScreenUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Animatable<Float, r.j> animatable, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-667059944);
        if ((i11 & 14) == 0) {
            if (h11.T(animatable)) {
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
                androidx.compose.runtime.c.U(-667059944, i12, -1, "com.forsale.app.features.welcome.loading.BaseAnimation (LoadingScreenUi.kt:177)");
            }
            u.d(animatable, new LoadingScreenUiKt$BaseAnimation$1(animatable, null), h11, (i12 & 14) | Animatable.f2579o | 64);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.LoadingScreenUiKt$BaseAnimation$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    LoadingScreenUiKt.a(animatable, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void b(final List<Integer> loadingAnimationsListIcons, final boolean z11, final int i11, final float f11, androidx.compose.runtime.a aVar, final int i12) {
        Object obj;
        int i13;
        int i14;
        Animatable animatable;
        k0 k0Var;
        final n1<Float> n1Var;
        int intValue;
        o.i(loadingAnimationsListIcons, "loadingAnimationsListIcons");
        androidx.compose.runtime.a h11 = aVar.h(-463876352);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-463876352, i12, -1, "com.forsale.app.features.welcome.loading.ShowLoadingView (LoadingScreenUi.kt:54)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(-1, null, 2, null);
            h11.u(D);
        }
        h11.S();
        k0 k0Var2 = (k0) D;
        InfiniteTransition e11 = InfiniteTransitionKt.e(null, h11, 0, 1);
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D2);
        }
        h11.S();
        k0 k0Var3 = (k0) D2;
        h11.C(-492369756);
        Object D3 = h11.D();
        if (D3 == c0064a.a()) {
            D3 = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D3);
        }
        h11.S();
        final k0 k0Var4 = (k0) D3;
        h11.C(-492369756);
        Object D4 = h11.D();
        if (D4 == c0064a.a()) {
            D4 = c0.e(Boolean.FALSE, null, 2, null);
            h11.u(D4);
        }
        h11.S();
        k0 k0Var5 = (k0) D4;
        h11.C(-492369756);
        Object D5 = h11.D();
        if (D5 == c0064a.a()) {
            D5 = r.a.b(0.0f, 0.0f, 2, null);
            h11.u(D5);
        }
        h11.S();
        Animatable animatable2 = (Animatable) D5;
        n1<Float> b11 = InfiniteTransitionKt.b(e11, 0.0f, 1.0f, r.g.d(r.g.j(300, LogSeverity.INFO_VALUE, f0.n()), RepeatMode.Reverse, 0L, 4, null), null, h11, InfiniteTransition.f2635f | 432 | (n0.f67363d << 9), 8);
        u.d(Float.valueOf(c(b11)), new LoadingScreenUiKt$ShowLoadingView$1(k0Var2, loadingAnimationsListIcons, b11, k0Var3, null), h11, 64);
        a(animatable2, h11, Animatable.f2579o);
        Boolean valueOf = Boolean.valueOf(f(k0Var4));
        Boolean valueOf2 = Boolean.valueOf(z11);
        h11.C(1618982084);
        boolean T = h11.T(valueOf2) | h11.T(k0Var4) | h11.T(k0Var5);
        Object D6 = h11.D();
        if (!T && D6 != c0064a.a()) {
            obj = null;
        } else {
            obj = null;
            D6 = new LoadingScreenUiKt$ShowLoadingView$2$1(z11, k0Var4, k0Var5, null);
            h11.u(D6);
        }
        h11.S();
        u.d(valueOf, (p) D6, h11, 64);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c b12 = BackgroundKt.b(SizeKt.f(aVar2, 0.0f, 1, obj), dk.a.f54291a.a(h11, dk.a.f54292b).f().i(h11, yj.d.f76453b), null, 2, null);
        h11.C(733328855);
        b.a aVar3 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b12);
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
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        if (z11) {
            h11.C(-978770679);
            androidx.compose.ui.c e12 = boxScopeInstance.e(aVar2, aVar3.e());
            h11.C(1157296644);
            boolean T2 = h11.T(k0Var4);
            Object D7 = h11.D();
            if (T2 || D7 == c0064a.a()) {
                D7 = new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$3$1$1
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
                        LoadingScreenUiKt.g(k0Var4, true);
                    }
                };
                h11.u(D7);
            }
            h11.S();
            i14 = -1323940314;
            animatable = animatable2;
            i13 = 0;
            k0Var = k0Var5;
            n1Var = b11;
            AnimatedIconKt.a(e12, i11, 0.0f, f11, true, (g00.a) D7, h11, ((i12 >> 3) & 112) | 24576 | (i12 & 7168), 4);
            h11.S();
        } else {
            i13 = 0;
            i14 = -1323940314;
            animatable = animatable2;
            k0Var = k0Var5;
            n1Var = b11;
            h11.C(-978770330);
            IconKt.a(p1.e.d(i11, h11, (i12 >> 6) & 14), boxScopeInstance.e(aVar2, aVar3.e()), null, t1.f15974b.f(), false, e2.h.l(300), h11, 199688, 20);
            h11.S();
        }
        androidx.compose.ui.c m11 = PaddingKt.m(boxScopeInstance.e(aVar2, aVar3.b()), 0.0f, 0.0f, 0.0f, e2.h.l(24), 7, null);
        Arrangement.m q11 = Arrangement.f3698a.q(e2.h.l(16), aVar3.i());
        b.InterfaceC0889b g12 = aVar3.g();
        h11.C(-483455358);
        a0 a14 = androidx.compose.foundation.layout.e.a(q11, g12, h11, 54);
        h11.C(i14);
        int a15 = j0.e.a(h11, i13);
        j0.k s12 = h11.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(m11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(h11);
        Updater.c(a17, a14, companion.e());
        Updater.c(a17, s12, companion.g());
        p<ComposeUiNode, Integer, wz.p> b14 = companion.b();
        if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b14);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf(i13));
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        h11.C(-978769697);
        if (h(k0Var)) {
            if (((Number) k0Var2.getValue()).intValue() < loadingAnimationsListIcons.size() && ((Number) k0Var2.getValue()).intValue() != -1) {
                intValue = loadingAnimationsListIcons.get(((Number) k0Var2.getValue()).intValue()).intValue();
            } else {
                k0Var2.setValue(Integer.valueOf(((Number) k0Var2.getValue()).intValue() + 1));
                if (((Number) k0Var2.getValue()).intValue() > loadingAnimationsListIcons.size()) {
                    k0Var2.setValue(Integer.valueOf(i13));
                }
                intValue = loadingAnimationsListIcons.get(((Number) k0Var2.getValue()).intValue()).intValue();
            }
            Painter d11 = p1.e.d(intValue, h11, i13);
            h11.C(1157296644);
            boolean T3 = h11.T(n1Var);
            Object D8 = h11.D();
            if (T3 || D8 == c0064a.a()) {
                D8 = new g00.l<androidx.compose.ui.graphics.c, wz.p>() { // from class: com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$3$2$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(androidx.compose.ui.graphics.c graphicsLayer) {
                        float c13;
                        float c14;
                        o.i(graphicsLayer, "$this$graphicsLayer");
                        c13 = LoadingScreenUiKt.c(n1Var);
                        graphicsLayer.m(c13);
                        c14 = LoadingScreenUiKt.c(n1Var);
                        graphicsLayer.w(c14);
                        graphicsLayer.t0(androidx.compose.ui.graphics.e.f7806b.a());
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.ui.graphics.c cVar) {
                        b(cVar);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D8);
            }
            h11.S();
            IconKt.a(d11, androidx.compose.ui.graphics.b.a(aVar2, (g00.l) D8), "", t1.f15974b.e(), false, e2.h.l(40), h11, 200072, 16);
            final Animatable animatable3 = animatable;
            DividersKt.a(androidx.compose.ui.graphics.b.a(y0.e.a(SizeKt.i(SizeKt.u(aVar2, e2.h.l(36)), e2.h.l(4)), c0.g.c(e2.h.l(100))), new g00.l<androidx.compose.ui.graphics.c, wz.p>() { // from class: com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$3$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.graphics.c graphicsLayer) {
                    o.i(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.m(animatable3.m().floatValue());
                    graphicsLayer.w(animatable3.m().floatValue());
                    graphicsLayer.t0(androidx.compose.ui.graphics.e.f7806b.a());
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.ui.graphics.c cVar) {
                    b(cVar);
                    return wz.p.f75480a;
                }
            }), 0.0f, 0L, h11, 0, 6);
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
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    LoadingScreenUiKt.b(loadingAnimationsListIcons, z11, i11, f11, aVar4, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(n1<Float> n1Var) {
        return n1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean h(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }
}
