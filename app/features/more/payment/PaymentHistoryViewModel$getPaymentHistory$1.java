package com.forsale.app.features.more.payment;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentHistoryViewModel.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryViewModel", f = "PaymentHistoryViewModel.kt", l = {27}, m = "getPaymentHistory")
/* loaded from: classes2.dex */
public final class PaymentHistoryViewModel$getPaymentHistory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f32778a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32779b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryViewModel f32780c;

    /* renamed from: d  reason: collision with root package name */
    int f32781d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryViewModel$getPaymentHistory$1(PaymentHistoryViewModel paymentHistoryViewModel, a<? super PaymentHistoryViewModel$getPaymentHistory$1> aVar) {
        super(aVar);
        this.f32780c = paymentHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32779b = obj;
        this.f32781d |= Integer.MIN_VALUE;
        return this.f32780c.A0(this);
    }
}
