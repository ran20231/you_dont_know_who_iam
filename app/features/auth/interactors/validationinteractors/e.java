package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
/* compiled from: NameValidatorInteractor.kt */
/* loaded from: classes2.dex */
public final class e {
    private final boolean a(String str) {
        boolean z11;
        int length = str.length();
        if (2 <= length && length < 51) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && Pattern.matches("^[a-zA-Z\\u0600-\\u06FF\\s]*$", str)) {
            return true;
        }
        return false;
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
            return new h.a(ValidationMessages.EmptyNameField);
        }
        if (fieldText.length() < 2) {
            return new h.a(ValidationMessages.InvalidName);
        }
        if (!a(fieldText)) {
            return new h.a(ValidationMessages.InvalidName);
        }
        return h.b.f22741a;
    }
}
