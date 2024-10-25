package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannersLinksProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.BannerLinkProcessor", f = "BannersLinksProcessor.kt", l = {29}, m = "execute")
/* loaded from: classes2.dex */
public final class BannerLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37669a;

    /* renamed from: b  reason: collision with root package name */
    Object f37670b;

    /* renamed from: c  reason: collision with root package name */
    int f37671c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f37672d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BannerLinkProcessor f37673e;

    /* renamed from: f  reason: collision with root package name */
    int f37674f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerLinkProcessor$execute$1(BannerLinkProcessor bannerLinkProcessor, zz.a<? super BannerLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37673e = bannerLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37672d = obj;
        this.f37674f |= Integer.MIN_VALUE;
        return this.f37673e.a(null, null, null, null, this);
    }
}
