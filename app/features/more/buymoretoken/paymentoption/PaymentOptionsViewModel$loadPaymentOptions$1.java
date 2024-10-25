package com.forsale.app.features.more.buymoretoken.paymentoption;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentOptionsViewModel.kt */
@d(c = "com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel$loadPaymentOptions$1", f = "PaymentOptionsViewModel.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentOptionsViewModel$loadPaymentOptions$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31829a;

    /* renamed from: b  reason: collision with root package name */
    Object f31830b;

    /* renamed from: c  reason: collision with root package name */
    int f31831c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PaymentOptionsViewModel f31832d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsViewModel$loadPaymentOptions$1(PaymentOptionsViewModel paymentOptionsViewModel, zz.a<? super PaymentOptionsViewModel$loadPaymentOptions$1> aVar) {
        super(2, aVar);
        this.f31832d = paymentOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PaymentOptionsViewModel$loadPaymentOptions$1(this.f31832d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f31831c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r6.f31830b
            com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel r0 = (com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel) r0
            java.lang.Object r1 = r6.f31829a
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.f.b(r7)
            goto L56
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            kotlin.f.b(r7)
            goto L38
        L26:
            kotlin.f.b(r7)
            com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel r7 = r6.f31832d
            com.forsale.app.datalayer.repositories.PaymentOptionRepository r7 = com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel.w0(r7)
            r6.f31831c = r3
            java.lang.Object r7 = r7.getRegion(r6)
            if (r7 != r0) goto L38
            return r0
        L38:
            r1 = r7
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L9e
            com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel r7 = r6.f31832d
            int r4 = r1.intValue()
            com.forsale.app.datalayer.repositories.PaymentOptionRepository r5 = com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel.w0(r7)
            r6.f31829a = r1
            r6.f31830b = r7
            r6.f31831c = r2
            java.lang.Object r2 = r5.getData(r4, r6)
            if (r2 != r0) goto L54
            return r0
        L54:
            r0 = r7
            r7 = r2
        L56:
            java.util.List r7 = (java.util.List) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L60
            r2 = r7
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 == 0) goto L8d
            androidx.lifecycle.b0 r4 = r0.v0()
            com.forsale.app.base.ViewStates r5 = com.forsale.app.base.ViewStates.CONTENT
            r4.postValue(r5)
            int r2 = r2.size()
            if (r2 != r3) goto L7e
            com.forsale.app.utils.OneShotEventHandler r0 = r0.z0()
            java.lang.Object r7 = kotlin.collections.p.k0(r7)
            r0.i(r7)
            goto L96
        L7e:
            com.forsale.app.utils.OneShotEventHandler r0 = r0.A0()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Collection r7 = (java.util.Collection) r7
            r2.<init>(r7)
            r0.i(r2)
            goto L96
        L8d:
            androidx.lifecycle.b0 r7 = r0.v0()
            com.forsale.app.base.ViewStates r0 = com.forsale.app.base.ViewStates.Empty
            r7.postValue(r0)
        L96:
            int r7 = r1.intValue()
            kotlin.coroutines.jvm.internal.a.d(r7)
            goto La9
        L9e:
            com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel r7 = r6.f31832d
            androidx.lifecycle.b0 r7 = r7.v0()
            com.forsale.app.base.ViewStates r0 = com.forsale.app.base.ViewStates.Empty
            r7.postValue(r0)
        La9:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.buymoretoken.paymentoption.PaymentOptionsViewModel$loadPaymentOptions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PaymentOptionsViewModel$loadPaymentOptions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
