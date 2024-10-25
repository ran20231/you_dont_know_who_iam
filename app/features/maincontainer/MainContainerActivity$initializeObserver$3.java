package com.forsale.app.features.maincontainer;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$3", f = "MainContainerActivity.kt", l = {637}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$initializeObserver$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31370a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31371b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainContainerActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$3$1", f = "MainContainerActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainContainerActivity f31373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainContainerActivity mainContainerActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31373b = mainContainerActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f31373b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31372a == 0) {
                kotlin.f.b(obj);
                this.f31373b.x0().T0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$initializeObserver$3(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$initializeObserver$3> aVar) {
        super(1, aVar);
        this.f31371b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainContainerActivity$initializeObserver$3(this.f31371b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31370a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> i12 = this.f31371b.x0().i1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31371b, null);
            this.f31370a = 1;
            if (FlowKt.collectLatest(i12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainContainerActivity$initializeObserver$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
