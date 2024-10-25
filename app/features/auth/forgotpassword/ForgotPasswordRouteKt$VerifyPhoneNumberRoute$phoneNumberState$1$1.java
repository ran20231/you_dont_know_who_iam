package com.forsale.app.features.auth.forgotpassword;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* compiled from: ForgotPasswordRoute.kt */
/* loaded from: classes2.dex */
/* synthetic */ class ForgotPasswordRouteKt$VerifyPhoneNumberRoute$phoneNumberState$1$1 extends FunctionReferenceImpl implements l<String, h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ForgotPasswordRouteKt$VerifyPhoneNumberRoute$phoneNumberState$1$1(Object obj) {
        super(1, obj, ForgotPasswordViewModel.class, "isPhoneNumberValid", "isPhoneNumberValid(Ljava/lang/String;)Lcom/forsale/app/features/auth/interactors/validationinteractors/ValidationResult;", 0);
    }

    @Override // g00.l
    /* renamed from: m */
    public final h invoke(String p02) {
        o.i(p02, "p0");
        return ((ForgotPasswordViewModel) this.receiver).x(p02);
    }
}
