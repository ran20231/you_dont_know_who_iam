package com.forsale.app.notifications.fcm;

import android.content.Context;
import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.datalayer.repositories.ForSaleMessagingRepository;
import com.forsale.app.utils.NotificationTypes;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.j;
import falcon.chat.utils.PushUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import t9.y0;
/* compiled from: ForSaleMessagingService.kt */
/* loaded from: classes2.dex */
public final class ForSaleMessagingService extends FirebaseMessagingService implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37606a;

    /* renamed from: b  reason: collision with root package name */
    public FCMNotificationPusher f37607b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineContext f37608c;

    /* renamed from: d  reason: collision with root package name */
    public ForSaleMessagingRepository f37609d;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
        }
    }

    public ForSaleMessagingService(Context ctx) {
        o.i(ctx, "ctx");
        this.f37606a = ctx;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        String simpleName = ForSaleMessagingService.class.getSimpleName();
        o.h(simpleName, "getSimpleName(...)");
        this.f37608c = io2.plus(new CoroutineName(simpleName)).plus(new a(CoroutineExceptionHandler.Key));
    }

    private final ForeSaleFCMMessage e(RemoteMessage remoteMessage) {
        try {
            PushUtils.Companion companion = PushUtils.f56008a;
            Map<String, String> data = remoteMessage.getData();
            o.h(data, "getData(...)");
            Pair<String, String> j11 = companion.j(data);
            return new ForeSaleFCMMessage(j11.c(), j11.d(), null, NotificationTypes.CHAT_MESSAGE, null, this.f37606a.getString(y0.f70781z5), this.f37606a.getString(y0.f70781z5));
        } catch (Exception e11) {
            String message = e11.getMessage();
            x10.a.b("Error: FCM ChatMessage " + message, new Object[0]);
            return null;
        }
    }

    private final ForeSaleFCMMessage f(RemoteMessage remoteMessage) {
        boolean z11 = false;
        try {
            com.google.gson.d dVar = new com.google.gson.d();
            x10.a.b(remoteMessage.getData().toString(), new Object[0]);
            j A = dVar.A(remoteMessage.getData());
            x10.a.b(A.toString(), new Object[0]);
            ForeSaleFCMMessage foreSaleFCMMessage = (ForeSaleFCMMessage) dVar.g(A, ForeSaleFCMMessage.class);
            x10.a.b("XXX: ForeSaleFCMMessage: " + foreSaleFCMMessage, new Object[0]);
            if (foreSaleFCMMessage.getType() == null) {
                z11 = true;
            }
            if (z11) {
                return null;
            }
            return foreSaleFCMMessage;
        } catch (Exception e11) {
            String message = e11.getMessage();
            x10.a.b("Error: FCM ServerMessage " + message, new Object[0]);
            return null;
        }
    }

    public final FCMNotificationPusher c() {
        FCMNotificationPusher fCMNotificationPusher = this.f37607b;
        if (fCMNotificationPusher != null) {
            return fCMNotificationPusher;
        }
        o.w("fcmNotificationPusher");
        return null;
    }

    public final ForSaleMessagingRepository d() {
        ForSaleMessagingRepository forSaleMessagingRepository = this.f37609d;
        if (forSaleMessagingRepository != null) {
            return forSaleMessagingRepository;
        }
        o.w("forSaleMessagingRepository");
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37608c;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage receivedMsg) {
        o.i(receivedMsg, "receivedMsg");
        super.onMessageReceived(receivedMsg);
        ForeSaleFCMMessage f11 = f(receivedMsg);
        if (f11 == null) {
            f11 = e(receivedMsg);
        }
        if (f11 != null) {
            FCMNotificationPusher.g(c(), f11, null, 2, null);
            x10.a.b(f11.toString(), new Object[0]);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String newToken) {
        o.i(newToken, "newToken");
        super.onNewToken(newToken);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ForSaleMessagingService$onNewToken$1(this, newToken, null), 3, null);
    }
}
