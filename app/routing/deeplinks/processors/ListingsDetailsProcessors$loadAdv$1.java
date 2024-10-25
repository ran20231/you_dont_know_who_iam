package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDetailsProcessors.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors", f = "ListingsDetailsProcessors.kt", l = {l8.a.f62266c}, m = "loadAdv")
/* loaded from: classes2.dex */
public final class ListingsDetailsProcessors$loadAdv$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f37714a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingsDetailsProcessors f37715b;

    /* renamed from: c  reason: collision with root package name */
    int f37716c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDetailsProcessors$loadAdv$1(ListingsDetailsProcessors listingsDetailsProcessors, zz.a<? super ListingsDetailsProcessors$loadAdv$1> aVar) {
        super(aVar);
        this.f37715b = listingsDetailsProcessors;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c11;
        this.f37714a = obj;
        this.f37716c |= Integer.MIN_VALUE;
        c11 = this.f37715b.c(null, this);
        return c11;
    }
}
