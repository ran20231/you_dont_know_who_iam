package com.forsale.app.utils.facades.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor", f = "UserProfileInteractor.kt", l = {67, 68, 71, 73}, m = "getSessionAndUpdate")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$getSessionAndUpdate$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40258a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40259b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40260c;

    /* renamed from: d  reason: collision with root package name */
    int f40261d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$getSessionAndUpdate$1(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$getSessionAndUpdate$1> aVar) {
        super(aVar);
        this.f40260c = userProfileInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40259b = obj;
        this.f40261d |= Integer.MIN_VALUE;
        return this.f40260c.k(null, null, this);
    }
}
