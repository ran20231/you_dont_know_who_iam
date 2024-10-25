package com.forsale.app.utils.facades;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskSupport.kt */
@d(c = "com.forsale.app.utils.facades.ZendeskSupport", f = "ZendeskSupport.kt", l = {175}, m = "getCustomFields")
/* loaded from: classes3.dex */
public final class ZendeskSupport$getCustomFields$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40130a;

    /* renamed from: b  reason: collision with root package name */
    Object f40131b;

    /* renamed from: c  reason: collision with root package name */
    Object f40132c;

    /* renamed from: d  reason: collision with root package name */
    Object f40133d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f40134e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40135f;

    /* renamed from: g  reason: collision with root package name */
    int f40136g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$getCustomFields$1(ZendeskSupport zendeskSupport, a<? super ZendeskSupport$getCustomFields$1> aVar) {
        super(aVar);
        this.f40135f = zendeskSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j11;
        this.f40134e = obj;
        this.f40136g |= Integer.MIN_VALUE;
        j11 = this.f40135f.j(this);
        return j11;
    }
}
