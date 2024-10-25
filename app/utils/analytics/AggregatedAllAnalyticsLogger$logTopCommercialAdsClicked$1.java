package com.forsale.app.utils.analytics;

import g00.p;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AggregatedAllAnalyticsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1", f = "AggregatedAllAnalyticsLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39807a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ui.a f39808b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger f39809c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1(ui.a aVar, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, zz.a<? super AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1> aVar2) {
        super(2, aVar2);
        this.f39808b = aVar;
        this.f39809c = aggregatedAllAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1(this.f39808b, this.f39809c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map f11;
        Map f12;
        Map o11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f39807a == 0) {
            kotlin.f.b(obj);
            f11 = i0.f(wz.i.a("Vertical", this.f39808b.c()));
            f12 = i0.f(wz.i.a("SourceSectionOrder", kotlin.coroutines.jvm.internal.a.d(this.f39808b.a())));
            o11 = j0.o(f11, f12);
            AggregatedAllAnalyticsLogger.h(this.f39809c, "Top Commercial Ads Tap Clicked", o11, null, null, null, true, false, false, false, 476, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
