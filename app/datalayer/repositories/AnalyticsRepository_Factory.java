package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.analytics.AWSEventsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.FacebookEventsLogger;
import com.forsale.app.utils.analytics.FirebaseEventsLogger;
import com.forsale.app.utils.analytics.LeanPlumLogger;
/* loaded from: classes2.dex */
public final class AnalyticsRepository_Factory implements dagger.internal.b<AnalyticsRepository> {
    private final vz.a<AmplitudeLogger> amplitudeLoggerProvider;
    private final vz.a<AggregatedAllAnalyticsLogger> analyticsLoggerProvider;
    private final vz.a<AWSEventsLogger> awsEventsLoggerProvider;
    private final vz.a<FacebookEventsLogger> facebookEventsLoggerProvider;
    private final vz.a<FirebaseEventsLogger> firebaseEventsLoggerProvider;
    private final vz.a<LeanPlumLogger> leanPlumLoggerProvider;
    private final vz.a<MasterDataRepository> masterDataRepositoryProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;

    public AnalyticsRepository_Factory(vz.a<RegionsRepository> aVar, vz.a<MasterDataRepository> aVar2, vz.a<AWSEventsLogger> aVar3, vz.a<FacebookEventsLogger> aVar4, vz.a<FirebaseEventsLogger> aVar5, vz.a<AggregatedAllAnalyticsLogger> aVar6, vz.a<AmplitudeLogger> aVar7, vz.a<LeanPlumLogger> aVar8) {
        this.regionsRepositoryProvider = aVar;
        this.masterDataRepositoryProvider = aVar2;
        this.awsEventsLoggerProvider = aVar3;
        this.facebookEventsLoggerProvider = aVar4;
        this.firebaseEventsLoggerProvider = aVar5;
        this.analyticsLoggerProvider = aVar6;
        this.amplitudeLoggerProvider = aVar7;
        this.leanPlumLoggerProvider = aVar8;
    }

    public static AnalyticsRepository_Factory create(vz.a<RegionsRepository> aVar, vz.a<MasterDataRepository> aVar2, vz.a<AWSEventsLogger> aVar3, vz.a<FacebookEventsLogger> aVar4, vz.a<FirebaseEventsLogger> aVar5, vz.a<AggregatedAllAnalyticsLogger> aVar6, vz.a<AmplitudeLogger> aVar7, vz.a<LeanPlumLogger> aVar8) {
        return new AnalyticsRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static AnalyticsRepository newInstance(RegionsRepository regionsRepository, MasterDataRepository masterDataRepository, AWSEventsLogger aWSEventsLogger, FacebookEventsLogger facebookEventsLogger, FirebaseEventsLogger firebaseEventsLogger, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, AmplitudeLogger amplitudeLogger, LeanPlumLogger leanPlumLogger) {
        return new AnalyticsRepository(regionsRepository, masterDataRepository, aWSEventsLogger, facebookEventsLogger, firebaseEventsLogger, aggregatedAllAnalyticsLogger, amplitudeLogger, leanPlumLogger);
    }

    @Override // vz.a
    public AnalyticsRepository get() {
        return newInstance(this.regionsRepositoryProvider.get(), this.masterDataRepositoryProvider.get(), this.awsEventsLoggerProvider.get(), this.facebookEventsLoggerProvider.get(), this.firebaseEventsLoggerProvider.get(), this.analyticsLoggerProvider.get(), this.amplitudeLoggerProvider.get(), this.leanPlumLoggerProvider.get());
    }
}
