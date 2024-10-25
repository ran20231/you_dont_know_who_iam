package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.UserService;
/* loaded from: classes2.dex */
public final class UserActivityRepository_Factory implements dagger.internal.b<UserActivityRepository> {
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<UserService> userServiceProvider;

    public UserActivityRepository_Factory(vz.a<jj.b> aVar, vz.a<UserService> aVar2) {
        this.prefsProvider = aVar;
        this.userServiceProvider = aVar2;
    }

    public static UserActivityRepository_Factory create(vz.a<jj.b> aVar, vz.a<UserService> aVar2) {
        return new UserActivityRepository_Factory(aVar, aVar2);
    }

    public static UserActivityRepository newInstance(jj.b bVar, UserService userService) {
        return new UserActivityRepository(bVar, userService);
    }

    @Override // vz.a
    public UserActivityRepository get() {
        return newInstance(this.prefsProvider.get(), this.userServiceProvider.get());
    }
}
