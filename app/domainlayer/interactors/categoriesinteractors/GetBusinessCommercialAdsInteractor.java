package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import com.forsale.app.datalayer.repositories.ListingsRepository;
import kotlin.jvm.internal.o;
/* compiled from: GetBusinessCommercialAdsInteractor.kt */
/* loaded from: classes2.dex */
public final class GetBusinessCommercialAdsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f22388a;

    public GetBusinessCommercialAdsInteractor(ListingsRepository listingsRepository) {
        o.i(listingsRepository, "listingsRepository");
        this.f22388a = listingsRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        r1 = kotlin.collections.q.f(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r22, zz.a<? super java.util.List<com.forsale.adserver.view.models.AdsModel>> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor$invoke$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor$invoke$1 r2 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor$invoke$1) r2
            int r3 = r2.f22391c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f22391c = r3
            goto L1c
        L17:
            com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor$invoke$1 r2 = new com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor$invoke$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f22389a
            java.lang.Object r15 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r2.f22391c
            r14 = 1
            if (r3 == 0) goto L35
            if (r3 != r14) goto L2d
            kotlin.f.b(r1)
            goto L63
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            kotlin.f.b(r1)
            com.forsale.app.datalayer.repositories.ListingsRepository r3 = r0.f22388a
            r4 = 1
            com.forsale.app.features.categories.listings.ListingsTypes r5 = com.forsale.app.features.categories.listings.ListingsTypes.BUSINESS_COMMERCIAL
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            r4 = r14
            r14 = r1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r22)
            r20 = r15
            r15 = r1
            r16 = 0
            r18 = 6140(0x17fc, float:8.604E-42)
            r19 = 0
            r2.f22391c = r4
            r17 = r2
            r4 = 1
            java.lang.Object r1 = com.forsale.app.datalayer.repositories.ListingsRepository.getGeneralListings$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r20
            if (r1 != r2) goto L63
            return r2
        L63:
            com.forsale.app.datalayer.network.responses.ListingsResponse r1 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r1
            if (r1 == 0) goto La2
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r1 = r1.getListings()
            if (r1 == 0) goto La2
            java.util.List r1 = r1.getBusinessCommercialItems()
            if (r1 == 0) goto La2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.p.f(r1)
            if (r1 == 0) goto La2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.p.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L8c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La3
            java.lang.Object r3 = r1.next()
            com.forsale.app.datalayer.network.responses.ListingItemBrief r3 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r3
            com.forsale.adserver.view.models.AdType r4 = com.forsale.adserver.view.models.AdType.BUSINESS_COMMERCIAL
            com.forsale.adserver.view.models.AdsModel r3 = r3.toAdsModel(r4)
            r2.add(r3)
            goto L8c
        La2:
            r2 = 0
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor.a(int, zz.a):java.lang.Object");
    }
}
