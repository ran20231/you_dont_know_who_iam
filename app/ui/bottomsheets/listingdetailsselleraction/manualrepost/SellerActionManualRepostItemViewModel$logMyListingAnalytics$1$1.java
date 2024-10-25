package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

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
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1", f = "SellerActionManualRepostItemViewModel.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38754a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38755b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38756c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38757d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38758e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38759f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38760g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus f38761h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus, a<? super SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38755b = sellerActionManualRepostItemViewModel;
        this.f38756c = myListingActionEvents;
        this.f38757d = listingItemDetails;
        this.f38758e = z11;
        this.f38759f = z12;
        this.f38760g = analyticsPosition;
        this.f38761h = analyticsOnOffStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1(this.f38755b, this.f38756c, this.f38757d, this.f38758e, this.f38759f, this.f38760g, this.f38761h, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        String str;
        f11 = b.f();
        int i11 = this.f38754a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aggregatedAllAnalyticsLogger = this.f38755b.f38722e;
            str = this.f38755b.f38727j;
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f38756c;
            ListingItemDetails listingItemDetails = this.f38757d;
            boolean z11 = this.f38758e;
            boolean z12 = this.f38759f;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38760g;
            AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus = this.f38761h;
            this.f38754a = 1;
            if (AggregatedAllAnalyticsLoggerKt.p0(aggregatedAllAnalyticsLogger, myListingActionEvents, listingItemDetails, str, z11, z12, analyticsPosition, analyticsOnOffStatus, null, null, null, null, null, null, this, 8064, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionManualRepostItemViewModel$logMyListingAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
