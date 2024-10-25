package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* compiled from: EditPersonalInformationDialogFragment.kt */
/* loaded from: classes2.dex */
/* synthetic */ class EditPersonalInformationDialogFragment$EditPersonalInformationScreen$emailTextFieldState$1$1 extends FunctionReferenceImpl implements l<String, h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EditPersonalInformationDialogFragment$EditPersonalInformationScreen$emailTextFieldState$1$1(Object obj) {
        super(1, obj, EditPersonalInformationViewModel.class, "isValidEmail", "isValidEmail(Ljava/lang/String;)Lcom/forsale/app/features/auth/interactors/validationinteractors/ValidationResult;", 0);
    }

    @Override // g00.l
    /* renamed from: m */
    public final h invoke(String p02) {
        o.i(p02, "p0");
        return ((EditPersonalInformationViewModel) this.receiver).C(p02);
    }
}
