package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteListingSoldViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel$deleteListing$2", f = "DeleteListingSoldViewModel.kt", l = {91, 91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteListingSoldViewModel$deleteListing$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38255a;

    /* renamed from: b  reason: collision with root package name */
    int f38256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeleteListingSoldViewModel f38257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f38258d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingSoldViewModel$deleteListing$2(DeleteListingSoldViewModel deleteListingSoldViewModel, String str, zz.a<? super DeleteListingSoldViewModel$deleteListing$2> aVar) {
        super(2, aVar);
        this.f38257c = deleteListingSoldViewModel;
        this.f38258d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteListingSoldViewModel$deleteListing$2(this.f38257c, this.f38258d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f38256b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r11)
            goto L5b
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            java.lang.Object r1 = r10.f38255a
            com.forsale.app.datalayer.network.services.MyListingsService r1 = (com.forsale.app.datalayer.network.services.MyListingsService) r1
            kotlin.f.b(r11)
            goto L40
        L22:
            kotlin.f.b(r11)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r11 = r10.f38257c
            com.forsale.app.datalayer.network.services.MyListingsService r1 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.x0(r11)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r11 = r10.f38257c
            jj.b r11 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.y0(r11)
            kj.b r11 = r11.c()
            r10.f38255a = r1
            r10.f38256b = r3
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L40
            return r0
        L40:
            java.lang.String r11 = (java.lang.String) r11
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r4 = r10.f38257c
            int r4 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.v0(r4)
            java.lang.String r5 = r10.f38258d
            com.forsale.app.datalayer.network.requestsbodies.SellListingBody r6 = new com.forsale.app.datalayer.network.requestsbodies.SellListingBody
            r6.<init>(r11, r4, r5)
            r11 = 0
            r10.f38255a = r11
            r10.f38256b = r2
            java.lang.Object r11 = r1.sellListing(r6, r10)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel r0 = r10.f38257c
            com.forsale.app.datalayer.network.entities.SellListingEntity r11 = (com.forsale.app.datalayer.network.entities.SellListingEntity) r11
            int r11 = r11.isSold()
            boolean r11 = com.forsale.app.utils.TypeExtensionsKt.h0(r11)
            r1 = 0
            if (r11 == 0) goto Lab
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_DELETED
            r6 = 1
            r7 = 1
            r8 = 0
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            kotlin.Pair r11 = new kotlin.Pair
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REASON
            java.lang.String r2 = r2.getValue()
            java.lang.String r4 = "Sold"
            r11.<init>(r2, r4)
            r9[r1] = r11
            kotlin.Pair r11 = new kotlin.Pair
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.NOTE
            java.lang.String r1 = r1.getValue()
            androidx.lifecycle.b0 r2 = r0.H0()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L96
            java.lang.String r2 = ""
        L96:
            r11.<init>(r1, r2)
            r9[r3] = r11
            r4 = r0
            r4.M0(r5, r6, r7, r8, r9)
            com.forsale.app.utils.OneShotEventHandler r11 = r0.A0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r3)
            r11.i(r0)
            goto Lb6
        Lab:
            com.forsale.app.utils.OneShotEventHandler r11 = r0.A0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r1)
            r11.i(r0)
        Lb6:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel$deleteListing$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteListingSoldViewModel$deleteListing$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
