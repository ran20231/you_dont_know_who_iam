package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.FollowService;
/* loaded from: classes2.dex */
public final class FollowAndFollowingRepository_Factory implements dagger.internal.b<FollowAndFollowingRepository> {
    private final vz.a<FollowService> followServiceProvider;

    public FollowAndFollowingRepository_Factory(vz.a<FollowService> aVar) {
        this.followServiceProvider = aVar;
    }

    public static FollowAndFollowingRepository_Factory create(vz.a<FollowService> aVar) {
        return new FollowAndFollowingRepository_Factory(aVar);
    }

    public static FollowAndFollowingRepository newInstance(FollowService followService) {
        return new FollowAndFollowingRepository(followService);
    }

    @Override // vz.a
    public FollowAndFollowingRepository get() {
        return newInstance(this.followServiceProvider.get());
    }
}
