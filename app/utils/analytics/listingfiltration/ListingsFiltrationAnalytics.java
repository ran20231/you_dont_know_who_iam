package com.forsale.app.utils.analytics.listingfiltration;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.postad.location.LocationLevels;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.listingfiltration.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import o00.f;
import wz.i;
/* compiled from: ListingsFiltrationAnalytics.kt */
/* loaded from: classes3.dex */
public final class ListingsFiltrationAnalytics {

    /* renamed from: a  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f40031a;

    public ListingsFiltrationAnalytics(AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(analyticsLogger, "analyticsLogger");
        this.f40031a = analyticsLogger;
    }

    private final Map<String, List<String>> b(List<dc.a> list) {
        int y11;
        List c02;
        int y12;
        List c03;
        int y13;
        Map o11;
        Map o12;
        Map<String, List<String>> o13;
        String t02;
        boolean z11;
        List Q0;
        String t03;
        Object m02;
        List F0;
        List<dc.a> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList<List> arrayList = new ArrayList(y11);
        for (dc.a aVar : list2) {
            F0 = StringsKt__StringsKt.F0(aVar.c(), new String[]{", "}, false, 0, 6, null);
            arrayList.add(F0);
        }
        ArrayList arrayList2 = new ArrayList();
        for (List list3 : arrayList) {
            m02 = CollectionsKt___CollectionsKt.m0(list3);
            String str = (String) m02;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        c02 = CollectionsKt___CollectionsKt.c0(arrayList2);
        ArrayList<List> arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z12 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((List) next).size() >= 2) {
                z12 = true;
            }
            if (z12) {
                arrayList3.add(next);
            }
        }
        y12 = s.y(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(y12);
        for (List list4 : arrayList3) {
            Q0 = CollectionsKt___CollectionsKt.Q0(list4, 2);
            t03 = CollectionsKt___CollectionsKt.t0(Q0, ", ", null, null, 0, null, null, 62, null);
            arrayList4.add(t03);
        }
        c03 = CollectionsKt___CollectionsKt.c0(arrayList4);
        ArrayList<List> arrayList5 = new ArrayList();
        for (Object obj : arrayList) {
            if (((List) obj).size() == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList5.add(obj);
            }
        }
        y13 = s.y(arrayList5, 10);
        ArrayList arrayList6 = new ArrayList(y13);
        for (List list5 : arrayList5) {
            t02 = CollectionsKt___CollectionsKt.t0(list5, ", ", null, null, 0, null, null, 62, null);
            arrayList6.add(t02);
        }
        o11 = j0.o(new LinkedHashMap(), !(!c02.isEmpty()) ? j0.h() : i0.f(i.a("DistrictLevel" + LocationLevels.DISTRICT.getLevel(), c02)));
        o12 = j0.o(o11, !(!c03.isEmpty()) ? j0.h() : i0.f(i.a("DistrictLevel" + LocationLevels.AREA.getLevel(), c03)));
        o13 = j0.o(o12, !(!arrayList6.isEmpty()) ? j0.h() : i0.f(i.a("DistrictLevel" + LocationLevels.BLOCK.getLevel(), arrayList6)));
        return o13;
    }

    private final Map<String, List<String>> c(List<? extends a> list) {
        int y11;
        Map<String, List<String>> f11;
        List<? extends a> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (a aVar : list2) {
            if (aVar instanceof a.d) {
                f11 = i0.f(i.a(aVar.a(), ((a.d) aVar).b()));
            } else if (aVar instanceof a.b) {
                f11 = b(((a.b) aVar).b());
            } else {
                f11 = aVar instanceof a.C0456a ? i0.f(i.a(aVar.a(), ((a.C0456a) aVar).b())) : j0.h();
            }
            arrayList.add(f11);
        }
        return j(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r12, java.util.List<? extends com.forsale.app.utils.analytics.listingfiltration.a> r13, boolean r14, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.d(int, java.util.List, boolean, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object e(ListingsFiltrationAnalytics listingsFiltrationAnalytics, int i11, List list, boolean z11, zz.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return listingsFiltrationAnalytics.d(i11, list, z11, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0164, code lost:
        if (r9 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> f(com.forsale.app.utils.analytics.listingfiltration.a r9) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.f(com.forsale.app.utils.analytics.listingfiltration.a):java.util.Map");
    }

    private final Map<String, Object> h(List<? extends a> list) {
        Pair pair;
        List s11;
        Map t11;
        Integer from;
        Integer to2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<a.c> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a.c) {
                arrayList.add(obj);
            }
        }
        for (a.c cVar : arrayList) {
            GetListingsBody.FiltrationData.Range b11 = cVar.b();
            Pair pair2 = null;
            if (b11 != null && (to2 = b11.getTo()) != null) {
                int intValue = to2.intValue();
                pair = i.a(cVar.a() + "To", Integer.valueOf(intValue));
            } else {
                pair = null;
            }
            GetListingsBody.FiltrationData.Range b12 = cVar.b();
            if (b12 != null && (from = b12.getFrom()) != null) {
                int intValue2 = from.intValue();
                pair2 = i.a(cVar.a() + "From", Integer.valueOf(intValue2));
            }
            s11 = r.s(pair, pair2);
            t11 = j0.t(s11);
            linkedHashMap.putAll(t11);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> Map<K, List<V>> j(List<? extends Map<K, ? extends List<? extends V>>> list) {
        f Z;
        f<Map.Entry> p11;
        int e11;
        List A;
        Z = CollectionsKt___CollectionsKt.Z(list);
        p11 = SequencesKt___SequencesKt.p(Z, ListingsFiltrationAnalytics$group$1.f40042a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : p11) {
            Object key = entry.getKey();
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(key, obj);
            }
            ((List) obj).add((List) entry.getValue());
        }
        e11 = i0.e(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            A = s.A((Iterable) entry2.getValue());
            linkedHashMap2.put(key2, A);
        }
        return linkedHashMap2;
    }

    private final void l(s9.a aVar) {
        AggregatedAllAnalyticsLogger.h(this.f40031a, aVar.e(), aVar.a(), null, null, null, aVar.c(), aVar.d(), aVar.b(), false, 284, null);
    }

    public final Map<String, Object> g(List<? extends a> filters) {
        int y11;
        Map h11;
        Map p11;
        Map p12;
        Map p13;
        Map o11;
        Map<String, Object> o12;
        o.i(filters, "filters");
        int size = filters.size();
        List<? extends a> list = filters;
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (a aVar : list) {
            arrayList.add(aVar.a());
        }
        h11 = j0.h();
        p11 = j0.p(h11, i.a("FiltersCount", Integer.valueOf(size)));
        p12 = j0.p(p11, i.a("FiltersNames", arrayList));
        p13 = j0.p(p12, i.a("ContainsFilters", Boolean.TRUE));
        o11 = j0.o(p13, c(filters));
        o12 = j0.o(o11, h(filters));
        return o12;
    }

    public final Map<String, Object> i(a filterAnalyticsType, int i11) {
        Map h11;
        Map p11;
        Map<String, Object> p12;
        o.i(filterAnalyticsType, "filterAnalyticsType");
        h11 = j0.h();
        p11 = j0.p(h11, i.a("LastAppliedFilterName", filterAnalyticsType.a()));
        p12 = j0.p(p11, i.a("LastAppliedFilterOrder", Integer.valueOf(i11)));
        return p12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r9, java.util.List<? extends com.forsale.app.utils.analytics.listingfiltration.a> r10, zz.a<? super wz.p> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1 r0 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1) r0
            int r1 = r0.f40046d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40046d = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1 r0 = new com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1
            r0.<init>(r8, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.f40044b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f40046d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r9 = r5.f40043a
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r9 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics) r9
            kotlin.f.b(r11)
            goto L4b
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            kotlin.f.b(r11)
            r4 = 0
            r6 = 4
            r7 = 0
            r5.f40043a = r8
            r5.f40046d = r2
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r11 = e(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L4a
            return r0
        L4a:
            r9 = r8
        L4b:
            r2 = r11
            java.util.Map r2 = (java.util.Map) r2
            s9.a r10 = new s9.a
            java.lang.String r1 = "Listings All Filters Apply Clicked"
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.l(r10)
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.k(int, java.util.List, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(vi.a r10) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.m(vi.a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a("FilterName", r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(vi.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "filterOptionDeleteClicked"
            kotlin.jvm.internal.o.i(r10, r0)
            java.util.Map r0 = kotlin.collections.g0.h()
            com.forsale.app.datalayer.database.CategoryEntity r1 = r10.a()
            if (r1 == 0) goto L1e
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r1 = r9.f40031a
            com.forsale.app.datalayer.database.CategoryEntity r2 = r10.a()
            java.util.List r1 = r1.v(r2)
            if (r1 == 0) goto L1e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            goto L24
        L1e:
            java.util.List r1 = kotlin.collections.p.n()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L24:
            java.util.Map r0 = kotlin.collections.g0.n(r0, r1)
            java.lang.String r1 = r10.b()
            if (r1 == 0) goto L3a
            java.lang.String r2 = "FilterName"
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L3e
        L3a:
            java.util.Map r1 = kotlin.collections.g0.h()
        L3e:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r1 = "OptionValue"
            java.lang.String r2 = r10.d()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r0 = kotlin.collections.g0.p(r0, r1)
            com.forsale.app.utils.analytics.listingfiltration.FilterPlaces r10 = r10.c()
            java.lang.String r10 = r10.getValue()
            java.lang.String r1 = "FiltersPlace"
            kotlin.Pair r10 = wz.i.a(r1, r10)
            java.util.Map r3 = kotlin.collections.g0.p(r0, r10)
            s9.a r10 = new s9.a
            java.lang.String r2 = "Filter Option Delete Clicked"
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.l(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.n(vi.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r11, zz.a<? super wz.p> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1 r0 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1) r0
            int r1 = r0.f40051e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40051e = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1 r0 = new com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f40049c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40051e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f40048b
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.f40047a
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r0 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics) r0
            kotlin.f.b(r12)
            goto L53
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            kotlin.f.b(r12)
            java.util.Map r12 = kotlin.collections.g0.h()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r2 = r10.f40031a
            r0.f40047a = r10
            r0.f40048b = r12
            r0.f40051e = r3
            java.lang.Object r11 = r2.s(r11, r0)
            if (r11 != r1) goto L4f
            return r1
        L4f:
            r0 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L53:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Map r3 = kotlin.collections.g0.n(r11, r12)
            s9.a r11 = new s9.a
            java.lang.String r2 = "Listings All Filters Clicked"
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.l(r11)
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.o(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(int r9, java.util.List<? extends com.forsale.app.utils.analytics.listingfiltration.a> r10, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r11, zz.a<? super wz.p> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logResetAllFiltersClicked$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logResetAllFiltersClicked$1 r0 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logResetAllFiltersClicked$1) r0
            int r1 = r0.f40056e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40056e = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logResetAllFiltersClicked$1 r0 = new com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics$logResetAllFiltersClicked$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f40054c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40056e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.f40053b
            r11 = r9
            com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r11 = (com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace) r11
            java.lang.Object r9 = r0.f40052a
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r9 = (com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics) r9
            kotlin.f.b(r12)
            goto L4c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.f.b(r12)
            r0.f40052a = r8
            r0.f40053b = r11
            r0.f40056e = r3
            r12 = 0
            java.lang.Object r12 = r8.d(r9, r10, r12, r0)
            if (r12 != r1) goto L4b
            return r1
        L4b:
            r9 = r8
        L4c:
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r10 = "FiltersPlace"
            java.lang.String r11 = r11.getKeyName()
            kotlin.Pair r10 = wz.i.a(r10, r11)
            java.util.Map r2 = kotlin.collections.g0.p(r12, r10)
            s9.a r10 = new s9.a
            java.lang.String r1 = "Reset All Filters Clicked"
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.l(r10)
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics.p(int, java.util.List, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, zz.a):java.lang.Object");
    }
}
