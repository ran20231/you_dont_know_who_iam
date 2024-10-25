package com.forsale.app.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: OneShotEventHandler.kt */
/* loaded from: classes3.dex */
public final class OneShotEventHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f39623a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableSharedFlow<T> f39624b;

    /* renamed from: c  reason: collision with root package name */
    private T f39625c;

    public OneShotEventHandler() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(OneShotEventHandler oneShotEventHandler, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        oneShotEventHandler.c(obj);
    }

    public final void c(T t11) {
        this.f39625c = t11;
        i(t11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlinx.coroutines.flow.FlowCollector<? super T> r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.OneShotEventHandler$collect$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.OneShotEventHandler$collect$1 r0 = (com.forsale.app.utils.OneShotEventHandler$collect$1) r0
            int r1 = r0.f39628c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39628c = r1
            goto L18
        L13:
            com.forsale.app.utils.OneShotEventHandler$collect$1 r0 = new com.forsale.app.utils.OneShotEventHandler$collect$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39626a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39628c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.f.b(r6)
            goto L3f
        L31:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.MutableSharedFlow<T> r6 = r4.f39624b
            r0.f39628c = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.OneShotEventHandler.e(kotlinx.coroutines.flow.FlowCollector, zz.a):java.lang.Object");
    }

    public final Object f(T t11, zz.a<? super wz.p> aVar) {
        Object f11;
        this.f39625c = t11;
        Object emit = this.f39624b.emit(t11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (emit == f11) {
            return emit;
        }
        return wz.p.f75480a;
    }

    public final T g() {
        return this.f39625c;
    }

    public final void h(androidx.lifecycle.s owner, FlowCollector<? super T> collector) {
        kotlin.jvm.internal.o.i(owner, "owner");
        kotlin.jvm.internal.o.i(collector, "collector");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(owner), null, null, new OneShotEventHandler$observe$1(owner, this, collector, null), 3, null);
    }

    public final void i(T t11) {
        BuildersKt__Builders_commonKt.launch$default(this.f39623a, null, null, new OneShotEventHandler$postValue$1(this, t11, null), 3, null);
    }

    public final void j() {
        this.f39624b.resetReplayCache();
    }

    public final boolean k(T t11) {
        return this.f39624b.tryEmit(t11);
    }

    public OneShotEventHandler(T t11, int i11) {
        this.f39623a = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.f39624b = SharedFlowKt.MutableSharedFlow$default(i11, 0, null, 6, null);
        this.f39625c = t11;
        if (t11 != null) {
            i(t11);
        }
    }

    public /* synthetic */ OneShotEventHandler(Object obj, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : obj, (i12 & 2) != 0 ? 0 : i11);
    }
}
