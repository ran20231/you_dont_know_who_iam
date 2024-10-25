package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OneShotEventHandler.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.OneShotEventHandler$postValue$1", f = "OneShotEventHandler.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OneShotEventHandler$postValue$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39636a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OneShotEventHandler<T> f39637b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ T f39638c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotEventHandler$postValue$1(OneShotEventHandler<T> oneShotEventHandler, T t11, zz.a<? super OneShotEventHandler$postValue$1> aVar) {
        super(2, aVar);
        this.f39637b = oneShotEventHandler;
        this.f39638c = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new OneShotEventHandler$postValue$1(this.f39637b, this.f39638c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39636a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ((OneShotEventHandler) this.f39637b).f39625c = this.f39638c;
            OneShotEventHandler<T> oneShotEventHandler = this.f39637b;
            T t11 = this.f39638c;
            this.f39636a = 1;
            if (oneShotEventHandler.f(t11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((OneShotEventHandler$postValue$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
