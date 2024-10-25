package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {333, 328}, m = "logMyListingDetailsAnalytics")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$logMyListingDetailsAnalytics$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25314a;

    /* renamed from: b  reason: collision with root package name */
    Object f25315b;

    /* renamed from: c  reason: collision with root package name */
    Object f25316c;

    /* renamed from: d  reason: collision with root package name */
    Object f25317d;

    /* renamed from: e  reason: collision with root package name */
    Object f25318e;

    /* renamed from: f  reason: collision with root package name */
    Object f25319f;

    /* renamed from: g  reason: collision with root package name */
    boolean f25320g;

    /* renamed from: h  reason: collision with root package name */
    boolean f25321h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f25322i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25323j;

    /* renamed from: x  reason: collision with root package name */
    int f25324x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$logMyListingDetailsAnalytics$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$logMyListingDetailsAnalytics$1> aVar) {
        super(aVar);
        this.f25323j = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25322i = obj;
        this.f25324x |= Integer.MIN_VALUE;
        return this.f25323j.b0(null, false, false, null, null, null, this);
    }
}
