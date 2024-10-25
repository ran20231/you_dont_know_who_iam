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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import zz.a;
/* compiled from: PasswordMeter.kt */
@d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$1", f = "PasswordMeter.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PasswordMeter$registerObservers$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39437a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f39438b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xh.a f39439c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PasswordMeter f39440d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PasswordMeter.kt */
    @d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$1$1", f = "PasswordMeter.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ xh.a f39442b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PasswordMeter f39443c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PasswordMeter.kt */
        @d(c = "com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$1$1$1", f = "PasswordMeter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.ui.passwordmetter.PasswordMeter$registerObservers$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C04451 extends SuspendLambda implements p<Float, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f39444a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ float f39445b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PasswordMeter f39446c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04451(PasswordMeter passwordMeter, a<? super C04451> aVar) {
                super(2, aVar);
                this.f39446c = passwordMeter;
            }

            public final Object b(float f11, a<? super wz.p> aVar) {
                return ((C04451) create(Float.valueOf(f11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C04451 c04451 = new C04451(this.f39446c, aVar);
                c04451.f39445b = ((Number) obj).floatValue();
                return c04451;
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Float f11, a<? super wz.p> aVar) {
                return b(f11.floatValue(), aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f39444a == 0) {
                    f.b(obj);
                    this.f39446c.getBinding().O.setProgress(this.f39445b);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(xh.a aVar, PasswordMeter passwordMeter, a<? super AnonymousClass1> aVar2) {
            super(2, aVar2);
            this.f39442b = aVar;
            this.f39443c = passwordMeter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f39442b, this.f39443c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f39441a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<Float> j11 = this.f39442b.j();
                C04451 c04451 = new C04451(this.f39443c, null);
                this.f39441a = 1;
                if (FlowKt.collectLatest(j11, c04451, this) == f11) {
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
    public PasswordMeter$registerObservers$1$1(s sVar, xh.a aVar, PasswordMeter passwordMeter, a<? super PasswordMeter$registerObservers$1$1> aVar2) {
        super(2, aVar2);
        this.f39438b = sVar;
        this.f39439c = aVar;
        this.f39440d = passwordMeter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PasswordMeter$registerObservers$1$1(this.f39438b, this.f39439c, this.f39440d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f39437a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f39438b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39439c, this.f39440d, null);
            this.f39437a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PasswordMeter$registerObservers$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
