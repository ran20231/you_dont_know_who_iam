package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchRecommendedListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository", f = "SearchRecommendedListingsRepository.kt", l = {146}, m = "hasCachedData")
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository$hasCachedData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRecommendedListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRecommendedListingsRepository$hasCachedData$1(SearchRecommendedListingsRepository searchRecommendedListingsRepository, zz.a<? super SearchRecommendedListingsRepository$hasCachedData$1> aVar) {
        super(aVar);
        this.this$0 = searchRecommendedListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object hasCachedData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hasCachedData = this.this$0.hasCachedData(this);
        return hasCachedData;
    }
}
