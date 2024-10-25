package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.services.RecommendService;
import java.util.List;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SearchRecommendedListingsRepository.kt */
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository {
    public static final int $stable = 8;
    private final CategoriesRepositories categoriesRepositories;
    private final ListingItemBriefDao listingItemBriefDao;
    private final jj.b prefs;
    private final RecommendService recommendService;
    private final RegionsRepository regionsRepository;
    private final TranslationRepository translationRepository;

    public SearchRecommendedListingsRepository(jj.b prefs, RecommendService recommendService, RegionsRepository regionsRepository, TranslationRepository translationRepository, ListingItemBriefDao listingItemBriefDao, CategoriesRepositories categoriesRepositories) {
        o.i(prefs, "prefs");
        o.i(recommendService, "recommendService");
        o.i(regionsRepository, "regionsRepository");
        o.i(translationRepository, "translationRepository");
        o.i(listingItemBriefDao, "listingItemBriefDao");
        o.i(categoriesRepositories, "categoriesRepositories");
        this.prefs = prefs;
        this.recommendService = recommendService;
        this.regionsRepository = regionsRepository;
        this.translationRepository = translationRepository;
        this.listingItemBriefDao = listingItemBriefDao;
        this.categoriesRepositories = categoriesRepositories;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deviceId(zz.a<? super String> aVar) {
        return this.prefs.c().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRecommendedExpiryDate(zz.a<? super String> aVar) {
        return this.prefs.l().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSearchRecommendedListingsCached(zz.a<? super List<ListingItemBrief>> aVar) {
        return this.listingItemBriefDao.getAllListingItems(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSearchRecommendedListingsServer(zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief>> r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.getSearchRecommendedListingsServer(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasCachedData(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$hasCachedData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$hasCachedData$1 r0 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$hasCachedData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$hasCachedData$1 r0 = new com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$hasCachedData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getRecommendedExpiryDate(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L4a
            int r5 = r5.length()
            if (r5 != 0) goto L48
            goto L4a
        L48:
            r5 = 0
            goto L4b
        L4a:
            r5 = r3
        L4b:
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.hasCachedData(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isRecommendedListingsExpired(zz.a<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$isRecommendedListingsExpired$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$isRecommendedListingsExpired$1 r0 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$isRecommendedListingsExpired$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$isRecommendedListingsExpired$1 r0 = new com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$isRecommendedListingsExpired$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.f.b(r6)
            r0.label = r3
            java.lang.Object r6 = r5.getRecommendedExpiryDate(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L4c
            int r0 = r0.length()
            if (r0 != 0) goto L4a
            goto L4c
        L4a:
            r0 = r1
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L50
            goto L51
        L50:
            r6 = 0
        L51:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "RecommendedListings: getRecommendedExpiryDate: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            x10.a.b(r0, r2)
            java.util.Date r6 = com.forsale.app.utils.TypeExtensionsKt.z(r6)     // Catch: java.text.ParseException -> L9e
            java.util.Date r0 = new java.util.Date     // Catch: java.text.ParseException -> L9e
            r0.<init>()     // Catch: java.text.ParseException -> L9e
            java.util.Date r0 = com.forsale.app.utils.TypeExtensionsKt.y(r0)     // Catch: java.text.ParseException -> L9e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> L9e
            r2.<init>()     // Catch: java.text.ParseException -> L9e
            java.lang.String r4 = "RecommendedListings: currentDate: "
            r2.append(r4)     // Catch: java.text.ParseException -> L9e
            r2.append(r0)     // Catch: java.text.ParseException -> L9e
            java.lang.String r4 = " expireDate: "
            r2.append(r4)     // Catch: java.text.ParseException -> L9e
            r2.append(r6)     // Catch: java.text.ParseException -> L9e
            java.lang.String r2 = r2.toString()     // Catch: java.text.ParseException -> L9e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.text.ParseException -> L9e
            x10.a.b(r2, r4)     // Catch: java.text.ParseException -> L9e
            int r6 = r0.compareTo(r6)     // Catch: java.text.ParseException -> L9e
            if (r6 <= 0) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r6
        La3:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.isRecommendedListingsExpired(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveSearchRecommendedListings(com.forsale.app.datalayer.network.responses.ListingsResponse r7, zz.a<? super wz.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$saveSearchRecommendedListings$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$saveSearchRecommendedListings$1 r0 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$saveSearchRecommendedListings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$saveSearchRecommendedListings$1 r0 = new com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$saveSearchRecommendedListings$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r8)
            goto La1
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$1
            com.forsale.app.datalayer.network.responses.ListingsResponse r7 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r7
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository r2 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository) r2
            kotlin.f.b(r8)
            goto L7a
        L44:
            java.lang.Object r7 = r0.L$1
            com.forsale.app.datalayer.network.responses.ListingsResponse r7 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r7
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository r2 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository) r2
            kotlin.f.b(r8)
            goto L67
        L50:
            kotlin.f.b(r8)
            java.lang.String r8 = r7.getRecommendedExpiryDate()
            if (r8 == 0) goto L66
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r6.setRecommendedExpiryDate(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r2 = r6
        L67:
            java.lang.String r8 = r7.getSource()
            if (r8 == 0) goto L7a
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r2.setRecommendedSource(r8, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r8 = r7.getListings()
            java.util.List r4 = r8.getNormalItems()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            r5 = 0
            if (r4 == 0) goto L8d
            goto L8e
        L8d:
            r8 = r5
        L8e:
            if (r8 == 0) goto La1
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r7 = r7.getListings()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r2.updateSearchRecommendedListingsDB(r7, r0)
            if (r7 != r1) goto La1
            return r1
        La1:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.saveSearchRecommendedListings(com.forsale.app.datalayer.network.responses.ListingsResponse, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setRecommendedExpiryDate(String str, zz.a<? super p> aVar) {
        Object f11;
        Object g11 = this.prefs.l().g(str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (g11 == f11) {
            return g11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setRecommendedSource(String str, zz.a<? super p> aVar) {
        Object f11;
        Object b11 = this.prefs.l().b(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (b11 == f11) {
            return b11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSearchRecommendedListingsDB(com.forsale.app.datalayer.network.responses.ListingsResponse.Listings r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1 r0 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1 r0 = new com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r6 = (com.forsale.app.datalayer.network.responses.ListingsResponse.Listings) r6
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository r2 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository) r2
            kotlin.f.b(r7)
            goto L53
        L40:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.ListingItemBriefDao r7 = r5.listingItemBriefDao
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.deleteAllListingItems(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            com.forsale.app.datalayer.repositories.ListingItemBriefDao r7 = r2.listingItemBriefDao
            java.util.List r6 = r6.getNormalItems()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r7.insertAllListingItems(r6, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.updateSearchRecommendedListingsDB(com.forsale.app.datalayer.network.responses.ListingsResponse$Listings, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearSearchRecommendedListings(zz.a<? super wz.p> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$clearSearchRecommendedListings$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$clearSearchRecommendedListings$1 r0 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$clearSearchRecommendedListings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$clearSearchRecommendedListings$1 r0 = new com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository$clearSearchRecommendedListings$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r7)
            goto L7d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository r2 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository) r2
            kotlin.f.b(r7)
            goto L6f
        L3f:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository r2 = (com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository) r2
            kotlin.f.b(r7)
            goto L56
        L47:
            kotlin.f.b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.hasCachedData(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L80
            jj.b r7 = r2.prefs
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r7 = r7.l()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            com.forsale.app.datalayer.repositories.ListingItemBriefDao r7 = r2.listingItemBriefDao
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.deleteAllListingItems(r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            wz.p r7 = wz.p.f75480a
            return r7
        L80:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.clearSearchRecommendedListings(zz.a):java.lang.Object");
    }

    public final Object getCurrentRegion(zz.a<? super RegionEntity> aVar) {
        return this.regionsRepository.getCurrentRegion(aVar);
    }

    public final Object getRecommendedSource(zz.a<? super String> aVar) {
        return this.prefs.l().b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ea -> B:41:0x00eb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSearchRecommendedListings(zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief>> r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository.getSearchRecommendedListings(zz.a):java.lang.Object");
    }
}
