package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipingOverlayInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor", f = "SwipingOverlayInteractor.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "shouldDisplaySwipingOverlay")
/* loaded from: classes2.dex */
public final class SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26029a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f26030b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipingOverlayInteractor f26031c;

    /* renamed from: d  reason: collision with root package name */
    int f26032d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1(SwipingOverlayInteractor swipingOverlayInteractor, zz.a<? super SwipingOverlayInteractor$shouldDisplaySwipingOverlay$1> aVar) {
        super(aVar);
        this.f26031c = swipingOverlayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26030b = obj;
        this.f26032d |= Integer.MIN_VALUE;
        return this.f26031c.f(this);
    }
}
