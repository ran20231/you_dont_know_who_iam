package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel", f = "SellerActionManualRepostItemViewModel.kt", l = {138, 140}, m = "refreshUser")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$refreshUser$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f38764a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f38765b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38766c;

    /* renamed from: d  reason: collision with root package name */
    int f38767d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$refreshUser$1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super SellerActionManualRepostItemViewModel$refreshUser$1> aVar) {
        super(aVar);
        this.f38766c = sellerActionManualRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object P;
        this.f38765b = obj;
        this.f38767d |= Integer.MIN_VALUE;
        P = this.f38766c.P(this);
        return P;
    }
}
