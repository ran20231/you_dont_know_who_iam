package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import com.forsale.app.datalayer.network.requestsbodies.EditUserBody;
import com.forsale.app.datalayer.network.responses.AuthResponse;
import com.forsale.app.datalayer.network.services.AuthService;
import com.forsale.core.coroutine.extensions.RetryMechanismKt;
import g00.p;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
/* compiled from: UserRepository.kt */
/* loaded from: classes2.dex */
public final class UserRepository {
    public static final int $stable = 8;
    private final AuthService authService;
    private final jj.b prefs;
    private final UserDao userDao;

    public UserRepository(UserDao userDao, AuthService authService, jj.b prefs) {
        o.i(userDao, "userDao");
        o.i(authService, "authService");
        o.i(prefs, "prefs");
        this.userDao = userDao;
        this.authService = authService;
        this.prefs = prefs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteUser(p<? super String, ? super zz.a<? super wz.p>, ? extends Object> pVar, p<? super UserEntity, ? super zz.a<? super wz.p>, ? extends Object> pVar2, zz.a<? super ForSaleDataResult<UserEntity>> aVar) {
        return RetryMechanismKt.b(2, 0L, 0L, 0, null, null, new UserRepository$getRemoteUser$2(null), new UserRepository$getRemoteUser$3(this, pVar2, pVar, null), aVar, 62, null);
    }

    public static /* synthetic */ Object getUser$default(UserRepository userRepository, p pVar, p pVar2, CoroutineScope coroutineScope, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return userRepository.getUser(pVar, pVar2, coroutineScope, z11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getUserData(p<? super String, ? super zz.a<? super wz.p>, ? extends Object> pVar, p<? super UserEntity, ? super zz.a<? super wz.p>, ? extends Object> pVar2, CoroutineScope coroutineScope, zz.a<? super ForSaleDataResult<UserEntity>> aVar) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new UserRepository$getUserData$2(this, pVar, pVar2, null), 3, null);
        return async$default.await(aVar);
    }

    public final Object getCachedUser(zz.a<? super UserEntity> aVar) {
        return this.userDao.getUser(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[PHI: r1 
      PHI: (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:32:0x00c0, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUser(g00.p<? super java.lang.String, ? super zz.a<? super wz.p>, ? extends java.lang.Object> r17, g00.p<? super com.forsale.app.datalayer.database.UserEntity, ? super zz.a<? super wz.p>, ? extends java.lang.Object> r18, kotlinx.coroutines.CoroutineScope r19, boolean r20, zz.a<? super com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult<com.forsale.app.datalayer.database.UserEntity>> r21) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.UserRepository.getUser(g00.p, g00.p, kotlinx.coroutines.CoroutineScope, boolean, zz.a):java.lang.Object");
    }

    public final Flow<UserEntity> getUserAsFlow() {
        return this.userDao.getUserAsFlow();
    }

    public final Object updateCachedUser(UserEntity userEntity, zz.a<? super wz.p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new UserRepository$updateCachedUser$2(this, userEntity, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return wz.p.f75480a;
    }

    public final Object updateUser(EditUserBody editUserBody, zz.a<? super AuthResponse> aVar) {
        return this.authService.editUser(editUserBody, aVar);
    }
}
