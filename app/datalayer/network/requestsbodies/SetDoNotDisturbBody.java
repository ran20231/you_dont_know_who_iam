package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.network.responses.ListingItemBase;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SetDoNotDisturbBody.kt */
/* loaded from: classes2.dex */
public final class SetDoNotDisturbBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c(ListingItemBase.DO_NOT_DISTURB)
    private final String doNotDisturb;
    @c("region_id")
    private final int regionId;

    public SetDoNotDisturbBody(int i11, String deviceId, int i12, String doNotDisturb) {
        o.i(deviceId, "deviceId");
        o.i(doNotDisturb, "doNotDisturb");
        this.advId = i11;
        this.deviceId = deviceId;
        this.regionId = i12;
        this.doNotDisturb = doNotDisturb;
    }

    public static /* synthetic */ SetDoNotDisturbBody copy$default(SetDoNotDisturbBody setDoNotDisturbBody, int i11, String str, int i12, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = setDoNotDisturbBody.advId;
        }
        if ((i13 & 2) != 0) {
            str = setDoNotDisturbBody.deviceId;
        }
        if ((i13 & 4) != 0) {
            i12 = setDoNotDisturbBody.regionId;
        }
        if ((i13 & 8) != 0) {
            str2 = setDoNotDisturbBody.doNotDisturb;
        }
        return setDoNotDisturbBody.copy(i11, str, i12, str2);
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

    public final String component4() {
        return this.doNotDisturb;
    }

    public final SetDoNotDisturbBody copy(int i11, String deviceId, int i12, String doNotDisturb) {
        o.i(deviceId, "deviceId");
        o.i(doNotDisturb, "doNotDisturb");
        return new SetDoNotDisturbBody(i11, deviceId, i12, doNotDisturb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDoNotDisturbBody)) {
            return false;
        }
        SetDoNotDisturbBody setDoNotDisturbBody = (SetDoNotDisturbBody) obj;
        if (this.advId == setDoNotDisturbBody.advId && o.d(this.deviceId, setDoNotDisturbBody.deviceId) && this.regionId == setDoNotDisturbBody.regionId && o.d(this.doNotDisturb, setDoNotDisturbBody.doNotDisturb)) {
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

    public final String getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.advId) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + this.doNotDisturb.hashCode();
    }

    public String toString() {
        int i11 = this.advId;
        String str = this.deviceId;
        int i12 = this.regionId;
        String str2 = this.doNotDisturb;
        return "SetDoNotDisturbBody(advId=" + i11 + ", deviceId=" + str + ", regionId=" + i12 + ", doNotDisturb=" + str2 + ")";
    }
}
