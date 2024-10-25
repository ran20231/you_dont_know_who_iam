package com.forsale.app.notifications.fcm;

import com.google.firebase.messaging.RemoteMessage;
import com.leanplum.internal.Constants;
import com.moengage.pushbase.MoEPushHelper;
import java.util.Map;
import kotlin.jvm.internal.o;
/* compiled from: ForSaleMessagingServiceBase.kt */
/* loaded from: classes2.dex */
public final class ForSaleMessagingServiceBase extends e {

    /* renamed from: d  reason: collision with root package name */
    public ForSaleMessagingService f37613d;

    /* renamed from: e  reason: collision with root package name */
    public sf.b f37614e;

    /* renamed from: f  reason: collision with root package name */
    public tf.b f37615f;

    public final ForSaleMessagingService f() {
        ForSaleMessagingService forSaleMessagingService = this.f37613d;
        if (forSaleMessagingService != null) {
            return forSaleMessagingService;
        }
        o.w("forSaleMessagingService");
        return null;
    }

    public final sf.b g() {
        sf.b bVar = this.f37614e;
        if (bVar != null) {
            return bVar;
        }
        o.w("leanplumFirebaseMessagingService");
        return null;
    }

    public final tf.b h() {
        tf.b bVar = this.f37615f;
        if (bVar != null) {
            return bVar;
        }
        o.w("moEFireBaseMessagingService");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        o.i(message, "message");
        MoEPushHelper a11 = MoEPushHelper.f50743b.a();
        Map<String, String> data = message.getData();
        o.h(data, "getData(...)");
        if (a11.f(data)) {
            h().onMessageReceived(message);
        } else if (message.getData().containsKey(Constants.Keys.PUSH_VERSION)) {
            g().onMessageReceived(message);
        } else {
            super.onMessageReceived(message);
            f().onMessageReceived(message);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        o.i(token, "token");
        super.onNewToken(token);
        f().onNewToken(token);
    }
}
