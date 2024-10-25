package com.forsale.app.ui.bottomsheets.wanteditems;

import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddWantedItemViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$logAnalytics$1", f = "AddWantedItemViewModel.kt", l = {FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AddWantedItemViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39250a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddWantedItemViewModel f39251b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ItemSubscriptionResponse f39252c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWantedItemViewModel$logAnalytics$1(AddWantedItemViewModel addWantedItemViewModel, ItemSubscriptionResponse itemSubscriptionResponse, zz.a<? super AddWantedItemViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f39251b = addWantedItemViewModel;
        this.f39252c = itemSubscriptionResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AddWantedItemViewModel$logAnalytics$1(this.f39251b, this.f39252c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39250a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            AggregatedAllAnalyticsLogger r11 = this.f39251b.r();
            AggregatedAllAnalyticsLogger.WantedItemActionEvents wantedItemActionEvents = AggregatedAllAnalyticsLogger.WantedItemActionEvents.WANTED_ITEMS_ACTION_ADDED;
            ItemSubscriptionResponse itemSubscriptionResponse = this.f39252c;
            this.f39250a = 1;
            if (AggregatedAllAnalyticsLoggerKt.O0(r11, wantedItemActionEvents, itemSubscriptionResponse, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AddWantedItemViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
