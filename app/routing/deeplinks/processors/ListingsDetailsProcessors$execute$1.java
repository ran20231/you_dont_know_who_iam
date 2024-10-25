package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsDetailsProcessors.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.ListingsDetailsProcessors", f = "ListingsDetailsProcessors.kt", l = {41}, m = "execute")
/* loaded from: classes2.dex */
public final class ListingsDetailsProcessors$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37709a;

    /* renamed from: b  reason: collision with root package name */
    Object f37710b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37711c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingsDetailsProcessors f37712d;

    /* renamed from: e  reason: collision with root package name */
    int f37713e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsDetailsProcessors$execute$1(ListingsDetailsProcessors listingsDetailsProcessors, zz.a<? super ListingsDetailsProcessors$execute$1> aVar) {
        super(aVar);
        this.f37712d = listingsDetailsProcessors;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37711c = obj;
        this.f37713e |= Integer.MIN_VALUE;
        return this.f37712d.b(null, null, null, null, this);
    }
}
