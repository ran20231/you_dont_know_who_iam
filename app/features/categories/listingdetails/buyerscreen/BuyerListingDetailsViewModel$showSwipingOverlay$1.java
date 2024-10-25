package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel$showSwipingOverlay$1", f = "BuyerListingDetailsViewModel.kt", l = {44, 45, 46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsViewModel$showSwipingOverlay$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsViewModel f25855b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsViewModel$showSwipingOverlay$1(BuyerListingDetailsViewModel buyerListingDetailsViewModel, zz.a<? super BuyerListingDetailsViewModel$showSwipingOverlay$1> aVar) {
        super(2, aVar);
        this.f25855b = buyerListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsViewModel$showSwipingOverlay$1(this.f25855b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f25854a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r6)
            goto L61
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.f.b(r6)
            goto L52
        L21:
            kotlin.f.b(r6)
            goto L37
        L25:
            kotlin.f.b(r6)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel r6 = r5.f25855b
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel.e(r6)
            r5.f25854a = r4
            java.lang.Object r6 = r6.f(r5)
            if (r6 != r0) goto L37
            return r0
        L37:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L61
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel r6 = r5.f25855b
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel.f(r6)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
            r5.f25854a = r3
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L52
            return r0
        L52:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel r6 = r5.f25855b
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel.e(r6)
            r5.f25854a = r2
            java.lang.Object r6 = r6.i(r5)
            if (r6 != r0) goto L61
            return r0
        L61:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel$showSwipingOverlay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsViewModel$showSwipingOverlay$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
