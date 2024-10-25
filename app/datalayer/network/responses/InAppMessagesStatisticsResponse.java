package com.forsale.app.datalayer.network.responses;
/* compiled from: InAppMessagesStatisticsResponse.kt */
/* loaded from: classes2.dex */
public final class InAppMessagesStatisticsResponse {
    public static final int $stable = 0;
    private final int success;

    public InAppMessagesStatisticsResponse(int i11) {
        this.success = i11;
    }

    public static /* synthetic */ InAppMessagesStatisticsResponse copy$default(InAppMessagesStatisticsResponse inAppMessagesStatisticsResponse, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = inAppMessagesStatisticsResponse.success;
        }
        return inAppMessagesStatisticsResponse.copy(i11);
    }

    public final int component1() {
        return this.success;
    }

    public final InAppMessagesStatisticsResponse copy(int i11) {
        return new InAppMessagesStatisticsResponse(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InAppMessagesStatisticsResponse) && this.success == ((InAppMessagesStatisticsResponse) obj).success) {
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
        return "InAppMessagesStatisticsResponse(success=" + i11 + ")";
    }
}
