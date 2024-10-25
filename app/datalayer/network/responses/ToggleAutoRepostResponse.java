package com.forsale.app.datalayer.network.responses;

import up.c;
/* compiled from: ToggleAutoRepostResponse.kt */
/* loaded from: classes2.dex */
public final class ToggleAutoRepostResponse {
    public static final int $stable = 0;
    @c("repost_auto_renew")
    private final boolean RepostAutoRenew;

    public ToggleAutoRepostResponse(boolean z11) {
        this.RepostAutoRenew = z11;
    }

    public static /* synthetic */ ToggleAutoRepostResponse copy$default(ToggleAutoRepostResponse toggleAutoRepostResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = toggleAutoRepostResponse.RepostAutoRenew;
        }
        return toggleAutoRepostResponse.copy(z11);
    }

    public final boolean component1() {
        return this.RepostAutoRenew;
    }

    public final ToggleAutoRepostResponse copy(boolean z11) {
        return new ToggleAutoRepostResponse(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ToggleAutoRepostResponse) && this.RepostAutoRenew == ((ToggleAutoRepostResponse) obj).RepostAutoRenew) {
            return true;
        }
        return false;
    }

    public final boolean getRepostAutoRenew() {
        return this.RepostAutoRenew;
    }

    public int hashCode() {
        boolean z11 = this.RepostAutoRenew;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.RepostAutoRenew;
        return "ToggleAutoRepostResponse(RepostAutoRenew=" + z11 + ")";
    }
}
