package com.forsale.adserver.datalayer.local.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApiOffersRepo.kt */
@d(c = "com.forsale.adserver.datalayer.local.repos.ApiOffersRepo", f = "ApiOffersRepo.kt", l = {12}, m = "queryOfferWith")
/* loaded from: classes2.dex */
public final class ApiOffersRepo$queryOfferWith$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20675a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20676b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ApiOffersRepo f20677c;

    /* renamed from: d  reason: collision with root package name */
    int f20678d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiOffersRepo$queryOfferWith$1(ApiOffersRepo apiOffersRepo, a<? super ApiOffersRepo$queryOfferWith$1> aVar) {
        super(aVar);
        this.f20677c = apiOffersRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20676b = obj;
        this.f20678d |= Integer.MIN_VALUE;
        return this.f20677c.a(0, 0, this);
    }
}
