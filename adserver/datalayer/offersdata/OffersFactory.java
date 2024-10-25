package com.forsale.adserver.datalayer.offersdata;

import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import com.forsale.adserver.datalayer.local.repos.ApiOffersRepo;
import com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo;
import g9.d;
import g9.e;
import java.util.List;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: CreateOffer.kt */
/* loaded from: classes2.dex */
public final class OffersFactory {

    /* renamed from: a  reason: collision with root package name */
    private final REGIONS f20744a;

    /* renamed from: b  reason: collision with root package name */
    private final DatabaseOffersRepo f20745b;

    /* renamed from: c  reason: collision with root package name */
    private final ApiOffersRepo f20746c;

    public OffersFactory(REGIONS region, DatabaseOffersRepo databaseOffersRepo, ApiOffersRepo apiOffersRepo) {
        o.i(region, "region");
        o.i(databaseOffersRepo, "databaseOffersRepo");
        o.i(apiOffersRepo, "apiOffersRepo");
        this.f20744a = region;
        this.f20745b = databaseOffersRepo;
        this.f20746c = apiOffersRepo;
    }

    public static /* synthetic */ Object k(OffersFactory offersFactory, List list, Integer num, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return offersFactory.j(list, num, aVar);
    }

    public final Object a(a<? super List<d>> aVar) {
        return this.f20745b.a(aVar);
    }

    public final Object b(int i11, a<? super List<d>> aVar) {
        return this.f20745b.b(i11, aVar);
    }

    public final Object c(Integer num, int i11, a<? super List<d>> aVar) {
        return this.f20745b.e(num, i11, aVar);
    }

    public final Object d(int i11, a<? super List<d>> aVar) {
        return this.f20745b.f(i11, aVar);
    }

    public final Object e(a<? super List<e>> aVar) {
        return this.f20745b.i(aVar);
    }

    public final Object f(int i11, a<? super List<Integer>> aVar) {
        return this.f20745b.g(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r6, int r7, zz.a<? super g9.d> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.adserver.datalayer.offersdata.OffersFactory$loadOfferById$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.adserver.datalayer.offersdata.OffersFactory$loadOfferById$1 r0 = (com.forsale.adserver.datalayer.offersdata.OffersFactory$loadOfferById$1) r0
            int r1 = r0.f20752f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20752f = r1
            goto L18
        L13:
            com.forsale.adserver.datalayer.offersdata.OffersFactory$loadOfferById$1 r0 = new com.forsale.adserver.datalayer.offersdata.OffersFactory$loadOfferById$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20750d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20752f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r7 = r0.f20749c
            int r6 = r0.f20748b
            java.lang.Object r2 = r0.f20747a
            com.forsale.adserver.datalayer.offersdata.OffersFactory r2 = (com.forsale.adserver.datalayer.offersdata.OffersFactory) r2
            kotlin.f.b(r8)
            goto L55
        L40:
            kotlin.f.b(r8)
            com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo r8 = r5.f20745b
            r0.f20747a = r5
            r0.f20748b = r6
            r0.f20749c = r7
            r0.f20752f = r4
            java.lang.Object r8 = r8.h(r7, r6, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r5
        L55:
            g9.d r8 = (g9.d) r8
            if (r8 != 0) goto L67
            com.forsale.adserver.datalayer.local.repos.ApiOffersRepo r8 = r2.f20746c
            r2 = 0
            r0.f20747a = r2
            r0.f20752f = r3
            java.lang.Object r8 = r8.a(r7, r6, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.datalayer.offersdata.OffersFactory.g(int, int, zz.a):java.lang.Object");
    }

    public final Object h(int i11, Integer num, a<? super List<d>> aVar) {
        int i12;
        DatabaseOffersRepo databaseOffersRepo = this.f20745b;
        if (num != null) {
            i12 = num.intValue();
        } else {
            i12 = -1;
        }
        return databaseOffersRepo.c(i11, i12, aVar);
    }

    public final Object i(List<Integer> list, int i11, a<? super List<d>> aVar) {
        return this.f20745b.k(i11, list, aVar);
    }

    public final Object j(List<Integer> list, Integer num, a<? super List<Integer>> aVar) {
        return this.f20745b.j(list, num, aVar);
    }

    public final Object l(List<Integer> list, Integer num, int i11, a<? super List<d>> aVar) {
        return this.f20745b.l(list, num, i11, aVar);
    }

    public final Object m(int i11, int i12, a<? super List<d>> aVar) {
        return this.f20745b.m(i11, i12, aVar);
    }
}
