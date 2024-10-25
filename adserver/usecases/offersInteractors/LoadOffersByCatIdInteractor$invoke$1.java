package com.forsale.adserver.usecases.offersInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadOffersByCatIdInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersByCatIdInteractor", f = "LoadOffersByCatIdInteractor.kt", l = {17, 19, 20}, m = "invoke")
/* loaded from: classes2.dex */
public final class LoadOffersByCatIdInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20773a;

    /* renamed from: b  reason: collision with root package name */
    Object f20774b;

    /* renamed from: c  reason: collision with root package name */
    int f20775c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f20776d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LoadOffersByCatIdInteractor f20777e;

    /* renamed from: f  reason: collision with root package name */
    int f20778f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersByCatIdInteractor$invoke$1(LoadOffersByCatIdInteractor loadOffersByCatIdInteractor, a<? super LoadOffersByCatIdInteractor$invoke$1> aVar) {
        super(aVar);
        this.f20777e = loadOffersByCatIdInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20776d = obj;
        this.f20778f |= Integer.MIN_VALUE;
        return this.f20777e.b(0, null, 0, this);
    }
}
