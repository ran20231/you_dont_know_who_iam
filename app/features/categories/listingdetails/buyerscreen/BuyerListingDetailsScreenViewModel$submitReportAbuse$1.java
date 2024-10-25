package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$submitReportAbuse$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {662, 663, 664}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$submitReportAbuse$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25820a;

    /* renamed from: b  reason: collision with root package name */
    Object f25821b;

    /* renamed from: c  reason: collision with root package name */
    int f25822c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25823d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f25824e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f25825f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$submitReportAbuse$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, String str, String str2, zz.a<? super BuyerListingDetailsScreenViewModel$submitReportAbuse$1> aVar) {
        super(2, aVar);
        this.f25823d = buyerListingDetailsScreenViewModel;
        this.f25824e = str;
        this.f25825f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$submitReportAbuse$1(this.f25823d, this.f25824e, this.f25825f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f25822c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L29
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.f.b(r13)
            goto L87
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.f25821b
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel) r1
            java.lang.Object r4 = r12.f25820a
            kotlin.f.b(r13)
            goto L72
        L29:
            kotlin.f.b(r13)
            goto L4d
        L2d:
            kotlin.f.b(r13)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r13 = r12.f25823d
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor r13 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.x(r13)
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = r12.f25823d
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$a r1 = r1.x0()
            int r1 = r1.b()
            java.lang.String r7 = r12.f25824e
            java.lang.String r8 = r12.f25825f
            r12.f25822c = r6
            java.lang.Object r13 = r13.b(r1, r7, r8, r12)
            if (r13 != r0) goto L4d
            return r0
        L4d:
            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = r12.f25823d
            r7 = r13
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            kotlinx.coroutines.flow.MutableSharedFlow r7 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.F(r1)
            lf.a r8 = new lf.a
            rj.a$b r9 = new rj.a$b
            int r10 = t9.y0.f70745x1
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r9.<init>(r10, r11)
            r8.<init>(r5, r9, r6, r5)
            r12.f25820a = r13
            r12.f25821b = r1
            r12.f25822c = r4
            java.lang.Object r4 = r7.emit(r8, r12)
            if (r4 != r0) goto L71
            return r0
        L71:
            r4 = r13
        L72:
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.J(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r2)
            r12.f25820a = r4
            r12.f25821b = r5
            r12.f25822c = r3
            java.lang.Object r13 = r13.emit(r1, r12)
            if (r13 != r0) goto L87
            return r0
        L87:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$submitReportAbuse$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$submitReportAbuse$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
