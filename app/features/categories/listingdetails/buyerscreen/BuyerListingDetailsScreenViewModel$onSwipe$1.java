package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onSwipe$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onSwipe$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25757a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25758b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f25759c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onSwipe$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, zz.a<? super BuyerListingDetailsScreenViewModel$onSwipe$1> aVar) {
        super(2, aVar);
        this.f25758b = buyerListingDetailsScreenViewModel;
        this.f25759c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onSwipe$1(this.f25758b, this.f25759c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        t.a aVar;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f25757a == 0) {
            kotlin.f.b(obj);
            mutableStateFlow = this.f25758b.Q;
            Object value = mutableStateFlow.getValue();
            q d11 = this.f25758b.f25632a.d(this.f25758b.k0().getValue());
            if (d11 != null) {
                aVar = new t.a(d11);
            } else {
                aVar = null;
            }
            if (!kotlin.jvm.internal.o.d(value, aVar)) {
                BuyerListingDetailsScreenViewModel.E0(this.f25758b, this.f25759c, false, 2, null);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onSwipe$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
