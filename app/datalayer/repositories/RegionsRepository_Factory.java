package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class RegionsRepository_Factory implements dagger.internal.b<RegionsRepository> {
    private final vz.a<jj.b> preferencesProvider;
    private final vz.a<RegionDao> regionDaoProvider;
    private final vz.a<UserDao> userDaoProvider;

    public RegionsRepository_Factory(vz.a<UserDao> aVar, vz.a<RegionDao> aVar2, vz.a<jj.b> aVar3) {
        this.userDaoProvider = aVar;
        this.regionDaoProvider = aVar2;
        this.preferencesProvider = aVar3;
    }

    public static RegionsRepository_Factory create(vz.a<UserDao> aVar, vz.a<RegionDao> aVar2, vz.a<jj.b> aVar3) {
        return new RegionsRepository_Factory(aVar, aVar2, aVar3);
    }

    public static RegionsRepository newInstance(UserDao userDao, RegionDao regionDao, jj.b bVar) {
        return new RegionsRepository(userDao, regionDao, bVar);
    }

    @Override // vz.a
    public RegionsRepository get() {
        return newInstance(this.userDaoProvider.get(), this.regionDaoProvider.get(), this.preferencesProvider.get());
    }
}
