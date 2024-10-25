package com.forsale.app.utils.analytics.listingfiltration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsFiltrationAnalytics.kt */
@d(c = "com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics", f = "ListingsFiltrationAnalytics.kt", l = {79}, m = "generateFilterAnalyticsData")
/* loaded from: classes3.dex */
public final class ListingsFiltrationAnalytics$generateFilterAnalyticsData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    boolean f40032a;

    /* renamed from: b  reason: collision with root package name */
    int f40033b;

    /* renamed from: c  reason: collision with root package name */
    Object f40034c;

    /* renamed from: d  reason: collision with root package name */
    Object f40035d;

    /* renamed from: e  reason: collision with root package name */
    Object f40036e;

    /* renamed from: f  reason: collision with root package name */
    Object f40037f;

    /* renamed from: g  reason: collision with root package name */
    Object f40038g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f40039h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ ListingsFiltrationAnalytics f40040i;

    /* renamed from: j  reason: collision with root package name */
    int f40041j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsFiltrationAnalytics$generateFilterAnalyticsData$1(ListingsFiltrationAnalytics listingsFiltrationAnalytics, zz.a<? super ListingsFiltrationAnalytics$generateFilterAnalyticsData$1> aVar) {
        super(aVar);
        this.f40040i = listingsFiltrationAnalytics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.f40039h = obj;
        this.f40041j |= Integer.MIN_VALUE;
        d11 = this.f40040i.d(0, null, false, this);
        return d11;
    }
}
