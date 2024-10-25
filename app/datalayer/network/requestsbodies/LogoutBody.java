package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LogoutBody.kt */
/* loaded from: classes2.dex */
public final class LogoutBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public LogoutBody(String deviceId) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ LogoutBody copy$default(LogoutBody logoutBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logoutBody.deviceId;
        }
        return logoutBody.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final LogoutBody copy(String deviceId) {
        o.i(deviceId, "deviceId");
        return new LogoutBody(deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LogoutBody) && o.d(this.deviceId, ((LogoutBody) obj).deviceId)) {
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
        return "LogoutBody(deviceId=" + str + ")";
    }
}
