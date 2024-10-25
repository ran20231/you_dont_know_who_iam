package com.forsale.app.datalayer.network.requestsbodies;

import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AboutToExpireViewedRequestBody.kt */
/* loaded from: classes2.dex */
public final class AboutToExpireViewedRequestBody {
    public static final int $stable = 8;
    @c("adv_ids")
    private final List<Integer> advIds;

    public AboutToExpireViewedRequestBody(List<Integer> advIds) {
        o.i(advIds, "advIds");
        this.advIds = advIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AboutToExpireViewedRequestBody copy$default(AboutToExpireViewedRequestBody aboutToExpireViewedRequestBody, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aboutToExpireViewedRequestBody.advIds;
        }
        return aboutToExpireViewedRequestBody.copy(list);
    }

    public final List<Integer> component1() {
        return this.advIds;
    }

    public final AboutToExpireViewedRequestBody copy(List<Integer> advIds) {
        o.i(advIds, "advIds");
        return new AboutToExpireViewedRequestBody(advIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AboutToExpireViewedRequestBody) && o.d(this.advIds, ((AboutToExpireViewedRequestBody) obj).advIds)) {
            return true;
        }
        return false;
    }

    public final List<Integer> getAdvIds() {
        return this.advIds;
    }

    public int hashCode() {
        return this.advIds.hashCode();
    }

    public String toString() {
        List<Integer> list = this.advIds;
        return "AboutToExpireViewedRequestBody(advIds=" + list + ")";
    }
}
