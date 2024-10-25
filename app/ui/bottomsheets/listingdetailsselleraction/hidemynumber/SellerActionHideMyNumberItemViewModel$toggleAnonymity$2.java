package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber;

import com.forsale.app.datalayer.network.requestsbodies.ToggleAnonymityBody;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ToggleAnonymityResponse;
import com.forsale.app.datalayer.network.services.MyListingsService;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionHideMyNumberItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber.SellerActionHideMyNumberItemViewModel$toggleAnonymity$2", f = "SellerActionHideMyNumberItemViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionHideMyNumberItemViewModel$toggleAnonymity$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38703a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionHideMyNumberItemViewModel f38704b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionHideMyNumberItemViewModel$toggleAnonymity$2(SellerActionHideMyNumberItemViewModel sellerActionHideMyNumberItemViewModel, a<? super SellerActionHideMyNumberItemViewModel$toggleAnonymity$2> aVar) {
        super(2, aVar);
        this.f38704b = sellerActionHideMyNumberItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionHideMyNumberItemViewModel$toggleAnonymity$2(this.f38704b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MyListingsService myListingsService;
        ListingItemDetails listingItemDetails;
        String str;
        ListingItemDetails listingItemDetails2;
        f11 = b.f();
        int i11 = this.f38703a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            myListingsService = this.f38704b.f38679c;
            listingItemDetails = this.f38704b.f38678b;
            int id2 = listingItemDetails.getId();
            str = this.f38704b.f38682f;
            listingItemDetails2 = this.f38704b.f38678b;
            ToggleAnonymityBody toggleAnonymityBody = new ToggleAnonymityBody(id2, str, listingItemDetails2.getRegId());
            this.f38703a = 1;
            obj = myListingsService.toggleAnonymity(toggleAnonymityBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        ToggleAnonymityResponse toggleAnonymityResponse = (ToggleAnonymityResponse) obj;
        this.f38704b.w(true);
        this.f38704b.s();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionHideMyNumberItemViewModel$toggleAnonymity$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
