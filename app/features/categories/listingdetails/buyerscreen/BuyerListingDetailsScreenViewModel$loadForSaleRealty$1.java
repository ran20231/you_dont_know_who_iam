package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.google.logging.type.LogSeverity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel", f = "BuyerListingDetailsScreenViewModel.kt", l = {LogSeverity.ALERT_VALUE, 701}, m = "loadForSaleRealty")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$loadForSaleRealty$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25702a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25703b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25704c;

    /* renamed from: d  reason: collision with root package name */
    int f25705d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$loadForSaleRealty$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$loadForSaleRealty$1> aVar) {
        super(aVar);
        this.f25704c = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object C0;
        this.f25703b = obj;
        this.f25705d |= Integer.MIN_VALUE;
        C0 = this.f25704c.C0(this);
        return C0;
    }
}
