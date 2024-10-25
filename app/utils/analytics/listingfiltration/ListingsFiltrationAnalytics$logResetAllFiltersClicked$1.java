package com.forsale.app.utils.analytics.listingfiltration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsFiltrationAnalytics.kt */
@d(c = "com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics", f = "ListingsFiltrationAnalytics.kt", l = {47}, m = "logResetAllFiltersClicked")
/* loaded from: classes3.dex */
public final class ListingsFiltrationAnalytics$logResetAllFiltersClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40052a;

    /* renamed from: b  reason: collision with root package name */
    Object f40053b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40054c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingsFiltrationAnalytics f40055d;

    /* renamed from: e  reason: collision with root package name */
    int f40056e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsFiltrationAnalytics$logResetAllFiltersClicked$1(ListingsFiltrationAnalytics listingsFiltrationAnalytics, zz.a<? super ListingsFiltrationAnalytics$logResetAllFiltersClicked$1> aVar) {
        super(aVar);
        this.f40055d = listingsFiltrationAnalytics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40054c = obj;
        this.f40056e |= Integer.MIN_VALUE;
        return this.f40055d.p(0, null, null, this);
    }
}
