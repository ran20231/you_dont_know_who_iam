package com.forsale.app.ui.bottomsheets.wanteditems;

import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeleteWantedItemViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemViewModel$logAnalytics$1", f = "DeleteWantedItemViewModel.kt", l = {l8.a.f62266c}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DeleteWantedItemViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39276a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DeleteWantedItemViewModel f39277b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ItemSubscriptionResponse f39278c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteWantedItemViewModel$logAnalytics$1(DeleteWantedItemViewModel deleteWantedItemViewModel, ItemSubscriptionResponse itemSubscriptionResponse, zz.a<? super DeleteWantedItemViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f39277b = deleteWantedItemViewModel;
        this.f39278c = itemSubscriptionResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteWantedItemViewModel$logAnalytics$1(this.f39277b, this.f39278c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39276a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            AggregatedAllAnalyticsLogger r11 = this.f39277b.r();
            AggregatedAllAnalyticsLogger.WantedItemActionEvents wantedItemActionEvents = AggregatedAllAnalyticsLogger.WantedItemActionEvents.WANTED_ITEMS_ACTION_DELETED;
            ItemSubscriptionResponse itemSubscriptionResponse = this.f39278c;
            this.f39276a = 1;
            if (AggregatedAllAnalyticsLoggerKt.O0(r11, wantedItemActionEvents, itemSubscriptionResponse, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteWantedItemViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
