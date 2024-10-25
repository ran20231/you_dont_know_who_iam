package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDetailsProcessors.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.CommercialListingDetailsProcessor", f = "ListingsDetailsProcessors.kt", l = {100}, m = "loadAdv")
/* loaded from: classes2.dex */
public final class CommercialListingDetailsProcessor$loadAdv$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f37691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialListingDetailsProcessor f37692b;

    /* renamed from: c  reason: collision with root package name */
    int f37693c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialListingDetailsProcessor$loadAdv$1(CommercialListingDetailsProcessor commercialListingDetailsProcessor, zz.a<? super CommercialListingDetailsProcessor$loadAdv$1> aVar) {
        super(aVar);
        this.f37692b = commercialListingDetailsProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c11;
        this.f37691a = obj;
        this.f37693c |= Integer.MIN_VALUE;
        c11 = this.f37692b.c(null, this);
        return c11;
    }
}
