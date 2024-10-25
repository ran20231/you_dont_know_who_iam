package com.forsale.adserver.datalayer.local.repos;

import a9.c;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import g9.d;
import java.util.List;
import kotlin.jvm.internal.o;
import x8.e;
import x8.g;
import x8.i;
import zz.a;
/* compiled from: DatabaseOffersRepo.kt */
/* loaded from: classes2.dex */
public final class DatabaseOffersRepo {

    /* renamed from: a  reason: collision with root package name */
    private final REGIONS f20683a;

    /* renamed from: b  reason: collision with root package name */
    private final i f20684b;

    /* renamed from: c  reason: collision with root package name */
    private final e f20685c;

    /* renamed from: d  reason: collision with root package name */
    private final c f20686d;

    /* renamed from: e  reason: collision with root package name */
    private final g f20687e;

    public DatabaseOffersRepo(REGIONS regions, i offersTable, e categoriesDao, c dbCategoryMapper, g masterCategoriesDao) {
        o.i(regions, "regions");
        o.i(offersTable, "offersTable");
        o.i(categoriesDao, "categoriesDao");
        o.i(dbCategoryMapper, "dbCategoryMapper");
        o.i(masterCategoriesDao, "masterCategoriesDao");
        this.f20683a = regions;
        this.f20684b = offersTable;
        this.f20685c = categoriesDao;
        this.f20686d = dbCategoryMapper;
        this.f20687e = masterCategoriesDao;
    }

    public Object a(a<? super List<d>> aVar) {
        return this.f20684b.c(aVar);
    }

    public Object b(int i11, a<? super List<d>> aVar) {
        return this.f20684b.f(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r5, int r6, zz.a<? super java.util.List<g9.d>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryAllOffersByCategoryId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryAllOffersByCategoryId$1 r0 = (com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryAllOffersByCategoryId$1) r0
            int r1 = r0.f20690c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20690c = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryAllOffersByCategoryId$1 r0 = new com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryAllOffersByCategoryId$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20688a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20690c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            x8.i r7 = r4.f20684b
            r0.f20690c = r3
            java.lang.Object r7 = r7.g(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.p.y(r7, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L50:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r6.next()
            g9.d r7 = (g9.d) r7
            com.forsale.adserver.utils.LocaleManager r0 = com.forsale.adserver.utils.LocaleManager.f20849a
            boolean r0 = r0.j()
            if (r0 == 0) goto L69
            java.lang.String r0 = r7.g()
            goto L6d
        L69:
            java.lang.String r0 = r7.h()
        L6d:
            r7.r(r0)
            r5.add(r7)
            goto L50
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo.c(int, int, zz.a):java.lang.Object");
    }

    public Object d(int i11, int i12, a<? super List<d>> aVar) {
        return this.f20684b.e(i11, i12, aVar);
    }

    public Object e(Integer num, int i11, a<? super List<d>> aVar) {
        if (num == null) {
            return d(this.f20683a.getRegionId(), i11, aVar);
        }
        return this.f20684b.i(num.intValue(), i11, aVar);
    }

    public Object f(int i11, a<? super List<d>> aVar) {
        return this.f20684b.n(i11, aVar);
    }

    public Object g(int i11, a<? super List<Integer>> aVar) {
        return this.f20687e.a(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(int r5, int r6, zz.a<? super g9.d> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOfferWith$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOfferWith$1 r0 = (com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOfferWith$1) r0
            int r1 = r0.f20693c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20693c = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOfferWith$1 r0 = new com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOfferWith$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20691a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20693c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            x8.i r7 = r4.f20684b
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            java.util.List r6 = kotlin.collections.p.e(r6)
            r0.f20693c = r3
            java.lang.Object r7 = r7.m(r5, r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = kotlin.collections.p.m0(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo.h(int, int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[LOOP:0: B:19:0x0057->B:21:0x005d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(zz.a<? super java.util.List<g9.e>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOffersCategory$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOffersCategory$1 r0 = (com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOffersCategory$1) r0
            int r1 = r0.f20697d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20697d = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOffersCategory$1 r0 = new com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo$queryOffersCategory$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20695b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20697d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f20694a
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo r0 = (com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo) r0
            kotlin.f.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            x8.e r5 = r4.f20685c
            r0.f20694a = r4
            r0.f20697d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.p.y(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L57:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r5.next()
            z8.b r2 = (z8.b) r2
            a9.c r3 = r0.f20686d
            g9.e r2 = r3.a(r2)
            r1.add(r2)
            goto L57
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo.i(zz.a):java.lang.Object");
    }

    public Object j(List<Integer> list, Integer num, a<? super List<Integer>> aVar) {
        if (list.isEmpty() && num == null) {
            return this.f20684b.d(this.f20683a.getRegionId(), aVar);
        }
        List<Integer> list2 = list;
        if ((!list2.isEmpty()) && num == null) {
            return this.f20684b.k(list, aVar);
        }
        if (list.isEmpty() && num != null) {
            return this.f20684b.b(num.intValue(), aVar);
        }
        if ((!list2.isEmpty()) && num != null) {
            return this.f20684b.l(list, num.intValue(), aVar);
        }
        throw new IllegalStateException("no more options on getting offersIds");
    }

    public Object k(int i11, List<Integer> list, a<? super List<d>> aVar) {
        return this.f20684b.m(i11, list, aVar);
    }

    public Object l(List<Integer> list, Integer num, int i11, a<? super List<d>> aVar) {
        if (num == null) {
            return this.f20684b.a(list, i11, aVar);
        }
        return this.f20684b.h(list, num.intValue(), i11, aVar);
    }

    public Object m(int i11, int i12, a<? super List<d>> aVar) {
        return this.f20684b.j(i11, i12, aVar);
    }
}
