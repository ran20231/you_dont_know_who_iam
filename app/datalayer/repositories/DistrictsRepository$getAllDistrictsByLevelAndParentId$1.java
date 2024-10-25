package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository", f = "DistrictsRepository.kt", l = {87, 88}, m = "getAllDistrictsByLevelAndParentId")
/* loaded from: classes2.dex */
public final class DistrictsRepository$getAllDistrictsByLevelAndParentId$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$getAllDistrictsByLevelAndParentId$1(DistrictsRepository districtsRepository, zz.a<? super DistrictsRepository$getAllDistrictsByLevelAndParentId$1> aVar) {
        super(aVar);
        this.this$0 = districtsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAllDistrictsByLevelAndParentId(0, 0, this);
    }
}
