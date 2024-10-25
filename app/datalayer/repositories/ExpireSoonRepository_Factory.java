package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.MyListingsService;
/* loaded from: classes2.dex */
public final class ExpireSoonRepository_Factory implements dagger.internal.b<ExpireSoonRepository> {
    private final vz.a<ListingsService> listingsServiceProvider;
    private final vz.a<MyListingsService> myListingsServiceProvider;

    public ExpireSoonRepository_Factory(vz.a<MyListingsService> aVar, vz.a<ListingsService> aVar2) {
        this.myListingsServiceProvider = aVar;
        this.listingsServiceProvider = aVar2;
    }

    public static ExpireSoonRepository_Factory create(vz.a<MyListingsService> aVar, vz.a<ListingsService> aVar2) {
        return new ExpireSoonRepository_Factory(aVar, aVar2);
    }

    public static ExpireSoonRepository newInstance(MyListingsService myListingsService, ListingsService listingsService) {
        return new ExpireSoonRepository(myListingsService, listingsService);
    }

    @Override // vz.a
    public ExpireSoonRepository get() {
        return newInstance(this.myListingsServiceProvider.get(), this.listingsServiceProvider.get());
    }
}
