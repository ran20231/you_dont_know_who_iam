package com.forsale.app.utils.facades.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor", f = "UserProfileInteractor.kt", l = {46}, m = "getUserAndUpdate")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$getUserAndUpdate$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f40266a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40267b;

    /* renamed from: c  reason: collision with root package name */
    int f40268c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$getUserAndUpdate$1(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$getUserAndUpdate$1> aVar) {
        super(aVar);
        this.f40267b = userProfileInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40266a = obj;
        this.f40268c |= Integer.MIN_VALUE;
        return this.f40267b.n(null, false, this);
    }
}
