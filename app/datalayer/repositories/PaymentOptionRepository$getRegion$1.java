package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentOptionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.PaymentOptionRepository", f = "PaymentOptionRepository.kt", l = {14}, m = "getRegion")
/* loaded from: classes2.dex */
public final class PaymentOptionRepository$getRegion$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentOptionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionRepository$getRegion$1(PaymentOptionRepository paymentOptionRepository, zz.a<? super PaymentOptionRepository$getRegion$1> aVar) {
        super(aVar);
        this.this$0 = paymentOptionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRegion(this);
    }
}
