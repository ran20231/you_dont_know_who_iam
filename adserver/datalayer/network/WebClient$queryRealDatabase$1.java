package com.forsale.adserver.datalayer.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient", f = "WebClient.kt", l = {221}, m = "queryRealDatabase")
/* loaded from: classes2.dex */
public final class WebClient$queryRealDatabase$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20726a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebClient f20728c;

    /* renamed from: d  reason: collision with root package name */
    int f20729d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$queryRealDatabase$1(WebClient webClient, a<? super WebClient$queryRealDatabase$1> aVar) {
        super(aVar);
        this.f20728c = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object v11;
        this.f20727b = obj;
        this.f20729d |= Integer.MIN_VALUE;
        v11 = this.f20728c.v(this);
        return v11;
    }
}
