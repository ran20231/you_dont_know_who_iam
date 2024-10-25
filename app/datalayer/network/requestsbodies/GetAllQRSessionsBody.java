package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: QRRequestBodies.kt */
/* loaded from: classes2.dex */
public final class GetAllQRSessionsBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public GetAllQRSessionsBody(String deviceId) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ GetAllQRSessionsBody copy$default(GetAllQRSessionsBody getAllQRSessionsBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getAllQRSessionsBody.deviceId;
        }
        return getAllQRSessionsBody.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final GetAllQRSessionsBody copy(String deviceId) {
        o.i(deviceId, "deviceId");
        return new GetAllQRSessionsBody(deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetAllQRSessionsBody) && o.d(this.deviceId, ((GetAllQRSessionsBody) obj).deviceId)) {
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
        return "GetAllQRSessionsBody(deviceId=" + str + ")";
    }
}
