package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipingOverlayInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor", f = "SwipingOverlayInteractor.kt", l = {29, 35, 36, PinConfig.BITMAP_LENGTH_DP}, m = "displaySwipingOverlay")
/* loaded from: classes2.dex */
public final class SwipingOverlayInteractor$displaySwipingOverlay$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26025a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f26026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipingOverlayInteractor f26027c;

    /* renamed from: d  reason: collision with root package name */
    int f26028d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipingOverlayInteractor$displaySwipingOverlay$1(SwipingOverlayInteractor swipingOverlayInteractor, zz.a<? super SwipingOverlayInteractor$displaySwipingOverlay$1> aVar) {
        super(aVar);
        this.f26027c = swipingOverlayInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e11;
        this.f26026b = obj;
        this.f26028d |= Integer.MIN_VALUE;
        e11 = this.f26027c.e(this);
        return e11;
    }
}
