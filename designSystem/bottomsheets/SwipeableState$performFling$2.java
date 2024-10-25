package com.forsale.designSystem.bottomsheets;

import g00.a;
import java.util.Map;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableState$performFling$2<T> implements FlowCollector<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40927a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f40928b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a<p> f40929c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SwipeableState$performFling$2(SwipeableState<T> swipeableState, float f11, a<p> aVar) {
        this.f40927a = swipeableState;
        this.f40928b = f11;
        this.f40929c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r12, zz.a<? super wz.p> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2$emit$1
            if (r0 == 0) goto L13
            r0 = r13
            com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2$emit$1 r0 = (com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2$emit$1) r0
            int r1 = r0.f40933d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40933d = r1
            goto L18
        L13:
            com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2$emit$1 r0 = new com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2$emit$1
            r0.<init>(r11, r13)
        L18:
            r4 = r0
            java.lang.Object r13 = r4.f40931b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f40933d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            java.lang.Object r12 = r4.f40930a
            com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2 r12 = (com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2) r12
            kotlin.f.b(r13)
            goto Lb7
        L3b:
            kotlin.f.b(r13)
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r13 = r11.f40927a
            java.lang.Object r13 = r13.o()
            java.lang.Float r13 = com.forsale.designSystem.bottomsheets.SwipeableStateKt.b(r12, r13)
            kotlin.jvm.internal.o.f(r13)
            float r13 = r13.floatValue()
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r11.f40927a
            j0.n1 r1 = r1.s()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r5 = r1.floatValue()
            java.util.Set r7 = r12.keySet()
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r11.f40927a
            g00.p r8 = r1.v()
            float r9 = r11.f40928b
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r11.f40927a
            float r10 = r1.w()
            r6 = r13
            float r1 = com.forsale.designSystem.bottomsheets.SwipeableStateKt.a(r5, r6, r7, r8, r9, r10)
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.a.c(r1)
            java.lang.Object r12 = r12.get(r1)
            if (r12 == 0) goto La6
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r11.f40927a
            g00.l r1 = r1.n()
            java.lang.Object r1 = r1.invoke(r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La6
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r1 = r11.f40927a
            r13 = 0
            r5 = 2
            r6 = 0
            r4.f40930a = r11
            r4.f40933d = r3
            r2 = r12
            r3 = r13
            java.lang.Object r12 = com.forsale.designSystem.bottomsheets.SwipeableState.j(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto La4
            return r0
        La4:
            r12 = r11
            goto Lb7
        La6:
            com.forsale.designSystem.bottomsheets.SwipeableState<T> r12 = r11.f40927a
            r.f r1 = r12.m()
            r4.f40930a = r11
            r4.f40933d = r2
            java.lang.Object r12 = com.forsale.designSystem.bottomsheets.SwipeableState.a(r12, r13, r1, r4)
            if (r12 != r0) goto La4
            return r0
        Lb7:
            g00.a<wz.p> r12 = r12.f40929c
            if (r12 == 0) goto Lbe
            r12.invoke()
        Lbe:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2.emit(java.util.Map, zz.a):java.lang.Object");
    }
}
