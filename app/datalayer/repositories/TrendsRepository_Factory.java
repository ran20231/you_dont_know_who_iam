package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.AppCacheDatabase;
import com.forsale.app.datalayer.network.services.TrendsServices;
/* loaded from: classes2.dex */
public final class TrendsRepository_Factory implements dagger.internal.b<TrendsRepository> {
    private final vz.a<AppCacheDatabase> appCacheDatabaseProvider;
    private final vz.a<TrendDao> trendDaoProvider;
    private final vz.a<TrendsServices> trendsServicesProvider;

    public TrendsRepository_Factory(vz.a<TrendsServices> aVar, vz.a<TrendDao> aVar2, vz.a<AppCacheDatabase> aVar3) {
        this.trendsServicesProvider = aVar;
        this.trendDaoProvider = aVar2;
        this.appCacheDatabaseProvider = aVar3;
    }

    public static TrendsRepository_Factory create(vz.a<TrendsServices> aVar, vz.a<TrendDao> aVar2, vz.a<AppCacheDatabase> aVar3) {
        return new TrendsRepository_Factory(aVar, aVar2, aVar3);
    }

    public static TrendsRepository newInstance(TrendsServices trendsServices, TrendDao trendDao, AppCacheDatabase appCacheDatabase) {
        return new TrendsRepository(trendsServices, trendDao, appCacheDatabase);
    }

    @Override // vz.a
    public TrendsRepository get() {
        return newInstance(this.trendsServicesProvider.get(), this.trendDaoProvider.get(), this.appCacheDatabaseProvider.get());
    }
}
