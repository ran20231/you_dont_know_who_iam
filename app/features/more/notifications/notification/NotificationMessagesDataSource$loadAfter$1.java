package com.forsale.app.features.more.notifications.notification;

import androidx.paging.i;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import zz.a;
/* compiled from: NotificationMessagesDataSource.kt */
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadAfter$1", f = "NotificationMessagesDataSource.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NotificationMessagesDataSource$loadAfter$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32646a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesDataSource f32647b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f32648c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.d<Long> f32649d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i.a<Long, NotificationMessagesResponse.NotificationMessage> f32650e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationMessagesDataSource.kt */
    @d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadAfter$1$1", f = "NotificationMessagesDataSource.kt", l = {41, 44}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadAfter$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NotificationMessagesDataSource f32652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i.d<Long> f32653c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f32654d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i.a<Long, NotificationMessagesResponse.NotificationMessage> f32655e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationMessagesDataSource notificationMessagesDataSource, i.d<Long> dVar, long j11, i.a<Long, NotificationMessagesResponse.NotificationMessage> aVar, a<? super AnonymousClass1> aVar2) {
            super(1, aVar2);
            this.f32652b = notificationMessagesDataSource;
            this.f32653c = dVar;
            this.f32654d = j11;
            this.f32655e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(a<?> aVar) {
            return new AnonymousClass1(this.f32652b, this.f32653c, this.f32654d, this.f32655e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SendChannel sendChannel;
            f11 = b.f();
            int i11 = this.f32651a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                NotificationMessagesDataSource notificationMessagesDataSource = this.f32652b;
                long longValue = this.f32653c.f14141a.longValue();
                int i12 = this.f32653c.f14142b;
                this.f32651a = 1;
                obj = notificationMessagesDataSource.B(longValue, i12, this);
                if (obj == f11) {
                    return f11;
                }
            }
            this.f32655e.a((List) obj, kotlin.coroutines.jvm.internal.a.e(this.f32654d + 1));
            sendChannel = this.f32652b.f32643e;
            Long e11 = kotlin.coroutines.jvm.internal.a.e(this.f32654d);
            this.f32651a = 2;
            if (sendChannel.send(e11, this) == f11) {
                return f11;
            }
            return wz.p.f75480a;
        }

        @Override // g00.l
        public final Object invoke(a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesDataSource$loadAfter$1(NotificationMessagesDataSource notificationMessagesDataSource, long j11, i.d<Long> dVar, i.a<Long, NotificationMessagesResponse.NotificationMessage> aVar, a<? super NotificationMessagesDataSource$loadAfter$1> aVar2) {
        super(2, aVar2);
        this.f32647b = notificationMessagesDataSource;
        this.f32648c = j11;
        this.f32649d = dVar;
        this.f32650e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NotificationMessagesDataSource$loadAfter$1(this.f32647b, this.f32648c, this.f32649d, this.f32650e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object C;
        f11 = b.f();
        int i11 = this.f32646a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            NotificationMessagesDataSource notificationMessagesDataSource = this.f32647b;
            long j11 = this.f32648c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(notificationMessagesDataSource, this.f32649d, j11, this.f32650e, null);
            this.f32646a = 1;
            C = notificationMessagesDataSource.C(j11, anonymousClass1, this);
            if (C == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NotificationMessagesDataSource$loadAfter$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
