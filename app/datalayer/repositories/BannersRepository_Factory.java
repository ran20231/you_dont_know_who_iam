package com.forsale.app.datalayer.repositories;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
/* loaded from: classes2.dex */
public final class BannersRepository_Factory implements dagger.internal.b<BannersRepository> {
    private final vz.a<BannerFactory> bannerFactoryProvider;
    private final vz.a<RegionsRepository> regionsRepositoryProvider;

    public BannersRepository_Factory(vz.a<RegionsRepository> aVar, vz.a<BannerFactory> aVar2) {
        this.regionsRepositoryProvider = aVar;
        this.bannerFactoryProvider = aVar2;
    }

    public static BannersRepository_Factory create(vz.a<RegionsRepository> aVar, vz.a<BannerFactory> aVar2) {
        return new BannersRepository_Factory(aVar, aVar2);
    }

    public static BannersRepository newInstance(RegionsRepository regionsRepository, BannerFactory bannerFactory) {
        return new BannersRepository(regionsRepository, bannerFactory);
    }

    @Override // vz.a
    public BannersRepository get() {
        return newInstance(this.regionsRepositoryProvider.get(), this.bannerFactoryProvider.get());
    }
}
