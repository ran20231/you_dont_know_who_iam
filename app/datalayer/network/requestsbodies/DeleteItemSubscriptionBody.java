package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: DeleteItemSubscriptionBody.kt */
/* loaded from: classes2.dex */
public final class DeleteItemSubscriptionBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("subscription_id")
    private final int subscriptionId;

    public DeleteItemSubscriptionBody(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.subscriptionId = i11;
    }

    public static /* synthetic */ DeleteItemSubscriptionBody copy$default(DeleteItemSubscriptionBody deleteItemSubscriptionBody, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deleteItemSubscriptionBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            i11 = deleteItemSubscriptionBody.subscriptionId;
        }
        return deleteItemSubscriptionBody.copy(str, i11);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.subscriptionId;
    }

    public final DeleteItemSubscriptionBody copy(String deviceId, int i11) {
        o.i(deviceId, "deviceId");
        return new DeleteItemSubscriptionBody(deviceId, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteItemSubscriptionBody)) {
            return false;
        }
        DeleteItemSubscriptionBody deleteItemSubscriptionBody = (DeleteItemSubscriptionBody) obj;
        if (o.d(this.deviceId, deleteItemSubscriptionBody.deviceId) && this.subscriptionId == deleteItemSubscriptionBody.subscriptionId) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getSubscriptionId() {
        return this.subscriptionId;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + Integer.hashCode(this.subscriptionId);
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.subscriptionId;
        return "DeleteItemSubscriptionBody(deviceId=" + str + ", subscriptionId=" + i11 + ")";
    }
}
