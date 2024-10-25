package com.forsale.app.features.more.notifications.notification;

import androidx.paging.i;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource;
import com.google.android.gms.maps.model.PinConfig;
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
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadInitial$1", f = "NotificationMessagesDataSource.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NotificationMessagesDataSource$loadInitial$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32656a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesDataSource f32657b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f32658c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.c<Long> f32659d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i.b<Long, NotificationMessagesResponse.NotificationMessage> f32660e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationMessagesDataSource.kt */
    @d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadInitial$1$1", f = "NotificationMessagesDataSource.kt", l = {PinConfig.BITMAP_WIDTH_DP, 32}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadInitial$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NotificationMessagesDataSource f32662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f32663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i.c<Long> f32664d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i.b<Long, NotificationMessagesResponse.NotificationMessage> f32665e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationMessagesDataSource notificationMessagesDataSource, long j11, i.c<Long> cVar, i.b<Long, NotificationMessagesResponse.NotificationMessage> bVar, a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f32662b = notificationMessagesDataSource;
            this.f32663c = j11;
            this.f32664d = cVar;
            this.f32665e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(a<?> aVar) {
            return new AnonymousClass1(this.f32662b, this.f32663c, this.f32664d, this.f32665e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SendChannel sendChannel;
            f11 = b.f();
            int i11 = this.f32661a;
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
                NotificationMessagesDataSource notificationMessagesDataSource = this.f32662b;
                long j11 = this.f32663c;
                int i12 = this.f32664d.f14139a;
                this.f32661a = 1;
                obj = notificationMessagesDataSource.B(j11, i12, this);
                if (obj == f11) {
                    return f11;
                }
            }
            i.b<Long, NotificationMessagesResponse.NotificationMessage> bVar = this.f32665e;
            long j12 = this.f32663c;
            List<? extends NotificationMessagesResponse.NotificationMessage> list = (List) obj;
            if (!list.isEmpty()) {
                bVar.b(list, null, kotlin.coroutines.jvm.internal.a.e(j12 + 1));
                sendChannel = this.f32662b.f32643e;
                Long e11 = kotlin.coroutines.jvm.internal.a.e(this.f32663c);
                this.f32661a = 2;
                if (sendChannel.send(e11, this) == f11) {
                    return f11;
                }
                return wz.p.f75480a;
            }
            throw new NotificationMessagesDataSource.EmptyDataException();
        }

        @Override // g00.l
        public final Object invoke(a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesDataSource$loadInitial$1(NotificationMessagesDataSource notificationMessagesDataSource, long j11, i.c<Long> cVar, i.b<Long, NotificationMessagesResponse.NotificationMessage> bVar, a<? super NotificationMessagesDataSource$loadInitial$1> aVar) {
        super(2, aVar);
        this.f32657b = notificationMessagesDataSource;
        this.f32658c = j11;
        this.f32659d = cVar;
        this.f32660e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NotificationMessagesDataSource$loadInitial$1(this.f32657b, this.f32658c, this.f32659d, this.f32660e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object C;
        f11 = b.f();
        int i11 = this.f32656a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            NotificationMessagesDataSource notificationMessagesDataSource = this.f32657b;
            long j11 = this.f32658c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(notificationMessagesDataSource, j11, this.f32659d, this.f32660e, null);
            this.f32656a = 1;
            C = notificationMessagesDataSource.C(j11, anonymousClass1, this);
            if (C == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NotificationMessagesDataSource$loadInitial$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
