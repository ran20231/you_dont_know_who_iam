package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserActivityRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserActivityRepository", f = "UserActivityRepository.kt", l = {14, 14}, m = "updateLastUserActivity")
/* loaded from: classes2.dex */
public final class UserActivityRepository$updateLastUserActivity$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserActivityRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActivityRepository$updateLastUserActivity$1(UserActivityRepository userActivityRepository, zz.a<? super UserActivityRepository$updateLastUserActivity$1> aVar) {
        super(aVar);
        this.this$0 = userActivityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateLastUserActivity(this);
    }
}
