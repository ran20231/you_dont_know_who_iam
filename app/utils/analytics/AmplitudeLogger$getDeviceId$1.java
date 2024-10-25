package com.forsale.app.utils.analytics;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AmplitudeLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AmplitudeLogger$getDeviceId$1", f = "AmplitudeLogger.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AmplitudeLogger$getDeviceId$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super String>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AmplitudeLogger f39967b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeLogger$getDeviceId$1(AmplitudeLogger amplitudeLogger, zz.a<? super AmplitudeLogger$getDeviceId$1> aVar) {
        super(2, aVar);
        this.f39967b = amplitudeLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AmplitudeLogger$getDeviceId$1(this.f39967b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39966a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f39967b.f39962b;
            kj.b c11 = bVar.c();
            this.f39966a = 1;
            obj = c11.a(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super String> aVar) {
        return ((AmplitudeLogger$getDeviceId$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
