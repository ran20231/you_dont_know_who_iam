package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.HomeVisitedReleaseName;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$logHomeScreenVisited$1", f = "PropertyHomeViewModel.kt", l = {464}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$logHomeScreenVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24839a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24840b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$logHomeScreenVisited$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$logHomeScreenVisited$1> aVar) {
        super(2, aVar);
        this.f24840b = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$logHomeScreenVisited$1(this.f24840b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        HomeVisitedSources F;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24839a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f24840b.f24797h;
            CategoryEntity w11 = this.f24840b.w();
            HomeVisitedReleaseName homeVisitedReleaseName = HomeVisitedReleaseName.VERTICAL_PAGE;
            F = this.f24840b.F();
            this.f24839a = 1;
            if (AggregatedAllAnalyticsLoggerKt.Q(aggregatedAllAnalyticsLogger, homeVisitedReleaseName, w11, F, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$logHomeScreenVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
