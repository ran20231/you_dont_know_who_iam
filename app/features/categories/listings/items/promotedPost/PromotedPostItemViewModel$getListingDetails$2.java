package com.forsale.app.features.categories.listings.items.promotedPost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$getListingDetails$2", f = "PromotedPostItemViewModel.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel$getListingDetails$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30892a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f30893b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f30894c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel$getListingDetails$2(PromotedPostItemViewModel promotedPostItemViewModel, int i11, zz.a<? super PromotedPostItemViewModel$getListingDetails$2> aVar) {
        super(2, aVar);
        this.f30893b = promotedPostItemViewModel;
        this.f30894c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItemViewModel$getListingDetails$2(this.f30893b, this.f30894c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsService listingsService;
        b0 b0Var;
        f11 = b.f();
        int i11 = this.f30892a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            listingsService = this.f30893b.f30870f;
            GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(this.f30894c), LocaleManager.f39597a.g(), null, 4, null);
            this.f30892a = 1;
            obj = listingsService.getListingDetails(createListingDetails$default, this);
            if (obj == f11) {
                return f11;
            }
        }
        b0Var = this.f30893b.F;
        b0Var.postValue(kotlin.coroutines.jvm.internal.a.d(((ListingItemDetails) obj).getCatId()));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItemViewModel$getListingDetails$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
