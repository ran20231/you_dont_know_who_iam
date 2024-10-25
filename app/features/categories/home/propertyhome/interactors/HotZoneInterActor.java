package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.powerpins.ListingsScreenType;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: HotZoneInterActor.kt */
/* loaded from: classes2.dex */
public final class HotZoneInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f25014a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f25015b;

    public HotZoneInterActor(ListingsRepository listingsRepository, CategoriesRepositories categoriesRepositories) {
        o.i(listingsRepository, "listingsRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f25014a = listingsRepository;
        this.f25015b = categoriesRepositories;
    }

    public static /* synthetic */ Object c(HotZoneInterActor hotZoneInterActor, int i11, int i12, ListingsScreenType listingsScreenType, a aVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        return hotZoneInterActor.b(i11, i12, listingsScreenType, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, zz.a<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor$getCategoryShufflingFactor$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor$getCategoryShufflingFactor$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor$getCategoryShufflingFactor$1) r0
            int r1 = r0.f25018c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25018c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor$getCategoryShufflingFactor$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor$getCategoryShufflingFactor$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25016a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25018c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoriesRepositories r6 = r4.f25015b
            r0.f25018c = r3
            java.lang.Object r6 = r6.getCategoryDistrictByCategoryId(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.database.CategoryDistrict r6 = (com.forsale.app.datalayer.database.CategoryDistrict) r6
            int r5 = r6.getPinningShuffleFactor()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor.a(int, zz.a):java.lang.Object");
    }

    public final Object b(int i11, int i12, ListingsScreenType listingsScreenType, a<? super ListingsResponse> aVar) {
        return ListingsRepository.getNormalListings$default(this.f25014a, i11, listingsScreenType, kotlin.coroutines.jvm.internal.a.d(i12), null, null, null, null, null, null, null, null, aVar, 2040, null);
    }
}
