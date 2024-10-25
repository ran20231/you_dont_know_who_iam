package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchHistoryRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository", f = "SearchHistoryRepository.kt", l = {44}, m = "validateCategories")
/* loaded from: classes2.dex */
public final class SearchHistoryRepository$validateCategories$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchHistoryRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$validateCategories$1(SearchHistoryRepository searchHistoryRepository, zz.a<? super SearchHistoryRepository$validateCategories$1> aVar) {
        super(aVar);
        this.this$0 = searchHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.validateCategories(null, this);
    }
}
