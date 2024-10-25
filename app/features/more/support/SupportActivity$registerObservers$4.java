package com.forsale.app.features.more.support;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$4", f = "SupportActivity.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SupportActivity$registerObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32809a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SupportActivity f32810b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SupportActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$4$1", f = "SupportActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.support.SupportActivity$registerObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SupportActivity f32812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SupportActivity supportActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32812b = supportActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f32812b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32811a == 0) {
                f.b(obj);
                this.f32812b.N0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportActivity$registerObservers$4(SupportActivity supportActivity, zz.a<? super SupportActivity$registerObservers$4> aVar) {
        super(1, aVar);
        this.f32810b = supportActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SupportActivity$registerObservers$4(this.f32810b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32809a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> O0 = this.f32810b.x0().O0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32810b, null);
            this.f32809a = 1;
            if (FlowKt.collectLatest(O0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SupportActivity$registerObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
