package com.forsale.app.features.welcome.loading;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.welcome.loading.analytics.AppStatusVisitedEvent;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$recordAppStatusScreenVisited$1", f = "LoadingViewModel.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$recordAppStatusScreenVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37286a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37287b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionEntity.AppStatus f37288c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$recordAppStatusScreenVisited$1(LoadingViewModel loadingViewModel, SessionEntity.AppStatus appStatus, zz.a<? super LoadingViewModel$recordAppStatusScreenVisited$1> aVar) {
        super(2, aVar);
        this.f37287b = loadingViewModel;
        this.f37288c = appStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$recordAppStatusScreenVisited$1(this.f37287b, this.f37288c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ForSaleDataTracker forSaleDataTracker;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37286a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            forSaleDataTracker = this.f37287b.f37217z;
            SessionEntity.AppStatus appStatus = this.f37288c;
            aggregatedAllAnalyticsLogger = this.f37287b.f37212h;
            AppStatusVisitedEvent appStatusVisitedEvent = new AppStatusVisitedEvent(appStatus, aggregatedAllAnalyticsLogger.Z());
            this.f37286a = 1;
            if (forSaleDataTracker.a(appStatusVisitedEvent, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$recordAppStatusScreenVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
