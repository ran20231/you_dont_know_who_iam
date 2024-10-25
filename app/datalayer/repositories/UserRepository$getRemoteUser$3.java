package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserRepository$getRemoteUser$3", f = "UserRepository.kt", l = {78, 81, 82, 86, 87}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserRepository$getRemoteUser$3 extends SuspendLambda implements l<zz.a<? super ForSaleDataResult<? extends UserEntity>>, Object> {
    final /* synthetic */ p<UserEntity, zz.a<? super wz.p>, Object> $onFreshUserFetched;
    final /* synthetic */ p<String, zz.a<? super wz.p>, Object> $onUnAuthorizedError;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserRepository$getRemoteUser$3(UserRepository userRepository, p<? super UserEntity, ? super zz.a<? super wz.p>, ? extends Object> pVar, p<? super String, ? super zz.a<? super wz.p>, ? extends Object> pVar2, zz.a<? super UserRepository$getRemoteUser$3> aVar) {
        super(1, aVar);
        this.this$0 = userRepository;
        this.$onFreshUserFetched = pVar;
        this.$onUnAuthorizedError = pVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(zz.a<?> aVar) {
        return new UserRepository$getRemoteUser$3(this.this$0, this.$onFreshUserFetched, this.$onUnAuthorizedError, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(zz.a<? super ForSaleDataResult<? extends UserEntity>> aVar) {
        return invoke2((zz.a<? super ForSaleDataResult<UserEntity>>) aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.UserRepository$getRemoteUser$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(zz.a<? super ForSaleDataResult<UserEntity>> aVar) {
        return ((UserRepository$getRemoteUser$3) create(aVar)).invokeSuspend(wz.p.f75480a);
    }
}
