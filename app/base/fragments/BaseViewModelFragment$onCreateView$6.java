package com.forsale.app.base.fragments;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelFragment.kt */
@d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$6", f = "BaseViewModelFragment.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelFragment$onCreateView$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22180a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelFragment<B, VM> f22181b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelFragment.kt */
    @d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$6$1", f = "BaseViewModelFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewModelFragment<B, VM> f22183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22183b = baseViewModelFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f22183b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f22182a == 0) {
                f.b(obj);
                this.f22183b.x();
                x10.a.b("consume Expire Soon", new Object[0]);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelFragment$onCreateView$6(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super BaseViewModelFragment$onCreateView$6> aVar) {
        super(1, aVar);
        this.f22181b = baseViewModelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new BaseViewModelFragment$onCreateView$6(this.f22181b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22180a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> F = this.f22181b.B().F();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22181b, null);
            this.f22180a = 1;
            if (FlowKt.collectLatest(F, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((BaseViewModelFragment$onCreateView$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
