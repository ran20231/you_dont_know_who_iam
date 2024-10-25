package com.forsale.app.features.postad.bundles;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.dividers.DividersKt;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import t9.y0;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: OrDividerView.kt */
/* loaded from: classes2.dex */
public final class OrDividerViewKt {
    public static final void a(androidx.compose.ui.c cVar, long j11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        Object obj;
        int i13;
        int i14;
        long j12;
        Object obj2;
        androidx.compose.ui.c cVar2;
        androidx.compose.runtime.a aVar2;
        final long j13;
        final androidx.compose.ui.c cVar3;
        int i15;
        androidx.compose.runtime.a h11 = aVar.h(1162027985);
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
            i13 = i11 | i14;
        } else {
            obj = cVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                j12 = j11;
                if (h11.e(j12)) {
                    i15 = 32;
                    i13 |= i15;
                }
            } else {
                j12 = j11;
            }
            i15 = 16;
            i13 |= i15;
        } else {
            j12 = j11;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
            cVar3 = obj;
            j13 = j12;
            aVar2 = h11;
        } else {
            h11.G();
            if ((i11 & 1) != 0 && !h11.N()) {
                h11.L();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                cVar2 = obj;
            } else {
                if (i16 != 0) {
                    obj2 = androidx.compose.ui.c.f7566a;
                } else {
                    obj2 = obj;
                }
                if ((i12 & 2) != 0) {
                    j12 = dk.a.f54291a.a(h11, dk.a.f54292b).e().e(h11, yj.d.f76453b);
                    i13 &= -113;
                }
                cVar2 = obj2;
            }
            long j14 = j12;
            h11.x();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1162027985, i13, -1, "com.forsale.app.features.postad.bundles.OrDividerView (OrDividerView.kt:23)");
            }
            androidx.compose.ui.c h12 = SizeKt.h(cVar2, 0.0f, 1, null);
            b.a aVar3 = v0.b.f74009a;
            b.c i17 = aVar3.i();
            Arrangement.e p11 = Arrangement.f3698a.p(e2.h.l(8), aVar3.k());
            h11.C(693286680);
            a0 a11 = o.a(p11, i17, h11, 54);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
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
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            int i18 = (i13 << 3) & 896;
            DividersKt.a(t.d(uVar, aVar4, 0.5f, false, 2, null), 0.0f, j14, h11, i18, 2);
            String b12 = p1.g.b(y0.Fa, h11, 0);
            dk.a aVar5 = dk.a.f54291a;
            int i19 = dk.a.f54292b;
            androidx.compose.ui.c cVar4 = cVar2;
            aVar2 = h11;
            TextKt.a(b12, null, 0, 0, false, 0, 0, null, aVar5.c(h11, i19).h(), aVar5.a(h11, i19).e().j(h11, yj.d.f76453b), 0, h11, 0, 0, 1278);
            DividersKt.a(t.d(uVar, aVar4, 0.5f, false, 2, null), 0.0f, j14, aVar2, i18, 2);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            j13 = j14;
            cVar3 = cVar4;
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.OrDividerViewKt$OrDividerView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i21) {
                    OrDividerViewKt.a(androidx.compose.ui.c.this, j13, aVar6, v0.a(i11 | 1), i12);
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
