package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrendsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.TrendsRepository", f = "TrendsRepository.kt", l = {27, 35}, m = "getTrends")
/* loaded from: classes2.dex */
public final class TrendsRepository$getTrends$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrendsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendsRepository$getTrends$1(TrendsRepository trendsRepository, zz.a<? super TrendsRepository$getTrends$1> aVar) {
        super(aVar);
        this.this$0 = trendsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getTrends(this);
    }
}
