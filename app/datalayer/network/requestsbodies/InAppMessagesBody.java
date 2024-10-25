package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: InAppMessagesBody.kt */
/* loaded from: classes2.dex */
public final class InAppMessagesBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    private final Integer reset;

    public InAppMessagesBody(String deviceId, Integer num) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.reset = num;
    }

    public static /* synthetic */ InAppMessagesBody copy$default(InAppMessagesBody inAppMessagesBody, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inAppMessagesBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            num = inAppMessagesBody.reset;
        }
        return inAppMessagesBody.copy(str, num);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final Integer component2() {
        return this.reset;
    }

    public final InAppMessagesBody copy(String deviceId, Integer num) {
        o.i(deviceId, "deviceId");
        return new InAppMessagesBody(deviceId, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessagesBody)) {
            return false;
        }
        InAppMessagesBody inAppMessagesBody = (InAppMessagesBody) obj;
        if (o.d(this.deviceId, inAppMessagesBody.deviceId) && o.d(this.reset, inAppMessagesBody.reset)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Integer getReset() {
        return this.reset;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.deviceId.hashCode() * 31;
        Integer num = this.reset;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.deviceId;
        Integer num = this.reset;
        return "InAppMessagesBody(deviceId=" + str + ", reset=" + num + ")";
    }

    public /* synthetic */ InAppMessagesBody(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num);
    }
}
