package com.forsale.designSystem.bottomsheets;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableState$animateTo$2", f = "SwipeableState.kt", l = {311}, m = "emit")
/* loaded from: classes3.dex */
public final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40920a;

    /* renamed from: b  reason: collision with root package name */
    Object f40921b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40922c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SwipeableState$animateTo$2 f40923d;

    /* renamed from: e  reason: collision with root package name */
    int f40924e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, a<? super SwipeableState$animateTo$2$emit$1> aVar) {
        super(aVar);
        this.f40923d = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40922c = obj;
        this.f40924e |= Integer.MIN_VALUE;
        return this.f40923d.emit(null, this);
    }
}
