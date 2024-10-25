package com.forsale.app.features.auth.forgotpassword;

import com.forsale.app.features.auth.AuthViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: ResetPasswordRoute.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ResetPasswordRoute$1", f = "ResetPasswordRoute.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ResetPasswordRouteKt$ResetPasswordRoute$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22677a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResetPasswordViewModel f22678b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthViewModel f22679c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordRouteKt$ResetPasswordRoute$1(ResetPasswordViewModel resetPasswordViewModel, AuthViewModel authViewModel, a<? super ResetPasswordRouteKt$ResetPasswordRoute$1> aVar) {
        super(2, aVar);
        this.f22678b = resetPasswordViewModel;
        this.f22679c = authViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ResetPasswordRouteKt$ResetPasswordRoute$1(this.f22678b, this.f22679c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f22677a == 0) {
            f.b(obj);
            this.f22678b.x(this.f22679c.g());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ResetPasswordRouteKt$ResetPasswordRoute$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
