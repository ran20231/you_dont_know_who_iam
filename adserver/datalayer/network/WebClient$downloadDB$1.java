package com.forsale.adserver.datalayer.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient", f = "WebClient.kt", l = {97}, m = "downloadDB")
/* loaded from: classes2.dex */
public final class WebClient$downloadDB$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20716a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20717b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebClient f20718c;

    /* renamed from: d  reason: collision with root package name */
    int f20719d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$downloadDB$1(WebClient webClient, a<? super WebClient$downloadDB$1> aVar) {
        super(aVar);
        this.f20718c = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j11;
        this.f20717b = obj;
        this.f20719d |= Integer.MIN_VALUE;
        j11 = this.f20718c.j(null, this);
        return j11;
    }
}
