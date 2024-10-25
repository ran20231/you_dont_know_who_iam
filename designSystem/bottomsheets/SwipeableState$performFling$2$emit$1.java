package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableState$performFling$2", f = "SwipeableState.kt", l = {348, 350}, m = "emit")
/* loaded from: classes3.dex */
public final class SwipeableState$performFling$2$emit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40930a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40931b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeableState$performFling$2 f40932c;

    /* renamed from: d  reason: collision with root package name */
    int f40933d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$performFling$2$emit$1(SwipeableState$performFling$2 swipeableState$performFling$2, a<? super SwipeableState$performFling$2$emit$1> aVar) {
        super(aVar);
        this.f40932c = swipeableState$performFling$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40931b = obj;
        this.f40933d |= Integer.MIN_VALUE;
        return this.f40932c.emit(null, this);
    }
}
