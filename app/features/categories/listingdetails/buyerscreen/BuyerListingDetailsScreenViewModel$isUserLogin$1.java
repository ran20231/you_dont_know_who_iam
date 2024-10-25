package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel", f = "BuyerListingDetailsScreenViewModel.kt", l = {392}, m = "isUserLogin")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$isUserLogin$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25699a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25700b;

    /* renamed from: c  reason: collision with root package name */
    int f25701c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$isUserLogin$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$isUserLogin$1> aVar) {
        super(aVar);
        this.f25700b = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B0;
        this.f25699a = obj;
        this.f25701c |= Integer.MIN_VALUE;
        B0 = this.f25700b.B0(this);
        return B0;
    }
}
