package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionAutoRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel$loadRepostDate$1$1", f = "SellerActionAutoRepostItemViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAutoRepostItemViewModel$loadRepostDate$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38632a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAutoRepostItemViewModel f38633b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAutoRepostItemViewModel$loadRepostDate$1$1(SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel, ListingItemDetails listingItemDetails, a<? super SellerActionAutoRepostItemViewModel$loadRepostDate$1$1> aVar) {
        super(2, aVar);
        this.f38633b = sellerActionAutoRepostItemViewModel;
        this.f38634c = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAutoRepostItemViewModel$loadRepostDate$1$1(this.f38633b, this.f38634c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        com.forsale.app.features.categories.listingdetails.a t11;
        String n11;
        f11 = b.f();
        int i11 = this.f38632a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            regionsRepository = this.f38633b.f38623g;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f38634c.getRegId());
            this.f38632a = 1;
            obj = regionsRepository.getRegion(d11, this);
            if (obj == f11) {
                return f11;
            }
        }
        ListingItemDetails listingItemDetails = this.f38634c;
        SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel = this.f38633b;
        RegionEntity regionEntity = (RegionEntity) obj;
        String dateExpired = listingItemDetails.getDateExpired();
        if (dateExpired != null && (t11 = TypeExtensionsKt.t(dateExpired, "yyyy-MM-dd HH:mm:ss")) != null) {
            b0<String> m11 = sellerActionAutoRepostItemViewModel.m();
            n11 = sellerActionAutoRepostItemViewModel.n(t11);
            m11.postValue(n11);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAutoRepostItemViewModel$loadRepostDate$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
