package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.RecommendService;
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository_Factory implements dagger.internal.b<SearchRecommendedListingsRepository> {
    private final vz.a<CategoriesRepositories> categoriesRepositoriesProvider;
    private final vz.a<ListingItemBriefDao> listingItemBriefDaoProvider;
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<RecommendService> recommendServiceProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;
    private final vz.a<TranslationRepository> translationRepositoryProvider;

    public SearchRecommendedListingsRepository_Factory(vz.a<jj.b> aVar, vz.a<RecommendService> aVar2, vz.a<RegionsRepository> aVar3, vz.a<TranslationRepository> aVar4, vz.a<ListingItemBriefDao> aVar5, vz.a<CategoriesRepositories> aVar6) {
        this.prefsProvider = aVar;
        this.recommendServiceProvider = aVar2;
        this.regionsRepositoryProvider = aVar3;
        this.translationRepositoryProvider = aVar4;
        this.listingItemBriefDaoProvider = aVar5;
        this.categoriesRepositoriesProvider = aVar6;
    }

    public static SearchRecommendedListingsRepository_Factory create(vz.a<jj.b> aVar, vz.a<RecommendService> aVar2, vz.a<RegionsRepository> aVar3, vz.a<TranslationRepository> aVar4, vz.a<ListingItemBriefDao> aVar5, vz.a<CategoriesRepositories> aVar6) {
        return new SearchRecommendedListingsRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static SearchRecommendedListingsRepository newInstance(jj.b bVar, RecommendService recommendService, RegionsRepository regionsRepository, TranslationRepository translationRepository, ListingItemBriefDao listingItemBriefDao, CategoriesRepositories categoriesRepositories) {
        return new SearchRecommendedListingsRepository(bVar, recommendService, regionsRepository, translationRepository, listingItemBriefDao, categoriesRepositories);
    }

    @Override // vz.a
    public SearchRecommendedListingsRepository get() {
        return newInstance(this.prefsProvider.get(), this.recommendServiceProvider.get(), this.regionsRepositoryProvider.get(), this.translationRepositoryProvider.get(), this.listingItemBriefDaoProvider.get(), this.categoriesRepositoriesProvider.get());
    }
}
