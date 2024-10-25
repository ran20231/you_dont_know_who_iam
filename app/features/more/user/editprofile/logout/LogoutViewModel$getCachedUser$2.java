package com.forsale.app.features.more.user.editprofile.logout;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutViewModel.kt */
@d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$getCachedUser$2", f = "LogoutViewModel.kt", l = {FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogoutViewModel$getCachedUser$2 extends SuspendLambda implements p<CoroutineScope, a<? super UserEntity>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33485a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogoutViewModel f33486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutViewModel$getCachedUser$2(LogoutViewModel logoutViewModel, a<? super LogoutViewModel$getCachedUser$2> aVar) {
        super(2, aVar);
        this.f33486b = logoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutViewModel$getCachedUser$2(this.f33486b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserProfileInteractor userProfileInteractor;
        f11 = b.f();
        int i11 = this.f33485a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            userProfileInteractor = this.f33486b.f33450m0;
            this.f33485a = 1;
            obj = userProfileInteractor.i(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super UserEntity> aVar) {
        return ((LogoutViewModel$getCachedUser$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
