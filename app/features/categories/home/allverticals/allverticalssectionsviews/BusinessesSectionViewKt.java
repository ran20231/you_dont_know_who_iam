package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import r5.g;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
import yj.d;
/* compiled from: BusinessesSectionView.kt */
/* loaded from: classes2.dex */
public final class BusinessesSectionViewKt {
    public static final void a(final boolean z11, a aVar, final int i11) {
        int i12;
        q<t, a, Integer, p> qVar;
        int i13;
        int i14;
        a h11 = aVar.h(1564564679);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1564564679, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessHeader (BusinessesSectionView.kt:96)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            if (D == a.f7182a.a()) {
                if (z11) {
                    i13 = y0.D;
                } else {
                    i13 = y0.E;
                }
                D = c0.e(Integer.valueOf(i13), null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            if (z11) {
                qVar = ComposableSingletons$BusinessesSectionViewKt.f23575a.a();
            } else {
                qVar = null;
            }
            SectionTitleKt.a(TestTagKt.a(androidx.compose.ui.c.f7566a, "businessesSectionTitle"), null, b.b(h11, -758846519, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessHeader$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    int b11;
                    if ((i15 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-758846519, i15, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessHeader.<anonymous> (BusinessesSectionView.kt:102)");
                    }
                    b11 = BusinessesSectionViewKt.b(k0Var);
                    TextKt.a(g.b(b11, aVar2, 0), null, 0, 0, false, 0, 1, null, null, 0L, 0, aVar2, 1572864, 0, 1982);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), qVar, null, null, h11, 390, 50);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessHeader$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    BusinessesSectionViewKt.a(z11, aVar2, v0.a(i11 | 1));
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
    public static final int b(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    public static final void c(final CategoryEntity category, final l<? super CategoryEntity, p> onCategoryClicked, a aVar, final int i11) {
        o.i(category, "category");
        o.i(onCategoryClicked, "onCategoryClicked");
        a h11 = aVar.h(1534247323);
        if (c.I()) {
            c.U(1534247323, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesItem (BusinessesSectionView.kt:132)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        float f11 = 8;
        androidx.compose.ui.c e11 = ClickableKt.e(PaddingKt.i(BackgroundKt.a(aVar2, aVar3.a(h11, i12).e().h(h11, d.f76453b), c0.g.c(h.l(f11))), h.l(f11)), false, null, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessesItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onCategoryClicked.invoke(category);
            }
        }, 7, null);
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
        b.InterfaceC0889b g11 = v0.b.f74009a.g();
        h11.C(-483455358);
        a0 a11 = e.a(o11, g11, h11, 54);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(e11);
        if (!(h11.k() instanceof j0.d)) {
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
        ImageKt.a(h5.d.a(new g.a((Context) h11.q(AndroidCompositionLocals_androidKt.g())).b(category.getFeaturedImage()).p(s5.g.f68399d).d(sj.d.A).e(sj.d.A).a(), null, null, null, 0, h11, 8, 30), null, SizeKt.u(aVar2, h.l(90)), null, null, 0.0f, null, h11, 432, 120);
        TextKt.a(category.getName(), SizeKt.h(aVar2, 0.0f, 1, null), b2.f.f16081b.a(), 0, false, 1, 0, null, aVar3.c(h11, i12).c(), 0L, 0, h11, 196656, 0, 1752);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessesItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar4, int i13) {
                    BusinessesSectionViewKt.c(CategoryEntity.this, onCategoryClicked, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final List<CategoryEntity> businessesCategories, final l<? super CategoryEntity, p> onCategoryClicked, int i11, a aVar, final int i12, final int i13) {
        o.i(businessesCategories, "businessesCategories");
        o.i(onCategoryClicked, "onCategoryClicked");
        a h11 = aVar.h(-1370453466);
        if ((i13 & 4) != 0) {
            i11 = 3;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1370453466, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesList (BusinessesSectionView.kt:119)");
        }
        float f11 = 12;
        FixedGridViewKt.a(businessesCategories, i11, TestTagKt.a(androidx.compose.ui.c.f7566a, "businessSectionItems"), h.l(f11), h.l(f11), r0.b.b(h11, -2082352307, true, new r<w.c, CategoryEntity, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessesList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(w.c FixedGridView, CategoryEntity it2, a aVar2, int i14) {
                o.i(FixedGridView, "$this$FixedGridView");
                o.i(it2, "it");
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-2082352307, i14, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesList.<anonymous> (BusinessesSectionView.kt:127)");
                }
                BusinessesSectionViewKt.c(it2, onCategoryClicked, aVar2, (i12 & 112) | 8);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(w.c cVar, CategoryEntity categoryEntity, a aVar2, Integer num) {
                b(cVar, categoryEntity, aVar2, num.intValue());
                return p.f75480a;
            }
        }), h11, ((i12 >> 3) & 112) | 224648, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final int i14 = i11;
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessesList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    BusinessesSectionViewKt.d(businessesCategories, onCategoryClicked, i14, aVar2, v0.a(i12 | 1), i13);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void e(final AllVerticalsViewModel.a businessesCategoriesState, final l<? super CategoryEntity, p> onCategoryClicked, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(businessesCategoriesState, "businessesCategoriesState");
        o.i(onCategoryClicked, "onCategoryClicked");
        a h11 = aVar.h(-72288355);
        if ((i11 & 14) == 0) {
            if (h11.T(businessesCategoriesState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onCategoryClicked)) {
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
                androidx.compose.runtime.c.U(-72288355, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionView (BusinessesSectionView.kt:37)");
            }
            androidx.compose.ui.c a11 = TestTagKt.a(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(16)), "businessesSection");
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
            h11.C(-483455358);
            a0 a12 = e.a(o11, v0.b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a14);
            } else {
                h11.t();
            }
            a a15 = Updater.a(h11);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            a(businessesCategoriesState.a(), h11, 0);
            if (businessesCategoriesState instanceof AllVerticalsViewModel.a.C0258a) {
                h11.C(706122046);
                f(((AllVerticalsViewModel.a.C0258a) businessesCategoriesState).b(), onCategoryClicked, h11, (i12 & 112) | 8);
                h11.S();
            } else if (businessesCategoriesState instanceof AllVerticalsViewModel.a.b) {
                h11.C(706122234);
                AllVerticalsViewModel.a.b bVar = (AllVerticalsViewModel.a.b) businessesCategoriesState;
                d(bVar.b(), onCategoryClicked, bVar.c(), h11, (i12 & 112) | 8, 0);
                h11.S();
            } else {
                h11.C(706122386);
                h11.S();
            }
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$BusinessesSectionView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    BusinessesSectionViewKt.e(AllVerticalsViewModel.a.this, onCategoryClicked, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final CategoryEntity forSaleCategory, final l<? super CategoryEntity, p> onCategoryClicked, a aVar, final int i11) {
        o.i(forSaleCategory, "forSaleCategory");
        o.i(onCategoryClicked, "onCategoryClicked");
        a h11 = aVar.h(21933235);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(21933235, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ForSaleBusinessView (BusinessesSectionView.kt:57)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        d f11 = aVar3.a(h11, i12).f();
        int i13 = d.f76453b;
        androidx.compose.ui.c a11 = TestTagKt.a(ClickableKt.e(BackgroundKt.a(aVar2, f11.h(h11, i13), c0.g.c(h.l(8))), false, null, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$ForSaleBusinessView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                onCategoryClicked.invoke(forSaleCategory);
            }
        }, 7, null), "businessSectionItems");
        b.a aVar4 = v0.b.f74009a;
        b.c i14 = aVar4.i();
        h11.C(693286680);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a12 = androidx.compose.foundation.layout.o.a(arrangement.g(), i14, h11, 48);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a14);
        } else {
            h11.t();
        }
        a a15 = Updater.a(h11);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        ImageKt.a(h5.d.a(new g.a((Context) h11.q(AndroidCompositionLocals_androidKt.g())).b(forSaleCategory.getFeaturedImage()).p(s5.g.f68399d).d(sj.d.A).e(sj.d.A).a(), null, null, null, 0, h11, 8, 30), null, AspectRatioKt.b(SizeKt.u(PaddingKt.k(aVar2, 0.0f, h.l(12), 1, null), h.l(90)), 1.7777778f, false, 2, null), null, null, 0.0f, null, h11, 432, 120);
        androidx.compose.ui.c d11 = t.d(uVar, aVar2, 1.0f, false, 2, null);
        Arrangement.f o11 = arrangement.o(h.l(4));
        h11.C(-483455358);
        a0 a16 = e.a(o11, aVar4.k(), h11, 6);
        h11.C(-1323940314);
        int a17 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a18 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(d11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a18);
        } else {
            h11.t();
        }
        a a19 = Updater.a(h11);
        Updater.c(a19, a16, companion.e());
        Updater.c(a19, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
            a19.u(Integer.valueOf(a17));
            a19.p(Integer.valueOf(a17), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        TextKt.a(forSaleCategory.getName(), null, 0, 0, false, 1, 0, null, aVar3.c(h11, i12).r(), aVar3.a(h11, i12).f().m(h11, i13), 0, h11, 196608, 0, 1246);
        TextKt.a(p1.g.b(y0.C, h11, 0), null, 0, 0, false, 0, 0, null, aVar3.c(h11, i12).h(), aVar3.a(h11, i12).f().k(h11, i13), 0, h11, 0, 0, 1278);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        IconKt.a(p1.e.d(sj.d.f68676m, h11, 0), PaddingKt.m(aVar2, 0.0f, 0.0f, h.l(16), 0.0f, 11, null), null, aVar3.a(h11, i12).f().k(h11, i13), false, 0.0f, h11, 440, 48);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.BusinessesSectionViewKt$ForSaleBusinessView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar5, int i15) {
                    BusinessesSectionViewKt.f(CategoryEntity.this, onCategoryClicked, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
