package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {417, 414}, m = "logListingDetailsAction")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$logListingDetailsAction$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25303a;

    /* renamed from: b  reason: collision with root package name */
    Object f25304b;

    /* renamed from: c  reason: collision with root package name */
    Object f25305c;

    /* renamed from: d  reason: collision with root package name */
    Object f25306d;

    /* renamed from: e  reason: collision with root package name */
    Object f25307e;

    /* renamed from: f  reason: collision with root package name */
    Object f25308f;

    /* renamed from: g  reason: collision with root package name */
    Object f25309g;

    /* renamed from: h  reason: collision with root package name */
    int f25310h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f25311i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25312j;

    /* renamed from: x  reason: collision with root package name */
    int f25313x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$logListingDetailsAction$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$logListingDetailsAction$1> aVar) {
        super(aVar);
        this.f25312j = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25311i = obj;
        this.f25313x |= Integer.MIN_VALUE;
        return this.f25312j.a0(null, 0, null, null, null, this);
    }
}
