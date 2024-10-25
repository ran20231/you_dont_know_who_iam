package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: NotificationMessagesBody.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c(AdvancedSearchBody.PAGE)
    private final long page;
    @c("page_size")
    private final int pageSize;

    public NotificationMessagesBody(String deviceId, long j11, int i11) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.page = j11;
        this.pageSize = i11;
    }

    public static /* synthetic */ NotificationMessagesBody copy$default(NotificationMessagesBody notificationMessagesBody, String str, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = notificationMessagesBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            j11 = notificationMessagesBody.page;
        }
        if ((i12 & 4) != 0) {
            i11 = notificationMessagesBody.pageSize;
        }
        return notificationMessagesBody.copy(str, j11, i11);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final long component2() {
        return this.page;
    }

    public final int component3() {
        return this.pageSize;
    }

    public final NotificationMessagesBody copy(String deviceId, long j11, int i11) {
        o.i(deviceId, "deviceId");
        return new NotificationMessagesBody(deviceId, j11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationMessagesBody)) {
            return false;
        }
        NotificationMessagesBody notificationMessagesBody = (NotificationMessagesBody) obj;
        if (o.d(this.deviceId, notificationMessagesBody.deviceId) && this.page == notificationMessagesBody.page && this.pageSize == notificationMessagesBody.pageSize) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Long.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize);
    }

    public String toString() {
        String str = this.deviceId;
        long j11 = this.page;
        int i11 = this.pageSize;
        return "NotificationMessagesBody(deviceId=" + str + ", page=" + j11 + ", pageSize=" + i11 + ")";
    }
}
