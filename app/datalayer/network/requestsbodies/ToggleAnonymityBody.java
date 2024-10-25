package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ToggleAnonymityBody.kt */
/* loaded from: classes2.dex */
public final class ToggleAnonymityBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("region_id")
    private final int regionId;

    public ToggleAnonymityBody(int i11, String deviceId, int i12) {
        o.i(deviceId, "deviceId");
        this.advId = i11;
        this.deviceId = deviceId;
        this.regionId = i12;
    }

    public static /* synthetic */ ToggleAnonymityBody copy$default(ToggleAnonymityBody toggleAnonymityBody, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = toggleAnonymityBody.advId;
        }
        if ((i13 & 2) != 0) {
            str = toggleAnonymityBody.deviceId;
        }
        if ((i13 & 4) != 0) {
            i12 = toggleAnonymityBody.regionId;
        }
        return toggleAnonymityBody.copy(i11, str, i12);
    }

    public final int component1() {
        return this.advId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final int component3() {
        return this.regionId;
    }

    public final ToggleAnonymityBody copy(int i11, String deviceId, int i12) {
        o.i(deviceId, "deviceId");
        return new ToggleAnonymityBody(i11, deviceId, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleAnonymityBody)) {
            return false;
        }
        ToggleAnonymityBody toggleAnonymityBody = (ToggleAnonymityBody) obj;
        if (this.advId == toggleAnonymityBody.advId && o.d(this.deviceId, toggleAnonymityBody.deviceId) && this.regionId == toggleAnonymityBody.regionId) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.advId) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId);
    }

    public String toString() {
        int i11 = this.advId;
        String str = this.deviceId;
        int i12 = this.regionId;
        return "ToggleAnonymityBody(advId=" + i11 + ", deviceId=" + str + ", regionId=" + i12 + ")";
    }
}
