package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: ActionSellerItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.ActionSellerItemViewModel$logMyListingAnalytics$1$1", f = "ActionSellerItemViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ActionSellerItemViewModel$logMyListingAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionSellerItemViewModel f38823b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38824c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38825d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38826e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38827f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38828g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSellerItemViewModel$logMyListingAnalytics$1$1(ActionSellerItemViewModel actionSellerItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, a<? super ActionSellerItemViewModel$logMyListingAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38823b = actionSellerItemViewModel;
        this.f38824c = myListingActionEvents;
        this.f38825d = listingItemDetails;
        this.f38826e = z11;
        this.f38827f = z12;
        this.f38828g = analyticsPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ActionSellerItemViewModel$logMyListingAnalytics$1$1(this.f38823b, this.f38824c, this.f38825d, this.f38826e, this.f38827f, this.f38828g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38822a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AggregatedAllAnalyticsLogger a11 = this.f38823b.a();
            String c11 = this.f38823b.c();
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f38824c;
            ListingItemDetails listingItemDetails = this.f38825d;
            boolean z11 = this.f38826e;
            boolean z12 = this.f38827f;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38828g;
            this.f38822a = 1;
            if (AggregatedAllAnalyticsLoggerKt.p0(a11, myListingActionEvents, listingItemDetails, c11, z11, z12, analyticsPosition, null, null, null, null, null, null, null, this, 8128, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ActionSellerItemViewModel$logMyListingAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
