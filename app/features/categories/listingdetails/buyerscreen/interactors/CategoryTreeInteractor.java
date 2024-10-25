package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CategoryTreeInteractor.kt */
/* loaded from: classes2.dex */
public final class CategoryTreeInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f25877a;

    public CategoryTreeInteractor(CategoriesRepositories categoriesRepositories) {
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f25877a = categoriesRepositories;
    }

    private final Object b(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.f25877a.getCategory(i11, aVar);
    }

    private final Integer c(List<String> list) {
        if (list.size() > 1) {
            return Integer.valueOf(Integer.parseInt(list.get(1)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, zz.a<? super cb.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor$getCategoryBreadCrumbs$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor$getCategoryBreadCrumbs$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor$getCategoryBreadCrumbs$1) r0
            int r1 = r0.f25881d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25881d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor$getCategoryBreadCrumbs$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor$getCategoryBreadCrumbs$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f25879b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25881d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f25878a
            com.forsale.app.datalayer.database.CategoryTreeBrief r8 = (com.forsale.app.datalayer.database.CategoryTreeBrief) r8
            kotlin.f.b(r9)
            goto L72
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f25878a
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor r8 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor) r8
            kotlin.f.b(r9)
            goto L52
        L41:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r9 = r7.f25877a
            r0.f25878a = r7
            r0.f25881d = r4
            java.lang.Object r9 = r9.getCategoryTree(r8, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            r8 = r7
        L52:
            com.forsale.app.datalayer.database.CategoryTreeBrief r9 = (com.forsale.app.datalayer.database.CategoryTreeBrief) r9
            if (r9 == 0) goto L7a
            java.util.List r2 = r9.getCategoryListReversedIds()
            java.lang.Integer r2 = r8.c(r2)
            if (r2 == 0) goto L7a
            int r2 = r2.intValue()
            r0.f25878a = r9
            r0.f25881d = r3
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r6 = r9
            r9 = r8
            r8 = r6
        L72:
            com.forsale.app.datalayer.database.CategoryEntity r9 = (com.forsale.app.datalayer.database.CategoryEntity) r9
            if (r9 == 0) goto L7a
            cb.a r5 = com.forsale.app.datalayer.database.CategoryTreeBriefKt.toCategoryBreadCrumbs(r8, r9)
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor.a(int, zz.a):java.lang.Object");
    }
}
