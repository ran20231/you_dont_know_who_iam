package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {644, 647, 645, 651}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25745a;

    /* renamed from: b  reason: collision with root package name */
    int f25746b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25747c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f25748d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f25749e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, boolean z11, zz.a<? super BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1> aVar) {
        super(2, aVar);
        this.f25747c = buyerListingDetailsScreenViewModel;
        this.f25748d = i11;
        this.f25749e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1(this.f25747c, this.f25748d, this.f25749e, aVar);
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
            int r1 = r6.f25746b
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
            goto L87
        L21:
            java.lang.Object r1 = r6.f25745a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
            kotlin.f.b(r7)
            goto L56
        L29:
            kotlin.f.b(r7)
            goto L3b
        L2d:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25747c
            r6.f25746b = r5
            java.lang.Object r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r7, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6f
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25747c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.B(r7)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25747c
            r6.f25745a = r1
            r6.f25746b = r4
            java.lang.Object r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.M(r7, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.forsale.app.features.auth.login.SignInIntention r2 = com.forsale.app.features.auth.login.SignInIntention.REPORT
            com.forsale.app.features.categories.listingdetails.buyerscreen.g r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.g
            r4.<init>(r7, r2)
            r7 = 0
            r6.f25745a = r7
            r6.f25746b = r3
            java.lang.Object r7 = r1.emit(r4, r6)
            if (r7 != r0) goto L87
            return r0
        L6f:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r7 = r6.f25747c
            kotlinx.coroutines.flow.MutableSharedFlow r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.B(r7)
            com.forsale.app.features.categories.listingdetails.buyerscreen.e r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.e
            int r3 = r6.f25748d
            boolean r4 = r6.f25749e
            r1.<init>(r3, r4)
            r6.f25746b = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L87
            return r0
        L87:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onReportAbuseClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
