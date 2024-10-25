package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.RecommendService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.LocationRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.DynamicLinksUtils;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
/* compiled from: ListingDetailsRepository_Factory.java */
/* loaded from: classes2.dex */
public final class g {
    public static ListingDetailsRepository a(int i11, String str, ListingItemBrief listingItemBrief, LifecycleCoroutineScope lifecycleCoroutineScope, jj.b bVar, ListingsService listingsService, RecommendService recommendService, RegionsRepository regionsRepository, TranslationRepository translationRepository, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, LocationRepository locationRepository, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, com.forsale.app.utils.analytics.g gVar, GAMRepository gAMRepository, ApplicationResourcesRepository applicationResourcesRepository, UserProfileInteractor userProfileInteractor, DynamicLinksUtils dynamicLinksUtils, fj.b bVar2) {
        return new ListingDetailsRepository(i11, str, listingItemBrief, lifecycleCoroutineScope, bVar, listingsService, recommendService, regionsRepository, translationRepository, categoriesRepositories, districtsRepository, locationRepository, aggregatedAllAnalyticsLogger, gVar, gAMRepository, applicationResourcesRepository, userProfileInteractor, dynamicLinksUtils, bVar2);
    }
}
