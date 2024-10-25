package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RepostListingBody.kt */
/* loaded from: classes2.dex */
public final class RepostListingBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("type")
    private final String type;

    public RepostListingBody(int i11, String type) {
        o.i(type, "type");
        this.advId = i11;
        this.type = type;
    }

    public static /* synthetic */ RepostListingBody copy$default(RepostListingBody repostListingBody, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = repostListingBody.advId;
        }
        if ((i12 & 2) != 0) {
            str = repostListingBody.type;
        }
        return repostListingBody.copy(i11, str);
    }

    public final int component1() {
        return this.advId;
    }

    public final String component2() {
        return this.type;
    }

    public final RepostListingBody copy(int i11, String type) {
        o.i(type, "type");
        return new RepostListingBody(i11, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostListingBody)) {
            return false;
        }
        RepostListingBody repostListingBody = (RepostListingBody) obj;
        if (this.advId == repostListingBody.advId && o.d(this.type, repostListingBody.type)) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.advId) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i11 = this.advId;
        String str = this.type;
        return "RepostListingBody(advId=" + i11 + ", type=" + str + ")";
    }
}
