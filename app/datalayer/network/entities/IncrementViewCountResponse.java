package com.forsale.app.datalayer.network.entities;

import up.c;
/* compiled from: IncrementViewCountResponse.kt */
/* loaded from: classes2.dex */
public final class IncrementViewCountResponse {
    public static final int $stable = 0;
    @c("views_count")
    private final int viewsCount;

    public IncrementViewCountResponse(int i11) {
        this.viewsCount = i11;
    }

    public static /* synthetic */ IncrementViewCountResponse copy$default(IncrementViewCountResponse incrementViewCountResponse, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = incrementViewCountResponse.viewsCount;
        }
        return incrementViewCountResponse.copy(i11);
    }

    public final int component1() {
        return this.viewsCount;
    }

    public final IncrementViewCountResponse copy(int i11) {
        return new IncrementViewCountResponse(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementViewCountResponse) && this.viewsCount == ((IncrementViewCountResponse) obj).viewsCount) {
            return true;
        }
        return false;
    }

    public final int getViewsCount() {
        return this.viewsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.viewsCount);
    }

    public String toString() {
        int i11 = this.viewsCount;
        return "IncrementViewCountResponse(viewsCount=" + i11 + ")";
    }
}
