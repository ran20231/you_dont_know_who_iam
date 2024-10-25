package com.forsale.app.features.search;

import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.interactors.TrendingClickInteractor;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.SearchLocation;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import j0.k0;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: SearchFocusViewModel.kt */
/* loaded from: classes2.dex */
public final class SearchFocusViewModel extends BaseViewModel {
    public static final a J0 = new a(null);
    public static final int K0 = 8;
    private final OneShotEventHandler<String> A0;
    private boolean B0;
    private final OneShotEventHandler<Pair<String, SearchSource>> C0;
    private final androidx.lifecycle.b0<Boolean> D0;
    private final k0 E0;
    private final Channel<c> F0;
    private final Flow<c> G0;
    private final Channel<com.forsale.app.features.search.a> H0;
    private final Flow<com.forsale.app.features.search.a> I0;

    /* renamed from: k0  reason: collision with root package name */
    private final String f36700k0;

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f36701l0;

    /* renamed from: m0  reason: collision with root package name */
    private final Boolean f36702m0;

    /* renamed from: n0  reason: collision with root package name */
    private final SearchSource f36703n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Integer f36704o0;

    /* renamed from: p0  reason: collision with root package name */
    private final SearchHistoryRepository f36705p0;

    /* renamed from: q0  reason: collision with root package name */
    private final RegionsRepository f36706q0;

    /* renamed from: r0  reason: collision with root package name */
    private final h0 f36707r0;

    /* renamed from: s0  reason: collision with root package name */
    private final AutoCompleteSearchInterActor f36708s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MatchingCategoriesRepository f36709t0;

    /* renamed from: u0  reason: collision with root package name */
    private final TrendingClickInteractor f36710u0;

    /* renamed from: v0  reason: collision with root package name */
    private final androidx.lifecycle.b0<String> f36711v0;

    /* renamed from: w0  reason: collision with root package name */
    private final OneShotEventHandler<wz.p> f36712w0;

    /* renamed from: x0  reason: collision with root package name */
    private final OneShotEventHandler<wz.p> f36713x0;

    /* renamed from: y0  reason: collision with root package name */
    private final androidx.lifecycle.b0<Boolean> f36714y0;

    /* renamed from: z0  reason: collision with root package name */
    private final OneShotEventHandler<Object> f36715z0;

    /* compiled from: SearchFocusViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class SearchState {

        /* renamed from: a  reason: collision with root package name */
        private final List<SearchItemModel> f36716a;

        /* renamed from: b  reason: collision with root package name */
        private final List<TrendEntity> f36717b;

        /* renamed from: c  reason: collision with root package name */
        private final TrendEntity f36718c;

        /* renamed from: d  reason: collision with root package name */
        private final String f36719d;

        /* renamed from: e  reason: collision with root package name */
        private final String f36720e;

        /* renamed from: f  reason: collision with root package name */
        private final SearchSource f36721f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f36722g;

        /* renamed from: h  reason: collision with root package name */
        private final AutoCompleteState f36723h;

        /* renamed from: i  reason: collision with root package name */
        private final List<CategoryEntity> f36724i;

        /* renamed from: j  reason: collision with root package name */
        private final Integer f36725j;

        /* renamed from: k  reason: collision with root package name */
        private final SearchAnalyticsData.SearchSource f36726k;

        /* compiled from: SearchFocusViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class AutoCompleteState {

            /* renamed from: a  reason: collision with root package name */
            private final List<SearchItemModel> f36727a;

            /* renamed from: b  reason: collision with root package name */
            private final ViewState f36728b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SearchFocusViewModel.kt */
            /* loaded from: classes2.dex */
            public static final class ViewState {
                private static final /* synthetic */ a00.a $ENTRIES;
                private static final /* synthetic */ ViewState[] $VALUES;
                public static final ViewState Idle = new ViewState("Idle", 0);
                public static final ViewState Loading = new ViewState("Loading", 1);
                public static final ViewState Success = new ViewState("Success", 2);
                public static final ViewState Failure = new ViewState("Failure", 3);

                private static final /* synthetic */ ViewState[] $values() {
                    return new ViewState[]{Idle, Loading, Success, Failure};
                }

                static {
                    ViewState[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = kotlin.enums.a.a($values);
                }

                private ViewState(String str, int i11) {
                }

                public static a00.a<ViewState> getEntries() {
                    return $ENTRIES;
                }

                public static ViewState valueOf(String str) {
                    return (ViewState) Enum.valueOf(ViewState.class, str);
                }

                public static ViewState[] values() {
                    return (ViewState[]) $VALUES.clone();
                }
            }

            public AutoCompleteState() {
                this(null, null, 3, null);
            }

            public final List<SearchItemModel> a() {
                return this.f36727a;
            }

            public final boolean b() {
                if (this.f36728b == ViewState.Loading) {
                    return true;
                }
                return false;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AutoCompleteState)) {
                    return false;
                }
                AutoCompleteState autoCompleteState = (AutoCompleteState) obj;
                if (kotlin.jvm.internal.o.d(this.f36727a, autoCompleteState.f36727a) && this.f36728b == autoCompleteState.f36728b) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f36727a.hashCode() * 31) + this.f36728b.hashCode();
            }

            public String toString() {
                List<SearchItemModel> list = this.f36727a;
                ViewState viewState = this.f36728b;
                return "AutoCompleteState(apiSuggestionsList=" + list + ", viewState=" + viewState + ")";
            }

            public AutoCompleteState(List<SearchItemModel> apiSuggestionsList, ViewState viewState) {
                kotlin.jvm.internal.o.i(apiSuggestionsList, "apiSuggestionsList");
                kotlin.jvm.internal.o.i(viewState, "viewState");
                this.f36727a = apiSuggestionsList;
                this.f36728b = viewState;
            }

            public /* synthetic */ AutoCompleteState(List list, ViewState viewState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? kotlin.collections.r.n() : list, (i11 & 2) != 0 ? ViewState.Idle : viewState);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SearchFocusViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class ViewMode {
            private static final /* synthetic */ a00.a $ENTRIES;
            private static final /* synthetic */ ViewMode[] $VALUES;
            public static final ViewMode OpenSearchMode = new ViewMode("OpenSearchMode", 0);
            public static final ViewMode TypingMode = new ViewMode("TypingMode", 1);

            private static final /* synthetic */ ViewMode[] $values() {
                return new ViewMode[]{OpenSearchMode, TypingMode};
            }

            static {
                ViewMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private ViewMode(String str, int i11) {
            }

            public static a00.a<ViewMode> getEntries() {
                return $ENTRIES;
            }

            public static ViewMode valueOf(String str) {
                return (ViewMode) Enum.valueOf(ViewMode.class, str);
            }

            public static ViewMode[] values() {
                return (ViewMode[]) $VALUES.clone();
            }
        }

        public SearchState() {
            this(null, null, null, null, null, null, false, null, null, null, null, 2047, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchState b(SearchState searchState, List list, List list2, TrendEntity trendEntity, String str, String str2, SearchSource searchSource, boolean z11, AutoCompleteState autoCompleteState, List list3, Integer num, SearchAnalyticsData.SearchSource searchSource2, int i11, Object obj) {
            List<SearchItemModel> list4;
            List<TrendEntity> list5;
            TrendEntity trendEntity2;
            String str3;
            String str4;
            SearchSource searchSource3;
            boolean z12;
            AutoCompleteState autoCompleteState2;
            List<CategoryEntity> list6;
            Integer num2;
            SearchAnalyticsData.SearchSource searchSource4;
            if ((i11 & 1) != 0) {
                list4 = searchState.f36716a;
            } else {
                list4 = list;
            }
            if ((i11 & 2) != 0) {
                list5 = searchState.f36717b;
            } else {
                list5 = list2;
            }
            if ((i11 & 4) != 0) {
                trendEntity2 = searchState.f36718c;
            } else {
                trendEntity2 = trendEntity;
            }
            if ((i11 & 8) != 0) {
                str3 = searchState.f36719d;
            } else {
                str3 = str;
            }
            if ((i11 & 16) != 0) {
                str4 = searchState.f36720e;
            } else {
                str4 = str2;
            }
            if ((i11 & 32) != 0) {
                searchSource3 = searchState.f36721f;
            } else {
                searchSource3 = searchSource;
            }
            if ((i11 & 64) != 0) {
                z12 = searchState.f36722g;
            } else {
                z12 = z11;
            }
            if ((i11 & 128) != 0) {
                autoCompleteState2 = searchState.f36723h;
            } else {
                autoCompleteState2 = autoCompleteState;
            }
            if ((i11 & 256) != 0) {
                list6 = searchState.f36724i;
            } else {
                list6 = list3;
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                num2 = searchState.f36725j;
            } else {
                num2 = num;
            }
            if ((i11 & 1024) != 0) {
                searchSource4 = searchState.f36726k;
            } else {
                searchSource4 = searchSource2;
            }
            return searchState.a(list4, list5, trendEntity2, str3, str4, searchSource3, z12, autoCompleteState2, list6, num2, searchSource4);
        }

        public final SearchState a(List<SearchItemModel> historyList, List<TrendEntity> trendsList, TrendEntity trendsSectionTitle, String searchQuery, String str, SearchSource searchSource, boolean z11, AutoCompleteState autoCompleteState, List<CategoryEntity> matchedCategories, Integer num, SearchAnalyticsData.SearchSource searchSource2) {
            kotlin.jvm.internal.o.i(historyList, "historyList");
            kotlin.jvm.internal.o.i(trendsList, "trendsList");
            kotlin.jvm.internal.o.i(trendsSectionTitle, "trendsSectionTitle");
            kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            kotlin.jvm.internal.o.i(autoCompleteState, "autoCompleteState");
            kotlin.jvm.internal.o.i(matchedCategories, "matchedCategories");
            return new SearchState(historyList, trendsList, trendsSectionTitle, searchQuery, str, searchSource, z11, autoCompleteState, matchedCategories, num, searchSource2);
        }

        public final SearchAnalyticsData.SearchSource c() {
            return this.f36726k;
        }

        public final Integer d() {
            return this.f36725j;
        }

        public final AutoCompleteState e() {
            return this.f36723h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchState)) {
                return false;
            }
            SearchState searchState = (SearchState) obj;
            if (kotlin.jvm.internal.o.d(this.f36716a, searchState.f36716a) && kotlin.jvm.internal.o.d(this.f36717b, searchState.f36717b) && kotlin.jvm.internal.o.d(this.f36718c, searchState.f36718c) && kotlin.jvm.internal.o.d(this.f36719d, searchState.f36719d) && kotlin.jvm.internal.o.d(this.f36720e, searchState.f36720e) && this.f36721f == searchState.f36721f && this.f36722g == searchState.f36722g && kotlin.jvm.internal.o.d(this.f36723h, searchState.f36723h) && kotlin.jvm.internal.o.d(this.f36724i, searchState.f36724i) && kotlin.jvm.internal.o.d(this.f36725j, searchState.f36725j) && this.f36726k == searchState.f36726k) {
                return true;
            }
            return false;
        }

        public final List<SearchItemModel> f() {
            return this.f36716a;
        }

        public final List<CategoryEntity> g() {
            return this.f36724i;
        }

        public final String h() {
            return this.f36719d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((((((this.f36716a.hashCode() * 31) + this.f36717b.hashCode()) * 31) + this.f36718c.hashCode()) * 31) + this.f36719d.hashCode()) * 31;
            String str = this.f36720e;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode4 = (((hashCode3 + hashCode) * 31) + this.f36721f.hashCode()) * 31;
            boolean z11 = this.f36722g;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int hashCode5 = (((((hashCode4 + i12) * 31) + this.f36723h.hashCode()) * 31) + this.f36724i.hashCode()) * 31;
            Integer num = this.f36725j;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i13 = (hashCode5 + hashCode2) * 31;
            SearchAnalyticsData.SearchSource searchSource = this.f36726k;
            if (searchSource != null) {
                i11 = searchSource.hashCode();
            }
            return i13 + i11;
        }

        public final List<TrendEntity> i() {
            return this.f36717b;
        }

        public final TrendEntity j() {
            return this.f36718c;
        }

        public final String k() {
            return this.f36720e;
        }

        public final boolean l() {
            return this.f36722g;
        }

        public final ViewMode m() {
            boolean z11;
            if (this.f36719d.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return ViewMode.OpenSearchMode;
            }
            return ViewMode.TypingMode;
        }

        public String toString() {
            List<SearchItemModel> list = this.f36716a;
            List<TrendEntity> list2 = this.f36717b;
            TrendEntity trendEntity = this.f36718c;
            String str = this.f36719d;
            String str2 = this.f36720e;
            SearchSource searchSource = this.f36721f;
            boolean z11 = this.f36722g;
            AutoCompleteState autoCompleteState = this.f36723h;
            List<CategoryEntity> list3 = this.f36724i;
            Integer num = this.f36725j;
            SearchAnalyticsData.SearchSource searchSource2 = this.f36726k;
            return "SearchState(historyList=" + list + ", trendsList=" + list2 + ", trendsSectionTitle=" + trendEntity + ", searchQuery=" + str + ", typedSearchQuery=" + str2 + ", searchSource=" + searchSource + ", viewFocusSearchBar=" + z11 + ", autoCompleteState=" + autoCompleteState + ", matchedCategories=" + list3 + ", apiSuggestionsListSize=" + num + ", analyticsSearchSource=" + searchSource2 + ")";
        }

        public SearchState(List<SearchItemModel> historyList, List<TrendEntity> trendsList, TrendEntity trendsSectionTitle, String searchQuery, String str, SearchSource searchSource, boolean z11, AutoCompleteState autoCompleteState, List<CategoryEntity> matchedCategories, Integer num, SearchAnalyticsData.SearchSource searchSource2) {
            kotlin.jvm.internal.o.i(historyList, "historyList");
            kotlin.jvm.internal.o.i(trendsList, "trendsList");
            kotlin.jvm.internal.o.i(trendsSectionTitle, "trendsSectionTitle");
            kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            kotlin.jvm.internal.o.i(autoCompleteState, "autoCompleteState");
            kotlin.jvm.internal.o.i(matchedCategories, "matchedCategories");
            this.f36716a = historyList;
            this.f36717b = trendsList;
            this.f36718c = trendsSectionTitle;
            this.f36719d = searchQuery;
            this.f36720e = str;
            this.f36721f = searchSource;
            this.f36722g = z11;
            this.f36723h = autoCompleteState;
            this.f36724i = matchedCategories;
            this.f36725j = num;
            this.f36726k = searchSource2;
        }

        public /* synthetic */ SearchState(List list, List list2, TrendEntity trendEntity, String str, String str2, SearchSource searchSource, boolean z11, AutoCompleteState autoCompleteState, List list3, Integer num, SearchAnalyticsData.SearchSource searchSource2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? kotlin.collections.r.n() : list, (i11 & 2) != 0 ? kotlin.collections.r.n() : list2, (i11 & 4) != 0 ? new TrendEntity(0, "", "", false, 9, null) : trendEntity, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i11 & 64) != 0 ? true : z11, (i11 & 128) != 0 ? new AutoCompleteState(null, null, 3, null) : autoCompleteState, (i11 & 256) != 0 ? kotlin.collections.r.n() : list3, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : num, (i11 & 1024) == 0 ? searchSource2 : null);
        }
    }

    /* compiled from: SearchFocusViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SearchFocusViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {

        /* compiled from: SearchFocusViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static /* synthetic */ SearchFocusViewModel a(b bVar, String str, boolean z11, Boolean bool, SearchSource searchSource, Integer num, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        str = "";
                    }
                    String str2 = str;
                    if ((i11 & 4) != 0) {
                        bool = Boolean.FALSE;
                    }
                    Boolean bool2 = bool;
                    if ((i11 & 8) != 0) {
                        searchSource = SearchSource.SEARCH_BAR;
                    }
                    SearchSource searchSource2 = searchSource;
                    if ((i11 & 16) != 0) {
                        num = -1;
                    }
                    return bVar.a(str2, z11, bool2, searchSource2, num);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
        }

        SearchFocusViewModel a(String str, boolean z11, Boolean bool, SearchSource searchSource, Integer num);
    }

    /* compiled from: SearchFocusViewModel.kt */
    /* loaded from: classes2.dex */
    public interface c {
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchFocusViewModel f36735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, SearchFocusViewModel searchFocusViewModel) {
            super(key);
            this.f36735a = searchFocusViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            List n11;
            SearchFocusViewModel searchFocusViewModel = this.f36735a;
            SearchState U0 = searchFocusViewModel.U0();
            n11 = kotlin.collections.r.n();
            searchFocusViewModel.z1(SearchState.b(U0, null, null, null, null, null, null, false, new SearchState.AutoCompleteState(n11, SearchState.AutoCompleteState.ViewState.Failure), null, null, null, 1919, null));
            String message = th2.getMessage();
            x10.a.b("Error: " + message, new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel(String str, boolean z11, Boolean bool, SearchSource searchSource, Integer num, SearchHistoryRepository searchHistoryRepository, RegionsRepository regionRepository, h0 trendingInterActor, AutoCompleteSearchInterActor autoCompleteSearchInterActor, MatchingCategoriesRepository matchingCategoriesRepository, BaseRepository baseRepository, TrendingClickInteractor trendingClickInteractor) {
        super(baseRepository);
        boolean z12;
        k0 e11;
        kotlin.jvm.internal.o.i(searchSource, "searchSource");
        kotlin.jvm.internal.o.i(searchHistoryRepository, "searchHistoryRepository");
        kotlin.jvm.internal.o.i(regionRepository, "regionRepository");
        kotlin.jvm.internal.o.i(trendingInterActor, "trendingInterActor");
        kotlin.jvm.internal.o.i(autoCompleteSearchInterActor, "autoCompleteSearchInterActor");
        kotlin.jvm.internal.o.i(matchingCategoriesRepository, "matchingCategoriesRepository");
        kotlin.jvm.internal.o.i(baseRepository, "baseRepository");
        kotlin.jvm.internal.o.i(trendingClickInteractor, "trendingClickInteractor");
        this.f36700k0 = str;
        this.f36701l0 = z11;
        this.f36702m0 = bool;
        this.f36703n0 = searchSource;
        this.f36704o0 = num;
        this.f36705p0 = searchHistoryRepository;
        this.f36706q0 = regionRepository;
        this.f36707r0 = trendingInterActor;
        this.f36708s0 = autoCompleteSearchInterActor;
        this.f36709t0 = matchingCategoriesRepository;
        this.f36710u0 = trendingClickInteractor;
        androidx.lifecycle.b0<String> b0Var = new androidx.lifecycle.b0<>(str);
        this.f36711v0 = b0Var;
        this.f36712w0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f36713x0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f36714y0 = new androidx.lifecycle.b0<>(Boolean.FALSE);
        this.f36715z0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.A0 = new OneShotEventHandler<>(null, 0, 3, null);
        boolean z13 = true;
        this.B0 = true;
        this.C0 = new OneShotEventHandler<>(null, 0, 3, null);
        String value = b0Var.getValue();
        if (value != null && value.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.D0 = new androidx.lifecycle.b0<>(Boolean.valueOf((z12 || !z11) ? false : z13));
        e11 = androidx.compose.runtime.c0.e(new SearchState(null, null, null, null, null, null, false, null, null, null, null, 2047, null), null, 2, null);
        this.E0 = e11;
        Channel<c> Channel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.F0 = Channel$default;
        this.G0 = FlowKt.receiveAsFlow(Channel$default);
        Channel<com.forsale.app.features.search.a> Channel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.H0 = Channel$default2;
        this.I0 = FlowKt.receiveAsFlow(Channel$default2);
        V0();
        W0();
        X0();
    }

    private final void K0(SearchItemModel searchItemModel, SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$addSearchHistory$1(searchItemModel, searchHistorySource, this, null), 3, null);
    }

    static /* synthetic */ void L0(SearchFocusViewModel searchFocusViewModel, SearchItemModel searchItemModel, SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            searchHistorySource = SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY;
        }
        searchFocusViewModel.K0(searchItemModel, searchHistorySource);
    }

    private final void M0() {
        AggregatedAllAnalyticsLoggerKt.z0(r(), U0().f());
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new SearchFocusViewModel$clearAllSearchHistory$1(this, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlinx.coroutines.Job] */
    private final void N0(String str, long j11, CoroutineScope coroutineScope, g00.l<? super String, wz.p> lVar) {
        ?? launch$default;
        List n11;
        if (!b1(str)) {
            SearchState U0 = U0();
            SearchState.AutoCompleteState autoCompleteState = new SearchState.AutoCompleteState(null, null, 3, null);
            n11 = kotlin.collections.r.n();
            z1(SearchState.b(U0, null, null, null, null, null, null, false, autoCompleteState, n11, null, null, 1663, null));
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchFocusViewModel$debounce$1(ref$ObjectRef, j11, lVar, str, null), 3, null);
        ref$ObjectRef.f61778a = launch$default;
    }

    static /* synthetic */ void O0(SearchFocusViewModel searchFocusViewModel, String str, long j11, CoroutineScope coroutineScope, g00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 100;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            coroutineScope = r0.a(searchFocusViewModel);
        }
        searchFocusViewModel.N0(str, j12, coroutineScope, lVar);
    }

    private final void P0(SearchItemModel searchItemModel) {
        AggregatedAllAnalyticsLoggerKt.A0(r(), searchItemModel.i(), U0().f());
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SearchFocusViewModel$deleteSingleSearchHistory$1(this, searchItemModel, null), 3, null);
    }

    private final void V0() {
        n1(v.f37023a);
    }

    private final void W0() {
        boolean z11;
        if (kotlin.jvm.internal.o.d(this.f36702m0, Boolean.TRUE)) {
            String str = this.f36700k0;
            if (str != null && str.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                SearchState U0 = U0();
                String str2 = this.f36700k0;
                if (str2 == null) {
                    str2 = "";
                }
                z1(SearchState.b(U0, null, null, null, str2, null, null, false, null, null, null, null, 2039, null));
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$handleSearchResults$1(this, null), 3, null);
            }
        }
    }

    private final void X0() {
        SearchState U0 = U0();
        String str = this.f36700k0;
        if (str == null) {
            str = "";
        }
        z1(SearchState.b(U0, null, null, null, str, null, null, false, null, null, null, null, 2039, null));
    }

    private final boolean b1(String str) {
        boolean v11;
        v11 = kotlin.text.s.v(str);
        if (v11 || str.length() <= 2) {
            return false;
        }
        return true;
    }

    private final void c1(String str) {
        z1(SearchState.b(U0(), null, null, null, null, null, null, false, new SearchState.AutoCompleteState(null, SearchState.AutoCompleteState.ViewState.Loading, 1, null), null, null, null, 1919, null));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO().plus(new d(CoroutineExceptionHandler.Key, this)), null, new SearchFocusViewModel$loadApiSuggestions$2(this, str, null), 2, null);
    }

    private final void d1(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$loadMatchedCategories$1(this, str, null), 3, null);
    }

    private final void e1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new SearchFocusViewModel$loadSearchHistory$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<CategoryEntity>> f1() {
        return this.f36705p0.getAllMatchingCategoriesHistoryWithLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<SearchItemModel>> g1() {
        return this.f36705p0.getAllSearchHistoryWithLimit();
    }

    private final void h1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$loadTrendsSection$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(java.lang.String r17, com.forsale.app.utils.analytics.SearchSource r18, com.forsale.app.features.search.SearchAnalyticsData r19, com.forsale.app.datalayer.database.CategoryEntity r20, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r21, com.forsale.app.features.categories.listings.ListingsIntention r22, zz.a<? super wz.p> r23) {
        /*
            r16 = this;
            r0 = r16
            r11 = r20
            r1 = r23
            boolean r2 = r1 instanceof com.forsale.app.features.search.SearchFocusViewModel$navigateToCategory$1
            if (r2 == 0) goto L19
            r2 = r1
            com.forsale.app.features.search.SearchFocusViewModel$navigateToCategory$1 r2 = (com.forsale.app.features.search.SearchFocusViewModel$navigateToCategory$1) r2
            int r3 = r2.f36770d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f36770d = r3
            goto L1e
        L19:
            com.forsale.app.features.search.SearchFocusViewModel$navigateToCategory$1 r2 = new com.forsale.app.features.search.SearchFocusViewModel$navigateToCategory$1
            r2.<init>(r0, r1)
        L1e:
            r12 = r2
            java.lang.Object r1 = r12.f36768b
            java.lang.Object r13 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r12.f36770d
            r14 = 1
            if (r2 == 0) goto L3c
            if (r2 != r14) goto L34
            java.lang.Object r2 = r12.f36767a
            com.forsale.app.features.search.a r2 = (com.forsale.app.features.search.a) r2
            kotlin.f.b(r1)
            goto L72
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            kotlin.f.b(r1)
            com.forsale.app.features.search.a$b r15 = new com.forsale.app.features.search.a$b
            r8 = 0
            r9 = 64
            r10 = 0
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 == 0) goto L65
            boolean r1 = r20.isListingCategory()
            if (r1 == 0) goto L5e
            goto L65
        L5e:
            com.forsale.app.features.search.a$a r15 = new com.forsale.app.features.search.a$a
            r1 = 2
            r2 = 0
            r15.<init>(r11, r2, r1, r2)
        L65:
            kotlinx.coroutines.channels.Channel<com.forsale.app.features.search.a> r1 = r0.H0
            r12.f36767a = r15
            r12.f36770d = r14
            java.lang.Object r1 = r1.send(r15, r12)
            if (r1 != r13) goto L72
            return r13
        L72:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.search.SearchFocusViewModel.i1(java.lang.String, com.forsale.app.utils.analytics.SearchSource, com.forsale.app.features.search.SearchAnalyticsData, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, com.forsale.app.features.categories.listings.ListingsIntention, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object j1(SearchFocusViewModel searchFocusViewModel, String str, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention, zz.a aVar, int i11, Object obj) {
        ListingsIntention listingsIntention2;
        if ((i11 & 32) != 0) {
            listingsIntention2 = ListingsIntention.SEARCH;
        } else {
            listingsIntention2 = listingsIntention;
        }
        return searchFocusViewModel.i1(str, searchSource, searchAnalyticsData, categoryEntity, filtrationData, listingsIntention2, aVar);
    }

    private final void k1(SearchItemModel searchItemModel) {
        List n11;
        List n12;
        L0(this, searchItemModel, null, 2, null);
        SearchState U0 = U0();
        String i11 = searchItemModel.i();
        n11 = kotlin.collections.r.n();
        SearchState.AutoCompleteState autoCompleteState = new SearchState.AutoCompleteState(n11, null, 2, null);
        n12 = kotlin.collections.r.n();
        z1(SearchState.b(U0, null, null, null, i11, null, null, false, autoCompleteState, n12, null, null, 1655, null));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onApiSuggestionClicked$1(searchItemModel, this, null), 3, null);
    }

    private final void l1() {
        n1(u.f37022a);
        AggregatedAllAnalyticsLoggerKt.C0(r(), U0().f());
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onCancelClicked$1(this, null), 3, null);
    }

    private final void m1() {
        AggregatedAllAnalyticsLoggerKt.D0(r(), U0().f());
    }

    private final void o1(SearchItemModel searchItemModel) {
        L0(this, searchItemModel, null, 2, null);
        z1(SearchState.b(U0(), null, null, null, searchItemModel.i(), null, null, false, null, null, null, null, 2039, null));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onHistoryItemClicked$1(searchItemModel, this, null), 3, null);
        AggregatedAllAnalyticsLoggerKt.B0(r(), searchItemModel.i());
    }

    private final void p1() {
        z1(SearchState.b(U0(), null, null, null, null, null, null, false, null, null, null, null, 1983, null));
    }

    private final void q1() {
        z1(SearchState.b(U0(), null, null, null, null, null, null, true, null, null, null, null, 1983, null));
        if (b1(U0().h())) {
            n1(new i(U0().h()));
            n1(new n(U0().h()));
        }
    }

    private final void r1(String str, CategoryEntity categoryEntity, SearchAnalyticsData.SearchSource searchSource) {
        List n11;
        SearchState U0 = U0();
        SearchState.AutoCompleteState autoCompleteState = new SearchState.AutoCompleteState(null, null, 3, null);
        n11 = kotlin.collections.r.n();
        z1(SearchState.b(U0, null, null, null, str, null, null, false, autoCompleteState, n11, null, null, 1655, null));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onMatchingCategoriesClicked$1(this, categoryEntity, searchSource, null), 3, null);
    }

    private final void s1(String str) {
        boolean v11;
        String str2;
        SearchState U0 = U0();
        v11 = kotlin.text.s.v(str);
        if (v11) {
            str2 = null;
        } else {
            str2 = str;
        }
        z1(SearchState.b(U0, null, null, null, str, str2, null, false, new SearchState.AutoCompleteState(null, null, 3, null), null, null, null, 1895, null));
        O0(this, U0().h(), 0L, null, new g00.l<String, wz.p>() { // from class: com.forsale.app.features.search.SearchFocusViewModel$onQueryChanged$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String searchableQuery) {
                kotlin.jvm.internal.o.i(searchableQuery, "searchableQuery");
                SearchFocusViewModel.this.n1(new i(searchableQuery));
                SearchFocusViewModel.this.n1(new n(searchableQuery));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(String str3) {
                b(str3);
                return wz.p.f75480a;
            }
        }, 3, null);
    }

    private final void t1() {
        AggregatedAllAnalyticsLoggerKt.y0(r(), SearchLocation.SEARCH_FOCUSED);
    }

    private final void u1() {
        boolean v11;
        v11 = kotlin.text.s.v(U0().h());
        if (v11) {
            return;
        }
        SearchItemModel searchItemModel = new SearchItemModel(0, U0().h(), null, null, null, null, 0, 125, null);
        L0(this, searchItemModel, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onSearchClicked$1$1(this, searchItemModel, null), 3, null);
    }

    private final void v1(TrendEntity trendEntity) {
        String localized = trendEntity.getLocalized();
        SearchItemModel searchItemModel = new SearchItemModel(0, localized, null, null, null, null, 0, 125, null);
        z1(SearchState.b(U0(), null, null, null, localized, null, null, false, null, null, null, null, 2039, null));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SearchFocusViewModel$onTrendsItemClicked$1(this, searchItemModel, trendEntity, localized, null), 3, null);
    }

    private final void y1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO().plus(new e(CoroutineExceptionHandler.Key)), null, new SearchFocusViewModel$refreshTrends$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(SearchState searchState) {
        this.E0.setValue(searchState);
    }

    public final androidx.lifecycle.b0<Boolean> Q0() {
        return this.D0;
    }

    public final Flow<com.forsale.app.features.search.a> R0() {
        return this.I0;
    }

    public final Flow<c> S0() {
        return this.G0;
    }

    public final androidx.lifecycle.b0<String> T0() {
        return this.f36711v0;
    }

    public final SearchState U0() {
        return (SearchState) this.E0.getValue();
    }

    public final boolean Y0() {
        return this.f36701l0;
    }

    public final androidx.lifecycle.b0<Boolean> Z0() {
        return this.f36714y0;
    }

    public final void n1(y event) {
        kotlin.jvm.internal.o.i(event, "event");
        if (kotlin.jvm.internal.o.d(event, v.f37023a)) {
            q1();
        } else if (kotlin.jvm.internal.o.d(event, u.f37022a)) {
            p1();
        } else if (kotlin.jvm.internal.o.d(event, m.f37012a)) {
            e1();
        } else if (kotlin.jvm.internal.o.d(event, k.f37010a)) {
            M0();
        } else if (event instanceof l) {
            o1(((l) event).a());
        } else if (event instanceof j) {
            P0(((j) event).a());
        } else if (kotlin.jvm.internal.o.d(event, p.f37017a)) {
            l1();
        } else if (kotlin.jvm.internal.o.d(event, q.f37018a)) {
            m1();
        } else if (event instanceof t) {
            u1();
        } else if (event instanceof r) {
            s1(((r) event).a());
        } else if (kotlin.jvm.internal.o.d(event, s.f37020a)) {
            t1();
        } else if (kotlin.jvm.internal.o.d(event, w.f37024a)) {
            h1();
        } else if (event instanceof x) {
            v1(((x) event).a());
        } else if (event instanceof i) {
            c1(((i) event).a());
        } else if (event instanceof h) {
            k1(((h) event).a());
        } else if (event instanceof n) {
            d1(((n) event).a());
        } else if (event instanceof o) {
            o oVar = (o) event;
            r1(oVar.b(), oVar.a(), oVar.c());
        }
    }

    public final void w1(TrendEntity trendItem) {
        kotlin.jvm.internal.o.i(trendItem, "trendItem");
        n1(new x(trendItem));
    }

    public final void x1() {
        V0();
        y1();
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public e(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
