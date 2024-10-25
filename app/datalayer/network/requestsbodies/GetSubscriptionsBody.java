package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetSubscriptionsBody.kt */
/* loaded from: classes2.dex */
public final class GetSubscriptionsBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    private final int page;
    @c("page_size")
    private final int pageSize;

    public GetSubscriptionsBody(String deviceId, int i11, int i12) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.page = i11;
        this.pageSize = i12;
    }

    public static /* synthetic */ GetSubscriptionsBody copy$default(GetSubscriptionsBody getSubscriptionsBody, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getSubscriptionsBody.deviceId;
        }
        if ((i13 & 2) != 0) {
            i11 = getSubscriptionsBody.page;
        }
        if ((i13 & 4) != 0) {
            i12 = getSubscriptionsBody.pageSize;
        }
        return getSubscriptionsBody.copy(str, i11, i12);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.pageSize;
    }

    public final GetSubscriptionsBody copy(String deviceId, int i11, int i12) {
        o.i(deviceId, "deviceId");
        return new GetSubscriptionsBody(deviceId, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSubscriptionsBody)) {
            return false;
        }
        GetSubscriptionsBody getSubscriptionsBody = (GetSubscriptionsBody) obj;
        if (o.d(this.deviceId, getSubscriptionsBody.deviceId) && this.page == getSubscriptionsBody.page && this.pageSize == getSubscriptionsBody.pageSize) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize);
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.page;
        int i12 = this.pageSize;
        return "GetSubscriptionsBody(deviceId=" + str + ", page=" + i11 + ", pageSize=" + i12 + ")";
    }
}
