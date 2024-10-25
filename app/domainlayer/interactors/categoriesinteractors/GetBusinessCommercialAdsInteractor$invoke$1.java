package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetBusinessCommercialAdsInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor", f = "GetBusinessCommercialAdsInteractor.kt", l = {16}, m = "invoke")
/* loaded from: classes2.dex */
public final class GetBusinessCommercialAdsInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f22389a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetBusinessCommercialAdsInteractor f22390b;

    /* renamed from: c  reason: collision with root package name */
    int f22391c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBusinessCommercialAdsInteractor$invoke$1(GetBusinessCommercialAdsInteractor getBusinessCommercialAdsInteractor, zz.a<? super GetBusinessCommercialAdsInteractor$invoke$1> aVar) {
        super(aVar);
        this.f22390b = getBusinessCommercialAdsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22389a = obj;
        this.f22391c |= Integer.MIN_VALUE;
        return this.f22390b.a(0, this);
    }
}
