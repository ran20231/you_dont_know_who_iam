package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchRecommendedListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository", f = "SearchRecommendedListingsRepository.kt", l = {117, 119}, m = "updateSearchRecommendedListingsDB")
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRecommendedListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1(SearchRecommendedListingsRepository searchRecommendedListingsRepository, zz.a<? super SearchRecommendedListingsRepository$updateSearchRecommendedListingsDB$1> aVar) {
        super(aVar);
        this.this$0 = searchRecommendedListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateSearchRecommendedListingsDB;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateSearchRecommendedListingsDB = this.this$0.updateSearchRecommendedListingsDB(null, this);
        return updateSearchRecommendedListingsDB;
    }
}
