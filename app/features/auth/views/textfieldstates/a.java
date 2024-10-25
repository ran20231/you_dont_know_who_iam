package com.forsale.app.features.auth.views.textfieldstates;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.p;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ConfirmPasswordState.kt */
/* loaded from: classes2.dex */
public final class a extends TextFieldState {

    /* renamed from: h  reason: collision with root package name */
    private final TextFieldState f23200h;

    /* renamed from: i  reason: collision with root package name */
    private final p<String, String, h> f23201i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(TextFieldState passwordState, p<? super String, ? super String, ? extends h> validator, StateFlow<? extends rj.a> message) {
        super(null, message, 1, null);
        o.i(passwordState, "passwordState");
        o.i(validator, "validator");
        o.i(message, "message");
        this.f23200h = passwordState;
        this.f23201i = validator;
    }

    @Override // com.forsale.app.features.auth.views.textfieldstates.TextFieldState
    public boolean g() {
        return this.f23201i.invoke(this.f23200h.e(), e()) instanceof h.b;
    }
}
