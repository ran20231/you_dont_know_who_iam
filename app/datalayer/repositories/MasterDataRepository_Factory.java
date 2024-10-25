package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.AppCacheDatabase;
import com.forsale.app.datalayer.database.MasterDataDatabase;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao;
import com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao;
import com.forsale.app.datalayer.network.services.MasterDataService;
import kotlinx.coroutines.CoroutineDispatcher;
/* loaded from: classes2.dex */
public final class MasterDataRepository_Factory implements dagger.internal.b<MasterDataRepository> {
    private final vz.a<AgentDao> agentDaoProvider;
    private final vz.a<AgentLocationDao> agentLocationDaoProvider;
    private final vz.a<AppCacheDatabase> appCacheDatabaseProvider;
    private final vz.a<BottomTipDao> bottomTipDaoProvider;
    private final vz.a<CategoryDao> categoryDaoProvider;
    private final vz.a<CategoryDistrictDao> categoryDistrictsDaoProvider;
    private final vz.a<CategoryExtraAttributeDao> categoryExtraAttributeDaoProvider;
    private final vz.a<DirectoryCategoryDao> directoryCategoryDaoProvider;
    private final vz.a<DistrictDao> districtDaoProvider;
    private final vz.a<ExtraAttributeDao> extraAttributeDaoProvider;
    private final vz.a<ExtraAttributeGroupDao> extraAttributeGroupDaoProvider;
    private final vz.a<ExtraAttributeOptionDao> extraAttributeOptionDaoProvider;
    private final vz.a<ImagesRepository> imagesRepositoryProvider;
    private final vz.a<CoroutineDispatcher> ioDispatcherProvider;
    private final vz.a<ListingDetailsEntityRepository> listingDetailsEntityRepositoryProvider;
    private final vz.a<LocationDao> locationDaoProvider;
    private final vz.a<MasterDataDatabase> masterDataDatabaseProvider;
    private final vz.a<MasterDataService> masterDataServiceProvider;
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<ProhibitedKeywordDao> prohibitedKeywordDaoProvider;
    private final vz.a<RegionDao> regionDaoProvider;

    public MasterDataRepository_Factory(vz.a<jj.b> aVar, vz.a<MasterDataDatabase> aVar2, vz.a<AppCacheDatabase> aVar3, vz.a<MasterDataService> aVar4, vz.a<CategoryDao> aVar5, vz.a<ExtraAttributeDao> aVar6, vz.a<ExtraAttributeGroupDao> aVar7, vz.a<ExtraAttributeOptionDao> aVar8, vz.a<CategoryExtraAttributeDao> aVar9, vz.a<AgentDao> aVar10, vz.a<LocationDao> aVar11, vz.a<AgentLocationDao> aVar12, vz.a<RegionDao> aVar13, vz.a<DistrictDao> aVar14, vz.a<ProhibitedKeywordDao> aVar15, vz.a<DirectoryCategoryDao> aVar16, vz.a<CategoryDistrictDao> aVar17, vz.a<BottomTipDao> aVar18, vz.a<ImagesRepository> aVar19, vz.a<ListingDetailsEntityRepository> aVar20, vz.a<CoroutineDispatcher> aVar21) {
        this.prefsProvider = aVar;
        this.masterDataDatabaseProvider = aVar2;
        this.appCacheDatabaseProvider = aVar3;
        this.masterDataServiceProvider = aVar4;
        this.categoryDaoProvider = aVar5;
        this.extraAttributeDaoProvider = aVar6;
        this.extraAttributeGroupDaoProvider = aVar7;
        this.extraAttributeOptionDaoProvider = aVar8;
        this.categoryExtraAttributeDaoProvider = aVar9;
        this.agentDaoProvider = aVar10;
        this.locationDaoProvider = aVar11;
        this.agentLocationDaoProvider = aVar12;
        this.regionDaoProvider = aVar13;
        this.districtDaoProvider = aVar14;
        this.prohibitedKeywordDaoProvider = aVar15;
        this.directoryCategoryDaoProvider = aVar16;
        this.categoryDistrictsDaoProvider = aVar17;
        this.bottomTipDaoProvider = aVar18;
        this.imagesRepositoryProvider = aVar19;
        this.listingDetailsEntityRepositoryProvider = aVar20;
        this.ioDispatcherProvider = aVar21;
    }

    public static MasterDataRepository_Factory create(vz.a<jj.b> aVar, vz.a<MasterDataDatabase> aVar2, vz.a<AppCacheDatabase> aVar3, vz.a<MasterDataService> aVar4, vz.a<CategoryDao> aVar5, vz.a<ExtraAttributeDao> aVar6, vz.a<ExtraAttributeGroupDao> aVar7, vz.a<ExtraAttributeOptionDao> aVar8, vz.a<CategoryExtraAttributeDao> aVar9, vz.a<AgentDao> aVar10, vz.a<LocationDao> aVar11, vz.a<AgentLocationDao> aVar12, vz.a<RegionDao> aVar13, vz.a<DistrictDao> aVar14, vz.a<ProhibitedKeywordDao> aVar15, vz.a<DirectoryCategoryDao> aVar16, vz.a<CategoryDistrictDao> aVar17, vz.a<BottomTipDao> aVar18, vz.a<ImagesRepository> aVar19, vz.a<ListingDetailsEntityRepository> aVar20, vz.a<CoroutineDispatcher> aVar21) {
        return new MasterDataRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21);
    }

    public static MasterDataRepository newInstance(jj.b bVar, MasterDataDatabase masterDataDatabase, AppCacheDatabase appCacheDatabase, MasterDataService masterDataService, CategoryDao categoryDao, ExtraAttributeDao extraAttributeDao, ExtraAttributeGroupDao extraAttributeGroupDao, ExtraAttributeOptionDao extraAttributeOptionDao, CategoryExtraAttributeDao categoryExtraAttributeDao, AgentDao agentDao, LocationDao locationDao, AgentLocationDao agentLocationDao, RegionDao regionDao, DistrictDao districtDao, ProhibitedKeywordDao prohibitedKeywordDao, DirectoryCategoryDao directoryCategoryDao, CategoryDistrictDao categoryDistrictDao, BottomTipDao bottomTipDao, ImagesRepository imagesRepository, ListingDetailsEntityRepository listingDetailsEntityRepository, CoroutineDispatcher coroutineDispatcher) {
        return new MasterDataRepository(bVar, masterDataDatabase, appCacheDatabase, masterDataService, categoryDao, extraAttributeDao, extraAttributeGroupDao, extraAttributeOptionDao, categoryExtraAttributeDao, agentDao, locationDao, agentLocationDao, regionDao, districtDao, prohibitedKeywordDao, directoryCategoryDao, categoryDistrictDao, bottomTipDao, imagesRepository, listingDetailsEntityRepository, coroutineDispatcher);
    }

    @Override // vz.a
    public MasterDataRepository get() {
        return newInstance(this.prefsProvider.get(), this.masterDataDatabaseProvider.get(), this.appCacheDatabaseProvider.get(), this.masterDataServiceProvider.get(), this.categoryDaoProvider.get(), this.extraAttributeDaoProvider.get(), this.extraAttributeGroupDaoProvider.get(), this.extraAttributeOptionDaoProvider.get(), this.categoryExtraAttributeDaoProvider.get(), this.agentDaoProvider.get(), this.locationDaoProvider.get(), this.agentLocationDaoProvider.get(), this.regionDaoProvider.get(), this.districtDaoProvider.get(), this.prohibitedKeywordDaoProvider.get(), this.directoryCategoryDaoProvider.get(), this.categoryDistrictsDaoProvider.get(), this.bottomTipDaoProvider.get(), this.imagesRepositoryProvider.get(), this.listingDetailsEntityRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }
}
