package com.forsale.app.datalayer.network.responses;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CheckFreeAdsAllowanceResponse.kt */
/* loaded from: classes2.dex */
public final class CheckFreeAdsAllowanceResponse {
    public static final int $stable = 0;
    @c("is_allowed")
    private final int isAllowed;
    private final String message;

    public CheckFreeAdsAllowanceResponse(int i11, String message) {
        o.i(message, "message");
        this.isAllowed = i11;
        this.message = message;
    }

    public static /* synthetic */ CheckFreeAdsAllowanceResponse copy$default(CheckFreeAdsAllowanceResponse checkFreeAdsAllowanceResponse, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = checkFreeAdsAllowanceResponse.isAllowed;
        }
        if ((i12 & 2) != 0) {
            str = checkFreeAdsAllowanceResponse.message;
        }
        return checkFreeAdsAllowanceResponse.copy(i11, str);
    }

    public final int component1() {
        return this.isAllowed;
    }

    public final String component2() {
        return this.message;
    }

    public final CheckFreeAdsAllowanceResponse copy(int i11, String message) {
        o.i(message, "message");
        return new CheckFreeAdsAllowanceResponse(i11, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckFreeAdsAllowanceResponse)) {
            return false;
        }
        CheckFreeAdsAllowanceResponse checkFreeAdsAllowanceResponse = (CheckFreeAdsAllowanceResponse) obj;
        if (this.isAllowed == checkFreeAdsAllowanceResponse.isAllowed && o.d(this.message, checkFreeAdsAllowanceResponse.message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (Integer.hashCode(this.isAllowed) * 31) + this.message.hashCode();
    }

    public final int isAllowed() {
        return this.isAllowed;
    }

    public String toString() {
        int i11 = this.isAllowed;
        String str = this.message;
        return "CheckFreeAdsAllowanceResponse(isAllowed=" + i11 + ", message=" + str + ")";
    }
}
