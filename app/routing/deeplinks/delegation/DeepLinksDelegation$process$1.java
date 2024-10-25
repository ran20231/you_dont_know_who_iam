package com.forsale.app.routing.deeplinks.delegation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeepLinksDelegation.kt */
@d(c = "com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation", f = "DeepLinksDelegation.kt", l = {36}, m = "process")
/* loaded from: classes2.dex */
public final class DeepLinksDelegation$process$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37643a;

    /* renamed from: b  reason: collision with root package name */
    Object f37644b;

    /* renamed from: c  reason: collision with root package name */
    Object f37645c;

    /* renamed from: d  reason: collision with root package name */
    Object f37646d;

    /* renamed from: e  reason: collision with root package name */
    boolean f37647e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f37648f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ DeepLinksDelegation f37649g;

    /* renamed from: h  reason: collision with root package name */
    int f37650h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinksDelegation$process$1(DeepLinksDelegation deepLinksDelegation, a<? super DeepLinksDelegation$process$1> aVar) {
        super(aVar);
        this.f37649g = deepLinksDelegation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37648f = obj;
        this.f37650h |= Integer.MIN_VALUE;
        return this.f37649g.b(null, false, null, null, this);
    }
}
