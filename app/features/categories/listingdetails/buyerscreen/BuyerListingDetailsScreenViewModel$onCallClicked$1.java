package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onCallClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {568, 570, 571}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onCallClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25728a;

    /* renamed from: b  reason: collision with root package name */
    Object f25729b;

    /* renamed from: c  reason: collision with root package name */
    Object f25730c;

    /* renamed from: d  reason: collision with root package name */
    int f25731d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25732e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f25733f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onCallClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, String str, zz.a<? super BuyerListingDetailsScreenViewModel$onCallClicked$1> aVar) {
        super(2, aVar);
        this.f25732e = buyerListingDetailsScreenViewModel;
        this.f25733f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onCallClicked$1(this.f25732e, this.f25733f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f25731d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L36
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.f.b(r10)
            goto Lc2
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f25730c
            cb.b r1 = (cb.b) r1
            java.lang.Object r2 = r9.f25729b
            java.lang.Object r4 = r9.f25728a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r4 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r4
            kotlin.f.b(r10)
            goto Lae
        L2e:
            java.lang.Object r1 = r9.f25728a
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r1
            kotlin.f.b(r10)
            goto L7b
        L36:
            kotlin.f.b(r10)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r10 = r9.f25732e
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor r10 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.g(r10)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = r9.f25732e
            kotlinx.coroutines.flow.StateFlow r1 = r1.k0()
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.features.categories.listingdetails.buyerscreen.t r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.t) r1
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r10 = r10.c(r1)
            if (r10 == 0) goto Lc2
            java.lang.String r1 = r9.f25733f
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r6 = r9.f25732e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "connectivityExceptionsHandler:: onCallClickede:: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r2]
            x10.a.b(r7, r8)
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.j(r6)
            r9.f25728a = r6
            r9.f25731d = r5
            java.lang.Object r10 = r7.s(r10, r1, r9)
            if (r10 != r0) goto L7a
            return r0
        L7a:
            r1 = r6
        L7b:
            r5 = r10
            cb.b r5 = (cb.b) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "connectivityExceptionsHandler:: ContactActionType:: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            x10.a.b(r6, r2)
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor r2 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.k(r1)
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.e(r1)
            r9.f25728a = r1
            r9.f25729b = r10
            r9.f25730c = r5
            r9.f25731d = r4
            java.lang.Object r2 = r2.a(r5, r6, r9)
            if (r2 != r0) goto Lab
            return r0
        Lab:
            r2 = r10
            r4 = r1
            r1 = r5
        Lae:
            kotlinx.coroutines.flow.MutableSharedFlow r10 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.m(r4)
            r9.f25728a = r2
            r2 = 0
            r9.f25729b = r2
            r9.f25730c = r2
            r9.f25731d = r3
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto Lc2
            return r0
        Lc2:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onCallClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onCallClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
