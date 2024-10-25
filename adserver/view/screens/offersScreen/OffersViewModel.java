package com.forsale.adserver.view.screens.offersScreen;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.screens.ui.a;
import com.forsale.analytics.commercial.CommercialEventsData;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import commercial.CommercialTabName;
import g9.d;
import g9.e;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import wz.p;
/* compiled from: OffersViewModel.kt */
/* loaded from: classes2.dex */
public final class OffersViewModel extends q0 {
    private final StateFlow<a> A;
    private final MutableStateFlow<com.forsale.adserver.view.screens.ui.a> B;
    private final StateFlow<com.forsale.adserver.view.screens.ui.a> C;

    /* renamed from: a  reason: collision with root package name */
    private final CommercialModel f21396a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21397b;

    /* renamed from: c  reason: collision with root package name */
    private final OffersInteractor f21398c;

    /* renamed from: d  reason: collision with root package name */
    private final com.forsale.adserver.usecases.a f21399d;

    /* renamed from: e  reason: collision with root package name */
    private final CommercialEventsData f21400e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineDispatcher f21401f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<c> f21402g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<c> f21403h;

    /* renamed from: i  reason: collision with root package name */
    private final h f21404i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<Boolean> f21405j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<a> f21406x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<List<d>> f21407y;

    /* renamed from: z  reason: collision with root package name */
    private final Flow<AdManagerAdRequest> f21408z;

    /* compiled from: OffersViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: OffersViewModel.kt */
        /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0242a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f21439a;

            public C0242a(Throwable error) {
                o.i(error, "error");
                this.f21439a = error;
            }

            public final Throwable a() {
                return this.f21439a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0242a) && o.d(this.f21439a, ((C0242a) obj).f21439a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f21439a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f21439a;
                return "Error(error=" + th2 + ")";
            }
        }

        /* compiled from: OffersViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f21440a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public int hashCode() {
                return 266979638;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* compiled from: OffersViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final List<n9.a> f21441a;

            public c(List<n9.a> categoriesList) {
                o.i(categoriesList, "categoriesList");
                this.f21441a = categoriesList;
            }

            public final c a(List<n9.a> categoriesList) {
                o.i(categoriesList, "categoriesList");
                return new c(categoriesList);
            }

            public final List<n9.a> b() {
                return this.f21441a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && o.d(this.f21441a, ((c) obj).f21441a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f21441a.hashCode();
            }

            public String toString() {
                List<n9.a> list = this.f21441a;
                return "Success(categoriesList=" + list + ")";
            }
        }
    }

    /* compiled from: OffersViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        OffersViewModel a(CommercialModel commercialModel, int i11);
    }

    /* compiled from: OffersViewModel.kt */
    /* loaded from: classes2.dex */
    public interface c {

        /* compiled from: OffersViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final int f21442a;

            public a(int i11) {
                this.f21442a = i11;
            }

            @Override // com.forsale.adserver.view.screens.offersScreen.OffersViewModel.c
            public int a() {
                return this.f21442a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && this.f21442a == ((a) obj).f21442a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Integer.hashCode(this.f21442a);
            }

            public String toString() {
                int i11 = this.f21442a;
                return "PreSelectedCategory(catID=" + i11 + ")";
            }
        }

        /* compiled from: OffersViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final int f21443a;

            public b(int i11) {
                this.f21443a = i11;
            }

            @Override // com.forsale.adserver.view.screens.offersScreen.OffersViewModel.c
            public int a() {
                return this.f21443a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f21443a == ((b) obj).f21443a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Integer.hashCode(this.f21443a);
            }

            public String toString() {
                int i11 = this.f21443a;
                return "SelectedCategory(catID=" + i11 + ")";
            }
        }

        int a();
    }

    public OffersViewModel(CommercialModel commercialModel, int i11, OffersInteractor offersInteractor, com.forsale.adserver.usecases.a impressionsUseCase, CommercialEventsData commercialEventsData, CoroutineDispatcher ioDispatcher) {
        boolean z11;
        Object bVar;
        h a11;
        List n11;
        o.i(offersInteractor, "offersInteractor");
        o.i(impressionsUseCase, "impressionsUseCase");
        o.i(commercialEventsData, "commercialEventsData");
        o.i(ioDispatcher, "ioDispatcher");
        this.f21396a = commercialModel;
        this.f21397b = i11;
        this.f21398c = offersInteractor;
        this.f21399d = impressionsUseCase;
        this.f21400e = commercialEventsData;
        this.f21401f = ioDispatcher;
        Integer valueOf = Integer.valueOf(i11);
        int intValue = valueOf.intValue();
        CategoryTab categoryTab = CategoryTab.ALL;
        if (intValue != categoryTab.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        valueOf = z11 ? valueOf : null;
        if (valueOf != null) {
            bVar = new c.a(valueOf.intValue());
        } else {
            bVar = new c.b(categoryTab.getId());
        }
        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow(bVar);
        this.f21402g = MutableStateFlow;
        final StateFlow<c> asStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.f21403h = asStateFlow;
        a11 = kotlin.d.a(new g00.a<CoroutineContext>() { // from class: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$coroutineContext$2

            /* compiled from: CoroutineExceptionHandler.kt */
            /* loaded from: classes2.dex */
            public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ OffersViewModel f21445a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(CoroutineExceptionHandler.Key key, OffersViewModel offersViewModel) {
                    super(key);
                    this.f21445a = offersViewModel;
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(CoroutineContext coroutineContext, Throwable th2) {
                    MutableStateFlow mutableStateFlow;
                    Object value;
                    mutableStateFlow = this.f21445a.B;
                    do {
                        value = mutableStateFlow.getValue();
                        com.forsale.adserver.view.screens.ui.a aVar = (com.forsale.adserver.view.screens.ui.a) value;
                        x10.a.c(th2);
                    } while (!mutableStateFlow.compareAndSet(value, new a.C0243a(th2)));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CoroutineContext invoke() {
                CoroutineDispatcher coroutineDispatcher;
                coroutineDispatcher = OffersViewModel.this.f21401f;
                return coroutineDispatcher.plus(new a(CoroutineExceptionHandler.Key, OffersViewModel.this));
            }
        });
        this.f21404i = a11;
        Flow m40catch = FlowKt.m40catch(FlowKt.flowOn(FlowKt.flow(new OffersViewModel$_showFeaturedCategory$1(this, null)), ioDispatcher), new OffersViewModel$_showFeaturedCategory$2(null));
        CoroutineScope a12 = r0.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<Boolean> stateIn = FlowKt.stateIn(m40catch, a12, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), Boolean.FALSE);
        this.f21405j = stateIn;
        Flow flowOn = FlowKt.flowOn(FlowKt.onStart(FlowKt.m40catch(FlowKt.flow(new OffersViewModel$offersCategoriesState$1(this, null)), new OffersViewModel$offersCategoriesState$2(null)), new OffersViewModel$offersCategoriesState$3(null)), ioDispatcher);
        CoroutineScope a13 = r0.a(this);
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null);
        a.b bVar2 = a.b.f21440a;
        StateFlow<a> stateIn2 = FlowKt.stateIn(flowOn, a13, WhileSubscribed$default, bVar2);
        this.f21406x = stateIn2;
        final Flow<Integer> flow = new Flow<Integer>() { // from class: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21410a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2", f = "OffersViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21411a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21412b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21411a = obj;
                        this.f21412b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f21410a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21412b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21412b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f21411a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21412b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f21410a
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$c r5 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel.c) r5
                        int r5 = r5.a()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
                        r0.f21412b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        Flow m40catch2 = FlowKt.m40catch(FlowKt.flowOn(new Flow<List<? extends d>>() { // from class: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21416a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ OffersViewModel f21417b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2", f = "OffersViewModel.kt", l = {225, 226, 228, 223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21418a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21419b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f21420c;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21418a = obj;
                        this.f21419b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OffersViewModel offersViewModel) {
                    this.f21416a = flowCollector;
                    this.f21417b = offersViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, zz.a r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21419b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21419b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.f21418a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21419b
                        r3 = 4
                        r4 = 3
                        r5 = 2
                        r6 = 1
                        if (r2 == 0) goto L53
                        if (r2 == r6) goto L4b
                        if (r2 == r5) goto L43
                        if (r2 == r4) goto L3b
                        if (r2 != r3) goto L33
                        kotlin.f.b(r10)
                        goto La5
                    L33:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L3b:
                        java.lang.Object r9 = r0.f21420c
                        kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                        kotlin.f.b(r10)
                        goto L99
                    L43:
                        java.lang.Object r9 = r0.f21420c
                        kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                        kotlin.f.b(r10)
                        goto L99
                    L4b:
                        java.lang.Object r9 = r0.f21420c
                        kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                        kotlin.f.b(r10)
                        goto L99
                    L53:
                        kotlin.f.b(r10)
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.f21416a
                        java.lang.Number r9 = (java.lang.Number) r9
                        int r9 = r9.intValue()
                        com.forsale.adserver.view.screens.offersScreen.CategoryTab r2 = com.forsale.adserver.view.screens.offersScreen.CategoryTab.ALL
                        int r2 = r2.getId()
                        if (r9 != r2) goto L77
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel r9 = r8.f21417b
                        r0.f21420c = r10
                        r0.f21419b = r6
                        java.lang.Object r9 = com.forsale.adserver.view.screens.offersScreen.OffersViewModel.k(r9, r0)
                        if (r9 != r1) goto L73
                        return r1
                    L73:
                        r7 = r10
                        r10 = r9
                        r9 = r7
                        goto L99
                    L77:
                        com.forsale.adserver.view.screens.offersScreen.CategoryTab r2 = com.forsale.adserver.view.screens.offersScreen.CategoryTab.FEATURED
                        int r2 = r2.getId()
                        if (r9 != r2) goto L8c
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel r9 = r8.f21417b
                        r0.f21420c = r10
                        r0.f21419b = r5
                        java.lang.Object r9 = com.forsale.adserver.view.screens.offersScreen.OffersViewModel.j(r9, r0)
                        if (r9 != r1) goto L73
                        return r1
                    L8c:
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel r2 = r8.f21417b
                        r0.f21420c = r10
                        r0.f21419b = r4
                        java.lang.Object r9 = com.forsale.adserver.view.screens.offersScreen.OffersViewModel.m(r2, r9, r0)
                        if (r9 != r1) goto L73
                        return r1
                    L99:
                        r2 = 0
                        r0.f21420c = r2
                        r0.f21419b = r3
                        java.lang.Object r9 = r9.emit(r10, r0)
                        if (r9 != r1) goto La5
                        return r1
                    La5:
                        wz.p r9 = wz.p.f75480a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends d>> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, ioDispatcher), new OffersViewModel$offersList$3(null));
        CoroutineScope a14 = r0.a(this);
        SharingStarted WhileSubscribed$default2 = SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null);
        n11 = r.n();
        StateFlow<List<d>> stateIn3 = FlowKt.stateIn(m40catch2, a14, WhileSubscribed$default2, n11);
        this.f21407y = stateIn3;
        final Flow<Integer> flow2 = new Flow<Integer>() { // from class: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21423a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2", f = "OffersViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21424a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21425b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21424a = obj;
                        this.f21425b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f21423a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21425b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21425b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f21424a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21425b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f21423a
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$c r5 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel.c) r5
                        int r5 = r5.a()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
                        r0.f21425b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        StateFlow stateIn4 = FlowKt.stateIn(FlowKt.m40catch(new Flow<AdManagerAdRequest>() { // from class: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f21429a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ OffersViewModel f21430b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2", f = "OffersViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f21431a;

                    /* renamed from: b  reason: collision with root package name */
                    int f21432b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f21431a = obj;
                        this.f21432b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OffersViewModel offersViewModel) {
                    this.f21429a = flowCollector;
                    this.f21430b = offersViewModel;
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
                        boolean r0 = r6 instanceof com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2$1 r0 = (com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f21432b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f21432b = r1
                        goto L18
                    L13:
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2$1 r0 = new com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f21431a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f21432b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f21429a
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        com.forsale.adserver.view.screens.offersScreen.OffersViewModel r2 = r4.f21430b
                        com.google.android.gms.ads.admanager.AdManagerAdRequest r5 = com.forsale.adserver.view.screens.offersScreen.OffersViewModel.e(r2, r5)
                        r0.f21432b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.offersScreen.OffersViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AdManagerAdRequest> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, new OffersViewModel$gamRequest$3(null)), r0.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        this.f21408z = stateIn4;
        StateFlow<a> stateIn5 = FlowKt.stateIn(FlowKt.flowCombine(stateIn2, stateIn, new OffersViewModel$offersCategoriesChipsState$1(null)), r0.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), bVar2);
        this.A = stateIn5;
        a.b bVar3 = a.b.f21597a;
        this.B = StateFlowKt.MutableStateFlow(bVar3);
        this.C = FlowKt.stateIn(FlowKt.combine(stateIn5, stateIn3, stateIn4, new OffersViewModel$screenUiState$1(null)), r0.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), bVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdManagerAdRequest o(int i11) {
        boolean z11;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        int i12 = 0;
        x10.a.b("createGamRequest:: AdManagerAdRequest:: catId:: " + i11, new Object[0]);
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == CategoryTab.ALL.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            valueOf = null;
        }
        if (valueOf != null) {
            i12 = valueOf.intValue();
        }
        builder.addCustomTargeting("offer_id", String.valueOf(i12));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(zz.a<? super List<d>> aVar) {
        return UtilsKt.f(0, 0L, 0L, Utils.DOUBLE_EPSILON, new OffersViewModel$loadAllFeaturedOffers$2(this, null), aVar, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(zz.a<? super List<d>> aVar) {
        return UtilsKt.f(0, 0L, 0L, Utils.DOUBLE_EPSILON, new OffersViewModel$loadAllOffers$2(this, null), aVar, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(zz.a<? super List<e>> aVar) {
        return UtilsKt.f(0, 0L, 0L, Utils.DOUBLE_EPSILON, new OffersViewModel$loadCategories$2(this, null), aVar, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(int i11, zz.a<? super List<d>> aVar) {
        return UtilsKt.f(0, 0L, 0L, Utils.DOUBLE_EPSILON, new OffersViewModel$loadOffersByCategoryId$2(this, i11, null), aVar, 15, null);
    }

    public final StateFlow<c> p() {
        return this.f21403h;
    }

    public final StateFlow<com.forsale.adserver.view.screens.ui.a> q() {
        return this.C;
    }

    public final CommercialTabName w(int i11) {
        if (i11 == CategoryTab.ALL.getId()) {
            return CommercialTabName.ALL;
        }
        if (i11 == CategoryTab.FEATURED.getId()) {
            return CommercialTabName.FEATURED;
        }
        return CommercialTabName.CATEGORY;
    }

    public final void x(int i11) {
        MutableStateFlow<c> mutableStateFlow = this.f21402g;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new c.b(i11)));
    }
}
