package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.entities.KnetPaymentStatus;
import falcon.chat.entities.MessageKt;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LastKnetStatusResponse.kt */
/* loaded from: classes2.dex */
public final class LastKnetStatusResponse {
    public static final int $stable = 0;
    @c(MessageKt.STATUS)
    private final KnetPaymentStatus status;

    public LastKnetStatusResponse(KnetPaymentStatus status) {
        o.i(status, "status");
        this.status = status;
    }

    public static /* synthetic */ LastKnetStatusResponse copy$default(LastKnetStatusResponse lastKnetStatusResponse, KnetPaymentStatus knetPaymentStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            knetPaymentStatus = lastKnetStatusResponse.status;
        }
        return lastKnetStatusResponse.copy(knetPaymentStatus);
    }

    public final KnetPaymentStatus component1() {
        return this.status;
    }

    public final LastKnetStatusResponse copy(KnetPaymentStatus status) {
        o.i(status, "status");
        return new LastKnetStatusResponse(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LastKnetStatusResponse) && this.status == ((LastKnetStatusResponse) obj).status) {
            return true;
        }
        return false;
    }

    public final KnetPaymentStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        KnetPaymentStatus knetPaymentStatus = this.status;
        return "LastKnetStatusResponse(status=" + knetPaymentStatus + ")";
    }
}
