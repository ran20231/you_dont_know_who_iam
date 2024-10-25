package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber;

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
/* compiled from: SellerActionHideMyNumberItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber.SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1", f = "SellerActionHideMyNumberItemViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38694a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionHideMyNumberItemViewModel f38695b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38696c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38697d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38698e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38699f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38700g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus f38701h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1(SellerActionHideMyNumberItemViewModel sellerActionHideMyNumberItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus, a<? super SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38695b = sellerActionHideMyNumberItemViewModel;
        this.f38696c = myListingActionEvents;
        this.f38697d = listingItemDetails;
        this.f38698e = z11;
        this.f38699f = z12;
        this.f38700g = analyticsPosition;
        this.f38701h = analyticsOnOffStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1(this.f38695b, this.f38696c, this.f38697d, this.f38698e, this.f38699f, this.f38700g, this.f38701h, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        String str;
        f11 = b.f();
        int i11 = this.f38694a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aggregatedAllAnalyticsLogger = this.f38695b.f38681e;
            str = this.f38695b.f38682f;
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f38696c;
            ListingItemDetails listingItemDetails = this.f38697d;
            boolean z11 = this.f38698e;
            boolean z12 = this.f38699f;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38700g;
            AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus = this.f38701h;
            this.f38694a = 1;
            if (AggregatedAllAnalyticsLoggerKt.p0(aggregatedAllAnalyticsLogger, myListingActionEvents, listingItemDetails, str, z11, z12, analyticsPosition, analyticsOnOffStatus, null, null, null, null, null, null, this, 8064, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
