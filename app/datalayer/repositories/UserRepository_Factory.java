package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.AuthService;
/* loaded from: classes2.dex */
public final class UserRepository_Factory implements dagger.internal.b<UserRepository> {
    private final vz.a<AuthService> authServiceProvider;
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<UserDao> userDaoProvider;

    public UserRepository_Factory(vz.a<UserDao> aVar, vz.a<AuthService> aVar2, vz.a<jj.b> aVar3) {
        this.userDaoProvider = aVar;
        this.authServiceProvider = aVar2;
        this.prefsProvider = aVar3;
    }

    public static UserRepository_Factory create(vz.a<UserDao> aVar, vz.a<AuthService> aVar2, vz.a<jj.b> aVar3) {
        return new UserRepository_Factory(aVar, aVar2, aVar3);
    }

    public static UserRepository newInstance(UserDao userDao, AuthService authService, jj.b bVar) {
        return new UserRepository(userDao, authService, bVar);
    }

    @Override // vz.a
    public UserRepository get() {
        return newInstance(this.userDaoProvider.get(), this.authServiceProvider.get(), this.prefsProvider.get());
    }
}
