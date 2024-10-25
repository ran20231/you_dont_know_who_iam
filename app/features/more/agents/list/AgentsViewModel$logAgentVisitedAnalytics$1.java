package com.forsale.app.features.more.agents.list;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AgentsViewModel.kt */
@d(c = "com.forsale.app.features.more.agents.list.AgentsViewModel$logAgentVisitedAnalytics$1", f = "AgentsViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AgentsViewModel$logAgentVisitedAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31674a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AgentsViewModel f31675b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31676c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentsViewModel$logAgentVisitedAnalytics$1(AgentsViewModel agentsViewModel, int i11, zz.a<? super AgentsViewModel$logAgentVisitedAnalytics$1> aVar) {
        super(2, aVar);
        this.f31675b = agentsViewModel;
        this.f31676c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AgentsViewModel$logAgentVisitedAnalytics$1(this.f31675b, this.f31676c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Integer d11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31674a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AggregatedAllAnalyticsLogger r11 = this.f31675b.r();
            int i12 = this.f31676c;
            if (i12 == 0) {
                d11 = null;
            } else {
                d11 = kotlin.coroutines.jvm.internal.a.d(i12);
            }
            this.f31674a = 1;
            if (AggregatedAllAnalyticsLoggerKt.v(r11, d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AgentsViewModel$logAgentVisitedAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
