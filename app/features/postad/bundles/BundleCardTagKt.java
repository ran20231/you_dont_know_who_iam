package com.forsale.app.features.postad.bundles;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.t0;
import j0.v0;
import kotlin.jvm.internal.o;
import t9.q0;
import v0.b;
import w.u;
import wz.p;
/* compiled from: BundleCardTag.kt */
/* loaded from: classes2.dex */
public final class BundleCardTagKt {
    public static final void a(androidx.compose.ui.c cVar, final String text, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final Object obj;
        final int i13;
        int i14;
        int i15;
        c.a aVar2;
        o.i(text, "text");
        androidx.compose.runtime.a h11 = aVar.h(2088232469);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            obj = cVar;
        } else if ((i11 & 14) == 0) {
            obj = cVar;
            if (h11.T(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            obj = cVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(text)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (i16 != 0) {
                aVar2 = androidx.compose.ui.c.f7566a;
            } else {
                aVar2 = obj;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(2088232469, i13, -1, "com.forsale.app.features.postad.bundles.BundleCardTag (BundleCardTag.kt:30)");
            }
            int i17 = i13 & 14;
            h11.C(733328855);
            b.a aVar3 = v0.b.f74009a;
            int i18 = i17 >> 3;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, (i18 & 112) | (i18 & 14));
            h11.C(-1323940314);
            int a11 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i19 >> 3) & 112));
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.C(693286680);
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            a0 a14 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), aVar3.l(), h11, 0);
            h11.C(-1323940314);
            int a15 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a16 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar4);
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
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.p(Integer.valueOf(a15), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c i21 = SizeKt.i(aVar4, e2.h.l(20));
            float f11 = 8;
            androidx.compose.ui.c a18 = y0.e.a(i21, c0.g.e(e2.h.l(f11), 0.0f, 0.0f, 0.0f, 14, null));
            dk.a aVar5 = dk.a.f54291a;
            int i22 = dk.a.f54292b;
            yj.d c13 = aVar5.a(h11, i22).c();
            int i23 = yj.d.f76453b;
            androidx.compose.ui.c cVar2 = aVar2;
            androidx.compose.ui.c a19 = BackgroundKt.a(a18, c13.i(h11, i23), c0.g.e(e2.h.l(f11), 0.0f, 0.0f, 0.0f, 14, null));
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(a19);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, g12, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            CompositionLocalKt.b(new t0[]{TextKt.i().c(1), TextKt.j().c(1)}, r0.b.b(h11, 1555791077, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundleCardTagKt$BundleCardTag$1$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i24) {
                    if ((i24 & 11) == 2 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1555791077, i24, -1, "com.forsale.app.features.postad.bundles.BundleCardTag.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BundleCardTag.kt:46)");
                    }
                    androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, e2.h.l(6), 0.0f, 2, null);
                    dk.a aVar7 = dk.a.f54291a;
                    int i25 = dk.a.f54292b;
                    TextKt.a(text, k11, 0, 0, false, 0, 0, null, aVar7.c(aVar6, i25).h(), aVar7.a(aVar6, i25).g().c(aVar6, yj.d.f76453b), 0, aVar6, ((i13 >> 3) & 14) | 48, 0, 1276);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, 56);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            IconKt.a(p1.e.d(q0.f69760i2, h11, 0), null, null, aVar5.a(h11, i22).c().i(h11, i23), h11, 56, 4);
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
            obj = cVar2;
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.BundleCardTagKt$BundleCardTag$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i24) {
                    BundleCardTagKt.a(androidx.compose.ui.c.this, text, aVar6, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
