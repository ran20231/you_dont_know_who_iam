package com.forsale.app.features.categories.listingdetails.shimmer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
/* compiled from: AdsShimmer.kt */
/* loaded from: classes2.dex */
public final class AdsShimmerKt {
    public static final void a(boolean z11, a aVar, final int i11, final int i12) {
        boolean z12;
        final int i13;
        int i14;
        boolean z13;
        final boolean z14;
        a h11 = aVar.h(-1908347047);
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
            z14 = z12;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (c.I()) {
                c.U(-1908347047, i13, -1, "com.forsale.app.features.categories.listingdetails.shimmer.AdsSectionShimmer (AdsShimmer.kt:50)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(335)), h.l(f11), h.l(f11), 0.0f, h.l(f11), 4, null);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(h.l(8));
            h11.C(-483455358);
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(m11);
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
            boolean z15 = z13;
            androidx.compose.ui.c a15 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(206)), h.l(28)), g.c(h.l(4))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null), z13, null, 0L, 0L, h11, (i13 << 3) & 112, 14);
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
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            androidx.compose.ui.c A = SizeKt.A(aVar2, null, false, 3, null);
            Arrangement.f o12 = arrangement.o(h.l(12));
            Boolean valueOf = Boolean.valueOf(z15);
            h11.C(1157296644);
            boolean T = h11.T(valueOf);
            Object D = h11.D();
            if (!T && D != a.f7182a.a()) {
                z14 = z15;
            } else {
                z14 = z15;
                D = new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.AdsShimmerKt$AdsSectionShimmer$1$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        final boolean z16 = z14;
                        final int i16 = i13;
                        LazyListScope.e(LazyRow, 8, null, null, r0.b.c(-1085660274, true, new r<x.a, Integer, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.AdsShimmerKt$AdsSectionShimmer$1$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            public final void b(x.a items, int i17, a aVar4, int i18) {
                                o.i(items, "$this$items");
                                if ((i18 & 641) == 128 && aVar4.i()) {
                                    aVar4.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-1085660274, i18, -1, "com.forsale.app.features.categories.listingdetails.shimmer.AdsSectionShimmer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsShimmer.kt:72)");
                                }
                                androidx.compose.ui.c a19 = com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(255)), h.l(267)), g.c(h.l(4))), dk.a.f54291a.a(aVar4, dk.a.f54292b).e().h(aVar4, yj.d.f76453b), null, 2, null), z16, null, 0L, 0L, aVar4, (i16 << 3) & 112, 14);
                                aVar4.C(733328855);
                                a0 g12 = BoxKt.g(b.f74009a.o(), false, aVar4, 0);
                                aVar4.C(-1323940314);
                                int a21 = j0.e.a(aVar4, 0);
                                k s13 = aVar4.s();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                                g00.a<ComposeUiNode> a22 = companion2.a();
                                q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(a19);
                                if (!(aVar4.k() instanceof d)) {
                                    j0.e.c();
                                }
                                aVar4.I();
                                if (aVar4.f()) {
                                    aVar4.y(a22);
                                } else {
                                    aVar4.t();
                                }
                                a a23 = Updater.a(aVar4);
                                Updater.c(a23, g12, companion2.e());
                                Updater.c(a23, s13, companion2.g());
                                g00.p<ComposeUiNode, Integer, p> b13 = companion2.b();
                                if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                                    a23.u(Integer.valueOf(a21));
                                    a23.p(Integer.valueOf(a21), b13);
                                }
                                c13.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                                aVar4.C(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3756a;
                                aVar4.S();
                                aVar4.w();
                                aVar4.S();
                                aVar4.S();
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.r
                            public /* bridge */ /* synthetic */ p d(x.a aVar4, Integer num, a aVar5, Integer num2) {
                                b(aVar4, num.intValue(), aVar5, num2.intValue());
                                return p.f75480a;
                            }
                        }), 6, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            LazyDslKt.b(A, null, null, false, o12, null, null, false, (l) D, h11, 12607494, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.shimmer.AdsShimmerKt$AdsSectionShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i16) {
                    AdsShimmerKt.a(z14, aVar4, v0.a(i11 | 1), i12);
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
