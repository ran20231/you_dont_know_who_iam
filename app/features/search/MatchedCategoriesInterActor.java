package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import java.util.Comparator;
/* compiled from: MatchedCategoriesInterActor.kt */
/* loaded from: classes2.dex */
public final class MatchedCategoriesInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f36550a;

    /* renamed from: b  reason: collision with root package name */
    private final of.e f36551b;

    /* renamed from: c  reason: collision with root package name */
    private final of.g f36552c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            boolean z11;
            int a11;
            CategoryEntity.Classification classification = ((CategoryEntity) t12).getClassification();
            CategoryEntity.Classification classification2 = CategoryEntity.Classification.FOR_SALE;
            boolean z12 = true;
            if (classification == classification2) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            if (((CategoryEntity) t11).getClassification() != classification2) {
                z12 = false;
            }
            a11 = yz.b.a(valueOf, Boolean.valueOf(z12));
            return a11;
        }
    }

    public MatchedCategoriesInterActor(CategoriesRepositories categoriesRepositories, of.e searchTextInteractor, of.g sortByExactMatchInteractor) {
        kotlin.jvm.internal.o.i(categoriesRepositories, "categoriesRepositories");
        kotlin.jvm.internal.o.i(searchTextInteractor, "searchTextInteractor");
        kotlin.jvm.internal.o.i(sortByExactMatchInteractor, "sortByExactMatchInteractor");
        this.f36550a = categoriesRepositories;
        this.f36551b = searchTextInteractor;
        this.f36552c = sortByExactMatchInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final java.lang.String r8, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$1 r0 = (com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$1) r0
            int r1 = r0.f36557e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36557e = r1
            goto L18
        L13:
            com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$1 r0 = new com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f36555c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36557e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f36554b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.f36553a
            com.forsale.app.features.search.MatchedCategoriesInterActor r0 = (com.forsale.app.features.search.MatchedCategoriesInterActor) r0
            kotlin.f.b(r9)
            goto L55
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r9 = r7.f36550a
            of.e r2 = r7.f36551b
            r4 = 2
            r5 = 0
            r6 = 0
            java.util.List r2 = of.e.c(r2, r8, r6, r4, r5)
            r0.f36553a = r7
            r0.f36554b = r8
            r0.f36557e = r3
            java.lang.Object r9 = r9.getMatchedCategories(r8, r2, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            java.util.List r9 = (java.util.List) r9
            of.g r0 = r0.f36552c
            com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$2$1 r1 = new com.forsale.app.features.search.MatchedCategoriesInterActor$getMatchedCategories$2$1
            r1.<init>()
            java.util.List r8 = r0.a(r9, r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.forsale.app.features.search.MatchedCategoriesInterActor$a r9 = new com.forsale.app.features.search.MatchedCategoriesInterActor$a
            r9.<init>()
            java.util.List r8 = kotlin.collections.p.M0(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.MatchedCategoriesInterActor.a(java.lang.String, zz.a):java.lang.Object");
    }
}
