package com.forsale.app.features.more.newprofile.followerandfollowing;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$updateLoadedList$1", f = "FollowersAndFollowingsViewModel.kt", l = {143, 144}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$updateLoadedList$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32253a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f32254b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32255c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$updateLoadedList$1(boolean z11, FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super FollowersAndFollowingsViewModel$updateLoadedList$1> aVar) {
        super(2, aVar);
        this.f32254b = z11;
        this.f32255c = followersAndFollowingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FollowersAndFollowingsViewModel$updateLoadedList$1(this.f32254b, this.f32255c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        f11 = b.f();
        int i11 = this.f32253a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f32254b) {
                mutableStateFlow2 = this.f32255c.D;
                Boolean a11 = kotlin.coroutines.jvm.internal.a.a(true);
                this.f32253a = 1;
                if (mutableStateFlow2.emit(a11, this) == f11) {
                    return f11;
                }
            } else {
                mutableStateFlow = this.f32255c.C;
                Boolean a12 = kotlin.coroutines.jvm.internal.a.a(true);
                this.f32253a = 2;
                if (mutableStateFlow.emit(a12, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FollowersAndFollowingsViewModel$updateLoadedList$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
