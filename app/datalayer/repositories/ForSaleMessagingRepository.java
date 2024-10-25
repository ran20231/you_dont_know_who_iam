package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.o;
/* compiled from: ForSaleMessagingRepository.kt */
/* loaded from: classes2.dex */
public final class ForSaleMessagingRepository {
    public static final int $stable = 8;
    private final jj.b prefs;
    private final UserProfileInteractor userProfileInteractor;

    public ForSaleMessagingRepository(jj.b prefs, UserProfileInteractor userProfileInteractor) {
        o.i(prefs, "prefs");
        o.i(userProfileInteractor, "userProfileInteractor");
        this.prefs = prefs;
        this.userProfileInteractor = userProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updatePushToken(java.lang.String r8, zz.a<? super wz.p> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.ForSaleMessagingRepository$updatePushToken$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.ForSaleMessagingRepository$updatePushToken$1 r0 = (com.forsale.app.datalayer.repositories.ForSaleMessagingRepository$updatePushToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ForSaleMessagingRepository$updatePushToken$1 r0 = new com.forsale.app.datalayer.repositories.ForSaleMessagingRepository$updatePushToken$1
            r0.<init>(r7, r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.f.b(r9)
            goto L6d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r4.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r4.L$0
            com.forsale.app.datalayer.repositories.ForSaleMessagingRepository r1 = (com.forsale.app.datalayer.repositories.ForSaleMessagingRepository) r1
            kotlin.f.b(r9)
            goto L58
        L41:
            kotlin.f.b(r9)
            jj.b r9 = r7.prefs
            kj.b r9 = r9.c()
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r3
            java.lang.Object r9 = r9.e(r8, r4)
            if (r9 != r0) goto L57
            return r0
        L57:
            r1 = r7
        L58:
            r3 = r8
            com.forsale.app.utils.facades.user.UserProfileInteractor r1 = r1.userProfileInteractor
            r8 = 0
            r5 = 1
            r6 = 0
            r9 = 0
            r4.L$0 = r9
            r4.L$1 = r9
            r4.label = r2
            r2 = r8
            java.lang.Object r8 = com.forsale.app.utils.facades.user.UserProfileInteractor.l(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L6d
            return r0
        L6d:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ForSaleMessagingRepository.updatePushToken(java.lang.String, zz.a):java.lang.Object");
    }
}
