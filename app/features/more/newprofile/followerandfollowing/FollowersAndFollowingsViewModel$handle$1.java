package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.forsale.app.feedback.a;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.q0;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$1", f = "FollowersAndFollowingsViewModel.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$handle$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32220a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$handle$1(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super FollowersAndFollowingsViewModel$handle$1> aVar) {
        super(2, aVar);
        this.f32221b = followersAndFollowingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$handle$1(this.f32221b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f32220a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f32221b.G;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f32220a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$handle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
