package com.forsale.app.utils.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger", f = "AggregatedAllAnalyticsLogger.kt", l = {967, 990, 1049}, m = "getAddEditListingItemDetailsParameters")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$getAddEditListingItemDetailsParameters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39735a;

    /* renamed from: b  reason: collision with root package name */
    Object f39736b;

    /* renamed from: c  reason: collision with root package name */
    Object f39737c;

    /* renamed from: d  reason: collision with root package name */
    Object f39738d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f39739e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39740f;

    /* renamed from: g  reason: collision with root package name */
    int f39741g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$getAddEditListingItemDetailsParameters$1(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$getAddEditListingItemDetailsParameters$1> aVar) {
        super(aVar);
        this.f39740f = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39739e = obj;
        this.f39741g |= Integer.MIN_VALUE;
        return this.f39740f.j(null, this);
    }
}
