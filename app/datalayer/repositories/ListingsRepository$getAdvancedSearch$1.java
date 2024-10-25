package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository", f = "ListingsRepository.kt", l = {285, 288, 300, 283}, m = "getAdvancedSearch")
/* loaded from: classes2.dex */
public final class ListingsRepository$getAdvancedSearch$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$getAdvancedSearch$1(ListingsRepository listingsRepository, zz.a<? super ListingsRepository$getAdvancedSearch$1> aVar) {
        super(aVar);
        this.this$0 = listingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdvancedSearch(0, null, null, null, null, this);
    }
}
