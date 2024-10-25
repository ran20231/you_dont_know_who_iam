package com.forsale.app.features.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserLoginAuthoritiesInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.UserLoginAuthoritiesInteractor", f = "UserLoginAuthoritiesInteractor.kt", l = {25}, m = "getUserStatus")
/* loaded from: classes2.dex */
public final class UserLoginAuthoritiesInteractor$getUserStatus$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f22609a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserLoginAuthoritiesInteractor f22610b;

    /* renamed from: c  reason: collision with root package name */
    int f22611c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoginAuthoritiesInteractor$getUserStatus$1(UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, zz.a<? super UserLoginAuthoritiesInteractor$getUserStatus$1> aVar) {
        super(aVar);
        this.f22610b = userLoginAuthoritiesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22609a = obj;
        this.f22611c |= Integer.MIN_VALUE;
        return this.f22610b.b(0, this);
    }
}
