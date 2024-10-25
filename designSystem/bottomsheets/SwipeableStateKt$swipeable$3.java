package com.forsale.designSystem.bottomsheets;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import g00.q;
import j0.u;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.j0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import tv.teads.sdk.engine.bridges.network.NetworkResponse;
import v.k;
import vj.b;
import vj.d;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableStateKt$swipeable$3 extends Lambda implements q<c, a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<Float, T> f40965a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40966b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Orientation f40967c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f40968d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f40969e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40970f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f40971g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f40972h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ g00.p<T, T, d> f40973i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ float f40974j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeableState.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$3", f = "SwipeableState.kt", l = {581}, m = "invokeSuspend")
    /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SwipeableState<T> f40976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<Float, T> f40977c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f40978d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e2.d f40979e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g00.p<T, T, d> f40980f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f40981g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SwipeableState.kt */
        /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$3$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements g00.p<Float, Float, Float> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Map<Float, T> f40982a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g00.p<T, T, d> f40983b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e2.d f40984c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Map<Float, ? extends T> map, g00.p<? super T, ? super T, ? extends d> pVar, e2.d dVar) {
                super(2);
                this.f40982a = map;
                this.f40983b = pVar;
                this.f40984c = dVar;
            }

            public final Float b(float f11, float f12) {
                Object i11;
                Object i12;
                i11 = j0.i(this.f40982a, Float.valueOf(f11));
                i12 = j0.i(this.f40982a, Float.valueOf(f12));
                return Float.valueOf(this.f40983b.invoke(i11, i12).a(this.f40984c, f11, f12));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12) {
                return b(f11.floatValue(), f12.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, b bVar, e2.d dVar, g00.p<? super T, ? super T, ? extends d> pVar, float f11, zz.a<? super AnonymousClass3> aVar) {
            super(2, aVar);
            this.f40976b = swipeableState;
            this.f40977c = map;
            this.f40978d = bVar;
            this.f40979e = dVar;
            this.f40980f = pVar;
            this.f40981g = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass3(this.f40976b, this.f40977c, this.f40978d, this.f40979e, this.f40980f, this.f40981g, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f40975a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                Map l11 = this.f40976b.l();
                this.f40976b.C(this.f40977c);
                this.f40976b.F(this.f40978d);
                this.f40976b.G(new AnonymousClass1(this.f40977c, this.f40980f, this.f40979e));
                this.f40976b.H(this.f40979e.m1(this.f40981g));
                SwipeableState<T> swipeableState = this.f40976b;
                Object obj2 = this.f40977c;
                this.f40975a = 1;
                if (swipeableState.B(l11, obj2, this) == f11) {
                    return f11;
                }
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass3) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableStateKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z11, k kVar, g00.a<p> aVar, boolean z12, b bVar, g00.p<? super T, ? super T, ? extends d> pVar, float f11) {
        super(3);
        this.f40965a = map;
        this.f40966b = swipeableState;
        this.f40967c = orientation;
        this.f40968d = z11;
        this.f40969e = kVar;
        this.f40970f = aVar;
        this.f40971g = z12;
        this.f40972h = bVar;
        this.f40973i = pVar;
        this.f40974j = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final c b(c composed, a aVar, int i11) {
        List c02;
        o.i(composed, "$this$composed");
        aVar.C(-1856539853);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1856539853, i11, -1, "com.forsale.designSystem.bottomsheets.swipeable.<anonymous> (SwipeableState.kt:560)");
        }
        boolean z11 = true;
        if (!this.f40965a.isEmpty()) {
            c02 = CollectionsKt___CollectionsKt.c0(this.f40965a.values());
            if (c02.size() != this.f40965a.size()) {
                z11 = false;
            }
            if (z11) {
                e2.d dVar = (e2.d) aVar.q(CompositionLocalsKt.e());
                this.f40966b.k(this.f40965a);
                Map map = this.f40965a;
                SwipeableState swipeableState = this.f40966b;
                u.e(map, swipeableState, new AnonymousClass3(swipeableState, map, this.f40972h, dVar, this.f40973i, this.f40974j, null), aVar, NetworkResponse.UNKNOWN_ERROR_CODE);
                c.a aVar2 = c.f7566a;
                boolean x11 = this.f40966b.x();
                t.f p11 = this.f40966b.p();
                Orientation orientation = this.f40967c;
                boolean z12 = this.f40968d;
                k kVar = this.f40969e;
                SwipeableState swipeableState2 = this.f40966b;
                g00.a<p> aVar3 = this.f40970f;
                aVar.C(511388516);
                boolean T = aVar.T(swipeableState2) | aVar.T(aVar3);
                Object D = aVar.D();
                if (T || D == a.f7182a.a()) {
                    D = new SwipeableStateKt$swipeable$3$4$1(swipeableState2, aVar3, null);
                    aVar.u(D);
                }
                aVar.S();
                c k11 = DraggableKt.k(aVar2, p11, orientation, z12, kVar, x11, null, D, this.f40971g, 32, null);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                aVar.S();
                return k11;
            }
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        throw new IllegalArgumentException("You must have at least one anchor.".toString());
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}
