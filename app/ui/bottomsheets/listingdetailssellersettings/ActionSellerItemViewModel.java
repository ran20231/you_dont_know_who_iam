package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ActionSellerItemViewModel.kt */
/* loaded from: classes3.dex */
public class ActionSellerItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f38814a;

    /* renamed from: b  reason: collision with root package name */
    private final SellerActionType f38815b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingItemDetails f38816c;

    /* renamed from: d  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f38817d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38818e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<ListingDetailsEntity> f38819f;

    /* renamed from: g  reason: collision with root package name */
    private final OneShotEventHandler<Integer> f38820g;

    /* compiled from: ActionSellerItemViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38821a;

        static {
            int[] iArr = new int[SellerActionType.values().length];
            try {
                iArr[SellerActionType.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SellerActionType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38821a = iArr;
        }
    }

    public ActionSellerItemViewModel(CoroutineScope coroutineScope, SellerActionType sellerActionType, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger analyticsLogger, String deviceId) {
        o.i(coroutineScope, "coroutineScope");
        o.i(sellerActionType, "sellerActionType");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(deviceId, "deviceId");
        this.f38814a = coroutineScope;
        this.f38815b = sellerActionType;
        this.f38816c = listingItemDetails;
        this.f38817d = analyticsLogger;
        this.f38818e = deviceId;
        this.f38819f = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38820g = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final AggregatedAllAnalyticsLogger a() {
        return this.f38817d;
    }

    public final OneShotEventHandler<Integer> b() {
        return this.f38820g;
    }

    public final String c() {
        return this.f38818e;
    }

    public final OneShotEventHandler<ListingDetailsEntity> d() {
        return this.f38819f;
    }

    public final void e(AggregatedAllAnalyticsLogger.MyListingActionEvents action, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition) {
        o.i(action, "action");
        ListingItemDetails listingItemDetails = this.f38816c;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38814a, null, null, new ActionSellerItemViewModel$logMyListingAnalytics$1$1(this, action, listingItemDetails, z11, z12, analyticsPosition, null), 3, null);
        }
    }

    public final void f() {
        int i11 = a.f38821a[this.f38815b.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                e(AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_DELETE_CLICKED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.SETTINGS);
                this.f38820g.i(Integer.valueOf(this.f38816c.getId()));
                return;
            }
            return;
        }
        e(AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_EDIT_CLICKED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.SETTINGS);
        this.f38819f.i(ListingDetailsEntity.Companion.from(this.f38816c, this.f38818e));
    }
}
