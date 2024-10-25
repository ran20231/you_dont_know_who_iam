package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegionsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.RegionsRepository", f = "RegionsRepository.kt", l = {64, 64}, m = "getCurrentRegion")
/* loaded from: classes2.dex */
public final class RegionsRepository$getCurrentRegion$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegionsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionsRepository$getCurrentRegion$1(RegionsRepository regionsRepository, zz.a<? super RegionsRepository$getCurrentRegion$1> aVar) {
        super(aVar);
        this.this$0 = regionsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCurrentRegion(this);
    }
}
