package com.forsale.app.features.categories.listingdetails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository", f = "ListingDetailsRepository.kt", l = {189, 190}, m = "initAttributes")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$initAttributes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25231a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25232b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25233c;

    /* renamed from: d  reason: collision with root package name */
    int f25234d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$initAttributes$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$initAttributes$1> aVar) {
        super(aVar);
        this.f25233c = listingDetailsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object J;
        this.f25232b = obj;
        this.f25234d |= Integer.MIN_VALUE;
        J = this.f25233c.J(null, this);
        return J;
    }
}
