package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {291, 298, 300, 301, 292}, m = "loadRecommendedListings")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$loadRecommendedListings$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25278a;

    /* renamed from: b  reason: collision with root package name */
    Object f25279b;

    /* renamed from: c  reason: collision with root package name */
    Object f25280c;

    /* renamed from: d  reason: collision with root package name */
    Object f25281d;

    /* renamed from: e  reason: collision with root package name */
    Object f25282e;

    /* renamed from: f  reason: collision with root package name */
    int f25283f;

    /* renamed from: g  reason: collision with root package name */
    int f25284g;

    /* renamed from: h  reason: collision with root package name */
    int f25285h;

    /* renamed from: i  reason: collision with root package name */
    int f25286i;

    /* renamed from: j  reason: collision with root package name */
    /* synthetic */ Object f25287j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25288x;

    /* renamed from: y  reason: collision with root package name */
    int f25289y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$loadRecommendedListings$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$loadRecommendedListings$1> aVar) {
        super(aVar);
        this.f25288x = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25287j = obj;
        this.f25289y |= Integer.MIN_VALUE;
        return this.f25288x.W(this);
    }
}
