package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.c;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: PasswordValidationInteractor.kt */
/* loaded from: classes2.dex */
public final class f {
    public static /* synthetic */ h b(f fVar, String str, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cVar = c.a.f22738a;
        }
        return fVar.a(str, cVar);
    }

    public final h a(String fieldText, c fieldSourceType) {
        boolean z11;
        o.i(fieldText, "fieldText");
        o.i(fieldSourceType, "fieldSourceType");
        if (fieldText.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (o.d(fieldSourceType, c.a.f22738a)) {
                return new h.a(ValidationMessages.EmptyPasswordField);
            }
            if (fieldSourceType instanceof c.b) {
                if (((c.b) fieldSourceType).a() == ChangePasswordFieldType.OLD_PASSWORD) {
                    return new h.a(ValidationMessages.EmptyOldPasswordField);
                }
                return new h.a(ValidationMessages.EmptyNewPasswordField);
            }
            throw new NoWhenBranchMatchedException();
        } else if (fieldText.length() < 8) {
            return new h.a(ValidationMessages.InvalidPassword);
        } else {
            return h.b.f22741a;
        }
    }
}
