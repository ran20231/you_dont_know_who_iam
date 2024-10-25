package com.forsale.app.utils.facades.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor", f = "UserProfileInteractor.kt", l = {78, 79}, m = "update")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$update$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40275a;

    /* renamed from: b  reason: collision with root package name */
    Object f40276b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40277c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40278d;

    /* renamed from: e  reason: collision with root package name */
    int f40279e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$update$1(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$update$1> aVar) {
        super(aVar);
        this.f40278d = userProfileInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40277c = obj;
        this.f40279e |= Integer.MIN_VALUE;
        return this.f40278d.t(null, false, this);
    }
}
