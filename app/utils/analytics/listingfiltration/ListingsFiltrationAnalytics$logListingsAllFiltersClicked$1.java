package com.forsale.app.utils.analytics.listingfiltration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsFiltrationAnalytics.kt */
@d(c = "com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics", f = "ListingsFiltrationAnalytics.kt", l = {19}, m = "logListingsAllFiltersClicked")
/* loaded from: classes3.dex */
public final class ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40047a;

    /* renamed from: b  reason: collision with root package name */
    Object f40048b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40049c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingsFiltrationAnalytics f40050d;

    /* renamed from: e  reason: collision with root package name */
    int f40051e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1(ListingsFiltrationAnalytics listingsFiltrationAnalytics, zz.a<? super ListingsFiltrationAnalytics$logListingsAllFiltersClicked$1> aVar) {
        super(aVar);
        this.f40050d = listingsFiltrationAnalytics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40049c = obj;
        this.f40051e |= Integer.MIN_VALUE;
        return this.f40050d.o(0, this);
    }
}
