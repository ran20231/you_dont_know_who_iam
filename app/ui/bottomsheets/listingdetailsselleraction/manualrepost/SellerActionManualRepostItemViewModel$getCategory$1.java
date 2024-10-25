package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel", f = "SellerActionManualRepostItemViewModel.kt", l = {146}, m = "getCategory")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$getCategory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f38742a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f38743b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38744c;

    /* renamed from: d  reason: collision with root package name */
    int f38745d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$getCategory$1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super SellerActionManualRepostItemViewModel$getCategory$1> aVar) {
        super(aVar);
        this.f38744c = sellerActionManualRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o11;
        this.f38743b = obj;
        this.f38745d |= Integer.MIN_VALUE;
        o11 = this.f38744c.o(0, this);
        return o11;
    }
}
