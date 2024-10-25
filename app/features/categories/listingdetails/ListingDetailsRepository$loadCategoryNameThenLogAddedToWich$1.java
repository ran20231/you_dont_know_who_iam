package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {490}, m = "loadCategoryNameThenLogAddedToWich")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25268a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25269b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25270c;

    /* renamed from: d  reason: collision with root package name */
    int f25271d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1> aVar) {
        super(aVar);
        this.f25270c = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25269b = obj;
        this.f25271d |= Integer.MIN_VALUE;
        return this.f25270c.T(this);
    }
}
