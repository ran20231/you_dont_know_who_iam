package com.forsale.app.datalayer.network.responses;

import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ItemSubscriptionsResponse.kt */
/* loaded from: classes2.dex */
public final class ItemSubscriptionsResponse {
    public static final int $stable = 8;
    @c("page_number")
    private final int pageNumber;
    private final List<ItemSubscriptionResponse> subscriptions;
    @c("total_pages")
    private final int totalPages;
    @c("total_subscriptions")
    private final int totalSubscriptions;

    public ItemSubscriptionsResponse(int i11, List<ItemSubscriptionResponse> subscriptions, int i12, int i13) {
        o.i(subscriptions, "subscriptions");
        this.pageNumber = i11;
        this.subscriptions = subscriptions;
        this.totalPages = i12;
        this.totalSubscriptions = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemSubscriptionsResponse copy$default(ItemSubscriptionsResponse itemSubscriptionsResponse, int i11, List list, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = itemSubscriptionsResponse.pageNumber;
        }
        if ((i14 & 2) != 0) {
            list = itemSubscriptionsResponse.subscriptions;
        }
        if ((i14 & 4) != 0) {
            i12 = itemSubscriptionsResponse.totalPages;
        }
        if ((i14 & 8) != 0) {
            i13 = itemSubscriptionsResponse.totalSubscriptions;
        }
        return itemSubscriptionsResponse.copy(i11, list, i12, i13);
    }

    public final int component1() {
        return this.pageNumber;
    }

    public final List<ItemSubscriptionResponse> component2() {
        return this.subscriptions;
    }

    public final int component3() {
        return this.totalPages;
    }

    public final int component4() {
        return this.totalSubscriptions;
    }

    public final ItemSubscriptionsResponse copy(int i11, List<ItemSubscriptionResponse> subscriptions, int i12, int i13) {
        o.i(subscriptions, "subscriptions");
        return new ItemSubscriptionsResponse(i11, subscriptions, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemSubscriptionsResponse)) {
            return false;
        }
        ItemSubscriptionsResponse itemSubscriptionsResponse = (ItemSubscriptionsResponse) obj;
        if (this.pageNumber == itemSubscriptionsResponse.pageNumber && o.d(this.subscriptions, itemSubscriptionsResponse.subscriptions) && this.totalPages == itemSubscriptionsResponse.totalPages && this.totalSubscriptions == itemSubscriptionsResponse.totalSubscriptions) {
            return true;
        }
        return false;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final List<ItemSubscriptionResponse> getSubscriptions() {
        return this.subscriptions;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getTotalSubscriptions() {
        return this.totalSubscriptions;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.pageNumber) * 31) + this.subscriptions.hashCode()) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.totalSubscriptions);
    }

    public String toString() {
        int i11 = this.pageNumber;
        List<ItemSubscriptionResponse> list = this.subscriptions;
        int i12 = this.totalPages;
        int i13 = this.totalSubscriptions;
        return "ItemSubscriptionsResponse(pageNumber=" + i11 + ", subscriptions=" + list + ", totalPages=" + i12 + ", totalSubscriptions=" + i13 + ")";
    }
}
