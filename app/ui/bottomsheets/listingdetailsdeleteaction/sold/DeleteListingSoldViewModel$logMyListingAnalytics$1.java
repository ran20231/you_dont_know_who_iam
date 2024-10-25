package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteListingSoldViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel$logMyListingAnalytics$1", f = "DeleteListingSoldViewModel.kt", l = {105, 105}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteListingSoldViewModel$logMyListingAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition A;

    /* renamed from: a  reason: collision with root package name */
    Object f38259a;

    /* renamed from: b  reason: collision with root package name */
    Object f38260b;

    /* renamed from: c  reason: collision with root package name */
    Object f38261c;

    /* renamed from: d  reason: collision with root package name */
    Object f38262d;

    /* renamed from: e  reason: collision with root package name */
    Object f38263e;

    /* renamed from: f  reason: collision with root package name */
    boolean f38264f;

    /* renamed from: g  reason: collision with root package name */
    boolean f38265g;

    /* renamed from: h  reason: collision with root package name */
    int f38266h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ DeleteListingSoldViewModel f38267i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Pair<String, String>[] f38268j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38269x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ boolean f38270y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ boolean f38271z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingSoldViewModel$logMyListingAnalytics$1(DeleteListingSoldViewModel deleteListingSoldViewModel, Pair<String, String>[] pairArr, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, zz.a<? super DeleteListingSoldViewModel$logMyListingAnalytics$1> aVar) {
        super(2, aVar);
        this.f38267i = deleteListingSoldViewModel;
        this.f38268j = pairArr;
        this.f38269x = myListingActionEvents;
        this.f38270y = z11;
        this.f38271z = z12;
        this.A = analyticsPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteListingSoldViewModel$logMyListingAnalytics$1(this.f38267i, this.f38268j, this.f38269x, this.f38270y, this.f38271z, this.A, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r14 = r22
            java.lang.Object r13 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r14.f38266h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            kotlin.f.b(r23)
            goto Lbe
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1d:
            boolean r0 = r14.f38265g
            boolean r2 = r14.f38264f
            java.lang.Object r3 = r14.f38263e
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r3 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r3
            java.lang.Object r4 = r14.f38262d
            com.forsale.app.datalayer.network.responses.ListingItemDetails r4 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r4
            java.lang.Object r5 = r14.f38261c
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r5 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition) r5
            java.lang.Object r6 = r14.f38260b
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r6 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents) r6
            java.lang.Object r7 = r14.f38259a
            kotlin.Pair[] r7 = (kotlin.Pair[]) r7
            kotlin.f.b(r23)
            r17 = r5
            r5 = r2
            r2 = r23
            r21 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            r4 = r21
            goto L83
        L45:
            kotlin.f.b(r23)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r0 = r14.f38267i
            com.forsale.app.datalayer.network.responses.ListingItemDetails r0 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.w0(r0)
            if (r0 == 0) goto Lbe
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r3 = r14.f38267i
            kotlin.Pair<java.lang.String, java.lang.String>[] r7 = r14.f38268j
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r4 = r14.f38269x
            boolean r5 = r14.f38270y
            boolean r6 = r14.f38271z
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r8 = r14.A
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r9 = r3.r()
            jj.b r3 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.y0(r3)
            kj.b r3 = r3.c()
            r14.f38259a = r7
            r14.f38260b = r4
            r14.f38261c = r8
            r14.f38262d = r0
            r14.f38263e = r9
            r14.f38264f = r5
            r14.f38265g = r6
            r14.f38266h = r2
            java.lang.Object r2 = r3.a(r14)
            if (r2 != r13) goto L7f
            return r13
        L7f:
            r3 = r0
            r17 = r8
            r0 = r9
        L83:
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            int r2 = r7.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r7, r2)
            r19 = r2
            kotlin.Pair[] r19 = (kotlin.Pair[]) r19
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 4032(0xfc0, float:5.65E-42)
            r16 = 0
            r2 = 0
            r14.f38259a = r2
            r14.f38260b = r2
            r14.f38261c = r2
            r14.f38262d = r2
            r14.f38263e = r2
            r14.f38266h = r1
            r1 = r4
            r2 = r3
            r3 = r18
            r4 = r5
            r5 = r6
            r6 = r17
            r20 = r13
            r13 = r19
            r14 = r22
            java.lang.Object r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.p0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r20
            if (r0 != r1) goto Lbe
            return r1
        Lbe:
            wz.p r0 = wz.p.f75480a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel$logMyListingAnalytics$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteListingSoldViewModel$logMyListingAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
