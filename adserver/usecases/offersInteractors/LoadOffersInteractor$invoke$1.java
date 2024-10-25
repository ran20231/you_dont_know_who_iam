package com.forsale.adserver.usecases.offersInteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadOffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersInteractor", f = "LoadOffersInteractor.kt", l = {35, 36}, m = "invoke")
/* loaded from: classes2.dex */
public final class LoadOffersInteractor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20796a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20797b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoadOffersInteractor f20798c;

    /* renamed from: d  reason: collision with root package name */
    int f20799d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersInteractor$invoke$1(LoadOffersInteractor loadOffersInteractor, a<? super LoadOffersInteractor$invoke$1> aVar) {
        super(aVar);
        this.f20798c = loadOffersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20797b = obj;
        this.f20799d |= Integer.MIN_VALUE;
        return this.f20798c.b(null, null, 0, this);
    }
}
