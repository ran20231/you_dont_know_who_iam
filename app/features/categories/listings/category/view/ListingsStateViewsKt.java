package com.forsale.app.features.categories.listings.category.view;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.designSystem.SurfaceKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import sj.d;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: ListingsStateViews.kt */
/* loaded from: classes2.dex */
public final class ListingsStateViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r17, final int r18, final java.lang.Integer r19, final int r20, java.lang.Integer r21, g00.a<wz.p> r22, androidx.compose.runtime.a r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt.a(java.lang.String, int, java.lang.Integer, int, java.lang.Integer, g00.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void b(final a<p> onRetryClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onRetryClicked, "onRetryClicked");
        androidx.compose.runtime.a h11 = aVar.h(-992255175);
        if ((i11 & 14) == 0) {
            if (h11.F(onRetryClicked)) {
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
                c.U(-992255175, i12, -1, "com.forsale.app.features.categories.listings.category.view.ConnectivityErrorState (ListingsStateViews.kt:94)");
            }
            a(null, y0.Td, Integer.valueOf(y0.Ud), d.P, Integer.valueOf(y0.Vd), onRetryClicked, h11, (i12 << 15) & 458752, 1);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$ConnectivityErrorState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.b(onRetryClicked, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final a<p> resetAll, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(resetAll, "resetAll");
        androidx.compose.runtime.a h11 = aVar.h(-724337862);
        if ((i11 & 14) == 0) {
            if (h11.F(resetAll)) {
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
                c.U(-724337862, i12, -1, "com.forsale.app.features.categories.listings.category.view.EmptyMessageWithFilters (ListingsStateViews.kt:112)");
            }
            a(null, y0.f70673s9, Integer.valueOf(y0.f70705u9), d.B, Integer.valueOf(y0.f70657r9), resetAll, h11, (i12 << 15) & 458752, 1);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$EmptyMessageWithFilters$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.c(resetAll, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final a<p> goBack, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(goBack, "goBack");
        androidx.compose.runtime.a h11 = aVar.h(1333287564);
        if ((i11 & 14) == 0) {
            if (h11.F(goBack)) {
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
                c.U(1333287564, i12, -1, "com.forsale.app.features.categories.listings.category.view.EmptyMessageWithOutFilters (ListingsStateViews.kt:121)");
            }
            a(null, y0.f70640q9, Integer.valueOf(y0.f70689t9), d.B, Integer.valueOf(y0.f70623p9), goBack, h11, (i12 << 15) & 458752, 1);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$EmptyMessageWithOutFilters$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.d(goBack, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void e(final String searchKeyword, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(searchKeyword, "searchKeyword");
        androidx.compose.runtime.a h11 = aVar.h(1128679335);
        if ((i11 & 14) == 0) {
            if (h11.T(searchKeyword)) {
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
                c.U(1128679335, i12, -1, "com.forsale.app.features.categories.listings.category.view.EmptyMessageWithOutFiltersSearchIntention (ListingsStateViews.kt:129)");
            }
            a(searchKeyword, y0.Aa, null, q0.O1, null, null, h11, (i12 & 14) | 384, 48);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$EmptyMessageWithOutFiltersSearchIntention$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.e(searchKeyword, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final a<p> onRetryClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onRetryClicked, "onRetryClicked");
        androidx.compose.runtime.a h11 = aVar.h(27536900);
        if ((i11 & 14) == 0) {
            if (h11.F(onRetryClicked)) {
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
                c.U(27536900, i12, -1, "com.forsale.app.features.categories.listings.category.view.GeneralErrorState (ListingsStateViews.kt:103)");
            }
            a(null, y0.Rd, Integer.valueOf(y0.Sd), d.f68685v, Integer.valueOf(y0.Vd), onRetryClicked, h11, (i12 << 15) & 458752, 1);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$GeneralErrorState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.f(onRetryClicked, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void g(final androidx.compose.ui.c modifier, final ListingsTypes listingsTypes, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        int i14;
        int i15;
        o.i(modifier, "modifier");
        o.i(listingsTypes, "listingsTypes");
        androidx.compose.runtime.a h11 = aVar.h(-457356362);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(listingsTypes)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(-457356362, i12, -1, "com.forsale.app.features.categories.listings.category.view.ListingShimmerEffect (ListingsStateViews.kt:28)");
            }
            int i16 = i12 & 14;
            h11.C(-483455358);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.m h12 = arrangement.h();
            b.a aVar4 = b.f74009a;
            int i17 = i16 >> 3;
            a0 a11 = e.a(h12, aVar4.k(), h11, (i17 & 112) | (i17 & 14));
            h11.C(-1323940314);
            int i18 = 0;
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(modifier);
            int i19 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
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
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i19 >> 3) & 112));
            h11.C(2058660585);
            f fVar = f.f74891a;
            int i21 = 8;
            if (listingsTypes == ListingsTypes.MY_LISTINGS) {
                h11.C(653147939);
                i(h11, 0);
                h11.S();
                i13 = 0;
                aVar2 = h11;
            } else {
                h11.C(653147977);
                h(h11, 0);
                Arrangement.f o11 = arrangement.o(h.l(12));
                androidx.compose.ui.c b12 = ScrollKt.b(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 0.0f, 0.0f, 14, null), ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null);
                h11.C(693286680);
                a0 a15 = androidx.compose.foundation.layout.o.a(o11, aVar4.l(), h11, 6);
                h11.C(-1323940314);
                int a16 = j0.e.a(h11, 0);
                k s12 = h11.s();
                a<ComposeUiNode> a17 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b12);
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
                h11.C(653148250);
                int i22 = 0;
                int i23 = 4;
                while (i22 < i23) {
                    SurfaceKt.c(com.forsale.ui.components.skeleton.a.a(SizeKt.p(androidx.compose.ui.c.f7566a, h.l(159)), true, g.c(h.l(i21)), 0L, 0L, h11, 54, 12), null, 0L, 0L, null, 0.0f, ComposableSingletons$ListingsStateViewsKt.f28855a.a(), h11, 1572864, 62);
                    i22++;
                    h11 = h11;
                    i23 = i23;
                    i18 = i18;
                    i21 = 8;
                }
                i13 = i18;
                aVar2 = h11;
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                aVar2.S();
            }
            androidx.compose.runtime.a aVar5 = aVar2;
            aVar5.C(2094986188);
            int i24 = i13;
            while (i24 < 5) {
                c.a aVar6 = androidx.compose.ui.c.f7566a;
                SpacerKt.a(SizeKt.i(aVar6, h.l(12)), aVar5, 6);
                SurfaceKt.c(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.h(PaddingKt.k(aVar6, h.l(16), 0.0f, 2, null), 0.0f, 1, null), h.l(140)), true, g.c(h.l(8)), 0L, 0L, aVar5, 54, 12), null, 0L, 0L, null, 0.0f, ComposableSingletons$ListingsStateViewsKt.f28855a.b(), aVar5, 1572864, 62);
                i24++;
                aVar5 = aVar5;
            }
            aVar3 = aVar5;
            aVar3.S();
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$ListingShimmerEffect$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar7, int i25) {
                    ListingsStateViewsKt.g(androidx.compose.ui.c.this, listingsTypes, aVar7, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                    b(aVar7, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-450693558);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-450693558, i11, -1, "com.forsale.app.features.categories.listings.category.view.ListingsTitle (ListingsStateViews.kt:61)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            SurfaceKt.c(com.forsale.ui.components.skeleton.a.a(SizeKt.h(PaddingKt.m(SizeKt.i(aVar2, h.l(56)), 0.0f, 0.0f, 0.0f, h.l(16), 7, null), 0.0f, 1, null), true, g.c(h.l(8)), 0L, 0L, h11, 54, 12), null, 0L, 0L, null, 0.0f, ComposableSingletons$ListingsStateViewsKt.f28855a.c(), h11, 1572864, 62);
            SpacerKt.a(SizeKt.i(aVar2, h.l(12)), h11, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$ListingsTitle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    ListingsStateViewsKt.h(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1393043058);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1393043058, i11, -1, "com.forsale.app.features.categories.listings.category.view.MyListingsChipsShimmer (ListingsStateViews.kt:73)");
            }
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
            float f11 = 16;
            int i12 = 0;
            androidx.compose.ui.c b11 = ScrollKt.b(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, 0.0f, 0.0f, 14, null), ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null);
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, b.f74009a.l(), h11, 6);
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
            h11.C(-1618908042);
            int i13 = 0;
            while (i13 < 3) {
                SurfaceKt.c(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(100)), h.l(20)), true, g.c(h.l(8)), 0L, 0L, h11, 54, 12), null, 0L, 0L, null, 0.0f, ComposableSingletons$ListingsStateViewsKt.f28855a.d(), h11, 1572864, 62);
                i13++;
                i12 = i12;
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(f11)), h11, 6);
            h(h11, i12);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.ListingsStateViewsKt$MyListingsChipsShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ListingsStateViewsKt.i(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
