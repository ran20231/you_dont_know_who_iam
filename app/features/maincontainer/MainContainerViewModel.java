package com.forsale.app.features.maincontainer;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.BottomTipEntity;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.BottomTipRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.PostAdAnonymousRepository;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.ui.customtooltip.CustomToolTips;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.SearchLocation;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: MainContainerViewModel.kt */
/* loaded from: classes2.dex */
public final class MainContainerViewModel extends BaseStatefulViewModel {
    private final MutableStateFlow<UserEntity> A0;
    private final StateFlow<UserEntity> B0;
    private final MutableStateFlow<Integer> C0;
    private final StateFlow<Integer> D0;
    private final MutableStateFlow<Boolean> E0;
    private final StateFlow<Boolean> F0;
    private final MutableStateFlow<Boolean> G0;
    private final StateFlow<Boolean> H0;
    private final MutableStateFlow<Boolean> I0;
    private final StateFlow<Boolean> J0;
    private final b0<Boolean> K0;
    private final LiveData<Boolean> L0;
    private final b0<Boolean> M0;
    private final LiveData<Boolean> N0;
    private final MutableSharedFlow<p> O0;
    private final SharedFlow<p> P0;
    private final MutableSharedFlow<p> Q0;
    private final SharedFlow<p> R0;
    private final wz.h S0;
    private final wz.h T0;
    private final wz.h U0;
    private final OneShotEventHandler<Pair<CategoryEntity, SubCategoriesPosition>> V0;
    private final MutableSharedFlow<p> W0;
    private final SharedFlow<p> X0;
    private final MutableSharedFlow<String> Y0;
    private final SharedFlow<String> Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31450a1;

    /* renamed from: b1  reason: collision with root package name */
    private final StateFlow<Boolean> f31451b1;

    /* renamed from: c1  reason: collision with root package name */
    private final MutableStateFlow<SearchSource> f31452c1;

    /* renamed from: d1  reason: collision with root package name */
    private final StateFlow<SearchSource> f31453d1;

    /* renamed from: e1  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31454e1;

    /* renamed from: f1  reason: collision with root package name */
    private final StateFlow<Boolean> f31455f1;

    /* renamed from: g1  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31456g1;

    /* renamed from: h1  reason: collision with root package name */
    private final StateFlow<Boolean> f31457h1;

    /* renamed from: i1  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31458i1;

    /* renamed from: j1  reason: collision with root package name */
    private final OneShotEventHandler<Pair<String, AdManagerAdRequest>> f31459j1;

    /* renamed from: k1  reason: collision with root package name */
    private final wz.h f31460k1;

    /* renamed from: l0  reason: collision with root package name */
    private final BottomTipRepository f31461l0;

    /* renamed from: m0  reason: collision with root package name */
    private final GAMRepository f31462m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ListingsService f31463n0;

    /* renamed from: o0  reason: collision with root package name */
    private final UserProfileInteractor f31464o0;

    /* renamed from: p0  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f31465p0;

    /* renamed from: q0  reason: collision with root package name */
    private final jj.b f31466q0;

    /* renamed from: r0  reason: collision with root package name */
    private final b0<Boolean> f31467r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31468s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<HomeToolbars> f31469t0;

    /* renamed from: u0  reason: collision with root package name */
    private final AtomicBoolean f31470u0;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<Pair<CustomToolTips, Integer>> f31471v0;

    /* renamed from: w0  reason: collision with root package name */
    private final AtomicReference<HomeTabs> f31472w0;

    /* renamed from: x0  reason: collision with root package name */
    private final AtomicReference<SessionEntity.Greeting> f31473x0;

    /* renamed from: y0  reason: collision with root package name */
    private final Flow<UserEntity> f31474y0;

    /* renamed from: z0  reason: collision with root package name */
    private final StateFlow<UserStatus> f31475z0;

    /* compiled from: MainContainerViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$1", f = "MainContainerViewModel.kt", l = {158, 159}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.maincontainer.MainContainerViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAnonymousRepository f31485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainContainerViewModel f31486c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainContainerViewModel.kt */
        /* renamed from: com.forsale.app.features.maincontainer.MainContainerViewModel$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MainContainerViewModel f31487a;

            a(MainContainerViewModel mainContainerViewModel) {
                this.f31487a = mainContainerViewModel;
            }

            public final Object a(boolean z11, zz.a<? super p> aVar) {
                Object f11;
                if (z11) {
                    Object T1 = this.f31487a.T1(aVar);
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    if (T1 == f11) {
                        return T1;
                    }
                    return p.f75480a;
                }
                return p.f75480a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, zz.a aVar) {
                return a(bool.booleanValue(), aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAnonymousRepository postAdAnonymousRepository, MainContainerViewModel mainContainerViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31485b = postAdAnonymousRepository;
            this.f31486c = mainContainerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f31485b, this.f31486c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f31484a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    throw new KotlinNothingValueException();
                }
                kotlin.f.b(obj);
            } else {
                kotlin.f.b(obj);
                PostAdAnonymousRepository postAdAnonymousRepository = this.f31485b;
                this.f31484a = 1;
                if (postAdAnonymousRepository.setPostAddAnonymous(false, this) == f11) {
                    return f11;
                }
            }
            MutableStateFlow mutableStateFlow = this.f31486c.f31458i1;
            a aVar = new a(this.f31486c);
            this.f31484a = 2;
            if (mutableStateFlow.collect(aVar, this) == f11) {
                return f11;
            }
            throw new KotlinNothingValueException();
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: MainContainerViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31488a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f31489b;

        static {
            int[] iArr = new int[SessionEntity.LandingPage.values().length];
            try {
                iArr[SessionEntity.LandingPage.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionEntity.LandingPage.COMMERCIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31488a = iArr;
            int[] iArr2 = new int[UserStatus.values().length];
            try {
                iArr2[UserStatus.LoggedIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserStatus.NotLoggedIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserStatus.CompletelyBlocked.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f31489b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel(PostAdAnonymousRepository postAdAnonymousRepository, BottomTipRepository bottomTipRepository, GAMRepository gamRepository, ListingsService listingsService, UserProfileInteractor userProfileInteractor, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        o.i(postAdAnonymousRepository, "postAdAnonymousRepository");
        o.i(bottomTipRepository, "bottomTipRepository");
        o.i(gamRepository, "gamRepository");
        o.i(listingsService, "listingsService");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f31461l0 = bottomTipRepository;
        this.f31462m0 = gamRepository;
        this.f31463n0 = listingsService;
        this.f31464o0 = userProfileInteractor;
        this.f31465p0 = userLoginAuthoritiesInteractor;
        this.f31466q0 = prefs;
        Boolean bool = Boolean.FALSE;
        this.f31467r0 = new b0<>(bool);
        this.f31468s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31469t0 = new OneShotEventHandler<>(null, 0, 3, null);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f31470u0 = atomicBoolean;
        this.f31471v0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31472w0 = new AtomicReference<>(HomeTabs.INDEX_HOME);
        this.f31473x0 = new AtomicReference<>(null);
        final Flow<UserEntity> j11 = userProfileInteractor.j();
        this.f31474y0 = j11;
        this.f31475z0 = FlowKt.stateIn(new Flow<UserStatus>() { // from class: com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f31478a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MainContainerViewModel f31479b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2", f = "MainContainerViewModel.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f31480a;

                    /* renamed from: b  reason: collision with root package name */
                    int f31481b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f31482c;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f31480a = obj;
                        this.f31481b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, MainContainerViewModel mainContainerViewModel) {
                    this.f31478a = flowCollector;
                    this.f31479b = mainContainerViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.a r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f31481b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f31481b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f31480a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f31481b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L71
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f31482c
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.f.b(r8)
                        goto L65
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f31478a
                        com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
                        com.forsale.app.features.maincontainer.MainContainerViewModel r2 = r6.f31479b
                        com.forsale.app.utils.facades.user.UserProfileInteractor r2 = com.forsale.app.features.maincontainer.MainContainerViewModel.z0(r2)
                        if (r7 == 0) goto L56
                        java.lang.Integer r7 = r7.isBlock()
                        if (r7 == 0) goto L56
                        int r7 = r7.intValue()
                        goto L57
                    L56:
                        r7 = 0
                    L57:
                        r0.f31482c = r8
                        r0.f31481b = r4
                        java.lang.Object r7 = r2.q(r7, r0)
                        if (r7 != r1) goto L62
                        return r1
                    L62:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L65:
                        r2 = 0
                        r0.f31482c = r2
                        r0.f31481b = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L71
                        return r1
                    L71:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserStatus> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), SharingStarted.Companion.getEagerly(), UserStatus.NotLoggedIn);
        MutableStateFlow<UserEntity> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.A0 = MutableStateFlow;
        this.B0 = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.C0 = MutableStateFlow2;
        this.D0 = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.E0 = MutableStateFlow3;
        this.F0 = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.G0 = MutableStateFlow4;
        this.H0 = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.I0 = MutableStateFlow5;
        this.J0 = MutableStateFlow5;
        b0<Boolean> b0Var = new b0<>(bool);
        this.K0 = b0Var;
        this.L0 = b0Var;
        b0<Boolean> b0Var2 = new b0<>(bool);
        this.M0 = b0Var2;
        this.N0 = b0Var2;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.O0 = MutableSharedFlow$default;
        this.P0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Q0 = MutableSharedFlow$default2;
        this.R0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        a11 = kotlin.d.a(new g00.a<AtomicReference<Job>>() { // from class: com.forsale.app.features.maincontainer.MainContainerViewModel$bottomTipJob$2
            @Override // g00.a
            /* renamed from: b */
            public final AtomicReference<Job> invoke() {
                return new AtomicReference<>();
            }
        });
        this.S0 = a11;
        a12 = kotlin.d.a(new g00.a<AtomicReference<BottomTipEntity>>() { // from class: com.forsale.app.features.maincontainer.MainContainerViewModel$bottomTipCandidate$2
            @Override // g00.a
            /* renamed from: b */
            public final AtomicReference<BottomTipEntity> invoke() {
                return new AtomicReference<>();
            }
        });
        this.T0 = a12;
        a13 = kotlin.d.a(new g00.a<OneShotEventHandler<CategoryEntity>>() { // from class: com.forsale.app.features.maincontainer.MainContainerViewModel$openVerticalCategoryEvent$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final OneShotEventHandler<CategoryEntity> invoke() {
                return new OneShotEventHandler<>(null, 0, 3, null);
            }
        });
        this.U0 = a13;
        this.V0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.W0 = MutableSharedFlow$default3;
        this.X0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<String> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Y0 = MutableSharedFlow$default4;
        this.Z0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this.f31450a1 = MutableStateFlow6;
        this.f31451b1 = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<SearchSource> MutableStateFlow7 = StateFlowKt.MutableStateFlow(SearchSource.NONE);
        this.f31452c1 = MutableStateFlow7;
        this.f31453d1 = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(bool);
        this.f31454e1 = MutableStateFlow8;
        this.f31455f1 = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool);
        this.f31456g1 = MutableStateFlow9;
        this.f31457h1 = FlowKt.asStateFlow(MutableStateFlow9);
        this.f31458i1 = StateFlowKt.MutableStateFlow(bool);
        atomicBoolean.set(false);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(postAdAnonymousRepository, this, null), 3, null);
        this.f31459j1 = new OneShotEventHandler<>(null, 0, 3, null);
        a14 = kotlin.d.a(new g00.a<com.google.gson.d>() { // from class: com.forsale.app.features.maincontainer.MainContainerViewModel$gson$2
            @Override // g00.a
            /* renamed from: b */
            public final com.google.gson.d invoke() {
                return new com.google.gson.d();
            }
        });
        this.f31460k1 = a14;
    }

    private final HomeToolbars D1(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z40;
        boolean z41 = false;
        if (i11 == t9.r0.W5 || i11 == t9.r0.N5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || i11 == t9.r0.N0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || i11 == t9.r0.f70153yb) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || i11 == t9.r0.C0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || i11 == t9.r0.f70122w6) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15 || i11 == t9.r0.E6) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 || i11 == t9.r0.f69832a2) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17 || i11 == t9.r0.f69992m6) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18 || i11 == t9.r0.f70010nb) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19 || i11 == t9.r0.f70118w2) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z21 || i11 == t9.r0.F8) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z22 || i11 == t9.r0.f70062rb) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z23 || i11 == t9.r0.O2) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z24 || i11 == t9.r0.N2) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z25 || i11 == t9.r0.f69923h2) {
            z26 = true;
        } else {
            z26 = false;
        }
        if (z26 || i11 == t9.r0.f69963k3) {
            z27 = true;
        } else {
            z27 = false;
        }
        if (z27) {
            return HomeToolbars.NONE;
        }
        int i12 = t9.r0.Z5;
        if (i11 == i12 || i11 == t9.r0.X5) {
            z28 = true;
        } else {
            z28 = false;
        }
        if (z28 || i11 == t9.r0.A3) {
            z29 = true;
        } else {
            z29 = false;
        }
        if (z29) {
            return HomeToolbars.NONE;
        }
        if (i11 == i12 || i11 == t9.r0.Z1) {
            z31 = true;
        } else {
            z31 = false;
        }
        if (z31 || i11 == t9.r0.f69860c4) {
            z32 = true;
        } else {
            z32 = false;
        }
        if (z32) {
            return HomeToolbars.SUB_CATEGORY_TOOLBAR;
        }
        if (i11 == t9.r0.G8 || i11 == t9.r0.P5) {
            z33 = true;
        } else {
            z33 = false;
        }
        if (z33 || i11 == t9.r0.f70049qb) {
            z34 = true;
        } else {
            z34 = false;
        }
        if (z34 || i11 == t9.r0.K6) {
            z35 = true;
        } else {
            z35 = false;
        }
        if (z35 || i11 == t9.r0.f69982l9) {
            z36 = true;
        } else {
            z36 = false;
        }
        if (z36 || i11 == t9.r0.Y1) {
            z37 = true;
        } else {
            z37 = false;
        }
        if (z37 || i11 == t9.r0.B3) {
            z38 = true;
        } else {
            z38 = false;
        }
        if (z38 || i11 == t9.r0.f70057r6) {
            z39 = true;
        } else {
            z39 = false;
        }
        if (z39 || i11 == t9.r0.K0) {
            z40 = true;
        } else {
            z40 = false;
        }
        if (z40 || i11 == t9.r0.I0) {
            z41 = true;
        }
        if (z41) {
            return HomeToolbars.SEARCH_TOOLBAR;
        }
        return HomeToolbars.MAIN_TOOLBAR;
    }

    private final HomeToolbars E1(int i11) {
        return null;
    }

    private final void G1(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$setDefaultSearchBarText$1(i11, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(CustomToolTips customToolTips, int i11) {
        this.f31471v0.i(new Pair<>(customToolTips, Integer.valueOf(i11)));
    }

    private final HomeTabs P0(SessionEntity.LandingPage landingPage) {
        int i11;
        if (landingPage == null) {
            i11 = -1;
        } else {
            i11 = a.f31488a[landingPage.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return HomeTabs.INDEX_HOME;
            }
            return HomeTabs.INDEX_OFFERS;
        }
        return HomeTabs.INDEX_HOME;
    }

    private final void Q0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$decideBackIconVisibility$1(this, i11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MainContainerViewModel$updateBadge$1(this, null), 3, null);
    }

    private final void R0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$decideBadgeVisibility$1(i11, this, null), 3, null);
    }

    private final void R1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$updateLanguage$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T1(zz.a<? super p> aVar) {
        Object f11;
        Object collectLatest = FlowKt.collectLatest(this.f31474y0, new MainContainerViewModel$updateUser$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (collectLatest == f11) {
            return collectLatest;
        }
        return p.f75480a;
    }

    private final void U0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$decideSearchBarElevation$1(this, i11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U1(com.forsale.app.datalayer.database.UserEntity r9, zz.a<? super wz.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.maincontainer.MainContainerViewModel$updateUserStatus$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.maincontainer.MainContainerViewModel$updateUserStatus$1 r0 = (com.forsale.app.features.maincontainer.MainContainerViewModel$updateUserStatus$1) r0
            int r1 = r0.f31546d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31546d = r1
            goto L18
        L13:
            com.forsale.app.features.maincontainer.MainContainerViewModel$updateUserStatus$1 r0 = new com.forsale.app.features.maincontainer.MainContainerViewModel$updateUserStatus$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31544b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31546d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L33
        L2e:
            kotlin.f.b(r10)
            goto Lbb
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.f31543a
            com.forsale.app.features.maincontainer.MainContainerViewModel r9 = (com.forsale.app.features.maincontainer.MainContainerViewModel) r9
            kotlin.f.b(r10)
            goto L52
        L43:
            kotlin.f.b(r10)
            r0.f31543a = r8
            r0.f31546d = r6
            java.lang.Object r10 = r8.q1(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            r9 = r8
        L52:
            r2 = r10
            com.forsale.app.features.auth.UserStatus r2 = (com.forsale.app.features.auth.UserStatus) r2
            int[] r7 = com.forsale.app.features.maincontainer.MainContainerViewModel.a.f31489b
            int r2 = r2.ordinal()
            r2 = r7[r2]
            r7 = 0
            if (r2 == r6) goto L9e
            if (r2 == r5) goto L7f
            if (r2 == r4) goto L6e
            androidx.lifecycle.b0<java.lang.Boolean> r9 = r9.f31467r0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r7)
            r9.postValue(r10)
            goto Lbb
        L6e:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r9 = r9.I0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r6)
            r0.f31543a = r10
            r0.f31546d = r3
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto Lbb
            return r1
        L7f:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.f31470u0
            r2.set(r7)
            androidx.lifecycle.b0<java.lang.Boolean> r2 = r9.f31467r0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r7)
            r2.postValue(r3)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r9 = r9.I0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r7)
            r0.f31543a = r10
            r0.f31546d = r4
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto Lbb
            return r1
        L9e:
            androidx.lifecycle.b0<java.lang.Boolean> r2 = r9.f31467r0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r6)
            r2.postValue(r3)
            r9.R1()
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r9 = r9.I0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r7)
            r0.f31543a = r10
            r0.f31546d = r5
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto Lbb
            return r1
        Lbb:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel.U1(com.forsale.app.datalayer.database.UserEntity, zz.a):java.lang.Object");
    }

    private final void V0(HomeToolbars homeToolbars) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MainContainerViewModel$decideToolbarVisibility$1(homeToolbars, this, null), 3, null);
    }

    private final boolean W0(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28 = false;
        if (i11 == t9.r0.N5 || i11 == t9.r0.N0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || i11 == t9.r0.f70153yb) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || i11 == t9.r0.Z1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || i11 == t9.r0.C0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || i11 == t9.r0.f70118w2) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15 || i11 == t9.r0.f70122w6) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16 || i11 == t9.r0.E6) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17 || i11 == t9.r0.f69832a2) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18 || i11 == t9.r0.f70010nb) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19 || i11 == t9.r0.Z5) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z21 || i11 == t9.r0.f70135x6) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z22 || i11 == t9.r0.f69948j1) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z23 || i11 == t9.r0.f70109v6) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z24 || i11 == t9.r0.F0) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z25 || i11 == t9.r0.E0) {
            z26 = true;
        } else {
            z26 = false;
        }
        if (z26 || i11 == t9.r0.f69860c4) {
            z27 = true;
        } else {
            z27 = false;
        }
        if (z27 || i11 == t9.r0.F8) {
            z28 = true;
        }
        return !z28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomicReference<BottomTipEntity> Y0() {
        return (AtomicReference) this.T0.getValue();
    }

    private final AtomicReference<Job> Z0() {
        return (AtomicReference) this.S0.getValue();
    }

    private final SessionEntity.Greeting b1(SessionEntity.Greeting greeting, boolean z11) {
        if (greeting == null || z11) {
            return null;
        }
        return greeting;
    }

    private final Object q1(UserEntity userEntity, zz.a<? super UserStatus> aVar) {
        int i11;
        Integer isBlock;
        UserProfileInteractor userProfileInteractor = this.f31464o0;
        if (userEntity != null && (isBlock = userEntity.isBlock()) != null) {
            i11 = isBlock.intValue();
        } else {
            i11 = 0;
        }
        return userProfileInteractor.q(i11, aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|20))(2:21|22))(4:45|46|47|(1:49)(1:50))|23|(1:25)(1:44)|(1:27)(1:43)|28|(4:30|(1:32)(1:38)|33|(1:35)(2:36|37))|39|(1:41)(1:42)))|57|6|7|(0)(0)|23|(0)(0)|(0)(0)|28|(0)|39|(0)(0)|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:17:0x0042, B:20:0x004b, B:27:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0091, B:40:0x0096, B:39:0x0094, B:44:0x009f), top: B:54:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(int r17, zz.a<? super com.forsale.adserver.view.models.AdsModel> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.forsale.app.features.maincontainer.MainContainerViewModel$loadAdv$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.features.maincontainer.MainContainerViewModel$loadAdv$1 r2 = (com.forsale.app.features.maincontainer.MainContainerViewModel$loadAdv$1) r2
            int r3 = r2.f31517d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31517d = r3
            goto L1c
        L17:
            com.forsale.app.features.maincontainer.MainContainerViewModel$loadAdv$1 r2 = new com.forsale.app.features.maincontainer.MainContainerViewModel$loadAdv$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f31515b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f31517d
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L4f
            if (r4 == r8) goto L47
            if (r4 == r7) goto L3e
            if (r4 != r6) goto L36
            kotlin.f.b(r1)
            goto Lbe
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            java.lang.Object r4 = r2.f31514a
            com.forsale.app.features.maincontainer.MainContainerViewModel r4 = (com.forsale.app.features.maincontainer.MainContainerViewModel) r4
            kotlin.f.b(r1)     // Catch: java.lang.Exception -> Laf
            goto Lc5
        L47:
            java.lang.Object r4 = r2.f31514a
            com.forsale.app.features.maincontainer.MainContainerViewModel r4 = (com.forsale.app.features.maincontainer.MainContainerViewModel) r4
            kotlin.f.b(r1)     // Catch: java.lang.Exception -> Laf
            goto L76
        L4f:
            kotlin.f.b(r1)
            com.forsale.app.datalayer.network.services.ListingsService r1 = r0.f31463n0     // Catch: java.lang.Exception -> Lae
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody$Companion r10 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion     // Catch: java.lang.Exception -> Lae
            com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$AdvId r11 = new com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType$AdvId     // Catch: java.lang.Exception -> Lae
            r4 = r17
            r11.<init>(r4)     // Catch: java.lang.Exception -> Lae
            com.forsale.app.utils.LocaleManager r4 = com.forsale.app.utils.LocaleManager.f39597a     // Catch: java.lang.Exception -> Lae
            com.forsale.app.utils.Languages r12 = r4.g()     // Catch: java.lang.Exception -> Lae
            r13 = 0
            r14 = 4
            r15 = 0
            com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody r4 = com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody.Companion.createListingDetails$default(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> Lae
            r2.f31514a = r0     // Catch: java.lang.Exception -> Lae
            r2.f31517d = r8     // Catch: java.lang.Exception -> Lae
            java.lang.Object r1 = r1.getListingDetails(r4, r2)     // Catch: java.lang.Exception -> Lae
            if (r1 != r3) goto L75
            return r3
        L75:
            r4 = r0
        L76:
            r10 = r1
            com.forsale.app.datalayer.network.responses.ListingItemDetails r10 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r10     // Catch: java.lang.Exception -> Laf
            int r10 = r10.getId()     // Catch: java.lang.Exception -> Laf
            if (r10 != 0) goto L80
            goto L81
        L80:
            r8 = r5
        L81:
            if (r8 != 0) goto L84
            goto L85
        L84:
            r1 = r9
        L85:
            com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r1     // Catch: java.lang.Exception -> Laf
            if (r1 == 0) goto L9f
            com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType r8 = r1.getListingType()     // Catch: java.lang.Exception -> Laf
            com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType r10 = com.forsale.app.datalayer.network.responses.listingdetails.UploadedListingType.BUSINESS_COMMERCIAL     // Catch: java.lang.Exception -> Laf
            if (r8 != r10) goto L94
            com.forsale.adserver.view.models.AdType r8 = com.forsale.adserver.view.models.AdType.BUSINESS_COMMERCIAL     // Catch: java.lang.Exception -> Laf
            goto L96
        L94:
            com.forsale.adserver.view.models.AdType r8 = com.forsale.adserver.view.models.AdType.PIN     // Catch: java.lang.Exception -> Laf
        L96:
            com.forsale.adserver.view.models.AdsModel r1 = r1.toAdsModel(r8)     // Catch: java.lang.Exception -> Laf
            if (r1 != 0) goto L9d
            goto L9f
        L9d:
            r9 = r1
            goto Lc5
        L9f:
            kotlinx.coroutines.flow.MutableSharedFlow<wz.p> r1 = r4.W0     // Catch: java.lang.Exception -> Laf
            wz.p r8 = wz.p.f75480a     // Catch: java.lang.Exception -> Laf
            r2.f31514a = r4     // Catch: java.lang.Exception -> Laf
            r2.f31517d = r7     // Catch: java.lang.Exception -> Laf
            java.lang.Object r1 = r1.emit(r8, r2)     // Catch: java.lang.Exception -> Laf
            if (r1 != r3) goto Lc5
            return r3
        Lae:
            r4 = r0
        Laf:
            kotlinx.coroutines.flow.MutableSharedFlow<wz.p> r1 = r4.W0
            wz.p r4 = wz.p.f75480a
            r2.f31514a = r9
            r2.f31517d = r6
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto Lbe
            return r3
        Lbe:
            java.lang.String r1 = "Adv Not Found"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            x10.a.b(r1, r2)
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel.A1(int, zz.a):java.lang.Object");
    }

    public final Object B1(zz.a<? super CategoryEntity> aVar) {
        return s().getRealtyCategory(aVar);
    }

    public final void C1(int i11, boolean z11) {
        boolean z12;
        SearchLocation searchLocation;
        if (i11 == t9.r0.G8) {
            searchLocation = SearchLocation.SEARCH_HOME;
        } else if (i11 == t9.r0.f70057r6) {
            searchLocation = SearchLocation.COMMERCIAL;
        } else if (i11 == t9.r0.P5) {
            searchLocation = SearchLocation.HOME;
        } else if (i11 == t9.r0.f69982l9) {
            searchLocation = SearchLocation.SUBCATEGORY;
        } else {
            boolean z13 = false;
            if (i11 == t9.r0.f70049qb || i11 == t9.r0.K0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || i11 == t9.r0.K6) {
                z13 = true;
            }
            if (z13) {
                searchLocation = SearchLocation.VERTICAL;
            } else if (i11 == t9.r0.Y1) {
                if (z11) {
                    searchLocation = SearchLocation.SEARCH_RESULTS;
                } else {
                    searchLocation = SearchLocation.LISTINGS;
                }
            } else {
                return;
            }
        }
        AggregatedAllAnalyticsLoggerKt.y0(r(), searchLocation);
    }

    public final void F1(int i11, Bundle bundle) {
        HomeToolbars E1 = E1(i11);
        if (E1 == null) {
            E1 = D1(i11);
        }
        V0(E1);
        S0(W0(i11));
        R0(i11);
        Q0(i11);
        U0(i11);
        G1(i11);
    }

    public final void H1(boolean z11) {
        this.f31458i1.setValue(Boolean.valueOf(z11));
    }

    public final void I1(SessionEntity sessionEntity, boolean z11) {
        SessionEntity.LandingPage landingPage;
        AtomicReference<HomeTabs> atomicReference = this.f31472w0;
        SessionEntity.Greeting greeting = null;
        if (sessionEntity != null) {
            landingPage = sessionEntity.getLandingPage();
        } else {
            landingPage = null;
        }
        atomicReference.set(P0(landingPage));
        AtomicReference<SessionEntity.Greeting> atomicReference2 = this.f31473x0;
        if (sessionEntity != null) {
            greeting = sessionEntity.getGreeting();
        }
        atomicReference2.set(b1(greeting, z11));
    }

    public final void J1(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$setSearchBarMode$1(this, z11, null), 3, null);
    }

    public final void K1(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$setSearchBarTitle$1(this, str, null), 3, null);
    }

    public final void N1(SearchSource searchSource) {
        o.i(searchSource, "searchSource");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$setSearchSource$1(this, searchSource, null), 3, null);
    }

    public final void P1(String adUnit) {
        o.i(adUnit, "adUnit");
        this.f31459j1.i(new Pair<>(adUnit, this.f31462m0.buildForInterstitialForDeepLink()));
    }

    public final void S0(boolean z11) {
        this.K0.postValue(Boolean.valueOf(z11));
    }

    public final void S1() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new MainContainerViewModel$updateUnReadCount$1(this, null), 2, null);
    }

    public final void T0() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerViewModel$decideBottomToolTipVisibility$job$1(this, null), 3, null);
        Z0().lazySet(launch$default);
    }

    public final SharedFlow<p> X0() {
        return this.X0;
    }

    public final AtomicReference<SessionEntity.Greeting> c1() {
        return this.f31473x0;
    }

    public final StateFlow<Boolean> d1() {
        return this.f31455f1;
    }

    public final StateFlow<Boolean> e1() {
        return this.f31457h1;
    }

    public final AtomicReference<HomeTabs> f1() {
        return this.f31472w0;
    }

    public final SharedFlow<p> g1() {
        return this.R0;
    }

    public final OneShotEventHandler<p> h1() {
        return this.f31468s0;
    }

    public final SharedFlow<p> i1() {
        return this.P0;
    }

    public final StateFlow<SearchSource> j1() {
        return this.f31453d1;
    }

    public final StateFlow<Boolean> k1() {
        return this.f31451b1;
    }

    public final SharedFlow<String> l1() {
        return this.Z0;
    }

    public final OneShotEventHandler<Pair<CustomToolTips, Integer>> m1() {
        return this.f31471v0;
    }

    public final OneShotEventHandler<HomeToolbars> n1() {
        return this.f31469t0;
    }

    public final StateFlow<Integer> o1() {
        return this.D0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
    }

    public final StateFlow<UserEntity> p1() {
        return this.B0;
    }

    public final StateFlow<UserStatus> r1() {
        return this.f31475z0;
    }

    public final MutableSharedFlow<p> s1() {
        return this.Q0;
    }

    public final MutableSharedFlow<p> t1() {
        return this.O0;
    }

    public final void u1(boolean z11) {
        this.M0.setValue(Boolean.valueOf(z11));
    }

    public final StateFlow<Boolean> v1() {
        return this.H0;
    }

    public final LiveData<Boolean> w1() {
        return this.L0;
    }

    public final LiveData<Boolean> x1() {
        return this.N0;
    }

    public final StateFlow<Boolean> y1() {
        return this.J0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.maincontainer.MainContainerViewModel$isUserLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.maincontainer.MainContainerViewModel$isUserLogin$1 r0 = (com.forsale.app.features.maincontainer.MainContainerViewModel$isUserLogin$1) r0
            int r1 = r0.f31513c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31513c = r1
            goto L18
        L13:
            com.forsale.app.features.maincontainer.MainContainerViewModel$isUserLogin$1 r0 = new com.forsale.app.features.maincontainer.MainContainerViewModel$isUserLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31511a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31513c
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
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor r5 = r4.f31465p0
            r0.f31513c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.features.auth.UserStatus r0 = com.forsale.app.features.auth.UserStatus.LoggedIn
            if (r5 != r0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerViewModel.z1(zz.a):java.lang.Object");
    }
}
