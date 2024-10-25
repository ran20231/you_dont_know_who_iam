package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.postad.location.LocationLevels;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import com.forsale.app.utils.analytics.listingfiltration.a;
import fc.c;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import of.e;
/* compiled from: LocationFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class LocationFilterViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a.b f29824k0;

    /* renamed from: l0  reason: collision with root package name */
    private final FiltersRepository f29825l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f29826m0;

    /* renamed from: n0  reason: collision with root package name */
    private final e f29827n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableStateFlow<LocationTreeNode> f29828o0;

    /* renamed from: p0  reason: collision with root package name */
    private final Flow<String> f29829p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableStateFlow<List<LocationTreeNode>> f29830q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableSharedFlow<a> f29831r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f29832s0;

    /* renamed from: t0  reason: collision with root package name */
    private final Flow<Boolean> f29833t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MutableStateFlow<String> f29834u0;

    /* renamed from: v0  reason: collision with root package name */
    private final Flow<List<String>> f29835v0;

    /* renamed from: w0  reason: collision with root package name */
    private final Flow<List<LocationTreeNode>> f29836w0;

    /* renamed from: x0  reason: collision with root package name */
    private final Flow<List<LocationTreeNode>> f29837x0;

    /* renamed from: y0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f29838y0;

    /* compiled from: LocationFilterViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$1", f = "LocationFilterViewModel.kt", l = {68, 70, 78, 89}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f29861a;

        /* renamed from: b  reason: collision with root package name */
        Object f29862b;

        /* renamed from: c  reason: collision with root package name */
        Object f29863c;

        /* renamed from: d  reason: collision with root package name */
        int f29864d;

        /* compiled from: Comparisons.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$1$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int a11;
                a11 = yz.b.a(Integer.valueOf(((LocationTreeNode) t11).i().k()), Integer.valueOf(((LocationTreeNode) t12).i().k()));
                return a11;
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[LOOP:0: B:27:0x00ae->B:29:0x00b4, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[LOOP:1: B:31:0x00d3->B:33:0x00d9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0104 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: LocationFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: LocationFilterViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0331a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final c f29869a;

            public C0331a(c filterResult) {
                o.i(filterResult, "filterResult");
                this.f29869a = filterResult;
            }

            public final c a() {
                return this.f29869a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0331a) && o.d(this.f29869a, ((C0331a) obj).f29869a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f29869a.hashCode();
            }

            public String toString() {
                c cVar = this.f29869a;
                return "ApplyFilter(filterResult=" + cVar + ")";
            }
        }
    }

    /* compiled from: LocationFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        LocationFilterViewModel a(a.b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel(a.b filtrationClickCapsule, FiltersRepository filtersRepository, ListingsFiltrationAnalytics filtrationAnalytics, e searchTextInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        List n11;
        o.i(filtrationClickCapsule, "filtrationClickCapsule");
        o.i(filtersRepository, "filtersRepository");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(searchTextInteractor, "searchTextInteractor");
        o.i(baseRepository, "baseRepository");
        this.f29824k0 = filtrationClickCapsule;
        this.f29825l0 = filtersRepository;
        this.f29826m0 = filtrationAnalytics;
        this.f29827n0 = searchTextInteractor;
        final MutableStateFlow<LocationTreeNode> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f29828o0 = MutableStateFlow;
        this.f29829p0 = new Flow<String>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29840a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2", f = "LocationFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29841a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29842b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29841a = obj;
                        this.f29842b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f29840a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29842b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29842b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29841a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29842b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L61
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f29840a
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode r5 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode) r5
                        if (r5 == 0) goto L57
                        java.util.List r5 = r5.e()
                        if (r5 == 0) goto L57
                        java.util.Collection r5 = (java.util.Collection) r5
                        kotlin.random.Random$Default r2 = kotlin.random.Random.f61810a
                        java.lang.Object r5 = kotlin.collections.p.G0(r5, r2)
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode r5 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode) r5
                        if (r5 == 0) goto L57
                        dc.a r5 = r5.i()
                        if (r5 == 0) goto L57
                        java.lang.String r5 = r5.i()
                        goto L58
                    L57:
                        r5 = 0
                    L58:
                        r0.f29842b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L61
                        return r1
                    L61:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
                return wz.p.f75480a;
            }
        };
        n11 = r.n();
        final MutableStateFlow<List<LocationTreeNode>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(n11);
        this.f29830q0 = MutableStateFlow2;
        this.f29831r0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        Boolean bool = Boolean.FALSE;
        this.f29832s0 = StateFlowKt.MutableStateFlow(bool);
        this.f29833t0 = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29845a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2", f = "LocationFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29846a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29847b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29846a = obj;
                        this.f29847b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f29845a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29847b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29847b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29846a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29847b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f29845a
                        java.util.List r5 = (java.util.List) r5
                        java.util.Collection r5 = (java.util.Collection) r5
                        boolean r5 = r5.isEmpty()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f29847b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
                return wz.p.f75480a;
            }
        };
        final MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.f29834u0 = MutableStateFlow3;
        this.f29835v0 = new Flow<List<? extends String>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29851a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ LocationFilterViewModel f29852b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2", f = "LocationFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29853a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29854b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29853a = obj;
                        this.f29854b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LocationFilterViewModel locationFilterViewModel) {
                    this.f29851a = flowCollector;
                    this.f29852b = locationFilterViewModel;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29854b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29854b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29853a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29854b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f29851a
                        java.lang.String r5 = (java.lang.String) r5
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel r2 = r4.f29852b
                        of.e r2 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel.y0(r2)
                        java.util.List r5 = r2.b(r5, r3)
                        r0.f29854b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends String>> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        this.f29836w0 = FlowKt.flowCombine(MutableStateFlow, filtersRepository.getRecentLocations(filtrationClickCapsule.c()), new LocationFilterViewModel$recentLocations$1(null));
        this.f29837x0 = new Flow<List<? extends LocationTreeNode>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29857a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2", f = "LocationFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29858a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29859b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29858a = obj;
                        this.f29859b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f29857a = flowCollector;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
                    r6 = kotlin.collections.q.f(r6);
                 */
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
                        boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29859b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29859b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f29858a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29859b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L5d
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f29857a
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode r6 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode) r6
                        if (r6 == 0) goto L50
                        java.util.List r6 = r6.e()
                        if (r6 == 0) goto L50
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.List r6 = kotlin.collections.p.f(r6)
                        if (r6 == 0) goto L50
                        r2 = 0
                        r4 = 6
                        java.util.List r6 = r6.subList(r2, r4)
                        if (r6 != 0) goto L54
                    L50:
                        java.util.List r6 = kotlin.collections.p.n()
                    L54:
                        r0.f29859b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L5d
                        return r1
                    L5d:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends LocationTreeNode>> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        this.f29838y0 = StateFlowKt.MutableStateFlow(bool);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D0(List<LocationTreeNode> list, zz.a<? super wz.p> aVar) {
        int y11;
        Object f11;
        boolean z11;
        FiltersRepository filtersRepository = this.f29825l0;
        int c11 = this.f29824k0.c();
        List<LocationTreeNode> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (LocationTreeNode locationTreeNode : list2) {
            arrayList.add(locationTreeNode.i());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((dc.a) obj).j() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        Object addToRecentLocations = filtersRepository.addToRecentLocations(c11, arrayList2, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (addToRecentLocations == f11) {
            return addToRecentLocations;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(zz.a<? super com.forsale.app.features.postad.location.LocationLevels> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$getMaxLocationLevel$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$getMaxLocationLevel$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$getMaxLocationLevel$1) r0
            int r1 = r0.f29877c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29877c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$getMaxLocationLevel$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$getMaxLocationLevel$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f29875a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29877c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$b r5 = r4.f29824k0
            fc.a r5 = r5.a()
            com.forsale.app.datalayer.database.CategoryEntity r5 = r5.b()
            int r5 = r5.getId()
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r4.s()
            r0.f29877c = r3
            java.lang.Object r5 = r2.getCategoryRuleSet(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r5 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r5
            if (r5 == 0) goto Lb8
            com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r5 = r5.getLocationSettings()
            if (r5 == 0) goto Lb8
            java.util.List r5 = r5.getLevels()
            if (r5 == 0) goto Lb8
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 != 0) goto L67
            goto L68
        L67:
            r5 = r1
        L68:
            if (r5 == 0) goto Lb8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L70:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r2 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r2
            boolean r2 = r2.getEnabled()
            r2 = r2 ^ r3
            if (r2 == 0) goto L70
            goto L86
        L85:
            r0 = r1
        L86:
            com.forsale.app.datalayer.database.CategoryRuleSet$Level r0 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r0
            if (r0 == 0) goto Lb8
            int r5 = r0.getLevel()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            int r0 = r5.intValue()
            com.forsale.app.features.postad.location.LocationLevels r2 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r2 = r2.getLevel()
            if (r0 <= r2) goto La0
            r0 = r3
            goto La1
        La0:
            r0 = 0
        La1:
            if (r0 == 0) goto La4
            r1 = r5
        La4:
            if (r1 == 0) goto Lb8
            int r5 = r1.intValue()
            int r5 = r5 - r3
            com.forsale.app.features.postad.location.LocationLevels$a r0 = com.forsale.app.features.postad.location.LocationLevels.Companion
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            com.forsale.app.features.postad.location.LocationLevels r5 = r0.a(r5)
            if (r5 == 0) goto Lb8
            goto Lba
        Lb8:
            com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.BLOCK
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel.L0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(LocationTreeNode locationTreeNode) {
        List<LocationTreeNode> a12;
        a12 = CollectionsKt___CollectionsKt.a1(this.f29830q0.getValue());
        if (a12.remove(locationTreeNode)) {
            a12.add(0, locationTreeNode);
        }
        this.f29830q0.setValue(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(boolean z11, LocationTreeNode locationTreeNode) {
        List<LocationTreeNode> a12;
        a12 = CollectionsKt___CollectionsKt.a1(this.f29830q0.getValue());
        if (z11) {
            a12.add(0, locationTreeNode);
        } else {
            a12.remove(locationTreeNode);
        }
        this.f29830q0.setValue(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b X0() {
        int y11;
        String c11 = this.f29824k0.a().c();
        List<LocationTreeNode> value = this.f29830q0.getValue();
        y11 = s.y(value, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (LocationTreeNode locationTreeNode : value) {
            arrayList.add(locationTreeNode.i());
        }
        a.b bVar = new a.b(c11, arrayList);
        this.f29826m0.m(new vi.a(this.f29834u0.getValue(), this.f29824k0.a().c(), bVar, this.f29838y0.getValue().booleanValue(), this.f29824k0.a().b(), this.f29824k0.a().d().c()));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0() {
        List a12;
        int e11;
        boolean z11;
        boolean z12;
        boolean z13;
        List<LocationTreeNode> h11;
        dc.a i11;
        boolean z14;
        List<LocationTreeNode> h12;
        dc.a i12;
        LocationTreeNode locationTreeNode;
        a12 = CollectionsKt___CollectionsKt.a1(this.f29830q0.getValue());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.f29830q0.getValue()) {
            Integer valueOf = Integer.valueOf(((LocationTreeNode) obj).i().h());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        e11 = i0.e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
        for (final Map.Entry entry : linkedHashMap.entrySet()) {
            LocationTreeNode value = this.f29828o0.getValue();
            if (value != null) {
                locationTreeNode = value.g(new l<LocationTreeNode, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$unifySelectedResults$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final Boolean invoke(LocationTreeNode it2) {
                        boolean z15;
                        o.i(it2, "it");
                        if (it2.i().e() == entry.getKey().intValue()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        return Boolean.valueOf(z15);
                    }
                });
            } else {
                locationTreeNode = null;
            }
            linkedHashMap2.put(locationTreeNode, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (true) {
            boolean z15 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (entry2.getKey() == null) {
                z15 = false;
            }
            if (z15) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            LocationTreeNode locationTreeNode2 = (LocationTreeNode) entry3.getKey();
            if (locationTreeNode2 != null && (i12 = locationTreeNode2.i()) != null && i12.g() == LocationLevels.REGION.getLevel()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                LocationTreeNode locationTreeNode3 = (LocationTreeNode) entry3.getKey();
                if (locationTreeNode3 != null && (h12 = locationTreeNode3.h()) != null && h12.size() == ((Collection) entry3.getValue()).size()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    a12.removeAll((Collection) entry3.getValue());
                    Object key = entry3.getKey();
                    o.f(key);
                    a12.add(key);
                }
            }
            LocationTreeNode locationTreeNode4 = (LocationTreeNode) entry3.getKey();
            if (locationTreeNode4 != null && (i11 = locationTreeNode4.i()) != null && i11.g() == LocationLevels.REGION.getLevel()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                LocationTreeNode locationTreeNode5 = (LocationTreeNode) entry3.getKey();
                if (locationTreeNode5 != null && (h11 = locationTreeNode5.h()) != null && h11.size() == ((Collection) entry3.getValue()).size()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    a12.removeAll((Collection) entry3.getValue());
                }
            }
        }
        this.f29830q0.setValue(a12);
    }

    public final void E0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LocationFilterViewModel$applyClicked$1(this, null), 3, null);
    }

    public final void G0(LocationTreeNode location) {
        o.i(location, "location");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LocationFilterViewModel$deleteRecentLocation$1(this, location, null), 3, null);
    }

    public final Flow<List<String>> H0() {
        return this.f29835v0;
    }

    public final MutableSharedFlow<a> I0() {
        return this.f29831r0;
    }

    public final a.b J0() {
        return this.f29824k0;
    }

    public final MutableStateFlow<LocationTreeNode> K0() {
        return this.f29828o0;
    }

    public final Flow<String> M0() {
        return this.f29829p0;
    }

    public final Flow<List<LocationTreeNode>> N0() {
        return this.f29837x0;
    }

    public final Flow<List<LocationTreeNode>> O0() {
        return this.f29836w0;
    }

    public final MutableStateFlow<Boolean> P0() {
        return this.f29832s0;
    }

    public final Flow<Boolean> Q0() {
        return this.f29833t0;
    }

    public final MutableStateFlow<String> R0() {
        return this.f29834u0;
    }

    public final MutableStateFlow<List<LocationTreeNode>> S0() {
        return this.f29830q0;
    }

    public final void T0() {
        List<LocationTreeNode> n11;
        List<LocationTreeNode> f11;
        LocationTreeNode value = this.f29828o0.getValue();
        if (value != null && (f11 = value.f(new l<LocationTreeNode, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$onResetClicked$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(LocationTreeNode it2) {
                o.i(it2, "it");
                return Boolean.valueOf(it2.l());
            }
        })) != null) {
            for (LocationTreeNode locationTreeNode : f11) {
                if (locationTreeNode.l()) {
                    locationTreeNode.p(false);
                }
            }
        }
        MutableStateFlow<List<LocationTreeNode>> mutableStateFlow = this.f29830q0;
        n11 = r.n();
        mutableStateFlow.setValue(n11);
        this.f29832s0.setValue(Boolean.TRUE);
    }

    public final void W0(LocationTreeNode location) {
        o.i(location, "location");
        this.f29826m0.n(new vi.b(this.f29824k0.a().c(), location.i().c(), this.f29824k0.a().d().c(), this.f29824k0.a().b()));
    }

    public final void Y0(String keyword) {
        o.i(keyword, "keyword");
        this.f29834u0.setValue(keyword);
        this.f29838y0.setValue(Boolean.TRUE);
    }
}
