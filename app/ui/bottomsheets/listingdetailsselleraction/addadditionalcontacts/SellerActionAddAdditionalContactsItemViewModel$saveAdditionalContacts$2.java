package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts;

import com.forsale.app.datalayer.network.requestsbodies.AddAdditionalContactsBody;
import com.forsale.app.datalayer.network.responses.AddAdditionalContactsResponse;
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
/* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2", f = "SellerActionAddAdditionalContactsItemViewModel.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38602a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAddAdditionalContactsItemViewModel f38603b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f38604c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2(SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel, String str, a<? super SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2> aVar) {
        super(2, aVar);
        this.f38603b = sellerActionAddAdditionalContactsItemViewModel;
        this.f38604c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2(this.f38603b, this.f38604c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MyListingsService myListingsService;
        ListingItemDetails listingItemDetails;
        String str;
        ListingItemDetails listingItemDetails2;
        f11 = b.f();
        int i11 = this.f38602a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            myListingsService = this.f38603b.f38562d;
            listingItemDetails = this.f38603b.f38560b;
            int id2 = listingItemDetails.getId();
            str = this.f38603b.f38566h;
            listingItemDetails2 = this.f38603b.f38560b;
            AddAdditionalContactsBody addAdditionalContactsBody = new AddAdditionalContactsBody(id2, str, listingItemDetails2.getRegId(), this.f38604c);
            this.f38602a = 1;
            obj = myListingsService.addAdditionalContacts(addAdditionalContactsBody, this);
            if (obj == f11) {
                return f11;
            }
        }
        AddAdditionalContactsResponse addAdditionalContactsResponse = (AddAdditionalContactsResponse) obj;
        this.f38603b.J(true);
        this.f38603b.A();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
