package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableStateKt$preUpPostDownNestedScrollConnection$1", f = "SwipeableState.kt", l = {845}, m = "onPreFling-QWom1Mo")
/* loaded from: classes3.dex */
public final class SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    long f40960a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeableStateKt$preUpPostDownNestedScrollConnection$1 f40962c;

    /* renamed from: d  reason: collision with root package name */
    int f40963d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableStateKt$preUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableStateKt$preUpPostDownNestedScrollConnection$1 swipeableStateKt$preUpPostDownNestedScrollConnection$1, a aVar) {
        super(aVar);
        this.f40962c = swipeableStateKt$preUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40961b = obj;
        this.f40963d |= Integer.MIN_VALUE;
        return this.f40962c.G(0L, this);
    }
}
