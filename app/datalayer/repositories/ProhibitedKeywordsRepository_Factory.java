package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class ProhibitedKeywordsRepository_Factory implements dagger.internal.b<ProhibitedKeywordsRepository> {
    private final vz.a<ProhibitedKeywordDao> prohibitedKeywordsDAOProvider;

    public ProhibitedKeywordsRepository_Factory(vz.a<ProhibitedKeywordDao> aVar) {
        this.prohibitedKeywordsDAOProvider = aVar;
    }

    public static ProhibitedKeywordsRepository_Factory create(vz.a<ProhibitedKeywordDao> aVar) {
        return new ProhibitedKeywordsRepository_Factory(aVar);
    }

    public static ProhibitedKeywordsRepository newInstance(ProhibitedKeywordDao prohibitedKeywordDao) {
        return new ProhibitedKeywordsRepository(prohibitedKeywordDao);
    }

    @Override // vz.a
    public ProhibitedKeywordsRepository get() {
        return newInstance(this.prohibitedKeywordsDAOProvider.get());
    }
}
