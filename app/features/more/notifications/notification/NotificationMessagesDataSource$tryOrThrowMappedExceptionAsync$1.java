package com.forsale.app.features.more.notifications.notification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationMessagesDataSource.kt */
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource", f = "NotificationMessagesDataSource.kt", l = {58}, m = "tryOrThrowMappedExceptionAsync")
/* loaded from: classes2.dex */
public final class NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f32669a;

    /* renamed from: b  reason: collision with root package name */
    long f32670b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f32671c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesDataSource f32672d;

    /* renamed from: e  reason: collision with root package name */
    int f32673e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1(NotificationMessagesDataSource notificationMessagesDataSource, a<? super NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1> aVar) {
        super(aVar);
        this.f32672d = notificationMessagesDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object C;
        this.f32671c = obj;
        this.f32673e |= Integer.MIN_VALUE;
        C = this.f32672d.C(0L, null, this);
        return C;
    }
}
