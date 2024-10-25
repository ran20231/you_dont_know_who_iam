package com.forsale.adserver.view.viewmodel;

import androidx.lifecycle.r0;
import com.forsale.adserver.usecases.GetBannerByIdUseCase;
import com.forsale.adserver.usecases.offersInteractors.LoadOffersByCatIdInteractor;
import com.forsale.adserver.usecases.offersInteractors.LoadOffersInteractor;
import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import com.forsale.adserver.utils.LocaleManager;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsModel;
import com.forsale.adserver.view.viewmodel.DetailsAnalyticsLogger;
import com.forsale.adserver.view.viewmodel.ImpressionsViewModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import j9.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import wz.p;
import zz.a;
/* compiled from: NewDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class NewDetailsViewModel extends BaseViewModel {
    private final MutableSharedFlow<String> A;
    private final SharedFlow<String> B;
    private final MutableSharedFlow<String> C;
    private final SharedFlow<String> D;
    private final MutableSharedFlow<String> E;
    private final SharedFlow<String> F;
    private final MutableSharedFlow<p> G;
    private final SharedFlow<p> H;
    private final MutableSharedFlow<String> I;
    private final SharedFlow<String> J;
    private final MutableStateFlow<List<AdsModel>> K;
    private final StateFlow<List<AdsModel>> L;
    private final Flow<Boolean> M;
    private final Flow<Integer> N;
    private final MutableSharedFlow<p> O;
    private final SharedFlow<p> P;
    private final MutableStateFlow<f> Q;
    private final StateFlow<f> R;
    private final MutableSharedFlow<Boolean> S;
    private final SharedFlow<Boolean> T;
    private final MutableSharedFlow<AdsModel> U;
    private final SharedFlow<AdsModel> V;
    private final h W;
    private final h X;

    /* renamed from: b  reason: collision with root package name */
    private final AdsModel f21731b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21732c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21733d;

    /* renamed from: e  reason: collision with root package name */
    private final DetailsModel f21734e;

    /* renamed from: f  reason: collision with root package name */
    private final OffersInteractor f21735f;

    /* renamed from: g  reason: collision with root package name */
    private final GetBannerByIdUseCase f21736g;

    /* renamed from: h  reason: collision with root package name */
    private final LoadOffersInteractor f21737h;

    /* renamed from: i  reason: collision with root package name */
    private final LoadOffersByCatIdInteractor f21738i;

    /* renamed from: j  reason: collision with root package name */
    private final ImpressionsViewModel.b f21739j;

    /* renamed from: x  reason: collision with root package name */
    private final DetailsAnalyticsLogger.a f21740x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<AdsModel> f21741y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<AdsModel> f21742z;

    /* compiled from: NewDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        NewDetailsViewModel a(AdsModel adsModel, String str, boolean z11, DetailsModel detailsModel);
    }

    /* compiled from: NewDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21755a;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.SPLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdType.PIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdType.BUSINESS_COMMERCIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21755a = iArr;
        }
    }

    public NewDetailsViewModel(AdsModel adsModel, String str, boolean z11, DetailsModel detailsModel, OffersInteractor offersUseCase, GetBannerByIdUseCase bannersUseCase, LoadOffersInteractor loadOffersInteractor, LoadOffersByCatIdInteractor loadOffersByCatIdInteractor, ImpressionsViewModel.b impressionFactory, DetailsAnalyticsLogger.a detailsAnalyticFactory) {
        List n11;
        h a11;
        h a12;
        o.i(detailsModel, "detailsModel");
        o.i(offersUseCase, "offersUseCase");
        o.i(bannersUseCase, "bannersUseCase");
        o.i(loadOffersInteractor, "loadOffersInteractor");
        o.i(loadOffersByCatIdInteractor, "loadOffersByCatIdInteractor");
        o.i(impressionFactory, "impressionFactory");
        o.i(detailsAnalyticFactory, "detailsAnalyticFactory");
        this.f21731b = adsModel;
        this.f21732c = str;
        this.f21733d = z11;
        this.f21734e = detailsModel;
        this.f21735f = offersUseCase;
        this.f21736g = bannersUseCase;
        this.f21737h = loadOffersInteractor;
        this.f21738i = loadOffersByCatIdInteractor;
        this.f21739j = impressionFactory;
        this.f21740x = detailsAnalyticFactory;
        final MutableStateFlow<AdsModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f21741y = MutableStateFlow;
        this.f21742z = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.A = MutableSharedFlow$default;
        this.B = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<String> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.C = MutableSharedFlow$default2;
        this.D = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<String> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.E = MutableSharedFlow$default3;
        this.F = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G = MutableSharedFlow$default4;
        this.H = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<String> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.I = MutableSharedFlow$default5;
        this.J = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        n11 = r.n();
        final MutableStateFlow<List<AdsModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(n11);
        this.K = MutableStateFlow2;
        this.L = FlowKt.asStateFlow(MutableStateFlow2);
        this.M = new Flow<Boolean>() { // from class: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21744a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2", f = "NewDetailsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21745a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21746b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21745a = obj;
                        this.f21746b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f21744a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21746b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21746b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f21745a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21746b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f21744a
                        java.util.List r5 = (java.util.List) r5
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f21746b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        this.N = new Flow<Integer>() { // from class: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21750a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewDetailsViewModel f21751b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2", f = "NewDetailsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21752a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21753b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21752a = obj;
                        this.f21753b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, NewDetailsViewModel newDetailsViewModel) {
                    this.f21750a = flowCollector;
                    this.f21751b = newDetailsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21753b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21753b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f21752a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21753b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L5a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f21750a
                        com.forsale.adserver.view.models.AdsModel r5 = (com.forsale.adserver.view.models.AdsModel) r5
                        if (r5 == 0) goto L43
                        int r5 = r5.g()
                    L3e:
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
                        goto L51
                    L43:
                        com.forsale.adserver.view.viewmodel.NewDetailsViewModel r5 = r4.f21751b
                        java.lang.String r5 = r5.a0()
                        if (r5 == 0) goto L50
                        int r5 = java.lang.Integer.parseInt(r5)
                        goto L3e
                    L50:
                        r5 = 0
                    L51:
                        r0.f21753b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L5a
                        return r1
                    L5a:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        MutableSharedFlow<p> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.O = MutableSharedFlow$default6;
        this.P = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableStateFlow<f> MutableStateFlow3 = StateFlowKt.MutableStateFlow(f.c.f60482a);
        this.Q = MutableStateFlow3;
        this.R = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<Boolean> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.S = MutableSharedFlow$default7;
        this.T = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        MutableSharedFlow<AdsModel> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.U = MutableSharedFlow$default8;
        this.V = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        a11 = kotlin.d.a(new g00.a<ImpressionsViewModel>() { // from class: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$impressionsVM$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ImpressionsViewModel invoke() {
                ImpressionsViewModel.b bVar;
                bVar = NewDetailsViewModel.this.f21739j;
                return bVar.a(ImpressionsViewModel.a.f21704j.a(NewDetailsViewModel.this.L().getValue()));
            }
        });
        this.W = a11;
        a12 = kotlin.d.a(new g00.a<DetailsAnalyticsLogger>() { // from class: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$detailsAnalyticsLogger$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final DetailsAnalyticsLogger invoke() {
                DetailsAnalyticsLogger.a aVar;
                aVar = NewDetailsViewModel.this.f21740x;
                return aVar.a(NewDetailsViewModel.this.V(), NewDetailsViewModel.this.M(), r0.a(NewDetailsViewModel.this));
            }
        });
        this.X = a12;
        k0(this, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J() {
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            int i11 = b.f21755a[value.a().ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String b11 = LocaleManager.f20849a.b();
                    int g11 = value.g();
                    return "https://www.q84sale.com/" + b11 + "/listing/" + g11 + "?type=commercial";
                }
                int g12 = value.g();
                return "https://www.q84sale.com/sharing/index.php/banner/" + g12;
            }
            int g13 = value.g();
            return "https://www.q84sale.com/sharing/index.php/offer/" + g13;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(int r6, boolean r7, zz.a<? super com.forsale.adserver.view.models.AdsModel> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getAdById$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getAdById$1 r0 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getAdById$1) r0
            int r1 = r0.f21761c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21761c = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getAdById$1 r0 = new com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getAdById$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f21759a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21761c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L55
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L55
            goto L46
        L38:
            kotlin.f.b(r8)
            if (r7 == 0) goto L49
            r0.f21761c = r4     // Catch: java.lang.Exception -> L55
            java.lang.Object r8 = r5.Z(r6, r0)     // Catch: java.lang.Exception -> L55
            if (r8 != r1) goto L46
            return r1
        L46:
            com.forsale.adserver.view.models.AdsModel r8 = (com.forsale.adserver.view.models.AdsModel) r8     // Catch: java.lang.Exception -> L55
            goto L5e
        L49:
            r0.f21761c = r3     // Catch: java.lang.Exception -> L55
            java.lang.Object r8 = r5.O(r6, r0)     // Catch: java.lang.Exception -> L55
            if (r8 != r1) goto L52
            return r1
        L52:
            com.forsale.adserver.view.models.AdsModel r8 = (com.forsale.adserver.view.models.AdsModel) r8     // Catch: java.lang.Exception -> L55
            goto L5e
        L55:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Adv Not Found"
            x10.a.b(r7, r6)
            r8 = 0
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel.K(int, boolean, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(int r8, zz.a<? super com.forsale.adserver.view.models.AdsModel> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getBannerById$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getBannerById$1 r0 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getBannerById$1) r0
            int r1 = r0.f21764c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21764c = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getBannerById$1 r0 = new com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getBannerById$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f21762a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21764c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r9)
            goto L43
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.f.b(r9)
            com.forsale.adserver.usecases.GetBannerByIdUseCase r9 = r7.f21736g
            kotlinx.coroutines.Deferred r8 = r9.d(r8)
            r0.f21764c = r3
            java.lang.Object r9 = r8.await(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            g9.b r9 = (g9.b) r9
            if (r9 == 0) goto L5d
            a9.b r8 = new a9.b
            r8.<init>()
            com.forsale.adserver.view.models.AdGeneralModel r0 = r8.a(r9)
            r1 = 0
            com.forsale.adserver.view.models.AdType r2 = com.forsale.adserver.view.models.AdType.BANNER
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.forsale.adserver.view.models.AdsModel r8 = com.forsale.adserver.view.models.AdGeneralModel.s(r0, r1, r2, r3, r4, r5, r6)
            goto L5e
        L5d:
            r8 = 0
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel.O(int, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DetailsAnalyticsLogger T() {
        return (DetailsAnalyticsLogger) this.X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImpressionsViewModel Y() {
        return (ImpressionsViewModel) this.W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(int r8, zz.a<? super com.forsale.adserver.view.models.AdsModel> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getOfferById$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getOfferById$1 r0 = (com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getOfferById$1) r0
            int r1 = r0.f21767c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21767c = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getOfferById$1 r0 = new com.forsale.adserver.view.viewmodel.NewDetailsViewModel$getOfferById$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f21765a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21767c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r9)
            goto L43
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.f.b(r9)
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor r9 = r7.f21735f
            kotlinx.coroutines.Deferred r8 = r9.m(r8)
            r0.f21767c = r3
            java.lang.Object r9 = r8.await(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            g9.d r9 = (g9.d) r9
            if (r9 == 0) goto L5d
            a9.e r8 = new a9.e
            r8.<init>()
            com.forsale.adserver.view.models.AdGeneralModel r0 = r8.a(r9)
            r1 = 0
            com.forsale.adserver.view.models.AdType r2 = com.forsale.adserver.view.models.AdType.OFFER
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.forsale.adserver.view.models.AdsModel r8 = com.forsale.adserver.view.models.AdGeneralModel.s(r0, r1, r2, r3, r4, r5, r6)
            goto L5e
        L5d:
            r8 = 0
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel.Z(int, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$incrementViewsCount$1(this, null), 3, null);
    }

    public static /* synthetic */ void k0(NewDetailsViewModel newDetailsViewModel, AdsModel adsModel, CommercialItemDetailsSource commercialItemDetailsSource, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            adsModel = null;
        }
        if ((i11 & 2) != 0) {
            commercialItemDetailsSource = newDetailsViewModel.f21734e.f();
        }
        newDetailsViewModel.j0(adsModel, commercialItemDetailsSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(AdsModel adsModel) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$loadOtherCommercials$1(this, adsModel, null), 3, null);
    }

    private final void u0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$reportAnalyticsActionClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(AdsModel adsModel, CommercialItemDetailsSource commercialItemDetailsSource) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$reportAnalyticsActionOpened$1(adsModel, this, commercialItemDetailsSource, null), 3, null);
    }

    private final void w0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1(this, null), 3, null);
    }

    public final Job I() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$clearFeedBack$1(this, null), 3, null);
        return launch$default;
    }

    public final StateFlow<AdsModel> L() {
        return this.f21742z;
    }

    public final AdsModel M() {
        return this.f21731b;
    }

    public final SharedFlow<p> N() {
        return this.P;
    }

    public final SharedFlow<String> Q() {
        return this.B;
    }

    public final SharedFlow<p> S() {
        return this.H;
    }

    public final DetailsModel V() {
        return this.f21734e;
    }

    public final SharedFlow<String> X() {
        return this.J;
    }

    public final String a0() {
        return this.f21732c;
    }

    public final SharedFlow<AdsModel> b0() {
        return this.V;
    }

    public final StateFlow<List<AdsModel>> c0() {
        return this.L;
    }

    public final SharedFlow<String> d0() {
        return this.F;
    }

    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel
    public String e() {
        return "NEW_DETAILS";
    }

    public final SharedFlow<Boolean> e0() {
        return this.T;
    }

    public final Flow<Boolean> f0() {
        return this.M;
    }

    public final StateFlow<f> g0() {
        return this.R;
    }

    public final SharedFlow<String> h0() {
        return this.D;
    }

    public final void j0(AdsModel adsModel, CommercialItemDetailsSource source) {
        o.i(source, "source");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$initialize$1(adsModel, this, source, null), 3, null);
    }

    public final boolean l0() {
        return this.f21733d;
    }

    public final void o0() {
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$onCallClicked$1$1(this, value, null), 3, null);
            u0();
        }
    }

    public final void p0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$onCloseClicked$1(this, null), 3, null);
    }

    public final Job q0() {
        Job launch$default;
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$onDownloadClicked$1$1(value, this, null), 3, null);
            return launch$default;
        }
        return null;
    }

    public final Job r0() {
        Job launch$default;
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$onShareClicked$1$1(this, value, null), 3, null);
            return launch$default;
        }
        return null;
    }

    public final void s0() {
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$onWhatsappClicked$1$1(this, value, null), 3, null);
            w0();
        }
    }

    public final void t0(String phone) {
        o.i(phone, "phone");
        AdsModel value = this.f21742z.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$recordPhoneClicked$1$1(this, value, phone, null), 3, null);
        }
    }

    public final Job x0(boolean z11) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewDetailsViewModel$showFeedback$1(this, z11, null), 3, null);
        return launch$default;
    }
}
