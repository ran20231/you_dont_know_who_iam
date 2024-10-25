package com.forsale.app.features.auth.signup;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignUpViewModel.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpViewModel", f = "SignUpViewModel.kt", l = {FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 104}, m = "onSignUpSuccess")
/* loaded from: classes2.dex */
public final class SignUpViewModel$onSignUpSuccess$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22901a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f22902b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22903c;

    /* renamed from: d  reason: collision with root package name */
    int f22904d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$onSignUpSuccess$1(SignUpViewModel signUpViewModel, zz.a<? super SignUpViewModel$onSignUpSuccess$1> aVar) {
        super(aVar);
        this.f22903c = signUpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O;
        this.f22902b = obj;
        this.f22904d |= Integer.MIN_VALUE;
        O = this.f22903c.O(this);
        return O;
    }
}
