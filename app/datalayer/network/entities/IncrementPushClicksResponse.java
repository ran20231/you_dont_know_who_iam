package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: IncrementPushClicksResponse.kt */
/* loaded from: classes2.dex */
public final class IncrementPushClicksResponse {
    public static final int $stable = 0;
    @c("success")
    private final int success;

    public IncrementPushClicksResponse(int i11) {
        this.success = i11;
    }

    public static /* synthetic */ IncrementPushClicksResponse copy$default(IncrementPushClicksResponse incrementPushClicksResponse, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = incrementPushClicksResponse.success;
        }
        return incrementPushClicksResponse.copy(i11);
    }

    public final int component1() {
        return this.success;
    }

    public final IncrementPushClicksResponse copy(int i11) {
        return new IncrementPushClicksResponse(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementPushClicksResponse) && this.success == ((IncrementPushClicksResponse) obj).success) {
            return true;
        }
        return false;
    }

    public final int getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Integer.hashCode(this.success);
    }

    public String toString() {
        int i11 = this.success;
        return "IncrementPushClicksResponse(success=" + i11 + ")";
    }
}
