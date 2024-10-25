package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: QRRequestBodies.kt */
/* loaded from: classes2.dex */
public final class VerifyQRCodeBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    private final String token;

    public VerifyQRCodeBody(String deviceId, String token) {
        o.i(deviceId, "deviceId");
        o.i(token, "token");
        this.deviceId = deviceId;
        this.token = token;
    }

    public static /* synthetic */ VerifyQRCodeBody copy$default(VerifyQRCodeBody verifyQRCodeBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verifyQRCodeBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = verifyQRCodeBody.token;
        }
        return verifyQRCodeBody.copy(str, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.token;
    }

    public final VerifyQRCodeBody copy(String deviceId, String token) {
        o.i(deviceId, "deviceId");
        o.i(token, "token");
        return new VerifyQRCodeBody(deviceId, token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyQRCodeBody)) {
            return false;
        }
        VerifyQRCodeBody verifyQRCodeBody = (VerifyQRCodeBody) obj;
        if (o.d(this.deviceId, verifyQRCodeBody.deviceId) && o.d(this.token, verifyQRCodeBody.token)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.token.hashCode();
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.token;
        return "VerifyQRCodeBody(deviceId=" + str + ", token=" + str2 + ")";
    }
}
