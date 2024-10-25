package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$2", f = "SplashFragment.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SplashFragment$registerObservers$2 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37358a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SplashFragment f37359b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$2$1", f = "SplashFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<LoadingViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37360a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SplashFragment f37362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SplashFragment splashFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37362c = splashFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(LoadingViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37362c, aVar);
            anonymousClass1.f37361b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LoadingViewModel S;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f37360a == 0) {
                kotlin.f.b(obj);
                LoadingViewModel.a aVar = (LoadingViewModel.a) this.f37361b;
                if (o.d(aVar, LoadingViewModel.a.C0424a.f37223a)) {
                    S = this.f37362c.S();
                    LoadingViewModel.I(S, false, false, 3, null);
                } else if (o.d(aVar, LoadingViewModel.a.c.f37225a)) {
                    this.f37362c.T();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$registerObservers$2(SplashFragment splashFragment, zz.a<? super SplashFragment$registerObservers$2> aVar) {
        super(1, aVar);
        this.f37359b = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SplashFragment$registerObservers$2(this.f37359b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LoadingViewModel S;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37358a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            S = this.f37359b.S();
            StateFlow<LoadingViewModel.a> L = S.L();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37359b, null);
            this.f37358a = 1;
            if (FlowKt.collectLatest(L, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SplashFragment$registerObservers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
