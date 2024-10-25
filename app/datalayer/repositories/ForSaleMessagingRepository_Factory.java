package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.facades.user.UserProfileInteractor;
/* loaded from: classes2.dex */
public final class ForSaleMessagingRepository_Factory implements dagger.internal.b<ForSaleMessagingRepository> {
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<UserProfileInteractor> userProfileInteractorProvider;

    public ForSaleMessagingRepository_Factory(vz.a<jj.b> aVar, vz.a<UserProfileInteractor> aVar2) {
        this.prefsProvider = aVar;
        this.userProfileInteractorProvider = aVar2;
    }

    public static ForSaleMessagingRepository_Factory create(vz.a<jj.b> aVar, vz.a<UserProfileInteractor> aVar2) {
        return new ForSaleMessagingRepository_Factory(aVar, aVar2);
    }

    public static ForSaleMessagingRepository newInstance(jj.b bVar, UserProfileInteractor userProfileInteractor) {
        return new ForSaleMessagingRepository(bVar, userProfileInteractor);
    }

    @Override // vz.a
    public ForSaleMessagingRepository get() {
        return newInstance(this.prefsProvider.get(), this.userProfileInteractorProvider.get());
    }
}
