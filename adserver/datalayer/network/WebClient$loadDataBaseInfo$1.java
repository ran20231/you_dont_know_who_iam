package com.forsale.adserver.datalayer.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient", f = "WebClient.kt", l = {243, 246}, m = "loadDataBaseInfo")
/* loaded from: classes2.dex */
public final class WebClient$loadDataBaseInfo$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20720a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20721b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebClient f20722c;

    /* renamed from: d  reason: collision with root package name */
    int f20723d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$loadDataBaseInfo$1(WebClient webClient, a<? super WebClient$loadDataBaseInfo$1> aVar) {
        super(aVar);
        this.f20722c = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r11;
        this.f20721b = obj;
        this.f20723d |= Integer.MIN_VALUE;
        r11 = this.f20722c.r(this);
        return r11;
    }
}