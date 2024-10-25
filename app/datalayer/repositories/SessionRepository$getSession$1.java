package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SessionRepository", f = "SessionRepository.kt", l = {48, 146, 51, l8.a.f62266c, 67}, m = "getSession")
/* loaded from: classes2.dex */
public final class SessionRepository$getSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$getSession$1(SessionRepository sessionRepository, zz.a<? super SessionRepository$getSession$1> aVar) {
        super(aVar);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSession(null, null, this);
    }
}
