package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt", f = "AggregatedAllAnalyticsLogger.kt", l = {2396}, m = "logAgentVisitedEvent")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39830a;

    /* renamed from: b  reason: collision with root package name */
    Object f39831b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f39832c;

    /* renamed from: d  reason: collision with root package name */
    int f39833d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1(zz.a<? super AggregatedAllAnalyticsLoggerKt$logAgentVisitedEvent$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39832c = obj;
        this.f39833d |= Integer.MIN_VALUE;
        return AggregatedAllAnalyticsLoggerKt.v(null, null, this);
    }
}
