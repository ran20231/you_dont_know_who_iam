package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.OfferDetailsLinkProcessor", f = "OffersLinkProcessor.kt", l = {29}, m = "execute")
/* loaded from: classes2.dex */
public final class OfferDetailsLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37744a;

    /* renamed from: b  reason: collision with root package name */
    Object f37745b;

    /* renamed from: c  reason: collision with root package name */
    int f37746c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f37747d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ OfferDetailsLinkProcessor f37748e;

    /* renamed from: f  reason: collision with root package name */
    int f37749f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailsLinkProcessor$execute$1(OfferDetailsLinkProcessor offerDetailsLinkProcessor, zz.a<? super OfferDetailsLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37748e = offerDetailsLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37747d = obj;
        this.f37749f |= Integer.MIN_VALUE;
        return this.f37748e.a(null, null, null, null, this);
    }
}
