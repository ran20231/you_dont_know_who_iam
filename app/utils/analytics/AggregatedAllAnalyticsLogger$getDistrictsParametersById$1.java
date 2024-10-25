package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {804}, m = "getDistrictsParametersById")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getDistrictsParametersById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39752a;

    /* renamed from: b  reason: collision with root package name */
    Object f39753b;

    /* renamed from: c  reason: collision with root package name */
    Object f39754c;

    /* renamed from: d  reason: collision with root package name */
    Object f39755d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f39756e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39757f;

    /* renamed from: g  reason: collision with root package name */
    int f39758g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getDistrictsParametersById$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getDistrictsParametersById$1> aVar) {
        super(aVar);
        this.f39757f = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39756e = obj;
        this.f39758g |= Integer.MIN_VALUE;
        return this.f39757f.A(null, null, this);
    }
}
