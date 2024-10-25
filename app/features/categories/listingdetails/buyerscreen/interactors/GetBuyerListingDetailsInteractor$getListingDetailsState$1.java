package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetBuyerListingDetailsInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.GetBuyerListingDetailsInteractor", f = "GetBuyerListingDetailsInteractor.kt", l = {PinConfig.BITMAP_LENGTH_DP, 46, 44}, m = "getListingDetailsState")
/* loaded from: classes2.dex */
public final class GetBuyerListingDetailsInteractor$getListingDetailsState$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25949a;

    /* renamed from: b  reason: collision with root package name */
    Object f25950b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25951c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ GetBuyerListingDetailsInteractor f25952d;

    /* renamed from: e  reason: collision with root package name */
    int f25953e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyerListingDetailsInteractor$getListingDetailsState$1(GetBuyerListingDetailsInteractor getBuyerListingDetailsInteractor, zz.a<? super GetBuyerListingDetailsInteractor$getListingDetailsState$1> aVar) {
        super(aVar);
        this.f25952d = getBuyerListingDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25951c = obj;
        this.f25953e |= Integer.MIN_VALUE;
        return this.f25952d.i(null, this);
    }
}
