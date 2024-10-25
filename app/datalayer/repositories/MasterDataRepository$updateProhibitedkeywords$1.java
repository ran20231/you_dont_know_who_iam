package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository", f = "MasterDataRepository.kt", l = {320, 323}, m = "updateProhibitedkeywords")
/* loaded from: classes2.dex */
public final class MasterDataRepository$updateProhibitedkeywords$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$updateProhibitedkeywords$1(MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$updateProhibitedkeywords$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateProhibitedkeywords;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateProhibitedkeywords = this.this$0.updateProhibitedkeywords(null, this);
        return updateProhibitedkeywords;
    }
}
