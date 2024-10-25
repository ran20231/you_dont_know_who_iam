package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import com.forsale.app.datalayer.network.entities.RepostListingEntity;
import com.forsale.app.datalayer.network.requestsbodies.RepostListingBody;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$manualRePost$2", f = "SellerActionManualRepostItemViewModel.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$manualRePost$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38762a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38763b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$manualRePost$2(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super SellerActionManualRepostItemViewModel$manualRePost$2> aVar) {
        super(2, aVar);
        this.f38763b = sellerActionManualRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionManualRepostItemViewModel$manualRePost$2(this.f38763b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MyListingsService myListingsService;
        ListingItemDetails listingItemDetails;
        ListingItemDetails listingItemDetails2;
        f11 = b.f();
        int i11 = this.f38762a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            myListingsService = this.f38763b.f38720c;
            listingItemDetails = this.f38763b.f38719b;
            int id2 = listingItemDetails.getId();
            listingItemDetails2 = this.f38763b.f38719b;
            RepostListingBody repostListingBody = new RepostListingBody(id2, listingItemDetails2.getType().getValue());
            this.f38762a = 1;
            obj = myListingsService.repostListing(repostListingBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        RepostListingEntity repostListingEntity = (RepostListingEntity) obj;
        this.f38763b.U(true);
        this.f38763b.H();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionManualRepostItemViewModel$manualRePost$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
