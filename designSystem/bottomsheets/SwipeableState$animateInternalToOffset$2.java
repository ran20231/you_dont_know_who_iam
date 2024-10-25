package com.forsale.designSystem.bottomsheets;

import androidx.compose.animation.core.Animatable;
import g00.l;
import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.o;
import r.f;
import r.j;
import t.e;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableState$animateInternalToOffset$2", f = "SwipeableState.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements p<e, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40910a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40912c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f40913d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f<Float> f40914e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeableState.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableState$animateInternalToOffset$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements l<Animatable<Float, j>, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f40915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref$FloatRef f40916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, Ref$FloatRef ref$FloatRef) {
            super(1);
            this.f40915a = eVar;
            this.f40916b = ref$FloatRef;
        }

        public final void b(Animatable<Float, j> animateTo) {
            o.i(animateTo, "$this$animateTo");
            this.f40915a.b(animateTo.m().floatValue() - this.f40916b.f61775a);
            this.f40916b.f61775a = animateTo.m().floatValue();
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ wz.p invoke(Animatable<Float, j> animatable) {
            b(animatable);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f11, f<Float> fVar, a<? super SwipeableState$animateInternalToOffset$2> aVar) {
        super(2, aVar);
        this.f40912c = swipeableState;
        this.f40913d = f11;
        this.f40914e = fVar;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(e eVar, a<? super wz.p> aVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(eVar, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.f40912c, this.f40913d, this.f40914e, aVar);
        swipeableState$animateInternalToOffset$2.f40911b = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        f11 = b.f();
        int i11 = this.f40910a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                e eVar = (e) this.f40911b;
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                k0Var2 = ((SwipeableState) this.f40912c).f40895g;
                ref$FloatRef.f61775a = ((Number) k0Var2.getValue()).floatValue();
                k0Var3 = ((SwipeableState) this.f40912c).f40896h;
                k0Var3.setValue(kotlin.coroutines.jvm.internal.a.c(this.f40913d));
                this.f40912c.D(true);
                Animatable b11 = r.a.b(ref$FloatRef.f61775a, 0.0f, 2, null);
                Float c11 = kotlin.coroutines.jvm.internal.a.c(this.f40913d);
                f<Float> fVar = this.f40914e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar, ref$FloatRef);
                this.f40910a = 1;
                if (Animatable.f(b11, c11, fVar, null, anonymousClass1, this, 4, null) == f11) {
                    return f11;
                }
            }
            k0Var4 = ((SwipeableState) this.f40912c).f40896h;
            k0Var4.setValue(null);
            this.f40912c.D(false);
            return wz.p.f75480a;
        } catch (Throwable th2) {
            k0Var = ((SwipeableState) this.f40912c).f40896h;
            k0Var.setValue(null);
            this.f40912c.D(false);
            throw th2;
        }
    }
}
