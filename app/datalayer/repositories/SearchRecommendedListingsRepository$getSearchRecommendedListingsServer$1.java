package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchRecommendedListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository", f = "SearchRecommendedListingsRepository.kt", l = {59, l8.a.f62267d, 66, 68, 69, 60, 75}, m = "getSearchRecommendedListingsServer")
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository$getSearchRecommendedListingsServer$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRecommendedListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRecommendedListingsRepository$getSearchRecommendedListingsServer$1(SearchRecommendedListingsRepository searchRecommendedListingsRepository, zz.a<? super SearchRecommendedListingsRepository$getSearchRecommendedListingsServer$1> aVar) {
        super(aVar);
        this.this$0 = searchRecommendedListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object searchRecommendedListingsServer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        searchRecommendedListingsServer = this.this$0.getSearchRecommendedListingsServer(this);
        return searchRecommendedListingsServer;
    }
}
