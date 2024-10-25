package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$getFollowingList$1", f = "FollowersAndFollowingsViewModel.kt", l = {100, FacebookMediationAdapter.ERROR_NULL_CONTEXT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$getFollowingList$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32213a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32214b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$getFollowingList$1(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super FollowersAndFollowingsViewModel$getFollowingList$1> aVar) {
        super(2, aVar);
        this.f32214b = followersAndFollowingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$getFollowingList$1(this.f32214b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f32213a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.f.b(r5)
            goto L95
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.f.b(r5)
            goto L43
        L1f:
            kotlin.f.b(r5)
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r5 = r4.f32214b
            kotlinx.coroutines.flow.StateFlow r5 = r5.G()
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L45
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r5 = r4.f32214b
            jj.b r5 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.k(r5)
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r5 = r5.l()
            r4.f32213a = r3
            java.lang.Object r5 = r5.d(r4)
            if (r5 != r0) goto L43
            return r0
        L43:
            java.lang.String r5 = (java.lang.String) r5
        L45:
            if (r5 == 0) goto L95
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r1 = r4.f32214b
            kotlinx.coroutines.flow.StateFlow r3 = r1.J()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.e(r1, r3)
            if (r1 != 0) goto L95
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r1 = r4.f32214b
            xd.b r1 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.j(r1)
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r3 = r4.f32214b
            kotlinx.coroutines.flow.StateFlow r3 = r3.J()
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            kotlinx.coroutines.flow.Flow r5 = r1.a(r3, r5)
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r5)
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r1 = r4.f32214b
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.r0.a(r1)
            kotlinx.coroutines.flow.Flow r5 = androidx.paging.CachedPagingDataKt.a(r5, r1)
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$getFollowingList$1$1 r1 = new com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$getFollowingList$1$1
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r3 = r4.f32214b
            r1.<init>()
            r4.f32213a = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L95
            return r0
        L95:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$getFollowingList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$getFollowingList$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
