package com.forsale.app.datalayer.repositories;
/* loaded from: classes2.dex */
public final class FollowingRepository_Factory implements dagger.internal.b<FollowingRepository> {
    private final vz.a<vd.a> followersAndFollowingDataSourceProvider;

    public FollowingRepository_Factory(vz.a<vd.a> aVar) {
        this.followersAndFollowingDataSourceProvider = aVar;
    }

    public static FollowingRepository_Factory create(vz.a<vd.a> aVar) {
        return new FollowingRepository_Factory(aVar);
    }

    public static FollowingRepository newInstance(vd.a aVar) {
        return new FollowingRepository(aVar);
    }

    @Override // vz.a
    public FollowingRepository get() {
        return newInstance(this.followersAndFollowingDataSourceProvider.get());
    }
}
