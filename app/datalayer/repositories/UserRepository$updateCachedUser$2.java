package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserRepository$updateCachedUser$2", f = "UserRepository.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserRepository$updateCachedUser$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ UserEntity $user;
    int label;
    final /* synthetic */ UserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$updateCachedUser$2(UserRepository userRepository, UserEntity userEntity, zz.a<? super UserRepository$updateCachedUser$2> aVar) {
        super(2, aVar);
        this.this$0 = userRepository;
        this.$user = userEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserRepository$updateCachedUser$2(this.this$0, this.$user, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserDao userDao;
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
            userDao = this.this$0.userDao;
            UserEntity userEntity = this.$user;
            this.label = 1;
            if (userDao.insertUser(userEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserRepository$updateCachedUser$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
