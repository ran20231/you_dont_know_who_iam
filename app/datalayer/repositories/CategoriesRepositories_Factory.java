package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class CategoriesRepositories_Factory implements dagger.internal.b<CategoriesRepositories> {
    private final vz.a<CategoryDao> categoryDaoProvider;
    private final vz.a<CategoryDistrictDao> categoryDistrictDaoProvider;
    private final vz.a<CategoryWithSubCategoriesDao> categoryWithSubCategoriesDaoProvider;
    private final vz.a<MasterDataRepository> masterDataRepositoryProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;

    public CategoriesRepositories_Factory(vz.a<CategoryWithSubCategoriesDao> aVar, vz.a<CategoryDao> aVar2, vz.a<RegionsRepository> aVar3, vz.a<CategoryDistrictDao> aVar4, vz.a<MasterDataRepository> aVar5) {
        this.categoryWithSubCategoriesDaoProvider = aVar;
        this.categoryDaoProvider = aVar2;
        this.regionsRepositoryProvider = aVar3;
        this.categoryDistrictDaoProvider = aVar4;
        this.masterDataRepositoryProvider = aVar5;
    }

    public static CategoriesRepositories_Factory create(vz.a<CategoryWithSubCategoriesDao> aVar, vz.a<CategoryDao> aVar2, vz.a<RegionsRepository> aVar3, vz.a<CategoryDistrictDao> aVar4, vz.a<MasterDataRepository> aVar5) {
        return new CategoriesRepositories_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static CategoriesRepositories newInstance(CategoryWithSubCategoriesDao categoryWithSubCategoriesDao, CategoryDao categoryDao, RegionsRepository regionsRepository, CategoryDistrictDao categoryDistrictDao, MasterDataRepository masterDataRepository) {
        return new CategoriesRepositories(categoryWithSubCategoriesDao, categoryDao, regionsRepository, categoryDistrictDao, masterDataRepository);
    }

    @Override // vz.a
    public CategoriesRepositories get() {
        return newInstance(this.categoryWithSubCategoriesDaoProvider.get(), this.categoryDaoProvider.get(), this.regionsRepositoryProvider.get(), this.categoryDistrictDaoProvider.get(), this.masterDataRepositoryProvider.get());
    }
}
