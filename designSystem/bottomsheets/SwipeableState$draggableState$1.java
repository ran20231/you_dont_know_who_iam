package com.forsale.designSystem.bottomsheets;

import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import m00.o;
import vj.b;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableState$draggableState$1 extends Lambda implements l<Float, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40925a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.f40925a = swipeableState;
    }

    public final void b(float f11) {
        k0 k0Var;
        float k11;
        float f12;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0Var = ((SwipeableState) this.f40925a).f40895g;
        float floatValue = ((Number) k0Var.getValue()).floatValue() + f11;
        k11 = o.k(floatValue, this.f40925a.r(), this.f40925a.q());
        float f13 = floatValue - k11;
        b t11 = this.f40925a.t();
        if (t11 != null) {
            f12 = t11.a(f13);
        } else {
            f12 = 0.0f;
        }
        k0Var2 = ((SwipeableState) this.f40925a).f40893e;
        k0Var2.setValue(Float.valueOf(k11 + f12));
        k0Var3 = ((SwipeableState) this.f40925a).f40894f;
        k0Var3.setValue(Float.valueOf(f13));
        k0Var4 = ((SwipeableState) this.f40925a).f40895g;
        k0Var4.setValue(Float.valueOf(floatValue));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Float f11) {
        b(f11.floatValue());
        return p.f75480a;
    }
}
