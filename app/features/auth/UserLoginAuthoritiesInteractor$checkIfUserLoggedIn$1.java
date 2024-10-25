package com.forsale.app.features.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserLoginAuthoritiesInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.UserLoginAuthoritiesInteractor", f = "UserLoginAuthoritiesInteractor.kt", l = {12}, m = "checkIfUserLoggedIn")
/* loaded from: classes2.dex */
public final class UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f22606a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserLoginAuthoritiesInteractor f22607b;

    /* renamed from: c  reason: collision with root package name */
    int f22608c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1(UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, zz.a<? super UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1> aVar) {
        super(aVar);
        this.f22607b = userLoginAuthoritiesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22606a = obj;
        this.f22608c |= Integer.MIN_VALUE;
        return this.f22607b.a(this);
    }
}
