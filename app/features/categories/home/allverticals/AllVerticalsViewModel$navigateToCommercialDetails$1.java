package com.forsale.app.features.categories.home.allverticals;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$navigateToCommercialDetails$1", f = "AllVerticalsViewModel.kt", l = {244, 240}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$navigateToCommercialDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f23458a;

    /* renamed from: b  reason: collision with root package name */
    int f23459b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23460c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AdsModel f23461d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.forsale.adserver.view.screens.detailsScreen.a f23462e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$navigateToCommercialDetails$1(AllVerticalsViewModel allVerticalsViewModel, AdsModel adsModel, com.forsale.adserver.view.screens.detailsScreen.a aVar, zz.a<? super AllVerticalsViewModel$navigateToCommercialDetails$1> aVar2) {
        super(2, aVar2);
        this.f23460c = allVerticalsViewModel;
        this.f23461d = adsModel;
        this.f23462e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllVerticalsViewModel$navigateToCommercialDetails$1(this.f23460c, this.f23461d, this.f23462e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f23459b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L78
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f23458a
            kotlinx.coroutines.flow.MutableSharedFlow r1 = (kotlinx.coroutines.flow.MutableSharedFlow) r1
            kotlin.f.b(r7)
            goto L4d
        L22:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r7 = r6.f23460c
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.t(r7)
            com.forsale.adserver.view.models.AdsModel r7 = r6.f23461d
            boolean r7 = r7.f()
            if (r7 == 0) goto L36
            com.forsale.adserver.view.models.AdsModel r7 = r6.f23461d
            goto L5f
        L36:
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r7 = r6.f23460c
            com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor r7 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.p(r7)
            com.forsale.adserver.view.models.AdsModel r4 = r6.f23461d
            int r4 = r4.g()
            r6.f23458a = r1
            r6.f23459b = r3
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r0) goto L4d
            return r0
        L4d:
            com.forsale.app.datalayer.network.responses.ListingItemDetails r7 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r7
            if (r7 == 0) goto L5d
            com.forsale.adserver.view.models.AdsModel r3 = r6.f23461d
            com.forsale.adserver.view.models.AdType r3 = r3.a()
            com.forsale.adserver.view.models.AdsModel r7 = r7.toAdsModel(r3)
            if (r7 != 0) goto L5f
        L5d:
            com.forsale.adserver.view.models.AdsModel r7 = r6.f23461d
        L5f:
            com.forsale.adserver.view.screens.detailsScreen.a r3 = r6.f23462e
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r4 = r6.f23460c
            com.forsale.app.utils.analytics.HomeVisitedSources r4 = r4.O()
            com.forsale.app.features.categories.home.allverticals.a$a$a r5 = new com.forsale.app.features.categories.home.allverticals.a$a$a
            r5.<init>(r7, r3, r4)
            r7 = 0
            r6.f23458a = r7
            r6.f23459b = r2
            java.lang.Object r7 = r1.emit(r5, r6)
            if (r7 != r0) goto L78
            return r0
        L78:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$navigateToCommercialDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllVerticalsViewModel$navigateToCommercialDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
