package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableState", f = "SwipeableState.kt", l = {140, 164, 167}, m = "processNewAnchors$designSystem_forSaleRelease")
/* loaded from: classes3.dex */
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40934a;

    /* renamed from: b  reason: collision with root package name */
    Object f40935b;

    /* renamed from: c  reason: collision with root package name */
    float f40936c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f40937d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40938e;

    /* renamed from: f  reason: collision with root package name */
    int f40939f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, a<? super SwipeableState$processNewAnchors$1> aVar) {
        super(aVar);
        this.f40938e = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40937d = obj;
        this.f40939f |= Integer.MIN_VALUE;
        return this.f40938e.B(null, null, this);
    }
}
