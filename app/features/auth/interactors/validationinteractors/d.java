package com.forsale.app.features.auth.interactors.validationinteractors;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import kotlin.jvm.internal.o;
/* compiled from: FieldsValidatorIneractor.kt */
/* loaded from: classes2.dex */
public final class d {
    public final boolean a(h... validationResult) {
        o.i(validationResult, "validationResult");
        for (h hVar : validationResult) {
            if (!o.d(hVar, h.b.f22741a)) {
                return false;
            }
        }
        return true;
    }
}
