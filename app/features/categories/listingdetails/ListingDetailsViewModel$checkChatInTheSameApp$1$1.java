package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$checkChatInTheSameApp$1$1", f = "ListingDetailsViewModel.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$checkChatInTheSameApp$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25371a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f25373c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$checkChatInTheSameApp$1$1(ListingDetailsViewModel listingDetailsViewModel, ListingItemDetails listingItemDetails, zz.a<? super ListingDetailsViewModel$checkChatInTheSameApp$1$1> aVar) {
        super(2, aVar);
        this.f25372b = listingDetailsViewModel;
        this.f25373c = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$checkChatInTheSameApp$1$1(this.f25372b, this.f25373c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25371a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            OneShotEventHandler<Triple<String, String, String>> e12 = this.f25372b.e1();
            ListingSourceApp sourceApp = this.f25373c.getSourceApp();
            Triple<String, String, String> triple = new Triple<>((sourceApp == null || (r3 = sourceApp.getValue()) == null) ? "" : "", String.valueOf(this.f25373c.getId()), this.f25373c.getTitle());
            this.f25371a = 1;
            if (e12.f(triple, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$checkChatInTheSameApp$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
