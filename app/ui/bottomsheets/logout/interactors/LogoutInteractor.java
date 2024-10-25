package com.forsale.app.ui.bottomsheets.logout.interactors;

import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.datalayer.repositories.AuthRepository;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: LogoutInteractor.kt */
/* loaded from: classes3.dex */
public final class LogoutInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AuthRepository f38925a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileInteractor f38926b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingDetailsEntityRepository f38927c;

    public LogoutInteractor(AuthRepository authRepository, UserProfileInteractor userProfileInteractor, ListingDetailsEntityRepository listingDetailsEntityRepository) {
        o.i(authRepository, "authRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(listingDetailsEntityRepository, "listingDetailsEntityRepository");
        this.f38925a = authRepository;
        this.f38926b = userProfileInteractor;
        this.f38927c = listingDetailsEntityRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zz.a<? super com.forsale.app.datalayer.network.responses.RequestCompleted> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logout$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logout$1 r0 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logout$1) r0
            int r1 = r0.f38932e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38932e = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logout$1 r0 = new com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logout$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f38930c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f38932e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f38928a
            kotlin.f.b(r7)
            goto L85
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            java.lang.Object r2 = r0.f38929b
            java.lang.Object r4 = r0.f38928a
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor r4 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor) r4
            kotlin.f.b(r7)
            r7 = r2
            goto L70
        L44:
            java.lang.Object r2 = r0.f38928a
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor r2 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor) r2
            kotlin.f.b(r7)
            goto L5d
        L4c:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.AuthRepository r7 = r6.f38925a
            r0.f38928a = r6
            r0.f38932e = r5
            java.lang.Object r7 = r7.logout(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            r5 = r7
            com.forsale.app.datalayer.network.responses.RequestCompleted r5 = (com.forsale.app.datalayer.network.responses.RequestCompleted) r5
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = r2.f38926b
            r0.f38928a = r2
            r0.f38929b = r7
            r0.f38932e = r4
            java.lang.Object r4 = r5.h(r0)
            if (r4 != r1) goto L6f
            return r1
        L6f:
            r4 = r2
        L70:
            r2 = r7
            com.forsale.app.datalayer.network.responses.RequestCompleted r2 = (com.forsale.app.datalayer.network.responses.RequestCompleted) r2
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r2 = r4.f38927c
            r0.f38928a = r7
            r4 = 0
            r0.f38929b = r4
            r0.f38932e = r3
            r3 = -1
            java.lang.Object r0 = r2.updateListingId(r3, r0)
            if (r0 != r1) goto L84
            return r1
        L84:
            r0 = r7
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor.d(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zz.a<? super com.forsale.app.datalayer.network.responses.RequestCompleted> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logoutFromAllDevices$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logoutFromAllDevices$1 r0 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logoutFromAllDevices$1) r0
            int r1 = r0.f38937e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38937e = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logoutFromAllDevices$1 r0 = new com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor$logoutFromAllDevices$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f38935c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f38937e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f38933a
            kotlin.f.b(r7)
            goto L85
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            java.lang.Object r2 = r0.f38934b
            java.lang.Object r4 = r0.f38933a
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor r4 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor) r4
            kotlin.f.b(r7)
            r7 = r2
            goto L70
        L44:
            java.lang.Object r2 = r0.f38933a
            com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor r2 = (com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor) r2
            kotlin.f.b(r7)
            goto L5d
        L4c:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.AuthRepository r7 = r6.f38925a
            r0.f38933a = r6
            r0.f38937e = r5
            java.lang.Object r7 = r7.logoutFromAllDevices(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            r5 = r7
            com.forsale.app.datalayer.network.responses.RequestCompleted r5 = (com.forsale.app.datalayer.network.responses.RequestCompleted) r5
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = r2.f38926b
            r0.f38933a = r2
            r0.f38934b = r7
            r0.f38937e = r4
            java.lang.Object r4 = r5.h(r0)
            if (r4 != r1) goto L6f
            return r1
        L6f:
            r4 = r2
        L70:
            r2 = r7
            com.forsale.app.datalayer.network.responses.RequestCompleted r2 = (com.forsale.app.datalayer.network.responses.RequestCompleted) r2
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r2 = r4.f38927c
            r0.f38933a = r7
            r4 = 0
            r0.f38934b = r4
            r0.f38937e = r3
            r3 = -1
            java.lang.Object r0 = r2.updateListingId(r3, r0)
            if (r0 != r1) goto L84
            return r1
        L84:
            r0 = r7
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor.e(zz.a):java.lang.Object");
    }

    public final Object c(boolean z11, a<? super RequestCompleted> aVar) {
        if (z11) {
            return e(aVar);
        }
        if (!z11) {
            return d(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
