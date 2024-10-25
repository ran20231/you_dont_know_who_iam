package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.FollowRepository", f = "FollowRepository.kt", l = {49, 51}, m = "followerFollowingRetriever")
/* loaded from: classes2.dex */
public final class FollowRepository$followerFollowingRetriever$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FollowRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowRepository$followerFollowingRetriever$1(FollowRepository followRepository, zz.a<? super FollowRepository$followerFollowingRetriever$1> aVar) {
        super(aVar);
        this.this$0 = followRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.followerFollowingRetriever(false, null, 0, this);
    }
}
