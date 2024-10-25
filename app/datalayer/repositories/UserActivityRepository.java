package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.UserService;
import kotlin.jvm.internal.o;
/* compiled from: UserActivityRepository.kt */
/* loaded from: classes2.dex */
public final class UserActivityRepository {
    public static final int $stable = 8;
    private final jj.b prefs;
    private final UserService userService;

    public UserActivityRepository(jj.b prefs, UserService userService) {
        o.i(prefs, "prefs");
        o.i(userService, "userService");
        this.prefs = prefs;
        this.userService = userService;
    }

    public final Object deviceId(zz.a<? super String> aVar) {
        return this.prefs.c().a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[PHI: r6 
      PHI: (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x005c, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateLastUserActivity(zz.a<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.UserActivityRepository$updateLastUserActivity$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.UserActivityRepository$updateLastUserActivity$1 r0 = (com.forsale.app.datalayer.repositories.UserActivityRepository$updateLastUserActivity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.UserActivityRepository$updateLastUserActivity$1 r0 = new com.forsale.app.datalayer.repositories.UserActivityRepository$updateLastUserActivity$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.network.services.UserService r2 = (com.forsale.app.datalayer.network.services.UserService) r2
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.services.UserService r2 = r5.userService
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r6 = r5.deviceId(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r6 = (java.lang.String) r6
            com.forsale.app.datalayer.network.requestsbodies.SetLastActivityBody r4 = new com.forsale.app.datalayer.network.requestsbodies.SetLastActivityBody
            r4.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.setLastActivity(r4, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.UserActivityRepository.updateLastUserActivity(zz.a):java.lang.Object");
    }
}
