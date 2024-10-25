package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {136, 142, 143, 144, 145}, m = "fetchListingDetails")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$fetchListingDetails$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25207a;

    /* renamed from: b  reason: collision with root package name */
    Object f25208b;

    /* renamed from: c  reason: collision with root package name */
    Object f25209c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25210d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25211e;

    /* renamed from: f  reason: collision with root package name */
    int f25212f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$fetchListingDetails$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$fetchListingDetails$1> aVar) {
        super(aVar);
        this.f25211e = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25210d = obj;
        this.f25212f |= Integer.MIN_VALUE;
        return this.f25211e.r(null, null, null, this);
    }
}
