package com.forsale.app.features.auth.login;

import com.forsale.app.features.auth.AuthViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: SignInRoute.kt */
@d(c = "com.forsale.app.features.auth.login.SignInRouteKt$SignInScreen$1", f = "SignInRoute.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignInRouteKt$SignInScreen$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22745a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignInViewModel f22746b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthViewModel f22747c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInRouteKt$SignInScreen$1(SignInViewModel signInViewModel, AuthViewModel authViewModel, a<? super SignInRouteKt$SignInScreen$1> aVar) {
        super(2, aVar);
        this.f22746b = signInViewModel;
        this.f22747c = authViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SignInRouteKt$SignInScreen$1(this.f22746b, this.f22747c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f22745a == 0) {
            f.b(obj);
            this.f22746b.L(this.f22747c.g());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SignInRouteKt$SignInScreen$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
