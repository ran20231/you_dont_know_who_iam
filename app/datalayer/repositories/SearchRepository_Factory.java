package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class SearchRepository_Factory implements dagger.internal.b<SearchRepository> {

    /* loaded from: classes2.dex */
    private static final class InstanceHolder {
        private static final SearchRepository_Factory INSTANCE = new SearchRepository_Factory();

        private InstanceHolder() {
        }
    }

    public static SearchRepository_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SearchRepository newInstance() {
        return new SearchRepository();
    }

    @Override // vz.a
    public SearchRepository get() {
        return newInstance();
    }
}
