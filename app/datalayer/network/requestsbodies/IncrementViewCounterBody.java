package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: IncrementViewCounterBody.kt */
/* loaded from: classes2.dex */
public final class IncrementViewCounterBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final String adv_id;

    public IncrementViewCounterBody(String adv_id) {
        o.i(adv_id, "adv_id");
        this.adv_id = adv_id;
    }

    public static /* synthetic */ IncrementViewCounterBody copy$default(IncrementViewCounterBody incrementViewCounterBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = incrementViewCounterBody.adv_id;
        }
        return incrementViewCounterBody.copy(str);
    }

    public final String component1() {
        return this.adv_id;
    }

    public final IncrementViewCounterBody copy(String adv_id) {
        o.i(adv_id, "adv_id");
        return new IncrementViewCounterBody(adv_id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof IncrementViewCounterBody) && o.d(this.adv_id, ((IncrementViewCounterBody) obj).adv_id)) {
            return true;
        }
        return false;
    }

    public final String getAdv_id() {
        return this.adv_id;
    }

    public int hashCode() {
        return this.adv_id.hashCode();
    }

    public String toString() {
        String str = this.adv_id;
        return "IncrementViewCounterBody(adv_id=" + str + ")";
    }
}
