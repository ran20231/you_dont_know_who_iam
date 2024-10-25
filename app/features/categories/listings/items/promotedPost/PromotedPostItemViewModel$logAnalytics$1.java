package com.forsale.app.features.categories.listings.items.promotedPost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.PromotedPostSource;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$logAnalytics$1", f = "PromotedPostItemViewModel.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30897a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f30898b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.InAppActionEvents f30899c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Boolean f30900d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel$logAnalytics$1(PromotedPostItemViewModel promotedPostItemViewModel, AggregatedAllAnalyticsLogger.InAppActionEvents inAppActionEvents, Boolean bool, zz.a<? super PromotedPostItemViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f30898b = promotedPostItemViewModel;
        this.f30899c = inAppActionEvents;
        this.f30900d = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItemViewModel$logAnalytics$1(this.f30898b, this.f30899c, this.f30900d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        InAppMessageEntity G;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        b0 b0Var;
        PromotedPostSource promotedPostSource;
        f11 = b.f();
        int i11 = this.f30897a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            G = this.f30898b.G();
            if (G != null) {
                PromotedPostItemViewModel promotedPostItemViewModel = this.f30898b;
                AggregatedAllAnalyticsLogger.InAppActionEvents inAppActionEvents = this.f30899c;
                Boolean bool = this.f30900d;
                aggregatedAllAnalyticsLogger = promotedPostItemViewModel.f30869e;
                Integer itemId = G.getItemId();
                b0Var = promotedPostItemViewModel.F;
                List<Integer> districtsIds = G.getDistrictsIds();
                Integer catId = G.getCatId();
                promotedPostSource = promotedPostItemViewModel.f30871g;
                String value = promotedPostSource.getValue();
                this.f30897a = 1;
                if (AggregatedAllAnalyticsLoggerKt.x(aggregatedAllAnalyticsLogger, inAppActionEvents, itemId, (Integer) b0Var.getValue(), districtsIds, catId, value, bool, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItemViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
