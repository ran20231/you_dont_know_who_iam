package com.forsale.app.features.more.notifications.notification;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* compiled from: NotificationMessagesViewModel.kt */
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesViewModel$coroutineContext$1$1", f = "NotificationMessagesViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NotificationMessagesViewModel$coroutineContext$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32695a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesViewModel f32696b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesViewModel$coroutineContext$1$1(NotificationMessagesViewModel notificationMessagesViewModel, a<? super NotificationMessagesViewModel$coroutineContext$1$1> aVar) {
        super(2, aVar);
        this.f32696b = notificationMessagesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NotificationMessagesViewModel$coroutineContext$1$1(this.f32696b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f32695a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> i02 = this.f32696b.i0();
            this.f32695a = 1;
            if (i02.emit("failed to load more", this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NotificationMessagesViewModel$coroutineContext$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}