package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteListingManyCallsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel$onSubmitClicked$1$2", f = "DeleteListingManyCallsViewModel.kt", l = {66, 66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteListingManyCallsViewModel$onSubmitClicked$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38299a;

    /* renamed from: b  reason: collision with root package name */
    int f38300b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeleteListingManyCallsViewModel f38301c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38302d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingManyCallsViewModel$onSubmitClicked$1$2(DeleteListingManyCallsViewModel deleteListingManyCallsViewModel, ListingItemDetails listingItemDetails, zz.a<? super DeleteListingManyCallsViewModel$onSubmitClicked$1$2> aVar) {
        super(2, aVar);
        this.f38301c = deleteListingManyCallsViewModel;
        this.f38302d = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteListingManyCallsViewModel$onSubmitClicked$1$2(this.f38301c, this.f38302d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f38300b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r13)
            goto L5b
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            java.lang.Object r1 = r12.f38299a
            com.forsale.app.datalayer.network.services.MyListingsService r1 = (com.forsale.app.datalayer.network.services.MyListingsService) r1
            kotlin.f.b(r13)
            goto L40
        L22:
            kotlin.f.b(r13)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel r13 = r12.f38301c
            com.forsale.app.datalayer.network.services.MyListingsService r1 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel.w0(r13)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel r13 = r12.f38301c
            jj.b r13 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel.x0(r13)
            kj.b r13 = r13.c()
            r12.f38299a = r1
            r12.f38300b = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L40
            return r0
        L40:
            java.lang.String r13 = (java.lang.String) r13
            com.forsale.app.datalayer.network.responses.ListingItemDetails r4 = r12.f38302d
            int r4 = r4.getId()
            com.forsale.app.datalayer.network.requestsbodies.SellListingBody r5 = new com.forsale.app.datalayer.network.requestsbodies.SellListingBody
            java.lang.String r6 = "too many calls"
            r5.<init>(r13, r4, r6)
            r13 = 0
            r12.f38299a = r13
            r12.f38300b = r2
            java.lang.Object r13 = r1.sellListing(r5, r12)
            if (r13 != r0) goto L5b
            return r0
        L5b:
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel r0 = r12.f38301c
            com.forsale.app.datalayer.network.entities.SellListingEntity r13 = (com.forsale.app.datalayer.network.entities.SellListingEntity) r13
            int r13 = r13.isSold()
            boolean r13 = com.forsale.app.utils.TypeExtensionsKt.h0(r13)
            r1 = 0
            if (r13 == 0) goto L98
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r4 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel.v0(r0)
            if (r4 == 0) goto L8c
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_DELETED
            r6 = 0
            r7 = 0
            r8 = 0
            kotlin.Pair[] r9 = new kotlin.Pair[r3]
            kotlin.Pair r13 = new kotlin.Pair
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REASON
            java.lang.String r2 = r2.getValue()
            java.lang.String r10 = "TooManyCalls"
            r13.<init>(r2, r10)
            r9[r1] = r13
            r10 = 14
            r11 = 0
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.P1(r4, r5, r6, r7, r8, r9, r10, r11)
        L8c:
            com.forsale.app.utils.OneShotEventHandler r13 = r0.A0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r3)
            r13.i(r0)
            goto La3
        L98:
            com.forsale.app.utils.OneShotEventHandler r13 = r0.A0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r1)
            r13.i(r0)
        La3:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls.DeleteListingManyCallsViewModel$onSubmitClicked$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteListingManyCallsViewModel$onSubmitClicked$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
