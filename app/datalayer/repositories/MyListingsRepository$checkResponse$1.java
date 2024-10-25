package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MyListingsRepository", f = "MyListingsRepository.kt", l = {64, 66, 68}, m = "checkResponse")
/* loaded from: classes2.dex */
public final class MyListingsRepository$checkResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MyListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListingsRepository$checkResponse$1(MyListingsRepository myListingsRepository, zz.a<? super MyListingsRepository$checkResponse$1> aVar) {
        super(aVar);
        this.this$0 = myListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object checkResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkResponse = this.this$0.checkResponse(null, null, null, this);
        return checkResponse;
    }
}
