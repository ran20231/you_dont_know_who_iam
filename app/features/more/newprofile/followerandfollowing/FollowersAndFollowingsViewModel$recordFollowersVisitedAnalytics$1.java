package com.forsale.app.features.more.newprofile.followerandfollowing;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import wd.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1", f = "FollowersAndFollowingsViewModel.kt", l = {270}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32243a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1> aVar) {
        super(2, aVar);
        this.f32244b = followersAndFollowingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1(this.f32244b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32243a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            bVar = this.f32244b.f32191a;
            this.f32243a = 1;
            if (bVar.b(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
