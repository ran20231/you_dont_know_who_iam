package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel", f = "BuyerListingDetailsScreenViewModel.kt", l = {763, 765, 768}, m = "postFollow")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$postFollow$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25773a;

    /* renamed from: b  reason: collision with root package name */
    Object f25774b;

    /* renamed from: c  reason: collision with root package name */
    boolean f25775c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25776d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25777e;

    /* renamed from: f  reason: collision with root package name */
    int f25778f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$postFollow$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$postFollow$1> aVar) {
        super(aVar);
        this.f25777e = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object Z0;
        this.f25776d = obj;
        this.f25778f |= Integer.MIN_VALUE;
        Z0 = this.f25777e.Z0(false, this);
        return Z0;
    }
}
