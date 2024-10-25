package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipingOverlayInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor", f = "SwipingOverlayInteractor.kt", l = {24, 25}, m = "updateSwipingOverlaySettings")
/* loaded from: classes2.dex */
public final class SwipingOverlayInteractor$updateSwipingOverlaySettings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26037a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f26038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipingOverlayInteractor f26039c;

    /* renamed from: d  reason: collision with root package name */
    int f26040d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipingOverlayInteractor$updateSwipingOverlaySettings$1(SwipingOverlayInteractor swipingOverlayInteractor, zz.a<? super SwipingOverlayInteractor$updateSwipingOverlaySettings$1> aVar) {
        super(aVar);
        this.f26039c = swipingOverlayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26038b = obj;
        this.f26040d |= Integer.MIN_VALUE;
        return this.f26039c.i(this);
    }
}
