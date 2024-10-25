package com.forsale.app.features.more.notifications.notification;

import androidx.paging.i;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import com.forsale.app.datalayer.network.services.MessagingService;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
/* compiled from: NotificationMessagesDataSource.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesDataSource extends i<Long, NotificationMessagesResponse.NotificationMessage> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f32638f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f32639g = 8;

    /* renamed from: b  reason: collision with root package name */
    private final String f32640b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f32641c;

    /* renamed from: d  reason: collision with root package name */
    private final MessagingService f32642d;

    /* renamed from: e  reason: collision with root package name */
    private final SendChannel<Long> f32643e;

    /* compiled from: NotificationMessagesDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class DataSourceException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final long f32644a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f32645b;

        public DataSourceException(long j11, Throwable throwable) {
            o.i(throwable, "throwable");
            this.f32644a = j11;
            this.f32645b = throwable;
        }

        public final long a() {
            return this.f32644a;
        }

        public final Throwable b() {
            return this.f32645b;
        }
    }

    /* compiled from: NotificationMessagesDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class EmptyDataException extends Exception {
    }

    /* compiled from: NotificationMessagesDataSource.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationMessagesDataSource(String deviceId, CoroutineScope coroutineScope, MessagingService messagingService, SendChannel<? super Long> loadedPageNumberChannel) {
        o.i(deviceId, "deviceId");
        o.i(coroutineScope, "coroutineScope");
        o.i(messagingService, "messagingService");
        o.i(loadedPageNumberChannel, "loadedPageNumberChannel");
        this.f32640b = deviceId;
        this.f32641c = coroutineScope;
        this.f32642d = messagingService;
        this.f32643e = loadedPageNumberChannel;
    }

    private final Exception A(Exception exc, long j11) {
        if (!(exc instanceof CancellationException)) {
            return new DataSourceException(j11, exc);
        }
        return exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(long r5, int r7, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.NotificationMessagesResponse.NotificationMessage>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadPage$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadPage$1 r0 = (com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadPage$1) r0
            int r1 = r0.f32668c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32668c = r1
            goto L18
        L13:
            com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadPage$1 r0 = new com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$loadPage$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f32666a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32668c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r8)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.network.requestsbodies.NotificationMessagesBody r8 = new com.forsale.app.datalayer.network.requestsbodies.NotificationMessagesBody
            java.lang.String r2 = r4.f32640b
            r8.<init>(r2, r5, r7)
            com.forsale.app.datalayer.network.services.MessagingService r5 = r4.f32642d
            r0.f32668c = r3
            java.lang.Object r8 = r5.getNotificationMessagesAsync(r8, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            com.forsale.app.datalayer.network.responses.NotificationMessagesResponse r8 = (com.forsale.app.datalayer.network.responses.NotificationMessagesResponse) r8
            java.util.List r5 = r8.getMessages()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource.B(long, int, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(long r5, g00.l<? super zz.a<? super wz.p>, ? extends java.lang.Object> r7, zz.a<? super wz.p> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1 r0 = (com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1) r0
            int r1 = r0.f32673e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32673e = r1
            goto L18
        L13:
            com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1 r0 = new com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource$tryOrThrowMappedExceptionAsync$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f32671c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32673e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r5 = r0.f32670b
            java.lang.Object r7 = r0.f32669a
            com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource r7 = (com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource) r7
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L49
        L2f:
            r8 = move-exception
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r8)
            r0.f32669a = r4     // Catch: java.lang.Exception -> L4c
            r0.f32670b = r5     // Catch: java.lang.Exception -> L4c
            r0.f32673e = r3     // Catch: java.lang.Exception -> L4c
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.lang.Exception -> L4c
            if (r5 != r1) goto L49
            return r1
        L49:
            wz.p r5 = wz.p.f75480a
            return r5
        L4c:
            r8 = move-exception
            r7 = r4
        L4e:
            java.lang.Exception r5 = r7.A(r8, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource.C(long, g00.l, zz.a):java.lang.Object");
    }

    @Override // androidx.paging.i
    public void j(i.d<Long> params, i.a<Long, NotificationMessagesResponse.NotificationMessage> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this.f32641c, null, null, new NotificationMessagesDataSource$loadAfter$1(this, params.f14141a.longValue(), params, callback, null), 3, null);
    }

    @Override // androidx.paging.i
    public void l(i.d<Long> params, i.a<Long, NotificationMessagesResponse.NotificationMessage> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
    }

    @Override // androidx.paging.i
    public void o(i.c<Long> params, i.b<Long, NotificationMessagesResponse.NotificationMessage> callback) {
        o.i(params, "params");
        o.i(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this.f32641c, null, null, new NotificationMessagesDataSource$loadInitial$1(this, 1L, params, callback, null), 3, null);
    }
}
