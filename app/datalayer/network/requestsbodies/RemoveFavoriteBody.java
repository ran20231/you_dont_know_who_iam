package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RemoveFavoriteBody.kt */
/* loaded from: classes2.dex */
public final class RemoveFavoriteBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public RemoveFavoriteBody(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.advId = i11;
    }

    public static /* synthetic */ RemoveFavoriteBody copy$default(RemoveFavoriteBody removeFavoriteBody, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = removeFavoriteBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            i11 = removeFavoriteBody.advId;
        }
        return removeFavoriteBody.copy(str, i11);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.advId;
    }

    public final RemoveFavoriteBody copy(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        return new RemoveFavoriteBody(deviceId, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveFavoriteBody)) {
            return false;
        }
        RemoveFavoriteBody removeFavoriteBody = (RemoveFavoriteBody) obj;
        if (o.d(this.deviceId, removeFavoriteBody.deviceId) && this.advId == removeFavoriteBody.advId) {
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

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + Integer.hashCode(this.advId);
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.advId;
        return "RemoveFavoriteBody(deviceId=" + str + ", advId=" + i11 + ")";
    }
}
