package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onFavoriteClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {429, 432, 430, 436}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onFavoriteClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25740a;

    /* renamed from: b  reason: collision with root package name */
    int f25741b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25742c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onFavoriteClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$onFavoriteClicked$1> aVar) {
        super(2, aVar);
        this.f25742c = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onFavoriteClicked$1(this.f25742c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f25741b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.f.b(r7)
            goto L7a
        L21:
            java.lang.Object r1 = r6.f25740a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
            kotlin.f.b(r7)
            goto L56
        L29:
            kotlin.f.b(r7)
            goto L3b
        L2d:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25742c
            r6.f25741b = r5
            java.lang.Object r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r7, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6f
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25742c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.B(r7)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25742c
            r6.f25740a = r1
            r6.f25741b = r4
            java.lang.Object r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r7, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.forsale.app.features.auth.login.SignInIntention r2 = com.forsale.app.features.auth.login.SignInIntention.FAVORITE
            com.forsale.app.features.categories.listingdetails.buyerscreen.g r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.g
            r4.<init>(r7, r2)
            r7 = 0
            r6.f25740a = r7
            r6.f25741b = r3
            java.lang.Object r7 = r1.emit(r4, r6)
            if (r7 != r0) goto L7a
            return r0
        L6f:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25742c
            r6.f25741b = r2
            java.lang.Object r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.a0(r7, r6)
            if (r7 != r0) goto L7a
            return r0
        L7a:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onFavoriteClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onFavoriteClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
