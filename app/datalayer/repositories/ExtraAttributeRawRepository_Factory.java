package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class ExtraAttributeRawRepository_Factory implements dagger.internal.b<ExtraAttributeRawRepository> {
    private final vz.a<ExtraAttributeOptionDao> extraAttributeOptionDaoProvider;
    private final vz.a<ExtraAttributeRawDao> extraAttributeRawDaoProvider;

    public ExtraAttributeRawRepository_Factory(vz.a<ExtraAttributeRawDao> aVar, vz.a<ExtraAttributeOptionDao> aVar2) {
        this.extraAttributeRawDaoProvider = aVar;
        this.extraAttributeOptionDaoProvider = aVar2;
    }

    public static ExtraAttributeRawRepository_Factory create(vz.a<ExtraAttributeRawDao> aVar, vz.a<ExtraAttributeOptionDao> aVar2) {
        return new ExtraAttributeRawRepository_Factory(aVar, aVar2);
    }

    public static ExtraAttributeRawRepository newInstance(ExtraAttributeRawDao extraAttributeRawDao, ExtraAttributeOptionDao extraAttributeOptionDao) {
        return new ExtraAttributeRawRepository(extraAttributeRawDao, extraAttributeOptionDao);
    }

    @Override // vz.a
    public ExtraAttributeRawRepository get() {
        return newInstance(this.extraAttributeRawDaoProvider.get(), this.extraAttributeOptionDaoProvider.get());
    }
}
