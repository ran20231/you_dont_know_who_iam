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
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$2", f = "UserProfileInteractor.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$getUserAndUpdate$2 extends SuspendLambda implements p<String, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40269a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40270b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40271c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$getUserAndUpdate$2(UserProfileInteractor userProfileInteractor, a<? super UserProfileInteractor$getUserAndUpdate$2> aVar) {
        super(2, aVar);
        this.f40271c = userProfileInteractor;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(String str, a<? super wz.p> aVar) {
        return ((UserProfileInteractor$getUserAndUpdate$2) create(str, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        UserProfileInteractor$getUserAndUpdate$2 userProfileInteractor$getUserAndUpdate$2 = new UserProfileInteractor$getUserAndUpdate$2(this.f40271c, aVar);
        userProfileInteractor$getUserAndUpdate$2.f40270b = obj;
        return userProfileInteractor$getUserAndUpdate$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f40269a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            String str = (String) this.f40270b;
            if (str != null) {
                x10.a.b("Auth:: UnAuthorized " + str, new Object[0]);
            }
            UserProfileInteractor userProfileInteractor = this.f40271c;
            UserEntity userEntity = new UserEntity(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            this.f40269a = 1;
            if (UserProfileInteractor.v(userProfileInteractor, userEntity, false, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}
