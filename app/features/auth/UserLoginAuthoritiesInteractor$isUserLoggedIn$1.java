package com.forsale.app.features.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserLoginAuthoritiesInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.UserLoginAuthoritiesInteractor", f = "UserLoginAuthoritiesInteractor.kt", l = {31}, m = "isUserLoggedIn")
/* loaded from: classes2.dex */
public final class UserLoginAuthoritiesInteractor$isUserLoggedIn$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f22612a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserLoginAuthoritiesInteractor f22613b;

    /* renamed from: c  reason: collision with root package name */
    int f22614c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoginAuthoritiesInteractor$isUserLoggedIn$1(UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, zz.a<? super UserLoginAuthoritiesInteractor$isUserLoggedIn$1> aVar) {
        super(aVar);
        this.f22613b = userLoginAuthoritiesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22612a = obj;
        this.f22614c |= Integer.MIN_VALUE;
        return this.f22613b.c(this);
    }
}
