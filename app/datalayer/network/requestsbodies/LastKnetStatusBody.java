package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LastKnetStatusBody.kt */
/* loaded from: classes2.dex */
public final class LastKnetStatusBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("timestamp")
    private final String timestamp;

    public LastKnetStatusBody(int i11, String timestamp) {
        o.i(timestamp, "timestamp");
        this.advId = i11;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ LastKnetStatusBody copy$default(LastKnetStatusBody lastKnetStatusBody, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lastKnetStatusBody.advId;
        }
        if ((i12 & 2) != 0) {
            str = lastKnetStatusBody.timestamp;
        }
        return lastKnetStatusBody.copy(i11, str);
    }

    public final int component1() {
        return this.advId;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final LastKnetStatusBody copy(int i11, String timestamp) {
        o.i(timestamp, "timestamp");
        return new LastKnetStatusBody(i11, timestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastKnetStatusBody)) {
            return false;
        }
        LastKnetStatusBody lastKnetStatusBody = (LastKnetStatusBody) obj;
        if (this.advId == lastKnetStatusBody.advId && o.d(this.timestamp, lastKnetStatusBody.timestamp)) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Integer.hashCode(this.advId) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        int i11 = this.advId;
        String str = this.timestamp;
        return "LastKnetStatusBody(advId=" + i11 + ", timestamp=" + str + ")";
    }

    public /* synthetic */ LastKnetStatusBody(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? String.valueOf(System.currentTimeMillis() / 1000) : str);
    }
}
