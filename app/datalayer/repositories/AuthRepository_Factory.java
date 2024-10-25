package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.AuthService;
/* loaded from: classes2.dex */
public final class AuthRepository_Factory implements dagger.internal.b<AuthRepository> {
    private final vz.a<AuthService> authServiceProvider;
    private final vz.a<jj.b> preferencesProvider;

    public AuthRepository_Factory(vz.a<AuthService> aVar, vz.a<jj.b> aVar2) {
        this.authServiceProvider = aVar;
        this.preferencesProvider = aVar2;
    }

    public static AuthRepository_Factory create(vz.a<AuthService> aVar, vz.a<jj.b> aVar2) {
        return new AuthRepository_Factory(aVar, aVar2);
    }

    public static AuthRepository newInstance(AuthService authService, jj.b bVar) {
        return new AuthRepository(authService, bVar);
    }

    @Override // vz.a
    public AuthRepository get() {
        return newInstance(this.authServiceProvider.get(), this.preferencesProvider.get());
    }
}
