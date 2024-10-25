package com.forsale.app.features.categories.listings;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import g00.p;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nc.a;
import qc.b;
/* compiled from: PagedListingsDecorator.kt */
/* loaded from: classes2.dex */
public abstract class PagedListingsDecorator {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<RegionEntity> f28000a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<MasterDataMiscModel> f28001b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingsRepository f28002c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f28003d;

    /* renamed from: e  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f28004e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<MyListingsType> f28005f;

    /* renamed from: g  reason: collision with root package name */
    private final ListingsTypes f28006g;

    /* renamed from: h  reason: collision with root package name */
    private final CategoryEntity f28007h;

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineScope f28008i;

    /* renamed from: j  reason: collision with root package name */
    private final a f28009j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f28010k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f28011l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<List<Integer>> f28012m;

    /* renamed from: n  reason: collision with root package name */
    private final p<ListingItemBrief, List<? extends Object>, wz.p> f28013n;

    /* JADX WARN: Multi-variable type inference failed */
    public PagedListingsDecorator(LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ListingsRepository listingsRepository, ApplicationResourcesRepository arr, AggregatedAllAnalyticsLogger analyticsLogger, StateFlow<? extends MyListingsType> stateFlow, ListingsTypes listingsTypes, CategoryEntity categoryEntity, CoroutineScope coroutineScope, a getSwipeableListInteractor) {
        List n11;
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(listingsRepository, "listingsRepository");
        o.i(arr, "arr");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        this.f28000a = region;
        this.f28001b = misc;
        this.f28002c = listingsRepository;
        this.f28003d = arr;
        this.f28004e = analyticsLogger;
        this.f28005f = stateFlow;
        this.f28006g = listingsTypes;
        this.f28007h = categoryEntity;
        this.f28008i = coroutineScope;
        this.f28009j = getSwipeableListInteractor;
        n11 = r.n();
        this.f28012m = StateFlowKt.MutableStateFlow(n11);
        this.f28013n = new p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.categories.listings.PagedListingsDecorator$analyticLambda$1
            public final void b(ListingItemBrief brief, List<? extends Object> list) {
                o.i(brief, "brief");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief, List<? extends Object> list) {
                b(listingItemBrief, list);
                return wz.p.f75480a;
            }
        };
    }

    public static /* synthetic */ Object g(PagedListingsDecorator pagedListingsDecorator, ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, PropertyItemSettings propertyItemSettings, int i11, int i12, ListingDecoratorTypes listingDecoratorTypes, zz.a aVar, int i13, Object obj) {
        PropertyItemSettings propertyItemSettings2;
        int i14;
        ListingDecoratorTypes listingDecoratorTypes2;
        if (obj == null) {
            if ((i13 & 4) != 0) {
                propertyItemSettings2 = new PropertyItemSettings(false, false, 3, null);
            } else {
                propertyItemSettings2 = propertyItemSettings;
            }
            if ((i13 & 16) != 0) {
                i14 = 0;
            } else {
                i14 = i12;
            }
            if ((i13 & 32) != 0) {
                listingDecoratorTypes2 = ListingDecoratorTypes.GENERAL_LISTINGS;
            } else {
                listingDecoratorTypes2 = listingDecoratorTypes;
            }
            return pagedListingsDecorator.f(listingItemBrief, listingsSettings, propertyItemSettings2, i11, i14, listingDecoratorTypes2, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildListingViewModelAsync");
    }

    static /* synthetic */ Object h(PagedListingsDecorator pagedListingsDecorator, ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, PropertyItemSettings propertyItemSettings, int i11, int i12, ListingDecoratorTypes listingDecoratorTypes, zz.a<? super Deferred<? extends b<ListingItemBrief>>> aVar) {
        return CoroutineScopeKt.coroutineScope(new PagedListingsDecorator$buildListingViewModelAsync$2(pagedListingsDecorator, listingItemBrief, listingsSettings, listingDecoratorTypes, i12, propertyItemSettings, i11, null), aVar);
    }

    public static /* synthetic */ String n(PagedListingsDecorator pagedListingsDecorator, boolean z11, ListingsIntention listingsIntention, boolean z12, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                listingsIntention = null;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return pagedListingsDecorator.m(z11, listingsIntention, z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListingSource");
    }

    public static /* synthetic */ Object r(PagedListingsDecorator pagedListingsDecorator, String str, Integer num, zz.a aVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            return pagedListingsDecorator.q(str, num, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logErrorScreenShown");
    }

    public Object f(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, PropertyItemSettings propertyItemSettings, int i11, int i12, ListingDecoratorTypes listingDecoratorTypes, zz.a<? super Deferred<? extends b<ListingItemBrief>>> aVar) {
        return h(this, listingItemBrief, listingsSettings, propertyItemSettings, i11, i12, listingDecoratorTypes, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MutableStateFlow<List<Integer>> i() {
        return this.f28012m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public p<ListingItemBrief, List<? extends Object>, wz.p> j() {
        return this.f28013n;
    }

    public final CoroutineScope k() {
        return this.f28008i;
    }

    public final a l() {
        return this.f28009j;
    }

    public final String m(boolean z11, ListingsIntention listingsIntention, boolean z12) {
        if (z11) {
            return AnalyticsDetailsSource.FOR_SALE_REALTY_PIN.getValue();
        }
        ListingsTypes listingsTypes = this.f28006g;
        if (listingsTypes == ListingsTypes.HOT_ZONES) {
            return AnalyticsDetailsSource.HOT_ZONE_SEE_ALL.getValue();
        }
        if (listingsIntention != ListingsIntention.SEARCH && !z12) {
            if (listingsTypes != null) {
                return AnalyticsDetailsSource.Companion.a(listingsTypes).getValue();
            }
            return null;
        }
        return AnalyticsDetailsSource.SEARCH_RESULTS.getValue();
    }

    public boolean o() {
        return this.f28010k;
    }

    public boolean p() {
        return this.f28011l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, java.lang.Integer r6, zz.a<? super wz.p> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.PagedListingsDecorator$logErrorScreenShown$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.PagedListingsDecorator$logErrorScreenShown$1 r0 = (com.forsale.app.features.categories.listings.PagedListingsDecorator$logErrorScreenShown$1) r0
            int r1 = r0.f28037d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28037d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.PagedListingsDecorator$logErrorScreenShown$1 r0 = new com.forsale.app.features.categories.listings.PagedListingsDecorator$logErrorScreenShown$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f28035b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28037d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f28034a
            com.forsale.app.features.categories.listings.ListingsTypes r5 = (com.forsale.app.features.categories.listings.ListingsTypes) r5
            kotlin.f.b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listings.ListingsTypes r7 = r4.f28006g
            if (r7 == 0) goto L49
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r2 = r4.f28004e
            r0.f28034a = r7
            r0.f28037d = r3
            java.lang.Object r5 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt.d0(r2, r7, r5, r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.PagedListingsDecorator.q(java.lang.String, java.lang.Integer, zz.a):java.lang.Object");
    }

    public abstract Object s(zz.a<? super Pair<Integer, ? extends List<? extends x9.b<?>>>> aVar);

    public abstract Object t(int i11, zz.a<? super Pair<Integer, ? extends List<? extends x9.b<?>>>> aVar);

    public final Object u(int i11, List<Integer> list, zz.a<? super wz.p> aVar) {
        List<Integer> E0;
        Object f11;
        Object f12;
        if (i11 == 1) {
            Object emit = this.f28012m.emit(list, aVar);
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f12) {
                return emit;
            }
            return wz.p.f75480a;
        }
        MutableStateFlow<List<Integer>> mutableStateFlow = this.f28012m;
        E0 = CollectionsKt___CollectionsKt.E0(mutableStateFlow.getValue(), list);
        Object emit2 = mutableStateFlow.emit(E0, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (emit2 == f11) {
            return emit2;
        }
        return wz.p.f75480a;
    }

    public /* synthetic */ PagedListingsDecorator(LiveData liveData, LiveData liveData2, ListingsRepository listingsRepository, ApplicationResourcesRepository applicationResourcesRepository, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, StateFlow stateFlow, ListingsTypes listingsTypes, CategoryEntity categoryEntity, CoroutineScope coroutineScope, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, liveData2, listingsRepository, applicationResourcesRepository, aggregatedAllAnalyticsLogger, (i11 & 32) != 0 ? null : stateFlow, (i11 & 64) != 0 ? null : listingsTypes, (i11 & 128) != 0 ? null : categoryEntity, (i11 & 256) != 0 ? null : coroutineScope, aVar);
    }
}
