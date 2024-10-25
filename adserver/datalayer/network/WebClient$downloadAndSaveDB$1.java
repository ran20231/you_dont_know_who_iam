package com.forsale.adserver.datalayer.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient", f = "WebClient.kt", l = {80, 83, 84, 86}, m = "downloadAndSaveDB")
/* loaded from: classes2.dex */
public final class WebClient$downloadAndSaveDB$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20711a;

    /* renamed from: b  reason: collision with root package name */
    Object f20712b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f20713c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WebClient f20714d;

    /* renamed from: e  reason: collision with root package name */
    int f20715e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$downloadAndSaveDB$1(WebClient webClient, a<? super WebClient$downloadAndSaveDB$1> aVar) {
        super(aVar);
        this.f20714d = webClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20713c = obj;
        this.f20715e |= Integer.MIN_VALUE;
        return this.f20714d.h(this);
    }
}
