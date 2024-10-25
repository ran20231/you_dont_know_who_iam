package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository", f = "ListingsRepository.kt", l = {450}, m = "mapExtraAttributesToAttrInfo")
/* loaded from: classes2.dex */
public final class ListingsRepository$mapExtraAttributesToAttrInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$mapExtraAttributesToAttrInfo$1(ListingsRepository listingsRepository, zz.a<? super ListingsRepository$mapExtraAttributesToAttrInfo$1> aVar) {
        super(aVar);
        this.this$0 = listingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapExtraAttributesToAttrInfo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        mapExtraAttributesToAttrInfo = this.this$0.mapExtraAttributesToAttrInfo(null, this);
        return mapExtraAttributesToAttrInfo;
    }
}
