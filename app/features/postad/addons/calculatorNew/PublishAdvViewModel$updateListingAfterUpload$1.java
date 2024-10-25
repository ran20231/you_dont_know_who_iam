package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.NewListingResponse;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$updateListingAfterUpload$1", f = "PublishAdvViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PublishAdvViewModel$updateListingAfterUpload$1 extends SuspendLambda implements p<ListingDetailsEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34672a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f34673b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingResponse f34674c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$updateListingAfterUpload$1(NewListingResponse newListingResponse, zz.a<? super PublishAdvViewModel$updateListingAfterUpload$1> aVar) {
        super(2, aVar);
        this.f34674c = newListingResponse;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$updateListingAfterUpload$1) create(listingDetailsEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PublishAdvViewModel$updateListingAfterUpload$1 publishAdvViewModel$updateListingAfterUpload$1 = new PublishAdvViewModel$updateListingAfterUpload$1(this.f34674c, aVar);
        publishAdvViewModel$updateListingAfterUpload$1.f34673b = obj;
        return publishAdvViewModel$updateListingAfterUpload$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f34672a == 0) {
            f.b(obj);
            ((ListingDetailsEntity) this.f34673b).setId(this.f34674c.getAdvId());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
