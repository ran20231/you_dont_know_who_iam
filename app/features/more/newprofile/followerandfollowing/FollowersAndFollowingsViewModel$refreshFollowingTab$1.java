package com.forsale.app.features.more.newprofile.followerandfollowing;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$refreshFollowingTab$1", f = "FollowersAndFollowingsViewModel.kt", l = {133, 134, 135}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$refreshFollowingTab$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32247a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32248b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f32249c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$refreshFollowingTab$1(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, boolean z11, zz.a<? super FollowersAndFollowingsViewModel$refreshFollowingTab$1> aVar) {
        super(2, aVar);
        this.f32248b = followersAndFollowingsViewModel;
        this.f32249c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$refreshFollowingTab$1(this.f32248b, this.f32249c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f32247a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.f.b(r7)
            goto L64
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.f.b(r7)
            goto L51
        L22:
            kotlin.f.b(r7)
            goto L3e
        L26:
            kotlin.f.b(r7)
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r7 = r6.f32248b
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.q(r7)
            boolean r1 = r6.f32249c
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
            r6.f32247a = r5
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r7 = r6.f32248b
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.v(r7)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r2)
            r6.f32247a = r4
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L51
            return r0
        L51:
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r7 = r6.f32248b
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.t(r7)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r2)
            r6.f32247a = r3
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L64
            return r0
        L64:
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r7 = r6.f32248b
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.h(r7)
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$refreshFollowingTab$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$refreshFollowingTab$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
