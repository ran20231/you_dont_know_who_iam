package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SessionRepository", f = "SessionRepository.kt", l = {121}, m = "preLoadGreetingImgIfPossible")
/* loaded from: classes2.dex */
public final class SessionRepository$preLoadGreetingImgIfPossible$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$preLoadGreetingImgIfPossible$1(SessionRepository sessionRepository, zz.a<? super SessionRepository$preLoadGreetingImgIfPossible$1> aVar) {
        super(aVar);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object preLoadGreetingImgIfPossible;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        preLoadGreetingImgIfPossible = this.this$0.preLoadGreetingImgIfPossible(null, this);
        return preLoadGreetingImgIfPossible;
    }
}
