package com.forsale.app.intializers;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticInitializer.kt */
@d(c = "com.forsale.app.intializers.AnalyticInitializer$initAdServerAnalytics$2", f = "AnalyticInitializer.kt", l = {l8.a.f62268e}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticInitializer$initAdServerAnalytics$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37518a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticInitializer f37519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticInitializer.kt */
    @d(c = "com.forsale.app.intializers.AnalyticInitializer$initAdServerAnalytics$2$1", f = "AnalyticInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.intializers.AnalyticInitializer$initAdServerAnalytics$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnalyticInitializer f37521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticInitializer analyticInitializer, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37521b = analyticInitializer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f37521b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f37520a == 0) {
                f.b(obj);
                this.f37521b.u();
                this.f37521b.v();
                this.f37521b.w();
                this.f37521b.z();
                this.f37521b.x();
                this.f37521b.y();
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticInitializer$initAdServerAnalytics$2(AnalyticInitializer analyticInitializer, zz.a<? super AnalyticInitializer$initAdServerAnalytics$2> aVar) {
        super(2, aVar);
        this.f37519b = analyticInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AnalyticInitializer$initAdServerAnalytics$2(this.f37519b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f37518a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37519b, null);
            this.f37518a = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AnalyticInitializer$initAdServerAnalytics$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
