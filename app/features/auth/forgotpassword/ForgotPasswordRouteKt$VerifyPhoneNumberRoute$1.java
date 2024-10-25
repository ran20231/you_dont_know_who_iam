package com.forsale.app.features.auth.forgotpassword;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: ForgotPasswordRoute.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1", f = "ForgotPasswordRoute.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22631a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ForgotPasswordViewModel f22632b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1(ForgotPasswordViewModel forgotPasswordViewModel, a<? super ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1> aVar) {
        super(2, aVar);
        this.f22632b = forgotPasswordViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1(this.f22632b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f22631a == 0) {
            f.b(obj);
            this.f22632b.z();
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ForgotPasswordRouteKt$VerifyPhoneNumberRoute$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
