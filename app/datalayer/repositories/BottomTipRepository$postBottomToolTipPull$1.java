package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomTipRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.BottomTipRepository", f = "BottomTipRepository.kt", l = {27, 28}, m = "postBottomToolTipPull")
/* loaded from: classes2.dex */
public final class BottomTipRepository$postBottomToolTipPull$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BottomTipRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomTipRepository$postBottomToolTipPull$1(BottomTipRepository bottomTipRepository, zz.a<? super BottomTipRepository$postBottomToolTipPull$1> aVar) {
        super(aVar);
        this.this$0 = bottomTipRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.postBottomToolTipPull(0, this);
    }
}
