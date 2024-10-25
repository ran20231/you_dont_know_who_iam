package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {717}, m = "getSeeAllPositionCategoryParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39802a;

    /* renamed from: b  reason: collision with root package name */
    Object f39803b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f39804c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39805d;

    /* renamed from: e  reason: collision with root package name */
    int f39806e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1> aVar) {
        super(aVar);
        this.f39805d = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39804c = obj;
        this.f39806e |= Integer.MIN_VALUE;
        return this.f39805d.a0(0, this);
    }
}
