package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {513}, m = "loadDistricts")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$loadDistricts$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25272a;

    /* renamed from: b  reason: collision with root package name */
    Object f25273b;

    /* renamed from: c  reason: collision with root package name */
    Object f25274c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25275d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25276e;

    /* renamed from: f  reason: collision with root package name */
    int f25277f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$loadDistricts$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$loadDistricts$1> aVar) {
        super(aVar);
        this.f25276e = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object U;
        this.f25275d = obj;
        this.f25277f |= Integer.MIN_VALUE;
        U = this.f25276e.U(null, this);
        return U;
    }
}
