package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: InAppMessagesStatisticsBody.kt */
/* loaded from: classes2.dex */
public final class InAppMessagesStatisticsBody {
    public static final int $stable = 0;
    @c(InAppMessageEntity.ITEM_ID)
    private final Integer itemId;
    private final InAppType type;

    public InAppMessagesStatisticsBody(Integer num, InAppType inAppType) {
        this.itemId = num;
        this.type = inAppType;
    }

    public static /* synthetic */ InAppMessagesStatisticsBody copy$default(InAppMessagesStatisticsBody inAppMessagesStatisticsBody, Integer num, InAppType inAppType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = inAppMessagesStatisticsBody.itemId;
        }
        if ((i11 & 2) != 0) {
            inAppType = inAppMessagesStatisticsBody.type;
        }
        return inAppMessagesStatisticsBody.copy(num, inAppType);
    }

    public final Integer component1() {
        return this.itemId;
    }

    public final InAppType component2() {
        return this.type;
    }

    public final InAppMessagesStatisticsBody copy(Integer num, InAppType inAppType) {
        return new InAppMessagesStatisticsBody(num, inAppType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessagesStatisticsBody)) {
            return false;
        }
        InAppMessagesStatisticsBody inAppMessagesStatisticsBody = (InAppMessagesStatisticsBody) obj;
        if (o.d(this.itemId, inAppMessagesStatisticsBody.itemId) && this.type == inAppMessagesStatisticsBody.type) {
            return true;
        }
        return false;
    }

    public final Integer getItemId() {
        return this.itemId;
    }

    public final InAppType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.itemId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        InAppType inAppType = this.type;
        if (inAppType != null) {
            i11 = inAppType.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Integer num = this.itemId;
        InAppType inAppType = this.type;
        return "InAppMessagesStatisticsBody(itemId=" + num + ", type=" + inAppType + ")";
    }
}
