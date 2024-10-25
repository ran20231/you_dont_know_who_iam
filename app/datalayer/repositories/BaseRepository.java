package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
/* compiled from: BaseRepository.kt */
/* loaded from: classes2.dex */
public final class BaseRepository {
    public static final int $stable = 8;
    private final wi.a analyticsCustomLogger;
    private final AggregatedAllAnalyticsLogger analyticsLogger;
    private final CategoriesRepositories categoriesRepositories;
    private final ExpireSoonRepository expireSoonRepository;
    private final ImagesRepository imagesRepository;
    private final InAppRepository inAppRepository;
    private final RegionsRepository regionsRepository;
    private final ApplicationResourcesRepository resourcesRepository;

    public BaseRepository(InAppRepository inAppRepository, ImagesRepository imagesRepository, RegionsRepository regionsRepository, AggregatedAllAnalyticsLogger analyticsLogger, wi.a analyticsCustomLogger, ExpireSoonRepository expireSoonRepository, CategoriesRepositories categoriesRepositories, ApplicationResourcesRepository resourcesRepository) {
        o.i(inAppRepository, "inAppRepository");
        o.i(imagesRepository, "imagesRepository");
        o.i(regionsRepository, "regionsRepository");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(analyticsCustomLogger, "analyticsCustomLogger");
        o.i(expireSoonRepository, "expireSoonRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(resourcesRepository, "resourcesRepository");
        this.inAppRepository = inAppRepository;
        this.imagesRepository = imagesRepository;
        this.regionsRepository = regionsRepository;
        this.analyticsLogger = analyticsLogger;
        this.analyticsCustomLogger = analyticsCustomLogger;
        this.expireSoonRepository = expireSoonRepository;
        this.categoriesRepositories = categoriesRepositories;
        this.resourcesRepository = resourcesRepository;
    }

    public final wi.a getAnalyticsCustomLogger() {
        return this.analyticsCustomLogger;
    }

    public final AggregatedAllAnalyticsLogger getAnalyticsLogger() {
        return this.analyticsLogger;
    }

    public final CategoriesRepositories getCategoriesRepositories() {
        return this.categoriesRepositories;
    }

    public final ExpireSoonRepository getExpireSoonRepository() {
        return this.expireSoonRepository;
    }

    public final ImagesRepository getImagesRepository() {
        return this.imagesRepository;
    }

    public final InAppRepository getInAppRepository() {
        return this.inAppRepository;
    }

    public final RegionsRepository getRegionsRepository() {
        return this.regionsRepository;
    }

    public final ApplicationResourcesRepository getResourcesRepository() {
        return this.resourcesRepository;
    }
}
