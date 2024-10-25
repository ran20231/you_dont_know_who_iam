package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.analytics.AnalyticsType;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: IncrementCallClicksBody.kt */
/* loaded from: classes2.dex */
public final class IncrementCallClicksBody {
    public static final int $stable = 0;
    @c("target")
    private final AnalyticsType target;
    @c("user_adv_id")
    private final String user_adv_id;

    public IncrementCallClicksBody(String user_adv_id, AnalyticsType target) {
        o.i(user_adv_id, "user_adv_id");
        o.i(target, "target");
        this.user_adv_id = user_adv_id;
        this.target = target;
    }

    public final AnalyticsType getTarget() {
        return this.target;
    }

    public final String getUser_adv_id() {
        return this.user_adv_id;
    }
}
