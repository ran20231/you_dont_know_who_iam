package com.forsale.app.interactors;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchItemModel;
import com.forsale.app.utils.analytics.SearchSource;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: TrendingClickInteractor.kt */
/* loaded from: classes2.dex */
public final class TrendingClickInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final SearchHistoryRepository f37483a;

    public TrendingClickInteractor(SearchHistoryRepository searchHistoryRepository) {
        o.i(searchHistoryRepository, "searchHistoryRepository");
        this.f37483a = searchHistoryRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.forsale.app.features.search.SearchItemModel r5, com.forsale.app.datalayer.database.SearchHistoryEntity.SearchHistorySource r6, zz.a<? super wz.p> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.interactors.TrendingClickInteractor$addSearchHistory$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.interactors.TrendingClickInteractor$addSearchHistory$1 r0 = (com.forsale.app.interactors.TrendingClickInteractor$addSearchHistory$1) r0
            int r1 = r0.f37486c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37486c = r1
            goto L18
        L13:
            com.forsale.app.interactors.TrendingClickInteractor$addSearchHistory$1 r0 = new com.forsale.app.interactors.TrendingClickInteractor$addSearchHistory$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f37484a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37486c
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
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r7 = r4.f37483a
            r0.f37486c = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.interactors.TrendingClickInteractor.b(com.forsale.app.features.search.SearchItemModel, com.forsale.app.datalayer.database.SearchHistoryEntity$SearchHistorySource, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object c(TrendingClickInteractor trendingClickInteractor, SearchItemModel searchItemModel, SearchHistoryEntity.SearchHistorySource searchHistorySource, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            searchHistorySource = SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY;
        }
        return trendingClickInteractor.b(searchItemModel, searchHistorySource, aVar);
    }

    public static /* synthetic */ Object e(TrendingClickInteractor trendingClickInteractor, SearchItemModel searchItemModel, SearchAnalyticsData searchAnalyticsData, String str, SearchSource searchSource, Integer num, a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            searchSource = SearchSource.TRENDING;
        }
        SearchSource searchSource2 = searchSource;
        if ((i11 & 16) != 0) {
            num = null;
        }
        return trendingClickInteractor.d(searchItemModel, searchAnalyticsData, str, searchSource2, num, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.forsale.app.features.search.SearchItemModel r24, com.forsale.app.features.search.SearchAnalyticsData r25, java.lang.String r26, com.forsale.app.utils.analytics.SearchSource r27, java.lang.Integer r28, zz.a<? super com.forsale.app.features.search.a> r29) {
        /*
            r23 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.forsale.app.interactors.TrendingClickInteractor$onTrendsItemClicked$1
            if (r1 == 0) goto L17
            r1 = r0
            com.forsale.app.interactors.TrendingClickInteractor$onTrendsItemClicked$1 r1 = (com.forsale.app.interactors.TrendingClickInteractor$onTrendsItemClicked$1) r1
            int r2 = r1.f37494h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f37494h = r2
            r8 = r23
            goto L1e
        L17:
            com.forsale.app.interactors.TrendingClickInteractor$onTrendsItemClicked$1 r1 = new com.forsale.app.interactors.TrendingClickInteractor$onTrendsItemClicked$1
            r8 = r23
            r1.<init>(r8, r0)
        L1e:
            r5 = r1
            java.lang.Object r0 = r5.f37492f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r5.f37494h
            r3 = 1
            if (r2 == 0) goto L53
            if (r2 != r3) goto L4b
            java.lang.Object r1 = r5.f37491e
            com.forsale.app.features.search.SearchItemModel r1 = (com.forsale.app.features.search.SearchItemModel) r1
            java.lang.Object r2 = r5.f37490d
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r3 = r5.f37489c
            com.forsale.app.utils.analytics.SearchSource r3 = (com.forsale.app.utils.analytics.SearchSource) r3
            java.lang.Object r4 = r5.f37488b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r5.f37487a
            com.forsale.app.features.search.SearchAnalyticsData r5 = (com.forsale.app.features.search.SearchAnalyticsData) r5
            kotlin.f.b(r0)
            r12 = r1
            r20 = r2
            r15 = r3
            r14 = r4
            r16 = r5
            goto L80
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L53:
            kotlin.f.b(r0)
            r4 = 0
            r6 = 2
            r7 = 0
            r0 = r25
            r5.f37487a = r0
            r9 = r26
            r5.f37488b = r9
            r10 = r27
            r5.f37489c = r10
            r11 = r28
            r5.f37490d = r11
            r12 = r24
            r5.f37491e = r12
            r5.f37494h = r3
            r2 = r23
            r3 = r24
            java.lang.Object r2 = c(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L7a
            return r1
        L7a:
            r16 = r0
            r14 = r9
            r15 = r10
            r20 = r11
        L80:
            com.forsale.app.datalayer.database.CategoryEntity r17 = r12.c()
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r18 = r12.e()
            com.forsale.app.features.search.a$b r0 = new com.forsale.app.features.search.a$b
            r19 = 0
            r21 = 32
            r22 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.interactors.TrendingClickInteractor.d(com.forsale.app.features.search.SearchItemModel, com.forsale.app.features.search.SearchAnalyticsData, java.lang.String, com.forsale.app.utils.analytics.SearchSource, java.lang.Integer, zz.a):java.lang.Object");
    }
}
