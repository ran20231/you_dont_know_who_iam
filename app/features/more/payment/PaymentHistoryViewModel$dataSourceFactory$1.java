package com.forsale.app.features.more.payment;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentHistoryViewModel.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryViewModel", f = "PaymentHistoryViewModel.kt", l = {24}, m = "dataSourceFactory")
/* loaded from: classes2.dex */
public final class PaymentHistoryViewModel$dataSourceFactory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f32775a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryViewModel f32776b;

    /* renamed from: c  reason: collision with root package name */
    int f32777c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryViewModel$dataSourceFactory$1(PaymentHistoryViewModel paymentHistoryViewModel, a<? super PaymentHistoryViewModel$dataSourceFactory$1> aVar) {
        super(aVar);
        this.f32776b = paymentHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y02;
        this.f32775a = obj;
        this.f32777c |= Integer.MIN_VALUE;
        y02 = this.f32776b.y0(this);
        return y02;
    }
}
