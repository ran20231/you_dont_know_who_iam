package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.InAppRepository", f = "InAppRepository.kt", l = {82}, m = "getInAppMessageByTypeAndCategoryDistricts")
/* loaded from: classes2.dex */
public final class InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1(InAppRepository inAppRepository, zz.a<? super InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1> aVar) {
        super(aVar);
        this.this$0 = inAppRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object inAppMessageByTypeAndCategoryDistricts;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        inAppMessageByTypeAndCategoryDistricts = this.this$0.getInAppMessageByTypeAndCategoryDistricts(null, null, null, this);
        return inAppMessageByTypeAndCategoryDistricts;
    }
}
