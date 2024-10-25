package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {30, 30, 30}, m = "updateAnalyticsLoggerCountryData")
/* loaded from: classes2.dex */
public final class AnalyticsRepository$updateAnalyticsLoggerCountryData$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnalyticsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsRepository$updateAnalyticsLoggerCountryData$1(AnalyticsRepository analyticsRepository, zz.a<? super AnalyticsRepository$updateAnalyticsLoggerCountryData$1> aVar) {
        super(aVar);
        this.this$0 = analyticsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateAnalyticsLoggerCountryData(this);
    }
}
