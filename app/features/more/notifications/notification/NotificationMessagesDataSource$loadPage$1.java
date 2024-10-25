package com.forsale.app.features.more.notifications.notification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationMessagesDataSource.kt */
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource", f = "NotificationMessagesDataSource.kt", l = {53}, m = "loadPage")
/* loaded from: classes2.dex */
public final class NotificationMessagesDataSource$loadPage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f32666a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesDataSource f32667b;

    /* renamed from: c  reason: collision with root package name */
    int f32668c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesDataSource$loadPage$1(NotificationMessagesDataSource notificationMessagesDataSource, a<? super NotificationMessagesDataSource$loadPage$1> aVar) {
        super(aVar);
        this.f32667b = notificationMessagesDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        this.f32666a = obj;
        this.f32668c |= Integer.MIN_VALUE;
        B = this.f32667b.B(0L, 0, this);
        return B;
    }
}
