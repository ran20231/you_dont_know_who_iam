package com.forsale.app.features.search;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository;
import com.forsale.app.datalayer.repositories.TrendsRepository;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel;
import com.forsale.app.features.search.bannerItem.SearchHomeBannerItemViewModel;
import com.forsale.app.interactors.GetTrendTitleInteractor;
import com.forsale.app.ui.recyclerviewitems.horizontalChips.HorizontalChipsItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewPadding;
import com.forsale.app.utils.itemutils.ViewSpacing;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import t9.p0;
import t9.y0;
import yh.c;
/* compiled from: SearchViewModel.kt */
/* loaded from: classes2.dex */
public final class SearchViewModel extends BaseStatefulViewModel {
    private final LiveData<List<x9.b<?>>> A0;
    private final androidx.lifecycle.b0<TextHolder> B0;
    private final androidx.lifecycle.b0<TextHolder> C0;
    private final androidx.lifecycle.b0<List<qc.b<?>>> D0;
    private final androidx.lifecycle.b0<Boolean> E0;
    private final androidx.lifecycle.b0<Boolean> F0;
    private final OneShotEventHandler<Triple<String, SearchSource, Integer>> G0;
    private final Flow<List<TrendEntity>> H0;
    private final androidx.lifecycle.b0<List<bi.b<?>>> I0;
    private final androidx.lifecycle.b0<Boolean> J0;
    private final androidx.lifecycle.b0<List<qc.b<?>>> K0;
    private final androidx.lifecycle.b0<Boolean> L0;
    private final LiveData<Boolean> M0;

    /* renamed from: l0  reason: collision with root package name */
    private final MasterDataRepository f36833l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ListingsRepository f36834m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ApplicationResourcesRepository f36835n0;

    /* renamed from: o0  reason: collision with root package name */
    private final GAMRepository f36836o0;

    /* renamed from: p0  reason: collision with root package name */
    private final TrendsRepository f36837p0;

    /* renamed from: q0  reason: collision with root package name */
    private final SearchHistoryRepository f36838q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SearchRecommendedListingsRepository f36839r0;

    /* renamed from: s0  reason: collision with root package name */
    private final nc.a f36840s0;

    /* renamed from: t0  reason: collision with root package name */
    private final GetTrendTitleInteractor f36841t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<wz.p> f36842u0;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<wz.p> f36843v0;

    /* renamed from: w0  reason: collision with root package name */
    private final OneShotEventHandler<PLFSource> f36844w0;

    /* renamed from: x0  reason: collision with root package name */
    private final androidx.lifecycle.b0<RegionEntity> f36845x0;

    /* renamed from: y0  reason: collision with root package name */
    private final androidx.lifecycle.b0<MasterDataMiscModel> f36846y0;

    /* renamed from: z0  reason: collision with root package name */
    private final androidx.lifecycle.b0<List<x9.b<?>>> f36847z0;

    /* compiled from: SearchViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        SearchViewModel a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel(MasterDataRepository masterDataRepository, ListingsRepository listingsRepository, ApplicationResourcesRepository arr, GAMRepository gamRepository, TrendsRepository trendsRepository, SearchHistoryRepository searchHistoryRepository, SearchRecommendedListingsRepository recommendedListingsRepository, nc.a getSwipeableListInteractor, BaseRepository baseRepository, GetTrendTitleInteractor getTrendTitleInteractor) {
        super(baseRepository);
        kotlin.jvm.internal.o.i(masterDataRepository, "masterDataRepository");
        kotlin.jvm.internal.o.i(listingsRepository, "listingsRepository");
        kotlin.jvm.internal.o.i(arr, "arr");
        kotlin.jvm.internal.o.i(gamRepository, "gamRepository");
        kotlin.jvm.internal.o.i(trendsRepository, "trendsRepository");
        kotlin.jvm.internal.o.i(searchHistoryRepository, "searchHistoryRepository");
        kotlin.jvm.internal.o.i(recommendedListingsRepository, "recommendedListingsRepository");
        kotlin.jvm.internal.o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        kotlin.jvm.internal.o.i(baseRepository, "baseRepository");
        kotlin.jvm.internal.o.i(getTrendTitleInteractor, "getTrendTitleInteractor");
        this.f36833l0 = masterDataRepository;
        this.f36834m0 = listingsRepository;
        this.f36835n0 = arr;
        this.f36836o0 = gamRepository;
        this.f36837p0 = trendsRepository;
        this.f36838q0 = searchHistoryRepository;
        this.f36839r0 = recommendedListingsRepository;
        this.f36840s0 = getSwipeableListInteractor;
        this.f36841t0 = getTrendTitleInteractor;
        this.f36842u0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f36843v0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f36844w0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f36845x0 = new androidx.lifecycle.b0<>();
        this.f36846y0 = new androidx.lifecycle.b0<>();
        androidx.lifecycle.b0<List<x9.b<?>>> b0Var = new androidx.lifecycle.b0<>();
        this.f36847z0 = b0Var;
        this.A0 = b0Var;
        this.B0 = new androidx.lifecycle.b0<>();
        this.C0 = new androidx.lifecycle.b0<>();
        this.D0 = new androidx.lifecycle.b0<>();
        this.E0 = new androidx.lifecycle.b0<>();
        this.F0 = new androidx.lifecycle.b0<>();
        this.G0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.H0 = trendsRepository.getTrendsFlow();
        this.I0 = new androidx.lifecycle.b0<>();
        this.J0 = new androidx.lifecycle.b0<>();
        this.K0 = new androidx.lifecycle.b0<>();
        androidx.lifecycle.b0<Boolean> b0Var2 = new androidx.lifecycle.b0<>();
        this.L0 = b0Var2;
        this.M0 = b0Var2;
        t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qc.b<?> A1(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, ListingsTypes listingsTypes, List<Integer> list) {
        return new zc.b(listingItemBrief, listingsSettings, this.f36845x0, this.f36846y0, this.f36835n0, new g00.p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$mapToHalfScreenListingItemViewModel$1
            public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                kotlin.jvm.internal.o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                b(listingItemBrief2, list2);
                return wz.p.f75480a;
            }
        }, Integer.valueOf(p0.f69711k), null, AnalyticsDetailsSource.Companion.a(listingsTypes).getValue(), false, false, null, 0, r0.a(this), list, 7808, null);
    }

    private final yh.c B1(TrendEntity trendEntity, int i11) {
        return new yh.c(trendEntity.getId(), new c.a(trendEntity.getAr(), trendEntity.getEn()), null, Integer.valueOf(i11 + 1), 4, null);
    }

    private final List<yh.b> C1(List<TrendEntity> list) {
        List f11;
        int y11;
        yh.c B1;
        ArrayList arrayList = new ArrayList();
        f11 = kotlin.collections.q.f(list);
        List list2 = f11;
        y11 = kotlin.collections.s.y(list2, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.r.x();
            }
            TrendEntity trendEntity = (TrendEntity) obj;
            yh.c cVar = null;
            if (trendEntity != null && (B1 = B1(trendEntity, i11)) != null) {
                arrayList.add(h1(B1));
                cVar = B1;
            }
            arrayList2.add(cVar);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E1(boolean r5, g00.l<? super zz.a<? super wz.p>, ? extends java.lang.Object> r6, zz.a<? super java.lang.Throwable> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.search.SearchViewModel$neglectErrorOnCondition$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.search.SearchViewModel$neglectErrorOnCondition$1 r0 = (com.forsale.app.features.search.SearchViewModel$neglectErrorOnCondition$1) r0
            int r1 = r0.f36887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36887d = r1
            goto L18
        L13:
            com.forsale.app.features.search.SearchViewModel$neglectErrorOnCondition$1 r0 = new com.forsale.app.features.search.SearchViewModel$neglectErrorOnCondition$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f36885b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36887d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r5 = r0.f36884a
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L43
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.f.b(r7)
            r0.f36884a = r5     // Catch: java.lang.Throwable -> L43
            r0.f36887d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L41
            return r1
        L41:
            r5 = 0
            return r5
        L43:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Trends:: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = " "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            x10.a.b(r7, r0)
            if (r5 == 0) goto L66
            return r6
        L66:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel.E1(boolean, g00.l, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1() {
        this.f36843v0.i(wz.p.f75480a);
        AggregatedAllAnalyticsLoggerKt.G0(r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1() {
        this.f36844w0.i(PLFSource.SEARCH_EMPTY_SPOTLIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(AggregatedAllAnalyticsLogger.CustomEvents customEvents, int i11, String str, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$recordAnalytics$1(this, customEvents, i11, str, num, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I1(SearchViewModel searchViewModel, AggregatedAllAnalyticsLogger.CustomEvents customEvents, int i11, String str, Integer num, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            num = null;
        }
        searchViewModel.H1(customEvents, i11, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$recordSwipe$1(this, i11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O1(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.search.SearchViewModel$showSearchRecommended$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.search.SearchViewModel$showSearchRecommended$1 r0 = (com.forsale.app.features.search.SearchViewModel$showSearchRecommended$1) r0
            int r1 = r0.f36904c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36904c = r1
            goto L18
        L13:
            com.forsale.app.features.search.SearchViewModel$showSearchRecommended$1 r0 = new com.forsale.app.features.search.SearchViewModel$showSearchRecommended$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f36902a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f36904c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.repositories.MasterDataRepository r5 = r4.f36833l0
            r0.f36904c = r3
            java.lang.Object r5 = r5.isHomeRecommendedCollapsed(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel.O1(zz.a):java.lang.Object");
    }

    private final zc.b P1(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, ListingsTypes listingsTypes, List<Integer> list) {
        androidx.lifecycle.b0<RegionEntity> b0Var = this.f36845x0;
        androidx.lifecycle.b0<MasterDataMiscModel> b0Var2 = this.f36846y0;
        ApplicationResourcesRepository applicationResourcesRepository = this.f36835n0;
        String value = AnalyticsDetailsSource.Companion.a(listingsTypes).getValue();
        int i11 = p0.f69711k;
        return new zc.b(listingItemBrief, listingsSettings, b0Var, b0Var2, applicationResourcesRepository, new g00.p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$toHalfScreenListingsViewModel$1
            public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                kotlin.jvm.internal.o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                b(listingItemBrief2, list2);
                return wz.p.f75480a;
            }
        }, Integer.valueOf(i11), null, value, false, false, null, 0, r0.a(this), list, 7808, null);
    }

    private final void c1(String str, SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$addNewSearchHistory$1(this, new SearchHistoryEntity(0, str, null, null, null, null, searchHistorySource, 61, null), searchHistorySource, null), 3, null);
    }

    static /* synthetic */ void d1(SearchViewModel searchViewModel, String str, SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            searchHistorySource = SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY;
        }
        searchViewModel.c1(str, searchHistorySource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<x9.b<?>> f1() {
        HorizontalListingsItemViewModel.Companion companion = HorizontalListingsItemViewModel.f30736y;
        List f11 = HorizontalListingsItemViewModel.Companion.f(companion, this.B0, this.C0, this.D0, this.E0, new SearchViewModel$createScreenViewModels$spotlightViewModels$1(this), this.F0, gj.d.a(new g00.l<ViewSpacing, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$createScreenViewModels$spotlightViewModels$2
            public final void b(ViewSpacing viewSpacing) {
                kotlin.jvm.internal.o.i(viewSpacing, "$this$viewSpacing");
                int i11 = p0.f69704d;
                viewSpacing.c(new ViewMargins(Integer.valueOf(i11), Integer.valueOf(i11), Integer.valueOf(p0.f69712l), null, 8, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return wz.p.f75480a;
            }
        }), null, 0, gj.d.a(new g00.l<ViewSpacing, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$createScreenViewModels$spotlightViewModels$3
            public final void b(ViewSpacing viewSpacing) {
                kotlin.jvm.internal.o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.d(new ViewPadding(Integer.valueOf(p0.f69704d), Integer.valueOf(p0.f69704d), null, null, 12, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return wz.p.f75480a;
            }
        }), null, 1408, null);
        List b11 = HorizontalChipsItemViewModel.a.b(HorizontalChipsItemViewModel.f39457h, FlowLiveDataConversions.c(q1(), null, 0L, 3, null), this.I0, null, 2, new ViewPadding(Integer.valueOf(p0.f69704d), Integer.valueOf(p0.f69704d), null, null, 12, null), new ViewMargins(Integer.valueOf(p0.f69704d), null, Integer.valueOf(p0.f69712l), null, 10, null), 4, null);
        SearchHomeBannerItemViewModel searchHomeBannerItemViewModel = new SearchHomeBannerItemViewModel(this.f36836o0);
        List<qc.b<?>> c11 = companion.c(new androidx.lifecycle.b0(new TextHolder(Integer.valueOf(y0.Fd), null, null, 6, null)), new androidx.lifecycle.b0(new TextHolder(Integer.valueOf(y0.Ed), null, null, 6, null)), this.K0, this.J0, gj.d.a(new g00.l<ViewSpacing, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$createScreenViewModels$recommendedViewModels$2
            public final void b(ViewSpacing viewSpacing) {
                kotlin.jvm.internal.o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.c(new ViewMargins(Integer.valueOf(p0.f69704d), null, Integer.valueOf(p0.f69712l), null, 10, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return wz.p.f75480a;
            }
        }), new bd.c(new g00.l<Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$createScreenViewModels$recommendedViewModels$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(int i11) {
                SearchViewModel.this.K1(i11);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Integer num) {
                b(num.intValue());
                return wz.p.f75480a;
            }
        }), 1, gj.d.a(new g00.l<ViewSpacing, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$createScreenViewModels$recommendedViewModels$3
            public final void b(ViewSpacing viewSpacing) {
                kotlin.jvm.internal.o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.d(new ViewPadding(Integer.valueOf(p0.f69704d), Integer.valueOf(p0.f69704d), null, null, 12, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return wz.p.f75480a;
            }
        }));
        df.b bVar = new df.b(this.f36836o0, 0, null, 6, null);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f11);
        arrayList.addAll(b11);
        arrayList.add(searchHomeBannerItemViewModel);
        arrayList.addAll(c11);
        arrayList.add(bVar);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
        r14 = kotlin.collections.q.e(new vc.b(r14, new com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$1$1(r13)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<qc.b<?>> g1(com.forsale.app.datalayer.network.responses.ListingsResponse r14) {
        /*
            r13 = this;
            com.forsale.app.utils.y r0 = com.forsale.app.utils.y.f40549a
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r1 = r14.getUiSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$PinningSettings r1 = r1.getPinningSettings()
            java.lang.Integer r1 = r1.getPinningShuffleFactor()
            kotlin.jvm.internal.o.f(r1)
            int r1 = r1.intValue()
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r2 = r14.getListings()
            java.util.List r2 = r2.getPinnedShuffleItems()
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r3 = r14.getListings()
            java.util.List r3 = r3.getPinnedItems()
            java.util.List r0 = r0.a(r1, r2, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L52
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r14 = r14.getUiSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$PinningSettings r14 = r14.getPinningSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$PinningSettings$EmptyArtwork r14 = r14.getEmptyArtwork()
            if (r14 == 0) goto L4d
            vc.b r0 = new vc.b
            com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$1$1 r1 = new com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$1$1
            r1.<init>(r13)
            r0.<init>(r14, r1)
            java.util.List r14 = kotlin.collections.p.e(r0)
            if (r14 != 0) goto L51
        L4d:
            java.util.List r14 = kotlin.collections.p.n()
        L51:
            return r14
        L52:
            java.util.List r7 = com.forsale.app.datalayer.network.responses.ListingItemBriefKt.itemsIds(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.p.y(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r9 = r0.iterator()
        L67:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r9.next()
            r10 = r0
            com.forsale.app.datalayer.network.responses.ListingItemBrief r10 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r10
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r0 = r14.getUiSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$ListingsSettings r11 = r0.getListingsSettings()
            com.forsale.app.features.categories.listings.ListingsTypes r12 = com.forsale.app.features.categories.listings.ListingsTypes.SPOTLIGHT
            nc.a r0 = r13.f36840s0
            int r2 = r10.getId()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r1 = r7
            java.util.List r0 = nc.a.b(r0, r1, r2, r3, r4, r5, r6)
            zc.b r0 = r13.P1(r10, r11, r12, r0)
            r8.add(r0)
            goto L67
        L96:
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r0 = r14.getUiSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FillersSettings r0 = r0.getFillersSettings()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FillersSettings$Pinned r0 = r0.getPinned()
            if (r0 == 0) goto Lb8
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r14 = r14.getUiSettings()
            int r0 = t9.p0.f69711k
            com.forsale.app.utils.analytics.PLFSource r1 = com.forsale.app.utils.analytics.PLFSource.SEARCH_SPOTLIGHT
            zc.d r2 = new zc.d
            com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1 r3 = new g00.l<com.forsale.app.utils.analytics.FillerType, wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1
                static {
                    /*
                        com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1 r0 = new com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1) com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1.a com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1.<init>():void");
                }

                public final void b(com.forsale.app.utils.analytics.FillerType r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.o.i(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1.b(com.forsale.app.utils.analytics.FillerType):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(com.forsale.app.utils.analytics.FillerType r1) {
                    /*
                        r0 = this;
                        com.forsale.app.utils.analytics.FillerType r1 = (com.forsale.app.utils.analytics.FillerType) r1
                        r0.b(r1)
                        wz.p r1 = wz.p.f75480a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel$formSpotlightListingViewModels$fillerViewModel$1$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r14, r3, r0, r1)
            goto Lb9
        Lb8:
            r2 = 0
        Lb9:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.addAll(r8)
            if (r2 == 0) goto Lc6
            r14.add(r2)
        Lc6:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchViewModel.g1(com.forsale.app.datalayer.network.responses.ListingsResponse):java.util.List");
    }

    private final yh.b h1(final yh.c cVar) {
        return new yh.b(cVar, new gj.a(null, null, Integer.valueOf(p0.f69703c), Integer.valueOf(p0.f69703c), 3, null), new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchViewModel$getChipItemViewModel$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SearchViewModel searchViewModel = SearchViewModel.this;
                String a11 = cVar.b().a();
                Integer c11 = cVar.c();
                searchViewModel.s1(a11, c11 != null ? c11.intValue() : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k1(zz.a<? super String> aVar) {
        return this.f36839r0.getRecommendedSource(aVar);
    }

    private final Flow<TextHolder> q1() {
        return this.f36841t0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(Throwable th2) {
        ViewStates viewStates;
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            viewStates = ViewStates.CONNECTION_ERROR;
        } else {
            viewStates = ViewStates.ERROR;
        }
        v0().postValue(viewStates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(String str, int i11) {
        z1(str);
        d1(this, str, null, 2, null);
        this.G0.i(new Triple<>(str, SearchSource.TRENDING, Integer.valueOf(i11)));
    }

    private final Deferred<?> u1(boolean z11) {
        Deferred<?> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new SearchViewModel$loadAndHandleRecommendedAsync$1(this, z11, null), 3, null);
        return async$default;
    }

    private final Deferred<?> v1() {
        Deferred<?> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new SearchViewModel$loadAndHandleSpotlightAsync$1(this, null), 3, null);
        return async$default;
    }

    private final Deferred<?> w1(boolean z11) {
        Deferred<?> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new SearchViewModel$loadAndHandleTrendingAsync$1(this, z11, null), 3, null);
        return async$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x1(boolean z11, zz.a<? super wz.p> aVar) {
        List q11;
        Object f11;
        q11 = kotlin.collections.r.q(v1(), w1(z11), u1(z11));
        Object awaitAll = AwaitKt.awaitAll(q11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (awaitAll == f11) {
            return awaitAll;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object y1(SearchViewModel searchViewModel, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return searchViewModel.x1(z11, aVar);
    }

    private final void z1(String str) {
        AggregatedAllAnalyticsLoggerKt.L0(r(), str, AggregatedAllAnalyticsLogger.SearchPageSource.SEARCH_PAGE.getValue());
    }

    public final void D1(List<TrendEntity> list) {
        kotlin.jvm.internal.o.i(list, "list");
        this.I0.postValue(C1(list));
    }

    public final void J1() {
        AggregatedAllAnalyticsLoggerKt.E0(r());
    }

    public final void N1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$refresh$1(this, null), 3, null);
    }

    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$checkForRecommendedListings$1(this, null), 3, null);
    }

    public final OneShotEventHandler<PLFSource> i1() {
        return this.f36844w0;
    }

    public final OneShotEventHandler<Triple<String, SearchSource, Integer>> j1() {
        return this.G0;
    }

    public final LiveData<List<x9.b<?>>> l1() {
        return this.A0;
    }

    public final OneShotEventHandler<wz.p> m1() {
        return this.f36842u0;
    }

    public final OneShotEventHandler<wz.p> n1() {
        return this.f36843v0;
    }

    public final LiveData<Boolean> o1() {
        return this.M0;
    }

    public final Flow<List<TrendEntity>> p1() {
        return this.H0;
    }

    public final void t1() {
        this.L0.postValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchViewModel$initLoad$1(this, null), 3, null);
    }
}
