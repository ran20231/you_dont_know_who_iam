package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
/* compiled from: AutoCompleteSearchInterActor.kt */
/* loaded from: classes2.dex */
public final class AutoCompleteSearchInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f36453a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f36454b;

    public AutoCompleteSearchInterActor(ListingsRepository listingsRepository, CategoriesRepositories categoriesRepositories) {
        kotlin.jvm.internal.o.i(listingsRepository, "listingsRepository");
        kotlin.jvm.internal.o.i(categoriesRepositories, "categoriesRepositories");
        this.f36453a = listingsRepository;
        this.f36454b = categoriesRepositories;
    }

    private final Object b(List<Integer> list, zz.a<? super List<CategoryEntity>> aVar) {
        return this.f36454b.getCategoriesByIds(list, aVar);
    }

    private final List<Integer> c(List<AutoCompleteSearchResponse> list) {
        int y11;
        List<Integer> c02;
        List<AutoCompleteSearchResponse> list2 = list;
        y11 = kotlin.collections.s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (AutoCompleteSearchResponse autoCompleteSearchResponse : list2) {
            arrayList.add(Integer.valueOf(autoCompleteSearchResponse.getListingCategory()));
        }
        c02 = CollectionsKt___CollectionsKt.c0(arrayList);
        return c02;
    }

    private final CategoryEntity d(int i11, List<CategoryEntity> list) {
        Object obj;
        boolean z11;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((CategoryEntity) obj).getId() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (CategoryEntity) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, zz.a<? super java.util.List<com.forsale.app.features.search.SearchItemModel>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.search.AutoCompleteSearchInterActor$getAutoCompleteSearch$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.search.AutoCompleteSearchInterActor$getAutoCompleteSearch$1 r0 = (com.forsale.app.features.search.AutoCompleteSearchInterActor$getAutoCompleteSearch$1) r0
            int r1 = r0.f36459e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36459e = r1
            goto L18
        L13:
            com.forsale.app.features.search.AutoCompleteSearchInterActor$getAutoCompleteSearch$1 r0 = new com.forsale.app.features.search.AutoCompleteSearchInterActor$getAutoCompleteSearch$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f36457c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36459e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f36456b
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.f36455a
            com.forsale.app.features.search.AutoCompleteSearchInterActor r0 = (com.forsale.app.features.search.AutoCompleteSearchInterActor) r0
            kotlin.f.b(r9)
            goto L6c
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f36455a
            com.forsale.app.features.search.AutoCompleteSearchInterActor r8 = (com.forsale.app.features.search.AutoCompleteSearchInterActor) r8
            kotlin.f.b(r9)
            goto L55
        L44:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.repositories.ListingsRepository r9 = r7.f36453a
            r0.f36455a = r7
            r0.f36459e = r4
            java.lang.Object r9 = r9.getAutoCompleteSearch(r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r8 = r7
        L55:
            java.util.List r9 = (java.util.List) r9
            java.util.List r2 = r8.c(r9)
            r0.f36455a = r8
            r0.f36456b = r9
            r0.f36459e = r3
            java.lang.Object r0 = r8.b(r2, r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L6c:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.p.y(r8, r2)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
        L80:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r8.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L91
            kotlin.collections.p.x()
        L91:
            com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse r3 = (com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse) r3
            int r5 = r3.getListingCategory()
            com.forsale.app.datalayer.database.CategoryEntity r5 = r0.d(r5, r9)
            if (r5 == 0) goto La0
            r3.setCategoryEntity(r5)
        La0:
            com.forsale.app.features.search.SearchItemModel$a r5 = com.forsale.app.features.search.SearchItemModel.f36813h
            com.forsale.app.features.search.SearchItemModel r2 = r5.h(r3, r2)
            r1.add(r2)
            r2 = r4
            goto L80
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.AutoCompleteSearchInterActor.a(java.lang.String, zz.a):java.lang.Object");
    }
}
