package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SessionRepository", f = "SessionRepository.kt", l = {75, 77, 78}, m = "getUserTokenIfLoginFromVersionLowerThan24")
/* loaded from: classes2.dex */
public final class SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1(SessionRepository sessionRepository, zz.a<? super SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1> aVar) {
        super(aVar);
        this.this$0 = sessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object userTokenIfLoginFromVersionLowerThan24;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        userTokenIfLoginFromVersionLowerThan24 = this.this$0.getUserTokenIfLoginFromVersionLowerThan24(null, this);
        return userTokenIfLoginFromVersionLowerThan24;
    }
}
