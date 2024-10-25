package com.forsale.app.utils.facades.user;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$3", f = "UserProfileInteractor.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$getUserAndUpdate$3 extends SuspendLambda implements p<UserEntity, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40272a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40273b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40274c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$getUserAndUpdate$3(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$getUserAndUpdate$3> aVar) {
        super(2, aVar);
        this.f40274c = userProfileInteractor;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(UserEntity userEntity, a<? super wz.p> aVar) {
        return ((UserProfileInteractor$getUserAndUpdate$3) create(userEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        UserProfileInteractor$getUserAndUpdate$3 userProfileInteractor$getUserAndUpdate$3 = new UserProfileInteractor$getUserAndUpdate$3(this.f40274c, aVar);
        userProfileInteractor$getUserAndUpdate$3.f40273b = obj;
        return userProfileInteractor$getUserAndUpdate$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f40272a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            UserProfileInteractor userProfileInteractor = this.f40274c;
            this.f40272a = 1;
            if (userProfileInteractor.t((UserEntity) this.f40273b, true, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}
