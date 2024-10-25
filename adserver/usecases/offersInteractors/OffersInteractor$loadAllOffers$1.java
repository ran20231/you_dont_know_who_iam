package com.forsale.adserver.usecases.offersInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor", f = "OffersInteractor.kt", l = {27}, m = "loadAllOffers")
/* loaded from: classes2.dex */
public final class OffersInteractor$loadAllOffers$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20817a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20818b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20819c;

    /* renamed from: d  reason: collision with root package name */
    int f20820d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$loadAllOffers$1(OffersInteractor offersInteractor, a<? super OffersInteractor$loadAllOffers$1> aVar) {
        super(aVar);
        this.f20819c = offersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20818b = obj;
        this.f20820d |= Integer.MIN_VALUE;
        return this.f20819c.j(this);
    }
}
