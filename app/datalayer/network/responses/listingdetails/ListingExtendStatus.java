package com.forsale.app.datalayer.network.responses.listingdetails;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingExtendStatus.kt */
/* loaded from: classes2.dex */
public final class ListingExtendStatus {
    public static final int $stable = 0;
    @c("icon")
    private final String icon;
    @c("next_refresh_date")
    private final String nextRefreshDate;
    @c("remaining_no_refreshes")
    private final int remainingNoRefreshes;
    @c("total_no_refreshes")
    private final int totalNoRefreshes;

    public ListingExtendStatus(String icon, int i11, String str, int i12) {
        o.i(icon, "icon");
        this.icon = icon;
        this.totalNoRefreshes = i11;
        this.nextRefreshDate = str;
        this.remainingNoRefreshes = i12;
    }

    public static /* synthetic */ ListingExtendStatus copy$default(ListingExtendStatus listingExtendStatus, String str, int i11, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = listingExtendStatus.icon;
        }
        if ((i13 & 2) != 0) {
            i11 = listingExtendStatus.totalNoRefreshes;
        }
        if ((i13 & 4) != 0) {
            str2 = listingExtendStatus.nextRefreshDate;
        }
        if ((i13 & 8) != 0) {
            i12 = listingExtendStatus.remainingNoRefreshes;
        }
        return listingExtendStatus.copy(str, i11, str2, i12);
    }

    public final String component1() {
        return this.icon;
    }

    public final int component2() {
        return this.totalNoRefreshes;
    }

    public final String component3() {
        return this.nextRefreshDate;
    }

    public final int component4() {
        return this.remainingNoRefreshes;
    }

    public final ListingExtendStatus copy(String icon, int i11, String str, int i12) {
        o.i(icon, "icon");
        return new ListingExtendStatus(icon, i11, str, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingExtendStatus)) {
            return false;
        }
        ListingExtendStatus listingExtendStatus = (ListingExtendStatus) obj;
        if (o.d(this.icon, listingExtendStatus.icon) && this.totalNoRefreshes == listingExtendStatus.totalNoRefreshes && o.d(this.nextRefreshDate, listingExtendStatus.nextRefreshDate) && this.remainingNoRefreshes == listingExtendStatus.remainingNoRefreshes) {
            return true;
        }
        return false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getNextRefreshDate() {
        return this.nextRefreshDate;
    }

    public final int getRemainingNoRefreshes() {
        return this.remainingNoRefreshes;
    }

    public final int getTotalNoRefreshes() {
        return this.totalNoRefreshes;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.icon.hashCode() * 31) + Integer.hashCode(this.totalNoRefreshes)) * 31;
        String str = this.nextRefreshDate;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + Integer.hashCode(this.remainingNoRefreshes);
    }

    public String toString() {
        String str = this.icon;
        int i11 = this.totalNoRefreshes;
        String str2 = this.nextRefreshDate;
        int i12 = this.remainingNoRefreshes;
        return "ListingExtendStatus(icon=" + str + ", totalNoRefreshes=" + i11 + ", nextRefreshDate=" + str2 + ", remainingNoRefreshes=" + i12 + ")";
    }
}
