package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {1137, 1154, 1205}, m = "getListingItemDetailsForAddListingParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getListingItemDetailsForAddListingParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39773a;

    /* renamed from: b  reason: collision with root package name */
    Object f39774b;

    /* renamed from: c  reason: collision with root package name */
    Object f39775c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f39776d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39777e;

    /* renamed from: f  reason: collision with root package name */
    int f39778f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getListingItemDetailsForAddListingParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getListingItemDetailsForAddListingParameters$1> aVar) {
        super(aVar);
        this.f39777e = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39776d = obj;
        this.f39778f |= Integer.MIN_VALUE;
        return this.f39777e.L(null, this);
    }
}
