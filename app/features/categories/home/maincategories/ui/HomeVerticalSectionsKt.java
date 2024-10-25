package com.forsale.app.features.categories.home.maincategories.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs;
import e2.d;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import wz.p;
import zc.b;
/* compiled from: HomeVerticalSections.kt */
/* loaded from: classes2.dex */
public final class HomeVerticalSectionsKt {

    /* compiled from: HomeVerticalSections.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24502a;

        static {
            int[] iArr = new int[VerticalSectionsTabs.values().length];
            try {
                iArr[VerticalSectionsTabs.TOP_USER_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalSectionsTabs.TOP_COMMERCIAL_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24502a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r31, final com.forsale.app.domainlayer.interactors.categoriesinteractors.a r32, g00.l<? super com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs, wz.p> r33, g00.p<? super com.forsale.adserver.view.models.AdGeneralModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, wz.p> r34, g00.l<? super java.lang.Boolean, wz.p> r35, g00.l<? super com.forsale.app.datalayer.database.CategoryEntity, wz.p> r36, g00.r<? super com.forsale.app.datalayer.network.responses.ListingItemBrief, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, wz.p> r37, g00.l<? super ui.a, wz.p> r38, g00.q<? super java.lang.Integer, ? super com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs, ? super java.lang.Integer, wz.p> r39, androidx.compose.runtime.a r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt.a(int, com.forsale.app.domainlayer.interactors.categoriesinteractors.a, g00.l, g00.p, g00.l, g00.l, g00.r, g00.l, g00.q, androidx.compose.runtime.a, int, int):void");
    }

    private static final int b(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Integer> k0Var, int i11) {
        k0Var.setValue(Integer.valueOf(i11));
    }

    public static final void d(final com.forsale.app.domainlayer.interactors.categoriesinteractors.a aVar, l<? super CategoryEntity, p> lVar, r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super List<Integer>, p> rVar, q<? super Integer, ? super VerticalSectionsTabs, ? super Integer, p> qVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        HomeVerticalSectionsKt$TopUserAdsList$1 homeVerticalSectionsKt$TopUserAdsList$1;
        HomeVerticalSectionsKt$TopUserAdsList$2 homeVerticalSectionsKt$TopUserAdsList$2;
        HomeVerticalSectionsKt$TopUserAdsList$3 homeVerticalSectionsKt$TopUserAdsList$3;
        int i13;
        Integer e11;
        List<b> h11;
        androidx.compose.runtime.a h12 = aVar2.h(871721639);
        if ((i12 & 2) != 0) {
            homeVerticalSectionsKt$TopUserAdsList$1 = new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$1
                public final void b(CategoryEntity it2) {
                    o.i(it2, "it");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity) {
                    b(categoryEntity);
                    return p.f75480a;
                }
            };
        } else {
            homeVerticalSectionsKt$TopUserAdsList$1 = lVar;
        }
        if ((i12 & 4) != 0) {
            homeVerticalSectionsKt$TopUserAdsList$2 = new r<ListingItemBrief, Integer, Integer, List<? extends Integer>, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$2
                public final void b(ListingItemBrief listingItemBrief, int i14, int i15, List<Integer> list) {
                    o.i(listingItemBrief, "<anonymous parameter 0>");
                    o.i(list, "<anonymous parameter 3>");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(ListingItemBrief listingItemBrief, Integer num, Integer num2, List<? extends Integer> list) {
                    b(listingItemBrief, num.intValue(), num2.intValue(), list);
                    return p.f75480a;
                }
            };
        } else {
            homeVerticalSectionsKt$TopUserAdsList$2 = rVar;
        }
        if ((i12 & 8) != 0) {
            homeVerticalSectionsKt$TopUserAdsList$3 = new q<Integer, VerticalSectionsTabs, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$3
                public final void b(int i14, VerticalSectionsTabs verticalSectionsTabs, int i15) {
                    o.i(verticalSectionsTabs, "<anonymous parameter 1>");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(Integer num, VerticalSectionsTabs verticalSectionsTabs, Integer num2) {
                    b(num.intValue(), verticalSectionsTabs, num2.intValue());
                    return p.f75480a;
                }
            };
        } else {
            homeVerticalSectionsKt$TopUserAdsList$3 = qVar;
        }
        if (c.I()) {
            c.U(871721639, i11, -1, "com.forsale.app.features.categories.home.maincategories.ui.TopUserAdsList (HomeVerticalSections.kt:192)");
        }
        h12.C(-492369756);
        Object D = h12.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(h.f(h.l(220)), null, 2, null);
            h12.u(D);
        }
        h12.S();
        k0 k0Var = (k0) D;
        h12.C(-492369756);
        Object D2 = h12.D();
        if (D2 == c0064a.a()) {
            D2 = c0.e(h.f(h.l(159)), null, 2, null);
            h12.u(D2);
        }
        h12.S();
        k0 k0Var2 = (k0) D2;
        boolean z11 = false;
        final LazyListState c11 = LazyListStateKt.c(0, 0, h12, 0, 3);
        if (aVar != null && (h11 = aVar.h()) != null) {
            i13 = h11.size();
        } else {
            i13 = 0;
        }
        h12.C(-492369756);
        Object D3 = h12.D();
        if (D3 == c0064a.a()) {
            D3 = z.d(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$maxItemReachedTopUserAds$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    Object v02;
                    List<Integer> a11 = aj.b.a(LazyListState.this.x());
                    if (a11.isEmpty() || aVar == null) {
                        return null;
                    }
                    v02 = CollectionsKt___CollectionsKt.v0(a11);
                    return Integer.valueOf(((Number) v02).intValue() + 1);
                }
            });
            h12.u(D3);
        }
        h12.S();
        n1 n1Var = (n1) D3;
        if (c11.e() && (e11 = e(n1Var)) != null) {
            if (e11.intValue() > i13) {
                z11 = true;
            }
            if (z11) {
                e11 = null;
            }
            if (e11 != null) {
                homeVerticalSectionsKt$TopUserAdsList$3.invoke(Integer.valueOf(e11.intValue()), VerticalSectionsTabs.TOP_USER_ADS, Integer.valueOf(i13));
            }
        }
        final q<? super Integer, ? super VerticalSectionsTabs, ? super Integer, p> qVar2 = homeVerticalSectionsKt$TopUserAdsList$3;
        LazyDslKt.b(null, c11, PaddingKt.c(h.l(16), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(12)), null, null, false, new HomeVerticalSectionsKt$TopUserAdsList$6(aVar, k0Var, (d) h12.q(CompositionLocalsKt.e()), k0Var2, homeVerticalSectionsKt$TopUserAdsList$2, i13, homeVerticalSectionsKt$TopUserAdsList$1), h12, 24960, 233);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h12.l();
        if (l11 != null) {
            final l<? super CategoryEntity, p> lVar2 = homeVerticalSectionsKt$TopUserAdsList$1;
            final r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super List<Integer>, p> rVar2 = homeVerticalSectionsKt$TopUserAdsList$2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt$TopUserAdsList$7
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    HomeVerticalSectionsKt.d(com.forsale.app.domainlayer.interactors.categoriesinteractors.a.this, lVar2, rVar2, qVar2, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final Integer e(n1<Integer> n1Var) {
        return n1Var.getValue();
    }
}
