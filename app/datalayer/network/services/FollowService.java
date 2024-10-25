package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.FollowBody;
import com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import i10.a;
import i10.o;
/* compiled from: FollowService.kt */
/* loaded from: classes2.dex */
public interface FollowService {
    @o("Follow/getMyFollowers")
    Object getMyFollowers(@a FollowBody followBody, zz.a<? super FollowResponse> aVar);

    @o("Follow/getMyFollowing")
    Object getMyFollowing(@a FollowBody followBody, zz.a<? super FollowResponse> aVar);

    @o("Follow/userFollowToggle")
    Object userFollowToggle(@a FollowToggleBody followToggleBody, zz.a<? super Boolean> aVar);
}
