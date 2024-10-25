package com.forsale.adserver.datalayer.offersdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateOffer.kt */
@d(c = "com.forsale.adserver.datalayer.offersdata.OffersFactory", f = "CreateOffer.kt", l = {25, 25}, m = "loadOfferById")
/* loaded from: classes2.dex */
public final class OffersFactory$loadOfferById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20747a;

    /* renamed from: b  reason: collision with root package name */
    int f20748b;

    /* renamed from: c  reason: collision with root package name */
    int f20749c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f20750d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ OffersFactory f20751e;

    /* renamed from: f  reason: collision with root package name */
    int f20752f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersFactory$loadOfferById$1(OffersFactory offersFactory, a<? super OffersFactory$loadOfferById$1> aVar) {
        super(aVar);
        this.f20751e = offersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20750d = obj;
        this.f20752f |= Integer.MIN_VALUE;
        return this.f20751e.g(0, 0, this);
    }
}
