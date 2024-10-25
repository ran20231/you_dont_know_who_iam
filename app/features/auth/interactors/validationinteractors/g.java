package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.utils.validation.PhoneDetectorKt;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: PhoneNumberValidatorInteractor.kt */
/* loaded from: classes2.dex */
public final class g {
    public final h a(String phoneNumber, String countryCode) {
        String r02;
        boolean z11;
        String r03;
        o.i(phoneNumber, "phoneNumber");
        o.i(countryCode, "countryCode");
        r02 = StringsKt__StringsKt.r0(phoneNumber, countryCode);
        if (r02.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            r03 = StringsKt__StringsKt.r0(phoneNumber, countryCode);
            if (r03.length() < 5) {
                return new h.a(ValidationMessages.InvalidPhoneNumber);
            }
            if (!PhoneDetectorKt.f(phoneNumber, countryCode)) {
                return new h.a(ValidationMessages.InvalidPhoneNumber);
            }
            return h.b.f22741a;
        }
        return new h.a(ValidationMessages.EmptyPhoneNumberField);
    }
}
