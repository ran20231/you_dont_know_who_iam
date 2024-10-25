package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {792}, m = "getDistrictIds")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getDistrictIds$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39750b;

    /* renamed from: c  reason: collision with root package name */
    int f39751c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getDistrictIds$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getDistrictIds$1> aVar) {
        super(aVar);
        this.f39750b = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39749a = obj;
        this.f39751c |= Integer.MIN_VALUE;
        return this.f39750b.x(null, this);
    }
}
