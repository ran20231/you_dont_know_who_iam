package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserRepository$getUser$2", f = "UserRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserRepository$getUser$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ p<UserEntity, zz.a<? super wz.p>, Object> $onFreshUserFetched;
    final /* synthetic */ p<String, zz.a<? super wz.p>, Object> $onUnAuthorizedError;
    int label;
    final /* synthetic */ UserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserRepository$getUser$2(UserRepository userRepository, p<? super String, ? super zz.a<? super wz.p>, ? extends Object> pVar, p<? super UserEntity, ? super zz.a<? super wz.p>, ? extends Object> pVar2, zz.a<? super UserRepository$getUser$2> aVar) {
        super(2, aVar);
        this.this$0 = userRepository;
        this.$onUnAuthorizedError = pVar;
        this.$onFreshUserFetched = pVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserRepository$getUser$2(this.this$0, this.$onUnAuthorizedError, this.$onFreshUserFetched, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object remoteUser;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            UserRepository userRepository = this.this$0;
            p<String, zz.a<? super wz.p>, Object> pVar = this.$onUnAuthorizedError;
            p<UserEntity, zz.a<? super wz.p>, Object> pVar2 = this.$onFreshUserFetched;
            this.label = 1;
            remoteUser = userRepository.getRemoteUser(pVar, pVar2, this);
            if (remoteUser == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserRepository$getUser$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
