package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost;

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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionAutoRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1", f = "SellerActionAutoRepostItemViewModel.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38635a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAutoRepostItemViewModel f38636b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38637c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38638d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38639e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38640f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38641g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus f38642h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1(SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus, a<? super SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38636b = sellerActionAutoRepostItemViewModel;
        this.f38637c = myListingActionEvents;
        this.f38638d = listingItemDetails;
        this.f38639e = z11;
        this.f38640f = z12;
        this.f38641g = analyticsPosition;
        this.f38642h = analyticsOnOffStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1(this.f38636b, this.f38637c, this.f38638d, this.f38639e, this.f38640f, this.f38641g, this.f38642h, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        String str;
        f11 = b.f();
        int i11 = this.f38635a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aggregatedAllAnalyticsLogger = this.f38636b.f38622f;
            str = this.f38636b.f38624h;
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f38637c;
            ListingItemDetails listingItemDetails = this.f38638d;
            boolean z11 = this.f38639e;
            boolean z12 = this.f38640f;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38641g;
            AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus = this.f38642h;
            this.f38635a = 1;
            if (AggregatedAllAnalyticsLoggerKt.p0(aggregatedAllAnalyticsLogger, myListingActionEvents, listingItemDetails, str, z11, z12, analyticsPosition, analyticsOnOffStatus, null, null, null, null, null, null, this, 8064, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
