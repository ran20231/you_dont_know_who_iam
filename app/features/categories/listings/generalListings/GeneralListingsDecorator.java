package com.forsale.app.features.categories.listings.generalListings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.Gender;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.items.dfp.mpu.MpuTypes;
import com.forsale.app.ui.recyclerviewitems.horizontalChips.HorizontalChipsItemViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.AnalyticsMyListingsStatus;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewSpacing;
import com.forsale.app.utils.y;
import g00.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.y0;
import wz.p;
/* compiled from: GeneralListingsDecorator.kt */
/* loaded from: classes2.dex */
public final class GeneralListingsDecorator extends PagedListingsDecorator {
    private final MpuTypes A;
    private final LiveData<List<bi.b<?>>> B;
    private final LiveData<TextHolder> C;
    private final Gender D;
    private final LiveData<CategoryEntity> E;
    private final AnalyticListingsPayload F;
    private final nc.a G;
    private final b0<Integer> H;
    private final b0<Integer> I;
    private final OneShotEventHandler<Integer> J;
    private final wz.h K;
    private final b0<Integer> L;
    private final b0<Integer> M;
    private final List<ListingsTypes> N;

    /* renamed from: o  reason: collision with root package name */
    private final ListingsTypes f30398o;

    /* renamed from: p  reason: collision with root package name */
    private final b0<ListingsResponse.UISettings> f30399p;

    /* renamed from: q  reason: collision with root package name */
    private final OneShotEventHandler<MyListingsDateRange> f30400q;

    /* renamed from: r  reason: collision with root package name */
    private final ListingsRepository f30401r;

    /* renamed from: s  reason: collision with root package name */
    private final GAMRepository f30402s;

    /* renamed from: t  reason: collision with root package name */
    private final fj.b f30403t;

    /* renamed from: u  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f30404u;

    /* renamed from: v  reason: collision with root package name */
    private final com.forsale.app.features.categories.listings.generalListings.a f30405v;

    /* renamed from: w  reason: collision with root package name */
    private final MyListingsDateRange f30406w;

    /* renamed from: x  reason: collision with root package name */
    private final AnalyticsListingsSource f30407x;

    /* renamed from: y  reason: collision with root package name */
    private final SearchSource f30408y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f30409z;

    /* compiled from: GeneralListingsDecorator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30410a;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.HOT_ZONES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsTypes.SPOTLIGHT_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ListingsTypes.MY_VIEW_HISTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ListingsTypes.FOR_SALE_REALTY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ListingsTypes.FEATURED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f30410a = iArr;
        }
    }

    public /* synthetic */ GeneralListingsDecorator(ListingsTypes listingsTypes, b0 b0Var, OneShotEventHandler oneShotEventHandler, LiveData liveData, LiveData liveData2, ListingsRepository listingsRepository, ApplicationResourcesRepository applicationResourcesRepository, GAMRepository gAMRepository, fj.b bVar, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, com.forsale.app.features.categories.listings.generalListings.a aVar, MyListingsDateRange myListingsDateRange, AnalyticsListingsSource analyticsListingsSource, SearchSource searchSource, boolean z11, MpuTypes mpuTypes, LiveData liveData3, LiveData liveData4, Gender gender, LiveData liveData5, AnalyticListingsPayload analyticListingsPayload, CoroutineScope coroutineScope, nc.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingsTypes, b0Var, oneShotEventHandler, liveData, liveData2, listingsRepository, applicationResourcesRepository, gAMRepository, bVar, aggregatedAllAnalyticsLogger, (i11 & 1024) != 0 ? null : aVar, (i11 & RecyclerView.l.FLAG_MOVED) != 0 ? null : myListingsDateRange, (i11 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : analyticsListingsSource, (i11 & 8192) != 0 ? null : searchSource, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z11, (32768 & i11) != 0 ? null : mpuTypes, (65536 & i11) != 0 ? null : liveData3, (131072 & i11) != 0 ? null : liveData4, (262144 & i11) != 0 ? null : gender, (524288 & i11) != 0 ? null : liveData5, (1048576 & i11) != 0 ? null : analyticListingsPayload, (i11 & 2097152) != 0 ? null : coroutineScope, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<qc.b<?>> B(List<? extends qc.b<?>> list, qc.b<p> bVar, ListingsResponse.UISettings uISettings) {
        String str;
        List<qc.b<?>> a12;
        ListingsResponse.UISettings.FillersSettings.Pinned pinned;
        ListingsResponse.UISettings.FillersSettings fillersSettings = uISettings.getFillersSettings();
        if (fillersSettings != null && (pinned = fillersSettings.getPinned()) != null) {
            str = pinned.getImage();
        } else {
            str = null;
        }
        if (str != null && this.N.contains(this.f30398o) && list.size() % 2 == 1) {
            a12 = CollectionsKt___CollectionsKt.a1(list);
            a12.add(bVar);
            return a12;
        }
        return list;
    }

    private final PLFSource C(ListingsTypes listingsTypes) {
        int i11;
        if (listingsTypes == null) {
            i11 = -1;
        } else {
            i11 = a.f30410a[listingsTypes.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return PLFSource.SEARCH_SPOTLIGHT_SEE_ALL;
        }
        return PLFSource.HOT_ZONE_SEE_ALL_FILLER;
    }

    private final List<ListingItemBrief> D(ListingsResponse listingsResponse) {
        List<ListingItemBrief> E0;
        List<ListingItemBrief> E02;
        ListingsResponse.Listings listings = listingsResponse.getListings();
        int i11 = a.f30410a[this.f30398o.ordinal()];
        if (i11 == 1 || i11 == 2) {
            E0 = CollectionsKt___CollectionsKt.E0(y.f40549a.a(1, listings.getPinnedShuffleItems(), listings.getPinnedItems()), listings.getNormalItems());
            return E0;
        }
        E02 = CollectionsKt___CollectionsKt.E0(listings.getPinnedItems(), listings.getNormalItems());
        return E02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r24, int r25, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings r26, zz.a<? super java.util.List<? extends x9.b<?>>> r27) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator.E(java.util.List, int, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011b -> B:36:0x0121). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(int r24, java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r25, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings r26, zz.a<? super java.util.List<? extends qc.b<?>>> r27) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator.F(int, java.util.List, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings, zz.a):java.lang.Object");
    }

    private final ac.a G() {
        return (ac.a) this.K.getValue();
    }

    private final fd.b H(int i11) {
        List e11;
        Integer valueOf = Integer.valueOf(y0.f70572m9);
        e11 = q.e(TypeExtensionsKt.j0(i11));
        return new fd.b(new TextHolder(valueOf, null, e11, 2, null), gj.d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$getListingsTitleViewModelByCount$1
            public final void b(ViewSpacing viewSpacing) {
                o.i(viewSpacing, "$this$viewSpacing");
                viewSpacing.c(new ViewMargins(Integer.valueOf(p0.f69707g), null, null, Integer.valueOf(p0.f69708h), 6, null));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing) {
                b(viewSpacing);
                return p.f75480a;
            }
        }));
    }

    private final cd.b I(String str) {
        w wVar = w.f61809a;
        String format = String.format("\"" + str + "\"", Arrays.copyOf(new Object[0], 0));
        o.h(format, "format(...)");
        return new cd.b(new TextHolder(Integer.valueOf(y0.Aa), null, null, 6, null), new TextHolder(null, new TextHolder.LocalizedText(format, format), null, 5, null));
    }

    private final List<x9.b<?>> J(String str) {
        boolean z11;
        List<bi.b<?>> list = null;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(I(str));
        List<bi.b<?>> K = K();
        List<bi.b<?>> list2 = K;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            list = K;
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private final List<bi.b<?>> K() {
        LiveData<List<bi.b<?>>> liveData;
        LiveData<TextHolder> liveData2 = this.C;
        if (liveData2 != null && (liveData = this.B) != null) {
            return HorizontalChipsItemViewModel.a.b(HorizontalChipsItemViewModel.f39457h, liveData2, Transformations.b(liveData, new l<List<bi.b<?>>, List<bi.b<?>>>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$getTrendingViewModels$1
                @Override // g00.l
                /* renamed from: b */
                public final List<bi.b<?>> invoke(List<bi.b<?>> list) {
                    List<bi.b<?>> n11;
                    if (list == null) {
                        n11 = r.n();
                        return n11;
                    }
                    return list;
                }
            }), null, 2, null, new ViewMargins(null, null, Integer.valueOf(p0.f69713m), null, 11, null), 20, null);
        }
        return null;
    }

    private final boolean L() {
        int i11 = a.f30410a[this.f30398o.ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6) {
            return false;
        }
        return true;
    }

    private final Object M(int i11, zz.a<? super ListingsResponse> aVar) {
        AdvancedSearchBody advancedSearchBody;
        Integer num;
        String str;
        List<Integer> list;
        String str2;
        Integer num2;
        MyListingsType myListingsType;
        Integer num3;
        StateFlow<MyListingsType> d11;
        ListingsRepository listingsRepository = this.f30401r;
        ListingsTypes listingsTypes = this.f30398o;
        com.forsale.app.features.categories.listings.generalListings.a aVar2 = this.f30405v;
        if (aVar2 != null) {
            advancedSearchBody = aVar2.f();
        } else {
            advancedSearchBody = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar3 = this.f30405v;
        if (aVar3 != null) {
            num = aVar3.g();
        } else {
            num = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar4 = this.f30405v;
        if (aVar4 != null) {
            str = aVar4.h();
        } else {
            str = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar5 = this.f30405v;
        if (aVar5 != null) {
            list = aVar5.c();
        } else {
            list = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar6 = this.f30405v;
        if (aVar6 != null) {
            str2 = aVar6.e();
        } else {
            str2 = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar7 = this.f30405v;
        if (aVar7 != null) {
            num2 = aVar7.a();
        } else {
            num2 = null;
        }
        com.forsale.app.features.categories.listings.generalListings.a aVar8 = this.f30405v;
        if (aVar8 != null && (d11 = aVar8.d()) != null) {
            myListingsType = d11.getValue();
        } else {
            myListingsType = null;
        }
        MyListingsDateRange myListingsDateRange = this.f30406w;
        com.forsale.app.features.categories.listings.generalListings.a aVar9 = this.f30405v;
        if (aVar9 != null) {
            num3 = aVar9.b();
        } else {
            num3 = null;
        }
        return ListingsRepository.getGeneralListings$default(listingsRepository, i11, listingsTypes, null, str2, num2, num, str, advancedSearchBody, myListingsDateRange, list, myListingsType, num3, null, aVar, 4100, null);
    }

    private final Object O(int i11, AggregatedAllAnalyticsLogger.CarouselName carouselName, int i12, Integer num, Integer num2, String str, AnalyticListingsPayload analyticListingsPayload, zz.a<? super p> aVar) {
        Object f11;
        Object H = AggregatedAllAnalyticsLoggerKt.H(this.f30404u, i11, carouselName, i12, num, num2, true, true, str, analyticListingsPayload, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (H == f11) {
            return H;
        }
        return p.f75480a;
    }

    private final Object P(AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents, String str, Integer num, String str2, zz.a<? super p> aVar) {
        Object f11;
        Object m02 = AggregatedAllAnalyticsLoggerKt.m0(this.f30404u, listingsVisitedEvents, str, num, str2, true, true, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (m02 == f11) {
            return m02;
        }
        return p.f75480a;
    }

    static /* synthetic */ Object Q(GeneralListingsDecorator generalListingsDecorator, int i11, AggregatedAllAnalyticsLogger.CarouselName carouselName, int i12, Integer num, Integer num2, String str, AnalyticListingsPayload analyticListingsPayload, zz.a aVar, int i13, Object obj) {
        String str2;
        AnalyticListingsPayload analyticListingsPayload2;
        if ((i13 & 32) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i13 & 64) != 0) {
            analyticListingsPayload2 = null;
        } else {
            analyticListingsPayload2 = analyticListingsPayload;
        }
        return generalListingsDecorator.O(i11, carouselName, i12, num, num2, str2, analyticListingsPayload2, aVar);
    }

    static /* synthetic */ Object R(GeneralListingsDecorator generalListingsDecorator, AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents, String str, Integer num, String str2, zz.a aVar, int i11, Object obj) {
        String str3;
        Integer num2;
        String str4;
        if ((i11 & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        return generalListingsDecorator.P(listingsVisitedEvents, str3, num2, str4, aVar);
    }

    private final Object U(AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents, String str, String str2, Integer num, zz.a<? super p> aVar) {
        Object f11;
        Object Y = AggregatedAllAnalyticsLoggerKt.Y(this.f30404u, listingsVisitedEvents, num, str, str2, true, true, true, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (Y == f11) {
            return Y;
        }
        return p.f75480a;
    }

    private final boolean V(int i11) {
        if (this.f30398o == ListingsTypes.SEARCH_SCREEN && i11 <= 0) {
            return true;
        }
        return false;
    }

    private final void W(ListingsResponse listingsResponse) {
        this.f30399p.postValue(listingsResponse.getUiSettings());
        this.J.i(Integer.valueOf(listingsResponse.getTotalPages()));
        this.H.postValue(Integer.valueOf(TypeExtensionsKt.I(listingsResponse.getTotalListings() + listingsResponse.getListings().getPinnedItems().size())));
        this.I.postValue(1);
    }

    private final Object X(Integer num, Integer num2, zz.a<? super p> aVar) {
        Integer b11;
        String str;
        Object f11;
        String str2;
        Object f12;
        AdvancedSearchBody f13;
        Object f14;
        Object f15;
        String str3;
        String str4;
        Object f16;
        StateFlow<MyListingsType> d11;
        Integer b12;
        Object f17;
        Integer b13;
        String str5;
        Object f18;
        if (num != null) {
            this.L.postValue(kotlin.coroutines.jvm.internal.a.d(num.intValue()));
        }
        int i11 = a.f30410a[this.f30398o.ordinal()];
        String str6 = null;
        if (i11 != 1) {
            switch (i11) {
                case 4:
                    AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents = AggregatedAllAnalyticsLogger.ListingsVisitedEvents.SEARCH_RESULTS_VISITED;
                    com.forsale.app.features.categories.listings.generalListings.a aVar2 = this.f30405v;
                    String str7 = (aVar2 == null || (f13 = aVar2.f()) == null || (r0 = f13.getSearchString()) == null) ? "" : "";
                    SearchSource searchSource = this.f30408y;
                    if (searchSource != null) {
                        str2 = searchSource.getValue();
                    } else {
                        str2 = null;
                    }
                    Object U = U(listingsVisitedEvents, str7, str2, num2, aVar);
                    f12 = kotlin.coroutines.intrinsics.b.f();
                    if (U == f12) {
                        return U;
                    }
                    return p.f75480a;
                case 5:
                    Object R = R(this, AggregatedAllAnalyticsLogger.ListingsVisitedEvents.FAVORITES_VISITED, AnalyticsListingsSource.MORE.getValue(), null, null, aVar, 12, null);
                    f14 = kotlin.coroutines.intrinsics.b.f();
                    if (R == f14) {
                        return R;
                    }
                    return p.f75480a;
                case 6:
                    AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents2 = AggregatedAllAnalyticsLogger.ListingsVisitedEvents.RECENTLY_VIEWED_VISITED;
                    AnalyticsListingsSource analyticsListingsSource = this.f30407x;
                    if (analyticsListingsSource != null) {
                        str6 = analyticsListingsSource.getValue();
                    }
                    Object R2 = R(this, listingsVisitedEvents2, str6, null, null, aVar, 12, null);
                    f15 = kotlin.coroutines.intrinsics.b.f();
                    if (R2 == f15) {
                        return R2;
                    }
                    return p.f75480a;
                case 7:
                    AggregatedAllAnalyticsLogger.ListingsVisitedEvents listingsVisitedEvents3 = AggregatedAllAnalyticsLogger.ListingsVisitedEvents.MY_LISTINGS_VISITED;
                    AnalyticsListingsSource analyticsListingsSource2 = this.f30407x;
                    if (analyticsListingsSource2 != null) {
                        str3 = analyticsListingsSource2.getValue();
                    } else {
                        str3 = null;
                    }
                    com.forsale.app.features.categories.listings.generalListings.a aVar3 = this.f30405v;
                    if (aVar3 != null && (d11 = aVar3.d()) != null) {
                        str4 = AnalyticsMyListingsStatus.Companion.a(d11.getValue()).getValue();
                    } else {
                        str4 = null;
                    }
                    Object P = P(listingsVisitedEvents3, str3, num, str4, aVar);
                    f16 = kotlin.coroutines.intrinsics.b.f();
                    if (P == f16) {
                        return P;
                    }
                    return p.f75480a;
                case 8:
                    com.forsale.app.features.categories.listings.generalListings.a aVar4 = this.f30405v;
                    if (aVar4 != null && (b12 = aVar4.b()) != null) {
                        int intValue = b12.intValue();
                        AggregatedAllAnalyticsLogger.CarouselName carouselName = AggregatedAllAnalyticsLogger.CarouselName.FOR_SALE_REALTY;
                        Integer value = this.I.getValue();
                        if (value == null) {
                            value = kotlin.coroutines.jvm.internal.a.d(1);
                        }
                        Object Q = Q(this, intValue, carouselName, value.intValue(), num2, this.J.g(), null, null, aVar, 96, null);
                        f17 = kotlin.coroutines.intrinsics.b.f();
                        if (Q == f17) {
                            return Q;
                        }
                    }
                    break;
                case 9:
                    com.forsale.app.features.categories.listings.generalListings.a aVar5 = this.f30405v;
                    if (aVar5 != null && (b13 = aVar5.b()) != null) {
                        int intValue2 = b13.intValue();
                        AggregatedAllAnalyticsLogger.CarouselName carouselName2 = AggregatedAllAnalyticsLogger.CarouselName.FEATURED;
                        Integer value2 = this.I.getValue();
                        if (value2 == null) {
                            value2 = kotlin.coroutines.jvm.internal.a.d(1);
                        }
                        int intValue3 = value2.intValue();
                        Integer g11 = this.J.g();
                        AnalyticsListingsSource analyticsListingsSource3 = this.f30407x;
                        if (analyticsListingsSource3 != null) {
                            str5 = analyticsListingsSource3.getValue();
                        } else {
                            str5 = null;
                        }
                        Object O = O(intValue2, carouselName2, intValue3, num2, g11, str5, this.F, aVar);
                        f18 = kotlin.coroutines.intrinsics.b.f();
                        if (O == f18) {
                            return O;
                        }
                    }
                    break;
            }
        } else {
            com.forsale.app.features.categories.listings.generalListings.a aVar6 = this.f30405v;
            if (aVar6 != null && (b11 = aVar6.b()) != null) {
                int intValue4 = b11.intValue();
                AggregatedAllAnalyticsLogger.CarouselName carouselName3 = AggregatedAllAnalyticsLogger.CarouselName.HOT_ZONE;
                Integer value3 = this.I.getValue();
                if (value3 == null) {
                    value3 = kotlin.coroutines.jvm.internal.a.d(1);
                }
                int intValue5 = value3.intValue();
                Integer g12 = this.J.g();
                AnalyticsListingsSource analyticsListingsSource4 = this.f30407x;
                if (analyticsListingsSource4 != null) {
                    str = analyticsListingsSource4.getValue();
                } else {
                    str = null;
                }
                Object O2 = O(intValue4, carouselName3, intValue5, num2, g12, str, this.F, aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (O2 == f11) {
                    return O2;
                }
            }
        }
        return p.f75480a;
    }

    public final Object N(int i11, AggregatedAllAnalyticsLogger.CarouselName carouselName, int i12, zz.a<? super p> aVar) {
        int i13;
        Object f11;
        int i14 = i12;
        Integer value = this.M.getValue();
        if (value == null) {
            value = kotlin.coroutines.jvm.internal.a.d(0);
        }
        int intValue = value.intValue();
        Integer value2 = this.L.getValue();
        if (value2 != null) {
            i13 = value2.intValue() + intValue;
        } else {
            i13 = 0;
        }
        if (i14 == i13) {
            i14 -= intValue;
        }
        int i15 = i14;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f30404u;
        Integer value3 = this.L.getValue();
        if (value3 == null) {
            value3 = kotlin.coroutines.jvm.internal.a.d(0);
        }
        Integer num = value3;
        Integer value4 = this.I.getValue();
        if (value4 == null) {
            value4 = kotlin.coroutines.jvm.internal.a.d(1);
        }
        Object G = AggregatedAllAnalyticsLoggerKt.G(aggregatedAllAnalyticsLogger, i11, carouselName, i15, value4.intValue(), num, this.J.g(), true, true, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (G == f11) {
            return G;
        }
        return p.f75480a;
    }

    public final Object S(AggregatedAllAnalyticsLogger.CustomEvents customEvents, Integer num, zz.a<? super p> aVar) {
        Object f11;
        Object j02 = AggregatedAllAnalyticsLoggerKt.j0(this.f30404u, customEvents, num, true, true, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (j02 == f11) {
            return j02;
        }
        return p.f75480a;
    }

    public final Object T(int i11, zz.a<? super p> aVar) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f30404u;
        Integer value = this.H.getValue();
        if (value == null) {
            value = kotlin.coroutines.jvm.internal.a.d(0);
        }
        int intValue = value.intValue();
        Integer value2 = this.I.getValue();
        if (value2 == null) {
            value2 = kotlin.coroutines.jvm.internal.a.d(0);
        }
        Object F0 = AggregatedAllAnalyticsLoggerKt.F0(aggregatedAllAnalyticsLogger, intValue, i11, value2.intValue(), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (F0 == f11) {
            return F0;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(zz.a<? super kotlin.Pair<java.lang.Integer, ? extends java.util.List<? extends x9.b<?>>>> r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator.s(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(int r10, zz.a<? super kotlin.Pair<java.lang.Integer, ? extends java.util.List<? extends x9.b<?>>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$1 r0 = (com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$1) r0
            int r1 = r0.f30447f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30447f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$1 r0 = new com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f30445d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f30447f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.f30442a
            java.lang.Integer r10 = (java.lang.Integer) r10
            kotlin.f.b(r11)
            goto Lc1
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            int r10 = r0.f30444c
            java.lang.Object r2 = r0.f30443b
            com.forsale.app.datalayer.network.responses.ListingsResponse r2 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r2
            java.lang.Object r4 = r0.f30442a
            com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator r4 = (com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator) r4
            kotlin.f.b(r11)
            goto L8e
        L4b:
            int r10 = r0.f30444c
            java.lang.Object r2 = r0.f30442a
            com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator r2 = (com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator) r2
            kotlin.f.b(r11)
            goto L66
        L55:
            kotlin.f.b(r11)
            r0.f30442a = r9
            r0.f30444c = r10
            r0.f30447f = r5
            java.lang.Object r11 = r9.M(r10, r0)
            if (r11 != r1) goto L65
            return r1
        L65:
            r2 = r9
        L66:
            com.forsale.app.datalayer.network.responses.ListingsResponse r11 = (com.forsale.app.datalayer.network.responses.ListingsResponse) r11
            if (r11 != 0) goto L74
            kotlin.Pair r10 = new kotlin.Pair
            java.util.List r11 = kotlin.collections.p.n()
            r10.<init>(r6, r11)
            return r10
        L74:
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$2 r7 = new com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecoratePage$2
            r7.<init>(r2, r10, r6)
            r0.f30442a = r2
            r0.f30443b = r11
            r0.f30444c = r10
            r0.f30447f = r4
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r5, r7, r0)
            if (r4 != r1) goto L8c
            return r1
        L8c:
            r4 = r2
            r2 = r11
        L8e:
            int r11 = r2.getTotalPages()
            if (r11 <= r10) goto L9b
            int r11 = r10 + 1
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.a.d(r11)
            goto L9c
        L9b:
            r11 = r6
        L9c:
            androidx.lifecycle.b0<java.lang.Integer> r5 = r4.I
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r10)
            r5.postValue(r7)
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r5 = r2.getListings()
            java.util.List r5 = r5.getNormalItems()
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings r2 = r2.getUiSettings()
            r0.f30442a = r11
            r0.f30443b = r6
            r0.f30447f = r3
            java.lang.Object r10 = r4.F(r10, r5, r2, r0)
            if (r10 != r1) goto Lbe
            return r1
        Lbe:
            r8 = r11
            r11 = r10
            r10 = r8
        Lc1:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator.t(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsDecorator(ListingsTypes listingType, b0<ListingsResponse.UISettings> uiSettingsMutableLiveData, OneShotEventHandler<MyListingsDateRange> archivedFilterChanged, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ListingsRepository listingsRepository, final ApplicationResourcesRepository arr, GAMRepository gamRepository, fj.b gamUtils, AggregatedAllAnalyticsLogger analyticsLogger, com.forsale.app.features.categories.listings.generalListings.a aVar, MyListingsDateRange myListingsDateRange, AnalyticsListingsSource analyticsListingsSource, SearchSource searchSource, boolean z11, MpuTypes mpuTypes, LiveData<List<bi.b<?>>> liveData, LiveData<TextHolder> liveData2, Gender gender, LiveData<CategoryEntity> liveData3, AnalyticListingsPayload analyticListingsPayload, CoroutineScope coroutineScope, nc.a getSwipeableInteractor) {
        super(region, misc, listingsRepository, arr, analyticsLogger, aVar != null ? aVar.d() : null, listingType, null, coroutineScope, getSwipeableInteractor, 128, null);
        wz.h a11;
        List<ListingsTypes> q11;
        o.i(listingType, "listingType");
        o.i(uiSettingsMutableLiveData, "uiSettingsMutableLiveData");
        o.i(archivedFilterChanged, "archivedFilterChanged");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(listingsRepository, "listingsRepository");
        o.i(arr, "arr");
        o.i(gamRepository, "gamRepository");
        o.i(gamUtils, "gamUtils");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(getSwipeableInteractor, "getSwipeableInteractor");
        this.f30398o = listingType;
        this.f30399p = uiSettingsMutableLiveData;
        this.f30400q = archivedFilterChanged;
        this.f30401r = listingsRepository;
        this.f30402s = gamRepository;
        this.f30403t = gamUtils;
        this.f30404u = analyticsLogger;
        this.f30405v = aVar;
        this.f30406w = myListingsDateRange;
        this.f30407x = analyticsListingsSource;
        this.f30408y = searchSource;
        this.f30409z = z11;
        this.A = mpuTypes;
        this.B = liveData;
        this.C = liveData2;
        this.D = gender;
        this.E = liveData3;
        this.F = analyticListingsPayload;
        this.G = getSwipeableInteractor;
        this.H = new b0<>(0);
        this.I = new b0<>(0);
        this.J = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = kotlin.d.a(new g00.a<ac.a>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$gamInjector$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ac.a invoke() {
                MpuTypes mpuTypes2;
                GAMRepository gAMRepository;
                fj.b bVar;
                mpuTypes2 = GeneralListingsDecorator.this.A;
                gAMRepository = GeneralListingsDecorator.this.f30402s;
                bVar = GeneralListingsDecorator.this.f30403t;
                return new ac.a(mpuTypes2, gAMRepository, arr, bVar);
            }
        });
        this.K = a11;
        this.L = new b0<>(0);
        this.M = new b0<>(0);
        q11 = r.q(ListingsTypes.HOT_ZONES, ListingsTypes.SPOTLIGHT_ALL);
        this.N = q11;
    }
}
