package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.r0;
import androidx.paging.PagedList;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.home.ContinueBrowsingRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.CategorySortingStateHandler;
import com.forsale.app.features.categories.listings.ListingDecoratorTypes;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.categories.listings.dataSource.ListingsDataSourceFactory;
import com.forsale.app.features.categories.listings.filtration.district.DistrictsMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersFactory;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import com.forsale.app.features.search.MatchingCategoriesRepository;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.h0;
import com.forsale.app.interactors.TrendingClickInteractor;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.ListingsPageMode;
import com.forsale.app.utils.analytics.PromotedPostSource;
import com.forsale.app.utils.analytics.SearchLocation;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import g00.l;
import j0.k0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
import ya.a;
/* compiled from: CategoryListingsViewModel.kt */
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel extends BaseStatefulViewModel {
    private final nc.a A0;
    private final wz.h A1;
    private final h0 B0;
    private final MutableStateFlow<b> B1;
    private final TrendingClickInteractor C0;
    private final Flow<b> C1;
    private final ContinueBrowsingRepository D0;
    private MutableStateFlow<Boolean> D1;
    private final com.forsale.app.features.categories.listings.category.a E0;
    private Pair<? extends com.forsale.app.utils.analytics.listingfiltration.a, Integer> E1;
    private final wz.h F0;
    private ListingsAnalytics$FiltersPlace F1;
    private final CategoryEntity G0;
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> G1;
    private final DistrictEntity H0;
    private final SharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> H1;
    private final CategorySortingStateHandler I0;
    private final wz.h I1;
    private final b0<RegionEntity> J0;
    private final Deferred<FiltersMediator> J1;
    private final b0<MasterDataMiscModel> K0;
    private final Deferred<DistrictsMediator> K1;
    private final b0<ListingsResponse.UISettings> L0;
    private final wz.h L1;
    private final wz.h M0;
    private final FlowCollector<GetListingsBody.FiltrationData> M1;
    private final boolean N0;
    private final wz.h N1;
    private final b0<Integer> O0;
    private final FlowCollector<DistrictEntity> O1;
    private final b0<Integer> P0;
    private final c0<TranslationRepository.Translation> P1;
    private final LiveData<Integer> Q0;
    private final MutableSharedFlow<a> Q1;
    private final OneShotEventHandler<p> R0;
    private final SharedFlow<a> R1;
    private final LiveData<Integer> S0;
    private final MutableStateFlow<ya.a> S1;
    private final b0<Integer> T0;
    private final MutableStateFlow<ya.a> T1;
    private final wz.h U0;
    private final MutableStateFlow<Boolean> U1;
    private final MutableStateFlow<ListingsIntention> V0;
    private final Flow<Boolean> V1;
    private final wz.h W0;
    private final StateFlow<Boolean> W1;
    private final wz.h X0;
    private final MutableStateFlow<Boolean> X1;
    private final wz.h Y0;
    private final StateFlow<Boolean> Y1;
    private final StateFlow<SearchAnalyticsData> Z0;
    private final StateFlow<Object> Z1;

    /* renamed from: a1  reason: collision with root package name */
    private final StateFlow<ListingDetailsSearchAnalyticsData> f28351a1;

    /* renamed from: a2  reason: collision with root package name */
    private final MutableStateFlow<Integer> f28352a2;

    /* renamed from: b1  reason: collision with root package name */
    private final StateFlow<ListingsPageMode> f28353b1;

    /* renamed from: b2  reason: collision with root package name */
    private final Flow<Boolean> f28354b2;

    /* renamed from: c1  reason: collision with root package name */
    private final MutableStateFlow<String> f28355c1;

    /* renamed from: c2  reason: collision with root package name */
    private final MutableStateFlow<Pair<String, List<CategoryEntity>>> f28356c2;

    /* renamed from: d1  reason: collision with root package name */
    private final StateFlow<String> f28357d1;

    /* renamed from: d2  reason: collision with root package name */
    private final StateFlow<Pair<String, List<CategoryEntity>>> f28358d2;

    /* renamed from: e1  reason: collision with root package name */
    private final MutableStateFlow<List<SortingStates>> f28359e1;

    /* renamed from: e2  reason: collision with root package name */
    private final k0 f28360e2;

    /* renamed from: f1  reason: collision with root package name */
    private final StateFlow<List<SortingStates>> f28361f1;

    /* renamed from: g1  reason: collision with root package name */
    private final StateFlow<Boolean> f28362g1;

    /* renamed from: h1  reason: collision with root package name */
    private final MutableStateFlow<Integer> f28363h1;

    /* renamed from: i1  reason: collision with root package name */
    private final Flow<Boolean> f28364i1;

    /* renamed from: j1  reason: collision with root package name */
    private final AtomicBoolean f28365j1;

    /* renamed from: k1  reason: collision with root package name */
    private final AtomicBoolean f28366k1;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingsRepository f28367l0;

    /* renamed from: l1  reason: collision with root package name */
    private final MutableSharedFlow<g00.a<p>> f28368l1;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f28369m0;

    /* renamed from: m1  reason: collision with root package name */
    private final SharedFlow<g00.a<p>> f28370m1;

    /* renamed from: n0  reason: collision with root package name */
    private final MasterDataRepository f28371n0;

    /* renamed from: n1  reason: collision with root package name */
    private final MutableStateFlow<PromotedPostItemViewModel.PromotedPostState> f28372n1;

    /* renamed from: o0  reason: collision with root package name */
    private final GAMRepository f28373o0;

    /* renamed from: o1  reason: collision with root package name */
    private final wz.h f28374o1;

    /* renamed from: p0  reason: collision with root package name */
    private final fj.b f28375p0;

    /* renamed from: p1  reason: collision with root package name */
    private final AtomicBoolean f28376p1;

    /* renamed from: q0  reason: collision with root package name */
    private final DistrictsRepository f28377q0;

    /* renamed from: q1  reason: collision with root package name */
    private final Flow<Boolean> f28378q1;

    /* renamed from: r0  reason: collision with root package name */
    private final ExtraAttributeRawRepository f28379r0;

    /* renamed from: r1  reason: collision with root package name */
    private final MutableSharedFlow<com.forsale.app.features.search.a> f28380r1;

    /* renamed from: s0  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f28381s0;

    /* renamed from: s1  reason: collision with root package name */
    private final SharedFlow<com.forsale.app.features.search.a> f28382s1;

    /* renamed from: t0  reason: collision with root package name */
    private final ListingsService f28383t0;

    /* renamed from: t1  reason: collision with root package name */
    private final MutableStateFlow<c> f28384t1;

    /* renamed from: u0  reason: collision with root package name */
    private final FiltersRepository f28385u0;

    /* renamed from: u1  reason: collision with root package name */
    private final StateFlow<c> f28386u1;

    /* renamed from: v0  reason: collision with root package name */
    private final PreSelectedFiltersFactory f28387v0;

    /* renamed from: v1  reason: collision with root package name */
    private final StateFlow<Boolean> f28388v1;

    /* renamed from: w0  reason: collision with root package name */
    private final AmplitudeLogger f28389w0;

    /* renamed from: w1  reason: collision with root package name */
    private final SharedFlow<d> f28390w1;

    /* renamed from: x0  reason: collision with root package name */
    private final BaseRepository f28391x0;

    /* renamed from: x1  reason: collision with root package name */
    private final AtomicBoolean f28392x1;

    /* renamed from: y0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f28393y0;

    /* renamed from: y1  reason: collision with root package name */
    private final wz.h f28394y1;

    /* renamed from: z0  reason: collision with root package name */
    private final MatchingCategoriesRepository f28395z0;

    /* renamed from: z1  reason: collision with root package name */
    private final wz.h f28396z1;

    /* compiled from: CategoryListingsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$3", f = "CategoryListingsViewModel.kt", l = {565, 567, 569}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass3 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28455a;

        AnonymousClass3(zz.a<? super AnonymousClass3> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass3(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r5.f28455a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.f.b(r6)
                goto L6b
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.f.b(r6)
                goto L51
            L21:
                kotlin.f.b(r6)
                goto L37
            L25:
                kotlin.f.b(r6)
                com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                com.forsale.app.datalayer.repositories.RegionsRepository r6 = r6.I()
                r5.f28455a = r4
                java.lang.Object r6 = r6.getCurrentRegion(r5)
                if (r6 != r0) goto L37
                return r0
            L37:
                com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.p1(r1)
                com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
                r1.postValue(r6)
                com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                com.forsale.app.datalayer.repositories.MasterDataRepository r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.e1(r6)
                r5.f28455a = r3
                java.lang.Object r6 = r6.getMasterDataMiscModel(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.g1(r1)
                com.forsale.app.datalayer.database.MasterDataMiscModel r6 = (com.forsale.app.datalayer.database.MasterDataMiscModel) r6
                r1.postValue(r6)
                com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                com.forsale.app.datalayer.database.CategoryEntity r1 = r6.z2()
                r5.f28455a = r2
                java.lang.Object r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.z0(r6, r1, r5)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                wz.p r6 = wz.p.f75480a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass3) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: CategoryListingsViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0307a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final AllFiltersPayload f28458a;

            public C0307a(AllFiltersPayload allFiltersPayload) {
                o.i(allFiltersPayload, "allFiltersPayload");
                this.f28458a = allFiltersPayload;
            }

            public final AllFiltersPayload a() {
                return this.f28458a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0307a) && o.d(this.f28458a, ((C0307a) obj).f28458a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f28458a.hashCode();
            }

            public String toString() {
                AllFiltersPayload allFiltersPayload = this.f28458a;
                return "OpenAllFiltersEvent(allFiltersPayload=" + allFiltersPayload + ")";
            }
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28460a = new a();

            private a() {
            }
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface c {

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public interface a extends c {

            /* compiled from: CategoryListingsViewModel.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0308a implements a {

                /* renamed from: a  reason: collision with root package name */
                public static final C0308a f28461a = new C0308a();

                private C0308a() {
                }
            }

            /* compiled from: CategoryListingsViewModel.kt */
            /* loaded from: classes2.dex */
            public static final class b implements a {

                /* renamed from: a  reason: collision with root package name */
                private final boolean f28462a;

                public b(boolean z11) {
                    this.f28462a = z11;
                }

                public final boolean a() {
                    return this.f28462a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof b) && this.f28462a == ((b) obj).f28462a) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    boolean z11 = this.f28462a;
                    if (z11) {
                        return 1;
                    }
                    return z11 ? 1 : 0;
                }

                public String toString() {
                    boolean z11 = this.f28462a;
                    return "PaginationError(isConnectivityError=" + z11 + ")";
                }
            }

            /* compiled from: CategoryListingsViewModel.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0309c implements a {

                /* renamed from: a  reason: collision with root package name */
                private final boolean f28463a;

                public C0309c(boolean z11) {
                    this.f28463a = z11;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C0309c) && this.f28463a == ((C0309c) obj).f28463a) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    boolean z11 = this.f28463a;
                    if (z11) {
                        return 1;
                    }
                    return z11 ? 1 : 0;
                }

                public String toString() {
                    boolean z11 = this.f28463a;
                    return "Success(isFirstPage=" + z11 + ")";
                }
            }
        }

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f28464a;

            public b(boolean z11) {
                this.f28464a = z11;
            }

            public final boolean a() {
                return this.f28464a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f28464a == ((b) obj).f28464a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f28464a;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f28464a;
                return "Empty(withFilters=" + z11 + ")";
            }
        }

        /* compiled from: CategoryListingsViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0310c implements c {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f28465a;

            public C0310c(boolean z11) {
                this.f28465a = z11;
            }

            public final boolean a() {
                return this.f28465a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0310c) && this.f28465a == ((C0310c) obj).f28465a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f28465a;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f28465a;
                return "Error(isConnectivityError=" + z11 + ")";
            }
        }

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class d implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f28466a = new d();

            private d() {
            }
        }

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class e implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final e f28467a = new e();

            private e() {
            }
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface d {

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28468a = new a();

            private a() {
            }
        }

        /* compiled from: CategoryListingsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements d {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f28469a;

            public b(boolean z11) {
                this.f28469a = z11;
            }

            public final boolean a() {
                return this.f28469a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f28469a == ((b) obj).f28469a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z11 = this.f28469a;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                boolean z11 = this.f28469a;
                return "ShowPaginationError(isConnectivityError=" + z11 + ")";
            }
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28472a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_DISTRICT_FILTRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_FULL_FILTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28472a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public f(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            dj.i.f54287a.invoke().f(th2);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public g(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            dj.i.f54287a.invoke().f(th2);
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    static final class h implements FlowCollector, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ g00.p f28506a;

        h(g00.p function) {
            o.i(function, "function");
            this.f28506a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f28506a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ Object emit(Object obj, zz.a aVar) {
            return this.f28506a.invoke(obj, aVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof FlowCollector) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CategoryListingsViewModel f28507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CoroutineExceptionHandler.Key key, CategoryListingsViewModel categoryListingsViewModel) {
            super(key);
            this.f28507a = categoryListingsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f28507a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f28507a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    static final class j implements c0<TranslationRepository.Translation> {
        j() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(TranslationRepository.Translation it2) {
            o.i(it2, "it");
            CategoryListingsViewModel.y3(CategoryListingsViewModel.this, null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel(ListingsRepository listingsRepository, ApplicationResourcesRepository arr, MasterDataRepository masterDataRepository, GAMRepository gamRepository, fj.b gamUtils, DistrictsRepository districtsRepository, ExtraAttributeRawRepository extraAttributeRawRepository, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingsService listingsService, FiltersRepository filtersRepository, PreSelectedFiltersFactory preSelectedFiltersFactory, AmplitudeLogger amplitudeLogger, androidx.lifecycle.k0 savedStateHandle, BaseRepository baseRepository, ListingsFiltrationAnalytics listingsFiltrationAnalytics, MatchingCategoriesRepository matchingCategoriesRepository, nc.a getSwipeableListInteractor, h0 trendingInterActor, TrendingClickInteractor trendingClickInteractor, ContinueBrowsingRepository continueBrowsingRepository) {
        super(baseRepository);
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h a15;
        wz.h a16;
        wz.h a17;
        SharedFlow<d> shareIn$default;
        wz.h a18;
        wz.h a19;
        wz.h a21;
        wz.h a22;
        Deferred<FiltersMediator> async$default;
        Deferred<DistrictsMediator> async$default2;
        wz.h a23;
        wz.h a24;
        List n11;
        List n12;
        k0 e11;
        o.i(listingsRepository, "listingsRepository");
        o.i(arr, "arr");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(gamRepository, "gamRepository");
        o.i(gamUtils, "gamUtils");
        o.i(districtsRepository, "districtsRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        o.i(aggregatedAllAnalyticsLogger, "aggregatedAllAnalyticsLogger");
        o.i(listingsService, "listingsService");
        o.i(filtersRepository, "filtersRepository");
        o.i(preSelectedFiltersFactory, "preSelectedFiltersFactory");
        o.i(amplitudeLogger, "amplitudeLogger");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        o.i(listingsFiltrationAnalytics, "listingsFiltrationAnalytics");
        o.i(matchingCategoriesRepository, "matchingCategoriesRepository");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        o.i(trendingInterActor, "trendingInterActor");
        o.i(trendingClickInteractor, "trendingClickInteractor");
        o.i(continueBrowsingRepository, "continueBrowsingRepository");
        this.f28367l0 = listingsRepository;
        this.f28369m0 = arr;
        this.f28371n0 = masterDataRepository;
        this.f28373o0 = gamRepository;
        this.f28375p0 = gamUtils;
        this.f28377q0 = districtsRepository;
        this.f28379r0 = extraAttributeRawRepository;
        this.f28381s0 = aggregatedAllAnalyticsLogger;
        this.f28383t0 = listingsService;
        this.f28385u0 = filtersRepository;
        this.f28387v0 = preSelectedFiltersFactory;
        this.f28389w0 = amplitudeLogger;
        this.f28391x0 = baseRepository;
        this.f28393y0 = listingsFiltrationAnalytics;
        this.f28395z0 = matchingCategoriesRepository;
        this.A0 = getSwipeableListInteractor;
        this.B0 = trendingInterActor;
        this.C0 = trendingClickInteractor;
        this.D0 = continueBrowsingRepository;
        com.forsale.app.features.categories.listings.category.a b11 = com.forsale.app.features.categories.listings.category.a.f28659k.b(savedStateHandle);
        this.E0 = b11;
        a11 = kotlin.d.a(new g00.a<GetListingsBody.FiltrationData>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$preDefinedFilters$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final GetListingsBody.FiltrationData invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.e();
            }
        });
        this.F0 = a11;
        CategoryEntity d11 = b11.d();
        this.G0 = d11;
        this.I0 = new CategorySortingStateHandler(r0.a(this));
        this.J0 = new b0<>();
        this.K0 = new b0<>();
        b0<ListingsResponse.UISettings> b0Var = new b0<>();
        this.L0 = b0Var;
        a12 = kotlin.d.a(new g00.a<CategoryListingsAnalyticSource>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$analyticSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoryListingsAnalyticSource invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.a();
            }
        });
        this.M0 = a12;
        this.N0 = b11.b();
        this.O0 = new b0<>();
        b0<Integer> b0Var2 = new b0<>(0);
        this.P0 = b0Var2;
        this.Q0 = b0Var2;
        this.R0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.S0 = Transformations.b(Transformations.b(b0Var, new l<ListingsResponse.UISettings, ListingsResponse.UISettings.ListingsSettings>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$spinCount$1
            @Override // g00.l
            /* renamed from: b */
            public final ListingsResponse.UISettings.ListingsSettings invoke(ListingsResponse.UISettings uISettings) {
                return uISettings.getListingsSettings();
            }
        }), new l<ListingsResponse.UISettings.ListingsSettings, Integer>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$spinCount$2
            @Override // g00.l
            /* renamed from: b */
            public final Integer invoke(ListingsResponse.UISettings.ListingsSettings it2) {
                o.i(it2, "it");
                return Integer.valueOf(it2.mapCardDisplayStyleToSpinCount(ListingDecoratorTypes.CATEGORY_LISTINGS));
            }
        });
        this.T0 = new b0<>();
        a13 = kotlin.d.a(new g00.a<ListingsIntention>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$_initialListingsIntention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingsIntention invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.c();
            }
        });
        this.U0 = a13;
        final MutableStateFlow<ListingsIntention> MutableStateFlow = StateFlowKt.MutableStateFlow(S2());
        this.V0 = MutableStateFlow;
        a14 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$searchKeyword$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.g();
            }
        });
        this.W0 = a14;
        a15 = kotlin.d.a(new g00.a<SearchSource>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$searchSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SearchSource invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.h();
            }
        });
        this.X0 = a15;
        a16 = kotlin.d.a(new g00.a<SearchAnalyticsData>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$initialSearchAnalyticsData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SearchAnalyticsData invoke() {
                a aVar;
                aVar = CategoryListingsViewModel.this.E0;
                return aVar.f();
            }
        });
        this.Y0 = a16;
        Flow<SearchAnalyticsData> flow = new Flow<SearchAnalyticsData>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28404a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CategoryListingsViewModel f28405b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28406a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28407b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28406a = obj;
                        this.f28407b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CategoryListingsViewModel categoryListingsViewModel) {
                    this.f28404a = flowCollector;
                    this.f28405b = categoryListingsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.a r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28407b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28407b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f28406a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28407b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f28404a
                        com.forsale.app.features.categories.listings.ListingsIntention r6 = (com.forsale.app.features.categories.listings.ListingsIntention) r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r2 = r5.f28405b
                        com.forsale.app.features.search.SearchAnalyticsData r2 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.W0(r2)
                        if (r2 == 0) goto L47
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r4 = r5.f28405b
                        com.forsale.app.features.search.SearchAnalyticsData r6 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.O1(r4, r2, r6)
                        goto L48
                    L47:
                        r6 = 0
                    L48:
                        r0.f28407b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L51
                        return r1
                    L51:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SearchAnalyticsData> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        SharingStarted.Companion companion = SharingStarted.Companion;
        final StateFlow<SearchAnalyticsData> stateIn = FlowKt.stateIn(flow, this, companion.getEagerly(), j2());
        this.Z0 = stateIn;
        this.f28351a1 = FlowKt.stateIn(new Flow<ListingDetailsSearchAnalyticsData>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28411a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CategoryListingsViewModel f28412b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28413a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28414b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28413a = obj;
                        this.f28414b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CategoryListingsViewModel categoryListingsViewModel) {
                    this.f28411a = flowCollector;
                    this.f28412b = categoryListingsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28414b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28414b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28413a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28414b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28411a
                        com.forsale.app.features.search.SearchAnalyticsData r5 = (com.forsale.app.features.search.SearchAnalyticsData) r5
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r2 = r4.f28412b
                        com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r5 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.Q1(r2, r5)
                        r0.f28414b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ListingDetailsSearchAnalyticsData> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, this, companion.getEagerly(), P3(j2()));
        this.f28353b1 = FlowKt.stateIn(new Flow<ListingsPageMode>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28418a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CategoryListingsViewModel f28419b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28420a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28421b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28420a = obj;
                        this.f28421b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CategoryListingsViewModel categoryListingsViewModel) {
                    this.f28418a = flowCollector;
                    this.f28419b = categoryListingsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28421b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28421b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28420a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28421b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28418a
                        com.forsale.app.features.categories.listings.ListingsIntention r5 = (com.forsale.app.features.categories.listings.ListingsIntention) r5
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r2 = r4.f28419b
                        com.forsale.app.utils.analytics.ListingsPageMode r5 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.Y0(r2, r5)
                        r0.f28421b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ListingsPageMode> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, this, companion.getEagerly(), o2(S2()));
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f28355c1 = MutableStateFlow2;
        this.f28357d1 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<SortingStates>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f28359e1 = MutableStateFlow3;
        this.f28361f1 = FlowKt.asStateFlow(MutableStateFlow3);
        StateFlow<Boolean> stateIn2 = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28424a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28425a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28426b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28425a = obj;
                        this.f28426b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28424a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28426b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28426b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28425a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28426b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28424a
                        com.forsale.app.features.categories.listings.ListingsIntention r5 = (com.forsale.app.features.categories.listings.ListingsIntention) r5
                        com.forsale.app.features.categories.listings.ListingsIntention r2 = com.forsale.app.features.categories.listings.ListingsIntention.SEARCH
                        if (r5 != r2) goto L3e
                        r5 = r3
                        goto L3f
                    L3e:
                        r5 = 0
                    L3f:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f28426b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, this, companion.getEagerly(), Boolean.valueOf(MutableStateFlow.getValue() == ListingsIntention.SEARCH));
        this.f28362g1 = stateIn2;
        final MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.f28363h1 = MutableStateFlow4;
        Flow<Boolean> distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28429a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28430a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28431b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28430a = obj;
                        this.f28431b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28429a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28431b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28431b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28430a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28431b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28429a
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        r2 = 3
                        if (r5 <= r2) goto L41
                        r5 = r3
                        goto L42
                    L41:
                        r5 = 0
                    L42:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f28431b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        });
        this.f28364i1 = distinctUntilChanged;
        this.f28365j1 = new AtomicBoolean(false);
        this.f28366k1 = new AtomicBoolean(false);
        MutableSharedFlow<g00.a<p>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f28368l1 = MutableSharedFlow$default;
        this.f28370m1 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<PromotedPostItemViewModel.PromotedPostState> MutableStateFlow5 = StateFlowKt.MutableStateFlow(PromotedPostItemViewModel.PromotedPostState.NOT_SHOWN);
        this.f28372n1 = MutableStateFlow5;
        a17 = kotlin.d.a(new g00.a<PromotedPostItemViewModel>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$promotedPostItemViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PromotedPostItemViewModel invoke() {
                AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
                ListingsService listingsService2;
                MutableStateFlow mutableStateFlow;
                CategoryListingsViewModel categoryListingsViewModel = CategoryListingsViewModel.this;
                aggregatedAllAnalyticsLogger2 = categoryListingsViewModel.f28381s0;
                listingsService2 = CategoryListingsViewModel.this.f28383t0;
                PromotedPostSource promotedPostSource = PromotedPostSource.LISTINGS;
                CategoryEntity z22 = CategoryListingsViewModel.this.z2();
                b0 b0Var3 = CategoryListingsViewModel.this.J0;
                AnonymousClass1 anonymousClass1 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$promotedPostItemViewModel$2.1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                };
                mutableStateFlow = CategoryListingsViewModel.this.f28372n1;
                return new PromotedPostItemViewModel(categoryListingsViewModel, categoryListingsViewModel, aggregatedAllAnalyticsLogger2, listingsService2, promotedPostSource, z22, b0Var3, null, null, anonymousClass1, mutableStateFlow, 384, null);
            }
        });
        this.f28374o1 = a17;
        this.f28376p1 = new AtomicBoolean(false);
        this.f28378q1 = FlowKt.flowCombine(distinctUntilChanged, MutableStateFlow5, new CategoryListingsViewModel$isAnimatedPostVisible$1(this, null));
        MutableSharedFlow<com.forsale.app.features.search.a> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f28380r1 = MutableSharedFlow$default2;
        this.f28382s1 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableStateFlow<c> MutableStateFlow6 = StateFlowKt.MutableStateFlow(c.d.f28466a);
        this.f28384t1 = MutableStateFlow6;
        final StateFlow<c> asStateFlow = FlowKt.asStateFlow(MutableStateFlow6);
        this.f28386u1 = asStateFlow;
        Flow<Boolean> flow2 = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28434a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28435a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28436b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28435a = obj;
                        this.f28436b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28434a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28436b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28436b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28435a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28436b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28434a
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c r5 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c) r5
                        boolean r5 = r5 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c.a.C0308a
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f28436b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$6.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        SharingStarted eagerly = companion.getEagerly();
        Boolean bool = Boolean.FALSE;
        this.f28388v1 = FlowKt.stateIn(flow2, this, eagerly, bool);
        shareIn$default = FlowKt__ShareKt.shareIn$default(new Flow<d>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28439a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28440a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28441b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28440a = obj;
                        this.f28441b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28439a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28441b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28441b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28440a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28441b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28439a
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c r5 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c) r5
                        boolean r2 = r5 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c.a.b
                        if (r2 == 0) goto L48
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$d$b r2 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$d$b
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$a$b r5 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c.a.b) r5
                        boolean r5 = r5.a()
                        r2.<init>(r5)
                        goto L4a
                    L48:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$d$a r2 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.d.a.f28468a
                    L4a:
                        r0.f28441b = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$7.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CategoryListingsViewModel.d> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, this, companion.getEagerly(), 0, 4, null);
        this.f28390w1 = shareIn$default;
        this.f28392x1 = new AtomicBoolean(A2() == null);
        a18 = kotlin.d.a(new g00.a<ListingsDataSourceFactory>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$listingsDataSourceFactory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingsDataSourceFactory invoke() {
                DistrictEntity districtEntity;
                b0 b0Var3;
                b0 b0Var4;
                ListingsRepository listingsRepository2;
                ApplicationResourcesRepository applicationResourcesRepository;
                CategoryListingsAnalyticSource a25;
                DistrictsRepository districtsRepository2;
                GAMRepository gAMRepository;
                Deferred deferred;
                AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
                fj.b bVar;
                ListingsFiltrationAnalytics listingsFiltrationAnalytics2;
                CategorySortingStateHandler categorySortingStateHandler;
                StateFlow stateFlow;
                b0 b0Var5;
                nc.a aVar;
                MutableStateFlow mutableStateFlow;
                CategoryListingsViewModel categoryListingsViewModel = CategoryListingsViewModel.this;
                CategoryEntity z22 = categoryListingsViewModel.z2();
                districtEntity = CategoryListingsViewModel.this.H0;
                b0Var3 = CategoryListingsViewModel.this.O0;
                b0Var4 = CategoryListingsViewModel.this.L0;
                b0 b0Var6 = CategoryListingsViewModel.this.J0;
                b0 b0Var7 = CategoryListingsViewModel.this.K0;
                listingsRepository2 = CategoryListingsViewModel.this.f28367l0;
                applicationResourcesRepository = CategoryListingsViewModel.this.f28369m0;
                a25 = CategoryListingsViewModel.this.a2();
                CategoriesRepositories s11 = CategoryListingsViewModel.this.s();
                districtsRepository2 = CategoryListingsViewModel.this.f28377q0;
                gAMRepository = CategoryListingsViewModel.this.f28373o0;
                deferred = CategoryListingsViewModel.this.J1;
                aggregatedAllAnalyticsLogger2 = CategoryListingsViewModel.this.f28381s0;
                bVar = CategoryListingsViewModel.this.f28375p0;
                listingsFiltrationAnalytics2 = CategoryListingsViewModel.this.f28393y0;
                Pair<com.forsale.app.utils.analytics.listingfiltration.a, Integer> l22 = CategoryListingsViewModel.this.l2();
                ListingsAnalytics$FiltersPlace m22 = CategoryListingsViewModel.this.m2();
                AtomicBoolean B2 = CategoryListingsViewModel.this.B2();
                ListingsIntention value = CategoryListingsViewModel.this.q2().getValue();
                String H2 = CategoryListingsViewModel.this.H2();
                categorySortingStateHandler = CategoryListingsViewModel.this.I0;
                SearchAnalyticsData value2 = CategoryListingsViewModel.this.E2().getValue();
                stateFlow = CategoryListingsViewModel.this.f28351a1;
                ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = (ListingDetailsSearchAnalyticsData) stateFlow.getValue();
                ListingsAnalytics$FiltersPlace m23 = CategoryListingsViewModel.this.m2();
                b0Var5 = CategoryListingsViewModel.this.P0;
                aVar = CategoryListingsViewModel.this.A0;
                final CategoryListingsViewModel categoryListingsViewModel2 = CategoryListingsViewModel.this;
                CategoryListingsDecorator categoryListingsDecorator = new CategoryListingsDecorator(z22, districtEntity, b0Var3, b0Var4, b0Var6, b0Var7, listingsRepository2, applicationResourcesRepository, a25, s11, districtsRepository2, gAMRepository, bVar, aggregatedAllAnalyticsLogger2, deferred, categorySortingStateHandler, b0Var5, null, listingsFiltrationAnalytics2, l22, m22, new l<Integer, ListingItemDetails>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$listingsDataSourceFactory$2.1
                    {
                        super(1);
                    }

                    public final ListingItemDetails b(int i11) {
                        ListingItemDetails k22;
                        k22 = CategoryListingsViewModel.this.k2(i11);
                        return k22;
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ ListingItemDetails invoke(Integer num) {
                        return b(num.intValue());
                    }
                }, value, H2, B2, value2, listingDetailsSearchAnalyticsData, m23, aVar, 131072, null);
                mutableStateFlow = CategoryListingsViewModel.this.f28384t1;
                return new ListingsDataSourceFactory(categoryListingsViewModel, categoryListingsDecorator, null, null, mutableStateFlow, 12, null);
            }
        });
        this.f28394y1 = a18;
        a19 = kotlin.d.a(new g00.a<PagedList.c>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$pageConfig$2
            @Override // g00.a
            /* renamed from: b */
            public final PagedList.c invoke() {
                return new PagedList.c.a().c(30).b(false).d(10).a();
            }
        });
        this.f28396z1 = a19;
        a21 = kotlin.d.a(new g00.a<LiveData<PagedList<x9.b<?>>>>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$livePagedListBuilder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final LiveData<PagedList<x9.b<?>>> invoke() {
                ListingsDataSourceFactory p22;
                PagedList.c x22;
                p22 = CategoryListingsViewModel.this.p2();
                x22 = CategoryListingsViewModel.this.x2();
                return new androidx.paging.e(p22, x22).a();
            }
        });
        this.A1 = a21;
        MutableStateFlow<b> MutableStateFlow7 = StateFlowKt.MutableStateFlow(b.a.f28460a);
        this.B1 = MutableStateFlow7;
        this.C1 = FlowKt.combine(MutableStateFlow7, asStateFlow, new CategoryListingsViewModel$filterState$1(this, null));
        this.D1 = StateFlowKt.MutableStateFlow(bool);
        GetListingsBody.FiltrationData A2 = A2();
        this.F1 = (A2 != null ? A2 : null) != null ? ListingsAnalytics$FiltersPlace.PREDEFINED_FILTERS : null;
        MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G1 = MutableSharedFlow$default3;
        this.H1 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        a22 = kotlin.d.a(new g00.a<FiltersFactory>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$filtersFactory$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final FiltersFactory invoke() {
                DistrictsRepository districtsRepository2;
                ExtraAttributeRawRepository extraAttributeRawRepository2;
                FiltersRepository filtersRepository2;
                PreSelectedFiltersFactory preSelectedFiltersFactory2;
                MutableSharedFlow mutableSharedFlow;
                if (CategoryListingsViewModel.this.z2() != null) {
                    CategoryListingsViewModel categoryListingsViewModel = CategoryListingsViewModel.this;
                    CategoryEntity z22 = categoryListingsViewModel.z2();
                    CategoriesRepositories s11 = CategoryListingsViewModel.this.s();
                    districtsRepository2 = CategoryListingsViewModel.this.f28377q0;
                    extraAttributeRawRepository2 = CategoryListingsViewModel.this.f28379r0;
                    RegionsRepository I = CategoryListingsViewModel.this.I();
                    filtersRepository2 = CategoryListingsViewModel.this.f28385u0;
                    preSelectedFiltersFactory2 = CategoryListingsViewModel.this.f28387v0;
                    mutableSharedFlow = CategoryListingsViewModel.this.G1;
                    return new FiltersFactory(categoryListingsViewModel, z22, s11, districtsRepository2, extraAttributeRawRepository2, I, filtersRepository2, preSelectedFiltersFactory2, mutableSharedFlow, false);
                }
                return null;
            }
        });
        this.I1 = a22;
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, coroutineStart, new CategoryListingsViewModel$filtersMediator$1(this, null), 1, null);
        this.J1 = async$default;
        async$default2 = BuildersKt__Builders_commonKt.async$default(this, null, coroutineStart, new CategoryListingsViewModel$districtsMediator$1(this, null), 1, null);
        this.K1 = async$default2;
        a23 = kotlin.d.a(new g00.a<OneShotEventHandler<GetListingsBody.FiltrationData>>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onFiltrationDataChangeEvent$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final OneShotEventHandler<GetListingsBody.FiltrationData> invoke() {
                return new OneShotEventHandler<>(null, 0, 3, null);
            }
        });
        this.L1 = a23;
        this.M1 = new h(new CategoryListingsViewModel$filtrationDataObserver$1(this));
        a24 = kotlin.d.a(new g00.a<OneShotEventHandler<DistrictEntity>>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onDistrictSelectionChangeEvent$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final OneShotEventHandler<DistrictEntity> invoke() {
                return new OneShotEventHandler<>(null, 0, 3, null);
            }
        });
        this.N1 = a24;
        this.O1 = new h(new CategoryListingsViewModel$districtSelectionObserver$1(this));
        j jVar = new j();
        this.P1 = jVar;
        U1();
        dj.i invoke = dj.i.f54287a.invoke();
        invoke.d("DropdownAttributeFilterViewModel", "CATEGORY: " + d11);
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO().plus(new i(CoroutineExceptionHandler.Key, this)), null, new AnonymousClass3(null), 2, null);
        z3();
        listingsRepository.getTranslationRepository().m8getTranslationLiveData().observeForever(jVar);
        J3();
        b3();
        c3();
        MutableSharedFlow<a> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Q1 = MutableSharedFlow$default4;
        this.R1 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        a.b bVar = a.b.f76379a;
        this.S1 = StateFlowKt.MutableStateFlow(bVar);
        final MutableStateFlow<ya.a> MutableStateFlow8 = StateFlowKt.MutableStateFlow(bVar);
        this.T1 = MutableStateFlow8;
        Boolean bool2 = Boolean.TRUE;
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool2);
        this.U1 = MutableStateFlow9;
        this.V1 = FlowKt.combine(MutableStateFlow8, MutableStateFlow9, asStateFlow, new CategoryListingsViewModel$isUpButtonVisible$1(this, null));
        this.W1 = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28445a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ CategoryListingsViewModel f28446b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28447a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28448b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28447a = obj;
                        this.f28448b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CategoryListingsViewModel categoryListingsViewModel) {
                    this.f28445a = flowCollector;
                    this.f28446b = categoryListingsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.a r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28448b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28448b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f28447a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28448b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L6a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f28445a
                        ya.a r6 = (ya.a) r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r2 = r5.f28446b
                        kotlinx.coroutines.flow.MutableStateFlow r2 = r2.n2()
                        java.lang.Object r2 = r2.getValue()
                        ya.a$a r4 = ya.a.C0943a.f76378a
                        boolean r2 = kotlin.jvm.internal.o.d(r2, r4)
                        if (r2 == 0) goto L52
                        ya.a$c r2 = ya.a.c.f76380a
                        boolean r2 = kotlin.jvm.internal.o.d(r6, r2)
                        if (r2 != 0) goto L5a
                    L52:
                        ya.a$b r2 = ya.a.b.f76379a
                        boolean r6 = kotlin.jvm.internal.o.d(r6, r2)
                        if (r6 == 0) goto L5c
                    L5a:
                        r6 = r3
                        goto L5d
                    L5c:
                        r6 = 0
                    L5d:
                        java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r6)
                        r0.f28448b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$8.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), companion.getEagerly(), bool2);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(bool);
        this.X1 = MutableStateFlow10;
        StateFlow<Boolean> asStateFlow2 = FlowKt.asStateFlow(MutableStateFlow10);
        this.Y1 = asStateFlow2;
        this.Z1 = FlowKt.stateIn(FlowKt.flowCombine(stateIn2, asStateFlow2, new CategoryListingsViewModel$isAnalyticsEnabled$1(this, null)), r0.a(this), companion.getEagerly(), bool);
        final MutableStateFlow<Integer> MutableStateFlow11 = StateFlowKt.MutableStateFlow(0);
        this.f28352a2 = MutableStateFlow11;
        this.f28354b2 = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28451a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28452a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28453b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28452a = obj;
                        this.f28453b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28451a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28453b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28453b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28452a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28453b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28451a
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        if (r5 >= r3) goto L40
                        r5 = r3
                        goto L41
                    L40:
                        r5 = 0
                    L41:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f28453b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$map$9.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        });
        n11 = r.n();
        MutableStateFlow<Pair<String, List<CategoryEntity>>> MutableStateFlow12 = StateFlowKt.MutableStateFlow(wz.i.a("", n11));
        this.f28356c2 = MutableStateFlow12;
        this.f28358d2 = FlowKt.asStateFlow(MutableStateFlow12);
        n12 = r.n();
        e11 = androidx.compose.runtime.c0.e(new Pair(n12, new TrendEntity(0, "", "", false, 9, null)), null, 2, null);
        this.f28360e2 = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetListingsBody.FiltrationData A2() {
        return (GetListingsBody.FiltrationData) this.F0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingsTypes D2() {
        return ListingsTypes.NORMAL_LISTINGS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(zz.a<? super java.util.List<java.lang.Integer>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllCategoryIds$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllCategoryIds$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllCategoryIds$1) r0
            int r1 = r0.f28502c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28502c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllCategoryIds$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllCategoryIds$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28500a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28502c
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
            kotlinx.coroutines.Deferred<com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator> r5 = r4.J1
            r0.f28502c = r3
            java.lang.Object r5 = r5.await(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r5 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator) r5
            if (r5 == 0) goto L48
            java.util.List r5 = r5.q()
            goto L49
        L48:
            r5 = 0
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.J2(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(Pair<? extends List<TrendEntity>, TrendEntity> pair) {
        this.f28360e2.setValue(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingDetailsSearchAnalyticsData P3(SearchAnalyticsData searchAnalyticsData) {
        return ListingDetailsSearchAnalyticsData.f25325g.a(searchAnalyticsData, this.V0.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object S1(CategoryListingsViewModel categoryListingsViewModel, DistrictEntity districtEntity, zz.a aVar) {
        categoryListingsViewModel.f3(districtEntity);
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingsIntention S2() {
        return (ListingsIntention) this.U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$fetchExpireSoonPopup$1(this, null), 3, null);
    }

    private final void U1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$fetchInterstitial$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U2(ListingsIntention listingsIntention) {
        List q11;
        SearchAnalyticsData.SearchSource searchSource;
        boolean b02;
        if (listingsIntention != ListingsIntention.SEARCH) {
            q11 = r.q(SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES, SearchAnalyticsData.SearchSource.RECENT_SEARCH_CATEGORIES, SearchAnalyticsData.SearchSource.SEARCH_BREADCRUMBS);
            List list = q11;
            SearchAnalyticsData value = this.Z0.getValue();
            if (value != null) {
                searchSource = value.e();
            } else {
                searchSource = null;
            }
            b02 = CollectionsKt___CollectionsKt.b0(list, searchSource);
            if (b02) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object W1(CategoryListingsViewModel categoryListingsViewModel, GetListingsBody.FiltrationData filtrationData, zz.a aVar) {
        categoryListingsViewModel.g3(filtrationData);
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X1(com.forsale.app.datalayer.database.CategoryEntity r8, zz.a<? super wz.p> r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.X1(com.forsale.app.datalayer.database.CategoryEntity, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryListingsAnalyticSource a2() {
        SearchAnalyticsData.SearchSource searchSource;
        SearchAnalyticsData.SearchSource searchSource2;
        SearchAnalyticsData.SearchSource searchSource3;
        SearchAnalyticsData.SearchSource searchSource4;
        if (Z1() == null) {
            SearchAnalyticsData value = this.Z0.getValue();
            if (value != null) {
                searchSource = value.e();
            } else {
                searchSource = null;
            }
            if (searchSource == SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES) {
                return new CategoryListingsAnalyticSource.SearchCategory(null, 1, null);
            }
            if (S2() == ListingsIntention.SEARCH) {
                return new CategoryListingsAnalyticSource.SearchMode(null, 1, null);
            }
            SearchAnalyticsData value2 = this.Z0.getValue();
            if (value2 != null) {
                searchSource2 = value2.e();
            } else {
                searchSource2 = null;
            }
            if (searchSource2 == SearchAnalyticsData.SearchSource.RECENT_SEARCH_CATEGORIES) {
                return new CategoryListingsAnalyticSource.RecentSearchCategory(null, 1, null);
            }
            SearchAnalyticsData value3 = this.Z0.getValue();
            if (value3 != null) {
                searchSource3 = value3.e();
            } else {
                searchSource3 = null;
            }
            if (searchSource3 == SearchAnalyticsData.SearchSource.SEARCH_BREADCRUMBS) {
                return new CategoryListingsAnalyticSource.BreadcrumbsSearchCategory(null, 1, null);
            }
            SearchAnalyticsData value4 = this.Z0.getValue();
            if (value4 != null) {
                searchSource4 = value4.e();
            } else {
                searchSource4 = null;
            }
            if (searchSource4 == SearchAnalyticsData.SearchSource.CONTINUE_BROWSING) {
                return new CategoryListingsAnalyticSource.ContinueBrowsingSearchCategory(null, 1, null);
            }
            return Z1();
        }
        return Z1();
    }

    private final void b3() {
        boolean z11;
        String H2 = H2();
        boolean z12 = false;
        if (H2 != null) {
            if (H2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12 && this.G0 == null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), new f(CoroutineExceptionHandler.Key), null, new CategoryListingsViewModel$loadSearchBreadcrumbs$2(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryListingsDecorator c2() {
        PagedListingsDecorator value = p2().f().getValue();
        o.f(value);
        return (CategoryListingsDecorator) value;
    }

    private final void c3() {
        if (this.V0.getValue() == ListingsIntention.SEARCH) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), new g(CoroutineExceptionHandler.Key), null, new CategoryListingsViewModel$loadTrendsSection$2(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FiltersFactory f2() {
        return (FiltersFactory) this.I1.getValue();
    }

    private final void f3(DistrictEntity districtEntity) {
        x3(CategoryListingsDecorator.m0(c2(), null, districtEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870909, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ListingsResponse.UISettings.FiltrationSetting> g2() {
        List<ListingsResponse.UISettings.FiltrationSetting> n11;
        List<ListingsResponse.UISettings.FiltrationSetting> filtrationSettings;
        CategoryEntity categoryEntity = this.G0;
        if (categoryEntity == null || (filtrationSettings = categoryEntity.getFiltrationSettings()) == null) {
            n11 = r.n();
            return n11;
        }
        return filtrationSettings;
    }

    private final void g3(GetListingsBody.FiltrationData filtrationData) {
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace;
        h3(filtrationData);
        if (!GetListingsBody.FiltrationData.Companion.equal(c2().A0(), filtrationData)) {
            boolean z11 = false;
            x10.a.b("Search::onFiltersChange:: " + this.Z0 + " " + this.V0.getValue(), new Object[0]);
            x10.a.b("Search::onFiltersChange:: " + this.f28351a1 + " " + this.V0.getValue(), new Object[0]);
            CategoryListingsDecorator c22 = c2();
            Pair<? extends com.forsale.app.utils.analytics.listingfiltration.a, Integer> pair = this.E1;
            ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2 = this.F1;
            ListingsIntention value = this.V0.getValue();
            String H2 = H2();
            CategorySortingStateHandler categorySortingStateHandler = this.I0;
            SearchAnalyticsData value2 = this.Z0.getValue();
            StateFlow<ListingDetailsSearchAnalyticsData> stateFlow = this.f28351a1;
            if (stateFlow != null) {
                listingDetailsSearchAnalyticsData = stateFlow.getValue();
            } else {
                listingDetailsSearchAnalyticsData = null;
            }
            if (filtrationData != null) {
                if (filtrationData.getCount() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    listingsAnalytics$FiltersPlace = this.F1;
                    x3(CategoryListingsDecorator.m0(c22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, categorySortingStateHandler, null, filtrationData, null, pair, listingsAnalytics$FiltersPlace2, null, value, H2, null, value2, listingDetailsSearchAnalyticsData, listingsAnalytics$FiltersPlace, null, 287670271, null));
                }
            }
            listingsAnalytics$FiltersPlace = null;
            x3(CategoryListingsDecorator.m0(c22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, categorySortingStateHandler, null, filtrationData, null, pair, listingsAnalytics$FiltersPlace2, null, value, H2, null, value2, listingDetailsSearchAnalyticsData, listingsAnalytics$FiltersPlace, null, 287670271, null));
        }
    }

    private final void h3(GetListingsBody.FiltrationData filtrationData) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$onModifyPredefinedFilter$1(this, filtrationData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i3(CategoryListingsViewModel categoryListingsViewModel, GetListingsBody.FiltrationData filtrationData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            filtrationData = null;
        }
        categoryListingsViewModel.h3(filtrationData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchAnalyticsData j2() {
        return (SearchAnalyticsData) this.Y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingItemDetails k2(int i11) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new CategoryListingsViewModel$getItemDetails$1(this, i11, null), 1, null);
        return (ListingItemDetails) runBlocking$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingsPageMode o2(ListingsIntention listingsIntention) {
        boolean U2 = U2(listingsIntention);
        if (U2) {
            return ListingsPageMode.SEARCH;
        }
        if (!U2) {
            return ListingsPageMode.LISTINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingsDataSourceFactory p2() {
        return (ListingsDataSourceFactory) this.f28394y1.getValue();
    }

    private final void t3() {
        this.f28366k1.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneShotEventHandler<DistrictEntity> u2() {
        return (OneShotEventHandler) this.N1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneShotEventHandler<GetListingsBody.FiltrationData> w2() {
        return (OneShotEventHandler) this.L1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchAnalyticsData w3(SearchAnalyticsData searchAnalyticsData, ListingsIntention listingsIntention) {
        if (listingsIntention == ListingsIntention.RESET_SEARCH) {
            return null;
        }
        return searchAnalyticsData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PagedList.c x2() {
        return (PagedList.c) this.f28396z1.getValue();
    }

    public static /* synthetic */ void y3(CategoryListingsViewModel categoryListingsViewModel, PagedListingsDecorator pagedListingsDecorator, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pagedListingsDecorator = null;
        }
        categoryListingsViewModel.x3(pagedListingsDecorator);
    }

    private final Job z3() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$registerFiltersObservers$1(this, null), 3, null);
        return launch$default;
    }

    public final void A3() {
        p2().h();
    }

    public final AtomicBoolean B2() {
        return this.f28392x1;
    }

    public final void B3() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new CategoryListingsViewModel$saveLastContinueBrowsingData$1(this, null), 2, null);
    }

    public final PromotedPostItemViewModel C2() {
        return (PromotedPostItemViewModel) this.f28374o1.getValue();
    }

    public final void C3(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$setFirstVisibleItem$1(this, i11, null), 3, null);
    }

    public final void D3(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$setFirstVisibleItemScrolled$1(this, i11, null), 3, null);
    }

    public final StateFlow<SearchAnalyticsData> E2() {
        return this.Z0;
    }

    public final void E3(com.forsale.app.utils.analytics.listingfiltration.a filterAnalyticsTypes, int i11) {
        o.i(filterAnalyticsTypes, "filterAnalyticsTypes");
        this.E1 = wz.i.a(filterAnalyticsTypes, Integer.valueOf(i11));
        this.F1 = ListingsAnalytics$FiltersPlace.EXPOSED_FILTERS;
    }

    public final String F2() {
        if (this.V0.getValue() == ListingsIntention.SEARCH) {
            return H2();
        }
        CategoryEntity categoryEntity = this.G0;
        if (categoryEntity != null) {
            return categoryEntity.getName();
        }
        return null;
    }

    public final void F3(Pair<? extends com.forsale.app.utils.analytics.listingfiltration.a, Integer> pair) {
        this.E1 = pair;
    }

    public final StateFlow<Pair<String, List<CategoryEntity>>> G2() {
        return this.f28358d2;
    }

    public final void G3(ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace) {
        this.F1 = listingsAnalytics$FiltersPlace;
    }

    public final String H2() {
        return (String) this.W0.getValue();
    }

    public final void H3(boolean z11) {
        ya.a aVar;
        if (z11) {
            aVar = a.C0943a.f76378a;
        } else {
            aVar = a.c.f76380a;
        }
        if (o.d(this.T1.getValue(), aVar)) {
            return;
        }
        this.S1.setValue(this.T1.getValue());
        this.T1.setValue(aVar);
    }

    public final SearchSource I2() {
        return (SearchSource) this.X0.getValue();
    }

    public final void I3(int i11) {
        this.T0.postValue(Integer.valueOf(i11));
    }

    public final void J3() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$setSearchBarTitle$1(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        r6 = kotlin.collections.q.e(kotlin.coroutines.jvm.internal.a.d(r6.intValue()));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(zz.a<? super java.util.List<java.lang.Integer>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllDistrictIds$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllDistrictIds$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllDistrictIds$1) r0
            int r1 = r0.f28505c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28505c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllDistrictIds$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getSelectedAllDistrictIds$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f28503a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28505c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.f.b(r6)
            goto L5e
        L38:
            kotlin.f.b(r6)
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator r6 = r5.c2()
            java.lang.Integer r6 = r6.F0()
            if (r6 == 0) goto L53
            int r6 = r6.intValue()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            java.util.List r6 = kotlin.collections.p.e(r6)
            if (r6 != 0) goto L6d
        L53:
            kotlinx.coroutines.Deferred<com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator> r6 = r5.J1
            r0.f28505c = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r6 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator) r6
            if (r6 == 0) goto L6c
            r0.f28505c = r3
            java.lang.Object r6 = r6.r(r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            return r6
        L6c:
            r6 = 0
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.K2(zz.a):java.lang.Object");
    }

    public final StateFlow<String> L2() {
        return this.f28357d1;
    }

    public final void L3() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$showSortingBottomSheetOptionsList$1(this, null), 3, null);
    }

    public final Flow<Boolean> M2() {
        return this.f28354b2;
    }

    public final void M3() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$togglePromotedPostCancelledState$1(this, null), 3, null);
    }

    public final StateFlow<com.forsale.app.features.categories.listings.category.f> N2() {
        return this.I0.b();
    }

    public final void N3(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$trackListingScreenOpened$1(this, z11, null), 3, null);
    }

    public final Flow<com.forsale.app.features.categories.listings.category.f> O2() {
        final SharedFlow<com.forsale.app.features.categories.listings.category.f> c11 = this.I0.c();
        return new Flow<com.forsale.app.features.categories.listings.category.f>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f28398a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2", f = "CategoryListingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f28399a;

                    /* renamed from: b  reason: collision with root package name */
                    int f28400b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f28399a = obj;
                        this.f28400b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f28398a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f28400b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28400b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f28399a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f28400b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f28398a
                        r2 = r5
                        com.forsale.app.features.categories.listings.category.f r2 = (com.forsale.app.features.categories.listings.category.f) r2
                        boolean r2 = r2 instanceof com.forsale.app.features.categories.listings.category.f.a
                        if (r2 == 0) goto L46
                        r0.f28400b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super f> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
    }

    public final void O3(GetListingsBody.FiltrationData filtrationData, ListingsAnalytics$FiltersPlace filterPlaces) {
        o.i(filterPlaces, "filterPlaces");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$updateFilters$1(this, filterPlaces, filtrationData, null), 3, null);
    }

    public final LiveData<Integer> P2() {
        return this.S0;
    }

    public final LiveData<Integer> Q2() {
        return this.Q0;
    }

    public final void R1() {
        t3();
        C2().r();
    }

    public final Pair<List<TrendEntity>, TrendEntity> R2() {
        return (Pair) this.f28360e2.getValue();
    }

    public final Flow<Boolean> T2() {
        return this.f28378q1;
    }

    public final void V1() {
        this.f28366k1.set(false);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$fetchPromotedPost$1(this, null), 3, null);
    }

    public final StateFlow<Boolean> V2() {
        return this.f28388v1;
    }

    public final StateFlow<Boolean> W2() {
        return this.f28362g1;
    }

    public final StateFlow<Boolean> X2() {
        return this.W1;
    }

    public final MutableStateFlow<Boolean> Y1() {
        return this.D1;
    }

    public final Flow<Boolean> Y2() {
        return this.V1;
    }

    public final CategoryListingsAnalyticSource Z1() {
        return (CategoryListingsAnalyticSource) this.M0.getValue();
    }

    public final void Z2(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$listingsListHitTop$1(this, z11, null), 3, null);
    }

    public final void a3(c listingState) {
        o.i(listingState, "listingState");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$listingsStateChanged$1(this, listingState, null), 3, null);
    }

    public final StateFlow<List<SortingStates>> b2() {
        return this.f28361f1;
    }

    public final Flow<b> d2() {
        return this.C1;
    }

    public final void d3() {
        SearchLocation searchLocation;
        AggregatedAllAnalyticsLogger r11 = r();
        if (this.f28362g1.getValue().booleanValue()) {
            searchLocation = SearchLocation.SEARCH_RESULTS;
        } else {
            searchLocation = SearchLocation.LISTINGS;
        }
        AggregatedAllAnalyticsLoggerKt.y0(r11, searchLocation);
    }

    public final SharedFlow<a> e2() {
        return this.R1;
    }

    public final void e3() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$logUpButtonClicked$1(this, null), 3, null);
    }

    public final boolean h2() {
        return this.N0;
    }

    public final MutableStateFlow<Boolean> i2() {
        return this.U1;
    }

    public final void j3() {
        y3(this, null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$onPullToRefresh$1(this, null), 3, null);
    }

    public final void k3(ListingsAnalytics$FiltersPlace filterPlaces) {
        o.i(filterPlaces, "filterPlaces");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$onResetAllClicked$2(this, filterPlaces, null), 3, null);
    }

    public final Pair<com.forsale.app.utils.analytics.listingfiltration.a, Integer> l2() {
        return this.E1;
    }

    public final void l3(g00.a<p> filterClicked) {
        o.i(filterClicked, "filterClicked");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$onResetAllClicked$1(this, filterClicked, null), 3, null);
    }

    public final ListingsAnalytics$FiltersPlace m2() {
        return this.F1;
    }

    public final void m3(CategoryEntity category) {
        o.i(category, "category");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1(this, category, null), 3, null);
    }

    public final MutableStateFlow<ya.a> n2() {
        return this.S1;
    }

    public final Job n3(SortingStates sortingState) {
        Job launch$default;
        o.i(sortingState, "sortingState");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$onSortingButtonClicked$1(this, sortingState, null), 3, null);
        return launch$default;
    }

    public final Job o3(SortingStates sortingState) {
        Job launch$default;
        o.i(sortingState, "sortingState");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$onSortingOptionSelected$1(this, sortingState, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.f28367l0.getTranslationRepository().m8getTranslationLiveData().removeObserver(this.P1);
        dj.i.f54287a.invoke().b("DropdownAttributeFilterViewModel");
    }

    public final void p3(TrendEntity trendItem) {
        o.i(trendItem, "trendItem");
        String localized = trendItem.getLocalized();
        List<TrendEntity> c11 = R2().c();
        if (c11 != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new CategoryListingsViewModel$onTrendsItemClicked$1$1(this, localized, c11, trendItem, null), 3, null);
        }
    }

    public final MutableStateFlow<ListingsIntention> q2() {
        return this.V0;
    }

    public final void q3() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$openAllFiltersScreen$1(this, null), 3, null);
    }

    public final StateFlow<c> r2() {
        return this.f28386u1;
    }

    public final void r3(FilterViewModel<?, ?, ?> filter, int i11) {
        o.i(filter, "filter");
        filter.J(i11);
    }

    public final LiveData<PagedList<x9.b<?>>> s2() {
        return (LiveData) this.A1.getValue();
    }

    public final void s3(boolean z11) {
        t3();
        C2().A(Boolean.valueOf(z11));
    }

    public final SharedFlow<com.forsale.app.features.search.a> t2() {
        return this.f28382s1;
    }

    public final Object u3(boolean z11, zz.a<? super Map<String, ? extends Object>> aVar) {
        return CategoryListingsDecorator.U0(c2(), z11, false, aVar, 2, null);
    }

    public final SharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> v2() {
        return this.H1;
    }

    public final void v3() {
        boolean z11;
        Integer value = this.T0.getValue();
        if (value != null) {
            if (value.intValue() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                value = null;
            }
            if (value != null) {
                c2().R0(value.intValue());
            }
        }
    }

    public final void x3(PagedListingsDecorator pagedListingsDecorator) {
        this.R0.i(p.f75480a);
        R1();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoryListingsViewModel$refresh$1(this, pagedListingsDecorator, null), 3, null);
    }

    public final SharedFlow<d> y2() {
        return this.f28390w1;
    }

    public final CategoryEntity z2() {
        return this.G0;
    }
}
