package com.forsale.app.features.auth.login;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignInViewModel.kt */
@d(c = "com.forsale.app.features.auth.login.SignInViewModel", f = "SignInViewModel.kt", l = {137, 138}, m = "onScreenSuccess")
/* loaded from: classes2.dex */
public final class SignInViewModel$onScreenSuccess$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22801a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f22802b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SignInViewModel f22803c;

    /* renamed from: d  reason: collision with root package name */
    int f22804d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onScreenSuccess$1(SignInViewModel signInViewModel, a<? super SignInViewModel$onScreenSuccess$1> aVar) {
        super(aVar);
        this.f22803c = signInViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object M;
        this.f22802b = obj;
        this.f22804d |= Integer.MIN_VALUE;
        M = this.f22803c.M(null, null, this);
        return M;
    }
}
