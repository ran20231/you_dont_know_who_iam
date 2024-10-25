package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentLinksProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.PaymentLinkProcessor", f = "PaymentLinksProcessor.kt", l = {25}, m = "execute")
/* loaded from: classes2.dex */
public final class PaymentLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37754a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37755b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PaymentLinkProcessor f37756c;

    /* renamed from: d  reason: collision with root package name */
    int f37757d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLinkProcessor$execute$1(PaymentLinkProcessor paymentLinkProcessor, zz.a<? super PaymentLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37756c = paymentLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37755b = obj;
        this.f37757d |= Integer.MIN_VALUE;
        return this.f37756c.a(null, null, null, null, this);
    }
}
