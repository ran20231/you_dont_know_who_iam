package com.forsale.app.routing.deeplinks.delegation;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeepLinksDelegation.kt */
@d(c = "com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation", f = "DeepLinksDelegation.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "processCampaignParamsIfExist")
/* loaded from: classes2.dex */
public final class DeepLinksDelegation$processCampaignParamsIfExist$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37655a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37656b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeepLinksDelegation f37657c;

    /* renamed from: d  reason: collision with root package name */
    int f37658d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinksDelegation$processCampaignParamsIfExist$1(DeepLinksDelegation deepLinksDelegation, a<? super DeepLinksDelegation$processCampaignParamsIfExist$1> aVar) {
        super(aVar);
        this.f37657c = deepLinksDelegation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j11;
        this.f37656b = obj;
        this.f37658d |= Integer.MIN_VALUE;
        j11 = this.f37657c.j(null, this);
        return j11;
    }
}
