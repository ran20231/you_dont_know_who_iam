package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {209}, m = "initTranslation")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$initTranslation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25238a;

    /* renamed from: b  reason: collision with root package name */
    Object f25239b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25240c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25241d;

    /* renamed from: e  reason: collision with root package name */
    int f25242e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$initTranslation$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$initTranslation$1> aVar) {
        super(aVar);
        this.f25241d = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object L;
        this.f25240c = obj;
        this.f25242e |= Integer.MIN_VALUE;
        L = this.f25241d.L(null, this);
        return L;
    }
}
