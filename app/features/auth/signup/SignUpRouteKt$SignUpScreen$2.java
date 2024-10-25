package com.forsale.app.features.auth.signup;

import com.forsale.app.features.auth.AuthViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SignUpRoute.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$2", f = "SignUpRoute.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignUpRouteKt$SignUpScreen$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22855b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthViewModel f22856c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRouteKt$SignUpScreen$2(SignUpViewModel signUpViewModel, AuthViewModel authViewModel, zz.a<? super SignUpRouteKt$SignUpScreen$2> aVar) {
        super(2, aVar);
        this.f22855b = signUpViewModel;
        this.f22856c = authViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpRouteKt$SignUpScreen$2(this.f22855b, this.f22856c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f22854a == 0) {
            f.b(obj);
            this.f22855b.M(this.f22856c.g());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpRouteKt$SignUpScreen$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
