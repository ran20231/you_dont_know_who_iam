package com.forsale.app.utils.analytics.listingfiltration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsFiltrationAnalytics.kt */
@d(c = "com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics", f = "ListingsFiltrationAnalytics.kt", l = {32}, m = "logAllFiltersApplyClicked")
/* loaded from: classes3.dex */
public final class ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40043a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40044b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsFiltrationAnalytics f40045c;

    /* renamed from: d  reason: collision with root package name */
    int f40046d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1(ListingsFiltrationAnalytics listingsFiltrationAnalytics, zz.a<? super ListingsFiltrationAnalytics$logAllFiltersApplyClicked$1> aVar) {
        super(aVar);
        this.f40045c = listingsFiltrationAnalytics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40044b = obj;
        this.f40046d |= Integer.MIN_VALUE;
        return this.f40045c.k(0, null, this);
    }
}
