package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {1001}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25682a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25683b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1> aVar) {
        super(2, aVar);
        this.f25683b = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1(this.f25683b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25682a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f25683b.f25657p0;
            ab.a aVar = new ab.a(null, false, null, 7, null);
            this.f25682a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$closeCTAsBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
