package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.analytics.AnalyticsType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import up.c;
/* compiled from: ListingAnalyticsBody.kt */
/* loaded from: classes2.dex */
public final class ListingAnalyticsBody {
    public static final int $stable = 0;
    private final AnalyticsType target;
    @c("user_adv_id")
    private final int userAdvId;

    public ListingAnalyticsBody(int i11, AnalyticsType analyticsType) {
        this.userAdvId = i11;
        this.target = analyticsType;
    }

    public static /* synthetic */ ListingAnalyticsBody copy$default(ListingAnalyticsBody listingAnalyticsBody, int i11, AnalyticsType analyticsType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = listingAnalyticsBody.userAdvId;
        }
        if ((i12 & 2) != 0) {
            analyticsType = listingAnalyticsBody.target;
        }
        return listingAnalyticsBody.copy(i11, analyticsType);
    }

    public final int component1() {
        return this.userAdvId;
    }

    public final AnalyticsType component2() {
        return this.target;
    }

    public final ListingAnalyticsBody copy(int i11, AnalyticsType analyticsType) {
        return new ListingAnalyticsBody(i11, analyticsType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingAnalyticsBody)) {
            return false;
        }
        ListingAnalyticsBody listingAnalyticsBody = (ListingAnalyticsBody) obj;
        if (this.userAdvId == listingAnalyticsBody.userAdvId && this.target == listingAnalyticsBody.target) {
            return true;
        }
        return false;
    }

    public final AnalyticsType getTarget() {
        return this.target;
    }

    public final int getUserAdvId() {
        return this.userAdvId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.userAdvId) * 31;
        AnalyticsType analyticsType = this.target;
        if (analyticsType == null) {
            hashCode = 0;
        } else {
            hashCode = analyticsType.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i11 = this.userAdvId;
        AnalyticsType analyticsType = this.target;
        return "ListingAnalyticsBody(userAdvId=" + i11 + ", target=" + analyticsType + ")";
    }

    public /* synthetic */ ListingAnalyticsBody(int i11, AnalyticsType analyticsType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? AnalyticsType.VIEWS : analyticsType);
    }
}
