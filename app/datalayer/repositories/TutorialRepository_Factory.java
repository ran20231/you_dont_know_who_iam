package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class TutorialRepository_Factory implements dagger.internal.b<TutorialRepository> {
    private final vz.a<ApplicationResourcesRepository> resourcesRepositoryProvider;

    public TutorialRepository_Factory(vz.a<ApplicationResourcesRepository> aVar) {
        this.resourcesRepositoryProvider = aVar;
    }

    public static TutorialRepository_Factory create(vz.a<ApplicationResourcesRepository> aVar) {
        return new TutorialRepository_Factory(aVar);
    }

    public static TutorialRepository newInstance(ApplicationResourcesRepository applicationResourcesRepository) {
        return new TutorialRepository(applicationResourcesRepository);
    }

    @Override // vz.a
    public TutorialRepository get() {
        return newInstance(this.resourcesRepositoryProvider.get());
    }
}
