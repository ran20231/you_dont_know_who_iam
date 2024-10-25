package com.forsale.app.features.more.user.editprofile.changepassword;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* compiled from: ChangePasswordDialogFragment.kt */
/* loaded from: classes2.dex */
/* synthetic */ class ChangePasswordDialogFragment$ChangePasswordScreen$confirmPasswordTextFieldState$1$1 extends FunctionReferenceImpl implements p<String, String, h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangePasswordDialogFragment$ChangePasswordScreen$confirmPasswordTextFieldState$1$1(Object obj) {
        super(2, obj, ChangePasswordViewModel.class, "isConfirmPasswordValid", "isConfirmPasswordValid(Ljava/lang/String;Ljava/lang/String;)Lcom/forsale/app/features/auth/interactors/validationinteractors/ValidationResult;", 0);
    }

    @Override // g00.p
    /* renamed from: m */
    public final h invoke(String p02, String p12) {
        o.i(p02, "p0");
        o.i(p12, "p1");
        return ((ChangePasswordViewModel) this.receiver).B(p02, p12);
    }
}
