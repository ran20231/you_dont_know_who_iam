package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: InAppAnalyticsBody.kt */
/* loaded from: classes2.dex */
public final class InAppAnalyticsBody {
    public static final int $stable = 0;
    @c("analytic_type")
    private final String analyticType;
    @c(InAppMessageEntity.ITEM_ID)
    private final int itemId;
    private final InAppType type;

    public InAppAnalyticsBody(int i11, String analyticType, InAppType type) {
        o.i(analyticType, "analyticType");
        o.i(type, "type");
        this.itemId = i11;
        this.analyticType = analyticType;
        this.type = type;
    }

    public static /* synthetic */ InAppAnalyticsBody copy$default(InAppAnalyticsBody inAppAnalyticsBody, int i11, String str, InAppType inAppType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = inAppAnalyticsBody.itemId;
        }
        if ((i12 & 2) != 0) {
            str = inAppAnalyticsBody.analyticType;
        }
        if ((i12 & 4) != 0) {
            inAppType = inAppAnalyticsBody.type;
        }
        return inAppAnalyticsBody.copy(i11, str, inAppType);
    }

    public final int component1() {
        return this.itemId;
    }

    public final String component2() {
        return this.analyticType;
    }

    public final InAppType component3() {
        return this.type;
    }

    public final InAppAnalyticsBody copy(int i11, String analyticType, InAppType type) {
        o.i(analyticType, "analyticType");
        o.i(type, "type");
        return new InAppAnalyticsBody(i11, analyticType, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppAnalyticsBody)) {
            return false;
        }
        InAppAnalyticsBody inAppAnalyticsBody = (InAppAnalyticsBody) obj;
        if (this.itemId == inAppAnalyticsBody.itemId && o.d(this.analyticType, inAppAnalyticsBody.analyticType) && this.type == inAppAnalyticsBody.type) {
            return true;
        }
        return false;
    }

    public final String getAnalyticType() {
        return this.analyticType;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final InAppType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.itemId) * 31) + this.analyticType.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i11 = this.itemId;
        String str = this.analyticType;
        InAppType inAppType = this.type;
        return "InAppAnalyticsBody(itemId=" + i11 + ", analyticType=" + str + ", type=" + inAppType + ")";
    }
}
