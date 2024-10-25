package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDetailsProcessors.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor", f = "ListingsDetailsProcessors.kt", l = {92}, m = "execute")
/* loaded from: classes2.dex */
public final class CommercialListingDetailsProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37687a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37688b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CommercialListingDetailsProcessor f37689c;

    /* renamed from: d  reason: collision with root package name */
    int f37690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListingDetailsProcessor$execute$1(CommercialListingDetailsProcessor commercialListingDetailsProcessor, zz.a<? super CommercialListingDetailsProcessor$execute$1> aVar) {
        super(aVar);
        this.f37689c = commercialListingDetailsProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37688b = obj;
        this.f37690d |= Integer.MIN_VALUE;
        return this.f37689c.b(null, null, null, null, this);
    }
}
