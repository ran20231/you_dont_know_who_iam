package com.forsale.app.features.maincontainer;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$1", f = "MainContainerActivity.kt", l = {662}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$registerBadgeStates$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31430a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31431b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainContainerActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$1$1", f = "MainContainerActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31432a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f31433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainContainerActivity f31434c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainContainerActivity mainContainerActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31434c = mainContainerActivity;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31434c, aVar);
            anonymousClass1.f31433b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31432a == 0) {
                kotlin.f.b(obj);
                boolean z11 = this.f31433b;
                MainContainerActivity mainContainerActivity = this.f31434c;
                mainContainerActivity.k2(mainContainerActivity.x0().o1().getValue(), kotlin.coroutines.jvm.internal.a.a(z11));
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$registerBadgeStates$1(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$registerBadgeStates$1> aVar) {
        super(1, aVar);
        this.f31431b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainContainerActivity$registerBadgeStates$1(this.f31431b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31430a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<Boolean> v12 = this.f31431b.x0().v1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31431b, null);
            this.f31430a = 1;
            if (FlowKt.collectLatest(v12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainContainerActivity$registerBadgeStates$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
