package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.c;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: ConfirmPasswordValidationInteractor.kt */
/* loaded from: classes2.dex */
public final class a {
    public static /* synthetic */ h b(a aVar, String str, String str2, c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cVar = c.a.f22738a;
        }
        return aVar.a(str, str2, cVar);
    }

    public final h a(String password, String confirmPassword, c fieldSourceType) {
        boolean z11;
        o.i(password, "password");
        o.i(confirmPassword, "confirmPassword");
        o.i(fieldSourceType, "fieldSourceType");
        boolean z12 = true;
        if (confirmPassword.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (password.length() <= 0) {
                z12 = false;
            }
            if (z12) {
                if (o.d(fieldSourceType, c.a.f22738a)) {
                    return new h.a(ValidationMessages.EmptyPasswordField);
                }
                if (fieldSourceType instanceof c.b) {
                    return new h.a(ValidationMessages.EmptyConfirmPasswordField);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        if (!o.d(password, confirmPassword)) {
            return new h.a(ValidationMessages.InvalidConfirmPassword);
        }
        return h.b.f22741a;
    }
}
