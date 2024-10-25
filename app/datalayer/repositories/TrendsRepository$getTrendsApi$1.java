package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrendsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.TrendsRepository", f = "TrendsRepository.kt", l = {64}, m = "getTrendsApi")
/* loaded from: classes2.dex */
public final class TrendsRepository$getTrendsApi$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrendsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendsRepository$getTrendsApi$1(TrendsRepository trendsRepository, zz.a<? super TrendsRepository$getTrendsApi$1> aVar) {
        super(aVar);
        this.this$0 = trendsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object trendsApi;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        trendsApi = this.this$0.getTrendsApi(this);
        return trendsApi;
    }
}
