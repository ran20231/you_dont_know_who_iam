package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import kotlin.jvm.internal.o;
/* compiled from: SubCategoriesInterActor.kt */
/* loaded from: classes2.dex */
public final class SubCategoriesInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f25073a;

    /* renamed from: b  reason: collision with root package name */
    private final RegionsRepository f25074b;

    public SubCategoriesInterActor(CategoriesRepositories categoriesRepositories, RegionsRepository regionsRepository) {
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(regionsRepository, "regionsRepository");
        this.f25073a = categoriesRepositories;
        this.f25074b = regionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[PHI: r7 
      PHI: (r7v8 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:20:0x0061, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor$invoke$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor$invoke$1) r0
            int r1 = r0.f25079e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25079e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor$invoke$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25077c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25079e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f25076b
            java.lang.Object r2 = r0.f25075a
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = (com.forsale.app.datalayer.repositories.CategoriesRepositories) r2
            kotlin.f.b(r7)
            goto L52
        L3e:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r5.f25073a
            com.forsale.app.datalayer.repositories.RegionsRepository r7 = r5.f25074b
            r0.f25075a = r2
            r0.f25076b = r6
            r0.f25079e = r4
            java.lang.Object r7 = r7.getCurrentRegionId(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r4 = 0
            r0.f25075a = r4
            r0.f25079e = r3
            java.lang.Object r7 = r2.getCategoriesByParentId(r6, r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor.a(int, zz.a):java.lang.Object");
    }
}
