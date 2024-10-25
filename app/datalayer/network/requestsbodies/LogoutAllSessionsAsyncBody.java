package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: QRRequestBodies.kt */
/* loaded from: classes2.dex */
public final class LogoutAllSessionsAsyncBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public LogoutAllSessionsAsyncBody(String deviceId) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ LogoutAllSessionsAsyncBody copy$default(LogoutAllSessionsAsyncBody logoutAllSessionsAsyncBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logoutAllSessionsAsyncBody.deviceId;
        }
        return logoutAllSessionsAsyncBody.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final LogoutAllSessionsAsyncBody copy(String deviceId) {
        o.i(deviceId, "deviceId");
        return new LogoutAllSessionsAsyncBody(deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LogoutAllSessionsAsyncBody) && o.d(this.deviceId, ((LogoutAllSessionsAsyncBody) obj).deviceId)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return this.deviceId.hashCode();
    }

    public String toString() {
        String str = this.deviceId;
        return "LogoutAllSessionsAsyncBody(deviceId=" + str + ")";
    }
}
