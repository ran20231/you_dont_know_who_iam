package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.SupportService;
/* loaded from: classes2.dex */
public final class SupportRepository_Factory implements dagger.internal.b<SupportRepository> {
    private final vz.a<ApplicationResourcesRepository> applicationResourcesRepositoryProvider;
    private final vz.a<jj.b> prefsProvider;
    private final vz.a<SupportService> supportServiceProvider;

    public SupportRepository_Factory(vz.a<SupportService> aVar, vz.a<ApplicationResourcesRepository> aVar2, vz.a<jj.b> aVar3) {
        this.supportServiceProvider = aVar;
        this.applicationResourcesRepositoryProvider = aVar2;
        this.prefsProvider = aVar3;
    }

    public static SupportRepository_Factory create(vz.a<SupportService> aVar, vz.a<ApplicationResourcesRepository> aVar2, vz.a<jj.b> aVar3) {
        return new SupportRepository_Factory(aVar, aVar2, aVar3);
    }

    public static SupportRepository newInstance(SupportService supportService, ApplicationResourcesRepository applicationResourcesRepository, jj.b bVar) {
        return new SupportRepository(supportService, applicationResourcesRepository, bVar);
    }

    @Override // vz.a
    public SupportRepository get() {
        return newInstance(this.supportServiceProvider.get(), this.applicationResourcesRepositoryProvider.get(), this.prefsProvider.get());
    }
}
