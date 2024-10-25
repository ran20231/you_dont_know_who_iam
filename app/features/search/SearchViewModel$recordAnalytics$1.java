package com.forsale.app.features.search;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$recordAnalytics$1", f = "SearchViewModel.kt", l = {428}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$recordAnalytics$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36888a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36889b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.CustomEvents f36890c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f36891d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f36892e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Integer f36893f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$recordAnalytics$1(SearchViewModel searchViewModel, AggregatedAllAnalyticsLogger.CustomEvents customEvents, int i11, String str, Integer num, zz.a<? super SearchViewModel$recordAnalytics$1> aVar) {
        super(2, aVar);
        this.f36889b = searchViewModel;
        this.f36890c = customEvents;
        this.f36891d = i11;
        this.f36892e = str;
        this.f36893f = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$recordAnalytics$1(this.f36889b, this.f36890c, this.f36891d, this.f36892e, this.f36893f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36888a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            AggregatedAllAnalyticsLogger r11 = this.f36889b.r();
            AggregatedAllAnalyticsLogger.CustomEvents customEvents = this.f36890c;
            int i12 = this.f36891d;
            String str = this.f36892e;
            Integer num = this.f36893f;
            this.f36888a = 1;
            if (AggregatedAllAnalyticsLoggerKt.v0(r11, customEvents, i12, str, num, false, false, this, 48, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$recordAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
