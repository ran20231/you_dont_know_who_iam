package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddFavoriteBody.kt */
/* loaded from: classes2.dex */
public final class AddFavoriteBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    public AddFavoriteBody(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.advId = i11;
    }

    public static /* synthetic */ AddFavoriteBody copy$default(AddFavoriteBody addFavoriteBody, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addFavoriteBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            i11 = addFavoriteBody.advId;
        }
        return addFavoriteBody.copy(str, i11);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.advId;
    }

    public final AddFavoriteBody copy(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        return new AddFavoriteBody(deviceId, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddFavoriteBody)) {
            return false;
        }
        AddFavoriteBody addFavoriteBody = (AddFavoriteBody) obj;
        if (o.d(this.deviceId, addFavoriteBody.deviceId) && this.advId == addFavoriteBody.advId) {
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
        return "AddFavoriteBody(deviceId=" + str + ", advId=" + i11 + ")";
    }
}
