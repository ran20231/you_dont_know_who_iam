package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository", f = "DistrictsRepository.kt", l = {95, 96}, m = "getParentByLeafParents")
/* loaded from: classes2.dex */
public final class DistrictsRepository$getParentByLeafParents$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$getParentByLeafParents$1(DistrictsRepository districtsRepository, zz.a<? super DistrictsRepository$getParentByLeafParents$1> aVar) {
        super(aVar);
        this.this$0 = districtsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parentByLeafParents;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parentByLeafParents = this.this$0.getParentByLeafParents(0, null, this);
        return parentByLeafParents;
    }
}
