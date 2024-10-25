package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.p;
import j0.n1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$1", f = "SplashFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SplashFragment$SplashScreenContent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37331a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SplashFragment f37332b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n1<LoadingViewModel.c> f37333c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplashFragment$SplashScreenContent$1(SplashFragment splashFragment, n1<? extends LoadingViewModel.c> n1Var, zz.a<? super SplashFragment$SplashScreenContent$1> aVar) {
        super(2, aVar);
        this.f37332b = splashFragment;
        this.f37333c = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SplashFragment$SplashScreenContent$1(this.f37332b, this.f37333c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LoadingViewModel.c t11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f37331a == 0) {
            kotlin.f.b(obj);
            SplashFragment splashFragment = this.f37332b;
            t11 = SplashFragment.t(this.f37333c);
            splashFragment.I(t11);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SplashFragment$SplashScreenContent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
