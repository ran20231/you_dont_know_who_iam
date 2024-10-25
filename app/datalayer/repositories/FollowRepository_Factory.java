package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.FollowService;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
/* loaded from: classes2.dex */
public final class FollowRepository_Factory implements dagger.internal.b<FollowRepository> {
    private final vz.a<AggregatedAllAnalyticsLogger> analyticsLoggerProvider;
    private final vz.a<FollowService> followServiceProvider;
    private final vz.a<FollowUserDao> followUserDaoProvider;

    public FollowRepository_Factory(vz.a<FollowService> aVar, vz.a<FollowUserDao> aVar2, vz.a<AggregatedAllAnalyticsLogger> aVar3) {
        this.followServiceProvider = aVar;
        this.followUserDaoProvider = aVar2;
        this.analyticsLoggerProvider = aVar3;
    }

    public static FollowRepository_Factory create(vz.a<FollowService> aVar, vz.a<FollowUserDao> aVar2, vz.a<AggregatedAllAnalyticsLogger> aVar3) {
        return new FollowRepository_Factory(aVar, aVar2, aVar3);
    }

    public static FollowRepository newInstance(FollowService followService, FollowUserDao followUserDao, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        return new FollowRepository(followService, followUserDao, aggregatedAllAnalyticsLogger);
    }

    @Override // vz.a
    public FollowRepository get() {
        return newInstance(this.followServiceProvider.get(), this.followUserDaoProvider.get(), this.analyticsLoggerProvider.get());
    }
}
