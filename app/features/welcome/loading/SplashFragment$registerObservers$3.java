package com.forsale.app.features.welcome.loading;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$3", f = "SplashFragment.kt", l = {316}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SplashFragment$registerObservers$3 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SplashFragment f37364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$3$1", f = "SplashFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<f, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37365a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SplashFragment f37367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SplashFragment splashFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37367c = splashFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(f fVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(fVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37367c, aVar);
            anonymousClass1.f37366b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f37365a == 0) {
                kotlin.f.b(obj);
                if (((f) this.f37366b) != null) {
                    this.f37367c.a0();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$registerObservers$3(SplashFragment splashFragment, zz.a<? super SplashFragment$registerObservers$3> aVar) {
        super(1, aVar);
        this.f37364b = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SplashFragment$registerObservers$3(this.f37364b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LoadingViewModel S;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37363a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            S = this.f37364b.S();
            StateFlow<f> M = S.M();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37364b, null);
            this.f37363a = 1;
            if (FlowKt.collectLatest(M, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SplashFragment$registerObservers$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
