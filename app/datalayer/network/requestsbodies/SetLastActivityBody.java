package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SetLastActivityBody.kt */
/* loaded from: classes2.dex */
public final class SetLastActivityBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public SetLastActivityBody(String deviceId) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ SetLastActivityBody copy$default(SetLastActivityBody setLastActivityBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setLastActivityBody.deviceId;
        }
        return setLastActivityBody.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final SetLastActivityBody copy(String deviceId) {
        o.i(deviceId, "deviceId");
        return new SetLastActivityBody(deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetLastActivityBody) && o.d(this.deviceId, ((SetLastActivityBody) obj).deviceId)) {
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
        return "SetLastActivityBody(deviceId=" + str + ")";
    }
}
