package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.feedback.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.q0;
import t9.y0;
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25684a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25685b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1> aVar) {
        super(2, aVar);
        this.f25685b = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1(this.f25685b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25684a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f25685b.f25652k0;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f25684a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$connectivityExceptionsHandler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
