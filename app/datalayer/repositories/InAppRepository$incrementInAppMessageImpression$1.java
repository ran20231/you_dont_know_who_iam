package com.forsale.app.datalayer.repositories;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.InAppRepository", f = "InAppRepository.kt", l = {FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 104}, m = "incrementInAppMessageImpression")
/* loaded from: classes2.dex */
public final class InAppRepository$incrementInAppMessageImpression$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$incrementInAppMessageImpression$1(InAppRepository inAppRepository, zz.a<? super InAppRepository$incrementInAppMessageImpression$1> aVar) {
        super(aVar);
        this.this$0 = inAppRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.incrementInAppMessageImpression(null, this);
    }
}
