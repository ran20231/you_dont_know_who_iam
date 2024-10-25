package com.forsale.app.features.auth.login;

import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignInViewModel.kt */
@d(c = "com.forsale.app.features.auth.login.SignInViewModel$onScreenFailed$1", f = "SignInViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SignInViewModel$onScreenFailed$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22798a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignInViewModel f22799b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22800c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onScreenFailed$1(SignInViewModel signInViewModel, String str, a<? super SignInViewModel$onScreenFailed$1> aVar) {
        super(2, aVar);
        this.f22799b = signInViewModel;
        this.f22800c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SignInViewModel$onScreenFailed$1(this.f22799b, this.f22800c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ha.d dVar;
        AuthenticationSourcePage y11;
        b.f();
        if (this.f22798a == 0) {
            f.b(obj);
            dVar = this.f22799b.f22777a;
            y11 = this.f22799b.y();
            dVar.b(new ri.a(y11, this.f22800c));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SignInViewModel$onScreenFailed$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
