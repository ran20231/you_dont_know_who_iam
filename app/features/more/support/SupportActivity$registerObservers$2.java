package com.forsale.app.features.more.support;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$2", f = "SupportActivity.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SupportActivity$registerObservers$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32801a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SupportActivity f32802b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SupportActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$2$1", f = "SupportActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.support.SupportActivity$registerObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SupportActivity f32804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SupportActivity supportActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32804b = supportActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f32804b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32803a == 0) {
                f.b(obj);
                this.f32804b.O0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportActivity$registerObservers$2(SupportActivity supportActivity, zz.a<? super SupportActivity$registerObservers$2> aVar) {
        super(1, aVar);
        this.f32802b = supportActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SupportActivity$registerObservers$2(this.f32802b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32801a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> P0 = this.f32802b.x0().P0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32802b, null);
            this.f32801a = 1;
            if (FlowKt.collectLatest(P0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SupportActivity$registerObservers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
