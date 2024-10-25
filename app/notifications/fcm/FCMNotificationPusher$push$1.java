package com.forsale.app.notifications.fcm;

import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FCMNotificationPusher.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.notifications.fcm.FCMNotificationPusher$push$1", f = "FCMNotificationPusher.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FCMNotificationPusher$push$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37598a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FCMNotificationPusher f37599b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ForeSaleFCMMessage f37600c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f37601d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMNotificationPusher$push$1(FCMNotificationPusher fCMNotificationPusher, ForeSaleFCMMessage foreSaleFCMMessage, String str, zz.a<? super FCMNotificationPusher$push$1> aVar) {
        super(2, aVar);
        this.f37599b = fCMNotificationPusher;
        this.f37600c = foreSaleFCMMessage;
        this.f37601d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FCMNotificationPusher$push$1(this.f37599b, this.f37600c, this.f37601d, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r0.A(r2) == null) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f37598a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r13)
            goto L25
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            kotlin.f.b(r13)
            com.forsale.app.notifications.fcm.FCMNotificationPusher r13 = r12.f37599b
            r12.f37598a = r2
            java.lang.Object r13 = com.forsale.app.notifications.fcm.FCMNotificationPusher.d(r13, r12)
            if (r13 != r0) goto L25
            return r0
        L25:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            androidx.core.app.z$e r0 = new androidx.core.app.z$e
            com.forsale.app.notifications.fcm.FCMNotificationPusher r1 = r12.f37599b
            com.forsale.app.notifications.NotificationChannels r3 = com.forsale.app.notifications.NotificationChannels.DEFAULT
            java.lang.String r3 = r3.getId()
            r0.<init>(r1, r3)
            com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage r1 = r12.f37600c
            com.forsale.app.notifications.fcm.FCMNotificationPusher r3 = r12.f37599b
            java.lang.String r4 = r12.f37601d
            r0.f(r2)
            int r2 = t9.q0.T
            r0.y(r2)
            java.lang.String r2 = r1.getTitle()
            if (r2 != 0) goto L57
            int r2 = t9.y0.T
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r5 = "getString(...)"
            kotlin.jvm.internal.o.h(r2, r5)
        L57:
            r0.m(r2)
            java.lang.String r2 = r1.getAlert()
            r0.l(r2)
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r2 = com.forsale.app.notifications.fcm.FCMNotificationPusher.c(r3)
            int r5 = t9.q0.U
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r5)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 7
            r11 = 0
            android.graphics.Bitmap r2 = androidx.core.graphics.drawable.b.b(r6, r7, r8, r9, r10, r11)
            r0.q(r2)
            if (r4 == 0) goto L8f
            androidx.core.app.z$b r2 = new androidx.core.app.z$b
            r2.<init>()
            android.content.Context r5 = com.forsale.app.notifications.fcm.FCMNotificationPusher.a(r3)
            android.graphics.Bitmap r4 = com.leanplum.utils.BitmapUtil.getScaledBitmap(r5, r4)
            r2.i(r4)
            androidx.core.app.z$e r2 = r0.A(r2)
            if (r2 != 0) goto L9f
        L8f:
            androidx.core.app.z$c r2 = new androidx.core.app.z$c
            r2.<init>()
            java.lang.String r4 = r1.getAlert()
            androidx.core.app.z$c r2 = r2.h(r4)
            r0.A(r2)
        L9f:
            r2 = 2
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r2)
            if (r2 == 0) goto La9
            r0.z(r2)
        La9:
            android.content.Context r2 = com.forsale.app.notifications.fcm.FCMNotificationPusher.a(r3)
            android.app.PendingIntent r1 = com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt.a(r2, r1)
            r0.k(r1)
            android.app.Notification r0 = r0.c()
            com.forsale.app.notifications.fcm.FCMNotificationPusher r1 = r12.f37599b
            android.app.NotificationManager r1 = com.forsale.app.notifications.fcm.FCMNotificationPusher.b(r1)
            if (r1 == 0) goto Lc3
            r1.notify(r13, r0)
        Lc3:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.notifications.fcm.FCMNotificationPusher$push$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FCMNotificationPusher$push$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
