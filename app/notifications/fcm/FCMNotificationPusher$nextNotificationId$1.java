package com.forsale.app.notifications.fcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FCMNotificationPusher.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.notifications.fcm.FCMNotificationPusher", f = "FCMNotificationPusher.kt", l = {l8.a.f62267d, 64}, m = "nextNotificationId")
/* loaded from: classes2.dex */
public final class FCMNotificationPusher$nextNotificationId$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37594a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37595b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FCMNotificationPusher f37596c;

    /* renamed from: d  reason: collision with root package name */
    int f37597d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMNotificationPusher$nextNotificationId$1(FCMNotificationPusher fCMNotificationPusher, zz.a<? super FCMNotificationPusher$nextNotificationId$1> aVar) {
        super(aVar);
        this.f37596c = fCMNotificationPusher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e11;
        this.f37595b = obj;
        this.f37597d |= Integer.MIN_VALUE;
        e11 = this.f37596c.e(this);
        return e11;
    }
}
