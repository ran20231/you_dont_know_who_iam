package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.requestsbodies.IncrementPushClicksBody;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AnalyticsServerRepository.kt */
/* loaded from: classes2.dex */
public final class AnalyticsServerRepository {
    public static final int $stable = 8;
    private final AnalyticsService analyticsService;

    public AnalyticsServerRepository(AnalyticsService analyticsService) {
        o.i(analyticsService, "analyticsService");
        this.analyticsService = analyticsService;
    }

    public final Object incrementPushMessageClicks(String str, zz.a<? super p> aVar) {
        Object f11;
        Object incrementPushMessageClicks = this.analyticsService.incrementPushMessageClicks(new IncrementPushClicksBody(str), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (incrementPushMessageClicks == f11) {
            return incrementPushMessageClicks;
        }
        return p.f75480a;
    }
}
