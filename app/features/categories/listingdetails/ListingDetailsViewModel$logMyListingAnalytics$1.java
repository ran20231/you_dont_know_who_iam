package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$logMyListingAnalytics$1", f = "ListingDetailsViewModel.kt", l = {291}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$logMyListingAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25406b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.MyListingActionEvents f25407c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f25408d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f25409e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f25410f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Pair<String, String>[] f25411g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$logMyListingAnalytics$1(ListingDetailsViewModel listingDetailsViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair<String, String>[] pairArr, zz.a<? super ListingDetailsViewModel$logMyListingAnalytics$1> aVar) {
        super(2, aVar);
        this.f25406b = listingDetailsViewModel;
        this.f25407c = myListingActionEvents;
        this.f25408d = z11;
        this.f25409e = z12;
        this.f25410f = analyticsPosition;
        this.f25411g = pairArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$logMyListingAnalytics$1(this.f25406b, this.f25407c, this.f25408d, this.f25409e, this.f25410f, this.f25411g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger.ListingsPageSource listingsPageSource;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25405a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsRepository j12 = this.f25406b.j1();
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = this.f25407c;
            boolean z11 = this.f25408d;
            boolean z12 = this.f25409e;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f25410f;
            if (this.f25406b.T0().getValue().booleanValue()) {
                listingsPageSource = AggregatedAllAnalyticsLogger.ListingsPageSource.MY_LISTING_PREVIEWED;
            } else {
                listingsPageSource = AggregatedAllAnalyticsLogger.ListingsPageSource.MY_LISTINGS;
            }
            String value = listingsPageSource.getValue();
            Pair<String, String>[] pairArr = this.f25411g;
            this.f25405a = 1;
            if (j12.b0(myListingActionEvents, z11, z12, analyticsPosition, value, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$logMyListingAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
