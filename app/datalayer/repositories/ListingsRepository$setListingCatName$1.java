package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository", f = "ListingsRepository.kt", l = {366}, m = "setListingCatName")
/* loaded from: classes2.dex */
public final class ListingsRepository$setListingCatName$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$setListingCatName$1(ListingsRepository listingsRepository, zz.a<? super ListingsRepository$setListingCatName$1> aVar) {
        super(aVar);
        this.this$0 = listingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object listingCatName;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        listingCatName = this.this$0.setListingCatName(null, this);
        return listingCatName;
    }
}
