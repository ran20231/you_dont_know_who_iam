package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody;
import com.forsale.app.datalayer.network.services.FollowService;
import kotlin.jvm.internal.o;
/* compiled from: FollowAndFollowingRepository.kt */
/* loaded from: classes2.dex */
public final class FollowAndFollowingRepository {
    public static final int $stable = 8;
    private final FollowService followService;

    public FollowAndFollowingRepository(FollowService followService) {
        o.i(followService, "followService");
        this.followService = followService;
    }

    public final Object follow(String str, String str2, zz.a<? super Boolean> aVar) {
        return this.followService.userFollowToggle(new FollowToggleBody(str, str2, 1), aVar);
    }

    public final Object unfollow(String str, String str2, zz.a<? super Boolean> aVar) {
        return this.followService.userFollowToggle(new FollowToggleBody(str, str2, 0), aVar);
    }
}
