package com.forsale.app.features.categories.listings.generalListings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource;
import com.forsale.app.features.categories.listings.paging.b;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import d4.e0;
import g00.p;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
/* compiled from: GeneralListingsViewModel.kt */
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel extends q0 {
    private final LiveData<CategoryEntity> A;
    private final b0<RegionEntity> B;
    private final b0<MasterDataMiscModel> C;
    private final b0<ListingsResponse.UISettings> D;
    private final OneShotEventHandler<MyListingsDateRange> E;
    private final ListingsTypes F;
    private final MutableStateFlow<Integer> G;
    private final StateFlow<Integer> H;
    private final wz.h I;
    private final MutableStateFlow<Boolean> J;
    private final StateFlow<Boolean> K;
    private final CoroutineContext L;
    private final MutableStateFlow<PagingData<x9.b<?>>> M;
    private final StateFlow<PagingData<x9.b<?>>> N;
    private final MutableStateFlow<MyListingsType> O;
    private final StateFlow<MyListingsType> P;
    private final wz.h Q;
    private final FlowCollector<MyListingsDateRange> R;
    public SearchFocusViewModel.b S;
    private final wz.h T;
    private final MutableStateFlow<com.forsale.app.features.categories.listings.paging.b> U;
    private final StateFlow<com.forsale.app.features.categories.listings.paging.b> V;

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f30470a;

    /* renamed from: b  reason: collision with root package name */
    private final ApplicationResourcesRepository f30471b;

    /* renamed from: c  reason: collision with root package name */
    private final MasterDataRepository f30472c;

    /* renamed from: d  reason: collision with root package name */
    private final GAMRepository f30473d;

    /* renamed from: e  reason: collision with root package name */
    private final fj.b f30474e;

    /* renamed from: f  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f30475f;

    /* renamed from: g  reason: collision with root package name */
    private final RegionsRepository f30476g;

    /* renamed from: h  reason: collision with root package name */
    private final CategoriesRepositories f30477h;

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineDispatcher f30478i;

    /* renamed from: j  reason: collision with root package name */
    private final nc.a f30479j;

    /* renamed from: x  reason: collision with root package name */
    private final jj.b f30480x;

    /* renamed from: y  reason: collision with root package name */
    private final com.forsale.app.features.categories.listings.generalListings.b f30481y;

    /* renamed from: z  reason: collision with root package name */
    private final b0<CategoryEntity> f30482z;

    /* compiled from: GeneralListingsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$1", f = "GeneralListingsViewModel.kt", l = {160, 162, 164, 165}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f30483a;

        /* renamed from: b  reason: collision with root package name */
        int f30484b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r6.f30484b
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.f.b(r7)
                goto L98
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                java.lang.Object r1 = r6.f30483a
                androidx.lifecycle.b0 r1 = (androidx.lifecycle.b0) r1
                kotlin.f.b(r7)
                goto L87
            L29:
                kotlin.f.b(r7)
                goto L5d
            L2d:
                kotlin.f.b(r7)
                goto L43
            L31:
                kotlin.f.b(r7)
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                com.forsale.app.datalayer.repositories.RegionsRepository r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.r(r7)
                r6.f30484b = r5
                java.lang.Object r7 = r7.getCurrentRegion(r6)
                if (r7 != r0) goto L43
                return r0
            L43:
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r1 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.q(r1)
                com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
                r1.postValue(r7)
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                com.forsale.app.datalayer.repositories.MasterDataRepository r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.l(r7)
                r6.f30484b = r4
                java.lang.Object r7 = r7.getMasterDataMiscModel(r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r1 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.m(r1)
                com.forsale.app.datalayer.database.MasterDataMiscModel r7 = (com.forsale.app.datalayer.database.MasterDataMiscModel) r7
                r1.postValue(r7)
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.s(r7)
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                com.forsale.app.features.categories.listings.generalListings.b r4 = r7.E()
                int r4 = r4.c()
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
                r6.f30483a = r1
                r6.f30484b = r3
                java.lang.Object r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.j(r7, r4, r6)
                if (r7 != r0) goto L87
                return r0
            L87:
                r1.postValue(r7)
                com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.this
                r1 = 0
                r6.f30483a = r1
                r6.f30484b = r2
                java.lang.Object r7 = com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.o(r7, r6)
                if (r7 != r0) goto L98
                return r0
            L98:
                wz.p r7 = wz.p.f75480a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: GeneralListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30486a;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.NORMAL_LISTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsTypes.SPOTLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingsTypes.SPOTLIGHT_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ListingsTypes.OTHER_USER_ITEMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ListingsTypes.USER_ITEMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ListingsTypes.MY_VIEW_HISTORY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ListingsTypes.HOT_ZONES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ListingsTypes.NEW_ARRIVALS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ListingsTypes.RECOMMENDED_LISTINGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ListingsTypes.FOR_SALE_REALTY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ListingsTypes.FEATURED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ListingsTypes.BUSINESS_COMMERCIAL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f30486a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeneralListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<PagingData<x9.b<?>>> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(PagingData<x9.b<?>> pagingData, zz.a<? super wz.p> aVar) {
            GeneralListingsViewModel.this.M.setValue(pagingData);
            return wz.p.f75480a;
        }
    }

    /* compiled from: GeneralListingsViewModel.kt */
    /* loaded from: classes2.dex */
    static final class c implements FlowCollector, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ p f30488a;

        c(p function) {
            o.i(function, "function");
            this.f30488a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f30488a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ Object emit(Object obj, zz.a aVar) {
            return this.f30488a.invoke(obj, aVar);
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
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeneralListingsViewModel f30489a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, GeneralListingsViewModel generalListingsViewModel) {
            super(key);
            this.f30489a = generalListingsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f30489a.T(th2);
        }
    }

    public GeneralListingsViewModel(ListingsRepository listingsRepository, ApplicationResourcesRepository arr, MasterDataRepository masterDataRepository, GAMRepository gamRepository, fj.b gamUtils, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, RegionsRepository regionsRepository, CategoriesRepositories categoriesRepositories, k0 savedStateHandle, CoroutineDispatcher ioDispatcher, nc.a getSwipeableListInteractor, jj.b preferences) {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        o.i(listingsRepository, "listingsRepository");
        o.i(arr, "arr");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(gamRepository, "gamRepository");
        o.i(gamUtils, "gamUtils");
        o.i(aggregatedAllAnalyticsLogger, "aggregatedAllAnalyticsLogger");
        o.i(regionsRepository, "regionsRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        o.i(preferences, "preferences");
        this.f30470a = listingsRepository;
        this.f30471b = arr;
        this.f30472c = masterDataRepository;
        this.f30473d = gamRepository;
        this.f30474e = gamUtils;
        this.f30475f = aggregatedAllAnalyticsLogger;
        this.f30476g = regionsRepository;
        this.f30477h = categoriesRepositories;
        this.f30478i = ioDispatcher;
        this.f30479j = getSwipeableListInteractor;
        this.f30480x = preferences;
        com.forsale.app.features.categories.listings.generalListings.b b11 = com.forsale.app.features.categories.listings.generalListings.b.f30530p.b(savedStateHandle);
        this.f30481y = b11;
        b0<CategoryEntity> b0Var = new b0<>();
        this.f30482z = b0Var;
        this.A = b0Var;
        this.B = new b0<>();
        this.C = new b0<>();
        this.D = new b0<>();
        this.E = new OneShotEventHandler<>(null, 0, 3, null);
        this.F = b11.f();
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.G = MutableStateFlow;
        this.H = FlowKt.asStateFlow(MutableStateFlow);
        a11 = kotlin.d.a(new g00.a<GeneralListingsDecorator>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$listingsDecorator$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final GeneralListingsDecorator invoke() {
                return GeneralListingsViewModel.D(GeneralListingsViewModel.this, null, 1, null);
            }
        });
        this.I = a11;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.J = MutableStateFlow2;
        this.K = FlowKt.asStateFlow(MutableStateFlow2);
        CoroutineContext plus = ioDispatcher.plus(new d(CoroutineExceptionHandler.Key, this));
        this.L = plus;
        MutableStateFlow<PagingData<x9.b<?>>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(PagingData.f13918e.a());
        this.M = MutableStateFlow3;
        this.N = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<MyListingsType> MutableStateFlow4 = StateFlowKt.MutableStateFlow(MyListingsType.ACTIVE);
        this.O = MutableStateFlow4;
        this.P = FlowKt.asStateFlow(MutableStateFlow4);
        a12 = kotlin.d.a(new g00.a<List<? extends MyListingsType>>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$myListingsFilters$2
            @Override // g00.a
            public final List<? extends MyListingsType> invoke() {
                List<? extends MyListingsType> t02;
                MyListingsType.Companion.resetSelected();
                t02 = ArraysKt___ArraysKt.t0(MyListingsType.values());
                return t02;
            }
        });
        this.Q = a12;
        this.R = new c(new GeneralListingsViewModel$archivedFilterSelectorObserver$1(this));
        a13 = kotlin.d.a(new g00.a<SearchFocusViewModel>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$searchViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SearchFocusViewModel invoke() {
                SearchFocusViewModel.b H = GeneralListingsViewModel.this.H();
                AdvancedSearchBody h11 = GeneralListingsViewModel.this.E().h();
                return SearchFocusViewModel.b.a.a(H, (h11 == null || (r0 = h11.getSearchString()) == null) ? "" : "", false, Boolean.FALSE, null, null, 24, null);
            }
        });
        this.T = a13;
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), plus, null, new AnonymousClass1(null), 2, null);
        e0();
        MutableStateFlow<com.forsale.app.features.categories.listings.paging.b> MutableStateFlow5 = StateFlowKt.MutableStateFlow(b.c.f31003a);
        this.U = MutableStateFlow5;
        this.V = FlowKt.asStateFlow(MutableStateFlow5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object B(GeneralListingsViewModel generalListingsViewModel, MyListingsDateRange myListingsDateRange, zz.a aVar) {
        generalListingsViewModel.Y(myListingsDateRange);
        return wz.p.f75480a;
    }

    private final GeneralListingsDecorator C(MyListingsDateRange myListingsDateRange) {
        List list;
        MyListingsDateRange myListingsDateRange2;
        ListingsTypes f11 = this.f30481y.f();
        b0<ListingsResponse.UISettings> b0Var = this.D;
        OneShotEventHandler<MyListingsDateRange> oneShotEventHandler = this.E;
        b0<RegionEntity> b0Var2 = this.B;
        b0<MasterDataMiscModel> b0Var3 = this.C;
        ListingsRepository listingsRepository = this.f30470a;
        ApplicationResourcesRepository applicationResourcesRepository = this.f30471b;
        GAMRepository gAMRepository = this.f30473d;
        fj.b bVar = this.f30474e;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f30475f;
        Integer valueOf = Integer.valueOf(this.f30481y.k());
        String l11 = this.f30481y.l();
        int[] d11 = this.f30481y.d();
        if (d11 != null) {
            list = m.c(d11);
        } else {
            list = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar = new com.forsale.app.features.categories.listings.generalListings.a(valueOf, l11, list, this.f30481y.g(), Integer.valueOf(this.f30481y.a()), this.f30481y.h(), this.P, Integer.valueOf(this.f30481y.c()));
        if (myListingsDateRange == null) {
            myListingsDateRange2 = G();
        } else {
            myListingsDateRange2 = myListingsDateRange;
        }
        return new GeneralListingsDecorator(f11, b0Var, oneShotEventHandler, b0Var2, b0Var3, listingsRepository, applicationResourcesRepository, gAMRepository, bVar, aggregatedAllAnalyticsLogger, aVar, myListingsDateRange2, this.f30481y.e(), this.f30481y.i(), this.f30481y.j(), null, null, null, null, this.A, this.f30481y.b(), r0.a(this), this.f30479j, 491520, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ GeneralListingsDecorator D(GeneralListingsViewModel generalListingsViewModel, MyListingsDateRange myListingsDateRange, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            myListingsDateRange = null;
        }
        return generalListingsViewModel.C(myListingsDateRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(Integer num, zz.a<? super CategoryEntity> aVar) {
        if (num != null) {
            return this.f30477h.getCategory(num.intValue(), aVar);
        }
        return null;
    }

    private final MyListingsDateRange G() {
        return MyListingsDateRange.LATEST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GeneralListingsDecorator J() {
        return (GeneralListingsDecorator) this.I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(zz.a<? super wz.p> aVar) {
        Object f11;
        Object collect = CachedPagingDataKt.a(FlowKt.distinctUntilChanged(O()), r0.a(this)).collect(new b(), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (collect == f11) {
            return collect;
        }
        return wz.p.f75480a;
    }

    private final Flow<PagingData<x9.b<?>>> O() {
        return new Pager(new e0(30, 0, false, 30, 0, 0, 50, null), null, new g00.a<PagingSource<Integer, x9.b<?>>>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$getPaging$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final PagingSource<Integer, x9.b<?>> invoke() {
                GeneralListingsDecorator J;
                J = GeneralListingsViewModel.this.J();
                return new NewListingsDataSource(J);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Throwable th2) {
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$handle$1(this, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$handle$2(this, null), 3, null);
        }
    }

    private final void Y(MyListingsDateRange myListingsDateRange) {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$recordStatusTabClicked$1(this, null), 3, null);
    }

    private final Job e0() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$registerObservers$1(this, null), 3, null);
        return launch$default;
    }

    public final com.forsale.app.features.categories.listings.generalListings.b E() {
        return this.f30481y;
    }

    public final SearchFocusViewModel.b H() {
        SearchFocusViewModel.b bVar = this.S;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    public final StateFlow<PagingData<x9.b<?>>> I() {
        return this.N;
    }

    public final ListingsTypes K() {
        return this.F;
    }

    public final StateFlow<Integer> L() {
        return this.H;
    }

    public final List<MyListingsType> M() {
        return (List) this.Q.getValue();
    }

    public final int Q() {
        switch (a.f30486a[this.f30481y.f().ordinal()]) {
            case 1:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 2:
                return y0.f70539ka;
            case 3:
                return y0.f70641qa;
            case 4:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 5:
                return y0.f70459fe;
            case 6:
                return y0.f2if;
            case 7:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 8:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 9:
                return y0.f70722va;
            case 10:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 11:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 12:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 13:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            case 14:
                return y0.f70652r4;
            case 15:
                return y0.f70538k9;
            case 16:
                throw new NotImplementedError("An operation is not implemented: Add your title");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final StateFlow<MyListingsType> S() {
        return this.P;
    }

    public final StateFlow<Boolean> V() {
        return this.K;
    }

    public final void X() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$logUpButtonClicked$1(this, null), 3, null);
    }

    public final void Z() {
        c0();
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$onPullToRefresh$1(this, null), 3, null);
    }

    public final void a0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$recordScrolledListingsAnalytics$1(this, null), 3, null);
    }

    public final void c0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.L, null, new GeneralListingsViewModel$refresh$1(this, null), 2, null);
    }

    public final void d0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$refreshIfMyListingModified$1(this, null), 3, null);
    }

    public final void f0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$setMaxScrolledItem$1(i11, this, null), 3, null);
    }

    public final void g0(MyListingsType myListingsType) {
        o.i(myListingsType, "myListingsType");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$setSelectedFilter$1(this, myListingsType, null), 3, null);
    }

    public final void h0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new GeneralListingsViewModel$updateRefresh$1(this, z11, null), 3, null);
    }
}
