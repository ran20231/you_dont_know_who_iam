package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleMessagingRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ForSaleMessagingRepository", f = "ForSaleMessagingRepository.kt", l = {16, 17}, m = "updatePushToken")
/* loaded from: classes2.dex */
public final class ForSaleMessagingRepository$updatePushToken$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ForSaleMessagingRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleMessagingRepository$updatePushToken$1(ForSaleMessagingRepository forSaleMessagingRepository, zz.a<? super ForSaleMessagingRepository$updatePushToken$1> aVar) {
        super(aVar);
        this.this$0 = forSaleMessagingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updatePushToken(null, this);
    }
}
