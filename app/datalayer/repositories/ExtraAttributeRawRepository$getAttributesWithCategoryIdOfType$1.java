package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtraAttributeRawRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository", f = "ExtraAttributeRawRepository.kt", l = {49, 50}, m = "getAttributesWithCategoryIdOfType")
/* loaded from: classes2.dex */
public final class ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExtraAttributeRawRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1(ExtraAttributeRawRepository extraAttributeRawRepository, zz.a<? super ExtraAttributeRawRepository$getAttributesWithCategoryIdOfType$1> aVar) {
        super(aVar);
        this.this$0 = extraAttributeRawRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAttributesWithCategoryIdOfType(null, 0, this);
    }
}