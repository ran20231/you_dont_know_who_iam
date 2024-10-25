package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BlockingReasonBody.kt */
/* loaded from: classes2.dex */
public final class BlockingReasonBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public BlockingReasonBody(String deviceId) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
    }

    public static /* synthetic */ BlockingReasonBody copy$default(BlockingReasonBody blockingReasonBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blockingReasonBody.deviceId;
        }
        return blockingReasonBody.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final BlockingReasonBody copy(String deviceId) {
        o.i(deviceId, "deviceId");
        return new BlockingReasonBody(deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockingReasonBody) && o.d(this.deviceId, ((BlockingReasonBody) obj).deviceId)) {
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
        return "BlockingReasonBody(deviceId=" + str + ")";
    }
}
