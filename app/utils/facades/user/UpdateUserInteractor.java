package com.forsale.app.utils.facades.user;

import com.forsale.app.analytics.base.AppInfoInteractor;
import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor;
import jj.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import zz.a;
/* compiled from: UpdateUserInteractor.kt */
/* loaded from: classes3.dex */
public final class UpdateUserInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final UserRepository f40212a;

    /* renamed from: b  reason: collision with root package name */
    private final ChatInteractor f40213b;

    /* renamed from: c  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f40214c;

    /* renamed from: d  reason: collision with root package name */
    private final ExpireSoonRepository f40215d;

    /* renamed from: e  reason: collision with root package name */
    private final AppInfoInteractor f40216e;

    /* renamed from: f  reason: collision with root package name */
    private final UpdateUserWebViewCookieInteractor f40217f;

    /* renamed from: g  reason: collision with root package name */
    private final b f40218g;

    /* renamed from: h  reason: collision with root package name */
    private final ForSaleDataTracker f40219h;

    public UpdateUserInteractor(UserRepository userRepository, ChatInteractor chatInteractor, UserLoginAuthoritiesInteractor userLoginInteractor, ExpireSoonRepository expireSoonRepository, AppInfoInteractor appInfoInteractor, UpdateUserWebViewCookieInteractor updateUserWebViewCookieInteractor, b pref, ForSaleDataTracker tracker) {
        o.i(userRepository, "userRepository");
        o.i(chatInteractor, "chatInteractor");
        o.i(userLoginInteractor, "userLoginInteractor");
        o.i(expireSoonRepository, "expireSoonRepository");
        o.i(appInfoInteractor, "appInfoInteractor");
        o.i(updateUserWebViewCookieInteractor, "updateUserWebViewCookieInteractor");
        o.i(pref, "pref");
        o.i(tracker, "tracker");
        this.f40212a = userRepository;
        this.f40213b = chatInteractor;
        this.f40214c = userLoginInteractor;
        this.f40215d = expireSoonRepository;
        this.f40216e = appInfoInteractor;
        this.f40217f = updateUserWebViewCookieInteractor;
        this.f40218g = pref;
        this.f40219h = tracker;
    }

    private final Object i(UserEntity userEntity, a<? super UserEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UpdateUserInteractor$updateCachedUser$2(this, userEntity, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.forsale.app.datalayer.database.UserEntity r10, zz.a<? super wz.p> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.utils.facades.user.UpdateUserInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.utils.facades.user.UpdateUserInteractor$invoke$1 r0 = (com.forsale.app.utils.facades.user.UpdateUserInteractor$invoke$1) r0
            int r1 = r0.f40225f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40225f = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UpdateUserInteractor$invoke$1 r0 = new com.forsale.app.utils.facades.user.UpdateUserInteractor$invoke$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f40223d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40225f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r10 = r0.f40220a
            com.forsale.app.datalayer.database.UserEntity r10 = (com.forsale.app.datalayer.database.UserEntity) r10
            kotlin.f.b(r11)
            goto Lb5
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.f40222c
            com.forsale.app.datalayer.database.UserEntity r10 = (com.forsale.app.datalayer.database.UserEntity) r10
            java.lang.Object r2 = r0.f40221b
            com.forsale.app.datalayer.database.UserEntity r2 = (com.forsale.app.datalayer.database.UserEntity) r2
            java.lang.Object r4 = r0.f40220a
            com.forsale.app.utils.facades.user.UpdateUserInteractor r4 = (com.forsale.app.utils.facades.user.UpdateUserInteractor) r4
            kotlin.f.b(r11)
            goto La5
        L4c:
            java.lang.Object r10 = r0.f40220a
            com.forsale.app.utils.facades.user.UpdateUserInteractor r10 = (com.forsale.app.utils.facades.user.UpdateUserInteractor) r10
            kotlin.f.b(r11)
            goto L87
        L54:
            kotlin.f.b(r11)
            com.forsale.app.datalayer.repositories.UserRepository r11 = r9.f40212a
            com.forsale.app.datalayer.network.requestsbodies.EditUserBody r2 = new com.forsale.app.datalayer.network.requestsbodies.EditUserBody
            java.lang.String r6 = r10.getFirstName()
            java.lang.String r7 = ""
            if (r6 != 0) goto L64
            r6 = r7
        L64:
            java.lang.String r8 = r10.getEmail()
            if (r8 != 0) goto L6b
            goto L6c
        L6b:
            r7 = r8
        L6c:
            java.lang.Integer r10 = r10.getAllowFollow()
            if (r10 == 0) goto L77
            int r10 = r10.intValue()
            goto L78
        L77:
            r10 = 0
        L78:
            r2.<init>(r6, r7, r10)
            r0.f40220a = r9
            r0.f40225f = r5
            java.lang.Object r11 = r11.updateUser(r2, r0)
            if (r11 != r1) goto L86
            return r1
        L86:
            r10 = r9
        L87:
            com.forsale.app.datalayer.network.responses.AuthResponse r11 = (com.forsale.app.datalayer.network.responses.AuthResponse) r11
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r11 = r11.getData()
            com.forsale.app.datalayer.database.UserEntity r11 = r11.getUser()
            com.forsale.app.datalayer.repositories.UserRepository r2 = r10.f40212a
            r0.f40220a = r10
            r0.f40221b = r11
            r0.f40222c = r11
            r0.f40225f = r4
            java.lang.Object r2 = r2.updateCachedUser(r11, r0)
            if (r2 != r1) goto La2
            return r1
        La2:
            r4 = r10
            r10 = r11
            r2 = r10
        La5:
            r0.f40220a = r2
            r11 = 0
            r0.f40221b = r11
            r0.f40222c = r11
            r0.f40225f = r3
            java.lang.Object r10 = r4.i(r10, r0)
            if (r10 != r1) goto Lb5
            return r1
        Lb5:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UpdateUserInteractor.h(com.forsale.app.datalayer.database.UserEntity, zz.a):java.lang.Object");
    }
}
