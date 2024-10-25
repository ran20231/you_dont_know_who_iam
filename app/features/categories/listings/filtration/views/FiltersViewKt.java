package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.designSystem.badges.BadgesKt;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.a;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import p1.g;
import t9.y0;
import v0.b;
import v0.i;
import w.f;
import w.u;
import wz.p;
import x.j;
import yj.d;
/* compiled from: FiltersView.kt */
/* loaded from: classes2.dex */
public final class FiltersViewKt {
    public static final void a(final boolean z11, final boolean z12, final a<p> onAllFiltersClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        o.i(onAllFiltersClicked, "onAllFiltersClicked");
        androidx.compose.runtime.a h11 = aVar.h(-88856422);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.a(z12)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onAllFiltersClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-88856422, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.AllFilters (FiltersView.kt:203)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c a11 = IntrinsicKt.a(aVar2, IntrinsicSize.Max);
            dk.a aVar3 = dk.a.f54291a;
            int i16 = dk.a.f54292b;
            d g11 = aVar3.a(h11, i16).g();
            int i17 = d.f76453b;
            androidx.compose.ui.c b11 = BackgroundKt.b(a11, g11.c(h11, i17), null, 2, null);
            float f11 = 8;
            androidx.compose.ui.c k11 = PaddingKt.k(b11, 0.0f, h.l(f11), 1, null);
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
            h11.C(693286680);
            a0 a12 = androidx.compose.foundation.layout.o.a(o11, b.f74009a.l(), h11, 6);
            h11.C(-1323940314);
            int a13 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
            if (!(h11.k() instanceof j0.d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a14);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a15 = Updater.a(h11);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            b(z11, z12, onAllFiltersClicked, h11, (i12 & 896) | (i12 & 14) | (i12 & 112));
            SpacerKt.a(BackgroundKt.b(SizeKt.u(SizeKt.d(aVar2, 0.0f, 1, null), h.l(1)), aVar3.a(h11, i16).e().d(h11, i17), null, 2, null), h11, 0);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFilters$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i18) {
                    FiltersViewKt.a(z11, z12, onAllFiltersClicked, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final boolean z11, final boolean z12, final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        final int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar2.h(-865031544);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.a(z12)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-865031544, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.AllFiltersButton (FiltersView.kt:229)");
            }
            r0.a b11 = r0.b.b(h11, 137314887, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFiltersButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    if ((i16 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(137314887, i16, -1, "com.forsale.app.features.categories.listings.filtration.views.AllFiltersButton.<anonymous> (FiltersView.kt:231)");
                    }
                    FiltersViewKt.c(z12, aVar4, (i12 >> 3) & 14, 0);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
            r0.a b12 = r0.b.b(h11, -1519691354, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFiltersButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    if ((i16 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1519691354, i16, -1, "com.forsale.app.features.categories.listings.filtration.views.AllFiltersButton.<anonymous> (FiltersView.kt:233)");
                    }
                    AnimatedVisibilityKt.d(z11, null, EnterExitTransitionKt.i(null, null, false, null, 15, null), EnterExitTransitionKt.u(null, null, false, null, 15, null), null, ComposableSingletons$FiltersViewKt.f30216a.a(), aVar4, (i12 & 14) | 200064, 18);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<Boolean, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFiltersButton$3$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z13) {
                        aVar.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            aVar3 = h11;
            ChipsKt.b(null, null, null, z12, true, b11, b12, null, (l) D, null, h11, ((i12 << 6) & 7168) | 1794048, 647);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFiltersButton$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    FiltersViewKt.b(z11, z12, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(boolean z11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        boolean z12;
        int i13;
        int i14;
        final boolean z13;
        androidx.compose.runtime.a h11 = aVar.h(2022246574);
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
                z13 = true;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(2022246574, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.AllFiltersIconWithBadge (FiltersView.kt:333)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            b.a aVar3 = b.f74009a;
            b e11 = aVar3.e();
            h11.C(733328855);
            a0 g11 = BoxKt.g(e11, false, h11, 6);
            h11.C(-1323940314);
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof j0.d)) {
                e.c();
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            IconKt.a(p1.e.d(sj.d.f68688y, h11, 0), PaddingKt.i(aVar2, h.l(2)), null, 0L, false, 0.0f, h11, 440, 56);
            h11.C(-2113322284);
            if (z13) {
                BadgesKt.a(boxScopeInstance.e(i.a(aVar2, 2.0f), aVar3.n()), dk.a.f54291a.a(h11, dk.a.f54292b).f().i(h11, d.f76453b), 0.0f, h11, 0, 4);
            }
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$AllFiltersIconWithBadge$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    FiltersViewKt.c(z13, aVar4, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r25, long r26, long r28, g00.a<wz.p> r30, java.lang.Integer r31, g00.a<wz.p> r32, androidx.compose.ui.c r33, androidx.compose.runtime.a r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt.d(java.lang.String, long, long, g00.a, java.lang.Integer, g00.a, androidx.compose.ui.c, androidx.compose.runtime.a, int, int):void");
    }

    public static final void e(final List<bc.a> districtFilters, final l<? super bc.a, p> onDistrictSelected, androidx.compose.runtime.a aVar, final int i11) {
        b.InterfaceC0889b j11;
        o.i(districtFilters, "districtFilters");
        o.i(onDistrictSelected, "onDistrictSelected");
        androidx.compose.runtime.a h11 = aVar.h(1043727158);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1043727158, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.DistrictFilters (FiltersView.kt:144)");
        }
        String b11 = g.b(y0.A, h11, 0);
        float f11 = 8;
        androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, 0.0f, h.l(f11), 1, null);
        w.o e11 = PaddingKt.e(0.0f, 0.0f, h.l(f11), 0.0f, 11, null);
        Arrangement arrangement = Arrangement.f3698a;
        float l11 = h.l(f11);
        if (h11.q(CompositionLocalsKt.j()) == LayoutDirection.Ltr) {
            j11 = b.f74009a.k();
        } else {
            j11 = b.f74009a.j();
        }
        LazyDslKt.b(k11, null, e11, false, arrangement.p(l11, j11), null, null, false, new FiltersViewKt$DistrictFilters$1(districtFilters, b11, onDistrictSelected), h11, 390, 234);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    FiltersViewKt.e(districtFilters, onDistrictSelected, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(androidx.compose.ui.c cVar, final List<? extends FilterViewModel<?, ?, ?>> filters, final boolean z11, final g00.p<? super FilterViewModel<?, ?, ?>, ? super Integer, p> onFilterClicked, final a<p> onAllFiltersClicked, final l<? super FilterViewModel<?, ?, ?>, p> onResetAllClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        c.a aVar2;
        Object m02;
        j jVar;
        Arrangement.e c11;
        o.i(filters, "filters");
        o.i(onFilterClicked, "onFilterClicked");
        o.i(onAllFiltersClicked, "onAllFiltersClicked");
        o.i(onResetAllClicked, "onResetAllClicked");
        androidx.compose.runtime.a h11 = aVar.h(874718963);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(874718963, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.ExposedFilters (FiltersView.kt:260)");
        }
        e2.d dVar = (e2.d) h11.q(CompositionLocalsKt.e());
        boolean z12 = false;
        LazyListState c12 = LazyListStateKt.c(0, 0, h11, 0, 3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c12.x().c()) {
            if (true ^ o.d(((j) obj).getKey(), "All Filters")) {
                arrayList.add(obj);
            }
        }
        m02 = CollectionsKt___CollectionsKt.m0(arrayList);
        z12 = (((j) m02) == null || jVar.getOffset() > dVar.m1(h.l(32))) ? true : true;
        w.o e11 = PaddingKt.e(0.0f, 0.0f, h.l(16), 0.0f, 11, null);
        if (h11.q(CompositionLocalsKt.j()) == LayoutDirection.Ltr) {
            c11 = Arrangement.f3698a.g();
        } else {
            c11 = Arrangement.f3698a.c();
        }
        LazyDslKt.b(aVar2, c12, e11, false, c11, null, null, false, new FiltersViewKt$ExposedFilters$1(filters, z12, z11, onAllFiltersClicked, i11, aVar2, onFilterClicked, onResetAllClicked), h11, (i11 & 14) | 384, 232);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final androidx.compose.ui.c cVar2 = aVar2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    FiltersViewKt.f(androidx.compose.ui.c.this, filters, z11, onFilterClicked, onAllFiltersClicked, onResetAllClicked, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void g(boolean z11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        boolean z12;
        final int i13;
        int i14;
        final boolean z13;
        final boolean z14;
        androidx.compose.runtime.a h11 = aVar.h(-1045209516);
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
                z13 = true;
            } else {
                z13 = z12;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1045209516, i13, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterLoading (FiltersView.kt:76)");
            }
            float f11 = 8;
            androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, h.l(f11), 1, null);
            Arrangement.e p11 = Arrangement.f3698a.p(h.l(f11), b.f74009a.k());
            Boolean valueOf = Boolean.valueOf(z13);
            h11.C(1157296644);
            boolean T = h11.T(valueOf);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$FilterLoading$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        final boolean z15 = z13;
                        final int i16 = i13;
                        LazyListScope.e(LazyRow, 5, null, null, r0.b.c(838100287, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$FilterLoading$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            public final void b(x.a items, int i17, androidx.compose.runtime.a aVar2, int i18) {
                                o.i(items, "$this$items");
                                if ((i18 & 641) == 128 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(838100287, i18, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterLoading.<anonymous>.<anonymous>.<anonymous> (FiltersView.kt:84)");
                                }
                                FiltersViewKt.d("filters", 0L, 0L, null, null, null, com.forsale.ui.components.skeleton.a.a(SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(32)), h.l(102)), z15, c0.g.c(h.l(50)), 0L, 0L, aVar2, ((i16 << 3) & 112) | 6, 12), aVar2, 6, 62);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.r
                            public /* bridge */ /* synthetic */ p d(x.a aVar2, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                                b(aVar2, num.intValue(), aVar3, num2.intValue());
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
            z14 = z13;
            LazyDslKt.b(k11, null, null, false, p11, null, null, false, (l) D, h11, 24582, 238);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$FilterLoading$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i16) {
                    FiltersViewKt.g(z14, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void h(final CategoryListingsViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(-732323410);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-732323410, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.Filters (FiltersView.kt:40)");
        }
        Flow<CategoryListingsViewModel.b> d22 = viewModel.d2();
        CategoryListingsViewModel.b.a aVar2 = CategoryListingsViewModel.b.a.f28460a;
        n1 a11 = z.a(d22, aVar2, null, h11, 56, 2);
        n1 b11 = z.b(viewModel.Y1(), null, h11, 8, 1);
        if (i(a11) instanceof com.forsale.app.features.categories.listings.category.e) {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        FiltersViewKt.h(CategoryListingsViewModel.this, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
                return;
            }
            return;
        }
        androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 0.0f, 0.0f, 14, null);
        h11.C(-483455358);
        a0 a12 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a14);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a15 = Updater.a(h11);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        CategoryListingsViewModel.b i12 = i(a11);
        if (o.d(i12, aVar2)) {
            h11.C(-1935375521);
            g(false, h11, 0, 1);
            h11.S();
        } else if (i12 instanceof com.forsale.app.features.categories.listings.category.c) {
            h11.C(-1935375415);
            CategoryListingsViewModel.b i13 = i(a11);
            o.g(i13, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.FiltersState.FiltersContent.DistrictFilters");
            e(((com.forsale.app.features.categories.listings.category.c) i13).a(), new l<bc.a, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$2$1
                public final void b(bc.a it2) {
                    o.i(it2, "it");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(bc.a aVar3) {
                    b(aVar3);
                    return p.f75480a;
                }
            }, h11, 56);
            h11.S();
        } else if (i12 instanceof com.forsale.app.features.categories.listings.category.d) {
            h11.C(-1935375128);
            CategoryListingsViewModel.b i14 = i(a11);
            o.g(i14, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.FiltersState.FiltersContent.FullFiltration");
            k(((com.forsale.app.features.categories.listings.category.d) i14).a(), j(b11), new g00.p<FilterViewModel<?, ?, ?>, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(FilterViewModel<?, ?, ?> filter, int i15) {
                    o.i(filter, "filter");
                    CategoryListingsViewModel.this.r3(filter, i15);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(FilterViewModel<?, ?, ?> filterViewModel, Integer num) {
                    b(filterViewModel, num.intValue());
                    return p.f75480a;
                }
            }, new a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$2$3
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    CategoryListingsViewModel.this.q3();
                }
            }, new l<FilterViewModel<?, ?, ?>, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$2$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(final FilterViewModel<?, ?, ?> resetAllFilter) {
                    o.i(resetAllFilter, "resetAllFilter");
                    CategoryListingsViewModel.this.l3(new a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$2$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            FilterViewModel.K(resetAllFilter, 0, 1, null);
                        }
                    });
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(FilterViewModel<?, ?, ?> filterViewModel) {
                    b(filterViewModel);
                    return p.f75480a;
                }
            }, h11, 8);
            h11.S();
        } else if (o.d(i12, com.forsale.app.features.categories.listings.category.e.f28697a)) {
            h11.C(-1935374335);
            h11.S();
        } else {
            h11.C(-1935374323);
            h11.S();
        }
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$Filters$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i15) {
                    FiltersViewKt.h(CategoryListingsViewModel.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final CategoryListingsViewModel.b i(n1<? extends CategoryListingsViewModel.b> n1Var) {
        return n1Var.getValue();
    }

    private static final boolean j(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final void k(final List<? extends FilterViewModel<?, ?, ?>> filters, final boolean z11, final g00.p<? super FilterViewModel<?, ?, ?>, ? super Integer, p> onFilterClicked, final a<p> onAllFiltersClicked, final l<? super FilterViewModel<?, ?, ?>, p> onResetAllClicked, androidx.compose.runtime.a aVar, final int i11) {
        o.i(filters, "filters");
        o.i(onFilterClicked, "onFilterClicked");
        o.i(onAllFiltersClicked, "onAllFiltersClicked");
        o.i(onResetAllClicked, "onResetAllClicked");
        androidx.compose.runtime.a h11 = aVar.h(1970064671);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1970064671, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.FullFilters (FiltersView.kt:182)");
        }
        if (!filters.isEmpty()) {
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar2, 0.0f, 1, null);
            Arrangement.e g11 = Arrangement.f3698a.g();
            b.c i12 = b.f74009a.i();
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(g11, i12, h11, 54);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof j0.d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            int i13 = i11 << 3;
            f(aVar2, filters, z11, onFilterClicked, onAllFiltersClicked, onResetAllClicked, h11, (i13 & 896) | 70 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$FullFilters$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    FiltersViewKt.k(filters, z11, onFilterClicked, onAllFiltersClicked, onResetAllClicked, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
