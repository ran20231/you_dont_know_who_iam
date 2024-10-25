package com.forsale.app.features.more.user.editprofile.changepassword;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* compiled from: ChangePasswordDialogFragment.kt */
/* loaded from: classes2.dex */
/* synthetic */ class ChangePasswordDialogFragment$ChangePasswordScreen$oldPasswordTextFieldState$1$1 extends FunctionReferenceImpl implements l<String, h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangePasswordDialogFragment$ChangePasswordScreen$oldPasswordTextFieldState$1$1(Object obj) {
        super(1, obj, ChangePasswordViewModel.class, "isOldPasswordValid", "isOldPasswordValid(Ljava/lang/String;)Lcom/forsale/app/features/auth/interactors/validationinteractors/ValidationResult;", 0);
    }

    @Override // g00.l
    /* renamed from: m */
    public final h invoke(String p02) {
        o.i(p02, "p0");
        return ((ChangePasswordViewModel) this.receiver).D(p02);
    }
}
