package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import com.forsale.app.utils.analytics.listingfiltration.a;
import j0.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: HorizontalFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class HorizontalFilterViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a.AbstractC0319a.C0320a f29674k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f29675l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SnapshotStateList<dc.c> f29676m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableStateFlow<List<Integer>> f29677n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableSharedFlow<a> f29678o0;

    /* renamed from: p0  reason: collision with root package name */
    private final Flow<Boolean> f29679p0;

    /* renamed from: q0  reason: collision with root package name */
    private final boolean f29680q0;

    /* renamed from: r0  reason: collision with root package name */
    private final dc.c f29681r0;

    /* compiled from: HorizontalFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: HorizontalFilterViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0329a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final fc.c f29689a;

            public C0329a(fc.c filterResult) {
                o.i(filterResult, "filterResult");
                this.f29689a = filterResult;
            }

            public final fc.c a() {
                return this.f29689a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0329a) && o.d(this.f29689a, ((C0329a) obj).f29689a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f29689a.hashCode();
            }

            public String toString() {
                fc.c cVar = this.f29689a;
                return "ApplyFilter(filterResult=" + cVar + ")";
            }
        }

        /* compiled from: HorizontalFilterViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f29690a = new b();

            private b() {
            }
        }
    }

    /* compiled from: HorizontalFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        HorizontalFilterViewModel a(a.AbstractC0319a.C0320a c0320a);
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((dc.c) t11).d()), Integer.valueOf(((dc.c) t12).d()));
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFilterViewModel(a.AbstractC0319a.C0320a filtrationClickCapsule, ListingsFiltrationAnalytics filtrationAnalytics, BaseRepository baseRepository) {
        super(baseRepository);
        int y11;
        o.i(filtrationClickCapsule, "filtrationClickCapsule");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(baseRepository, "baseRepository");
        this.f29674k0 = filtrationClickCapsule;
        this.f29675l0 = filtrationAnalytics;
        this.f29676m0 = z.f();
        ArrayList<dc.c> arrayList = new ArrayList();
        for (Object obj : filtrationClickCapsule.b()) {
            if (((dc.c) obj).l().getValue().booleanValue()) {
                arrayList.add(obj);
            }
        }
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (dc.c cVar : arrayList) {
            arrayList2.add(Integer.valueOf(cVar.e()));
        }
        final MutableStateFlow<List<Integer>> MutableStateFlow = StateFlowKt.MutableStateFlow(arrayList2);
        this.f29677n0 = MutableStateFlow;
        this.f29678o0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f29679p0 = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29684a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ HorizontalFilterViewModel f29685b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2", f = "HorizontalFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29686a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29687b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29686a = obj;
                        this.f29687b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, HorizontalFilterViewModel horizontalFilterViewModel) {
                    this.f29684a = flowCollector;
                    this.f29685b = horizontalFilterViewModel;
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
                        boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29687b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29687b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f29686a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29687b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L63
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f29684a
                        java.util.List r6 = (java.util.List) r6
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel r2 = r5.f29685b
                        boolean r2 = r2.L0()
                        r4 = 0
                        if (r2 == 0) goto L4d
                        r2 = -1
                        java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
                        boolean r6 = r6.contains(r2)
                        if (r6 != 0) goto L56
                        goto L55
                    L4d:
                        java.util.Collection r6 = (java.util.Collection) r6
                        boolean r6 = r6.isEmpty()
                        if (r6 != 0) goto L56
                    L55:
                        r4 = r3
                    L56:
                        java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r4)
                        r0.f29687b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L63
                        return r1
                    L63:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
        };
        FilterViewType a11 = this.f29674k0.a().d().a();
        o.g(a11, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType");
        boolean a12 = ((FilterViewType.FilterSelectionViewType) a11).a();
        this.f29680q0 = a12;
        this.f29681r0 = a12 ? dc.c.f54134l.a(!MutableStateFlow.getValue().isEmpty()) : null;
        J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dc.c> A0() {
        SnapshotStateList<dc.c> snapshotStateList = this.f29676m0;
        ArrayList arrayList = new ArrayList();
        for (dc.c cVar : snapshotStateList) {
            if (cVar.l().getValue().booleanValue()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> G0(List<dc.c> list) {
        List<Integer> n11;
        int y11;
        List<Integer> A;
        if (list != null) {
            List<dc.c> list2 = list;
            y11 = s.y(list2, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (dc.c cVar : list2) {
                arrayList.add(cVar.c());
            }
            A = s.A(arrayList);
            if (A != null) {
                return A;
            }
        }
        n11 = r.n();
        return n11;
    }

    private final void J0() {
        List M0;
        List<Integer> e11;
        dc.c cVar = this.f29681r0;
        if (cVar != null) {
            this.f29676m0.add(cVar);
            if (cVar.l().getValue().booleanValue()) {
                MutableStateFlow<List<Integer>> mutableStateFlow = this.f29677n0;
                e11 = q.e(Integer.valueOf(cVar.e()));
                mutableStateFlow.setValue(e11);
            }
        }
        SnapshotStateList<dc.c> snapshotStateList = this.f29676m0;
        M0 = CollectionsKt___CollectionsKt.M0(this.f29674k0.b(), new c());
        snapshotStateList.addAll(M0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K0() {
        SnapshotStateList<dc.c> snapshotStateList = this.f29676m0;
        if ((snapshotStateList instanceof Collection) && snapshotStateList.isEmpty()) {
            return true;
        }
        for (dc.c cVar : snapshotStateList) {
            if (!cVar.l().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.d N0(List<dc.c> list) {
        int y11;
        String c11 = this.f29674k0.a().c();
        List<dc.c> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (dc.c cVar : list2) {
            arrayList.add(cVar.h());
        }
        a.d dVar = new a.d(c11, arrayList);
        this.f29675l0.m(new vi.a("", c11, dVar, false, this.f29674k0.a().b(), this.f29674k0.a().d().c()));
        return dVar;
    }

    private final void O0(List<dc.c> list) {
        boolean z11;
        for (dc.c cVar : list) {
            k0<Boolean> l11 = cVar.l();
            if (this.f29680q0 && cVar.e() == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            l11.setValue(Boolean.valueOf(z11));
        }
    }

    public final MutableSharedFlow<a> B0() {
        return this.f29678o0;
    }

    public final a.AbstractC0319a.C0320a C0() {
        return this.f29674k0;
    }

    public final SnapshotStateList<dc.c> D0() {
        return this.f29676m0;
    }

    public final Flow<Boolean> E0() {
        return this.f29679p0;
    }

    public final MutableStateFlow<List<Integer>> H0() {
        return this.f29677n0;
    }

    public final dc.c I0() {
        return this.f29681r0;
    }

    public final boolean L0() {
        return this.f29680q0;
    }

    public final void M0(dc.c option) {
        o.i(option, "option");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new HorizontalFilterViewModel$optionClicked$1(this, option, null), 3, null);
    }

    public final void P0() {
        O0(this.f29676m0);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new HorizontalFilterViewModel$resetFilters$1(this, null), 3, null);
    }

    public final void z0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new HorizontalFilterViewModel$applyFilters$1(this, null), 3, null);
    }
}
