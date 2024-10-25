package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel", f = "ListingDetailsViewModel.kt", l = {382}, m = "getListingsSourceIfModified")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$getListingsSourceIfModified$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25380b;

    /* renamed from: c  reason: collision with root package name */
    int f25381c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$getListingsSourceIfModified$1(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super ListingDetailsViewModel$getListingsSourceIfModified$1> aVar) {
        super(aVar);
        this.f25380b = listingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25379a = obj;
        this.f25381c |= Integer.MIN_VALUE;
        return this.f25380b.c1(this);
    }
}
