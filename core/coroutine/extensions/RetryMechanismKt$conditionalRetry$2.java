package com.forsale.core.coroutine.extensions;

import g00.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetryMechanism.kt */
@d(c = "com.forsale.core.coroutine.extensions.RetryMechanismKt$conditionalRetry$2", f = "RetryMechanism.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RetryMechanismKt$conditionalRetry$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f40616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetryMechanismKt$conditionalRetry$2(a<? super RetryMechanismKt$conditionalRetry$2> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new RetryMechanismKt$conditionalRetry$2(aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Result) obj).j(), (a) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f40616a == 0) {
            f.b(obj);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(Object obj, a<? super wz.p> aVar) {
        return ((RetryMechanismKt$conditionalRetry$2) create(Result.a(obj), aVar)).invokeSuspend(wz.p.f75480a);
    }
}
