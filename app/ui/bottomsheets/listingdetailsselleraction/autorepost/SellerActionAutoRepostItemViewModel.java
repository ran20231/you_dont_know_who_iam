package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import dj.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: SellerActionAutoRepostItemViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerActionAutoRepostItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f38617a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f38618b;

    /* renamed from: c  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger.AnalyticsPosition f38619c;

    /* renamed from: d  reason: collision with root package name */
    private final MyListingsService f38620d;

    /* renamed from: e  reason: collision with root package name */
    private final ApplicationResourcesRepository f38621e;

    /* renamed from: f  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f38622f;

    /* renamed from: g  reason: collision with root package name */
    private final RegionsRepository f38623g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38624h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f38625i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<String> f38626j;

    /* renamed from: k  reason: collision with root package name */
    private final OneShotEventHandler<p> f38627k;

    /* renamed from: l  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38628l;

    /* renamed from: m  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38629m;

    /* renamed from: n  reason: collision with root package name */
    private final h f38630n;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SellerActionAutoRepostItemViewModel f38631a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, SellerActionAutoRepostItemViewModel sellerActionAutoRepostItemViewModel) {
            super(key);
            this.f38631a = sellerActionAutoRepostItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38631a.k().f(th2);
            this.f38631a.u(false);
        }
    }

    public SellerActionAutoRepostItemViewModel(CoroutineScope coroutineScope, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, MyListingsService myListingsService, ApplicationResourcesRepository appRepo, AggregatedAllAnalyticsLogger analyticsLogger, RegionsRepository regionsRepository, String deviceId) {
        h a11;
        o.i(coroutineScope, "coroutineScope");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(myListingsService, "myListingsService");
        o.i(appRepo, "appRepo");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(regionsRepository, "regionsRepository");
        o.i(deviceId, "deviceId");
        this.f38617a = coroutineScope;
        this.f38618b = listingItemDetails;
        this.f38619c = analyticsPosition;
        this.f38620d = myListingsService;
        this.f38621e = appRepo;
        this.f38622f = analyticsLogger;
        this.f38623g = regionsRepository;
        this.f38624h = deviceId;
        this.f38625i = !TypeExtensionsKt.h0(listingItemDetails.isAutoRepost());
        this.f38626j = new b0<>();
        this.f38627k = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38628l = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38629m = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = d.a(new g00.a<i>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.autorepost.SellerActionAutoRepostItemViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final i invoke() {
                return i.f54287a.invoke();
            }
        });
        this.f38630n = a11;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(com.forsale.app.features.categories.listingdetails.a aVar) {
        int i11;
        if (this.f38625i) {
            i11 = y0.f70367a7;
        } else {
            i11 = y0.Y6;
        }
        return this.f38621e.getString(i11, Integer.valueOf(aVar.a()), Integer.valueOf(aVar.b()), Integer.valueOf(aVar.c()));
    }

    private final void p() {
        BuildersKt__Builders_commonKt.launch$default(this.f38617a, null, null, new SellerActionAutoRepostItemViewModel$loadRepostDate$1$1(this, this.f38618b, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus;
        if (this.f38625i) {
            analyticsOnOffStatus = AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus.ON;
        } else {
            analyticsOnOffStatus = AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus.OFF;
        }
        r(AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_AUTO_REPOST_TOGGLED, true, true, this.f38619c, analyticsOnOffStatus);
    }

    private final void r(AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus) {
        ListingItemDetails listingItemDetails = this.f38618b;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38617a, null, null, new SellerActionAutoRepostItemViewModel$logMyListingAnalytics$1$1(this, myListingActionEvents, listingItemDetails, z11, z12, analyticsPosition, analyticsOnOffStatus, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean z11) {
        this.f38628l.i(Boolean.valueOf(z11));
    }

    private final void v() {
        this.f38629m.i(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this.f38617a, new a(CoroutineExceptionHandler.Key, this), null, new SellerActionAutoRepostItemViewModel$toggleAutoRepost$2(this, null), 2, null);
    }

    public final OneShotEventHandler<p> i() {
        return this.f38627k;
    }

    public final boolean j() {
        return this.f38625i;
    }

    public final i k() {
        return (i) this.f38630n.getValue();
    }

    public final OneShotEventHandler<Boolean> l() {
        return this.f38628l;
    }

    public final b0<String> m() {
        return this.f38626j;
    }

    public final OneShotEventHandler<Boolean> o() {
        return this.f38629m;
    }

    public final void s() {
        OneShotEventHandler.d(this.f38627k, null, 1, null);
    }

    public final void t() {
        v();
    }
}
