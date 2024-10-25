package com.forsale.app.datalayer.repositories;

import androidx.paging.DataSource;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FollowRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.FollowRepository$followAllUsers$2", f = "FollowRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FollowRepository$followAllUsers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super DataSource.Factory<Integer, FollowResponse.User>>, Object> {
    int label;
    final /* synthetic */ FollowRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowRepository$followAllUsers$2(FollowRepository followRepository, zz.a<? super FollowRepository$followAllUsers$2> aVar) {
        super(2, aVar);
        this.this$0 = followRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowRepository$followAllUsers$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FollowUserDao followUserDao;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            followUserDao = this.this$0.followUserDao;
            return followUserDao.allUsers();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super DataSource.Factory<Integer, FollowResponse.User>> aVar) {
        return ((FollowRepository$followAllUsers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
