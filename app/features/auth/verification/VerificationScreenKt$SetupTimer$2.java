package com.forsale.app.features.auth.verification;

import g00.q;
import ja.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: VerificationScreen.kt */
/* loaded from: classes2.dex */
/* synthetic */ class VerificationScreenKt$SetupTimer$2 extends FunctionReferenceImpl implements q<ResendOTPMethods, a, String, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public VerificationScreenKt$SetupTimer$2(Object obj) {
        super(3, obj, VerificationScreenViewModel.class, "resendOTP", "resendOTP(Lcom/forsale/app/features/auth/verification/ResendOTPMethods;Lcom/forsale/app/features/auth/models/UserModel;Ljava/lang/String;)V", 0);
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(ResendOTPMethods resendOTPMethods, a aVar, String str) {
        m(resendOTPMethods, aVar, str);
        return p.f75480a;
    }

    public final void m(ResendOTPMethods p02, a p12, String p22) {
        o.i(p02, "p0");
        o.i(p12, "p1");
        o.i(p22, "p2");
        ((VerificationScreenViewModel) this.receiver).Q(p02, p12, p22);
    }
}
