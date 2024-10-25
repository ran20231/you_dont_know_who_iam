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
@d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$5", f = "BaseViewModelFragment.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelFragment$onCreateView$5 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelFragment<B, VM> f22176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelFragment.kt */
    @d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$5$1", f = "BaseViewModelFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<g00.a<? extends p>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22177a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f22178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelFragment<B, VM> f22179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22179c = baseViewModelFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(g00.a<p> aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22179c, aVar);
            anonymousClass1.f22178b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f22177a == 0) {
                f.b(obj);
                g00.a<p> aVar = (g00.a) this.f22178b;
                if (aVar != null) {
                    this.f22179c.B().r0(aVar);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelFragment$onCreateView$5(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super BaseViewModelFragment$onCreateView$5> aVar) {
        super(1, aVar);
        this.f22176b = baseViewModelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new BaseViewModelFragment$onCreateView$5(this.f22176b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22175a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<g00.a<p>> B = this.f22176b.B().B();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22176b, null);
            this.f22175a = 1;
            if (FlowKt.collectLatest(B, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((BaseViewModelFragment$onCreateView$5) create(aVar)).invokeSuspend(p.f75480a);
    }
}
