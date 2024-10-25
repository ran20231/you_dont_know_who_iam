package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import falcon.chat.entities.Constants;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$fetchListingDetails$3$1", f = "ListingDetailsRepository.kt", l = {Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$fetchListingDetails$3$1 extends SuspendLambda implements p<ListingItemDetails, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25213a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25214b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25215c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f25216d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListingDetailsRepository$fetchListingDetails$3$1(ListingDetailsRepository listingDetailsRepository, l<? super Boolean, wz.p> lVar, zz.a<? super ListingDetailsRepository$fetchListingDetails$3$1> aVar) {
        super(2, aVar);
        this.f25215c = listingDetailsRepository;
        this.f25216d = lVar;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(ListingItemDetails listingItemDetails, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsRepository$fetchListingDetails$3$1) create(listingItemDetails, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ListingDetailsRepository$fetchListingDetails$3$1 listingDetailsRepository$fetchListingDetails$3$1 = new ListingDetailsRepository$fetchListingDetails$3$1(this.f25215c, this.f25216d, aVar);
        listingDetailsRepository$fetchListingDetails$3$1.f25214b = obj;
        return listingDetailsRepository$fetchListingDetails$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        Integer num;
        Object L;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25213a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingItemDetails listingItemDetails = (ListingItemDetails) this.f25214b;
            this.f25215c.O(listingItemDetails.getPhone());
            b0Var = this.f25215c.B;
            b0Var.setValue(listingItemDetails);
            this.f25215c.f0(listingItemDetails);
            ListingDetailsRepository listingDetailsRepository = this.f25215c;
            ListingItemBrief z11 = listingDetailsRepository.z();
            if (z11 != null) {
                num = z11.getExpireSoon();
            } else {
                num = null;
            }
            listingDetailsRepository.g0(listingItemDetails, num);
            ListingDetailsRepository listingDetailsRepository2 = this.f25215c;
            String translationOriginalLang = listingItemDetails.getTranslationOriginalLang();
            this.f25213a = 1;
            L = listingDetailsRepository2.L(translationOriginalLang, this);
            if (L == f11) {
                return f11;
            }
        }
        this.f25216d.invoke(kotlin.coroutines.jvm.internal.a.a(o.d(this.f25215c.Q().getValue(), kotlin.coroutines.jvm.internal.a.a(true))));
        return wz.p.f75480a;
    }
}
