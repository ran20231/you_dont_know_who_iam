package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel", f = "BuyerListingDetailsScreenViewModel.kt", l = {523, 529}, m = "updateFavourite")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$updateFavourite$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25826a;

    /* renamed from: b  reason: collision with root package name */
    boolean f25827b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25828c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25829d;

    /* renamed from: e  reason: collision with root package name */
    int f25830e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$updateFavourite$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$updateFavourite$1> aVar) {
        super(aVar);
        this.f25829d = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object w12;
        this.f25828c = obj;
        this.f25830e |= Integer.MIN_VALUE;
        w12 = this.f25829d.w1(false, this);
        return w12;
    }
}
