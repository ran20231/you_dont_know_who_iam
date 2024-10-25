package com.forsale.app.features.auth.signup;

import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.p;
import ha.e;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignUpViewModel.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpViewModel$onScreenFailed$1", f = "SignUpViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SignUpViewModel$onScreenFailed$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22893a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22894b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22895c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$onScreenFailed$1(SignUpViewModel signUpViewModel, String str, zz.a<? super SignUpViewModel$onScreenFailed$1> aVar) {
        super(2, aVar);
        this.f22894b = signUpViewModel;
        this.f22895c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpViewModel$onScreenFailed$1(this.f22894b, this.f22895c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        AuthenticationSourcePage z11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f22893a == 0) {
            f.b(obj);
            eVar = this.f22894b.f22881b;
            z11 = this.f22894b.z();
            eVar.a(new si.a(z11, this.f22895c));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpViewModel$onScreenFailed$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
