package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
/* compiled from: EmailValidatorInteractor.kt */
/* loaded from: classes2.dex */
public final class b {
    private final boolean a(String str) {
        return Pattern.matches("^(.+)@(.+)$", str);
    }

    public final h b(String fieldText) {
        boolean z11;
        o.i(fieldText, "fieldText");
        if (fieldText.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return new h.a(ValidationMessages.EmptyEmailField);
        }
        if (fieldText.length() < 5) {
            return new h.a(ValidationMessages.InvalidEmail);
        }
        if (!a(fieldText)) {
            return new h.a(ValidationMessages.InvalidEmail);
        }
        return h.b.f22741a;
    }
}
