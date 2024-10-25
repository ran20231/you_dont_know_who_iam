package com.forsale.app.features.auth.verification;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$resendOTP$1", f = "VerificationScreenViewModel.kt", l = {164, 165, 166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$resendOTP$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23076a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23077b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ResendOTPMethods f23078c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f23079d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ja.a f23080e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$resendOTP$1(VerificationScreenViewModel verificationScreenViewModel, ResendOTPMethods resendOTPMethods, String str, ja.a aVar, a<? super VerificationScreenViewModel$resendOTP$1> aVar2) {
        super(2, aVar2);
        this.f23077b = verificationScreenViewModel;
        this.f23078c = resendOTPMethods;
        this.f23079d = str;
        this.f23080e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenViewModel$resendOTP$1(this.f23077b, this.f23078c, this.f23079d, this.f23080e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f23076a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r6)
            goto L5d
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.f.b(r6)
            goto L4c
        L21:
            kotlin.f.b(r6)
            goto L39
        L25:
            kotlin.f.b(r6)
            com.forsale.app.features.auth.verification.VerificationScreenViewModel r6 = r5.f23077b
            ka.a r6 = com.forsale.app.features.auth.verification.VerificationScreenViewModel.g(r6)
            com.forsale.app.features.auth.verification.ResendOTPMethods r1 = r5.f23078c
            r5.f23076a = r4
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 != r0) goto L39
            return r0
        L39:
            com.forsale.app.features.auth.verification.VerificationScreenViewModel r6 = r5.f23077b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.forsale.app.features.auth.verification.VerificationScreenViewModel.j(r6)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
            r5.f23076a = r3
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L4c
            return r0
        L4c:
            com.forsale.app.features.auth.verification.VerificationScreenViewModel r6 = r5.f23077b
            java.lang.String r1 = r5.f23079d
            ja.a r3 = r5.f23080e
            com.forsale.app.features.auth.verification.ResendOTPMethods r4 = r5.f23078c
            r5.f23076a = r2
            java.lang.Object r6 = com.forsale.app.features.auth.verification.VerificationScreenViewModel.l(r6, r1, r3, r4, r5)
            if (r6 != r0) goto L5d
            return r0
        L5d:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationScreenViewModel$resendOTP$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenViewModel$resendOTP$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
