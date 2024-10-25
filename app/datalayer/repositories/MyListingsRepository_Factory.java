package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.MyListingsService;
/* loaded from: classes2.dex */
public final class MyListingsRepository_Factory implements dagger.internal.b<MyListingsRepository> {
    private final vz.a<ListingDetailsEntityRepository> listingDetailsEntityRepositoryProvider;
    private final vz.a<MyListingsService> myListingsServiceProvider;

    public MyListingsRepository_Factory(vz.a<MyListingsService> aVar, vz.a<ListingDetailsEntityRepository> aVar2) {
        this.myListingsServiceProvider = aVar;
        this.listingDetailsEntityRepositoryProvider = aVar2;
    }

    public static MyListingsRepository_Factory create(vz.a<MyListingsService> aVar, vz.a<ListingDetailsEntityRepository> aVar2) {
        return new MyListingsRepository_Factory(aVar, aVar2);
    }

    public static MyListingsRepository newInstance(MyListingsService myListingsService, ListingDetailsEntityRepository listingDetailsEntityRepository) {
        return new MyListingsRepository(myListingsService, listingDetailsEntityRepository);
    }

    @Override // vz.a
    public MyListingsRepository get() {
        return newInstance(this.myListingsServiceProvider.get(), this.listingDetailsEntityRepositoryProvider.get());
    }
}
