package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipingOverlayInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor", f = "SwipingOverlayInteractor.kt", l = {l8.a.f62266c, 53}, m = "updateSwipingOverlaySessionCount")
/* loaded from: classes2.dex */
public final class SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26033a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f26034b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipingOverlayInteractor f26035c;

    /* renamed from: d  reason: collision with root package name */
    int f26036d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1(SwipingOverlayInteractor swipingOverlayInteractor, zz.a<? super SwipingOverlayInteractor$updateSwipingOverlaySessionCount$1> aVar) {
        super(aVar);
        this.f26035c = swipingOverlayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g11;
        this.f26034b = obj;
        this.f26036d |= Integer.MIN_VALUE;
        g11 = this.f26035c.g(this);
        return g11;
    }
}
