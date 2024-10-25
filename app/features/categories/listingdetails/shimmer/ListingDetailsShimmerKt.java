package com.forsale.app.features.categories.listingdetails.shimmer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import b1.v1;
import c0.g;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: ListingDetailsShimmer.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsShimmerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z11, a aVar, final int i11) {
        int i12;
        int i13;
        a h11 = aVar.h(-1737151233);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
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
                c.U(-1737151233, i12, -1, "com.forsale.app.features.categories.listingdetails.shimmer.AmenitiesSection (ListingDetailsShimmer.kt:231)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i14 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(164)), h.l(16));
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 8;
            Arrangement.f o11 = arrangement.o(h.l(f11));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i14);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            float f12 = 4;
            int i15 = (i12 << 3) & 112;
            int i16 = -1323940314;
            androidx.compose.ui.c a15 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(206)), h.l(28)), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, i15, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a15);
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
            Updater.c(a18, g11, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            int i17 = 2058660585;
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            int i18 = 1;
            Object obj = null;
            androidx.compose.ui.c d11 = SizeKt.d(aVar2, 0.0f, 1, null);
            Arrangement.f o12 = arrangement.o(h.l(f11));
            h11.C(693286680);
            a0 a19 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(d11);
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
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(841469302);
            int i19 = 0;
            int i21 = 2;
            while (i19 < i21) {
                androidx.compose.ui.c d12 = t.d(uVar, androidx.compose.ui.c.f7566a, 1.0f, false, 2, null);
                Arrangement.f o13 = Arrangement.f3698a.o(h.l(f11));
                h11.C(-483455358);
                a0 a24 = e.a(o13, b.f74009a.k(), h11, 6);
                h11.C(i16);
                int a25 = j0.e.a(h11, 0);
                k s14 = h11.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a26 = companion2.a();
                q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(d12);
                if (!(h11.k() instanceof d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a26);
                } else {
                    h11.t();
                }
                a a27 = Updater.a(h11);
                Updater.c(a27, a24, companion2.e());
                Updater.c(a27, s14, companion2.g());
                g00.p<ComposeUiNode, Integer, p> b14 = companion2.b();
                if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                    a27.u(Integer.valueOf(a25));
                    a27.p(Integer.valueOf(a25), b14);
                }
                c14.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(i17);
                f fVar2 = f.f74891a;
                h11.C(1738781089);
                int i22 = 0;
                int i23 = 3;
                while (i22 < i23) {
                    int i24 = i23;
                    int i25 = i18;
                    int i26 = i19;
                    Object obj2 = obj;
                    int i27 = i22;
                    androidx.compose.ui.c a28 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, i18, obj), h.l(24)), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, i15, 14);
                    h11.C(733328855);
                    a0 g12 = BoxKt.g(b.f74009a.o(), false, h11, 0);
                    h11.C(-1323940314);
                    int a29 = j0.e.a(h11, 0);
                    k s15 = h11.s();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a31 = companion3.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(a28);
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a31);
                    } else {
                        h11.t();
                    }
                    a a32 = Updater.a(h11);
                    Updater.c(a32, g12, companion3.e());
                    Updater.c(a32, s15, companion3.g());
                    g00.p<ComposeUiNode, Integer, p> b15 = companion3.b();
                    if (a32.f() || !o.d(a32.D(), Integer.valueOf(a29))) {
                        a32.u(Integer.valueOf(a29));
                        a32.p(Integer.valueOf(a29), b15);
                    }
                    c15.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3756a;
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    i22 = i27 + 1;
                    i17 = 2058660585;
                    i16 = -1323940314;
                    i23 = i24;
                    i19 = i26;
                    i18 = i25;
                    obj = obj2;
                }
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                i19++;
                i21 = 2;
                i16 = i16;
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
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$AmenitiesSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i28) {
                    ListingDetailsShimmerKt.a(z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z11, a aVar, final int i11, final int i12) {
        boolean z12;
        int i13;
        int i14;
        final boolean z13;
        a h11 = aVar.h(-1072137421);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            if (h11.a(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
            z13 = z12;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1072137421, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.CTAsShimmer (ListingDetailsShimmer.kt:442)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i16 = PaddingKt.i(BackgroundKt.b(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(80)), t1.f15974b.f(), null, 2, null), h.l(16));
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
            h11.C(693286680);
            b.a aVar3 = b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i16);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f11 = 48;
            float f12 = 4;
            androidx.compose.ui.c a15 = y0.e.a(t.d(uVar, SizeKt.i(aVar2, h.l(f11)), 3.0f, false, 2, null), g.c(h.l(f12)));
            dk.a aVar4 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i17).e();
            int i18 = yj.d.f76453b;
            int i19 = (i13 << 3) & 112;
            androidx.compose.ui.c a16 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a15, e11.h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g11, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a21 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(t.d(uVar, SizeKt.i(aVar2, h.l(f11)), 3.0f, false, 2, null), g.c(h.l(f12))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(a21);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, g12, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a25 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(t.d(uVar, SizeKt.i(aVar2, h.l(f11)), 1.0f, false, 2, null), g.c(h.l(f12))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g13 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(a25);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, g13, companion.e());
            Updater.c(a28, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
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
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$CTAsShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i21) {
                    ListingDetailsShimmerKt.b(z13, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z11, a aVar, final int i11, final int i12) {
        boolean z12;
        int i13;
        int i14;
        final boolean z13;
        a h11 = aVar.h(1771744570);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            if (h11.a(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
            z13 = z12;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1771744570, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.DescriptionSection (ListingDetailsShimmer.kt:266)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c i16 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(180)), h.l(f11));
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i16);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            float f12 = 4;
            androidx.compose.ui.c a15 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(206)), h.l(28)), g.c(h.l(f12)));
            dk.a aVar4 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i17).e();
            int i18 = yj.d.f76453b;
            int i19 = (i13 << 3) & 112;
            androidx.compose.ui.c a16 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a15, e11.h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g11, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a21 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(88)), g.c(h.l(f12))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(a21);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, g12, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a25 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(72)), h.l(f11)), g.c(h.l(f12))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g13 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(a25);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, g13, companion.e());
            Updater.c(a28, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
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
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$DescriptionSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i21) {
                    ListingDetailsShimmerKt.c(z13, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final boolean z11, a aVar, final int i11) {
        int i12;
        int i13;
        a h11 = aVar.h(1168015882);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
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
                androidx.compose.runtime.c.U(1168015882, i12, -1, "com.forsale.app.features.categories.listingdetails.shimmer.InformationSection (ListingDetailsShimmer.kt:133)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c i14 = PaddingKt.i(SizeKt.i(aVar2, h.l(120)), h.l(f11));
            Arrangement arrangement = Arrangement.f3698a;
            float f12 = 8;
            Arrangement.f o11 = arrangement.o(h.l(f12));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i14);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
            Arrangement.f o12 = arrangement.o(h.l(f12));
            h11.C(693286680);
            a0 a15 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(h12);
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
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f13 = 72;
            float f14 = 4;
            androidx.compose.ui.c a19 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f13)), h.l(f11)), g.c(h.l(f14)));
            dk.a aVar4 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i15).e();
            int i16 = yj.d.f76453b;
            int i17 = (i12 << 3) & 112;
            androidx.compose.ui.c a21 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a19, e11.h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(a21);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, g11, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.u(aVar2, h.l(1)), h.l(f11)), z11, null, 0L, 0L, h11, i17 | 6, 14), aVar4.a(h11, i15).e().h(h11, i16), 0.0f, 0.0f, h11, 0, 12);
            androidx.compose.ui.c a25 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f13)), h.l(f11)), g.c(h.l(f14))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(a25);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, g12, companion.e());
            Updater.c(a28, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a29 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(230)), h.l(f11)), g.c(h.l(f14))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14);
            h11.C(733328855);
            a0 g13 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a31 = j0.e.a(h11, 0);
            k s15 = h11.s();
            g00.a<ComposeUiNode> a32 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(a29);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a32);
            } else {
                h11.t();
            }
            a a33 = Updater.a(h11);
            Updater.c(a33, g13, companion.e());
            Updater.c(a33, s15, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a33.f() || !o.d(a33.D(), Integer.valueOf(a31))) {
                a33.u(Integer.valueOf(a31));
                a33.p(Integer.valueOf(a31), b15);
            }
            c15.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a34 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(128)), h.l(f11)), g.c(h.l(f14))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14);
            h11.C(733328855);
            a0 g14 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a35 = j0.e.a(h11, 0);
            k s16 = h11.s();
            g00.a<ComposeUiNode> a36 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c16 = LayoutKt.c(a34);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a36);
            } else {
                h11.t();
            }
            a a37 = Updater.a(h11);
            Updater.c(a37, g14, companion.e());
            Updater.c(a37, s16, companion.g());
            g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
            if (a37.f() || !o.d(a37.D(), Integer.valueOf(a35))) {
                a37.u(Integer.valueOf(a35));
                a37.p(Integer.valueOf(a35), b16);
            }
            c16.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c a38 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l((float) FacebookMediationAdapter.ERROR_NULL_CONTEXT)), h.l(f11)), g.c(h.l(f14))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14);
            h11.C(733328855);
            a0 g15 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a39 = j0.e.a(h11, 0);
            k s17 = h11.s();
            g00.a<ComposeUiNode> a41 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c17 = LayoutKt.c(a38);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a41);
            } else {
                h11.t();
            }
            a a42 = Updater.a(h11);
            Updater.c(a42, g15, companion.e());
            Updater.c(a42, s17, companion.g());
            g00.p<ComposeUiNode, Integer, p> b17 = companion.b();
            if (a42.f() || !o.d(a42.D(), Integer.valueOf(a39))) {
                a42.u(Integer.valueOf(a39));
                a42.p(Integer.valueOf(a39), b17);
            }
            c17.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
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
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$InformationSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i18) {
                    ListingDetailsShimmerKt.d(z11, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void e(final boolean z11, a aVar, final int i11, final int i12) {
        final int i13;
        int i14;
        a h11 = aVar.h(-2078634152);
        int i15 = i12 & 1;
        if (i15 != 0) {
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
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (i15 != 0) {
                z11 = false;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-2078634152, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmer (ListingDetailsShimmer.kt:32)");
            }
            ThemeKt.a(null, null, r0.b.b(h11, 418168623, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$ListingDetailsShimmer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i16) {
                    if ((i16 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(418168623, i16, -1, "com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmer.<anonymous> (ListingDetailsShimmer.kt:34)");
                    }
                    boolean z12 = z11;
                    int i17 = i13;
                    aVar2.C(733328855);
                    c.a aVar3 = androidx.compose.ui.c.f7566a;
                    b.a aVar4 = b.f74009a;
                    a0 g11 = BoxKt.g(aVar4.o(), false, aVar2, 0);
                    aVar2.C(-1323940314);
                    int a11 = j0.e.a(aVar2, 0);
                    k s11 = aVar2.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a12 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar3);
                    if (!(aVar2.k() instanceof d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a12);
                    } else {
                        aVar2.t();
                    }
                    a a13 = Updater.a(aVar2);
                    Updater.c(a13, g11, companion.e());
                    Updater.c(a13, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                    if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.p(Integer.valueOf(a11), b11);
                    }
                    c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                    androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
                    aVar2.C(-483455358);
                    Arrangement arrangement = Arrangement.f3698a;
                    a0 a14 = e.a(arrangement.h(), aVar4.k(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a15 = j0.e.a(aVar2, 0);
                    k s12 = aVar2.s();
                    g00.a<ComposeUiNode> a16 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(h12);
                    if (!(aVar2.k() instanceof d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a16);
                    } else {
                        aVar2.t();
                    }
                    a a17 = Updater.a(aVar2);
                    Updater.c(a17, a14, companion.e());
                    Updater.c(a17, s12, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                        a17.u(Integer.valueOf(a15));
                        a17.p(Integer.valueOf(a15), b12);
                    }
                    c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    f fVar = f.f74891a;
                    int i18 = i17 & 14;
                    ListingDetailsShimmerKt.g(z12, aVar2, i18);
                    float f11 = 8;
                    int i19 = ((i17 << 3) & 112) | 6;
                    androidx.compose.ui.c a18 = com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14);
                    dk.a aVar5 = dk.a.f54291a;
                    int i21 = dk.a.f54292b;
                    yj.d e11 = aVar5.a(aVar2, i21).e();
                    int i22 = yj.d.f76453b;
                    DividerKt.a(a18, e11.h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.d(z12, aVar2, i18);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.j(z12, aVar2, i18);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.a(z12, aVar2, i18);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.c(z12, aVar2, i18, 0);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.f(z12, aVar2, i18, 0);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.h(z12, aVar2, i18, 0);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.i(z12, aVar2, i18, 0);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(f11)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    aVar2.S();
                    aVar2.w();
                    aVar2.S();
                    aVar2.S();
                    androidx.compose.ui.c e12 = boxScopeInstance.e(ShadowKt.b(ShadowKt.b(aVar3, h.l(16), null, false, v1.b(336145228), v1.b(336145228), 6, null), h.l(0), null, false, v1.d(4293651952L), v1.d(4293651952L), 6, null), aVar4.b());
                    aVar2.C(733328855);
                    a0 g12 = BoxKt.g(aVar4.o(), false, aVar2, 0);
                    aVar2.C(-1323940314);
                    int a19 = j0.e.a(aVar2, 0);
                    k s13 = aVar2.s();
                    g00.a<ComposeUiNode> a21 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(e12);
                    if (!(aVar2.k() instanceof d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a21);
                    } else {
                        aVar2.t();
                    }
                    a a22 = Updater.a(aVar2);
                    Updater.c(a22, g12, companion.e());
                    Updater.c(a22, s13, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                    if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
                        a22.u(Integer.valueOf(a19));
                        a22.p(Integer.valueOf(a19), b13);
                    }
                    c13.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    aVar2.C(-483455358);
                    a0 a23 = e.a(arrangement.h(), aVar4.k(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a24 = j0.e.a(aVar2, 0);
                    k s14 = aVar2.s();
                    g00.a<ComposeUiNode> a25 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(aVar3);
                    if (!(aVar2.k() instanceof d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a25);
                    } else {
                        aVar2.t();
                    }
                    a a26 = Updater.a(aVar2);
                    Updater.c(a26, a23, companion.e());
                    Updater.c(a26, s14, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
                    if (a26.f() || !o.d(a26.D(), Integer.valueOf(a24))) {
                        a26.u(Integer.valueOf(a24));
                        a26.p(Integer.valueOf(a24), b14);
                    }
                    c14.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar3, h.l(1)), z12, null, 0L, 0L, aVar2, i19, 14), aVar5.a(aVar2, i21).e().h(aVar2, i22), 0.0f, 0.0f, aVar2, 0, 12);
                    ListingDetailsShimmerKt.b(z12, aVar2, i18, 0);
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

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, 384, 3);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$ListingDetailsShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i16) {
                    ListingDetailsShimmerKt.e(z11, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z11, a aVar, final int i11, final int i12) {
        final boolean z12;
        int i13;
        a h11 = aVar.h(-902809083);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            i13 = (h11.a(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            boolean z13 = i14 != 0 ? false : z12;
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-902809083, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.LocationSection (ListingDetailsShimmer.kt:301)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i15 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(173)), h.l(16));
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 8;
            Arrangement.f o11 = arrangement.o(h.l(f11));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i15);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            float f12 = 4;
            androidx.compose.ui.c a15 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(206)), h.l(28)), g.c(h.l(f12)));
            dk.a aVar4 = dk.a.f54291a;
            int i16 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i16).e();
            int i17 = yj.d.f76453b;
            int i18 = (i13 << 3) & 112;
            androidx.compose.ui.c a16 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a15, e11.h(h11, i17), null, 2, null), z13, null, 0L, 0L, h11, i18, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g11, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c d11 = SizeKt.d(aVar2, 0.0f, 1, null);
            Arrangement.f o12 = arrangement.o(h.l(12));
            h11.C(693286680);
            a0 a21 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(d11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c d12 = t.d(uVar, aVar2, 1.0f, false, 2, null);
            Arrangement.f o13 = arrangement.o(h.l(f11));
            h11.C(-483455358);
            a0 a25 = e.a(o13, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(d12);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, a25, companion.e());
            Updater.c(a28, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b14);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            androidx.compose.ui.c a29 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(166)), h.l(24)), g.c(h.l(f12))), aVar4.a(h11, i16).e().h(h11, i17), null, 2, null), z13, null, 0L, 0L, h11, i18, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a31 = j0.e.a(h11, 0);
            k s15 = h11.s();
            g00.a<ComposeUiNode> a32 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(a29);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a32);
            } else {
                h11.t();
            }
            a a33 = Updater.a(h11);
            Updater.c(a33, g12, companion.e());
            Updater.c(a33, s15, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a33.f() || !o.d(a33.D(), Integer.valueOf(a31))) {
                a33.u(Integer.valueOf(a31));
                a33.p(Integer.valueOf(a31), b15);
            }
            c15.invoke(e1.a(e1.b(h11)), h11, 0);
            int i19 = 2058660585;
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            Arrangement.f o14 = arrangement.o(h.l(f11));
            h11.C(693286680);
            a0 a34 = androidx.compose.foundation.layout.o.a(o14, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a35 = j0.e.a(h11, 0);
            k s16 = h11.s();
            g00.a<ComposeUiNode> a36 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c16 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a36);
            } else {
                h11.t();
            }
            a a37 = Updater.a(h11);
            Updater.c(a37, a34, companion.e());
            Updater.c(a37, s16, companion.g());
            g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
            if (a37.f() || !o.d(a37.D(), Integer.valueOf(a35))) {
                a37.u(Integer.valueOf(a35));
                a37.p(Integer.valueOf(a35), b16);
            }
            c16.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.C(1918852303);
            int i21 = 0;
            int i22 = 2;
            while (i21 < i22) {
                int i23 = i22;
                androidx.compose.ui.c a38 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(54)), h.l(26)), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z13, null, 0L, 0L, h11, i18, 14);
                h11.C(733328855);
                a0 g13 = BoxKt.g(b.f74009a.o(), false, h11, 0);
                h11.C(-1323940314);
                int a39 = j0.e.a(h11, 0);
                k s17 = h11.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a41 = companion2.a();
                q<e1<ComposeUiNode>, a, Integer, p> c17 = LayoutKt.c(a38);
                if (!(h11.k() instanceof d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a41);
                } else {
                    h11.t();
                }
                a a42 = Updater.a(h11);
                Updater.c(a42, g13, companion2.e());
                Updater.c(a42, s17, companion2.g());
                g00.p<ComposeUiNode, Integer, p> b17 = companion2.b();
                if (a42.f() || !o.d(a42.D(), Integer.valueOf(a39))) {
                    a42.u(Integer.valueOf(a39));
                    a42.p(Integer.valueOf(a39), b17);
                }
                c17.invoke(e1.a(e1.b(h11)), h11, 0);
                i19 = 2058660585;
                h11.C(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3756a;
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                i21++;
                i22 = i23;
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
            c.a aVar5 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c d13 = t.d(uVar, aVar5, 1.0f, false, 2, null);
            Arrangement.f o15 = Arrangement.f3698a.o(h.l(f11));
            h11.C(-483455358);
            b.a aVar6 = b.f74009a;
            a0 a43 = e.a(o15, aVar6.k(), h11, 6);
            h11.C(-1323940314);
            int a44 = j0.e.a(h11, 0);
            k s18 = h11.s();
            ComposeUiNode.Companion companion3 = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a45 = companion3.a();
            q<e1<ComposeUiNode>, a, Integer, p> c18 = LayoutKt.c(d13);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a45);
            } else {
                h11.t();
            }
            a a46 = Updater.a(h11);
            Updater.c(a46, a43, companion3.e());
            Updater.c(a46, s18, companion3.g());
            g00.p<ComposeUiNode, Integer, p> b18 = companion3.b();
            if (a46.f() || !o.d(a46.D(), Integer.valueOf(a44))) {
                a46.u(Integer.valueOf(a44));
                a46.p(Integer.valueOf(a44), b18);
            }
            c18.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(i19);
            f fVar2 = f.f74891a;
            androidx.compose.ui.c a47 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.f(aVar5, 0.0f, 1, null), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z13, null, 0L, 0L, h11, i18, 14);
            h11.C(733328855);
            a0 g14 = BoxKt.g(aVar6.o(), false, h11, 0);
            h11.C(-1323940314);
            int a48 = j0.e.a(h11, 0);
            k s19 = h11.s();
            g00.a<ComposeUiNode> a49 = companion3.a();
            q<e1<ComposeUiNode>, a, Integer, p> c19 = LayoutKt.c(a47);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a49);
            } else {
                h11.t();
            }
            a a50 = Updater.a(h11);
            Updater.c(a50, g14, companion3.e());
            Updater.c(a50, s19, companion3.g());
            g00.p<ComposeUiNode, Integer, p> b19 = companion3.b();
            if (a50.f() || !o.d(a50.D(), Integer.valueOf(a48))) {
                a50.u(Integer.valueOf(a48));
                a50.p(Integer.valueOf(a48), b19);
            }
            c19.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
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
            z12 = z13;
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$LocationSection$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(a aVar7, int i24) {
                ListingDetailsShimmerKt.f(z12, aVar7, v0.a(i11 | 1), i12);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar7, Integer num) {
                b(aVar7, num.intValue());
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final boolean z11, a aVar, final int i11) {
        int i12;
        int i13;
        a h11 = aVar.h(1156139218);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
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
                androidx.compose.runtime.c.U(1156139218, i12, -1, "com.forsale.app.features.categories.listingdetails.shimmer.MediaSection (ListingDetailsShimmer.kt:122)");
            }
            androidx.compose.ui.c a11 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(211)), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, (i12 << 3) & 112, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(b.f74009a.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
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
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$MediaSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i14) {
                    ListingDetailsShimmerKt.g(z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z11, a aVar, final int i11, final int i12) {
        final boolean z12;
        int i13;
        int i14;
        boolean z13;
        a h11 = aVar.h(1177611651);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            if (h11.a(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1177611651, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.ReportAdSection (ListingDetailsShimmer.kt:353)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i16 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(52)), h.l(16));
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.e g11 = arrangement.g();
            b.a aVar3 = b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar3.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i16);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f11 = 20;
            float f12 = 4;
            androidx.compose.ui.c a15 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(72)), h.l(f11)), g.c(h.l(f12)));
            dk.a aVar4 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i17).e();
            int i18 = yj.d.f76453b;
            int i19 = (i13 << 3) & 112;
            androidx.compose.ui.c a16 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a15, e11.h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g12, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
            h11.C(-483455358);
            a0 a21 = e.a(arrangement.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(h12);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            boolean z14 = z13;
            androidx.compose.ui.c b14 = f.f74891a.b(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(116)), h.l(f11)), g.c(h.l(f12))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14), aVar3.j());
            h11.C(733328855);
            a0 g13 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a25 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a26 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(b14);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a26);
            } else {
                h11.t();
            }
            a a27 = Updater.a(h11);
            Updater.c(a27, g13, companion.e());
            Updater.c(a27, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.p(Integer.valueOf(a25), b15);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
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
            z12 = z14;
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$ReportAdSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i21) {
                    ListingDetailsShimmerKt.h(z12, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z11, a aVar, final int i11, final int i12) {
        final boolean z12;
        int i13;
        int i14;
        boolean z13;
        a h11 = aVar.h(-758649861);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            if (h11.a(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-758649861, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.SellerSection (ListingDetailsShimmer.kt:383)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c i16 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(80)), h.l(f11));
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(h.l(12));
            h11.C(693286680);
            b.a aVar3 = b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i16);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f12 = 48;
            float f13 = 4;
            androidx.compose.ui.c a15 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f12)), h.l(f12)), g.c(h.l(f13)));
            dk.a aVar4 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i17).e();
            int i18 = yj.d.f76453b;
            int i19 = (i13 << 3) & 112;
            androidx.compose.ui.c a16 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a15, e11.h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g11, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c c13 = uVar.c(aVar2, aVar3.i());
            Arrangement.f o12 = arrangement.o(h.l(2));
            h11.C(-483455358);
            a0 a21 = e.a(o12, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(c13);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            androidx.compose.ui.c a25 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(153)), h.l(f11)), g.c(h.l(f13))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g12 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s14 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(a25);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, g12, companion.e());
            Updater.c(a28, s14, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b14);
            }
            c15.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            int i21 = i19 | 6;
            androidx.compose.ui.c a29 = com.forsale.ui.components.skeleton.a.a(SizeKt.h(aVar2, 0.0f, 1, null), z13, null, 0L, 0L, h11, i21, 14);
            Arrangement.f o13 = arrangement.o(h.l(f13));
            h11.C(693286680);
            a0 a31 = androidx.compose.foundation.layout.o.a(o13, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a32 = j0.e.a(h11, 0);
            k s15 = h11.s();
            g00.a<ComposeUiNode> a33 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c16 = LayoutKt.c(a29);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a33);
            } else {
                h11.t();
            }
            a a34 = Updater.a(h11);
            Updater.c(a34, a31, companion.e());
            Updater.c(a34, s15, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a34.f() || !o.d(a34.D(), Integer.valueOf(a32))) {
                a34.u(Integer.valueOf(a32));
                a34.p(Integer.valueOf(a32), b15);
            }
            c16.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            float f14 = 72;
            androidx.compose.ui.c a35 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f14)), h.l(f11)), g.c(h.l(f13))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g13 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a36 = j0.e.a(h11, 0);
            k s16 = h11.s();
            g00.a<ComposeUiNode> a37 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c17 = LayoutKt.c(a35);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a37);
            } else {
                h11.t();
            }
            a a38 = Updater.a(h11);
            Updater.c(a38, g13, companion.e());
            Updater.c(a38, s16, companion.g());
            g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
            if (a38.f() || !o.d(a38.D(), Integer.valueOf(a36))) {
                a38.u(Integer.valueOf(a36));
                a38.p(Integer.valueOf(a36), b16);
            }
            c17.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            DividerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.u(aVar2, h.l(1)), h.l(f11)), z13, null, 0L, 0L, h11, i21, 14), aVar4.a(h11, i17).e().h(h11, i18), 0.0f, 0.0f, h11, 0, 12);
            androidx.compose.ui.c a39 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f14)), h.l(f11)), g.c(h.l(f13))), aVar4.a(h11, i17).e().h(h11, i18), null, 2, null), z13, null, 0L, 0L, h11, i19, 14);
            h11.C(733328855);
            a0 g14 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a41 = j0.e.a(h11, 0);
            k s17 = h11.s();
            g00.a<ComposeUiNode> a42 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c18 = LayoutKt.c(a39);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a42);
            } else {
                h11.t();
            }
            a a43 = Updater.a(h11);
            Updater.c(a43, g14, companion.e());
            Updater.c(a43, s17, companion.g());
            g00.p<ComposeUiNode, Integer, p> b17 = companion.b();
            if (a43.f() || !o.d(a43.D(), Integer.valueOf(a41))) {
                a43.u(Integer.valueOf(a41));
                a43.p(Integer.valueOf(a41), b17);
            }
            c18.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
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
            z12 = z13;
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$SellerSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i22) {
                    ListingDetailsShimmerKt.i(z12, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final boolean z11, a aVar, final int i11) {
        int i12;
        int i13;
        a h11 = aVar.h(1341997514);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
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
                androidx.compose.runtime.c.U(1341997514, i12, -1, "com.forsale.app.features.categories.listingdetails.shimmer.SpecificationsSection (ListingDetailsShimmer.kt:197)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i14 = PaddingKt.i(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(204)), h.l(16));
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 8;
            Arrangement.f o11 = arrangement.o(h.l(f11));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i14);
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            float f12 = 4;
            int i15 = (i12 << 3) & 112;
            int i16 = -1323940314;
            androidx.compose.ui.c a15 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(206)), h.l(28)), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, i15, 14);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a15);
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
            Updater.c(a18, g11, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            int i17 = 2058660585;
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            int i18 = 1;
            Object obj = null;
            androidx.compose.ui.c d11 = SizeKt.d(aVar2, 0.0f, 1, null);
            Arrangement.f o12 = arrangement.o(h.l(f11));
            h11.C(693286680);
            a0 a19 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(d11);
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
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h11.C(535507541);
            int i19 = 0;
            int i21 = 2;
            while (i19 < i21) {
                androidx.compose.ui.c d12 = t.d(uVar, androidx.compose.ui.c.f7566a, 1.0f, false, 2, null);
                Arrangement.f o13 = Arrangement.f3698a.o(h.l(f11));
                h11.C(-483455358);
                a0 a24 = e.a(o13, b.f74009a.k(), h11, 6);
                h11.C(i16);
                int a25 = j0.e.a(h11, 0);
                k s14 = h11.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a26 = companion2.a();
                q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(d12);
                if (!(h11.k() instanceof d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a26);
                } else {
                    h11.t();
                }
                a a27 = Updater.a(h11);
                Updater.c(a27, a24, companion2.e());
                Updater.c(a27, s14, companion2.g());
                g00.p<ComposeUiNode, Integer, p> b14 = companion2.b();
                if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
                    a27.u(Integer.valueOf(a25));
                    a27.p(Integer.valueOf(a25), b14);
                }
                c14.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(i17);
                f fVar2 = f.f74891a;
                h11.C(1465482496);
                int i22 = 0;
                int i23 = 3;
                while (i22 < i23) {
                    int i24 = i23;
                    int i25 = i18;
                    int i26 = i19;
                    Object obj2 = obj;
                    int i27 = i22;
                    androidx.compose.ui.c a28 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, i18, obj), h.l(40)), g.c(h.l(f12))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, i15, 14);
                    h11.C(733328855);
                    a0 g12 = BoxKt.g(b.f74009a.o(), false, h11, 0);
                    h11.C(-1323940314);
                    int a29 = j0.e.a(h11, 0);
                    k s15 = h11.s();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a31 = companion3.a();
                    q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(a28);
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a31);
                    } else {
                        h11.t();
                    }
                    a a32 = Updater.a(h11);
                    Updater.c(a32, g12, companion3.e());
                    Updater.c(a32, s15, companion3.g());
                    g00.p<ComposeUiNode, Integer, p> b15 = companion3.b();
                    if (a32.f() || !o.d(a32.D(), Integer.valueOf(a29))) {
                        a32.u(Integer.valueOf(a29));
                        a32.p(Integer.valueOf(a29), b15);
                    }
                    c15.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3756a;
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    i22 = i27 + 1;
                    i17 = 2058660585;
                    i16 = -1323940314;
                    i23 = i24;
                    i19 = i26;
                    i18 = i25;
                    obj = obj2;
                }
                h11.S();
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                i19++;
                i21 = 2;
                i16 = i16;
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
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt$SpecificationsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i28) {
                    ListingDetailsShimmerKt.j(z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
