package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteListingLostInterestViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel$onSubmitClicked$2", f = "DeleteListingLostInterestViewModel.kt", l = {43, 43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteListingLostInterestViewModel$onSubmitClicked$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38224a;

    /* renamed from: b  reason: collision with root package name */
    int f38225b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeleteListingLostInterestViewModel f38226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingLostInterestViewModel$onSubmitClicked$2(DeleteListingLostInterestViewModel deleteListingLostInterestViewModel, zz.a<? super DeleteListingLostInterestViewModel$onSubmitClicked$2> aVar) {
        super(2, aVar);
        this.f38226c = deleteListingLostInterestViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteListingLostInterestViewModel$onSubmitClicked$2(this.f38226c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f38225b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r12)
            goto L74
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.f38224a
            com.forsale.app.datalayer.network.services.MyListingsService r1 = (com.forsale.app.datalayer.network.services.MyListingsService) r1
            kotlin.f.b(r12)
            goto L40
        L22:
            kotlin.f.b(r12)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel r12 = r11.f38226c
            com.forsale.app.datalayer.network.services.MyListingsService r1 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel.x0(r12)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel r12 = r11.f38226c
            jj.b r12 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel.y0(r12)
            kj.b r12 = r12.c()
            r11.f38224a = r1
            r11.f38225b = r3
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L40
            return r0
        L40:
            java.lang.String r12 = (java.lang.String) r12
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel r4 = r11.f38226c
            int r4 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel.v0(r4)
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel r5 = r11.f38226c
            androidx.lifecycle.b0 r5 = r5.B0()
            java.lang.Object r5 = r5.getValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "lost interest:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.forsale.app.datalayer.network.requestsbodies.SellListingBody r6 = new com.forsale.app.datalayer.network.requestsbodies.SellListingBody
            r6.<init>(r12, r4, r5)
            r12 = 0
            r11.f38224a = r12
            r11.f38225b = r2
            java.lang.Object r12 = r1.sellListing(r6, r11)
            if (r12 != r0) goto L74
            return r0
        L74:
            com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel r0 = r11.f38226c
            com.forsale.app.datalayer.network.entities.SellListingEntity r12 = (com.forsale.app.datalayer.network.entities.SellListingEntity) r12
            int r12 = r12.isSold()
            boolean r12 = com.forsale.app.utils.TypeExtensionsKt.h0(r12)
            r1 = 0
            if (r12 == 0) goto Lae
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r4 = com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel.w0(r0)
            if (r4 == 0) goto La2
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_DELETED
            r6 = 1
            r7 = 1
            r8 = 0
            kotlin.Pair[] r9 = new kotlin.Pair[r3]
            kotlin.Pair r12 = new kotlin.Pair
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.REASON
            java.lang.String r2 = r2.getValue()
            java.lang.String r10 = "LostInterest"
            r12.<init>(r2, r10)
            r9[r1] = r12
            r4.O1(r5, r6, r7, r8, r9)
        La2:
            com.forsale.app.utils.OneShotEventHandler r12 = r0.z0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r3)
            r12.i(r0)
            goto Lb9
        Lae:
            com.forsale.app.utils.OneShotEventHandler r12 = r0.z0()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r1)
            r12.i(r0)
        Lb9:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest.DeleteListingLostInterestViewModel$onSubmitClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteListingLostInterestViewModel$onSubmitClicked$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
