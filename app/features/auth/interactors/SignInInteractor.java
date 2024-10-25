package com.forsale.app.features.auth.interactors;

import com.forsale.app.datalayer.repositories.AuthRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.o;
/* compiled from: SignInInteractor.kt */
/* loaded from: classes2.dex */
public final class SignInInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AuthRepository f22731a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileInteractor f22732b;

    public SignInInteractor(AuthRepository authRepository, UserProfileInteractor userProfileInteractor) {
        o.i(authRepository, "authRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        this.f22731a = authRepository;
        this.f22732b = userProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.forsale.app.datalayer.network.requestsbodies.LoginBody r9, zz.a<? super com.forsale.app.datalayer.network.responses.AuthResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.auth.interactors.SignInInteractor$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.auth.interactors.SignInInteractor$invoke$1 r0 = (com.forsale.app.features.auth.interactors.SignInInteractor$invoke$1) r0
            int r1 = r0.f22737e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22737e = r1
            goto L18
        L13:
            com.forsale.app.features.auth.interactors.SignInInteractor$invoke$1 r0 = new com.forsale.app.features.auth.interactors.SignInInteractor$invoke$1
            r0.<init>(r8, r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f22735c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f22737e
            r2 = 3
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r9 = r4.f22733a
            kotlin.f.b(r10)
            goto L9c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r4.f22734b
            java.lang.Object r1 = r4.f22733a
            com.forsale.app.features.auth.interactors.SignInInteractor r1 = (com.forsale.app.features.auth.interactors.SignInInteractor) r1
            kotlin.f.b(r10)
            goto L7d
        L44:
            java.lang.Object r9 = r4.f22733a
            com.forsale.app.features.auth.interactors.SignInInteractor r9 = (com.forsale.app.features.auth.interactors.SignInInteractor) r9
            kotlin.f.b(r10)
            r1 = r9
            goto L5e
        L4d:
            kotlin.f.b(r10)
            com.forsale.app.datalayer.repositories.AuthRepository r10 = r8.f22731a
            r4.f22733a = r8
            r4.f22737e = r5
            java.lang.Object r10 = r10.login(r9, r4)
            if (r10 != r0) goto L5d
            return r0
        L5d:
            r1 = r8
        L5e:
            r9 = r10
            com.forsale.app.datalayer.network.responses.AuthResponse r9 = (com.forsale.app.datalayer.network.responses.AuthResponse) r9
            com.forsale.app.datalayer.repositories.AuthRepository r5 = r1.f22731a
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r9 = r9.getData()
            com.forsale.app.datalayer.network.responses.AuthResponse$Token r9 = r9.getToken()
            java.lang.String r9 = r9.getAccessToken()
            r4.f22733a = r1
            r4.f22734b = r10
            r4.f22737e = r3
            java.lang.Object r9 = r5.saveUserToken(r9, r4)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            r9 = r10
        L7d:
            r10 = r9
            com.forsale.app.datalayer.network.responses.AuthResponse r10 = (com.forsale.app.datalayer.network.responses.AuthResponse) r10
            com.forsale.app.utils.facades.user.UserProfileInteractor r1 = r1.f22732b
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r10 = r10.getData()
            com.forsale.app.datalayer.database.UserEntity r10 = r10.getUser()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f22733a = r9
            r7 = 0
            r4.f22734b = r7
            r4.f22737e = r2
            r2 = r10
            java.lang.Object r10 = com.forsale.app.utils.facades.user.UserProfileInteractor.v(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L9c
            return r0
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.interactors.SignInInteractor.a(com.forsale.app.datalayer.network.requestsbodies.LoginBody, zz.a):java.lang.Object");
    }
}
