package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.MessagingService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: NotificationMessagesRepository.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesRepository {
    private static final int PAGES_SIZE = 30;
    private final MessagingService messagingService;
    private final jj.b prefs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NotificationMessagesRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NotificationMessagesRepository(jj.b prefs, MessagingService messagingService) {
        o.i(prefs, "prefs");
        o.i(messagingService, "messagingService");
        this.prefs = prefs;
        this.messagingService = messagingService;
    }

    public final Object deviceId(zz.a<? super String> aVar) {
        return this.prefs.c().a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMessages(kotlinx.coroutines.CoroutineScope r5, kotlinx.coroutines.channels.SendChannel<? super java.lang.Long> r6, zz.a<? super androidx.lifecycle.LiveData<androidx.paging.PagedList<com.forsale.app.datalayer.network.responses.NotificationMessagesResponse.NotificationMessage>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.NotificationMessagesRepository$loadMessages$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.NotificationMessagesRepository$loadMessages$1 r0 = (com.forsale.app.datalayer.repositories.NotificationMessagesRepository$loadMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.NotificationMessagesRepository$loadMessages$1 r0 = new com.forsale.app.datalayer.repositories.NotificationMessagesRepository$loadMessages$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            r6 = r5
            kotlinx.coroutines.channels.SendChannel r6 = (kotlinx.coroutines.channels.SendChannel) r6
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.NotificationMessagesRepository r0 = (com.forsale.app.datalayer.repositories.NotificationMessagesRepository) r0
            kotlin.f.b(r7)
            goto L51
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            kotlin.f.b(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.deviceId(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r4
        L51:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.datalayer.network.services.MessagingService r0 = r0.messagingService
            ce.d r1 = new ce.d
            r1.<init>(r7, r5, r0, r6)
            androidx.paging.PagedList$c$a r5 = new androidx.paging.PagedList$c$a
            r5.<init>()
            r6 = 30
            androidx.paging.PagedList$c$a r5 = r5.c(r6)
            r6 = 0
            androidx.paging.PagedList$c$a r5 = r5.b(r6)
            r6 = 7
            androidx.paging.PagedList$c$a r5 = r5.d(r6)
            androidx.paging.PagedList$c r5 = r5.a()
            androidx.paging.e r6 = new androidx.paging.e
            r6.<init>(r1, r5)
            androidx.lifecycle.LiveData r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.NotificationMessagesRepository.loadMessages(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.channels.SendChannel, zz.a):java.lang.Object");
    }
}
