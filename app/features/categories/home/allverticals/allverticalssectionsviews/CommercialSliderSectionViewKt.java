package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import c0.g;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.screens.detailsScreen.a;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.designSystem.pagerindicator.PageControlKt;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import com.google.android.gms.common.api.Api;
import e2.h;
import g00.p;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w3.a;
/* compiled from: CommercialSliderSectionView.kt */
/* loaded from: classes2.dex */
public final class CommercialSliderSectionViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final List<AdsModel> list, boolean z11, boolean z12, final p<? super AdsModel, ? super a, wz.p> pVar, AllVerticalsViewModel allVerticalsViewModel, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        boolean z13;
        boolean z14;
        AllVerticalsViewModel allVerticalsViewModel2;
        int i13;
        boolean z15;
        float l11;
        Object obj;
        w3.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(1959297282);
        if ((i12 & 2) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i12 & 4) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        if ((i12 & 16) != 0) {
            h11.C(1729797275);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, 6);
            if (a11 != null) {
                if (a11 instanceof l) {
                    aVar2 = ((l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(AllVerticalsViewModel.class, a11, null, null, aVar2, h11, 36936, 0);
                h11.S();
                allVerticalsViewModel2 = (AllVerticalsViewModel) b11;
                i13 = i11 & (-57345);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            allVerticalsViewModel2 = allVerticalsViewModel;
            i13 = i11;
        }
        if (c.I()) {
            c.U(1959297282, i13, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessCommercialAdsPager (CommercialSliderSectionView.kt:65)");
        }
        final int size = list.size();
        PagerState a12 = PagerStateKt.a(1073741823, h11, 6, 0);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(0, null, 2, null);
            h11.u(D);
        }
        h11.S();
        k0 k0Var = (k0) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(Boolean.valueOf(z13), null, 2, null);
            h11.u(D2);
        }
        h11.S();
        k0 k0Var2 = (k0) D2;
        n1<Boolean> a13 = DragInteractionKt.a(a12.n(), h11, 0);
        n1 a14 = z.a(allVerticalsViewModel2.L(), Boolean.TRUE, null, h11, 56, 2);
        if (!f(a13) && z13 && g(a14)) {
            z15 = true;
        } else {
            z15 = false;
        }
        e(k0Var2, z15);
        h11.C(475129265);
        if (d(k0Var2)) {
            Integer valueOf = Integer.valueOf(b(k0Var));
            Object[] objArr = {a12, 1073741823, Integer.valueOf(size), a13, k0Var};
            h11.C(-568225417);
            boolean z16 = false;
            for (int i14 = 0; i14 < 5; i14++) {
                z16 |= h11.T(objArr[i14]);
            }
            Object D3 = h11.D();
            if (z16 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                D3 = new CommercialSliderSectionViewKt$BusinessCommercialAdsPager$1$1(a12, 1073741823, size, a13, k0Var, null);
                h11.u(D3);
            }
            h11.S();
            u.d(valueOf, (p) D3, h11, 64);
        }
        h11.S();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c a15 = TestTagKt.a(SizeKt.h(aVar3, 0.0f, 1, null), "commercialSliderSection");
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar4 = b.f74009a;
        a0 a16 = e.a(h12, aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a17 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a18 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(a15);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a18);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a19 = Updater.a(h11);
        Updater.c(a19, a16, companion.e());
        Updater.c(a19, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
            a19.u(Integer.valueOf(a17));
            a19.p(Integer.valueOf(a17), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        float f11 = 16;
        float l12 = h.l(f11);
        float l13 = h.l(f11);
        float l14 = h.l(f11);
        if (z14) {
            l11 = h.l(0);
        } else {
            l11 = h.l(f11);
        }
        w.o d11 = PaddingKt.d(l12, l14, l13, l11);
        final int i15 = i13;
        Pager.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, a12, false, h.l(f11), d11, null, null, null, false, r0.b.b(h11, 520193703, true, new r<lk.a, Integer, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$BusinessCommercialAdsPager$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(lk.a HorizontalPager, int i16, androidx.compose.runtime.a aVar5, int i17) {
                int i18;
                int h13;
                int h14;
                int i19;
                o.i(HorizontalPager, "$this$HorizontalPager");
                if ((i17 & 112) == 0) {
                    if (aVar5.d(i16)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i18 = i19 | i17;
                } else {
                    i18 = i17;
                }
                if ((i18 & 721) == 144 && aVar5.i()) {
                    aVar5.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(520193703, i17, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessCommercialAdsPager.<anonymous>.<anonymous> (CommercialSliderSectionView.kt:118)");
                }
                h13 = CommercialSliderSectionViewKt.h(r4, size, i16);
                Integer valueOf2 = Integer.valueOf(list.size());
                h14 = CommercialSliderSectionViewKt.h(r4, size, i16);
                CommercialSliderSectionViewKt.k(list.get(h13), new com.forsale.adserver.view.screens.detailsScreen.a(null, valueOf2, null, Integer.valueOf(h14 + 1), null, null, null, null, null, 501, null), pVar, aVar5, AdsModel.A | (com.forsale.adserver.view.screens.detailsScreen.a.f21347j << 3) | ((i15 >> 3) & 896));
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(lk.a aVar5, Integer num, androidx.compose.runtime.a aVar6, Integer num2) {
                b(aVar5, num.intValue(), aVar6, num2.intValue());
                return wz.p.f75480a;
            }
        }), h11, 24582, 6, 970);
        h11.C(475130974);
        if (z14) {
            h11.C(-492369756);
            Object D4 = h11.D();
            if (D4 == androidx.compose.runtime.a.f7182a.a()) {
                obj = null;
                D4 = c0.e(Integer.valueOf(a12.k()), null, 2, null);
                h11.u(D4);
            } else {
                obj = null;
            }
            h11.S();
            k0 k0Var3 = (k0) D4;
            k0Var3.setValue(Integer.valueOf(a12.k()));
            androidx.compose.ui.c i16 = SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, obj), h.l(24));
            h11.C(693286680);
            a0 a21 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar4.l(), h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(i16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s12, companion.g());
            p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.u uVar = w.u.f74924a;
            PageControlKt.a(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(8), 7, null), k0Var3, size, null, null, null, new CommercialSliderSectionViewKt$BusinessCommercialAdsPager$2$2$1(1073741823, size), false, h11, 54, 184);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l15 = h11.l();
        if (l15 != null) {
            final boolean z17 = z13;
            final boolean z18 = z14;
            final AllVerticalsViewModel allVerticalsViewModel3 = allVerticalsViewModel2;
            l15.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$BusinessCommercialAdsPager$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i17) {
                    CommercialSliderSectionViewKt.a(list, z17, z18, pVar, allVerticalsViewModel3, aVar5, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final int b(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Integer> k0Var, int i11) {
        k0Var.setValue(Integer.valueOf(i11));
    }

    private static final boolean d(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    private static final void e(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    private static final boolean g(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i11, int i12, int i13) {
        return q(i13 - i11, i12);
    }

    public static final void i(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-942887100);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-942887100, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessCommercialLoadingState (CommercialSliderSectionView.kt:173)");
            }
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(PaddingKt.i(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(147)), h.l(16)), true, g.c(h.l(4)), 0L, 0L, h11, 54, 12), h11, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$BusinessCommercialLoadingState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    CommercialSliderSectionViewKt.i(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void j(final List<AdsModel> list, final p<? super AdsModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, wz.p> onAdClicked, androidx.compose.runtime.a aVar, final int i11) {
        boolean z11;
        o.i(onAdClicked, "onAdClicked");
        androidx.compose.runtime.a h11 = aVar.h(970791495);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(970791495, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderAdsView (CommercialSliderSectionView.kt:45)");
        }
        List<AdsModel> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$CommercialSliderAdsView$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        CommercialSliderSectionViewKt.j(list, onAdClicked, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                return;
            }
            return;
        }
        if (list.size() == 1) {
            h11.C(747456799);
            a(list, false, false, onAdClicked, null, h11, ((i11 << 6) & 7168) | 440, 16);
            h11.S();
        } else {
            h11.C(747456945);
            a(list, false, false, onAdClicked, null, h11, ((i11 << 6) & 7168) | 8, 22);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$CommercialSliderAdsView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    CommercialSliderSectionViewKt.j(list, onAdClicked, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final AdsModel adsModel, final com.forsale.adserver.view.screens.detailsScreen.a aVar, final p<? super AdsModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, wz.p> pVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar2.h(1797718741);
        if ((i11 & 14) == 0) {
            if (h11.T(adsModel)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1797718741, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.PagerItem (CommercialSliderSectionView.kt:152)");
            }
            ImageKt.a(h5.d.a(adsModel.h(), null, null, null, 0, h11, 0, 30), "", ClickableKt.e(y0.e.a(AspectRatioKt.b(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 2.33f, false, 2, null), g.c(h.l(8))), false, null, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$PagerItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    pVar.invoke(adsModel, aVar);
                }
            }, 7, null), null, androidx.compose.ui.layout.c.f8188a.b(), 0.0f, null, h11, 24624, 104);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommercialSliderSectionViewKt$PagerItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    CommercialSliderSectionViewKt.k(AdsModel.this, aVar, pVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final int q(int i11, int i12) {
        if (i12 != 0) {
            int i13 = i11 / i12;
            if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
                i13--;
            }
            return i11 - (i13 * i12);
        }
        return i11;
    }
}
