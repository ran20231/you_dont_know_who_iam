package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.a;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import java.util.List;
/* compiled from: MatchingCategoriesRepository.kt */
/* loaded from: classes2.dex */
public final class MatchingCategoriesRepository {

    /* renamed from: a  reason: collision with root package name */
    private final MatchedCategoriesInterActor f36596a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryTreeInteractor f36597b;

    /* renamed from: c  reason: collision with root package name */
    private final SearchHistoryRepository f36598c;

    /* compiled from: MatchingCategoriesRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36599a;

        static {
            int[] iArr = new int[SearchAnalyticsData.SearchSource.values().length];
            try {
                iArr[SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchAnalyticsData.SearchSource.RECENT_SEARCH_CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchAnalyticsData.SearchSource.SEARCH_BREADCRUMBS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36599a = iArr;
        }
    }

    public MatchingCategoriesRepository(MatchedCategoriesInterActor matchedCategoriesInterActor, CategoryTreeInteractor categoryTreeInteractor, SearchHistoryRepository searchHistoryRepository) {
        kotlin.jvm.internal.o.i(matchedCategoriesInterActor, "matchedCategoriesInterActor");
        kotlin.jvm.internal.o.i(categoryTreeInteractor, "categoryTreeInteractor");
        kotlin.jvm.internal.o.i(searchHistoryRepository, "searchHistoryRepository");
        this.f36596a = matchedCategoriesInterActor;
        this.f36597b = categoryTreeInteractor;
        this.f36598c = searchHistoryRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.forsale.app.features.search.SearchItemModel r5, com.forsale.app.datalayer.database.SearchHistoryEntity.SearchHistorySource r6, zz.a<? super wz.p> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.search.MatchingCategoriesRepository$addSearchHistory$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.search.MatchingCategoriesRepository$addSearchHistory$1 r0 = (com.forsale.app.features.search.MatchingCategoriesRepository$addSearchHistory$1) r0
            int r1 = r0.f36602c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36602c = r1
            goto L18
        L13:
            com.forsale.app.features.search.MatchingCategoriesRepository$addSearchHistory$1 r0 = new com.forsale.app.features.search.MatchingCategoriesRepository$addSearchHistory$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f36600a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36602c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            com.forsale.app.features.search.SearchItemModel$a r7 = com.forsale.app.features.search.SearchItemModel.f36813h
            com.forsale.app.datalayer.database.SearchHistoryEntity r5 = r7.e(r5, r6)
            if (r5 == 0) goto L50
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r7 = r4.f36598c
            r0.f36602c = r3
            java.lang.Object r7 = r7.insertNew(r5, r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Number r7 = (java.lang.Number) r7
            long r5 = r7.longValue()
            kotlin.coroutines.jvm.internal.a.e(r5)
        L50:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.MatchingCategoriesRepository.c(com.forsale.app.features.search.SearchItemModel, com.forsale.app.datalayer.database.SearchHistoryEntity$SearchHistorySource, zz.a):java.lang.Object");
    }

    private final com.forsale.app.features.search.a f(String str, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, CategoryEntity categoryEntity, CategoryEntity categoryEntity2, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention) {
        CategoryEntity.CategoryType categoryType;
        CategoryEntity categoryEntity3;
        int i11;
        HomeVisitedSources homeVisitedSources;
        if (categoryEntity != null) {
            categoryType = categoryEntity.getCategoryType();
        } else {
            categoryType = null;
        }
        if (categoryType == CategoryEntity.CategoryType.LISTINGS) {
            categoryEntity3 = categoryEntity2;
        } else {
            categoryEntity3 = categoryEntity;
        }
        a.b bVar = new a.b(str, searchSource, searchAnalyticsData, categoryEntity3, filtrationData, listingsIntention, null, 64, null);
        SearchAnalyticsData.SearchSource e11 = searchAnalyticsData.e();
        if (e11 == null) {
            i11 = -1;
        } else {
            i11 = a.f36599a[e11.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    homeVisitedSources = HomeVisitedSources.HOME_PAGE;
                } else {
                    homeVisitedSources = HomeVisitedSources.SEARCH_BREADCRUMBS;
                }
            } else {
                homeVisitedSources = HomeVisitedSources.RECENT_SEARCH_CATEGORIES;
            }
        } else {
            homeVisitedSources = HomeVisitedSources.SEARCH_CATEGORY;
        }
        if (categoryEntity != null && !categoryEntity.isListingCategory()) {
            return new a.C0422a(categoryEntity, homeVisitedSources);
        }
        return bVar;
    }

    public final Object d(String str, zz.a<? super List<CategoryEntity>> aVar) {
        return this.f36596a.a(str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.forsale.app.datalayer.database.CategoryEntity r23, com.forsale.app.utils.analytics.SearchSource r24, com.forsale.app.features.search.SearchAnalyticsData r25, zz.a<? super com.forsale.app.features.search.a> r26) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.MatchingCategoriesRepository.e(com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.utils.analytics.SearchSource, com.forsale.app.features.search.SearchAnalyticsData, zz.a):java.lang.Object");
    }
}
