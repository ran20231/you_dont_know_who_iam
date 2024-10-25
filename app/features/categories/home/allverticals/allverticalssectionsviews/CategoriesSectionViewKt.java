package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import coil.compose.AsyncImagePainter;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.CardSubKt;
import e2.h;
import g00.l;
import g00.r;
import j0.d1;
import j0.k0;
import j0.v0;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import r0.b;
import r5.g;
import wz.p;
import yj.d;
/* compiled from: CategoriesSectionView.kt */
/* loaded from: classes2.dex */
public final class CategoriesSectionViewKt {
    public static final void a(final List<CategoryEntity> list, final l<? super CategoryEntity, p> lVar, a aVar, final int i11) {
        a h11 = aVar.h(2110620293);
        if (c.I()) {
            c.U(2110620293, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesList (CategoriesSectionView.kt:42)");
        }
        float f11 = 12;
        FixedGridViewKt.a(list, 4, TestTagKt.a(PaddingKt.i(BackgroundKt.b(androidx.compose.ui.c.f7566a, dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, d.f76453b), null, 2, null), h.l(16)), "categoriesSection"), h.l(f11), h.l(f11), b.b(h11, -1069058260, true, new r<w.c, CategoryEntity, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(w.c FixedGridView, final CategoryEntity it2, a aVar2, int i12) {
                o.i(FixedGridView, "$this$FixedGridView");
                o.i(it2, "it");
                if (c.I()) {
                    c.U(-1069058260, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesList.<anonymous> (CategoriesSectionView.kt:54)");
                }
                AsyncImagePainter a11 = h5.d.a(new g.a((Context) aVar2.q(AndroidCompositionLocals_androidKt.g())).b(it2.getImage()).p(s5.g.f68399d).d(sj.d.A).e(sj.d.A).a(), null, null, null, 0, aVar2, 8, 30);
                final l<CategoryEntity, p> lVar2 = lVar;
                CardSubKt.c(new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesList$1.1
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
                        lVar2.invoke(it2);
                    }
                }, a11, b.b(aVar2, 1887019596, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesList$1.2
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i13) {
                        if ((i13 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(1887019596, i13, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesList.<anonymous>.<anonymous> (CategoriesSectionView.kt:55)");
                        }
                        TextKt.a(CategoryEntity.this.getName(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), true, null, aVar2, 3456, 16);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(w.c cVar, CategoryEntity categoryEntity, a aVar2, Integer num) {
                b(cVar, categoryEntity, aVar2, num.intValue());
                return p.f75480a;
            }
        }), h11, 224312, 0);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    CategoriesSectionViewKt.a(list, lVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(a aVar, final int i11) {
        List c11;
        List a11;
        a h11 = aVar.h(-806799417);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-806799417, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesLoadingState (CategoriesSectionView.kt:72)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            if (D == a.f7182a.a()) {
                c11 = q.c();
                for (int i12 = 0; i12 < 8; i12++) {
                    c11.add(p.f75480a);
                }
                a11 = q.a(c11);
                D = c0.e(a11, null, 2, null);
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c i13 = PaddingKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(16));
            List<p> c12 = c((k0) D);
            float f11 = 12;
            FixedGridViewKt.a(c12, 4, i13, h.l(f11), h.l(f11), ComposableSingletons$CategoriesSectionViewKt.f23580a.a(), h11, 224696, 0);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesLoadingState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i14) {
                    CategoriesSectionViewKt.b(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final List<p> c(k0<List<p>> k0Var) {
        return k0Var.getValue();
    }

    public static final void d(final List<CategoryEntity> categories, final l<? super CategoryEntity, p> subCategoryItemCallBack, a aVar, final int i11) {
        o.i(categories, "categories");
        o.i(subCategoryItemCallBack, "subCategoryItemCallBack");
        a h11 = aVar.h(-1069954307);
        if (c.I()) {
            c.U(-1069954307, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionView (CategoriesSectionView.kt:30)");
        }
        if (!categories.isEmpty()) {
            a(categories, subCategoryItemCallBack, h11, (i11 & 112) | 8);
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CategoriesSectionViewKt$CategoriesSectionView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    CategoriesSectionViewKt.d(categories, subCategoryItemCallBack, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final /* synthetic */ void e(List list, l lVar, a aVar, int i11) {
        a(list, lVar, aVar, i11);
    }
}
