package com.forsale.app.datalayer.network.entities;

import com.leanplum.internal.Constants;
import up.c;
/* compiled from: IncrementViewCounterResponse.kt */
/* loaded from: classes2.dex */
public final class IncrementViewCounterResponse {
    public static final int $stable = 0;
    @c(Constants.Params.COUNT)
    private final int count;

    public IncrementViewCounterResponse(int i11) {
        this.count = i11;
    }

    public static /* synthetic */ IncrementViewCounterResponse copy$default(IncrementViewCounterResponse incrementViewCounterResponse, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = incrementViewCounterResponse.count;
        }
        return incrementViewCounterResponse.copy(i11);
    }

    public final int component1() {
        return this.count;
    }

    public final IncrementViewCounterResponse copy(int i11) {
        return new IncrementViewCounterResponse(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementViewCounterResponse) && this.count == ((IncrementViewCounterResponse) obj).count) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public String toString() {
        int i11 = this.count;
        return "IncrementViewCounterResponse(count=" + i11 + ")";
    }
}
