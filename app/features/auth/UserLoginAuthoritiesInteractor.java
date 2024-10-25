package com.forsale.app.features.auth;

import kotlin.jvm.internal.o;
/* compiled from: UserLoginAuthoritiesInteractor.kt */
/* loaded from: classes2.dex */
public final class UserLoginAuthoritiesInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final jj.b f22605a;

    public UserLoginAuthoritiesInteractor(jj.b prefs) {
        o.i(prefs, "prefs");
        this.f22605a = prefs;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zz.a<? super com.forsale.app.features.auth.UserStatus> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1 r0 = (com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1) r0
            int r1 = r0.f22608c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22608c = r1
            goto L18
        L13:
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1 r0 = new com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$checkIfUserLoggedIn$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22606a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22608c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.f22605a
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r5 = r5.l()
            r0.f22608c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 == 0) goto L52
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.NotLoggedIn
            goto L54
        L52:
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.LoggedIn
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.UserLoginAuthoritiesInteractor.a(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, zz.a<? super com.forsale.app.features.auth.UserStatus> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$getUserStatus$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$getUserStatus$1 r0 = (com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$getUserStatus$1) r0
            int r1 = r0.f22611c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22611c = r1
            goto L18
        L13:
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$getUserStatus$1 r0 = new com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$getUserStatus$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f22609a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22611c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            if (r5 == r3) goto L63
            r6 = 2
            if (r5 == r6) goto L60
            r6 = 3
            if (r5 == r6) goto L5d
            jj.b r5 = r4.f22605a
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r5 = r5.l()
            r0.f22611c = r3
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r5 = r6.length()
            if (r5 != 0) goto L54
            goto L55
        L54:
            r3 = 0
        L55:
            if (r3 != 0) goto L5a
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.LoggedIn
            goto L65
        L5a:
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.NotLoggedIn
            goto L65
        L5d:
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.DeletedAccount
            goto L65
        L60:
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.CompletelyBlocked
            goto L65
        L63:
            com.forsale.app.features.auth.UserStatus r5 = com.forsale.app.features.auth.UserStatus.BlockedUser
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.UserLoginAuthoritiesInteractor.b(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$isUserLoggedIn$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$isUserLoggedIn$1 r0 = (com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$isUserLoggedIn$1) r0
            int r1 = r0.f22614c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22614c = r1
            goto L18
        L13:
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$isUserLoggedIn$1 r0 = new com.forsale.app.features.auth.UserLoginAuthoritiesInteractor$isUserLoggedIn$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22612a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22614c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.f22605a
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r5 = r5.l()
            r0.f22614c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L4c
            goto L4d
        L4c:
            r3 = 0
        L4d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.UserLoginAuthoritiesInteractor.c(zz.a):java.lang.Object");
    }
}
