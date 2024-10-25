package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: IncrementPushClicksBody.kt */
/* loaded from: classes2.dex */
public final class IncrementPushClicksBody {
    public static final int $stable = 0;
    @c(ForeSaleFCMMessage.MID)
    private final String messageId;

    public IncrementPushClicksBody(String messageId) {
        o.i(messageId, "messageId");
        this.messageId = messageId;
    }

    public static /* synthetic */ IncrementPushClicksBody copy$default(IncrementPushClicksBody incrementPushClicksBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = incrementPushClicksBody.messageId;
        }
        return incrementPushClicksBody.copy(str);
    }

    public final String component1() {
        return this.messageId;
    }

    public final IncrementPushClicksBody copy(String messageId) {
        o.i(messageId, "messageId");
        return new IncrementPushClicksBody(messageId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementPushClicksBody) && o.d(this.messageId, ((IncrementPushClicksBody) obj).messageId)) {
            return true;
        }
        return false;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    public String toString() {
        String str = this.messageId;
        return "IncrementPushClicksBody(messageId=" + str + ")";
    }
}
