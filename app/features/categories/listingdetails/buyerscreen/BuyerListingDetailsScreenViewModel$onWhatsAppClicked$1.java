package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {580, 585, 586}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25760a;

    /* renamed from: b  reason: collision with root package name */
    Object f25761b;

    /* renamed from: c  reason: collision with root package name */
    Object f25762c;

    /* renamed from: d  reason: collision with root package name */
    int f25763d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25764e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f25765f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, String str, zz.a<? super BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1> aVar) {
        super(2, aVar);
        this.f25764e = buyerListingDetailsScreenViewModel;
        this.f25765f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1(this.f25764e, this.f25765f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f25763d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r9)
            goto La0
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f25762c
            cb.b r1 = (cb.b) r1
            java.lang.Object r3 = r8.f25761b
            java.lang.Object r4 = r8.f25760a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r4 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r4
            kotlin.f.b(r9)
            goto L8c
        L2c:
            java.lang.Object r1 = r8.f25760a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r1
            kotlin.f.b(r9)
        L33:
            r4 = r1
            goto L71
        L35:
            kotlin.f.b(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25764e
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r9 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.g(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = r8.f25764e
            kotlinx.coroutines.flow.StateFlow r1 = r1.k0()
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.features.categories.listingdetails.buyerscreen.t r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.t) r1
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r9 = r9.c(r1)
            if (r9 == 0) goto La0
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = r8.f25764e
            java.lang.String r5 = r8.f25765f
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.j(r1)
            com.forsale.app.features.categories.listingdetails.ShareText r7 = r1.y0()
            if (r7 == 0) goto L64
            java.lang.String r7 = r7.b()
            if (r7 != 0) goto L66
        L64:
            java.lang.String r7 = ""
        L66:
            r8.f25760a = r1
            r8.f25763d = r4
            java.lang.Object r9 = r6.u(r9, r5, r7, r8)
            if (r9 != r0) goto L33
            return r0
        L71:
            r1 = r9
            cb.b r1 = (cb.b) r1
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor r5 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.k(r4)
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.e(r4)
            r8.f25760a = r4
            r8.f25761b = r9
            r8.f25762c = r1
            r8.f25763d = r3
            java.lang.Object r3 = r5.a(r1, r6, r8)
            if (r3 != r0) goto L8b
            return r0
        L8b:
            r3 = r9
        L8c:
            kotlinx.coroutines.flow.MutableSharedFlow r9 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.m(r4)
            r8.f25760a = r3
            r3 = 0
            r8.f25761b = r3
            r8.f25762c = r3
            r8.f25763d = r2
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto La0
            return r0
        La0:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onWhatsAppClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
