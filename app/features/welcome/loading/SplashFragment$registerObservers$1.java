package com.forsale.app.features.welcome.loading;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.b1;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$1", f = "SplashFragment.kt", l = {299}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SplashFragment$registerObservers$1 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SplashFragment f37354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$1$1", f = "SplashFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.welcome.loading.SplashFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37355a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f37356b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SplashFragment f37357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SplashFragment splashFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37357c = splashFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37357c, aVar);
            anonymousClass1.f37356b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f37355a == 0) {
                kotlin.f.b(obj);
                boolean z11 = this.f37356b;
                b1 b1Var = b1.f69218a;
                androidx.fragment.app.p requireActivity = this.f37357c.requireActivity();
                o.h(requireActivity, "requireActivity(...)");
                b1Var.b(requireActivity, z11);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$registerObservers$1(SplashFragment splashFragment, zz.a<? super SplashFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f37354b = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SplashFragment$registerObservers$1(this.f37354b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LoadingViewModel S;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37353a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            S = this.f37354b.S();
            MutableSharedFlow<Boolean> S2 = S.S();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37354b, null);
            this.f37353a = 1;
            if (FlowKt.collectLatest(S2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SplashFragment$registerObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
