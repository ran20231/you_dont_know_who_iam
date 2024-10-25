package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {1351, 1352}, m = "getExtraAttributeNameValuePairs")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getExtraAttributeNameValuePairs$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39763a;

    /* renamed from: b  reason: collision with root package name */
    Object f39764b;

    /* renamed from: c  reason: collision with root package name */
    Object f39765c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f39766d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39767e;

    /* renamed from: f  reason: collision with root package name */
    int f39768f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getExtraAttributeNameValuePairs$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getExtraAttributeNameValuePairs$1> aVar) {
        super(aVar);
        this.f39767e = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object D;
        this.f39766d = obj;
        this.f39768f |= Integer.MIN_VALUE;
        D = this.f39767e.D(null, this);
        return D;
    }
}
