package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.layout.PaddingKt;
import c0.g;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.CardSubKt;
import e2.h;
import g00.l;
import g00.p;
import g00.r;
import j0.d1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: SubCategoriesContainer.kt */
/* loaded from: classes2.dex */
public final class SubCategoriesContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-1301470980);
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
                androidx.compose.runtime.c.U(-1301470980, i12, -1, "com.forsale.app.features.categories.home.propertyhome.ShimmerCircleCard (SubCategoriesContainer.kt:51)");
            }
            androidx.compose.material.e.a(com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, g.a(80), 0L, 0L, h11, ((i12 << 3) & 112) | 6, 12), null, 0L, 0L, null, 0.0f, ComposableSingletons$SubCategoriesContainerKt.f24536a.a(), h11, 1572864, 62);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt$ShimmerCircleCard$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    SubCategoriesContainerKt.a(z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void b(final List<CategoryEntity> subCategoriesList, final boolean z11, final l<? super CategoryEntity, wz.p> onItemClickCallback, androidx.compose.runtime.a aVar, final int i11) {
        List<CategoryEntity> mockedCategories;
        o.i(subCategoriesList, "subCategoriesList");
        o.i(onItemClickCallback, "onItemClickCallback");
        androidx.compose.runtime.a h11 = aVar.h(1007416005);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1007416005, i11, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainer (SubCategoriesContainer.kt:30)");
        }
        if (!z11) {
            mockedCategories = subCategoriesList;
        } else {
            mockedCategories = CategoryEntity.Companion.getMockedCategories(4);
        }
        float f11 = 12;
        float l11 = h.l(f11);
        float l12 = h.l(f11);
        float f12 = 16;
        FixedGridViewKt.a(mockedCategories, 4, PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f12), 0.0f, h.l(f12), 0.0f, 10, null), l12, l11, r0.b.b(h11, -940059074, true, new r<w.c, CategoryEntity, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt$SubCategoriesContainer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(w.c FixedGridView, final CategoryEntity it2, androidx.compose.runtime.a aVar2, int i12) {
                o.i(FixedGridView, "$this$FixedGridView");
                o.i(it2, "it");
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-940059074, i12, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainer.<anonymous> (SubCategoriesContainer.kt:38)");
                }
                if (!z11) {
                    aVar2.C(-2116843262);
                    final l<CategoryEntity, wz.p> lVar = onItemClickCallback;
                    CardSubKt.a(new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt$SubCategoriesContainer$1.1
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
                            lVar.invoke(it2);
                        }
                    }, r0.b.b(aVar2, -404911923, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt$SubCategoriesContainer$1.2
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i13) {
                            if ((i13 & 11) == 2 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-404911923, i13, -1, "com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainer.<anonymous>.<anonymous> (SubCategoriesContainer.kt:41)");
                            }
                            TextKt.a(CategoryEntity.this.getName(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), h5.d.a(it2.getImage(), null, null, null, 0, aVar2, 0, 30), false, null, aVar2, 3120, 16);
                    aVar2.S();
                } else {
                    aVar2.C(-2116842991);
                    SubCategoriesContainerKt.a(z11, aVar2, (i11 >> 3) & 14);
                    aVar2.S();
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(w.c cVar, CategoryEntity categoryEntity, androidx.compose.runtime.a aVar2, Integer num) {
                b(cVar, categoryEntity, aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 224696, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l13 = h11.l();
        if (l13 != null) {
            l13.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.SubCategoriesContainerKt$SubCategoriesContainer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SubCategoriesContainerKt.b(subCategoriesList, z11, onItemClickCallback, aVar2, v0.a(i11 | 1));
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
