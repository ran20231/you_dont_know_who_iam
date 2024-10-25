package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.AnalyticsService;
/* loaded from: classes2.dex */
public final class AnalyticsServerRepository_Factory implements dagger.internal.b<AnalyticsServerRepository> {
    private final vz.a<AnalyticsService> analyticsServiceProvider;

    public AnalyticsServerRepository_Factory(vz.a<AnalyticsService> aVar) {
        this.analyticsServiceProvider = aVar;
    }

    public static AnalyticsServerRepository_Factory create(vz.a<AnalyticsService> aVar) {
        return new AnalyticsServerRepository_Factory(aVar);
    }

    public static AnalyticsServerRepository newInstance(AnalyticsService analyticsService) {
        return new AnalyticsServerRepository(analyticsService);
    }

    @Override // vz.a
    public AnalyticsServerRepository get() {
        return newInstance(this.analyticsServiceProvider.get());
    }
}
