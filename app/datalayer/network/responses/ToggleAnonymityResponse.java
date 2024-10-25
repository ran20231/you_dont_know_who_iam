package com.forsale.app.datalayer.network.responses;

import up.c;
/* compiled from: ToggleAnonymityResponse.kt */
/* loaded from: classes2.dex */
public final class ToggleAnonymityResponse {
    public static final int $stable = 0;
    @c("is_anonymous")
    private final boolean IsAnonymous;

    public ToggleAnonymityResponse(boolean z11) {
        this.IsAnonymous = z11;
    }

    public static /* synthetic */ ToggleAnonymityResponse copy$default(ToggleAnonymityResponse toggleAnonymityResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = toggleAnonymityResponse.IsAnonymous;
        }
        return toggleAnonymityResponse.copy(z11);
    }

    public final boolean component1() {
        return this.IsAnonymous;
    }

    public final ToggleAnonymityResponse copy(boolean z11) {
        return new ToggleAnonymityResponse(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ToggleAnonymityResponse) && this.IsAnonymous == ((ToggleAnonymityResponse) obj).IsAnonymous) {
            return true;
        }
        return false;
    }

    public final boolean getIsAnonymous() {
        return this.IsAnonymous;
    }

    public int hashCode() {
        boolean z11 = this.IsAnonymous;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.IsAnonymous;
        return "ToggleAnonymityResponse(IsAnonymous=" + z11 + ")";
    }
}
