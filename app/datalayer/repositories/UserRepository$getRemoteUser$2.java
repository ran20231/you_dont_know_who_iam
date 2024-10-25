package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import com.forsale.core.coroutine.extensions.RetryState;
import g00.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserRepository$getRemoteUser$2", f = "UserRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserRepository$getRemoteUser$2 extends SuspendLambda implements p<Result<? extends ForSaleDataResult<? extends UserEntity>>, zz.a<? super RetryState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserRepository$getRemoteUser$2(zz.a<? super UserRepository$getRemoteUser$2> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        UserRepository$getRemoteUser$2 userRepository$getRemoteUser$2 = new UserRepository$getRemoteUser$2(aVar);
        userRepository$getRemoteUser$2.L$0 = obj;
        return userRepository$getRemoteUser$2;
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(Result<? extends ForSaleDataResult<? extends UserEntity>> result, zz.a<? super RetryState> aVar) {
        return invoke(result.j(), aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            Object j11 = ((Result) this.L$0).j();
            if (Result.g(j11)) {
                j11 = null;
            }
            ForSaleDataResult forSaleDataResult = (ForSaleDataResult) j11;
            if (forSaleDataResult instanceof ForSaleDataResult.Success) {
                z11 = true;
            } else {
                z11 = forSaleDataResult instanceof ForSaleDataResult.Error.ApiError.UserError.UnAuthorizedUserError;
            }
            if (z11) {
                return RetryState.DONE;
            }
            return RetryState.RETRY;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(Object obj, zz.a<? super RetryState> aVar) {
        return ((UserRepository$getRemoteUser$2) create(Result.a(obj), aVar)).invokeSuspend(wz.p.f75480a);
    }
}
