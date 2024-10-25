package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {710}, m = "getCategoryParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getCategoryParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39742a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f39743b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39744c;

    /* renamed from: d  reason: collision with root package name */
    int f39745d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getCategoryParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getCategoryParameters$1> aVar) {
        super(aVar);
        this.f39744c = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39743b = obj;
        this.f39745d |= Integer.MIN_VALUE;
        return this.f39744c.s(0, this);
    }
}
