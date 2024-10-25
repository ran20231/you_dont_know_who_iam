package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.RecentLocationsEntity;
import com.forsale.app.datalayer.database.RecentLocationsEntityKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
/* compiled from: FiltersRepository.kt */
/* loaded from: classes2.dex */
public final class FiltersRepository {
    public static final int $stable = 8;
    private final jj.b prefs;
    private final RecentFilterLocationsDao recentLocationDao;

    public FiltersRepository(jj.b prefs, RecentFilterLocationsDao recentLocationDao) {
        o.i(prefs, "prefs");
        o.i(recentLocationDao, "recentLocationDao");
        this.prefs = prefs;
        this.recentLocationDao = recentLocationDao;
    }

    public final Object addToRecentLocations(int i11, List<dc.a> list, zz.a<? super p> aVar) {
        int y11;
        List<dc.a> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (dc.a aVar2 : list2) {
            arrayList.add(RecentLocationsEntityKt.mapToRecentLocationEntity(aVar2, i11));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            this.recentLocationDao.insert(arrayList);
        }
        return p.f75480a;
    }

    public final Object deleteRecentLocation(int i11, zz.a<? super p> aVar) {
        this.recentLocationDao.deleteRecentLocations(i11);
        return p.f75480a;
    }

    public final Flow<List<dc.a>> getRecentLocations(int i11) {
        final Flow<List<RecentLocationsEntity>> recentLocations = this.recentLocationDao.getRecentLocations(i11);
        return new Flow<List<? extends dc.a>>() { // from class: com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2", f = "FiltersRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2$1 r0 = (com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2$1 r0 = new com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = kotlin.collections.p.y(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L49:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5d
                        java.lang.Object r4 = r6.next()
                        com.forsale.app.datalayer.database.RecentLocationsEntity r4 = (com.forsale.app.datalayer.database.RecentLocationsEntity) r4
                        dc.a r4 = com.forsale.app.datalayer.database.RecentLocationsEntityKt.mapToLocationFilterModel(r4)
                        r2.add(r4)
                        goto L49
                    L5d:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L66
                        return r1
                    L66:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FiltersRepository$getRecentLocations$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends dc.a>> flowCollector, zz.a aVar) {
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

    public final Object isTutorialViewed(String str, zz.a<? super Boolean> aVar) {
        return this.prefs.e().e(str, aVar);
    }

    public final Object setTutorialViewed(boolean z11, String str, zz.a<? super p> aVar) {
        Object f11;
        Object j11 = this.prefs.e().j(z11, str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (j11 == f11) {
            return j11;
        }
        return p.f75480a;
    }
}
