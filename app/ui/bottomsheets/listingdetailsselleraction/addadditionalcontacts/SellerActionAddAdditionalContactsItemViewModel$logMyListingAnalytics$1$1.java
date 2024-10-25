package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1", f = "SellerActionAddAdditionalContactsItemViewModel.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38592a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAddAdditionalContactsItemViewModel f38593b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f38594c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38595d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f38596e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f38597f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f38598g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<String> f38599h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ List<String> f38600i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1(SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, ListingItemDetails listingItemDetails, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, List<String> list, List<String> list2, a<? super SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1> aVar) {
        super(2, aVar);
        this.f38593b = sellerActionAddAdditionalContactsItemViewModel;
        this.f38594c = myListingActionEvents;
        this.f38595d = listingItemDetails;
        this.f38596e = z11;
        this.f38597f = z12;
        this.f38598g = analyticsPosition;
        this.f38599h = list;
        this.f38600i = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1(this.f38593b, this.f38594c, this.f38595d, this.f38596e, this.f38597f, this.f38598g, this.f38599h, this.f38600i, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        String str;
        f11 = b.f();
        int i11 = this.f38592a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aggregatedAllAnalyticsLogger = this.f38593b.f38564f;
            str = this.f38593b.f38566h;
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f38594c;
            ListingItemDetails listingItemDetails = this.f38595d;
            boolean z11 = this.f38596e;
            boolean z12 = this.f38597f;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f38598g;
            List<String> list = this.f38599h;
            List<String> list2 = this.f38600i;
            this.f38592a = 1;
            if (AggregatedAllAnalyticsLoggerKt.p0(aggregatedAllAnalyticsLogger, myListingActionEvents, listingItemDetails, str, z11, z12, analyticsPosition, null, null, null, null, list, list2, null, this, 5056, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
