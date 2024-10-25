package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class DistrictsRepository_Factory implements dagger.internal.b<DistrictsRepository> {
    private final vz.a<DistrictDao> districtDaoProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;

    public DistrictsRepository_Factory(vz.a<DistrictDao> aVar, vz.a<RegionsRepository> aVar2) {
        this.districtDaoProvider = aVar;
        this.regionsRepositoryProvider = aVar2;
    }

    public static DistrictsRepository_Factory create(vz.a<DistrictDao> aVar, vz.a<RegionsRepository> aVar2) {
        return new DistrictsRepository_Factory(aVar, aVar2);
    }

    public static DistrictsRepository newInstance(DistrictDao districtDao, RegionsRepository regionsRepository) {
        return new DistrictsRepository(districtDao, regionsRepository);
    }

    @Override // vz.a
    public DistrictsRepository get() {
        return newInstance(this.districtDaoProvider.get(), this.regionsRepositoryProvider.get());
    }
}
