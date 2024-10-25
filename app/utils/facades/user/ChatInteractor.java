package com.forsale.app.utils.facades.user;

import falcon.chat.Chat;
import falcon.chat.utils.PushUtils;
import falcon.chat.utils.a;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ChatInteractor.kt */
/* loaded from: classes3.dex */
public final class ChatInteractor {
    public int a(boolean z11) {
        if (z11) {
            return Chat.f55705a.n();
        }
        if (!z11) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.forsale.app.datalayer.database.UserEntity r5, com.forsale.app.features.auth.UserStatus r6, java.lang.String r7, zz.a<? super wz.p> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.utils.facades.user.ChatInteractor$initChat$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.utils.facades.user.ChatInteractor$initChat$1 r0 = (com.forsale.app.utils.facades.user.ChatInteractor$initChat$1) r0
            int r1 = r0.f40204e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40204e = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.ChatInteractor$initChat$1 r0 = new com.forsale.app.utils.facades.user.ChatInteractor$initChat$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f40202c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40204e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f40201b
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            java.lang.Object r6 = r0.f40200a
            com.forsale.app.utils.facades.user.ChatInteractor r6 = (com.forsale.app.utils.facades.user.ChatInteractor) r6
            kotlin.f.b(r8)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r8)
            com.forsale.app.features.auth.UserStatus r8 = com.forsale.app.features.auth.UserStatus.LoggedIn
            if (r6 != r8) goto L54
            r0.f40200a = r4
            r0.f40201b = r5
            r0.f40204e = r3
            java.lang.Object r8 = com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt.c(r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r6 = r4
        L4e:
            java.lang.String r8 = (java.lang.String) r8
            r6.c(r5, r8)
            goto L57
        L54:
            r4.d()
        L57:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.ChatInteractor.b(com.forsale.app.datalayer.database.UserEntity, com.forsale.app.features.auth.UserStatus, java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.forsale.app.datalayer.database.UserEntity r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.i(r5, r0)
            java.lang.String r0 = "deviceToken"
            kotlin.jvm.internal.o.i(r6, r0)
            java.lang.String r0 = r5.getPhone()
            if (r0 == 0) goto L19
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L33
            falcon.chat.Chat$Companion r0 = falcon.chat.Chat.f55705a
            java.lang.String r1 = r5.getPhone()
            kotlin.jvm.internal.o.f(r1)
            com.forsale.app.utils.facades.user.ChatInteractor$loginToChat$2$1 r2 = com.forsale.app.utils.facades.user.ChatInteractor$loginToChat$2$1.f40205a
            com.forsale.app.utils.facades.user.ChatInteractor$loginToChat$2$2 r3 = new com.forsale.app.utils.facades.user.ChatInteractor$loginToChat$2$2
            r3.<init>(r5, r6)
            r0.d(r1, r2, r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.ChatInteractor.c(com.forsale.app.datalayer.database.UserEntity, java.lang.String):void");
    }

    public void d() {
        a.f56033a.g(false);
        Chat.Companion companion = Chat.f55705a;
        companion.e(ChatInteractor$logoutFromChat$1.f40208a, ChatInteractor$logoutFromChat$2.f40209a);
        PushUtils.f56008a.n();
        companion.f(ChatInteractor$logoutFromChat$3.f40210a, ChatInteractor$logoutFromChat$4.f40211a);
    }
}
