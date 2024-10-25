package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listings.filtration.full.filterModels.ParentGroupModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import com.forsale.app.utils.analytics.listingfiltration.a;
import dc.c;
import j0.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.l0;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: SelectableFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class SelectableFilterViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a.AbstractC0319a.b f30030k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f30031l0;

    /* renamed from: m0  reason: collision with root package name */
    private final boolean f30032m0;

    /* renamed from: n0  reason: collision with root package name */
    private final k0<LinkedHashMap<ParentGroupModel, List<dc.c>>> f30033n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SnapshotStateList<dc.c> f30034o0;

    /* renamed from: p0  reason: collision with root package name */
    private final k0<Boolean> f30035p0;

    /* renamed from: q0  reason: collision with root package name */
    private final k0<Boolean> f30036q0;

    /* renamed from: r0  reason: collision with root package name */
    private final k0<String> f30037r0;

    /* renamed from: s0  reason: collision with root package name */
    private final k0<Boolean> f30038s0;

    /* renamed from: t0  reason: collision with root package name */
    private final wz.h f30039t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MutableStateFlow<List<Integer>> f30040u0;

    /* renamed from: v0  reason: collision with root package name */
    private final MutableSharedFlow<a> f30041v0;

    /* renamed from: w0  reason: collision with root package name */
    private final Flow<Boolean> f30042w0;

    /* renamed from: x0  reason: collision with root package name */
    private final dc.c f30043x0;

    /* renamed from: y0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f30044y0;

    /* compiled from: SelectableFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: SelectableFilterViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0334a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final fc.c f30052a;

            public C0334a(fc.c filterResult) {
                o.i(filterResult, "filterResult");
                this.f30052a = filterResult;
            }

            public final fc.c a() {
                return this.f30052a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0334a) && o.d(this.f30052a, ((C0334a) obj).f30052a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f30052a.hashCode();
            }

            public String toString() {
                fc.c cVar = this.f30052a;
                return "ApplyFilter(filterResult=" + cVar + ")";
            }
        }
    }

    /* compiled from: SelectableFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        SelectableFilterViewModel a(a.AbstractC0319a.b bVar);
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

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((dc.c) t11).d()), Integer.valueOf(((dc.c) t12).d()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(((dc.c) t12).l().getValue(), ((dc.c) t11).l().getValue());
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((ParentGroupModel) ((Pair) t11).c()).e()), Integer.valueOf(((ParentGroupModel) ((Pair) t12).c()).e()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class g<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int i11;
            int a11;
            Iterable<dc.c> iterable = (Iterable) ((Pair) t12).d();
            int i12 = 0;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (dc.c cVar : iterable) {
                    if (cVar.l().getValue().booleanValue() && (i11 = i11 + 1) < 0) {
                        r.w();
                    }
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            Iterable<dc.c> iterable2 = (Iterable) ((Pair) t11).d();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (dc.c cVar2 : iterable2) {
                    if (cVar2.l().getValue().booleanValue() && (i12 = i12 + 1) < 0) {
                        r.w();
                    }
                }
            }
            a11 = yz.b.a(valueOf, Integer.valueOf(i12));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class h<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((dc.c) t11).d()), Integer.valueOf(((dc.c) t12).d()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class i<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(((dc.c) t12).l().getValue(), ((dc.c) t11).l().getValue());
            return a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableFilterViewModel(a.AbstractC0319a.b filtrationClickCapsule, ListingsFiltrationAnalytics filtrationAnalytics, BaseRepository baseRepository) {
        super(baseRepository);
        k0<LinkedHashMap<ParentGroupModel, List<dc.c>>> e11;
        boolean z11;
        k0<Boolean> e12;
        k0<Boolean> e13;
        k0<String> e14;
        k0<Boolean> e15;
        wz.h a11;
        int y11;
        o.i(filtrationClickCapsule, "filtrationClickCapsule");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(baseRepository, "baseRepository");
        this.f30030k0 = filtrationClickCapsule;
        this.f30031l0 = filtrationAnalytics;
        FilterViewType a12 = filtrationClickCapsule.a().d().a();
        o.g(a12, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType.FilterSelectionViewType");
        boolean a13 = ((FilterViewType.FilterSelectionViewType) a12).a();
        this.f30032m0 = a13;
        e11 = c0.e(new LinkedHashMap(), null, 2, null);
        this.f30033n0 = e11;
        this.f30034o0 = z.f();
        if (filtrationClickCapsule.a().d().d() && !a13) {
            z11 = true;
        } else {
            z11 = false;
        }
        e12 = c0.e(Boolean.valueOf(z11), null, 2, null);
        this.f30035p0 = e12;
        e13 = c0.e(Boolean.valueOf(filtrationClickCapsule.a().d().b()), null, 2, null);
        this.f30036q0 = e13;
        e14 = c0.e("", null, 2, null);
        this.f30037r0 = e14;
        e15 = c0.e(Boolean.FALSE, null, 2, null);
        this.f30038s0 = e15;
        a11 = kotlin.d.a(new g00.a<k0<String>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$randomText$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final k0<String> invoke() {
                List H0;
                Object G0;
                k0<String> e16;
                List A;
                if (SelectableFilterViewModel.this.S0().getValue().booleanValue()) {
                    Collection<List<c>> values = SelectableFilterViewModel.this.D0().getValue().values();
                    o.h(values, "<get-values>(...)");
                    A = s.A(values);
                    H0 = A;
                } else {
                    H0 = SelectableFilterViewModel.this.H0();
                }
                G0 = CollectionsKt___CollectionsKt.G0(H0, Random.f61810a);
                e16 = c0.e(((c) G0).f(), null, 2, null);
                return e16;
            }
        });
        this.f30039t0 = a11;
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
        this.f30040u0 = MutableStateFlow;
        this.f30041v0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f30042w0 = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f30047a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ SelectableFilterViewModel f30048b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2", f = "SelectableFilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f30049a;

                    /* renamed from: b  reason: collision with root package name */
                    int f30050b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f30049a = obj;
                        this.f30050b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SelectableFilterViewModel selectableFilterViewModel) {
                    this.f30047a = flowCollector;
                    this.f30048b = selectableFilterViewModel;
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
                        boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f30050b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f30050b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f30049a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f30050b
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
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f30047a
                        java.util.List r6 = (java.util.List) r6
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel r2 = r5.f30048b
                        boolean r2 = r2.U0()
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
                        r0.f30050b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L63
                        return r1
                    L63:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
        this.f30043x0 = this.f30032m0 ? dc.c.f54134l.a(!MutableStateFlow.getValue().isEmpty()) : null;
        Q0();
        this.f30044y0 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dc.c> A0() {
        if (this.f30035p0.getValue().booleanValue()) {
            return L0();
        }
        return O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<dc.c> L0() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel.L0():java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> M0(List<dc.c> list) {
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

    private final List<dc.c> O0() {
        SnapshotStateList<dc.c> snapshotStateList = this.f30034o0;
        ArrayList arrayList = new ArrayList();
        for (dc.c cVar : snapshotStateList) {
            if (cVar.l().getValue().booleanValue()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private final void Q0() {
        if (this.f30035p0.getValue().booleanValue() && !this.f30032m0) {
            c1();
        } else {
            d1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0() {
        List A;
        if (this.f30035p0.getValue().booleanValue()) {
            Collection<List<dc.c>> values = this.f30033n0.getValue().values();
            o.h(values, "<get-values>(...)");
            A = s.A(values);
            List<dc.c> list = A;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (dc.c cVar : list) {
                    if (!cVar.l().getValue().booleanValue()) {
                        return false;
                    }
                }
            }
        } else {
            SnapshotStateList<dc.c> snapshotStateList = this.f30034o0;
            if (!(snapshotStateList instanceof Collection) || !snapshotStateList.isEmpty()) {
                for (dc.c cVar2 : snapshotStateList) {
                    if (!cVar2.l().getValue().booleanValue()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.d X0(List<dc.c> list, String str) {
        int y11;
        String c11 = this.f30030k0.a().c();
        List<dc.c> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (dc.c cVar : list2) {
            arrayList.add(cVar.h());
        }
        a.d dVar = new a.d(c11, arrayList);
        this.f30031l0.m(new vi.a(str, c11, dVar, this.f30038s0.getValue().booleanValue(), this.f30030k0.a().b(), this.f30030k0.a().d().c()));
        return dVar;
    }

    private final void Y0(List<dc.c> list) {
        boolean z11;
        for (dc.c cVar : list) {
            k0<Boolean> l11 = cVar.l();
            if (this.f30032m0 && cVar.e() == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            l11.setValue(Boolean.valueOf(z11));
        }
    }

    private final void c1() {
        a.AbstractC0319a.b.C0322b c0322b;
        List<ParentGroupModel> list;
        List<dc.c> M0;
        int y11;
        int e11;
        int d11;
        int e12;
        List A;
        List M02;
        List M03;
        int y12;
        List M04;
        List M05;
        boolean z11;
        ParentGroupModel parentGroupModel;
        dc.c cVar;
        Object obj;
        boolean z12;
        a.AbstractC0319a.b bVar = this.f30030k0;
        if (bVar instanceof a.AbstractC0319a.b.C0322b) {
            c0322b = (a.AbstractC0319a.b.C0322b) bVar;
        } else {
            c0322b = null;
        }
        if (c0322b != null) {
            list = c0322b.c();
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f30030k0.b()) {
            if (true ^ ((dc.c) obj2).l().getValue().booleanValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : this.f30030k0.b()) {
            if (((dc.c) obj3).l().getValue().booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        ArrayList<dc.c> arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean z13 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((dc.c) next).i() != null) {
                z13 = true;
            }
            if (z13) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (dc.c cVar2 : arrayList3) {
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        int a11 = ((ParentGroupModel) obj).a();
                        Integer i11 = cVar2.i();
                        if (i11 != null && a11 == i11.intValue()) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (z12) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                parentGroupModel = (ParentGroupModel) obj;
            } else {
                parentGroupModel = null;
            }
            if (parentGroupModel != null) {
                cVar = dc.c.b(cVar2, null, null, null, 0, null, parentGroupModel.b(), parentGroupModel.d(), parentGroupModel.c(), 0, null, null, 1823, null);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList4.add(cVar);
            }
        }
        M0 = CollectionsKt___CollectionsKt.M0(arrayList4, new c());
        if (list != null) {
            List<ParentGroupModel> list2 = list;
            y11 = s.y(list2, 10);
            e11 = i0.e(y11);
            d11 = m00.o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (Object obj4 : list2) {
                ParentGroupModel parentGroupModel2 = (ParentGroupModel) obj4;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayList) {
                    Integer i12 = ((dc.c) obj5).i();
                    int a12 = parentGroupModel2.a();
                    if (i12 != null && i12.intValue() == a12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList5.add(obj5);
                    }
                }
                M04 = CollectionsKt___CollectionsKt.M0(arrayList5, new d());
                M05 = CollectionsKt___CollectionsKt.M0(M04, new e());
                linkedHashMap.put(obj4, M05);
            }
            e12 = i0.e(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e12);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Iterable<dc.c> iterable = (Iterable) entry.getValue();
                y12 = s.y(iterable, 10);
                ArrayList arrayList6 = new ArrayList(y12);
                for (dc.c cVar3 : iterable) {
                    int a13 = ((ParentGroupModel) entry.getKey()).a();
                    arrayList6.add(dc.c.b(cVar3, null, null, null, 0, Integer.valueOf(a13), ((ParentGroupModel) entry.getKey()).b(), ((ParentGroupModel) entry.getKey()).d(), ((ParentGroupModel) entry.getKey()).c(), 0, null, null, 1807, null));
                }
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(arrayList6);
                linkedHashMap2.put(key, snapshotStateList);
            }
            A = l0.A(linkedHashMap2);
            M02 = CollectionsKt___CollectionsKt.M0(A, new f());
            M03 = CollectionsKt___CollectionsKt.M0(M02, new g());
            LinkedHashMap<ParentGroupModel, List<dc.c>> linkedHashMap3 = new LinkedHashMap<>();
            linkedHashMap3.put(dc.b.a(), M0);
            j0.r(linkedHashMap3, M03);
            this.f30033n0.setValue(linkedHashMap3);
        }
    }

    private final void d1() {
        List<Integer> e11;
        dc.c cVar = this.f30043x0;
        if (cVar != null) {
            this.f30034o0.add(cVar);
            if (cVar.l().getValue().booleanValue()) {
                MutableStateFlow<List<Integer>> mutableStateFlow = this.f30040u0;
                e11 = q.e(Integer.valueOf(cVar.e()));
                mutableStateFlow.setValue(e11);
            }
        }
        this.f30034o0.addAll(e1(this.f30030k0.b()));
    }

    private final List<dc.c> e1(List<dc.c> list) {
        List M0;
        List<dc.c> M02;
        if (!this.f30032m0) {
            M0 = CollectionsKt___CollectionsKt.M0(list, new h());
            M02 = CollectionsKt___CollectionsKt.M0(M0, new i());
            return M02;
        }
        return list;
    }

    public final MutableSharedFlow<a> B0() {
        return this.f30041v0;
    }

    public final a.AbstractC0319a.b C0() {
        return this.f30030k0;
    }

    public final k0<LinkedHashMap<ParentGroupModel, List<dc.c>>> D0() {
        return this.f30033n0;
    }

    public final k0<Boolean> E0() {
        return this.f30036q0;
    }

    public final k0<String> G0() {
        return this.f30037r0;
    }

    public final SnapshotStateList<dc.c> H0() {
        return this.f30034o0;
    }

    public final k0<String> I0() {
        return (k0) this.f30039t0.getValue();
    }

    public final MutableStateFlow<Boolean> J0() {
        return this.f30044y0;
    }

    public final Flow<Boolean> K0() {
        return this.f30042w0;
    }

    public final MutableStateFlow<List<Integer>> N0() {
        return this.f30040u0;
    }

    public final dc.c P0() {
        return this.f30043x0;
    }

    public final k0<Boolean> S0() {
        return this.f30035p0;
    }

    public final k0<Boolean> T0() {
        return this.f30038s0;
    }

    public final boolean U0() {
        return this.f30032m0;
    }

    public final void V0(dc.c option) {
        o.i(option, "option");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SelectableFilterViewModel$optionClicked$1(this, option, null), 3, null);
    }

    public final boolean W0(String searchKeyword) {
        List A;
        o.i(searchKeyword, "searchKeyword");
        Collection<List<dc.c>> values = this.f30033n0.getValue().values();
        o.h(values, "<get-values>(...)");
        A = s.A(values);
        List<dc.c> list = A;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (dc.c cVar : list) {
            if (dc.d.a(cVar, searchKeyword)) {
                return true;
            }
        }
        return false;
    }

    public final void Z0() {
        List<dc.c> A;
        if (this.f30035p0.getValue().booleanValue()) {
            Collection<List<dc.c>> values = this.f30033n0.getValue().values();
            o.h(values, "<get-values>(...)");
            A = s.A(values);
            Y0(A);
        } else {
            Y0(this.f30034o0);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SelectableFilterViewModel$resetFilters$1(this, null), 3, null);
    }

    public final boolean b1(dc.c selectableModel, String searchedText) {
        o.i(selectableModel, "selectableModel");
        o.i(searchedText, "searchedText");
        return dc.d.a(selectableModel, searchedText);
    }

    public final void z0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new SelectableFilterViewModel$applyFilters$1(this, null), 3, null);
    }
}
