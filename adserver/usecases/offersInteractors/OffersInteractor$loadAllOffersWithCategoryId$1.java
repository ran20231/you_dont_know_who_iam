package com.forsale.adserver.usecases.offersInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor", f = "OffersInteractor.kt", l = {35}, m = "loadAllOffersWithCategoryId")
/* loaded from: classes2.dex */
public final class OffersInteractor$loadAllOffersWithCategoryId$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    int f20821a;

    /* renamed from: b  reason: collision with root package name */
    Object f20822b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f20823c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20824d;

    /* renamed from: e  reason: collision with root package name */
    int f20825e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$loadAllOffersWithCategoryId$1(OffersInteractor offersInteractor, a<? super OffersInteractor$loadAllOffersWithCategoryId$1> aVar) {
        super(aVar);
        this.f20824d = offersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20823c = obj;
        this.f20825e |= Integer.MIN_VALUE;
        return this.f20824d.k(0, this);
    }
}
