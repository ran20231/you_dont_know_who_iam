package com.forsale.app.features.welcome.loading.interactors;

import com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.o;
/* compiled from: SessionInterActor.kt */
/* loaded from: classes2.dex */
public final class SessionInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileInteractor f37387a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateDeviceWebViewCookieInteractor f37388b;

    public SessionInterActor(UserProfileInteractor userProfileInteractor, UpdateDeviceWebViewCookieInteractor updateDeviceWebViewCookieInteractor) {
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(updateDeviceWebViewCookieInteractor, "updateDeviceWebViewCookieInteractor");
        this.f37387a = userProfileInteractor;
        this.f37388b = updateDeviceWebViewCookieInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, zz.a<? super com.forsale.app.datalayer.network.entities.SessionEntity> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.welcome.loading.interactors.SessionInterActor$getSession$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.welcome.loading.interactors.SessionInterActor$getSession$1 r0 = (com.forsale.app.features.welcome.loading.interactors.SessionInterActor$getSession$1) r0
            int r1 = r0.f37392d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37392d = r1
            goto L18
        L13:
            com.forsale.app.features.welcome.loading.interactors.SessionInterActor$getSession$1 r0 = new com.forsale.app.features.welcome.loading.interactors.SessionInterActor$getSession$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f37390b
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r0.f37392d
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            java.lang.Object r10 = r0.f37389a
            kotlin.f.b(r11)     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            goto L65
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f37389a
            com.forsale.app.features.welcome.loading.interactors.SessionInterActor r10 = (com.forsale.app.features.welcome.loading.interactors.SessionInterActor) r10
            kotlin.f.b(r11)     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            goto L54
        L3e:
            kotlin.f.b(r11)
            com.forsale.app.utils.facades.user.UserProfileInteractor r1 = r9.f37387a     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            r3 = 0
            r5 = 2
            r6 = 0
            r0.f37389a = r9     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            r0.f37392d = r2     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            r2 = r10
            r4 = r0
            java.lang.Object r11 = com.forsale.app.utils.facades.user.UserProfileInteractor.l(r1, r2, r3, r4, r5, r6)     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            if (r11 != r7) goto L53
            return r7
        L53:
            r10 = r9
        L54:
            r1 = r11
            com.forsale.app.datalayer.network.entities.SessionEntity r1 = (com.forsale.app.datalayer.network.entities.SessionEntity) r1     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r10 = r10.f37388b     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            r0.f37389a = r11     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            r0.f37392d = r8     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            java.lang.Object r10 = r10.d(r0)     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            if (r10 != r7) goto L64
            return r7
        L64:
            r10 = r11
        L65:
            com.forsale.app.datalayer.network.entities.SessionEntity r10 = (com.forsale.app.datalayer.network.entities.SessionEntity) r10     // Catch: com.forsale.app.datalayer.repositories.MutexIsLockedException -> L68
            goto L69
        L68:
            r10 = 0
        L69:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.interactors.SessionInterActor.a(java.lang.String, zz.a):java.lang.Object");
    }
}
