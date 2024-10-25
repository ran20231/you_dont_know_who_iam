package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetBuyerListingDetailsInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor", f = "GetBuyerListingDetailsInteractor.kt", l = {67, 68}, m = "getRegionById")
/* loaded from: classes2.dex */
public final class GetBuyerListingDetailsInteractor$getRegionById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25954a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25955b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GetBuyerListingDetailsInteractor f25956c;

    /* renamed from: d  reason: collision with root package name */
    int f25957d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyerListingDetailsInteractor$getRegionById$1(GetBuyerListingDetailsInteractor getBuyerListingDetailsInteractor, zz.a<? super GetBuyerListingDetailsInteractor$getRegionById$1> aVar) {
        super(aVar);
        this.f25956c = getBuyerListingDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k11;
        this.f25955b = obj;
        this.f25957d |= Integer.MIN_VALUE;
        k11 = this.f25956c.k(null, this);
        return k11;
    }
}
