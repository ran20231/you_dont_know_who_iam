package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class PostAdAnonymousRepository_Factory implements dagger.internal.b<PostAdAnonymousRepository> {
    private final vz.a<jj.b> spUtilsProvider;

    public PostAdAnonymousRepository_Factory(vz.a<jj.b> aVar) {
        this.spUtilsProvider = aVar;
    }

    public static PostAdAnonymousRepository_Factory create(vz.a<jj.b> aVar) {
        return new PostAdAnonymousRepository_Factory(aVar);
    }

    public static PostAdAnonymousRepository newInstance(jj.b bVar) {
        return new PostAdAnonymousRepository(bVar);
    }

    @Override // vz.a
    public PostAdAnonymousRepository get() {
        return newInstance(this.spUtilsProvider.get());
    }
}
