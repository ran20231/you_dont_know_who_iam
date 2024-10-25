package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class ExtraAttributesRepository_Factory implements dagger.internal.b<ExtraAttributesRepository> {
    private final vz.a<ExtraAttributeDao> extraAttributeDaoProvider;

    public ExtraAttributesRepository_Factory(vz.a<ExtraAttributeDao> aVar) {
        this.extraAttributeDaoProvider = aVar;
    }

    public static ExtraAttributesRepository_Factory create(vz.a<ExtraAttributeDao> aVar) {
        return new ExtraAttributesRepository_Factory(aVar);
    }

    public static ExtraAttributesRepository newInstance(ExtraAttributeDao extraAttributeDao) {
        return new ExtraAttributesRepository(extraAttributeDao);
    }

    @Override // vz.a
    public ExtraAttributesRepository get() {
        return newInstance(this.extraAttributeDaoProvider.get());
    }
}
