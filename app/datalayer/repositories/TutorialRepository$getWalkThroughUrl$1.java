package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TutorialRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.TutorialRepository", f = "TutorialRepository.kt", l = {16}, m = "getWalkThroughUrl")
/* loaded from: classes2.dex */
public final class TutorialRepository$getWalkThroughUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TutorialRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialRepository$getWalkThroughUrl$1(TutorialRepository tutorialRepository, zz.a<? super TutorialRepository$getWalkThroughUrl$1> aVar) {
        super(aVar);
        this.this$0 = tutorialRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getWalkThroughUrl(this);
    }
}
