package com.forsale.app.features.more.communication;

import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import t9.t0;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommunicationsFragment.kt */
@d(c = "com.forsale.app.features.more.communication.CommunicationsFragment$registerObservers$1", f = "CommunicationsFragment.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommunicationsFragment$registerObservers$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommunicationsFragment f31853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommunicationsFragment.kt */
    @d(c = "com.forsale.app.features.more.communication.CommunicationsFragment$registerObservers$1$1", f = "CommunicationsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.communication.CommunicationsFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31854a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f31855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommunicationsFragment f31856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommunicationsFragment communicationsFragment, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31856c = communicationsFragment;
        }

        public final Object b(boolean z11, a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31856c, aVar);
            anonymousClass1.f31855b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f31854a == 0) {
                f.b(obj);
                boolean z11 = this.f31855b;
                if (z11) {
                    this.f31856c.T();
                    CommunicationsFragment.H(this.f31856c).P.d();
                } else if (!z11) {
                    this.f31856c.C = null;
                    CommunicationsFragment.H(this.f31856c).P.b(t0.P3, this.f31856c);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunicationsFragment$registerObservers$1(CommunicationsFragment communicationsFragment, a<? super CommunicationsFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f31853b = communicationsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new CommunicationsFragment$registerObservers$1(this.f31853b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f31852a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            StateFlow<Boolean> y02 = this.f31853b.B().y0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31853b, null);
            this.f31852a = 1;
            if (FlowKt.collectLatest(y02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((CommunicationsFragment$registerObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
