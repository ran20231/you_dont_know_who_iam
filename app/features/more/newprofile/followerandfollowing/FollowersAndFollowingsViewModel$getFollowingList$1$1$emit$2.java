package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.forsale.app.datalayer.network.responses.FollowResponse;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2", f = "FollowersAndFollowingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2 extends SuspendLambda implements p<FollowResponse.User, zz.a<? super yd.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32216a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32217b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2(zz.a<? super FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2> aVar) {
        super(2, aVar);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(FollowResponse.User user, zz.a<? super yd.a> aVar) {
        return ((FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2) create(user, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2 followersAndFollowingsViewModel$getFollowingList$1$1$emit$2 = new FollowersAndFollowingsViewModel$getFollowingList$1$1$emit$2(aVar);
        followersAndFollowingsViewModel$getFollowingList$1$1$emit$2.f32217b = obj;
        return followersAndFollowingsViewModel$getFollowingList$1$1$emit$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f32216a == 0) {
            f.b(obj);
            return ((FollowResponse.User) this.f32217b).toUserItemUiModel();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
