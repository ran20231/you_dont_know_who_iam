package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistrationLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.RegistrationLinkProcessor", f = "RegistrationLinkProcessor.kt", l = {22}, m = "execute")
/* loaded from: classes2.dex */
public final class RegistrationLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37762a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37763b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RegistrationLinkProcessor f37764c;

    /* renamed from: d  reason: collision with root package name */
    int f37765d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationLinkProcessor$execute$1(RegistrationLinkProcessor registrationLinkProcessor, zz.a<? super RegistrationLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37764c = registrationLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37763b = obj;
        this.f37765d |= Integer.MIN_VALUE;
        return this.f37764c.a(null, null, null, null, this);
    }
}
