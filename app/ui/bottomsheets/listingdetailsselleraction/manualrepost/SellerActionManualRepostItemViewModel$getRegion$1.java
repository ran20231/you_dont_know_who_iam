package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel", f = "SellerActionManualRepostItemViewModel.kt", l = {156}, m = "getRegion")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$getRegion$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f38746a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f38747b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38748c;

    /* renamed from: d  reason: collision with root package name */
    int f38749d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$getRegion$1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super SellerActionManualRepostItemViewModel$getRegion$1> aVar) {
        super(aVar);
        this.f38748c = sellerActionManualRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object u11;
        this.f38747b = obj;
        this.f38749d |= Integer.MIN_VALUE;
        u11 = this.f38748c.u(0, this);
        return u11;
    }
}
