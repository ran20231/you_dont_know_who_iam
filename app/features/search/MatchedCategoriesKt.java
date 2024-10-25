package com.forsale.app.features.search;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.c;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.CardSubKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.SpanTextKt;
import j0.d1;
import j0.e1;
import j0.v0;
import java.util.List;
import r5.g;
import y.a;
/* compiled from: MatchedCategories.kt */
/* loaded from: classes2.dex */
public final class MatchedCategoriesKt {
    public static final void a(final List<CategoryEntity> categories, final String searchQuery, boolean z11, final g00.l<? super CategoryEntity, wz.p> onItemClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        boolean z12;
        kotlin.jvm.internal.o.i(categories, "categories");
        kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
        kotlin.jvm.internal.o.i(onItemClicked, "onItemClicked");
        androidx.compose.runtime.a h11 = aVar.h(1015296837);
        if ((i12 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1015296837, i11, -1, "com.forsale.app.features.search.MatchedCategories (MatchedCategories.kt:31)");
        }
        if (categories.isEmpty()) {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final boolean z13 = z12;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategories$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i13) {
                        MatchedCategoriesKt.a(categories, searchQuery, z13, onItemClicked, aVar2, v0.a(i11 | 1), i12);
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
        final boolean z14 = z12;
        ThemeKt.a(null, null, r0.b.b(h11, -1035070962, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategories$2
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
                    androidx.compose.runtime.c.U(-1035070962, i13, -1, "com.forsale.app.features.search.MatchedCategories.<anonymous> (MatchedCategories.kt:34)");
                }
                List<CategoryEntity> list = categories;
                String str = searchQuery;
                g00.l<CategoryEntity, wz.p> lVar = onItemClicked;
                int i14 = i11;
                aVar2.C(-483455358);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                boolean z15 = false;
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
                MatchedCategoriesKt.b(aVar2, 0);
                MatchedCategoriesKt.c(list, str, lVar, aVar2, ((i14 >> 3) & 896) | (i14 & 112) | 8);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if ((!categories.isEmpty()) && z14) {
                    z15 = true;
                }
                SearchComponentAnimatedVisibilityKt.a(z15, ComposableSingletons$MatchedCategoriesKt.f36471a.a(), aVar2, 48);
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
        d1 l12 = h11.l();
        if (l12 != null) {
            final boolean z15 = z12;
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategories$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    MatchedCategoriesKt.a(categories, searchQuery, z15, onItemClicked, aVar2, v0.a(i11 | 1), i12);
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
    public static final void b(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(11475022);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(11475022, i11, -1, "com.forsale.app.features.search.MatchedCategoriesHeader (MatchedCategories.kt:52)");
            }
            float f11 = 16;
            SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, e2.h.l(f11), e2.h.l(f11), 0.0f, e2.h.l(8), 4, null), null, ComposableSingletons$MatchedCategoriesKt.f36471a.b(), null, null, null, h11, 384, 58);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategoriesHeader$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MatchedCategoriesKt.b(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void c(final List<CategoryEntity> categories, final String searchQuery, final g00.l<? super CategoryEntity, wz.p> onItemClicked, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        kotlin.jvm.internal.o.i(categories, "categories");
        kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
        kotlin.jvm.internal.o.i(onItemClicked, "onItemClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1376410333);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1376410333, i11, -1, "com.forsale.app.features.search.MatchedCategoriesList (MatchedCategories.kt:65)");
        }
        if (!categories.isEmpty()) {
            androidx.compose.ui.c i12 = SizeKt.i(androidx.compose.ui.c.f7566a, e2.h.l(120));
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.o.a(arrangement.g(), v0.b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            j0.k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(i12);
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
            w.u uVar = w.u.f74924a;
            float f11 = 16;
            w.o c12 = PaddingKt.c(e2.h.l(f11), 0.0f, 2, null);
            aVar2 = h11;
            LazyGridDslKt.a(new a.C0936a(1), null, null, c12, false, arrangement.o(e2.h.l(12)), arrangement.o(e2.h.l(f11)), null, false, new g00.l<LazyGridScope, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategoriesList$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyGridScope LazyHorizontalGrid) {
                    kotlin.jvm.internal.o.i(LazyHorizontalGrid, "$this$LazyHorizontalGrid");
                    int size = categories.size();
                    final List<CategoryEntity> list = categories;
                    final g00.l<CategoryEntity, wz.p> lVar = onItemClicked;
                    final String str = searchQuery;
                    final int i13 = i11;
                    LazyGridScope.j(LazyHorizontalGrid, size, null, null, null, r0.b.c(1794252737, true, new g00.r<y.k, Integer, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategoriesList$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        public final void b(y.k items, final int i14, androidx.compose.runtime.a aVar3, int i15) {
                            int i16;
                            int i17;
                            kotlin.jvm.internal.o.i(items, "$this$items");
                            if ((i15 & 112) == 0) {
                                if (aVar3.d(i14)) {
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i16 = i17 | i15;
                            } else {
                                i16 = i15;
                            }
                            if ((i16 & 721) == 144 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1794252737, i15, -1, "com.forsale.app.features.search.MatchedCategoriesList.<anonymous>.<anonymous>.<anonymous> (MatchedCategories.kt:78)");
                            }
                            final g00.l<CategoryEntity, wz.p> lVar2 = lVar;
                            final List<CategoryEntity> list2 = list;
                            g00.a<wz.p> aVar4 = new g00.a<wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt.MatchedCategoriesList.1.1.1.1
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
                                    lVar2.invoke(list2.get(i14));
                                }
                            };
                            final String str2 = str;
                            final List<CategoryEntity> list3 = list;
                            final int i18 = i13;
                            CardSubKt.a(aVar4, r0.b.b(aVar3, -407641075, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt.MatchedCategoriesList.1.1.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar5, int i19) {
                                    boolean z11;
                                    if ((i19 & 11) == 2 && aVar5.i()) {
                                        aVar5.L();
                                        return;
                                    }
                                    if (androidx.compose.runtime.c.I()) {
                                        androidx.compose.runtime.c.U(-407641075, i19, -1, "com.forsale.app.features.search.MatchedCategoriesList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchedCategories.kt:83)");
                                    }
                                    if (str2.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        aVar5.C(1701009037);
                                        dk.a aVar6 = dk.a.f54291a;
                                        int i21 = dk.a.f54292b;
                                        androidx.compose.ui.text.a0 h12 = aVar6.c(aVar5, i21).h();
                                        aVar5.C(1701009182);
                                        List<CategoryEntity> list4 = list3;
                                        int i22 = i14;
                                        String str3 = str2;
                                        int i23 = i18;
                                        c.a aVar7 = new c.a(0, 1, null);
                                        String name = list4.get(i22).getName();
                                        yj.d e11 = aVar6.a(aVar5, i21).e();
                                        int i24 = yj.d.f76453b;
                                        SpanTextKt.a(aVar7, name, str3, e11.i(aVar5, i24), aVar6.a(aVar5, i21).e().m(aVar5, i24), aVar5, c.a.f9235f | ((i23 << 3) & 896));
                                        androidx.compose.ui.text.c m11 = aVar7.m();
                                        aVar5.S();
                                        TextKt.b(m11, null, 0L, b2.f.f16081b.a(), 0, false, 0, 0, null, null, h12, aVar5, 0, 0, 1014);
                                        aVar5.S();
                                    } else {
                                        aVar5.C(1701009844);
                                        dk.a aVar8 = dk.a.f54291a;
                                        int i25 = dk.a.f54292b;
                                        TextKt.a(list3.get(i14).getName(), null, b2.f.f16081b.a(), 0, false, 0, 0, null, aVar8.c(aVar5, i25).h(), aVar8.a(aVar5, i25).e().m(aVar5, yj.d.f76453b), 0, aVar5, 0, 0, 1274);
                                        aVar5.S();
                                    }
                                    if (androidx.compose.runtime.c.I()) {
                                        androidx.compose.runtime.c.T();
                                    }
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                    b(aVar5, num.intValue());
                                    return wz.p.f75480a;
                                }
                            }), h5.d.a(new g.a((Context) aVar3.q(AndroidCompositionLocals_androidKt.g())).b(list.get(i14).getImage()).p(s5.g.f68399d).d(sj.d.A).e(sj.d.A).a(), null, null, null, 0, aVar3, 8, 30), false, SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, e2.h.l(76)), e2.h.l(116)), aVar3, 27696, 0);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.r
                        public /* bridge */ /* synthetic */ wz.p d(y.k kVar, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                            b(kVar, num.intValue(), aVar3, num2.intValue());
                            return wz.p.f75480a;
                        }
                    }), 14, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(LazyGridScope lazyGridScope) {
                    b(lazyGridScope);
                    return wz.p.f75480a;
                }
            }, h11, 1772544, 406);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
        } else {
            aVar2 = h11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.MatchedCategoriesKt$MatchedCategoriesList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    MatchedCategoriesKt.c(categories, searchQuery, onItemClicked, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
