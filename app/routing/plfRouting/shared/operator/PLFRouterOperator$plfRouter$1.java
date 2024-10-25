package com.forsale.app.routing.plfRouting.shared.operator;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFRouterOperator.kt */
@d(c = "com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator", f = "PLFRouterOperator.kt", l = {45}, m = "plfRouter")
/* loaded from: classes2.dex */
public final class PLFRouterOperator$plfRouter$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37821a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37822b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PLFRouterOperator f37823c;

    /* renamed from: d  reason: collision with root package name */
    int f37824d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFRouterOperator$plfRouter$1(PLFRouterOperator pLFRouterOperator, a<? super PLFRouterOperator$plfRouter$1> aVar) {
        super(aVar);
        this.f37823c = pLFRouterOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37822b = obj;
        this.f37824d |= Integer.MIN_VALUE;
        return this.f37823c.a(this);
    }
}
