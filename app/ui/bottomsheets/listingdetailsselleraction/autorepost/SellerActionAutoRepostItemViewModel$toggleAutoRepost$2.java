package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost;

import com.forsale.app.datalayer.network.requestsbodies.ToggleAutoRepostBody;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ToggleAutoRepostResponse;
import com.forsale.app.datalayer.network.services.MyListingsService;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionAutoRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel$toggleAutoRepost$2", f = "SellerActionAutoRepostItemViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAutoRepostItemViewModel$toggleAutoRepost$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38644a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAutoRepostItemViewModel f38645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAutoRepostItemViewModel$toggleAutoRepost$2(SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel, a<? super SellerActionAutoRepostItemViewModel$toggleAutoRepost$2> aVar) {
        super(2, aVar);
        this.f38645b = sellerActionAutoRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAutoRepostItemViewModel$toggleAutoRepost$2(this.f38645b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MyListingsService myListingsService;
        ListingItemDetails listingItemDetails;
        String str;
        ListingItemDetails listingItemDetails2;
        f11 = b.f();
        int i11 = this.f38644a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            myListingsService = this.f38645b.f38620d;
            listingItemDetails = this.f38645b.f38618b;
            int id2 = listingItemDetails.getId();
            str = this.f38645b.f38624h;
            listingItemDetails2 = this.f38645b.f38618b;
            ToggleAutoRepostBody toggleAutoRepostBody = new ToggleAutoRepostBody(id2, str, listingItemDetails2.getRegId());
            this.f38644a = 1;
            obj = myListingsService.toggleAutoRepost(toggleAutoRepostBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        ToggleAutoRepostResponse toggleAutoRepostResponse = (ToggleAutoRepostResponse) obj;
        this.f38645b.u(true);
        this.f38645b.q();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAutoRepostItemViewModel$toggleAutoRepost$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
