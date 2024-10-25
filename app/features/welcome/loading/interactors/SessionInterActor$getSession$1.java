package com.forsale.app.features.welcome.loading.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionInterActor.kt */
@d(c = "com.forsale.app.features.welcome.loading.interactors.SessionInterActor", f = "SessionInterActor.kt", l = {18, 19}, m = "getSession")
/* loaded from: classes2.dex */
public final class SessionInterActor$getSession$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37389a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37390b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionInterActor f37391c;

    /* renamed from: d  reason: collision with root package name */
    int f37392d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionInterActor$getSession$1(SessionInterActor sessionInterActor, a<? super SessionInterActor$getSession$1> aVar) {
        super(aVar);
        this.f37391c = sessionInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37390b = obj;
        this.f37392d |= Integer.MIN_VALUE;
        return this.f37391c.a(null, this);
    }
}
