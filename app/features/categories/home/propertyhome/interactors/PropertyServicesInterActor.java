package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
/* compiled from: PropertyServicesInterActor.kt */
/* loaded from: classes2.dex */
public final class PropertyServicesInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f25029a;

    public PropertyServicesInterActor(CategoriesRepositories categoriesRepositories) {
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f25029a = categoriesRepositories;
    }

    private final List<CategoryEntity> b(List<CategoryEntity> list, List<Integer> list2) {
        int y11;
        int e11;
        int d11;
        List<CategoryEntity> list3 = list;
        y11 = s.y(list3, 10);
        e11 = i0.e(y11);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Object obj : list3) {
            linkedHashMap.put(Integer.valueOf(((CategoryEntity) obj).getId()), obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Number number : list2) {
            CategoryEntity categoryEntity = (CategoryEntity) linkedHashMap.get(Integer.valueOf(number.intValue()));
            if (categoryEntity != null) {
                arrayList.add(categoryEntity);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<java.lang.Integer> r5, zz.a<? super java.util.List<com.forsale.app.datalayer.database.CategoryEntity>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor$getCategories$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor$getCategories$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor$getCategories$1) r0
            int r1 = r0.f25034e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25034e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor$getCategories$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor$getCategories$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25032c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25034e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f25031b
            com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor r5 = (com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor) r5
            java.lang.Object r0 = r0.f25030a
            java.util.List r0 = (java.util.List) r0
            kotlin.f.b(r6)
            goto L4d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f25029a
            r0.f25030a = r5
            r0.f25031b = r4
            r0.f25034e = r3
            java.lang.Object r6 = r6.getCategoriesByIds(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
            r5 = r4
        L4d:
            java.util.List r6 = (java.util.List) r6
            java.util.List r5 = r5.b(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.PropertyServicesInterActor.a(java.util.List, zz.a):java.lang.Object");
    }
}
