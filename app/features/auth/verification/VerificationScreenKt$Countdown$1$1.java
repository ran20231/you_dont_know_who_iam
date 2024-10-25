package com.forsale.app.features.auth.verification;

import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreen.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenKt$Countdown$1$1", f = "VerificationScreen.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenKt$Countdown$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f22941b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$Countdown$1$1(k0<Integer> k0Var, a<? super VerificationScreenKt$Countdown$1$1> aVar) {
        super(2, aVar);
        this.f22941b = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenKt$Countdown$1$1(this.f22941b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int b11;
        int b12;
        f11 = b.f();
        int i11 = this.f22940a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b11 = VerificationScreenKt.b(this.f22941b);
            if (b11 > 0) {
                this.f22940a = 1;
                if (DelayKt.delay(1000L, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
        b12 = VerificationScreenKt.b(this.f22941b);
        VerificationScreenKt.c(this.f22941b, b12 - 1);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenKt$Countdown$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
