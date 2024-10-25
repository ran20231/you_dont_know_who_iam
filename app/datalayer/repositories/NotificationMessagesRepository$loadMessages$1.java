package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationMessagesRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.NotificationMessagesRepository", f = "NotificationMessagesRepository.kt", l = {25}, m = "loadMessages")
/* loaded from: classes2.dex */
public final class NotificationMessagesRepository$loadMessages$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationMessagesRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesRepository$loadMessages$1(NotificationMessagesRepository notificationMessagesRepository, zz.a<? super NotificationMessagesRepository$loadMessages$1> aVar) {
        super(aVar);
        this.this$0 = notificationMessagesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadMessages(null, null, this);
    }
}
