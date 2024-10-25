package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {757}, m = "getPositionCategoryParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39793a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f39794b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39795c;

    /* renamed from: d  reason: collision with root package name */
    int f39796d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1> aVar) {
        super(aVar);
        this.f39795c = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39794b = obj;
        this.f39796d |= Integer.MIN_VALUE;
        return this.f39795c.T(0, this);
    }
}
