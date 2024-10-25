package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$changeFollowState$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {729, 731, 729}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$changeFollowState$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25679a;

    /* renamed from: b  reason: collision with root package name */
    int f25680b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25681c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$changeFollowState$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$changeFollowState$1> aVar) {
        super(2, aVar);
        this.f25681c = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$changeFollowState$1(this.f25681c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f25680b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r9)
            goto Lac
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f25679a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
            kotlin.f.b(r9)
            goto L53
        L26:
            kotlin.f.b(r9)
            goto L38
        L2a:
            kotlin.f.b(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25681c
            r8.f25680b = r4
            java.lang.Object r9 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r9, r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6c
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25681c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.B(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25681c
            r8.f25679a = r1
            r8.f25680b = r3
            java.lang.Object r9 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r9, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.forsale.app.features.auth.login.SignInIntention r3 = com.forsale.app.features.auth.login.SignInIntention.FOLLOW
            com.forsale.app.features.categories.listingdetails.buyerscreen.g r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.g
            r4.<init>(r9, r3)
            r9 = 0
            r8.f25679a = r9
            r8.f25680b = r2
            java.lang.Object r9 = r1.emit(r4, r8)
            if (r9 != r0) goto Lac
            return r0
        L6c:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25681c
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r9 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.g(r9)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r0 = r8.f25681c
            kotlinx.coroutines.flow.StateFlow r0 = r0.k0()
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.features.categories.listingdetails.buyerscreen.t r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.t) r0
            com.forsale.app.features.categories.listingdetails.buyerscreen.q r1 = r9.d(r0)
            if (r1 == 0) goto Lac
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r9 = r8.f25681c
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r0 = r1.c()
            com.forsale.app.features.categories.listingdetails.models.CommonData r0 = r0.d()
            java.lang.String r0 = r0.w()
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r2 = r1.c()
            com.forsale.app.features.categories.listingdetails.models.CommonData r2 = r2.d()
            boolean r2 = r2.L()
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.f(r9, r0, r2)
            r2 = 0
            r3 = 0
            com.forsale.app.features.categories.listingdetails.buyerscreen.FollowState r4 = com.forsale.app.features.categories.listingdetails.buyerscreen.FollowState.PENDING
            r5 = 0
            r6 = 11
            r7 = 0
            com.forsale.app.features.categories.listingdetails.buyerscreen.q.b(r1, r2, r3, r4, r5, r6, r7)
        Lac:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$changeFollowState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$changeFollowState$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
