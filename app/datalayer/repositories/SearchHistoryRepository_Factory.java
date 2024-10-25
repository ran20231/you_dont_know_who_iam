package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class SearchHistoryRepository_Factory implements dagger.internal.b<SearchHistoryRepository> {
    private final vz.a<CategoriesRepositories> categoriesRepositoriesProvider;
    private final vz.a<SearchHistoryDao> searchHistoryDaoProvider;

    public SearchHistoryRepository_Factory(vz.a<SearchHistoryDao> aVar, vz.a<CategoriesRepositories> aVar2) {
        this.searchHistoryDaoProvider = aVar;
        this.categoriesRepositoriesProvider = aVar2;
    }

    public static SearchHistoryRepository_Factory create(vz.a<SearchHistoryDao> aVar, vz.a<CategoriesRepositories> aVar2) {
        return new SearchHistoryRepository_Factory(aVar, aVar2);
    }

    public static SearchHistoryRepository newInstance(SearchHistoryDao searchHistoryDao, CategoriesRepositories categoriesRepositories) {
        return new SearchHistoryRepository(searchHistoryDao, categoriesRepositories);
    }

    @Override // vz.a
    public SearchHistoryRepository get() {
        return newInstance(this.searchHistoryDaoProvider.get(), this.categoriesRepositoriesProvider.get());
    }
}
