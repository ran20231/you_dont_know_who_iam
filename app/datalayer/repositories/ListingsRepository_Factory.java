package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.AdvancedSearchService;
import com.forsale.app.datalayer.network.services.FavoritesService;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.MyListingsService;
/* loaded from: classes2.dex */
public final class ListingsRepository_Factory implements dagger.internal.b<ListingsRepository> {
    private final vz.a<AdvancedSearchService> advancedSearchServiceProvider;
    private final vz.a<CategoriesRepositories> categoriesRepositoriesProvider;
    private final vz.a<ExtraAttributeRawRepository> extraAttributeRawRepositoryProvider;
    private final vz.a<ExtraAttributesRepository> extraAttributesRepositoryProvider;
    private final vz.a<FavoritesService> favoritesServiceProvider;
    private final vz.a<ItemSubscriptionsService> itemSubscriptionsServiceProvider;
    private final vz.a<ListingsService> listingsServiceProvider;
    private final vz.a<MyListingsService> myListingsServiceProvider;
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<RegionsRepository> regionRepositoryProvider;
    private final vz.a<TranslationRepository> translationRepositoryProvider;

    public ListingsRepository_Factory(vz.a<ListingsService> aVar, vz.a<FavoritesService> aVar2, vz.a<MyListingsService> aVar3, vz.a<AdvancedSearchService> aVar4, vz.a<ItemSubscriptionsService> aVar5, vz.a<RegionsRepository> aVar6, vz.a<TranslationRepository> aVar7, vz.a<CategoriesRepositories> aVar8, vz.a<jj.b> aVar9, vz.a<ExtraAttributesRepository> aVar10, vz.a<ExtraAttributeRawRepository> aVar11) {
        this.listingsServiceProvider = aVar;
        this.favoritesServiceProvider = aVar2;
        this.myListingsServiceProvider = aVar3;
        this.advancedSearchServiceProvider = aVar4;
        this.itemSubscriptionsServiceProvider = aVar5;
        this.regionRepositoryProvider = aVar6;
        this.translationRepositoryProvider = aVar7;
        this.categoriesRepositoriesProvider = aVar8;
        this.prefsProvider = aVar9;
        this.extraAttributesRepositoryProvider = aVar10;
        this.extraAttributeRawRepositoryProvider = aVar11;
    }

    public static ListingsRepository_Factory create(vz.a<ListingsService> aVar, vz.a<FavoritesService> aVar2, vz.a<MyListingsService> aVar3, vz.a<AdvancedSearchService> aVar4, vz.a<ItemSubscriptionsService> aVar5, vz.a<RegionsRepository> aVar6, vz.a<TranslationRepository> aVar7, vz.a<CategoriesRepositories> aVar8, vz.a<jj.b> aVar9, vz.a<ExtraAttributesRepository> aVar10, vz.a<ExtraAttributeRawRepository> aVar11) {
        return new ListingsRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static ListingsRepository newInstance(ListingsService listingsService, FavoritesService favoritesService, MyListingsService myListingsService, AdvancedSearchService advancedSearchService, ItemSubscriptionsService itemSubscriptionsService, RegionsRepository regionsRepository, TranslationRepository translationRepository, CategoriesRepositories categoriesRepositories, jj.b bVar, ExtraAttributesRepository extraAttributesRepository, ExtraAttributeRawRepository extraAttributeRawRepository) {
        return new ListingsRepository(listingsService, favoritesService, myListingsService, advancedSearchService, itemSubscriptionsService, regionsRepository, translationRepository, categoriesRepositories, bVar, extraAttributesRepository, extraAttributeRawRepository);
    }

    @Override // vz.a
    public ListingsRepository get() {
        return newInstance(this.listingsServiceProvider.get(), this.favoritesServiceProvider.get(), this.myListingsServiceProvider.get(), this.advancedSearchServiceProvider.get(), this.itemSubscriptionsServiceProvider.get(), this.regionRepositoryProvider.get(), this.translationRepositoryProvider.get(), this.categoriesRepositoriesProvider.get(), this.prefsProvider.get(), this.extraAttributesRepositoryProvider.get(), this.extraAttributeRawRepositoryProvider.get());
    }
}
