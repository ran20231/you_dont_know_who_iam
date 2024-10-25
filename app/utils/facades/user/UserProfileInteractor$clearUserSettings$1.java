package com.forsale.app.utils.facades.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor", f = "UserProfileInteractor.kt", l = {98, 99}, m = "clearUserSettings")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$clearUserSettings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40254a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40256c;

    /* renamed from: d  reason: collision with root package name */
    int f40257d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$clearUserSettings$1(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$clearUserSettings$1> aVar) {
        super(aVar);
        this.f40256c = userProfileInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40255b = obj;
        this.f40257d |= Integer.MIN_VALUE;
        return this.f40256c.h(this);
    }
}
