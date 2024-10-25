package com.forsale.app.datalayer.network.responses;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SetDoNotDisturbResponse.kt */
/* loaded from: classes2.dex */
public final class SetDoNotDisturbResponse {
    public static final int $stable = 0;
    @c(ListingItemBase.DO_NOT_DISTURB)
    private final String DoNotDisturb;

    public SetDoNotDisturbResponse(String DoNotDisturb) {
        o.i(DoNotDisturb, "DoNotDisturb");
        this.DoNotDisturb = DoNotDisturb;
    }

    public static /* synthetic */ SetDoNotDisturbResponse copy$default(SetDoNotDisturbResponse setDoNotDisturbResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setDoNotDisturbResponse.DoNotDisturb;
        }
        return setDoNotDisturbResponse.copy(str);
    }

    public final String component1() {
        return this.DoNotDisturb;
    }

    public final SetDoNotDisturbResponse copy(String DoNotDisturb) {
        o.i(DoNotDisturb, "DoNotDisturb");
        return new SetDoNotDisturbResponse(DoNotDisturb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetDoNotDisturbResponse) && o.d(this.DoNotDisturb, ((SetDoNotDisturbResponse) obj).DoNotDisturb)) {
            return true;
        }
        return false;
    }

    public final String getDoNotDisturb() {
        return this.DoNotDisturb;
    }

    public int hashCode() {
        return this.DoNotDisturb.hashCode();
    }

    public String toString() {
        String str = this.DoNotDisturb;
        return "SetDoNotDisturbResponse(DoNotDisturb=" + str + ")";
    }
}
