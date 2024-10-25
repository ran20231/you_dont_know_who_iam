package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: NewsFeedsMessagesBody.kt */
/* loaded from: classes2.dex */
public final class NewsFeedsMessagesBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("last_timestamp")
    private final String lastTimestamp;

    public NewsFeedsMessagesBody(String deviceId, String lastTimestamp) {
        o.i(deviceId, "deviceId");
        o.i(lastTimestamp, "lastTimestamp");
        this.deviceId = deviceId;
        this.lastTimestamp = lastTimestamp;
    }

    public static /* synthetic */ NewsFeedsMessagesBody copy$default(NewsFeedsMessagesBody newsFeedsMessagesBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = newsFeedsMessagesBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = newsFeedsMessagesBody.lastTimestamp;
        }
        return newsFeedsMessagesBody.copy(str, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.lastTimestamp;
    }

    public final NewsFeedsMessagesBody copy(String deviceId, String lastTimestamp) {
        o.i(deviceId, "deviceId");
        o.i(lastTimestamp, "lastTimestamp");
        return new NewsFeedsMessagesBody(deviceId, lastTimestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsFeedsMessagesBody)) {
            return false;
        }
        NewsFeedsMessagesBody newsFeedsMessagesBody = (NewsFeedsMessagesBody) obj;
        if (o.d(this.deviceId, newsFeedsMessagesBody.deviceId) && o.d(this.lastTimestamp, newsFeedsMessagesBody.lastTimestamp)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLastTimestamp() {
        return this.lastTimestamp;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.lastTimestamp.hashCode();
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.lastTimestamp;
        return "NewsFeedsMessagesBody(deviceId=" + str + ", lastTimestamp=" + str2 + ")";
    }
}
