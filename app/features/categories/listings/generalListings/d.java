package com.forsale.app.features.categories.listings.generalListings;

import androidx.lifecycle.k0;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlinx.coroutines.CoroutineDispatcher;
/* compiled from: GeneralListingsViewModel_Factory.java */
/* loaded from: classes2.dex */
public final class d implements dagger.internal.b<GeneralListingsViewModel> {
    public static GeneralListingsViewModel a(ListingsRepository listingsRepository, ApplicationResourcesRepository applicationResourcesRepository, MasterDataRepository masterDataRepository, GAMRepository gAMRepository, fj.b bVar, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, RegionsRepository regionsRepository, CategoriesRepositories categoriesRepositories, k0 k0Var, CoroutineDispatcher coroutineDispatcher, nc.a aVar, jj.b bVar2) {
        return new GeneralListingsViewModel(listingsRepository, applicationResourcesRepository, masterDataRepository, gAMRepository, bVar, aggregatedAllAnalyticsLogger, regionsRepository, categoriesRepositories, k0Var, coroutineDispatcher, aVar, bVar2);
    }
}
