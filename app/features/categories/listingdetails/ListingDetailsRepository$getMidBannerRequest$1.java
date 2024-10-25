package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {435}, m = "getMidBannerRequest")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$getMidBannerRequest$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25223a;

    /* renamed from: b  reason: collision with root package name */
    Object f25224b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25225c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25226d;

    /* renamed from: e  reason: collision with root package name */
    int f25227e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$getMidBannerRequest$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$getMidBannerRequest$1> aVar) {
        super(aVar);
        this.f25226d = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25225c = obj;
        this.f25227e |= Integer.MIN_VALUE;
        return this.f25226d.D(this);
    }
}
