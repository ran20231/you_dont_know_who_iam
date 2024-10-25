package com.forsale.app.datalayer.network.responses;

import up.c;
/* compiled from: AdDurationResponse.kt */
/* loaded from: classes2.dex */
public final class AdDurationResponse {
    public static final int $stable = 0;
    @c("default_free_duration")
    private final int freeDuration;
    @c("default_paid_duration")
    private final int paidDuration;

    public AdDurationResponse(int i11, int i12) {
        this.paidDuration = i11;
        this.freeDuration = i12;
    }

    public static /* synthetic */ AdDurationResponse copy$default(AdDurationResponse adDurationResponse, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = adDurationResponse.paidDuration;
        }
        if ((i13 & 2) != 0) {
            i12 = adDurationResponse.freeDuration;
        }
        return adDurationResponse.copy(i11, i12);
    }

    public final int component1() {
        return this.paidDuration;
    }

    public final int component2() {
        return this.freeDuration;
    }

    public final AdDurationResponse copy(int i11, int i12) {
        return new AdDurationResponse(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDurationResponse)) {
            return false;
        }
        AdDurationResponse adDurationResponse = (AdDurationResponse) obj;
        if (this.paidDuration == adDurationResponse.paidDuration && this.freeDuration == adDurationResponse.freeDuration) {
            return true;
        }
        return false;
    }

    public final int getFreeDuration() {
        return this.freeDuration;
    }

    public final int getPaidDuration() {
        return this.paidDuration;
    }

    public int hashCode() {
        return (Integer.hashCode(this.paidDuration) * 31) + Integer.hashCode(this.freeDuration);
    }

    public String toString() {
        int i11 = this.paidDuration;
        int i12 = this.freeDuration;
        return "AdDurationResponse(paidDuration=" + i11 + ", freeDuration=" + i12 + ")";
    }
}
