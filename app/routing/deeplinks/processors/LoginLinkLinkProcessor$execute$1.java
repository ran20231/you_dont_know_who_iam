package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor", f = "LoginLinkProcessor.kt", l = {22}, m = "execute")
/* loaded from: classes2.dex */
public final class LoginLinkLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37720a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37721b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginLinkLinkProcessor f37722c;

    /* renamed from: d  reason: collision with root package name */
    int f37723d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginLinkLinkProcessor$execute$1(LoginLinkLinkProcessor loginLinkLinkProcessor, zz.a<? super LoginLinkLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37722c = loginLinkLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37721b = obj;
        this.f37723d |= Integer.MIN_VALUE;
        return this.f37722c.a(null, null, null, null, this);
    }
}
