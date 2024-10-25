package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
/* loaded from: classes2.dex */
public final class BaseRepository_Factory implements dagger.internal.b<BaseRepository> {
    private final vz.a<wi.a> analyticsCustomLoggerProvider;
    private final vz.a<AggregatedAllAnalyticsLogger> analyticsLoggerProvider;
    private final vz.a<CategoriesRepositories> categoriesRepositoriesProvider;
    private final vz.a<ExpireSoonRepository> expireSoonRepositoryProvider;
    private final vz.a<ImagesRepository> imagesRepositoryProvider;
    private final vz.a<InAppRepository> inAppRepositoryProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;
    private final vz.a<ApplicationResourcesRepository> resourcesRepositoryProvider;

    public BaseRepository_Factory(vz.a<InAppRepository> aVar, vz.a<ImagesRepository> aVar2, vz.a<RegionsRepository> aVar3, vz.a<AggregatedAllAnalyticsLogger> aVar4, vz.a<wi.a> aVar5, vz.a<ExpireSoonRepository> aVar6, vz.a<CategoriesRepositories> aVar7, vz.a<ApplicationResourcesRepository> aVar8) {
        this.inAppRepositoryProvider = aVar;
        this.imagesRepositoryProvider = aVar2;
        this.regionsRepositoryProvider = aVar3;
        this.analyticsLoggerProvider = aVar4;
        this.analyticsCustomLoggerProvider = aVar5;
        this.expireSoonRepositoryProvider = aVar6;
        this.categoriesRepositoriesProvider = aVar7;
        this.resourcesRepositoryProvider = aVar8;
    }

    public static BaseRepository_Factory create(vz.a<InAppRepository> aVar, vz.a<ImagesRepository> aVar2, vz.a<RegionsRepository> aVar3, vz.a<AggregatedAllAnalyticsLogger> aVar4, vz.a<wi.a> aVar5, vz.a<ExpireSoonRepository> aVar6, vz.a<CategoriesRepositories> aVar7, vz.a<ApplicationResourcesRepository> aVar8) {
        return new BaseRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static BaseRepository newInstance(InAppRepository inAppRepository, ImagesRepository imagesRepository, RegionsRepository regionsRepository, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, wi.a aVar, ExpireSoonRepository expireSoonRepository, CategoriesRepositories categoriesRepositories, ApplicationResourcesRepository applicationResourcesRepository) {
        return new BaseRepository(inAppRepository, imagesRepository, regionsRepository, aggregatedAllAnalyticsLogger, aVar, expireSoonRepository, categoriesRepositories, applicationResourcesRepository);
    }

    @Override // vz.a
    public BaseRepository get() {
        return newInstance(this.inAppRepositoryProvider.get(), this.imagesRepositoryProvider.get(), this.regionsRepositoryProvider.get(), this.analyticsLoggerProvider.get(), this.analyticsCustomLoggerProvider.get(), this.expireSoonRepositoryProvider.get(), this.categoriesRepositoriesProvider.get(), this.resourcesRepositoryProvider.get());
    }
}
