package com.forsale.designSystem.bottomsheets;

import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import t.e;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableState$snapInternalToOffset$2", f = "SwipeableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements p<e, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40940a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40941b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f40942c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40943d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f11, SwipeableState<T> swipeableState, a<? super SwipeableState$snapInternalToOffset$2> aVar) {
        super(2, aVar);
        this.f40942c = f11;
        this.f40943d = swipeableState;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(e eVar, a<? super wz.p> aVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(eVar, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.f40942c, this.f40943d, aVar);
        swipeableState$snapInternalToOffset$2.f40941b = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        b.f();
        if (this.f40940a == 0) {
            f.b(obj);
            float f11 = this.f40942c;
            k0Var = ((SwipeableState) this.f40943d).f40895g;
            ((e) this.f40941b).b(f11 - ((Number) k0Var.getValue()).floatValue());
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
