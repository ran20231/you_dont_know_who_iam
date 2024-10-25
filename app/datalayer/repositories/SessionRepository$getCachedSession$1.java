package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SessionRepository", f = "SessionRepository.kt", l = {91, 91, 95}, m = "getCachedSession")
/* loaded from: classes2.dex */
public final class SessionRepository$getCachedSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$getCachedSession$1(SessionRepository sessionRepository, zz.a<? super SessionRepository$getCachedSession$1> aVar) {
        super(aVar);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCachedSession(this);
    }
}
