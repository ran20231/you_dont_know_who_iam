package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class SocialMediaRepository_Factory implements dagger.internal.b<SocialMediaRepository> {
    private final vz.a<jj.b> preferenceProvider;

    public SocialMediaRepository_Factory(vz.a<jj.b> aVar) {
        this.preferenceProvider = aVar;
    }

    public static SocialMediaRepository_Factory create(vz.a<jj.b> aVar) {
        return new SocialMediaRepository_Factory(aVar);
    }

    public static SocialMediaRepository newInstance(jj.b bVar) {
        return new SocialMediaRepository(bVar);
    }

    @Override // vz.a
    public SocialMediaRepository get() {
        return newInstance(this.preferenceProvider.get());
    }
}
