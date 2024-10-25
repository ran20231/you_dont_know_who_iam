package com.forsale.app.routing.deeplinks.mappers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeepLinksCampainParamsMapper.kt */
@d(c = "com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper", f = "DeepLinksCampainParamsMapper.kt", l = {20}, m = "invoke")
/* loaded from: classes2.dex */
public final class DeepLinksCampaignParamsMapper$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37660a;

    /* renamed from: b  reason: collision with root package name */
    Object f37661b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37662c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DeepLinksCampaignParamsMapper f37663d;

    /* renamed from: e  reason: collision with root package name */
    int f37664e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinksCampaignParamsMapper$invoke$1(DeepLinksCampaignParamsMapper deepLinksCampaignParamsMapper, zz.a<? super DeepLinksCampaignParamsMapper$invoke$1> aVar) {
        super(aVar);
        this.f37663d = deepLinksCampaignParamsMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37662c = obj;
        this.f37664e |= Integer.MIN_VALUE;
        return this.f37663d.b(null, null, null, this);
    }
}
