package com.forsale.designSystem.bottomsheets;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import g00.l;
import j0.k0;
import j0.n1;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import r.f;
import wz.p;
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public class SwipeableState<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f40888q = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final f<Float> f40889a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, Boolean> f40890b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f40891c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f40892d;

    /* renamed from: e  reason: collision with root package name */
    private final k0<Float> f40893e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<Float> f40894f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Float> f40895g;

    /* renamed from: h  reason: collision with root package name */
    private final k0<Float> f40896h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f40897i;

    /* renamed from: j  reason: collision with root package name */
    private final Flow<Map<Float, T>> f40898j;

    /* renamed from: k  reason: collision with root package name */
    private float f40899k;

    /* renamed from: l  reason: collision with root package name */
    private float f40900l;

    /* renamed from: m  reason: collision with root package name */
    private final k0 f40901m;

    /* renamed from: n  reason: collision with root package name */
    private final k0 f40902n;

    /* renamed from: o  reason: collision with root package name */
    private final k0 f40903o;

    /* renamed from: p  reason: collision with root package name */
    private final t.f f40904p;

    /* compiled from: SwipeableState.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t11, f<Float> animationSpec, l<? super T, Boolean> confirmStateChange) {
        k0 e11;
        k0 e12;
        k0<Float> e13;
        k0<Float> e14;
        k0<Float> e15;
        k0<Float> e16;
        Map h11;
        k0 e17;
        k0 e18;
        k0 e19;
        k0 e21;
        o.i(animationSpec, "animationSpec");
        o.i(confirmStateChange, "confirmStateChange");
        this.f40889a = animationSpec;
        this.f40890b = confirmStateChange;
        e11 = c0.e(t11, null, 2, null);
        this.f40891c = e11;
        e12 = c0.e(Boolean.FALSE, null, 2, null);
        this.f40892d = e12;
        Float valueOf = Float.valueOf(0.0f);
        e13 = c0.e(valueOf, null, 2, null);
        this.f40893e = e13;
        e14 = c0.e(valueOf, null, 2, null);
        this.f40894f = e14;
        e15 = c0.e(valueOf, null, 2, null);
        this.f40895g = e15;
        e16 = c0.e(null, null, 2, null);
        this.f40896h = e16;
        h11 = j0.h();
        e17 = c0.e(h11, null, 2, null);
        this.f40897i = e17;
        this.f40898j = FlowKt.take(new SwipeableState$special$$inlined$filter$1(z.p(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.f40899k = Float.NEGATIVE_INFINITY;
        this.f40900l = Float.POSITIVE_INFINITY;
        e18 = c0.e(SwipeableState$thresholds$2.f40944a, null, 2, null);
        this.f40901m = e18;
        e19 = c0.e(valueOf, null, 2, null);
        this.f40902n = e19;
        e21 = c0.e(null, null, 2, null);
        this.f40903o = e21;
        this.f40904p = DraggableKt.a(new SwipeableState$draggableState$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object A(SwipeableState swipeableState, float f11, g00.a aVar, zz.a aVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                aVar = null;
            }
            return swipeableState.z(f11, aVar, aVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performFling");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(boolean z11) {
        this.f40892d.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(T t11) {
        this.f40891c.setValue(t11);
    }

    private final Object I(float f11, zz.a<? super p> aVar) {
        Object f12;
        Object d11 = t.f.d(this.f40904p, null, new SwipeableState$snapInternalToOffset$2(f11, this, null), aVar, 1, null);
        f12 = b.f();
        if (d11 == f12) {
            return d11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(float f11, f<Float> fVar, zz.a<? super p> aVar) {
        Object f12;
        Object d11 = t.f.d(this.f40904p, null, new SwipeableState$animateInternalToOffset$2(this, f11, fVar, null), aVar, 1, null);
        f12 = b.f();
        if (d11 == f12) {
            return d11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(SwipeableState swipeableState, Object obj, f fVar, zz.a aVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                fVar = swipeableState.f40889a;
            }
            return swipeableState.i(obj, fVar, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, zz.a<? super wz.p> r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableState.B(java.util.Map, java.util.Map, zz.a):java.lang.Object");
    }

    public final void C(Map<Float, ? extends T> map) {
        o.i(map, "<set-?>");
        this.f40897i.setValue(map);
    }

    public final void F(vj.b bVar) {
        this.f40903o.setValue(bVar);
    }

    public final void G(g00.p<? super Float, ? super Float, Float> pVar) {
        o.i(pVar, "<set-?>");
        this.f40901m.setValue(pVar);
    }

    public final void H(float f11) {
        this.f40902n.setValue(Float.valueOf(f11));
    }

    public final Object i(T t11, f<Float> fVar, zz.a<? super p> aVar) {
        Object f11;
        Object collect = this.f40898j.collect(new SwipeableState$animateTo$2(t11, this, fVar), aVar);
        f11 = b.f();
        if (collect == f11) {
            return collect;
        }
        return p.f75480a;
    }

    public final void k(Map<Float, ? extends T> newAnchors) {
        o.i(newAnchors, "newAnchors");
        if (l().isEmpty()) {
            Float b11 = SwipeableStateKt.b(newAnchors, o());
            if (b11 != null) {
                this.f40893e.setValue(b11);
                this.f40895g.setValue(b11);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> l() {
        return (Map) this.f40897i.getValue();
    }

    public final f<Float> m() {
        return this.f40889a;
    }

    public final l<T, Boolean> n() {
        return this.f40890b;
    }

    public final T o() {
        return this.f40891c.getValue();
    }

    public final t.f p() {
        return this.f40904p;
    }

    public final float q() {
        return this.f40900l;
    }

    public final float r() {
        return this.f40899k;
    }

    public final n1<Float> s() {
        return this.f40893e;
    }

    public final vj.b t() {
        return (vj.b) this.f40903o.getValue();
    }

    public final T u() {
        float floatValue;
        float a11;
        Float value = this.f40896h.getValue();
        if (value != null) {
            a11 = value.floatValue();
        } else {
            float floatValue2 = s().getValue().floatValue();
            Float b11 = SwipeableStateKt.b(l(), o());
            if (b11 != null) {
                floatValue = b11.floatValue();
            } else {
                floatValue = s().getValue().floatValue();
            }
            a11 = SwipeableStateKt.a(floatValue2, floatValue, l().keySet(), v(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t11 = l().get(Float.valueOf(a11));
        if (t11 == null) {
            return o();
        }
        return t11;
    }

    public final g00.p<Float, Float, Float> v() {
        return (g00.p) this.f40901m.getValue();
    }

    public final float w() {
        return ((Number) this.f40902n.getValue()).floatValue();
    }

    public final boolean x() {
        return ((Boolean) this.f40892d.getValue()).booleanValue();
    }

    public final float y(float f11) {
        float k11;
        k11 = m00.o.k(this.f40895g.getValue().floatValue() + f11, this.f40899k, this.f40900l);
        float floatValue = k11 - this.f40895g.getValue().floatValue();
        if (Math.abs(floatValue) > 0.0f) {
            this.f40904p.a(floatValue);
        }
        return floatValue;
    }

    public final Object z(float f11, g00.a<p> aVar, zz.a<? super p> aVar2) {
        Object f12;
        Object collect = this.f40898j.collect(new SwipeableState$performFling$2(this, f11, aVar), aVar2);
        f12 = b.f();
        if (collect == f12) {
            return collect;
        }
        return p.f75480a;
    }
}
