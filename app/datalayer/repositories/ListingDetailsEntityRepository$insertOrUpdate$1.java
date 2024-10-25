package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsEntityRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository", f = "ListingDetailsEntityRepository.kt", l = {19, 20, 22}, m = "insertOrUpdate")
/* loaded from: classes2.dex */
public final class ListingDetailsEntityRepository$insertOrUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListingDetailsEntityRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsEntityRepository$insertOrUpdate$1(ListingDetailsEntityRepository listingDetailsEntityRepository, zz.a<? super ListingDetailsEntityRepository$insertOrUpdate$1> aVar) {
        super(aVar);
        this.this$0 = listingDetailsEntityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.insertOrUpdate(null, this);
    }
}
