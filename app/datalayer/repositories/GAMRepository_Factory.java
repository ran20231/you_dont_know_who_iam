package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class GAMRepository_Factory implements dagger.internal.b<GAMRepository> {
    private final vz.a<fj.b> gamUtilsProvider;

    public GAMRepository_Factory(vz.a<fj.b> aVar) {
        this.gamUtilsProvider = aVar;
    }

    public static GAMRepository_Factory create(vz.a<fj.b> aVar) {
        return new GAMRepository_Factory(aVar);
    }

    public static GAMRepository newInstance(fj.b bVar) {
        return new GAMRepository(bVar);
    }

    @Override // vz.a
    public GAMRepository get() {
        return newInstance(this.gamUtilsProvider.get());
    }
}
