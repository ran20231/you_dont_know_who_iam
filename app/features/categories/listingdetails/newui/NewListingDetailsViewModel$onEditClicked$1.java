package com.forsale.app.features.categories.listingdetails.newui;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onEditClicked$1", f = "NewListingDetailsViewModel.kt", l = {441, 441}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onEditClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27296a;

    /* renamed from: b  reason: collision with root package name */
    Object f27297b;

    /* renamed from: c  reason: collision with root package name */
    Object f27298c;

    /* renamed from: d  reason: collision with root package name */
    int f27299d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27300e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onEditClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$onEditClicked$1> aVar) {
        super(2, aVar);
        this.f27300e = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onEditClicked$1(this.f27300e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f27299d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r13)
            goto L7d
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            java.lang.Object r1 = r12.f27298c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
            java.lang.Object r3 = r12.f27297b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r3 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion) r3
            java.lang.Object r4 = r12.f27296a
            com.forsale.app.datalayer.network.responses.ListingItemDetails r4 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r4
            kotlin.f.b(r13)
            goto L67
        L2a:
            kotlin.f.b(r13)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r13 = r12.f27300e
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r4 = r13.R1()
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_EDIT_CLICKED
            r6 = 1
            r7 = 1
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition r8 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition.TOP_SCREEN
            r9 = 0
            r10 = 16
            r11 = 0
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.P1(r4, r5, r6, r7, r8, r9, r10, r11)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r13 = r12.f27300e
            androidx.lifecycle.LiveData r13 = r13.Q1()
            java.lang.Object r13 = r13.getValue()
            r4 = r13
            com.forsale.app.datalayer.network.responses.ListingItemDetails r4 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r4
            if (r4 == 0) goto L7d
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r13 = r12.f27300e
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.O0(r13)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r5 = com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion
            r12.f27296a = r4
            r12.f27297b = r5
            r12.f27298c = r1
            r12.f27299d = r3
            java.lang.Object r13 = r13.I1(r12)
            if (r13 != r0) goto L66
            return r0
        L66:
            r3 = r5
        L67:
            java.lang.String r13 = (java.lang.String) r13
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r13 = r3.from(r4, r13)
            r3 = 0
            r12.f27296a = r3
            r12.f27297b = r3
            r12.f27298c = r3
            r12.f27299d = r2
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r0) goto L7d
            return r0
        L7d:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onEditClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onEditClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
