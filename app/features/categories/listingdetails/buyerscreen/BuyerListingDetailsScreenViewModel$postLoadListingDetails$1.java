package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel", f = "BuyerListingDetailsScreenViewModel.kt", l = {246, 254}, m = "postLoadListingDetails")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$postLoadListingDetails$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25779a;

    /* renamed from: b  reason: collision with root package name */
    Object f25780b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25781c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25782d;

    /* renamed from: e  reason: collision with root package name */
    int f25783e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$postLoadListingDetails$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$postLoadListingDetails$1> aVar) {
        super(aVar);
        this.f25782d = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b12;
        this.f25781c = obj;
        this.f25783e |= Integer.MIN_VALUE;
        b12 = this.f25782d.b1(null, this);
        return b12;
    }
}
