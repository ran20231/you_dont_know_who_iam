package com.forsale.app.features.auth.login;

import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* compiled from: SignInRoute.kt */
/* loaded from: classes2.dex */
/* synthetic */ class SignInRouteKt$SignInScreen$passwordState$1$1 extends FunctionReferenceImpl implements l<String, h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInRouteKt$SignInScreen$passwordState$1$1(Object obj) {
        super(1, obj, SignInViewModel.class, "isPasswordValid", "isPasswordValid(Ljava/lang/String;)Lcom/forsale/app/features/auth/interactors/validationinteractors/ValidationResult;", 0);
    }

    @Override // g00.l
    /* renamed from: m */
    public final h invoke(String p02) {
        o.i(p02, "p0");
        return ((SignInViewModel) this.receiver).H(p02);
    }
}
