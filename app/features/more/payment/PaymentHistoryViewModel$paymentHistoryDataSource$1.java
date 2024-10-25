package com.forsale.app.features.more.payment;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentHistoryViewModel.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryViewModel", f = "PaymentHistoryViewModel.kt", l = {ConnectionResult.API_DISABLED}, m = "paymentHistoryDataSource")
/* loaded from: classes2.dex */
public final class PaymentHistoryViewModel$paymentHistoryDataSource$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f32782a;

    /* renamed from: b  reason: collision with root package name */
    Object f32783b;

    /* renamed from: c  reason: collision with root package name */
    Object f32784c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f32785d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryViewModel f32786e;

    /* renamed from: f  reason: collision with root package name */
    int f32787f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryViewModel$paymentHistoryDataSource$1(PaymentHistoryViewModel paymentHistoryViewModel, a<? super PaymentHistoryViewModel$paymentHistoryDataSource$1> aVar) {
        super(aVar);
        this.f32786e = paymentHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object C0;
        this.f32785d = obj;
        this.f32787f |= Integer.MIN_VALUE;
        C0 = this.f32786e.C0(this);
        return C0;
    }
}
