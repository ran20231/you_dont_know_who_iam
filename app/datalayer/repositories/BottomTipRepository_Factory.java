package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class BottomTipRepository_Factory implements dagger.internal.b<BottomTipRepository> {
    private final vz.a<BottomTipDao> bottomTipDaoProvider;

    public BottomTipRepository_Factory(vz.a<BottomTipDao> aVar) {
        this.bottomTipDaoProvider = aVar;
    }

    public static BottomTipRepository_Factory create(vz.a<BottomTipDao> aVar) {
        return new BottomTipRepository_Factory(aVar);
    }

    public static BottomTipRepository newInstance(BottomTipDao bottomTipDao) {
        return new BottomTipRepository(bottomTipDao);
    }

    @Override // vz.a
    public BottomTipRepository get() {
        return newInstance(this.bottomTipDaoProvider.get());
    }
}
