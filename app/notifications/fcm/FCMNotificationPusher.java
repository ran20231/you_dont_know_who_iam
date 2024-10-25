package com.forsale.app.notifications.fcm;

import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FCMNotificationPusher.kt */
/* loaded from: classes2.dex */
public final class FCMNotificationPusher extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37589a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f37590b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f37591c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineScope f37592d;

    /* renamed from: e  reason: collision with root package name */
    private final NotificationManager f37593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMNotificationPusher(Context ctx, jj.b prefs, ApplicationResourcesRepository resRepository, CoroutineScope cs2) {
        super(ctx);
        o.i(ctx, "ctx");
        o.i(prefs, "prefs");
        o.i(resRepository, "resRepository");
        o.i(cs2, "cs");
        this.f37589a = ctx;
        this.f37590b = prefs;
        this.f37591c = resRepository;
        this.f37592d = cs2;
        this.f37593e = (NotificationManager) androidx.core.content.b.getSystemService(this, NotificationManager.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zz.a<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.notifications.fcm.FCMNotificationPusher$nextNotificationId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.notifications.fcm.FCMNotificationPusher$nextNotificationId$1 r0 = (com.forsale.app.notifications.fcm.FCMNotificationPusher$nextNotificationId$1) r0
            int r1 = r0.f37597d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37597d = r1
            goto L18
        L13:
            com.forsale.app.notifications.fcm.FCMNotificationPusher$nextNotificationId$1 r0 = new com.forsale.app.notifications.fcm.FCMNotificationPusher$nextNotificationId$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f37595b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37597d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f37594a
            kotlin.f.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.f37594a
            com.forsale.app.notifications.fcm.FCMNotificationPusher r2 = (com.forsale.app.notifications.fcm.FCMNotificationPusher) r2
            kotlin.f.b(r7)
            goto L53
        L3e:
            kotlin.f.b(r7)
            jj.b r7 = r6.f37590b
            kj.c r7 = r7.e()
            r0.f37594a = r6
            r0.f37597d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            r5 = r7
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            jj.b r2 = r2.f37590b
            kj.c r2 = r2.e()
            int r5 = r5 + r4
            r0.f37594a = r7
            r0.f37597d = r3
            java.lang.Object r0 = r2.i(r5, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r0 = r7
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.notifications.fcm.FCMNotificationPusher.e(zz.a):java.lang.Object");
    }

    public static /* synthetic */ void g(FCMNotificationPusher fCMNotificationPusher, ForeSaleFCMMessage foreSaleFCMMessage, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        fCMNotificationPusher.f(foreSaleFCMMessage, str);
    }

    public final void f(ForeSaleFCMMessage forSaleFCMMessage, String str) {
        o.i(forSaleFCMMessage, "forSaleFCMMessage");
        BuildersKt.launch$default(this.f37592d, null, null, new FCMNotificationPusher$push$1(this, forSaleFCMMessage, str, null), 3, null);
    }
}
