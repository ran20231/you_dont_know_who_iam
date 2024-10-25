package com.forsale.app.features.maincontainer;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$2", f = "MainContainerActivity.kt", l = {670}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$registerBadgeStates$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31435a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainContainerActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$2$1", f = "MainContainerActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$registerBadgeStates$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31437a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f31438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MainContainerActivity f31439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainContainerActivity mainContainerActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31439c = mainContainerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31439c, aVar);
            anonymousClass1.f31438b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31437a == 0) {
                kotlin.f.b(obj);
                this.f31439c.k2(kotlin.coroutines.jvm.internal.a.d(this.f31438b), this.f31439c.x0().v1().getValue());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$registerBadgeStates$2(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$registerBadgeStates$2> aVar) {
        super(1, aVar);
        this.f31436b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainContainerActivity$registerBadgeStates$2(this.f31436b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31435a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<Integer> o12 = this.f31436b.x0().o1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31436b, null);
            this.f31435a = 1;
            if (FlowKt.collectLatest(o12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainContainerActivity$registerBadgeStates$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
