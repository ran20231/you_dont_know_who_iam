package com.forsale.app.base.activities;

import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$12", f = "BaseViewModelActivity.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onCreate$12 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22079a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    @d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$12$1", f = "BaseViewModelActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$12$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22082b = baseViewModelActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f22082b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f22081a == 0) {
                f.b(obj);
                this.f22082b.x0().l();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onCreate$12(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onCreate$12> aVar) {
        super(1, aVar);
        this.f22080b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BaseViewModelActivity$onCreate$12(this.f22080b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22079a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> G = this.f22080b.x0().G();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22080b, null);
            this.f22079a = 1;
            if (FlowKt.collectLatest(G, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BaseViewModelActivity$onCreate$12) create(aVar)).invokeSuspend(p.f75480a);
    }
}
