package com.forsale.app.features.categories.listingdetails.newui;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$removeFromFavourite$2", f = "NewListingDetailsViewModel.kt", l = {763, 763}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$removeFromFavourite$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27313a;

    /* renamed from: b  reason: collision with root package name */
    Object f27314b;

    /* renamed from: c  reason: collision with root package name */
    Object f27315c;

    /* renamed from: d  reason: collision with root package name */
    int f27316d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27317e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$removeFromFavourite$2(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$removeFromFavourite$2> aVar) {
        super(2, aVar);
        this.f27317e = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$removeFromFavourite$2(this.f27317e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f27316d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1a
            java.lang.Object r1 = r0.f27313a
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r1 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel) r1
            kotlin.f.b(r17)
            r3 = r17
            goto L7a
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f27315c
            com.forsale.app.datalayer.network.services.FavoritesService r2 = (com.forsale.app.datalayer.network.services.FavoritesService) r2
            java.lang.Object r5 = r0.f27314b
            com.forsale.app.datalayer.network.responses.ListingItemDetails r5 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r5
            java.lang.Object r6 = r0.f27313a
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r6 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel) r6
            kotlin.f.b(r17)
            r7 = r17
            r15 = r6
            r6 = r2
            r2 = r15
            goto L5e
        L37:
            kotlin.f.b(r17)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r2 = r0.f27317e
            androidx.lifecycle.LiveData r2 = r2.Q1()
            java.lang.Object r2 = r2.getValue()
            r5 = r2
            com.forsale.app.datalayer.network.responses.ListingItemDetails r5 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r5
            if (r5 == 0) goto La8
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r2 = r0.f27317e
            com.forsale.app.datalayer.network.services.FavoritesService r6 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.E0(r2)
            r0.f27313a = r2
            r0.f27314b = r5
            r0.f27315c = r6
            r0.f27316d = r4
            java.lang.Object r7 = r2.I1(r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r7 = (java.lang.String) r7
            int r5 = r5.getId()
            com.forsale.app.datalayer.network.requestsbodies.RemoveFavoriteBody r8 = new com.forsale.app.datalayer.network.requestsbodies.RemoveFavoriteBody
            r8.<init>(r7, r5)
            r0.f27313a = r2
            r5 = 0
            r0.f27314b = r5
            r0.f27315c = r5
            r0.f27316d = r3
            java.lang.Object r3 = r6.removeFavorites(r8, r0)
            if (r3 != r1) goto L79
            return r1
        L79:
            r1 = r2
        L7a:
            com.forsale.app.datalayer.network.entities.RemoveFavoriteEntity r3 = (com.forsale.app.datalayer.network.entities.RemoveFavoriteEntity) r3
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents r6 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_UN_FAVORITED
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r14 = 0
            r5 = r1
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.J2(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r2 = r3.isRemoved()
            boolean r2 = com.forsale.app.utils.TypeExtensionsKt.h0(r2)
            if (r2 != r4) goto L9f
            androidx.lifecycle.z r1 = r1.K1()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$FavouriteState r2 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.FavouriteState.IS_NOT_FAVOURITE
            r1.postValue(r2)
            goto La8
        L9f:
            androidx.lifecycle.z r1 = r1.K1()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$FavouriteState r2 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.FavouriteState.IS_FAVOURITE
            r1.postValue(r2)
        La8:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$removeFromFavourite$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$removeFromFavourite$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
