package com.forsale.adserver.usecases.offersInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor", f = "OffersInteractor.kt", l = {69}, m = "shuffleWeightedOffersList")
/* loaded from: classes2.dex */
public final class OffersInteractor$shuffleWeightedOffersList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20831a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20832b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20833c;

    /* renamed from: d  reason: collision with root package name */
    int f20834d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$shuffleWeightedOffersList$1(OffersInteractor offersInteractor, a<? super OffersInteractor$shuffleWeightedOffersList$1> aVar) {
        super(aVar);
        this.f20833c = offersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p11;
        this.f20832b = obj;
        this.f20834d |= Integer.MIN_VALUE;
        p11 = this.f20833c.p(null, this);
        return p11;
    }
}
