package com.forsale.app.features.auth.verification;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$setOTPMethodToDefault$1", f = "VerificationScreenViewModel.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$setOTPMethodToDefault$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f23099c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$setOTPMethodToDefault$1(VerificationScreenViewModel verificationScreenViewModel, boolean z11, a<? super VerificationScreenViewModel$setOTPMethodToDefault$1> aVar) {
        super(2, aVar);
        this.f23098b = verificationScreenViewModel;
        this.f23099c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenViewModel$setOTPMethodToDefault$1(this.f23098b, this.f23099c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ka.a aVar;
        f11 = b.f();
        int i11 = this.f23097a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.f23098b.f23038d;
            boolean z11 = this.f23099c;
            this.f23097a = 1;
            if (aVar.a(z11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenViewModel$setOTPMethodToDefault$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
