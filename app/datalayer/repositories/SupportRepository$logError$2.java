package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SupportRepository", f = "SupportRepository.kt", l = {38, 39}, m = "logError")
/* loaded from: classes2.dex */
public final class SupportRepository$logError$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SupportRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRepository$logError$2(SupportRepository supportRepository, zz.a<? super SupportRepository$logError$2> aVar) {
        super(aVar);
        this.this$0 = supportRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logError(0, (String) null, this);
    }
}
