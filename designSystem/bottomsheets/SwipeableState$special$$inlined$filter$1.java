package com.forsale.designSystem.bottomsheets;

import java.util.Map;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class SwipeableState$special$$inlined$filter$1<T> implements Flow<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow f40905a;

    /* compiled from: Emitters.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlowCollector f40906a;

        /* compiled from: Emitters.kt */
        @d(c = "com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2", f = "SwipeableState.kt", l = {223}, m = "emit")
        /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f40907a;

            /* renamed from: b  reason: collision with root package name */
            int f40908b;

            public AnonymousClass1(a aVar) {
                super(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f40907a = obj;
                this.f40908b |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.f40906a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r6
                com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2$1 r0 = (com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f40908b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40908b = r1
                goto L18
            L13:
                com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2$1 r0 = new com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f40907a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f40908b
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.f.b(r6)
                goto L49
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.f.b(r6)
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f40906a
                r2 = r5
                java.util.Map r2 = (java.util.Map) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r3
                if (r2 == 0) goto L49
                r0.f40908b = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                wz.p r5 = wz.p.f75480a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.bottomsheets.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
        }
    }

    public SwipeableState$special$$inlined$filter$1(Flow flow) {
        this.f40905a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, a aVar) {
        Object f11;
        Object collect = this.f40905a.collect(new AnonymousClass2(flowCollector), aVar);
        f11 = b.f();
        if (collect == f11) {
            return collect;
        }
        return p.f75480a;
    }
}
