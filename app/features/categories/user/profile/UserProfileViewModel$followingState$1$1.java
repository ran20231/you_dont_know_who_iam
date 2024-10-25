package com.forsale.app.features.categories.user.profile;

import androidx.lifecycle.z;
import com.forsale.app.features.categories.user.profile.UserProfileViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileViewModel$followingState$1$1", f = "UserProfileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserProfileViewModel$followingState$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31192a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserProfileViewModel f31193b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z<UserProfileViewModel.FollowingStates> f31194c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$followingState$1$1(UserProfileViewModel userProfileViewModel, z<UserProfileViewModel.FollowingStates> zVar, zz.a<? super UserProfileViewModel$followingState$1$1> aVar) {
        super(2, aVar);
        this.f31193b = userProfileViewModel;
        this.f31194c = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserProfileViewModel$followingState$1$1(this.f31193b, this.f31194c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedUserProfileViewModel sharedUserProfileViewModel;
        SharedUserProfileViewModel sharedUserProfileViewModel2;
        SharedUserProfileViewModel sharedUserProfileViewModel3;
        SharedUserProfileViewModel sharedUserProfileViewModel4;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f31192a == 0) {
            kotlin.f.b(obj);
            sharedUserProfileViewModel = this.f31193b.f31174k0;
            if (sharedUserProfileViewModel.y0().i() != null) {
                sharedUserProfileViewModel2 = this.f31193b.f31174k0;
                if (sharedUserProfileViewModel2.y0().b() != null) {
                    UserProfileViewModel userProfileViewModel = this.f31193b;
                    sharedUserProfileViewModel3 = userProfileViewModel.f31174k0;
                    sharedUserProfileViewModel4 = this.f31193b.f31174k0;
                    userProfileViewModel.I0(!TypeExtensionsKt.h0(sharedUserProfileViewModel3.y0().b().intValue()), TypeExtensionsKt.h0(sharedUserProfileViewModel4.y0().i().intValue()));
                    return wz.p.f75480a;
                }
            }
            this.f31194c.postValue(UserProfileViewModel.FollowingStates.NONE);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserProfileViewModel$followingState$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
