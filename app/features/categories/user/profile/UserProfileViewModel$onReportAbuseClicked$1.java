package com.forsale.app.features.categories.user.profile;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileViewModel$onReportAbuseClicked$1", f = "UserProfileViewModel.kt", l = {119, 120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserProfileViewModel$onReportAbuseClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31204a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserProfileViewModel f31205b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$onReportAbuseClicked$1(UserProfileViewModel userProfileViewModel, zz.a<? super UserProfileViewModel$onReportAbuseClicked$1> aVar) {
        super(2, aVar);
        this.f31205b = userProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserProfileViewModel$onReportAbuseClicked$1(this.f31205b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SharedUserProfileViewModel sharedUserProfileViewModel;
        SharedUserProfileViewModel sharedUserProfileViewModel2;
        SharedUserProfileViewModel sharedUserProfileViewModel3;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31204a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            sharedUserProfileViewModel = this.f31205b.f31174k0;
            this.f31204a = 1;
            obj = sharedUserProfileViewModel.z0(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            sharedUserProfileViewModel3 = this.f31205b.f31174k0;
            MutableSharedFlow<SignInIntention> x02 = sharedUserProfileViewModel3.x0();
            SignInIntention signInIntention = SignInIntention.REPORT;
            this.f31204a = 2;
            if (x02.emit(signInIntention, this) == f11) {
                return f11;
            }
        } else {
            OneShotEventHandler<UserProfileData> L0 = this.f31205b.L0();
            sharedUserProfileViewModel2 = this.f31205b.f31174k0;
            L0.i(sharedUserProfileViewModel2.y0());
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserProfileViewModel$onReportAbuseClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
