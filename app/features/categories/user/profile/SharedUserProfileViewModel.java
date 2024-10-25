package com.forsale.app.features.categories.user.profile;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.auth.login.SignInIntention;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: SharedUserProfileViewModel.kt */
/* loaded from: classes2.dex */
public final class SharedUserProfileViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final UserProfileData f31130k0;

    /* renamed from: l0  reason: collision with root package name */
    private final Integer f31131l0;

    /* renamed from: m0  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f31132m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<SignInIntention> f31133n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<SignInIntention> f31134o0;

    /* compiled from: SharedUserProfileViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        SharedUserProfileViewModel a(UserProfileData userProfileData, Integer num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedUserProfileViewModel(UserProfileData userProfileData, Integer num, BaseRepository baseRepository, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor) {
        super(baseRepository);
        o.i(userProfileData, "userProfileData");
        o.i(baseRepository, "baseRepository");
        o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        this.f31130k0 = userProfileData;
        this.f31131l0 = num;
        this.f31132m0 = userLoginAuthoritiesInteractor;
        MutableSharedFlow<SignInIntention> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f31133n0 = MutableSharedFlow$default;
        this.f31134o0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final Integer v0() {
        return this.f31131l0;
    }

    public final SharedFlow<SignInIntention> w0() {
        return this.f31134o0;
    }

    public final MutableSharedFlow<SignInIntention> x0() {
        return this.f31133n0;
    }

    public final UserProfileData y0() {
        return this.f31130k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel$isUserLogin$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel$isUserLogin$1 r0 = (com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel$isUserLogin$1) r0
            int r1 = r0.f31137c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31137c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel$isUserLogin$1 r0 = new com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel$isUserLogin$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31135a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31137c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.features.auth.UserLoginAuthoritiesInteractor r5 = r4.f31132m0
            r0.f31137c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.features.auth.UserStatus r0 = com.forsale.app.features.auth.UserStatus.LoggedIn
            if (r5 != r0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.user.profile.SharedUserProfileViewModel.z0(zz.a):java.lang.Object");
    }
}
