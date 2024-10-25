package com.forsale.app.utils.analytics;

import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AWSEventsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AWSEventsLogger$onMoveToForeground$1", f = "AWSEventsLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AWSEventsLogger$onMoveToForeground$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AWSEventsLogger f39716b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSEventsLogger$onMoveToForeground$1(AWSEventsLogger aWSEventsLogger, zz.a<? super AWSEventsLogger$onMoveToForeground$1> aVar) {
        super(2, aVar);
        this.f39716b = aWSEventsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AWSEventsLogger$onMoveToForeground$1(this.f39716b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PinpointManager g11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f39715a == 0) {
            kotlin.f.b(obj);
            g11 = this.f39716b.g();
            SessionClient b11 = g11.b();
            if (b11 != null) {
                b11.c();
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AWSEventsLogger$onMoveToForeground$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
