package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$2", f = "ExpireSoonRepository.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$loadListingDetails$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ListingItemDetails>, Object> {
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$loadListingDetails$2(ExpireSoonRepository expireSoonRepository, zz.a<? super ExpireSoonRepository$loadListingDetails$2> aVar) {
        super(2, aVar);
        this.this$0 = expireSoonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$loadListingDetails$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        Integer num;
        b0 b0Var2;
        ListingsService listingsService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b0Var = this.this$0.activeAboutToExpireListing;
            AboutToExpireListing aboutToExpireListing = (AboutToExpireListing) b0Var.getValue();
            if (aboutToExpireListing != null) {
                num = kotlin.coroutines.jvm.internal.a.d(aboutToExpireListing.getId());
            } else {
                num = null;
            }
            x10.a.b("XXXX: " + num, new Object[0]);
            b0Var2 = this.this$0.activeAboutToExpireListing;
            AboutToExpireListing aboutToExpireListing2 = (AboutToExpireListing) b0Var2.getValue();
            if (aboutToExpireListing2 != null) {
                listingsService = this.this$0.listingsService;
                GetListingDetailsBody createListingDetails = GetListingDetailsBody.Companion.createListingDetails(new ListingDetailsType.AdvId(aboutToExpireListing2.getId()), LocaleManager.f39597a.g(), PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE);
                this.label = 1;
                obj = listingsService.getListingDetails(createListingDetails, this);
                if (obj == f11) {
                    return f11;
                }
            } else {
                return null;
            }
        }
        return (ListingItemDetails) obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ListingItemDetails> aVar) {
        return ((ExpireSoonRepository$loadListingDetails$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
