package com.forsale.app.features.categories.listingdetails.buyerscreen.forsalerealty;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import b1.t1;
import c0.g;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
import y0.e;
import yj.d;
/* compiled from: ForSaleRealtySection.kt */
/* loaded from: classes2.dex */
public final class ForSaleRealtySectionKt {
    public static final void a(final a<p> onContactUsClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        o.i(onContactUsClicked, "onContactUsClicked");
        androidx.compose.runtime.a h11 = aVar.h(39356771);
        if ((i11 & 14) == 0) {
            if (h11.F(onContactUsClicked)) {
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
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(39356771, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.forsalerealty.ForSaleRealtySection (ForSaleRealtySection.kt:35)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 8;
            androidx.compose.ui.c a11 = e.a(SizeKt.h(aVar3, 0.0f, 1, null), g.c(h.l(f11)));
            dk.a aVar4 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            d f12 = aVar4.a(h11, i14).f();
            int i15 = d.f76453b;
            androidx.compose.ui.c b11 = BackgroundKt.b(a11, f12.h(h11, i15), null, 2, null);
            h11.C(733328855);
            b.a aVar5 = b.f74009a;
            a0 g11 = BoxKt.g(aVar5.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            float f13 = 12;
            androidx.compose.ui.c i16 = PaddingKt.i(aVar3, h.l(f13));
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(h.l(f13));
            b.c i17 = aVar5.i();
            int i18 = i12;
            h11.C(693286680);
            a0 a15 = androidx.compose.foundation.layout.o.a(o11, i17, h11, 54);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i16);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
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
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            IconKt.a(p1.e.d(q0.H, h11, 0), PaddingKt.i(BackgroundKt.b(e.a(aVar3, g.c(h.l(f11))), aVar4.a(h11, i14).f().i(h11, i15), null, 2, null), h.l(f11)), "", t1.f15974b.e(), false, h.l(32), h11, 200072, 16);
            androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
            Arrangement.f o12 = arrangement.o(h.l(2));
            b.InterfaceC0889b k11 = aVar5.k();
            h11.C(-483455358);
            a0 a19 = androidx.compose.foundation.layout.e.a(o12, k11, h11, 54);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(h12);
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
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b14);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            TextKt.a(p1.g.b(y0.f70649r1, h11, 0), TestTagKt.a(aVar3, "txtTitle"), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).c(), aVar4.a(h11, i14).f().m(h11, i15), 0, h11, 48, 0, 1276);
            androidx.compose.ui.c h13 = SizeKt.h(aVar3, 0.0f, 1, null);
            Arrangement.f o13 = arrangement.o(h.l(4));
            b.c i19 = aVar5.i();
            h11.C(693286680);
            a0 a24 = androidx.compose.foundation.layout.o.a(o13, i19, h11, 54);
            h11.C(-1323940314);
            int a25 = j0.e.a(h11, 0);
            k s14 = h11.s();
            a<ComposeUiNode> a26 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(h13);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a26);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a27 = Updater.a(h11);
            Updater.c(a27, a24, companion.e());
            Updater.c(a27, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.p(Integer.valueOf(a25), b15);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            TextKt.a(p1.g.b(y0.f70632q1, h11, 0), uVar.a(aVar3, 1.0f, false), 0, 0, false, 1, 0, null, aVar4.c(h11, i14).d(), aVar4.a(h11, i14).f().k(h11, i15), 0, h11, 196608, 0, 1244);
            aVar2 = h11;
            ButtonsKt.l(onContactUsClicked, TestTagKt.a(aVar3, "btnContactUs"), ButtonData.f40994a.e(), false, PaddingKt.a(h.l(0)), aVar4.a(h11, i14).f(), null, null, null, null, ComposableSingletons$ForSaleRealtySectionKt.f25866a.a(), h11, (i18 & 14) | 24624 | (ButtonData.f40995b << 6) | (i15 << 15), 6, 968);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.forsalerealty.ForSaleRealtySectionKt$ForSaleRealtySection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar6, int i21) {
                    ForSaleRealtySectionKt.a(onContactUsClicked, aVar6, v0.a(i11 | 1));
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
