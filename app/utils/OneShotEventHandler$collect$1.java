package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OneShotEventHandler.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.OneShotEventHandler", f = "OneShotEventHandler.kt", l = {53}, m = "collect")
/* loaded from: classes3.dex */
public final class OneShotEventHandler$collect$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39626a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OneShotEventHandler<T> f39627b;

    /* renamed from: c  reason: collision with root package name */
    int f39628c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotEventHandler$collect$1(OneShotEventHandler<T> oneShotEventHandler, zz.a<? super OneShotEventHandler$collect$1> aVar) {
        super(aVar);
        this.f39627b = oneShotEventHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39626a = obj;
        this.f39628c |= Integer.MIN_VALUE;
        return this.f39627b.e(null, this);
    }
}
