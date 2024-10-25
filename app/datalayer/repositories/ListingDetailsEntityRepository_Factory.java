package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class ListingDetailsEntityRepository_Factory implements dagger.internal.b<ListingDetailsEntityRepository> {
    private final vz.a<ListingDetailsEntityDao> listingDetailsEntityDaoProvider;

    public ListingDetailsEntityRepository_Factory(vz.a<ListingDetailsEntityDao> aVar) {
        this.listingDetailsEntityDaoProvider = aVar;
    }

    public static ListingDetailsEntityRepository_Factory create(vz.a<ListingDetailsEntityDao> aVar) {
        return new ListingDetailsEntityRepository_Factory(aVar);
    }

    public static ListingDetailsEntityRepository newInstance(ListingDetailsEntityDao listingDetailsEntityDao) {
        return new ListingDetailsEntityRepository(listingDetailsEntityDao);
    }

    @Override // vz.a
    public ListingDetailsEntityRepository get() {
        return newInstance(this.listingDetailsEntityDaoProvider.get());
    }
}
