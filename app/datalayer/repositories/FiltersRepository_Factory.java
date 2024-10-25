package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class FiltersRepository_Factory implements dagger.internal.b<FiltersRepository> {
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<RecentFilterLocationsDao> recentLocationDaoProvider;

    public FiltersRepository_Factory(vz.a<jj.b> aVar, vz.a<RecentFilterLocationsDao> aVar2) {
        this.prefsProvider = aVar;
        this.recentLocationDaoProvider = aVar2;
    }

    public static FiltersRepository_Factory create(vz.a<jj.b> aVar, vz.a<RecentFilterLocationsDao> aVar2) {
        return new FiltersRepository_Factory(aVar, aVar2);
    }

    public static FiltersRepository newInstance(jj.b bVar, RecentFilterLocationsDao recentFilterLocationsDao) {
        return new FiltersRepository(bVar, recentFilterLocationsDao);
    }

    @Override // vz.a
    public FiltersRepository get() {
        return newInstance(this.prefsProvider.get(), this.recentLocationDaoProvider.get());
    }
}
