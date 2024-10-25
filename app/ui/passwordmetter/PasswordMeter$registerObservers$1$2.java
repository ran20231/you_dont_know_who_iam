package com.forsale.app.ui.passwordmetter;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import zz.a;
/* compiled from: PasswordMeter.kt */
@d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$2", f = "PasswordMeter.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PasswordMeter$registerObservers$1$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f39448b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xh.a f39449c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PasswordMeter f39450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PasswordMeter.kt */
    @d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$2$1", f = "PasswordMeter.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ xh.a f39452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PasswordMeter f39453c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PasswordMeter.kt */
        @d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$2$1$1", f = "PasswordMeter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C04461 extends SuspendLambda implements p<Integer, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39454a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f39455b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PasswordMeter f39456c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04461(PasswordMeter passwordMeter, a<? super C04461> aVar) {
                super(2, aVar);
                this.f39456c = passwordMeter;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C04461 c04461 = new C04461(this.f39456c, aVar);
                c04461.f39455b = ((Number) obj).intValue();
                return c04461;
            }

            public final Object invoke(int i11, a<? super wz.p> aVar) {
                return ((C04461) create(Integer.valueOf(i11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f39454a == 0) {
                    f.b(obj);
                    this.f39456c.getBinding().O.setProgressColor(this.f39455b);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, a<? super wz.p> aVar) {
                return invoke(num.intValue(), aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(xh.a aVar, PasswordMeter passwordMeter, a<? super AnonymousClass1> aVar2) {
            super(2, aVar2);
            this.f39452b = aVar;
            this.f39453c = passwordMeter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f39452b, this.f39453c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f39451a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                Flow<Integer> f12 = this.f39452b.f();
                C04461 c04461 = new C04461(this.f39453c, null);
                this.f39451a = 1;
                if (FlowKt.collectLatest(f12, c04461, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordMeter$registerObservers$1$2(s sVar, xh.a aVar, PasswordMeter passwordMeter, a<? super PasswordMeter$registerObservers$1$2> aVar2) {
        super(2, aVar2);
        this.f39448b = sVar;
        this.f39449c = aVar;
        this.f39450d = passwordMeter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PasswordMeter$registerObservers$1$2(this.f39448b, this.f39449c, this.f39450d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f39447a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f39448b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39449c, this.f39450d, null);
            this.f39447a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PasswordMeter$registerObservers$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
