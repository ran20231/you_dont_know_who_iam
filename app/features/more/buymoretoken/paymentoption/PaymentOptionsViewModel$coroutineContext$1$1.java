package com.forsale.app.features.more.buymoretoken.paymentoption;

import com.forsale.app.datalayer.network.ResponseWrapper;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PaymentOptionsViewModel.kt */
@d(c = "com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel$coroutineContext$1$1", f = "PaymentOptionsViewModel.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PaymentOptionsViewModel$coroutineContext$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31826a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaymentOptionsViewModel f31827b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f31828c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsViewModel$coroutineContext$1$1(PaymentOptionsViewModel paymentOptionsViewModel, Throwable th2, zz.a<? super PaymentOptionsViewModel$coroutineContext$1$1> aVar) {
        super(2, aVar);
        this.f31827b = paymentOptionsViewModel;
        this.f31828c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PaymentOptionsViewModel$coroutineContext$1$1(this.f31827b, this.f31828c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31826a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> f02 = this.f31827b.f0();
            String localizedMessage = ((ResponseWrapper.ResponseErrorException) this.f31828c).getLocalizedMessage();
            this.f31826a = 1;
            if (f02.emit(localizedMessage, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PaymentOptionsViewModel$coroutineContext$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
