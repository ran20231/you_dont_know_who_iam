package com.forsale.app.features.categories.home.maincategories;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import androidx.lifecycle.k0;
import androidx.lifecycle.r0;
import ca.e;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessSectionInteractor;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.a;
import com.forsale.app.domainlayer.interactors.listingsInteractors.GetFeaturedCarouselSectionInteractor;
import com.forsale.app.features.categories.home.ContinueBrowsingRepository;
import com.forsale.app.features.categories.home.allverticals.f;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.p;
import j0.n1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import oa.g;
/* compiled from: MainCategoriesViewModel.kt */
/* loaded from: classes2.dex */
public final class MainCategoriesViewModel extends BaseViewModel {
    private final n1<a> A0;
    private final SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> B0;
    private final SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> C0;
    private final AdManagerAdRequest D0;
    private final MutableStateFlow<g> E0;
    private final StateFlow<g> F0;
    private final StateFlow<f> G0;
    private final StateFlow<f> H0;
    private final MutableStateFlow<Boolean> I0;

    /* renamed from: k0  reason: collision with root package name */
    private final k0 f24369k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f24370l0;

    /* renamed from: m0  reason: collision with root package name */
    private final GetHomeSectionsInteractor f24371m0;

    /* renamed from: n0  reason: collision with root package name */
    private final da.b f24372n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ContinueBrowsingRepository f24373o0;

    /* renamed from: p0  reason: collision with root package name */
    private final BaseRepository f24374p0;

    /* renamed from: q0  reason: collision with root package name */
    private final GetFeaturedCarouselSectionInteractor f24375q0;

    /* renamed from: r0  reason: collision with root package name */
    private final GetBusinessSectionInteractor f24376r0;

    /* renamed from: s0  reason: collision with root package name */
    private final pa.a f24377s0;

    /* renamed from: t0  reason: collision with root package name */
    private final Flow<String> f24378t0;

    /* renamed from: u0  reason: collision with root package name */
    private final SnapshotStateList<CategoryEntity> f24379u0;

    /* renamed from: v0  reason: collision with root package name */
    private final SnapshotStateList<CategoryEntity> f24380v0;

    /* renamed from: w0  reason: collision with root package name */
    private String f24381w0;

    /* renamed from: x0  reason: collision with root package name */
    private final HashMap<String, s9.a> f24382x0;

    /* renamed from: y0  reason: collision with root package name */
    private final HashMap<String, s9.a> f24383y0;

    /* renamed from: z0  reason: collision with root package name */
    private final j0.k0<a> f24384z0;

    /* compiled from: MainCategoriesViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$1", f = "MainCategoriesViewModel.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f24391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainCategoriesViewModel f24392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, MainCategoriesViewModel mainCategoriesViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24391b = eVar;
            this.f24392c = mainCategoriesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f24391b, this.f24392c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            boolean z11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f24390a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                e eVar = this.f24391b;
                this.f24390a = 1;
                obj = eVar.a(this);
                if (obj == f11) {
                    return f11;
                }
            }
            MainCategoriesViewModel mainCategoriesViewModel = this.f24392c;
            mainCategoriesViewModel.f24379u0.clear();
            SnapshotStateList snapshotStateList = mainCategoriesViewModel.f24379u0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                CategoryEntity categoryEntity = (CategoryEntity) obj2;
                if (categoryEntity.getClassification() != CategoryEntity.Classification.PREMIUM && categoryEntity.getClassification() != CategoryEntity.Classification.BUSINESS) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj2);
                }
            }
            snapshotStateList.addAll(arrayList);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: MainCategoriesViewModel.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: MainCategoriesViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0269a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f24393a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0269a(Exception exception) {
                super(null);
                o.i(exception, "exception");
                this.f24393a = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0269a) && o.d(this.f24393a, ((C0269a) obj).f24393a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f24393a.hashCode();
            }

            public String toString() {
                Exception exc = this.f24393a;
                return "Error(exception=" + exc + ")";
            }
        }

        /* compiled from: MainCategoriesViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f24394a = new b();

            private b() {
                super(null);
            }
        }

        /* compiled from: MainCategoriesViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f24395a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MainCategoriesViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24396a;

        static {
            int[] iArr = new int[VerticalSectionsTabs.values().length];
            try {
                iArr[VerticalSectionsTabs.TOP_USER_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalSectionsTabs.TOP_COMMERCIAL_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24396a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesViewModel(k0 savedStateHandle, e verticalsInteractor, UserProfileInteractor userInteractor, GetHomeSectionsInteractor getHomeSectionsInteractor, da.b gamGeneralInteractor, ContinueBrowsingRepository continueBrowsingRepository, BaseRepository baseRepository, GetFeaturedCarouselSectionInteractor getFeaturedCarouselSectionInteractor, GetBusinessSectionInteractor getBusinessSectionInteractor, pa.a allVerticalsAnalyticsTracker) {
        super(baseRepository);
        j0.k0<a> e11;
        o.i(savedStateHandle, "savedStateHandle");
        o.i(verticalsInteractor, "verticalsInteractor");
        o.i(userInteractor, "userInteractor");
        o.i(getHomeSectionsInteractor, "getHomeSectionsInteractor");
        o.i(gamGeneralInteractor, "gamGeneralInteractor");
        o.i(continueBrowsingRepository, "continueBrowsingRepository");
        o.i(baseRepository, "baseRepository");
        o.i(getFeaturedCarouselSectionInteractor, "getFeaturedCarouselSectionInteractor");
        o.i(getBusinessSectionInteractor, "getBusinessSectionInteractor");
        o.i(allVerticalsAnalyticsTracker, "allVerticalsAnalyticsTracker");
        this.f24369k0 = savedStateHandle;
        this.f24370l0 = userInteractor;
        this.f24371m0 = getHomeSectionsInteractor;
        this.f24372n0 = gamGeneralInteractor;
        this.f24373o0 = continueBrowsingRepository;
        this.f24374p0 = baseRepository;
        this.f24375q0 = getFeaturedCarouselSectionInteractor;
        this.f24376r0 = getBusinessSectionInteractor;
        this.f24377s0 = allVerticalsAnalyticsTracker;
        final Flow<UserEntity> j11 = userInteractor.j();
        this.f24378t0 = new Flow<String>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f24386a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2", f = "MainCategoriesViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f24387a;

                    /* renamed from: b  reason: collision with root package name */
                    int f24388b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f24387a = obj;
                        this.f24388b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f24386a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f24388b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f24388b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f24387a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f24388b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f24386a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getFirstName()
                        if (r5 != 0) goto L42
                    L40:
                        java.lang.String r5 = ""
                    L42:
                        r0.f24388b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        SnapshotStateList<CategoryEntity> f11 = z.f();
        this.f24379u0 = f11;
        this.f24380v0 = f11;
        this.f24382x0 = new HashMap<>();
        this.f24383y0 = new HashMap<>();
        e11 = c0.e(a.b.f24394a, null, 2, null);
        this.f24384z0 = e11;
        this.A0 = e11;
        SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> f12 = z.f();
        this.B0 = f12;
        this.C0 = f12;
        this.D0 = gamGeneralInteractor.a();
        MutableStateFlow<g> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.E0 = MutableStateFlow;
        this.F0 = FlowKt.asStateFlow(MutableStateFlow);
        this.G0 = getFeaturedCarouselSectionInteractor.h();
        this.H0 = getBusinessSectionInteractor.d();
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AnonymousClass1(verticalsInteractor, this, null), 3, null);
        this.I0 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final StateFlow<f> E0() {
        return this.G0;
    }

    public final StateFlow<f> G0() {
        return this.H0;
    }

    public final StateFlow<g> H0() {
        return this.F0;
    }

    public final AdManagerAdRequest I0() {
        return this.D0;
    }

    public final n1<a> J0() {
        return this.A0;
    }

    public final String K0() {
        return this.f24381w0;
    }

    public final SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> L0() {
        return this.C0;
    }

    public final SnapshotStateList<CategoryEntity> M0() {
        return this.f24380v0;
    }

    public final void N0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new MainCategoriesViewModel$loadContinueBrowsingData$1(this, null), 2, null);
    }

    public final void O0() {
        if (!this.I0.getValue().booleanValue()) {
            this.f24384z0.setValue(a.b.f24394a);
        }
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MainCategoriesViewModel$loadHomeSections$1(this, null), 3, null);
    }

    public final void P0() {
        List<? extends s9.a> X0;
        List<? extends s9.a> X02;
        AggregatedAllAnalyticsLogger analyticsLogger = this.f24374p0.getAnalyticsLogger();
        Collection<s9.a> values = this.f24382x0.values();
        o.h(values, "<get-values>(...)");
        X0 = CollectionsKt___CollectionsKt.X0(values);
        analyticsLogger.d0(X0);
        AggregatedAllAnalyticsLogger analyticsLogger2 = this.f24374p0.getAnalyticsLogger();
        Collection<s9.a> values2 = this.f24383y0.values();
        o.h(values2, "<get-values>(...)");
        X02 = CollectionsKt___CollectionsKt.X0(values2);
        analyticsLogger2.d0(X02);
        this.f24382x0.clear();
        this.f24383y0.clear();
    }

    public final void Q0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new MainCategoriesViewModel$recordMainCategoryVisited$1(this, null), 2, null);
    }

    public final void R0(ui.a carouselTabAnalytic) {
        o.i(carouselTabAnalytic, "carouselTabAnalytic");
        if (b.f24396a[carouselTabAnalytic.b().ordinal()] == 2) {
            this.f24374p0.getAnalyticsLogger().e0(carouselTabAnalytic);
        }
    }

    public final void S0(int i11, VerticalSectionsTabs newTabSelected) {
        int y11;
        boolean z11;
        o.i(newTabSelected, "newTabSelected");
        com.forsale.app.domainlayer.interactors.categoriesinteractors.a aVar = this.B0.get(i11);
        SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> snapshotStateList = this.B0;
        List<a.C0252a> e11 = aVar.e();
        y11 = s.y(e11, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (a.C0252a c0252a : e11) {
            if (c0252a.d() == newTabSelected) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(a.C0252a.b(c0252a, 0, z11, null, 5, null));
        }
        snapshotStateList.set(i11, com.forsale.app.domainlayer.interactors.categoriesinteractors.a.b(aVar, null, null, arrayList, null, null, null, 59, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r13 = kotlin.collections.i0.f(wz.i.a("RecommendationCriteria", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(java.lang.String r12, int r13, com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = "sectionName"
            kotlin.jvm.internal.o.i(r12, r0)
            java.lang.String r0 = "tab"
            kotlin.jvm.internal.o.i(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Section"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "-Tab"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r1 = r11.C0
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto Lca
            java.util.HashMap<java.lang.String, s9.a> r1 = r11.f24383y0
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r2 = "MaxItemScrolled"
            if (r1 == 0) goto L5f
            java.util.HashMap<java.lang.String, s9.a> r1 = r11.f24383y0
            java.lang.Object r1 = r1.get(r0)
            s9.a r1 = (s9.a) r1
            r3 = 0
            if (r1 == 0) goto L4d
            java.util.Map r1 = r1.a()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r1.get(r2)
            goto L4e
        L4d:
            r1 = r3
        L4e:
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L55
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L55:
            if (r3 == 0) goto L5c
            int r1 = r3.intValue()
            goto L5d
        L5c:
            r1 = 0
        L5d:
            if (r1 >= r13) goto Lca
        L5f:
            java.util.HashMap<java.lang.String, s9.a> r1 = r11.f24383y0
            java.lang.String r4 = "Home Page Swiped"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            kotlin.Pair r13 = wz.i.a(r2, r13)
            java.util.Map r13 = kotlin.collections.g0.f(r13)
            java.lang.String r2 = "SectionName"
            kotlin.Pair r12 = wz.i.a(r2, r12)
            java.util.Map r12 = kotlin.collections.g0.f(r12)
            java.util.Map r12 = kotlin.collections.g0.o(r13, r12)
            com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs$a r13 = com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs.Companion
            java.lang.String r13 = r13.b(r14)
            java.lang.String r14 = "TabName"
            kotlin.Pair r13 = wz.i.a(r14, r13)
            java.util.Map r13 = kotlin.collections.g0.f(r13)
            java.util.Map r12 = kotlin.collections.g0.o(r12, r13)
            java.lang.String r13 = "TotalItemsCount"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r13 = wz.i.a(r13, r14)
            java.util.Map r13 = kotlin.collections.g0.f(r13)
            java.util.Map r12 = kotlin.collections.g0.o(r12, r13)
            java.lang.String r13 = r11.f24381w0
            if (r13 == 0) goto Lb3
            java.lang.String r14 = "RecommendationCriteria"
            kotlin.Pair r13 = wz.i.a(r14, r13)
            java.util.Map r13 = kotlin.collections.g0.f(r13)
            if (r13 != 0) goto Lb7
        Lb3:
            java.util.Map r13 = kotlin.collections.g0.h()
        Lb7:
            java.util.Map r5 = kotlin.collections.g0.o(r12, r13)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            s9.a r12 = new s9.a
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.put(r0, r12)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel.T0(java.lang.String, int, com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        r4 = kotlin.collections.i0.f(wz.i.a("RecommendationCriteria", r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0() {
        /*
            r11 = this;
            java.util.HashMap<java.lang.String, s9.a> r0 = r11.f24382x0
            java.lang.String r1 = "Home Page Scrolled"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Lb8
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r0 = r11.C0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb8
            java.util.HashMap<java.lang.String, s9.a> r0 = r11.f24382x0
            java.lang.String r3 = "Home Page Scrolled"
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r2 = r11.C0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.p.y(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r2.next()
            com.forsale.app.domainlayer.interactors.categoriesinteractors.a r5 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.a) r5
            java.lang.String r5 = r5.g()
            r4.add(r5)
            goto L29
        L3d:
            java.lang.String r2 = "Sections"
            kotlin.Pair r2 = wz.i.a(r2, r4)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r4 = r11.C0
            java.lang.Object r4 = kotlin.collections.p.v0(r4)
            com.forsale.app.domainlayer.interactors.categoriesinteractors.a r4 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.a) r4
            java.lang.String r4 = r4.g()
            java.lang.String r5 = "MaxVisitedSectionName"
            kotlin.Pair r4 = wz.i.a(r5, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            java.util.Map r2 = kotlin.collections.g0.o(r2, r4)
            java.lang.String r4 = r11.f24381w0
            if (r4 == 0) goto L71
            java.lang.String r5 = "RecommendationCriteria"
            kotlin.Pair r4 = wz.i.a(r5, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            if (r4 != 0) goto L75
        L71:
            java.util.Map r4 = kotlin.collections.g0.h()
        L75:
            java.util.Map r2 = kotlin.collections.g0.o(r2, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r4 = r11.C0
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "MaxVisitedSectionNumber"
            kotlin.Pair r4 = wz.i.a(r5, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            java.util.Map r2 = kotlin.collections.g0.o(r2, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> r4 = r11.C0
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "TotalSectionsCount"
            kotlin.Pair r4 = wz.i.a(r5, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            java.util.Map r4 = kotlin.collections.g0.o(r2, r4)
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            s9.a r10 = new s9.a
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.put(r1, r10)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel.U0():void");
    }
}
