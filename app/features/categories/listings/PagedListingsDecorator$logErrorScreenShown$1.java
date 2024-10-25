package com.forsale.app.features.categories.listings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagedListingsDecorator.kt */
@d(c = "com.forsale.app.features.categories.listings.PagedListingsDecorator", f = "PagedListingsDecorator.kt", l = {193}, m = "logErrorScreenShown")
/* loaded from: classes2.dex */
public final class PagedListingsDecorator$logErrorScreenShown$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f28034a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PagedListingsDecorator f28036c;

    /* renamed from: d  reason: collision with root package name */
    int f28037d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedListingsDecorator$logErrorScreenShown$1(PagedListingsDecorator pagedListingsDecorator, a<? super PagedListingsDecorator$logErrorScreenShown$1> aVar) {
        super(aVar);
        this.f28036c = pagedListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28035b = obj;
        this.f28037d |= Integer.MIN_VALUE;
        return this.f28036c.q(null, null, this);
    }
}
