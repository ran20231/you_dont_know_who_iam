package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.draftItem;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.p;
import zz.a;
/* compiled from: DraftCardViewModel.kt */
/* loaded from: classes2.dex */
public final class DraftCardViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f27750a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f27751b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f27752c;

    /* renamed from: d  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f27753d;

    /* renamed from: e  reason: collision with root package name */
    private final String f27754e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<String> f27755f;

    /* renamed from: g  reason: collision with root package name */
    private final OneShotEventHandler<ListingDetailsEntity> f27756g;

    public DraftCardViewModel(CoroutineScope coroutineScope, ListingItemDetails listingDetails, ApplicationResourcesRepository appRepo, AggregatedAllAnalyticsLogger analyticsLogger, String deviceId) {
        o.i(coroutineScope, "coroutineScope");
        o.i(listingDetails, "listingDetails");
        o.i(appRepo, "appRepo");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(deviceId, "deviceId");
        this.f27750a = coroutineScope;
        this.f27751b = listingDetails;
        this.f27752c = appRepo;
        this.f27753d = analyticsLogger;
        this.f27754e = deviceId;
        this.f27755f = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27756g = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public static /* synthetic */ Object f(DraftCardViewModel draftCardViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair[] pairArr, a aVar, int i11, Object obj) {
        boolean z13;
        boolean z14;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        Pair[] pairArr2;
        if ((i11 & 2) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 4) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        if ((i11 & 8) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 16) != 0) {
            pairArr2 = new Pair[0];
        } else {
            pairArr2 = pairArr;
        }
        return draftCardViewModel.e(myListingActionEvents, z13, z14, analyticsPosition2, pairArr2, aVar);
    }

    public final OneShotEventHandler<ListingDetailsEntity> c() {
        return this.f27756g;
    }

    public final OneShotEventHandler<String> d() {
        return this.f27755f;
    }

    public final Object e(AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair<String, String>[] pairArr, a<? super p> aVar) {
        Object f11;
        ListingItemDetails listingItemDetails = this.f27751b;
        if (listingItemDetails != null) {
            Object p02 = AggregatedAllAnalyticsLoggerKt.p0(this.f27753d, myListingActionEvents, listingItemDetails, this.f27754e, z11, z12, analyticsPosition, null, null, null, null, null, null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), aVar, 4032, null);
            f11 = b.f();
            if (p02 == f11) {
                return p02;
            }
        }
        return p.f75480a;
    }

    public final void g() {
        BuildersKt__Builders_commonKt.launch$default(this.f27750a, null, null, new DraftCardViewModel$onEditClicked$1(this, null), 3, null);
    }

    public final void h() {
        this.f27755f.i(this.f27752c.getString(y0.f70455fa, new Object[0]));
    }
}
