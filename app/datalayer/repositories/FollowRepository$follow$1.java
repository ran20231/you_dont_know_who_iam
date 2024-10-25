package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.FollowRepository", f = "FollowRepository.kt", l = {61, 62}, m = "follow")
/* loaded from: classes2.dex */
public final class FollowRepository$follow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FollowRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowRepository$follow$1(FollowRepository followRepository, zz.a<? super FollowRepository$follow$1> aVar) {
        super(aVar);
        this.this$0 = followRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.follow(null, null, this);
    }
}
