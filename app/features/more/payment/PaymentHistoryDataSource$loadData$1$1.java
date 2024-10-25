package com.forsale.app.features.more.payment;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import zz.a;
/* compiled from: PaymentHistoryDataSource.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryDataSource$loadData$1$1", f = "PaymentHistoryDataSource.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentHistoryDataSource$loadData$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryDataSource f32727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryDataSource$loadData$1$1(PaymentHistoryDataSource paymentHistoryDataSource, a<? super PaymentHistoryDataSource$loadData$1$1> aVar) {
        super(2, aVar);
        this.f32727b = paymentHistoryDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PaymentHistoryDataSource$loadData$1$1(this.f32727b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f32726a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f32727b.f32709c;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.P4);
            this.f32726a = 1;
            if (mutableSharedFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PaymentHistoryDataSource$loadData$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
