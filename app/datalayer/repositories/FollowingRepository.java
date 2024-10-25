package com.forsale.app.datalayer.repositories;

import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource;
import d4.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
/* compiled from: FollowingRepository.kt */
/* loaded from: classes2.dex */
public final class FollowingRepository {
    public static final int PAGE_SIZE = 30;
    private final vd.a followersAndFollowingDataSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FollowingRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FollowingRepository(vd.a followersAndFollowingDataSource) {
        o.i(followersAndFollowingDataSource, "followersAndFollowingDataSource");
        this.followersAndFollowingDataSource = followersAndFollowingDataSource;
    }

    public final Flow<PagingData<FollowResponse.User>> geFollowing(final String phone, final boolean z11) {
        o.i(phone, "phone");
        return new Pager(new e0(30, 0, false, 30, 0, 0, 50, null), null, new g00.a<PagingSource<Integer, FollowResponse.User>>() { // from class: com.forsale.app.datalayer.repositories.FollowingRepository$geFollowing$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final PagingSource<Integer, FollowResponse.User> invoke() {
                vd.a aVar;
                String str = phone;
                boolean z12 = z11;
                aVar = this.followersAndFollowingDataSource;
                return new FollowersAndFollowingPagingSource(str, z12, 30, aVar);
            }
        }, 2, null).a();
    }
}
