package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {441}, m = "getContentMapping")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$getContentMapping$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25217a;

    /* renamed from: b  reason: collision with root package name */
    Object f25218b;

    /* renamed from: c  reason: collision with root package name */
    Object f25219c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f25220d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25221e;

    /* renamed from: f  reason: collision with root package name */
    int f25222f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$getContentMapping$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$getContentMapping$1> aVar) {
        super(aVar);
        this.f25221e = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object w11;
        this.f25220d = obj;
        this.f25222f |= Integer.MIN_VALUE;
        w11 = this.f25221e.w(this);
        return w11;
    }
}
