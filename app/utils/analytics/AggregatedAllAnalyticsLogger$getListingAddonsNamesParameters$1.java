package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {1299}, m = "getListingAddonsNamesParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getListingAddonsNamesParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39769a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f39770b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39771c;

    /* renamed from: d  reason: collision with root package name */
    int f39772d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getListingAddonsNamesParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getListingAddonsNamesParameters$1> aVar) {
        super(aVar);
        this.f39771c = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object G;
        this.f39770b = obj;
        this.f39772d |= Integer.MIN_VALUE;
        G = this.f39771c.G(null, 0, this);
        return G;
    }
}
