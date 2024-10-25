package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.home.homelandingscreen.a;
import com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsViewModel;
import com.forsale.app.features.categories.home.homelandingscreen.gam.GamBannerItemViewModel;
import com.forsale.app.features.categories.home.homelandingscreen.gam.GamMPUItemViewModel;
import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopBannerSliderViewModel;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel;
import com.forsale.app.features.powerpins.ListingsScreenType;
import com.forsale.app.ui.recyclerviewitems.horizontalChips.HorizontalChipsItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewPadding;
import com.forsale.app.utils.itemutils.ViewSpacing;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.l;
import j10.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.p0;
import t9.y0;
import wz.h;
import wz.p;
import yh.c;
/* compiled from: VerticalViewModel.kt */
/* loaded from: classes2.dex */
public final class VerticalViewModel extends BaseStatefulViewModel {
    private final CategoryEntity A0;
    private final b0<CategoryEntity> B0;
    private final LiveData<CategoryEntity> C0;
    private final MutableSharedFlow<p> D0;
    private final SharedFlow<p> E0;
    private final MutableSharedFlow<p> F0;
    private final SharedFlow<p> G0;
    private final MutableSharedFlow<p> H0;
    private final SharedFlow<p> I0;
    private final MutableSharedFlow<p> J0;
    private final SharedFlow<p> K0;
    private final MutableSharedFlow<p> L0;
    private final SharedFlow<p> M0;
    private final b0<RegionEntity> N0;
    private final b0<MasterDataMiscModel> O0;
    private final b0<List<x9.b<?>>> P0;
    private final Flow<String> Q0;
    private final MutableSharedFlow<CategoryEntity> R0;
    private final SharedFlow<CategoryEntity> S0;
    private final MutableSharedFlow<Integer> T0;
    private final SharedFlow<Integer> U0;
    private final MutableSharedFlow<PLFSource> V0;
    private final SharedFlow<PLFSource> W0;
    private final MutableSharedFlow<Integer> X0;
    private final SharedFlow<Integer> Y0;
    private final h Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final MutableStateFlow<List<CategoryEntity>> f23937a1;

    /* renamed from: b1  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f23938b1;

    /* renamed from: c1  reason: collision with root package name */
    private final LiveData<TextHolder> f23939c1;

    /* renamed from: d1  reason: collision with root package name */
    private final MutableSharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> f23940d1;

    /* renamed from: e1  reason: collision with root package name */
    private final SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> f23941e1;

    /* renamed from: f1  reason: collision with root package name */
    private final OneShotEventHandler<Pair<Integer, AdManagerAdRequest>> f23942f1;

    /* renamed from: g1  reason: collision with root package name */
    private final h f23943g1;

    /* renamed from: h1  reason: collision with root package name */
    private final b0<List<qc.b<?>>> f23944h1;

    /* renamed from: i1  reason: collision with root package name */
    private final b0<TextHolder> f23945i1;

    /* renamed from: j1  reason: collision with root package name */
    private final b0<TextHolder> f23946j1;

    /* renamed from: k1  reason: collision with root package name */
    private final b0<Boolean> f23947k1;

    /* renamed from: l0  reason: collision with root package name */
    private final VerticalRepository f23948l0;

    /* renamed from: l1  reason: collision with root package name */
    private final b0<List<qc.b<?>>> f23949l1;

    /* renamed from: m0  reason: collision with root package name */
    private final MasterDataRepository f23950m0;

    /* renamed from: m1  reason: collision with root package name */
    private final b0<TextHolder> f23951m1;

    /* renamed from: n0  reason: collision with root package name */
    private final GAMRepository f23952n0;

    /* renamed from: n1  reason: collision with root package name */
    private final b0<TextHolder> f23953n1;

    /* renamed from: o0  reason: collision with root package name */
    private final ApplicationResourcesRepository f23954o0;

    /* renamed from: o1  reason: collision with root package name */
    private final LiveData<Boolean> f23955o1;

    /* renamed from: p0  reason: collision with root package name */
    private final UserProfileInteractor f23956p0;

    /* renamed from: p1  reason: collision with root package name */
    private final b0<Boolean> f23957p1;

    /* renamed from: q0  reason: collision with root package name */
    private final k0 f23958q0;

    /* renamed from: q1  reason: collision with root package name */
    private final MutableSharedFlow<CategoryEntity> f23959q1;

    /* renamed from: r0  reason: collision with root package name */
    private final BaseRepository f23960r0;

    /* renamed from: s0  reason: collision with root package name */
    private final ListingsService f23961s0;

    /* renamed from: t0  reason: collision with root package name */
    private final CoroutineContext f23962t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<p> f23963u0;

    /* renamed from: v0  reason: collision with root package name */
    private final LiveData<Boolean> f23964v0;

    /* renamed from: w0  reason: collision with root package name */
    private final LiveData<Boolean> f23965w0;

    /* renamed from: x0  reason: collision with root package name */
    private final LiveData<Boolean> f23966x0;

    /* renamed from: y0  reason: collision with root package name */
    private final LiveData<Boolean> f23967y0;

    /* renamed from: z0  reason: collision with root package name */
    private final h f23968z0;

    /* compiled from: VerticalViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$1", f = "VerticalViewModel.kt", l = {147, 149}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23974a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f23974a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        VerticalViewModel.this.j1().postValue((MasterDataMiscModel) obj);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                RegionsRepository I = VerticalViewModel.this.I();
                this.f23974a = 1;
                obj = I.getCurrentRegion(this);
                if (obj == f11) {
                    return f11;
                }
            }
            VerticalViewModel.this.r1().postValue((RegionEntity) obj);
            MasterDataRepository masterDataRepository = VerticalViewModel.this.f23950m0;
            this.f23974a = 2;
            obj = masterDataRepository.getMasterDataMiscModel(this);
            if (obj == f11) {
                return f11;
            }
            VerticalViewModel.this.j1().postValue((MasterDataMiscModel) obj);
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: VerticalViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23976a;

        static {
            int[] iArr = new int[CategoryEntity.Classification.values().length];
            try {
                iArr[CategoryEntity.Classification.Services.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23976a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalViewModel f23977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, VerticalViewModel verticalViewModel) {
            super(key);
            this.f23977a = verticalViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b("XXX: HomeViewModel " + th2, new Object[0]);
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f23977a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f23977a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel(VerticalRepository verticalRepository, MasterDataRepository masterDataRepository, GAMRepository gamRepository, ApplicationResourcesRepository appRepo, UserProfileInteractor userInteractor, k0 savedStateHandle, BaseRepository baseRepository, ListingsService listingsService) {
        super(baseRepository);
        h a11;
        h a12;
        List n11;
        h a13;
        List n12;
        List n13;
        o.i(verticalRepository, "verticalRepository");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(gamRepository, "gamRepository");
        o.i(appRepo, "appRepo");
        o.i(userInteractor, "userInteractor");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        o.i(listingsService, "listingsService");
        this.f23948l0 = verticalRepository;
        this.f23950m0 = masterDataRepository;
        this.f23952n0 = gamRepository;
        this.f23954o0 = appRepo;
        this.f23956p0 = userInteractor;
        this.f23958q0 = savedStateHandle;
        this.f23960r0 = baseRepository;
        this.f23961s0 = listingsService;
        this.f23962t0 = super.getCoroutineContext().plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(new b(CoroutineExceptionHandler.Key, this));
        this.f23963u0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f23964v0 = Transformations.b(v0(), new l<ViewStates, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$showBlankScreen$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(ViewStates viewStates) {
                boolean z11;
                if (viewStates == ViewStates.INITIAL) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f23965w0 = Transformations.b(v0(), new l<ViewStates, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$showLoadingScreen$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(ViewStates viewStates) {
                boolean z11;
                if (viewStates == ViewStates.LOADING) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f23966x0 = Transformations.b(v0(), new l<ViewStates, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$showErrorScreen$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(ViewStates viewStates) {
                boolean z11;
                if (viewStates != ViewStates.ERROR && viewStates != ViewStates.CONNECTION_ERROR) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f23967y0 = Transformations.b(v0(), new l<ViewStates, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$showContentData$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(ViewStates viewStates) {
                boolean z11;
                if (viewStates == ViewStates.CONTENT) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        a11 = kotlin.d.a(new g00.a<HomeVisitedSources>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$source$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final HomeVisitedSources invoke() {
                k0 k0Var;
                a.C0265a c0265a = a.f24079d;
                k0Var = VerticalViewModel.this.f23958q0;
                return c0265a.b(k0Var).b();
            }
        });
        this.f23968z0 = a11;
        this.A0 = com.forsale.app.features.categories.home.homelandingscreen.a.f24079d.b(savedStateHandle).a();
        b0<CategoryEntity> b0Var = new b0<>();
        this.B0 = b0Var;
        this.C0 = b0Var;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.D0 = MutableSharedFlow$default;
        this.E0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.F0 = MutableSharedFlow$default2;
        this.G0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H0 = MutableSharedFlow$default3;
        this.I0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.J0 = MutableSharedFlow$default4;
        this.K0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.L0 = MutableSharedFlow$default5;
        this.M0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        this.N0 = new b0<>();
        this.O0 = new b0<>();
        this.P0 = new b0<>();
        final Flow<UserEntity> j11 = userInteractor.j();
        this.Q0 = new Flow<String>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f23970a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2", f = "VerticalViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f23971a;

                    /* renamed from: b  reason: collision with root package name */
                    int f23972b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f23971a = obj;
                        this.f23972b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f23970a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f23972b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f23972b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f23971a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f23972b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f23970a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getFirstName()
                        if (r5 != 0) goto L42
                    L40:
                        java.lang.String r5 = ""
                    L42:
                        r0.f23972b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        MutableSharedFlow<CategoryEntity> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.R0 = MutableSharedFlow$default6;
        this.S0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<Integer> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.T0 = MutableSharedFlow$default7;
        this.U0 = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        MutableSharedFlow<PLFSource> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.V0 = MutableSharedFlow$default8;
        this.W0 = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        MutableSharedFlow<Integer> MutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.X0 = MutableSharedFlow$default9;
        this.Y0 = FlowKt.asSharedFlow(MutableSharedFlow$default9);
        a12 = kotlin.d.a(new g00.a<b0<List<? extends bi.b<?>>>>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$subCategoriesEvent$2
            @Override // g00.a
            /* renamed from: invoke */
            public final b0<List<? extends bi.b<?>>> invoke2() {
                return new b0<>();
            }
        });
        this.Z0 = a12;
        n11 = r.n();
        this.f23937a1 = StateFlowKt.MutableStateFlow(n11);
        this.f23938b1 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f23939c1 = Transformations.b(b0Var, new l<CategoryEntity, TextHolder>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$subCategoryTitleTextHolder$1
            @Override // g00.l
            /* renamed from: b */
            public final TextHolder invoke(CategoryEntity it2) {
                List e11;
                o.i(it2, "it");
                Integer valueOf = Integer.valueOf(y0.f70653r5);
                e11 = q.e(it2.getName());
                return new TextHolder(valueOf, null, e11, 2, null);
            }
        });
        MutableSharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> MutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23940d1 = MutableSharedFlow$default10;
        this.f23941e1 = FlowKt.asSharedFlow(MutableSharedFlow$default10);
        v0().setValue(ViewStates.INITIAL);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        this.f23942f1 = new OneShotEventHandler<>(null, 0, 3, null);
        a13 = kotlin.d.a(new g00.a<AtomicBoolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$isLandingBannerShowing$2
            @Override // g00.a
            public final AtomicBoolean invoke() {
                return new AtomicBoolean(false);
            }
        });
        this.f23943g1 = a13;
        n12 = r.n();
        this.f23944h1 = new b0<>(n12);
        this.f23945i1 = new b0<>();
        this.f23946j1 = new b0<>();
        this.f23947k1 = new b0<>();
        n13 = r.n();
        b0<List<qc.b<?>>> b0Var2 = new b0<>(n13);
        this.f23949l1 = b0Var2;
        this.f23951m1 = new b0<>();
        this.f23953n1 = new b0<>();
        this.f23955o1 = Transformations.b(b0Var2, new l<List<qc.b<?>>, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$isHotZoneSubTitleVisible$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(List<qc.b<?>> list) {
                o.f(list);
                List<qc.b<?>> list2 = list;
                boolean z11 = true;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((qc.b) it2.next()) instanceof vc.b) {
                            z11 = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f23957p1 = new b0<>();
        this.f23959q1 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeVisitedSources B1() {
        return (HomeVisitedSources) this.f23968z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0<List<bi.b<?>>> C1() {
        return (b0) this.Z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomicBoolean F1() {
        return (AtomicBoolean) this.f23943g1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:3|(19:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(5:19|20|(1:22)|14|15))(7:23|24|25|20|(0)|14|15))(1:27))(2:47|(1:49)(1:50))|28|(1:30)(1:46)|31|(1:33)(1:45)|34|(1:36)(1:44)|37|(1:39)(1:43)|40|(1:42)|25|20|(0)|14|15))|55|6|7|(0)(0)|28|(0)(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|40|(0)|25|20|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        r15 = new com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$3(r14, r13, null);
        r0.f23988a = r13;
        r0.f23989b = null;
        r0.f23992e = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (com.forsale.app.utils.CoroutinesExtensionsKt.a(r13, r15, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G1(com.forsale.app.datalayer.database.CategoryEntity r13, boolean r14, zz.a<? super wz.p> r15) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.G1(com.forsale.app.datalayer.database.CategoryEntity, boolean, zz.a):java.lang.Object");
    }

    private final Deferred<Throwable> H1(int i11, boolean z11) {
        Deferred<Throwable> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new VerticalViewModel$loadHotZoneAsync$1(z11, this, i11, null), 3, null);
        return async$default;
    }

    private final Deferred<Throwable> J1(int i11, boolean z11) {
        Deferred<Throwable> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new VerticalViewModel$loadNewArrivalsAsync$1(z11, this, i11, null), 3, null);
        return async$default;
    }

    private final Deferred<Throwable> K1(CategoryEntity categoryEntity, boolean z11) {
        Deferred<Throwable> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new VerticalViewModel$loadSubCategoriesAsync$1(z11, this, categoryEntity, null), 3, null);
        return async$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<yh.b> N1(List<CategoryEntity> list) {
        int y11;
        List<CategoryEntity> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (final CategoryEntity categoryEntity : list2) {
            arrayList.add(new yh.b(new c(categoryEntity.getId(), new c.a(categoryEntity.getNameAr(), categoryEntity.getNameEn()), categoryEntity.getImage(), null, 8, null), new gj.a(Integer.valueOf(p0.f69703c), null, Integer.valueOf(p0.f69708h), Integer.valueOf(p0.f69703c), 2, null), new g00.a<p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$mapToChipItemViewModel$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    VerticalViewModel.this.S1(categoryEntity, SubCategoriesPosition.EXPLORE_VERTICAL);
                }
            }));
        }
        return arrayList;
    }

    private final qc.b<?> O1(ListingItemBrief listingItemBrief) {
        return new rc.a(listingItemBrief, new g00.p<ListingItemBrief, List<? extends Object>, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$mapToCommercialListingItemViewModel$1
            public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                b(listingItemBrief2, list);
                return p.f75480a;
            }
        }, this.B0.getValue(), new l<Integer, ListingItemDetails>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$mapToCommercialListingItemViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final ListingItemDetails b(int i11) {
                ListingItemDetails i12;
                i12 = VerticalViewModel.this.i1(i11);
                return i12;
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ ListingItemDetails invoke(Integer num) {
                return b(num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qc.b<?> P1(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, boolean z11, ListingsTypes listingsTypes) {
        List n11;
        b0<RegionEntity> b0Var = this.N0;
        b0<MasterDataMiscModel> b0Var2 = this.O0;
        ApplicationResourcesRepository applicationResourcesRepository = this.f23954o0;
        int i11 = p0.f69711k;
        String value = AnalyticsDetailsSource.Companion.a(listingsTypes).getValue();
        n11 = r.n();
        return new zc.b(listingItemBrief, listingsSettings, b0Var, b0Var2, applicationResourcesRepository, new g00.p<ListingItemBrief, List<? extends Object>, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$mapToHalfScreenListingItemViewModel$1
            public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list) {
                b(listingItemBrief2, list);
                return p.f75480a;
            }
        }, Integer.valueOf(i11), null, value, z11, false, null, 0, this, n11, 7296, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qc.b<? extends Object> Q1(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, boolean z11, ListingsTypes listingsTypes) {
        if (z11) {
            return O1(listingItemBrief);
        }
        return P1(listingItemBrief, listingsSettings, false, listingsTypes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(CategoryEntity categoryEntity, SubCategoriesPosition subCategoriesPosition) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new VerticalViewModel$openSubCategory$1(categoryEntity, this, subCategoriesPosition, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(CategoryEntity categoryEntity) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new VerticalViewModel$recordHomeVisited$1(this, categoryEntity, null), 3, null);
    }

    private static final void V1(List<x9.b<?>> list, CategoryEntity categoryEntity, mi.b bVar, List<? extends qc.b<?>> list2, TopBannerSliderViewModel topBannerSliderViewModel, CommercialAdsViewModel commercialAdsViewModel, GamBannerItemViewModel gamBannerItemViewModel, List<? extends qc.b<?>> list3, GamMPUItemViewModel gamMPUItemViewModel, List<? extends bi.b<?>> list4) {
        if (a.f23976a[categoryEntity.getClassification().ordinal()] == 1) {
            list.add(bVar);
            list.addAll(list2);
            list.add(topBannerSliderViewModel);
            list.add(commercialAdsViewModel);
            list.add(gamBannerItemViewModel);
            list.addAll(list3);
            list.add(gamMPUItemViewModel);
            return;
        }
        list.add(topBannerSliderViewModel);
        list.addAll(list2);
        list.addAll(list4);
        list.add(commercialAdsViewModel);
        list.add(gamBannerItemViewModel);
        list.addAll(list3);
        list.add(gamMPUItemViewModel);
    }

    public static /* synthetic */ void f1(VerticalViewModel verticalViewModel, boolean z11, CategoryEntity categoryEntity, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            categoryEntity = null;
        }
        verticalViewModel.e1(z11, categoryEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingItemDetails i1(int i11) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new VerticalViewModel$getItemDetails$1(this, i11, null), 1, null);
        return (ListingItemDetails) runBlocking$default;
    }

    public final LiveData<Boolean> A1() {
        return this.f23965w0;
    }

    public final MutableSharedFlow<p> D1() {
        return this.J0;
    }

    public final MutableSharedFlow<p> E1() {
        return this.D0;
    }

    public final void I1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new VerticalViewModel$loadInterstitials$1(this, null), 3, null);
    }

    public final void R1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new VerticalViewModel$mimicLandingBannerHide$1(this, null), 3, null);
    }

    public final void U1(CategoryEntity categoryEntity) {
        o.i(categoryEntity, "categoryEntity");
        GamBannerItemViewModel gamBannerItemViewModel = new GamBannerItemViewModel(this.C0, this.f23952n0, 0, null, 12, null);
        List b11 = HorizontalChipsItemViewModel.a.b(HorizontalChipsItemViewModel.f39457h, this.f23939c1, C1(), this.f23963u0, 2, null, new ViewMargins(Integer.valueOf(p0.f69704d), null, Integer.valueOf(p0.f69713m), null, 10, null), 16, null);
        mi.b bVar = new mi.b(new mi.a(this.f23937a1, this.f23938b1), new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$subCatCompose$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryEntity it2) {
                o.i(it2, "it");
                VerticalViewModel.this.S1(it2, SubCategoriesPosition.EXPLORE_VERTICAL);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity2) {
                b(categoryEntity2);
                return p.f75480a;
            }
        });
        HorizontalListingsItemViewModel.Companion companion = HorizontalListingsItemViewModel.f30736y;
        List d11 = HorizontalListingsItemViewModel.Companion.d(companion, this.f23945i1, this.f23946j1, this.f23944h1, this.f23947k1, gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$newArrivals$1
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.c(new ViewMargins(Integer.valueOf(p0.f69704d), null, Integer.valueOf(p0.f69713m), null, 10, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        }), new bd.b(new l<Integer, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$newArrivals$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(int i11) {
                VerticalRepository verticalRepository;
                b0 b0Var;
                Integer num;
                b0 b0Var2;
                verticalRepository = VerticalViewModel.this.f23948l0;
                ListingsScreenType listingsScreenType = ListingsScreenType.NEW_ARRIVALS;
                b0Var = VerticalViewModel.this.f23944h1;
                List list = (List) b0Var.getValue();
                Integer num2 = null;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                b0Var2 = VerticalViewModel.this.f23944h1;
                List list2 = (List) b0Var2.getValue();
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof zc.d) {
                            arrayList.add(obj);
                        }
                    }
                    num2 = Integer.valueOf(arrayList.size());
                }
                verticalRepository.f(listingsScreenType, i11, num, num2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num.intValue());
                return p.f75480a;
            }
        }), 0, gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$newArrivals$2
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.d(new ViewPadding(Integer.valueOf(e.f60103b), null, null, null, 14, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        }), 64, null);
        b0<TextHolder> b0Var = this.f23951m1;
        b0<TextHolder> b0Var2 = this.f23953n1;
        b0<List<qc.b<?>>> b0Var3 = this.f23949l1;
        LiveData<Boolean> liveData = this.f23955o1;
        b0<Boolean> b0Var4 = this.f23957p1;
        ViewSpacing a11 = gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$1
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                int i11 = p0.f69704d;
                viewSpacing.c(new ViewMargins(Integer.valueOf(i11), Integer.valueOf(i11), Integer.valueOf(i11), null, 8, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        });
        ViewSpacing a12 = gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$2
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.d(new ViewPadding(Integer.valueOf(e.f60103b), null, null, null, 14, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        });
        ViewSpacing a13 = gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$3
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.c(new ViewMargins(Integer.valueOf(p0.f69704d), Integer.valueOf(p0.f69704d), Integer.valueOf(p0.f69713m), null, 8, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        });
        List f11 = HorizontalListingsItemViewModel.Companion.f(companion, b0Var, b0Var2, b0Var3, liveData, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b0 b0Var5;
                VerticalRepository verticalRepository;
                b0Var5 = VerticalViewModel.this.B0;
                CategoryEntity categoryEntity2 = (CategoryEntity) b0Var5.getValue();
                if (categoryEntity2 != null) {
                    VerticalViewModel verticalViewModel = VerticalViewModel.this;
                    BuildersKt__Builders_commonKt.launch$default(verticalViewModel, null, null, new VerticalViewModel$setHomeSectionsViewModels$hotZones$5$1$1(verticalViewModel, categoryEntity2, null), 3, null);
                }
                verticalRepository = VerticalViewModel.this.f23948l0;
                verticalRepository.g();
            }
        }, b0Var4, a11, new bd.b(new l<Integer, p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$setHomeSectionsViewModels$hotZones$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(int i11) {
                VerticalRepository verticalRepository;
                b0 b0Var5;
                Integer num;
                b0 b0Var6;
                verticalRepository = VerticalViewModel.this.f23948l0;
                ListingsScreenType listingsScreenType = ListingsScreenType.HOT_ZONE;
                b0Var5 = VerticalViewModel.this.f23949l1;
                List list = (List) b0Var5.getValue();
                Integer num2 = null;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                b0Var6 = VerticalViewModel.this.f23949l1;
                List list2 = (List) b0Var6.getValue();
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof zc.d) {
                            arrayList.add(obj);
                        }
                    }
                    num2 = Integer.valueOf(arrayList.size());
                }
                verticalRepository.f(listingsScreenType, i11, num, num2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num.intValue());
                return p.f75480a;
            }
        }), 0, a12, a13, 256, null);
        TopBannerSliderViewModel topBannerSliderViewModel = new TopBannerSliderViewModel(this.C0, this.f23952n0, 0, null, 12, null);
        CommercialAdsViewModel commercialAdsViewModel = new CommercialAdsViewModel(this.C0, this.f23952n0, this.f23963u0, 0, null, 24, null);
        GamMPUItemViewModel gamMPUItemViewModel = new GamMPUItemViewModel(this.C0, this.f23952n0, 0, null, 12, null);
        ArrayList arrayList = new ArrayList();
        V1(arrayList, categoryEntity, bVar, f11, topBannerSliderViewModel, commercialAdsViewModel, gamBannerItemViewModel, d11, gamMPUItemViewModel, b11);
        this.P0.postValue(arrayList);
    }

    public final void e1(boolean z11, CategoryEntity categoryEntity) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new VerticalViewModel$fetchHomeScreenData$1(categoryEntity, this, z11, null), 3, null);
    }

    public final LiveData<CategoryEntity> g1() {
        return this.C0;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f23962t0;
    }

    public final b0<TextHolder> h1() {
        return this.f23951m1;
    }

    public final b0<MasterDataMiscModel> j1() {
        return this.O0;
    }

    public final SharedFlow<p> k1() {
        return this.M0;
    }

    public final SharedFlow<p> l1() {
        return this.G0;
    }

    public final SharedFlow<p> m1() {
        return this.E0;
    }

    public final SharedFlow<CategoryEntity> n1() {
        return this.S0;
    }

    public final SharedFlow<Integer> o1() {
        return this.U0;
    }

    public final SharedFlow<PLFSource> p1() {
        return this.W0;
    }

    public final SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> q1() {
        return this.f23941e1;
    }

    public final b0<RegionEntity> r1() {
        return this.N0;
    }

    public final b0<List<x9.b<?>>> s1() {
        return this.P0;
    }

    public final OneShotEventHandler<p> t1() {
        return this.f23963u0;
    }

    public final SharedFlow<Integer> u1() {
        return this.Y0;
    }

    public final LiveData<Boolean> v1() {
        return this.f23964v0;
    }

    public final LiveData<Boolean> w1() {
        return this.f23967y0;
    }

    public final LiveData<Boolean> x1() {
        return this.f23966x0;
    }

    public final OneShotEventHandler<Pair<Integer, AdManagerAdRequest>> y1() {
        return this.f23942f1;
    }

    public final SharedFlow<p> z1() {
        return this.I0;
    }
}
