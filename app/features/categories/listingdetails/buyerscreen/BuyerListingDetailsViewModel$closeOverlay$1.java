package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsViewModel$closeOverlay$1", f = "BuyerListingDetailsViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsViewModel$closeOverlay$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsViewModel f25853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsViewModel$closeOverlay$1(BuyerListingDetailsViewModel buyerListingDetailsViewModel, zz.a<? super BuyerListingDetailsViewModel$closeOverlay$1> aVar) {
        super(2, aVar);
        this.f25853b = buyerListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsViewModel$closeOverlay$1(this.f25853b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25852a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f25853b.A;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
            this.f25852a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsViewModel$closeOverlay$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
