package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {753}, m = "getCategoryParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getCategoryParameters$4 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39746a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39747b;

    /* renamed from: c  reason: collision with root package name */
    int f39748c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getCategoryParameters$4(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getCategoryParameters$4> aVar) {
        super(aVar);
        this.f39747b = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39746a = obj;
        this.f39748c |= Integer.MIN_VALUE;
        return this.f39747b.t(null, null, this);
    }
}
