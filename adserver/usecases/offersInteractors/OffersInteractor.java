package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.forsale.adserver.usecases.b;
import g9.d;
import g9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Deferred;
import zz.a;
/* compiled from: OffersInteractor.kt */
/* loaded from: classes2.dex */
public final class OffersInteractor extends b {

    /* renamed from: b  reason: collision with root package name */
    private final OffersFactory f20809b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f20810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor(REGIONS region, OffersFactory offersFactory, CoroutineDispatcher ioDispatcher) {
        super(region);
        o.i(region, "region");
        o.i(offersFactory, "offersFactory");
        o.i(ioDispatcher, "ioDispatcher");
        this.f20809b = offersFactory;
        this.f20810c = ioDispatcher;
    }

    private final Deferred<List<d>> f(List<d> list, Integer num) {
        Deferred<List<d>> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, this.f20810c, null, new OffersInteractor$concatAndShuffleOffers$1(this, num, list, null), 2, null);
        return async$default;
    }

    private final Object g(Integer num, a<? super List<d>> aVar) {
        if (num == null) {
            return this.f20809b.d(b(), aVar);
        }
        return this.f20809b.m(b(), num.intValue(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<d> o(List<d> list, List<d> list2) {
        int y11;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d dVar = (d) obj;
            List<d> list3 = list2;
            y11 = s.y(list3, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (d dVar2 : list3) {
                arrayList2.add(Integer.valueOf(dVar2.d()));
            }
            if (!arrayList2.contains(Integer.valueOf(dVar.d()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Integer r6, zz.a<? super java.util.List<g9.d>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.usecases.offersInteractors.OffersInteractor$shuffleWeightedOffersList$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$shuffleWeightedOffersList$1 r0 = (com.forsale.adserver.usecases.offersInteractors.OffersInteractor$shuffleWeightedOffersList$1) r0
            int r1 = r0.f20834d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20834d = r1
            goto L18
        L13:
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$shuffleWeightedOffersList$1 r0 = new com.forsale.adserver.usecases.offersInteractors.OffersInteractor$shuffleWeightedOffersList$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20832b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20834d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f20831a
            j9.g r6 = (j9.g) r6
            kotlin.f.b(r7)
            goto L48
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r7)
            j9.g r7 = j9.g.f60484a
            r0.f20831a = r7
            r0.f20834d = r3
            java.lang.Object r6 = r5.g(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r4 = r7
            r7 = r6
            r6 = r4
        L48:
            java.util.List r7 = (java.util.List) r7
            com.forsale.adserver.utils.LocaleManager r0 = com.forsale.adserver.utils.LocaleManager.f20849a
            int r0 = r0.h()
            java.util.List r6 = r6.a(r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.usecases.offersInteractors.OffersInteractor.p(java.lang.Integer, zz.a):java.lang.Object");
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Offer_UseCase";
    }

    public final Deferred<List<d>> h() {
        Deferred<List<d>> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, this.f20810c, null, new OffersInteractor$loadAllFeaturedOffers$1(this, null), 2, null);
        return async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(zz.a<? super kotlinx.coroutines.Deferred<? extends java.util.List<g9.d>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffers$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffers$1 r0 = (com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffers$1) r0
            int r1 = r0.f20820d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20820d = r1
            goto L18
        L13:
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffers$1 r0 = new com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffers$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20818b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20820d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f20817a
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor r0 = (com.forsale.adserver.usecases.offersInteractors.OffersInteractor) r0
            kotlin.f.b(r5)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.adserver.datalayer.offersdata.OffersFactory r5 = r4.f20809b
            int r2 = r4.b()
            r0.f20817a = r4
            r0.f20820d = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            java.util.List r5 = (java.util.List) r5
            r1 = 0
            kotlinx.coroutines.Deferred r5 = r0.f(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.usecases.offersInteractors.OffersInteractor.j(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r6, zz.a<? super kotlinx.coroutines.Deferred<? extends java.util.List<g9.d>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffersWithCategoryId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffersWithCategoryId$1 r0 = (com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffersWithCategoryId$1) r0
            int r1 = r0.f20825e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20825e = r1
            goto L18
        L13:
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffersWithCategoryId$1 r0 = new com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllOffersWithCategoryId$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20823c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f20825e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.f20821a
            java.lang.Object r0 = r0.f20822b
            com.forsale.adserver.usecases.offersInteractors.OffersInteractor r0 = (com.forsale.adserver.usecases.offersInteractors.OffersInteractor) r0
            kotlin.f.b(r7)
            goto L52
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.f.b(r7)
            com.forsale.adserver.datalayer.offersdata.OffersFactory r7 = r5.f20809b
            int r2 = r5.b()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r6)
            r0.f20822b = r5
            r0.f20821a = r6
            r0.f20825e = r3
            java.lang.Object r7 = r7.h(r2, r4, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            java.util.List r7 = (java.util.List) r7
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            kotlinx.coroutines.Deferred r6 = r0.f(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.usecases.offersInteractors.OffersInteractor.k(int, zz.a):java.lang.Object");
    }

    public final Deferred<List<e>> l() {
        Deferred<List<e>> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, this.f20810c, null, new OffersInteractor$loadCategories$1(this, null), 2, null);
        return async$default;
    }

    public final Deferred<d> m(int i11) {
        Deferred<d> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new OffersInteractor$loadOfferById$1(this, i11, null), 3, null);
        return async$default;
    }
}
