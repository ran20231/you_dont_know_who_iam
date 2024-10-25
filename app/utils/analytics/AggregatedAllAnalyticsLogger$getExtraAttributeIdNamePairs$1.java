package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {1340}, m = "getExtraAttributeIdNamePairs")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39760b;

    /* renamed from: c  reason: collision with root package name */
    int f39761c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1> aVar) {
        super(aVar);
        this.f39760b = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39759a = obj;
        this.f39761c |= Integer.MIN_VALUE;
        return this.f39760b.C(null, this);
    }
}
