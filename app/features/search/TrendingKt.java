package com.forsale.app.features.search;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.designSystem.theme.ThemeKt;
import j0.d1;
import j0.e1;
import j0.v0;
import java.util.List;
import v0.b;
import z.x;
/* compiled from: Trending.kt */
/* loaded from: classes2.dex */
public final class TrendingKt {
    public static final void a(final List<TrendEntity> trendsList, final TrendEntity trendsSectionTitle, final g00.l<? super TrendEntity, wz.p> onTrendsItemClick, androidx.compose.runtime.a aVar, final int i11) {
        kotlin.jvm.internal.o.i(trendsList, "trendsList");
        kotlin.jvm.internal.o.i(trendsSectionTitle, "trendsSectionTitle");
        kotlin.jvm.internal.o.i(onTrendsItemClick, "onTrendsItemClick");
        androidx.compose.runtime.a h11 = aVar.h(-261868280);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-261868280, i11, -1, "com.forsale.app.features.search.TrendingList (Trending.kt:45)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar3 = v0.b.f74009a;
        androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.e.a(h12, aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
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
        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        androidx.compose.ui.c y11 = SizeKt.y(SizeKt.h(aVar2, 0.0f, 1, null), aVar3.h(), false, 2, null);
        h11.C(693286680);
        androidx.compose.ui.layout.a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        j0.k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(y11);
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
        g00.p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.u uVar = w.u.f74924a;
        float f11 = 16;
        SpacerKt.a(SizeKt.d(SizeKt.u(aVar2, e2.h.l(f11)), 0.0f, 1, null), h11, 6);
        SectionTitleKt.a(null, null, r0.b.b(h11, 404823908, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingList$1$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(404823908, i12, -1, "com.forsale.app.features.search.TrendingList.<anonymous>.<anonymous>.<anonymous> (Trending.kt:58)");
                }
                b.c i13 = v0.b.f74009a.i();
                TrendEntity trendEntity = TrendEntity.this;
                aVar4.C(693286680);
                c.a aVar5 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.layout.a0 a19 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i13, aVar4, 48);
                aVar4.C(-1323940314);
                int a21 = j0.e.a(aVar4, 0);
                j0.k s13 = aVar4.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a22 = companion2.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(aVar5);
                if (!(aVar4.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar4.I();
                if (aVar4.f()) {
                    aVar4.y(a22);
                } else {
                    aVar4.t();
                }
                androidx.compose.runtime.a a23 = Updater.a(aVar4);
                Updater.c(a23, a19, companion2.e());
                Updater.c(a23, s13, companion2.g());
                g00.p<ComposeUiNode, Integer, wz.p> b13 = companion2.b();
                if (a23.f() || !kotlin.jvm.internal.o.d(a23.D(), Integer.valueOf(a21))) {
                    a23.u(Integer.valueOf(a21));
                    a23.p(Integer.valueOf(a21), b13);
                }
                c13.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                aVar4.C(2058660585);
                w.u uVar2 = w.u.f74924a;
                String localized = trendEntity.getLocalized();
                dk.a aVar6 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                androidx.compose.ui.text.a0 r11 = aVar6.c(aVar4, i14).r();
                yj.d e11 = aVar6.a(aVar4, i14).e();
                int i15 = yj.d.f76453b;
                TextKt.a(localized, null, 0, 0, false, 0, 0, null, r11, e11.j(aVar4, i15), 0, aVar4, 0, 0, 1278);
                IconKt.a(p1.e.d(sj.d.J, aVar4, 0), PaddingKt.m(aVar5, e2.h.l(4), 0.0f, 0.0f, 0.0f, 14, null), null, aVar6.a(aVar4, i14).f().i(aVar4, i15), false, 0.0f, aVar4, 56, 52);
                aVar4.S();
                aVar4.w();
                aVar4.S();
                aVar4.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return wz.p.f75480a;
            }
        }), null, null, null, h11, 384, 59);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        SpacerKt.a(SizeKt.i(aVar2, e2.h.l(10)), h11, 6);
        androidx.compose.ui.c h13 = SizeKt.h(SizeKt.i(aVar2, e2.h.l(70)), 0.0f, 1, null);
        h11.C(693286680);
        androidx.compose.ui.layout.a0 a19 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a21 = j0.e.a(h11, 0);
        j0.k s13 = h11.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(h13);
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
        g00.p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a23.f() || !kotlin.jvm.internal.o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b13);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        SpacerKt.a(SizeKt.d(SizeKt.u(aVar2, e2.h.l(f11)), 0.0f, 1, null), h11, 6);
        float f12 = 8;
        LazyStaggeredGridDslKt.a(new x.a(2), null, null, null, false, arrangement.o(e2.h.l(f12)), e2.h.l(f12), null, false, new g00.l<LazyStaggeredGridScope, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingList$1$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyStaggeredGridScope LazyHorizontalStaggeredGrid) {
                kotlin.jvm.internal.o.i(LazyHorizontalStaggeredGrid, "$this$LazyHorizontalStaggeredGrid");
                int size = trendsList.size();
                final List<TrendEntity> list = trendsList;
                final g00.l<TrendEntity, wz.p> lVar = onTrendsItemClick;
                LazyStaggeredGridScope.c(LazyHorizontalStaggeredGrid, size, null, null, null, r0.b.c(1019868150, true, new g00.r<z.l, Integer, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingList$1$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    public final void b(z.l items, final int i12, androidx.compose.runtime.a aVar4, int i13) {
                        int i14;
                        int i15;
                        kotlin.jvm.internal.o.i(items, "$this$items");
                        if ((i13 & 112) == 0) {
                            if (aVar4.d(i12)) {
                                i15 = 32;
                            } else {
                                i15 = 16;
                            }
                            i14 = i15 | i13;
                        } else {
                            i14 = i13;
                        }
                        if ((i14 & 721) == 144 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1019868150, i13, -1, "com.forsale.app.features.search.TrendingList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Trending.kt:86)");
                        }
                        final List<TrendEntity> list2 = list;
                        r0.a b14 = r0.b.b(aVar4, -2000867296, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt.TrendingList.1.2.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar5, int i16) {
                                if ((i16 & 11) == 2 && aVar5.i()) {
                                    aVar5.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-2000867296, i16, -1, "com.forsale.app.features.search.TrendingList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Trending.kt:88)");
                                }
                                String localized = list2.get(i12).getLocalized();
                                androidx.compose.ui.c y12 = SizeKt.y(SizeKt.b(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(40), 1, null), v0.b.f74009a.e(), false, 2, null);
                                int c14 = b2.l.f16120a.c();
                                dk.a aVar6 = dk.a.f54291a;
                                int i17 = dk.a.f54292b;
                                TextKt.a(localized, y12, 0, c14, false, 0, 0, null, aVar6.c(aVar5, i17).c(), aVar6.a(aVar5, i17).e().m(aVar5, yj.d.f76453b), 0, aVar5, 3120, 0, 1268);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                b(aVar5, num.intValue());
                                return wz.p.f75480a;
                            }
                        });
                        final g00.l<TrendEntity, wz.p> lVar2 = lVar;
                        final List<TrendEntity> list3 = list;
                        ChipsKt.d(null, null, b14, false, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.TrendingKt.TrendingList.1.2.1.1.2
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
                                lVar2.invoke(list3.get(i12));
                            }
                        }, null, aVar4, 384, 43);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ wz.p d(z.l lVar2, Integer num, androidx.compose.runtime.a aVar4, Integer num2) {
                        b(lVar2, num.intValue(), aVar4, num2.intValue());
                        return wz.p.f75480a;
                    }
                }), 14, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(LazyStaggeredGridScope lazyStaggeredGridScope) {
                b(lazyStaggeredGridScope);
                return wz.p.f75480a;
            }
        }, h11, 1769472, 414);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    TrendingKt.a(trendsList, trendsSectionTitle, onTrendsItemClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void b(final List<TrendEntity> trendsList, final TrendEntity trendsSectionTitle, final g00.l<? super TrendEntity, wz.p> onTrendsItemClick, float f11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        kotlin.jvm.internal.o.i(trendsList, "trendsList");
        kotlin.jvm.internal.o.i(trendsSectionTitle, "trendsSectionTitle");
        kotlin.jvm.internal.o.i(onTrendsItemClick, "onTrendsItemClick");
        androidx.compose.runtime.a h11 = aVar.h(-1332209541);
        if ((i12 & 8) != 0) {
            f11 = e2.h.l(16);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1332209541, i11, -1, "com.forsale.app.features.search.TrendingView (Trending.kt:24)");
        }
        final float f12 = f11;
        ThemeKt.a(null, null, r0.b.b(h11, -272524540, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i13) {
                if ((i13 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-272524540, i13, -1, "com.forsale.app.features.search.TrendingView.<anonymous> (Trending.kt:26)");
                }
                float f13 = f12;
                List<TrendEntity> list = trendsList;
                TrendEntity trendEntity = trendsSectionTitle;
                g00.l<TrendEntity, wz.p> lVar = onTrendsItemClick;
                int i14 = i11;
                aVar2.C(-483455358);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                aVar2.C(-1323940314);
                int a12 = j0.e.a(aVar2, 0);
                j0.k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a13);
                } else {
                    aVar2.t();
                }
                androidx.compose.runtime.a a14 = Updater.a(aVar2);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                w.f fVar = w.f.f74891a;
                SpacerKt.a(SizeKt.i(aVar3, f13), aVar2, 0);
                TrendingKt.a(list, trendEntity, lVar, aVar2, (i14 & 896) | (i14 & 112) | 8);
                SpacerKt.a(SizeKt.i(aVar3, f13), aVar2, 0);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 384, 3);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final float f13 = f11;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.TrendingKt$TrendingView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    TrendingKt.b(trendsList, trendsSectionTitle, onTrendsItemClick, f13, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
