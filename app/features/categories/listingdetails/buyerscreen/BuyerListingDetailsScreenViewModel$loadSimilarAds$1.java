package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadSimilarAds$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {298, 300, 304, 318}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$loadSimilarAds$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25717a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25718b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f25719c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$loadSimilarAds$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, zz.a<? super BuyerListingDetailsScreenViewModel$loadSimilarAds$1> aVar) {
        super(2, aVar);
        this.f25718b = buyerListingDetailsScreenViewModel;
        this.f25719c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$loadSimilarAds$1(this.f25718b, this.f25719c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: all -> 0x002e, LOOP:0: B:24:0x0080->B:26:0x0086, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x0023, B:12:0x0028, B:23:0x005f, B:24:0x0080, B:26:0x0086, B:27:0x00ac, B:20:0x0049), top: B:35:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r1.f25717a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 == r6) goto L31
            if (r0 == r5) goto L28
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            kotlin.f.b(r18)
            goto Ldc
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L23:
            kotlin.f.b(r18)     // Catch: java.lang.Throwable -> L2e
            goto Ldc
        L28:
            kotlin.f.b(r18)     // Catch: java.lang.Throwable -> L2e
            r0 = r18
            goto L5f
        L2e:
            r0 = move-exception
            goto Lc7
        L31:
            kotlin.f.b(r18)
            goto L49
        L35:
            kotlin.f.b(r18)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r0 = r1.f25718b
            kotlinx.coroutines.flow.MutableStateFlow r0 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.K(r0)
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$d r7 = com.forsale.app.features.categories.home.propertyhome.models.SectionState.d.f25086a
            r1.f25717a = r6
            java.lang.Object r0 = r0.emit(r7, r1)
            if (r0 != r2) goto L49
            return r2
        L49:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r0 = r1.f25718b     // Catch: java.lang.Throwable -> L2e
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.OtherAdsInteractor r0 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.t(r0)     // Catch: java.lang.Throwable -> L2e
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.a$b r6 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.a$b     // Catch: java.lang.Throwable -> L2e
            int r7 = r1.f25719c     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            r1.f25717a = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.d(r6, r1)     // Catch: java.lang.Throwable -> L2e
            if (r0 != r2) goto L5f
            return r2
        L5f:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r5 = r1.f25718b     // Catch: java.lang.Throwable -> L2e
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r0 = (com.forsale.app.datalayer.network.responses.ListingsResponse.Listings) r0     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = com.forsale.app.datalayer.network.responses.ListingsResponseKt.aggregatePinnedAndNormal(r0)     // Catch: java.lang.Throwable -> L2e
            java.util.List r13 = com.forsale.app.datalayer.network.responses.ListingItemBriefKt.itemsIds(r0)     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.flow.MutableStateFlow r14 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.K(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r6 = 10
            int r6 = kotlin.collections.p.y(r0, r6)     // Catch: java.lang.Throwable -> L2e
            r15.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2e
        L80:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto Lac
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L2e
            r12 = r6
            com.forsale.app.datalayer.network.responses.ListingItemBrief r12 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r12     // Catch: java.lang.Throwable -> L2e
            nc.a r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.r(r5)     // Catch: java.lang.Throwable -> L2e
            int r8 = r12.getId()     // Catch: java.lang.Throwable -> L2e
            r9 = 0
            r10 = 0
            r11 = 12
            r16 = 0
            r7 = r13
            r3 = r12
            r12 = r16
            java.util.List r6 = nc.a.b(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2e
            com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel r3 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.Q(r5, r3, r6)     // Catch: java.lang.Throwable -> L2e
            r15.add(r3)     // Catch: java.lang.Throwable -> L2e
            r3 = 4
            goto L80
        Lac:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$e r0 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState$e     // Catch: java.lang.Throwable -> L2e
            r6 = r0
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2e
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$f r3 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState$f     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r1.f25717a = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r14.emit(r3, r1)     // Catch: java.lang.Throwable -> L2e
            if (r0 != r2) goto Ldc
            return r2
        Lc7:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r3 = r1.f25718b
            kotlinx.coroutines.flow.MutableStateFlow r3 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.K(r3)
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$b r4 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState$b
            r4.<init>(r0)
            r5 = 4
            r1.f25717a = r5
            java.lang.Object r0 = r3.emit(r4, r1)
            if (r0 != r2) goto Ldc
            return r2
        Ldc:
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$loadSimilarAds$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$loadSimilarAds$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
