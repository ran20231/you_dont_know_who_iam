package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SellListingBody.kt */
/* loaded from: classes2.dex */
public final class SellListingBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("delete_reason")
    private final String deleteReason;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public SellListingBody(String deviceId, int i11, String deleteReason) {
        o.i(deviceId, "deviceId");
        o.i(deleteReason, "deleteReason");
        this.deviceId = deviceId;
        this.advId = i11;
        this.deleteReason = deleteReason;
    }

    public static /* synthetic */ SellListingBody copy$default(SellListingBody sellListingBody, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sellListingBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            i11 = sellListingBody.advId;
        }
        if ((i12 & 4) != 0) {
            str2 = sellListingBody.deleteReason;
        }
        return sellListingBody.copy(str, i11, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.advId;
    }

    public final String component3() {
        return this.deleteReason;
    }

    public final SellListingBody copy(String deviceId, int i11, String deleteReason) {
        o.i(deviceId, "deviceId");
        o.i(deleteReason, "deleteReason");
        return new SellListingBody(deviceId, i11, deleteReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellListingBody)) {
            return false;
        }
        SellListingBody sellListingBody = (SellListingBody) obj;
        if (o.d(this.deviceId, sellListingBody.deviceId) && this.advId == sellListingBody.advId && o.d(this.deleteReason, sellListingBody.deleteReason)) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getDeleteReason() {
        return this.deleteReason;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Integer.hashCode(this.advId)) * 31) + this.deleteReason.hashCode();
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.advId;
        String str2 = this.deleteReason;
        return "SellListingBody(deviceId=" + str + ", advId=" + i11 + ", deleteReason=" + str2 + ")";
    }
}
