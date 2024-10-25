package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.CategorySortingStateHandler;
import com.forsale.app.features.categories.listings.ListingCardDisplayStyle;
import com.forsale.app.features.categories.listings.ListingDecoratorTypes;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.FillerType;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import com.forsale.app.utils.y;
import com.google.android.gms.ads.AdRequest;
import g00.l;
import j0.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import wz.h;
import wz.p;
/* compiled from: CategoryListingsDecorator.kt */
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator extends PagedListingsDecorator {
    private final fj.b A;
    private final AggregatedAllAnalyticsLogger B;
    private final Deferred<FiltersMediator> C;
    private final CategorySortingStateHandler D;
    private final b0<Integer> E;
    private GetListingsBody.FiltrationData F;
    private final ListingsFiltrationAnalytics G;
    private final Pair<com.forsale.app.utils.analytics.listingfiltration.a, Integer> H;
    private final ListingsAnalytics$FiltersPlace I;
    private final l<Integer, ListingItemDetails> J;
    private final ListingsIntention K;
    private final String L;
    private final AtomicBoolean M;
    private final SearchAnalyticsData N;
    private final ListingDetailsSearchAnalyticsData O;
    private final ListingsAnalytics$FiltersPlace P;
    private final nc.a Q;
    private boolean R;
    private final h S;
    private final b0<List<ListingItemBrief>> T;
    private final b0<List<ListingItemBrief>> U;
    private final b0<Integer> V;
    private final k0 W;
    private final ListingsTypes X;
    private final MutableStateFlow<Integer> Y;
    private final MutableStateFlow<Integer> Z;

    /* renamed from: a0 */
    private final MutableStateFlow<Integer> f28100a0;

    /* renamed from: b0 */
    private final MutableStateFlow<Integer> f28101b0;

    /* renamed from: c0 */
    private final MutableStateFlow<Integer> f28102c0;

    /* renamed from: o */
    private final CategoryEntity f28103o;

    /* renamed from: p */
    private final DistrictEntity f28104p;

    /* renamed from: q */
    private final b0<Integer> f28105q;

    /* renamed from: r */
    private final b0<ListingsResponse.UISettings> f28106r;

    /* renamed from: s */
    private final LiveData<RegionEntity> f28107s;

    /* renamed from: t */
    private final LiveData<MasterDataMiscModel> f28108t;

    /* renamed from: u */
    private final ListingsRepository f28109u;

    /* renamed from: v */
    private final ApplicationResourcesRepository f28110v;

    /* renamed from: w */
    private final CategoryListingsAnalyticSource f28111w;

    /* renamed from: x */
    private final CategoriesRepositories f28112x;

    /* renamed from: y */
    private final DistrictsRepository f28113y;

    /* renamed from: z */
    private final GAMRepository f28114z;

    /* compiled from: CategoryListingsDecorator.kt */
    /* loaded from: classes2.dex */
    public static final class ListingsSections {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ListingsSections[] $VALUES;
        public static final ListingsSections COMMERCIAL = new ListingsSections("COMMERCIAL", 0);
        public static final ListingsSections USER_TYPE = new ListingsSections("USER_TYPE", 1);
        public static final ListingsSections PINNING = new ListingsSections("PINNING", 2);
        public static final ListingsSections NORMAL = new ListingsSections("NORMAL", 3);

        private static final /* synthetic */ ListingsSections[] $values() {
            return new ListingsSections[]{COMMERCIAL, USER_TYPE, PINNING, NORMAL};
        }

        static {
            ListingsSections[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ListingsSections(String str, int i11) {
            super(str, i11);
        }

        public static a00.a<ListingsSections> getEntries() {
            return $ENTRIES;
        }

        public static ListingsSections valueOf(String str) {
            return (ListingsSections) Enum.valueOf(ListingsSections.class, str);
        }

        public static ListingsSections[] values() {
            return (ListingsSections[]) $VALUES.clone();
        }
    }

    /* compiled from: CategoryListingsDecorator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28115a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28116b;

        static {
            int[] iArr = new int[ListingsSections.values().length];
            try {
                iArr[ListingsSections.COMMERCIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsSections.USER_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsSections.PINNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsSections.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28115a = iArr;
            int[] iArr2 = new int[ListingCardDisplayStyle.values().length];
            try {
                iArr2[ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ListingCardDisplayStyle.FULL_SCREEN_TITLE_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ListingCardDisplayStyle.FULL_SCREEN_TITLE_ATTRIBUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f28116b = iArr2;
        }
    }

    public /* synthetic */ CategoryListingsDecorator(CategoryEntity categoryEntity, DistrictEntity districtEntity, b0 b0Var, b0 b0Var2, LiveData liveData, LiveData liveData2, ListingsRepository listingsRepository, ApplicationResourcesRepository applicationResourcesRepository, CategoryListingsAnalyticSource categoryListingsAnalyticSource, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, GAMRepository gAMRepository, fj.b bVar, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, Deferred deferred, CategorySortingStateHandler categorySortingStateHandler, b0 b0Var3, GetListingsBody.FiltrationData filtrationData, ListingsFiltrationAnalytics listingsFiltrationAnalytics, Pair pair, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, l lVar, ListingsIntention listingsIntention, String str, AtomicBoolean atomicBoolean, SearchAnalyticsData searchAnalyticsData, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2, nc.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(categoryEntity, districtEntity, b0Var, b0Var2, liveData, liveData2, listingsRepository, applicationResourcesRepository, categoryListingsAnalyticSource, categoriesRepositories, districtsRepository, gAMRepository, bVar, aggregatedAllAnalyticsLogger, deferred, categorySortingStateHandler, b0Var3, (i11 & 131072) != 0 ? null : filtrationData, listingsFiltrationAnalytics, (i11 & 524288) != 0 ? null : pair, (i11 & 1048576) != 0 ? null : listingsAnalytics$FiltersPlace, lVar, (i11 & 4194304) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 8388608) != 0 ? null : str, atomicBoolean, (i11 & 33554432) != 0 ? null : searchAnalyticsData, (i11 & 67108864) != 0 ? null : listingDetailsSearchAnalyticsData, (i11 & 134217728) != 0 ? null : listingsAnalytics$FiltersPlace2, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a2 A[LOOP:1: B:94:0x009c->B:96:0x00a2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(zz.a<? super java.util.List<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFiltrationDistricts$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFiltrationDistricts$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFiltrationDistricts$1) r0
            int r1 = r0.f28203c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28203c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFiltrationDistricts$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFiltrationDistricts$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f28201a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28203c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.f.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r7 = r6.F
            r2 = 0
            if (r7 == 0) goto L3f
            java.util.List r7 = r7.getLocation()
            goto L40
        L3f:
            r7 = r2
        L40:
            r5 = r7
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L4e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r3
            goto L4f
        L4e:
            r5 = r4
        L4f:
            if (r5 != 0) goto L52
            goto L53
        L52:
            r7 = r2
        L53:
            if (r7 == 0) goto Lb4
            com.forsale.app.datalayer.repositories.DistrictsRepository r2 = r6.f28113y
            r0.f28203c = r4
            java.lang.Object r7 = r2.getDistrictsByIds(r7, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L6b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.forsale.app.datalayer.database.DistrictEntity r2 = (com.forsale.app.datalayer.database.DistrictEntity) r2
            int r2 = r2.getLevel()
            com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
            int r5 = r5.getLevel()
            if (r2 != r5) goto L86
            r2 = r4
            goto L87
        L86:
            r2 = r3
        L87:
            if (r2 == 0) goto L6b
            r0.add(r1)
            goto L6b
        L8d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.p.y(r0, r7)
            r2.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L9c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r7.next()
            com.forsale.app.datalayer.database.DistrictEntity r0 = (com.forsale.app.datalayer.database.DistrictEntity) r0
            int r0 = r0.getId()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r2.add(r0)
            goto L9c
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.B0(zz.a):java.lang.Object");
    }

    public final SortingStates G0() {
        SortingStates a11;
        f value = this.D.b().getValue();
        if (value == null || (a11 = value.a()) == null) {
            return SortingStates.DEFAULT;
        }
        return a11;
    }

    public static /* synthetic */ int I0(CategoryListingsDecorator categoryListingsDecorator, ListingsResponse.UISettings uISettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ListingsResponse.UISettings value = categoryListingsDecorator.f28106r.getValue();
            o.f(value);
            uISettings = value;
        }
        return categoryListingsDecorator.H0(uISettings);
    }

    public final int J0(int i11) {
        if (this.K == ListingsIntention.RESET_SEARCH) {
            return 0;
        }
        return i11;
    }

    private final int K0(int i11, int i12, int i13) {
        if (this.K == ListingsIntention.LISTINGS) {
            return i11 + i12 + i13;
        }
        return i11;
    }

    public final int L0(ListingsSections listingsSections) {
        int L0;
        int intValue;
        int i11 = a.f28115a[listingsSections.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 0;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                L0 = L0(ListingsSections.PINNING) + this.Z.getValue().intValue();
                intValue = this.f28102c0.getValue().intValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            L0 = L0(ListingsSections.USER_TYPE);
            intValue = this.Y.getValue().intValue();
        }
        return L0 + intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0153 A[EDGE_INSN: B:111:0x0153->B:102:0x0153 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(java.util.List<? extends qc.b<?>> r23, java.util.List<? extends qc.b<?>> r24, int r25, int r26, boolean r27, zz.a<? super java.util.List<? extends qc.b<?>>> r28) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.M0(java.util.List, java.util.List, int, int, boolean, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object N0(CategoryListingsDecorator categoryListingsDecorator, List list, List list2, int i11, int i12, boolean z11, zz.a aVar, int i13, Object obj) {
        int i14;
        int i15;
        boolean z12;
        List n11;
        List list3 = list;
        if ((i13 & 1) != 0) {
            n11 = r.n();
            list3 = n11;
        }
        List list4 = list3;
        if ((i13 & 4) != 0) {
            i14 = 0;
        } else {
            i14 = i11;
        }
        if ((i13 & 8) != 0) {
            i15 = 0;
        } else {
            i15 = i12;
        }
        if ((i13 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return categoryListingsDecorator.M0(list4, list2, i14, i15, z12, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7 A[PHI: r1 
      PHI: (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:63:0x00d4, B:45:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(int r21, java.lang.Integer r22, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r23) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.O0(int, java.lang.Integer, zz.a):java.lang.Object");
    }

    public final void P0(FillerType fillerType) {
        if (this.f28103o != null) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new CategoryListingsDecorator$logFillerAnalytics$1(this, fillerType, null), 3, null);
        }
    }

    private final void Q0() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new CategoryListingsDecorator$logListingsAnalytics$1(this, null), 3, null);
    }

    public final boolean S0(int i11, ListingsResponse.UISettings uISettings) {
        if (i11 % 2 == 1 && H0(uISettings) > 1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object U0(CategoryListingsDecorator categoryListingsDecorator, boolean z11, boolean z12, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = z11;
        }
        return categoryListingsDecorator.T0(z11, z12, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V0(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r11, zz.a<? super com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$purifyCategories$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$purifyCategories$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$purifyCategories$1) r0
            int r1 = r0.f28260d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28260d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$purifyCategories$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$purifyCategories$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f28258b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28260d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f28257a
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r11 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData) r11
            kotlin.f.b(r12)
            goto L55
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.f.b(r12)
            java.util.List r12 = r11.getSubCategory()
            if (r12 == 0) goto L66
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r10.f28112x
            java.util.List r4 = r11.getCategory()
            if (r4 != 0) goto L4a
            java.util.List r4 = kotlin.collections.p.n()
        L4a:
            r0.f28257a = r11
            r0.f28260d = r3
            java.lang.Object r12 = r2.getCategoriesParentIdsNotInChildrenParents(r4, r12, r0)
            if (r12 != r1) goto L55
            return r1
        L55:
            r3 = r12
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 30
            r9 = 0
            r2 = r11
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r12 = com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != 0) goto L67
        L66:
            r12 = r11
        L67:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.V0(com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, zz.a):java.lang.Object");
    }

    private final Object W0(GetListingsBody.FiltrationData filtrationData, zz.a<? super GetListingsBody.FiltrationData> aVar) {
        Object f11;
        if (filtrationData == null) {
            return null;
        }
        Object V0 = V0(filtrationData, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (V0 == f11) {
            return V0;
        }
        return (GetListingsBody.FiltrationData) V0;
    }

    private final List<ListingItemBrief> X0(List<ListingItemBrief> list) {
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean z14 = true;
            boolean z15 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ListingItemBrief listingItemBrief = (ListingItemBrief) next;
            List<ListingItemBrief> value = this.T.getValue();
            if (value != null) {
                o.f(value);
                List<ListingItemBrief> list2 = value;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (ListingItemBrief listingItemBrief2 : list2) {
                        if (listingItemBrief.getId() == listingItemBrief2.getId()) {
                            z13 = true;
                            continue;
                        } else {
                            z13 = false;
                            continue;
                        }
                        if (z13) {
                            break;
                        }
                    }
                }
                z14 = false;
                z15 = z14;
            }
            if (!z15) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ListingItemBrief listingItemBrief3 = (ListingItemBrief) obj;
            List<ListingItemBrief> value2 = this.U.getValue();
            if (value2 != null) {
                o.f(value2);
                List<ListingItemBrief> list3 = value2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (ListingItemBrief listingItemBrief4 : list3) {
                        if (listingItemBrief3.getId() == listingItemBrief4.getId()) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            z11 = false;
            if (!z11) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final void Y0(int i11) {
        this.W.setValue(Integer.valueOf(i11));
    }

    private final void a1(ListingsSections listingsSections, int i11) {
        int i12 = a.f28115a[listingsSections.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        MutableStateFlow<Integer> mutableStateFlow = this.f28102c0;
                        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + i11));
                        return;
                    }
                    return;
                }
                this.Z.setValue(Integer.valueOf(i11));
                return;
            }
            this.Y.setValue(Integer.valueOf(i11));
            return;
        }
        this.f28100a0.setValue(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<qc.b<?>> g0(List<? extends qc.b<ListingItemBrief>> list, qc.b<p> bVar, g00.p<? super Integer, ? super ListingsResponse.UISettings, Boolean> pVar, ListingsResponse.UISettings uISettings) {
        List<qc.b<?>> a12;
        if (pVar.invoke(Integer.valueOf(list.size()), uISettings).booleanValue()) {
            o.g(list, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.listings.items.baseItem.BaseListingItemViewModel<*>>");
            a12 = CollectionsKt___CollectionsKt.a1(list);
            a12.add(bVar);
            return a12;
        }
        return list;
    }

    private final rc.a h0(ListingItemBrief listingItemBrief) {
        return new rc.a(listingItemBrief, j(), this.f28103o, this.J);
    }

    private final void i0() {
        this.f28100a0.setValue(0);
        this.Y.setValue(0);
        this.Z.setValue(0);
        this.f28102c0.setValue(0);
    }

    public final boolean j0(int i11, ListingsResponse.UISettings uISettings) {
        String str;
        if (((i11 % 2 != 0 && k0(i11, uISettings) > 1) || (i11 == 1 && k0(i11, uISettings) == 1)) && uISettings.getFillersSettings().getCommercial() != null) {
            ListingsResponse.UISettings.FillersSettings.Commercial commercial2 = uISettings.getFillersSettings().getCommercial();
            if (commercial2 != null) {
                str = commercial2.getImage();
            } else {
                str = null;
            }
            if (str != null) {
                return true;
            }
        }
        return false;
    }

    private final int k0(int i11, ListingsResponse.UISettings uISettings) {
        if (i11 <= 2) {
            return 1;
        }
        return uISettings.getListingsSettings().getNumberOfLines();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryListingsDecorator m0(CategoryListingsDecorator categoryListingsDecorator, CategoryEntity categoryEntity, DistrictEntity districtEntity, b0 b0Var, b0 b0Var2, LiveData liveData, LiveData liveData2, ListingsRepository listingsRepository, ApplicationResourcesRepository applicationResourcesRepository, CategoryListingsAnalyticSource categoryListingsAnalyticSource, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, GAMRepository gAMRepository, fj.b bVar, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, Deferred deferred, CategorySortingStateHandler categorySortingStateHandler, b0 b0Var3, GetListingsBody.FiltrationData filtrationData, ListingsFiltrationAnalytics listingsFiltrationAnalytics, Pair pair, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, l lVar, ListingsIntention listingsIntention, String str, AtomicBoolean atomicBoolean, SearchAnalyticsData searchAnalyticsData, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2, nc.a aVar, int i11, Object obj) {
        return categoryListingsDecorator.l0((i11 & 1) != 0 ? categoryListingsDecorator.f28103o : categoryEntity, (i11 & 2) != 0 ? categoryListingsDecorator.f28104p : districtEntity, (i11 & 4) != 0 ? categoryListingsDecorator.f28105q : b0Var, (i11 & 8) != 0 ? categoryListingsDecorator.f28106r : b0Var2, (i11 & 16) != 0 ? categoryListingsDecorator.f28107s : liveData, (i11 & 32) != 0 ? categoryListingsDecorator.f28108t : liveData2, (i11 & 64) != 0 ? categoryListingsDecorator.f28109u : listingsRepository, (i11 & 128) != 0 ? categoryListingsDecorator.f28110v : applicationResourcesRepository, (i11 & 256) != 0 ? categoryListingsDecorator.f28111w : categoryListingsAnalyticSource, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? categoryListingsDecorator.f28112x : categoriesRepositories, (i11 & 1024) != 0 ? categoryListingsDecorator.f28113y : districtsRepository, (i11 & RecyclerView.l.FLAG_MOVED) != 0 ? categoryListingsDecorator.f28114z : gAMRepository, (i11 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? categoryListingsDecorator.A : bVar, (i11 & 8192) != 0 ? categoryListingsDecorator.B : aggregatedAllAnalyticsLogger, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? categoryListingsDecorator.C : deferred, (i11 & 32768) != 0 ? categoryListingsDecorator.D : categorySortingStateHandler, (i11 & 65536) != 0 ? categoryListingsDecorator.E : b0Var3, (i11 & 131072) != 0 ? categoryListingsDecorator.F : filtrationData, (i11 & 262144) != 0 ? categoryListingsDecorator.G : listingsFiltrationAnalytics, (i11 & 524288) != 0 ? categoryListingsDecorator.H : pair, (i11 & 1048576) != 0 ? categoryListingsDecorator.I : listingsAnalytics$FiltersPlace, (i11 & 2097152) != 0 ? categoryListingsDecorator.J : lVar, (i11 & 4194304) != 0 ? categoryListingsDecorator.K : listingsIntention, (i11 & 8388608) != 0 ? categoryListingsDecorator.L : str, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? categoryListingsDecorator.M : atomicBoolean, (i11 & 33554432) != 0 ? categoryListingsDecorator.N : searchAnalyticsData, (i11 & 67108864) != 0 ? categoryListingsDecorator.O : listingDetailsSearchAnalyticsData, (i11 & 134217728) != 0 ? categoryListingsDecorator.P : listingsAnalytics$FiltersPlace2, (i11 & 268435456) != 0 ? categoryListingsDecorator.Q : aVar);
    }

    private final Object n0(CategoryEntity categoryEntity, DistrictEntity districtEntity, zz.a<? super CategoryDistrict> aVar) {
        if (districtEntity == null) {
            return this.f28112x.getCategoryDistrictByCategoryId(categoryEntity.getId(), aVar);
        }
        return this.f28112x.getCategoryDistrictByCategoryId(categoryEntity.getId(), districtEntity.getId(), aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0073, code lost:
        if (r11 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(int r9, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r10, zz.a<? super java.lang.Integer> r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.o0(int, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x005e, code lost:
        if (r6 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(com.forsale.app.datalayer.database.DistrictEntity r5, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r6, zz.a<? super java.lang.Integer> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$findGamDistrictTargetId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$findGamDistrictTargetId$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$findGamDistrictTargetId$1) r0
            int r1 = r0.f28156e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28156e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$findGamDistrictTargetId$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$findGamDistrictTargetId$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f28154c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28156e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f28153b
            r6 = r5
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r6 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData) r6
            java.lang.Object r5 = r0.f28152a
            com.forsale.app.datalayer.database.DistrictEntity r5 = (com.forsale.app.datalayer.database.DistrictEntity) r5
            kotlin.f.b(r7)
            goto L4a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.f.b(r7)
            r0.f28152a = r5
            r0.f28153b = r6
            r0.f28156e = r3
            java.lang.Object r7 = r4.B0(r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.util.List r7 = (java.util.List) r7
            r0 = 0
            if (r6 == 0) goto L60
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L5d
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5b
            goto L5d
        L5b:
            r6 = r0
            goto L5e
        L5d:
            r6 = r3
        L5e:
            if (r6 == 0) goto L69
        L60:
            if (r5 == 0) goto L69
            int r6 = r5.getId()
            kotlin.coroutines.jvm.internal.a.d(r6)
        L69:
            if (r7 == 0) goto L72
            int r6 = r7.size()
            if (r6 != r3) goto L72
            goto L73
        L72:
            r3 = r0
        L73:
            if (r3 == 0) goto L7a
            java.lang.Object r5 = kotlin.collections.p.k0(r7)
            return r5
        L7a:
            if (r5 == 0) goto L85
            int r5 = r5.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            goto L86
        L85:
            r5 = 0
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.p0(com.forsale.app.datalayer.database.DistrictEntity, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, zz.a):java.lang.Object");
    }

    private final List<ListingItemBrief> q0(CategoryDistrict categoryDistrict, ListingsResponse listingsResponse) {
        List<ListingItemBrief> Q0;
        Q0 = CollectionsKt___CollectionsKt.Q0(listingsResponse.getListings().getPinnedItems(), listingsResponse.getTotalCommercialItems());
        return y.f40549a.a(categoryDistrict.getCommercialPinningShuffleFactor(), listingsResponse.getListings().getCommercialPinnedShuffleItems(), Q0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(com.forsale.app.datalayer.database.CategoryDistrict r5, com.forsale.app.datalayer.network.responses.ListingsResponse r6, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1) r0
            int r1 = r0.f28160d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28160d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f28158b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28160d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f28157a
            java.util.List r5 = (java.util.List) r5
            kotlin.f.b(r7)
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            com.forsale.app.utils.y r7 = com.forsale.app.utils.y.f40549a
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r6 = r6.getListings()
            java.util.List r6 = r6.getUserTypePinnedShuffleItems()
            int r5 = r5.getUserTypePinningShuffleFactor()
            java.util.List r5 = r7.b(r6, r5)
            kotlinx.coroutines.MainCoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$2 r7 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formForSaleRealtyPinnedShuffledListings$2
            r2 = 0
            r7.<init>(r4, r5, r2)
            r0.f28157a = r5
            r0.f28160d = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.r0(com.forsale.app.datalayer.database.CategoryDistrict, com.forsale.app.datalayer.network.responses.ListingsResponse, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04b0  */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x02cf -> B:151:0x02d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x03ad -> B:170:0x03b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r31, java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r32, java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r33, java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r34, int r35, com.forsale.app.datalayer.database.CategoryEntity r36, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings r37, zz.a<? super java.util.List<? extends qc.b<?>>> r38) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.s0(java.util.List, java.util.List, java.util.List, java.util.List, int, com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings, zz.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e1 -> B:57:0x00eb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(com.forsale.app.datalayer.database.CategoryEntity r21, java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r22, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings r23, int r24, zz.a<? super java.util.List<? extends qc.b<?>>> r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.t0(com.forsale.app.datalayer.database.CategoryEntity, java.util.List, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings, int, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object u0(CategoryListingsDecorator categoryListingsDecorator, CategoryEntity categoryEntity, List list, ListingsResponse.UISettings uISettings, int i11, zz.a aVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return categoryListingsDecorator.t0(categoryEntity, list, uISettings, i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(com.forsale.app.datalayer.database.CategoryDistrict r6, com.forsale.app.datalayer.network.responses.ListingsResponse r7, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1) r0
            int r1 = r0.f28192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28192e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f28190c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28192e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f28189b
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f28188a
            java.util.List r7 = (java.util.List) r7
            kotlin.f.b(r8)
            goto L85
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r8 = r7.getListings()
            java.util.List r8 = r8.getPinnedItems()
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            int r2 = r7.getTotalCommercialItems()
            int r8 = r8 - r2
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r2 = r7.getListings()
            java.util.List r2 = r2.getPinnedItems()
            java.util.List r8 = kotlin.collections.p.R0(r2, r8)
            com.forsale.app.utils.y r2 = com.forsale.app.utils.y.f40549a
            com.forsale.app.datalayer.network.responses.ListingsResponse$Listings r7 = r7.getListings()
            java.util.List r7 = r7.getPinnedShuffleItems()
            int r6 = r6.getPinningShuffleFactor()
            java.util.List r6 = r2.b(r7, r6)
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2 r2 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f28188a = r8
            r0.f28189b = r6
            r0.f28192e = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            r7 = r8
        L85:
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = kotlin.collections.p.E0(r7, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = kotlin.collections.p.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.v0(com.forsale.app.datalayer.database.CategoryDistrict, com.forsale.app.datalayer.network.responses.ListingsResponse, zz.a):java.lang.Object");
    }

    public final int w0() {
        return ((Number) this.W.getValue()).intValue();
    }

    private final zb.d x0() {
        return (zb.d) this.S.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x007b -> B:71:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(zz.a<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFilterNames$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFilterNames$1 r0 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFilterNames$1) r0
            int r1 = r0.f28200e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28200e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFilterNames$1 r0 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$getFilterNames$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f28198c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f28200e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r2 = r0.f28197b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f28196a
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.f.b(r6)
            goto L7e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.f.b(r6)
            goto L4e
        L40:
            kotlin.f.b(r6)
            kotlinx.coroutines.Deferred<com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator> r6 = r5.C
            r0.f28200e = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r6 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator) r6
            if (r6 == 0) goto Laf
            java.util.List r6 = r6.i()
            if (r6 == 0) goto Laf
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r2
            r2 = r6
        L65:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L86
            java.lang.Object r6 = r2.next()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r6 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel) r6
            r0.f28196a = r4
            r0.f28197b = r2
            r0.f28200e = r3
            java.lang.Object r6 = r6.N(r0)
            if (r6 != r1) goto L7e
            return r1
        L7e:
            com.forsale.app.utils.analytics.listingfiltration.a r6 = (com.forsale.app.utils.analytics.listingfiltration.a) r6
            if (r6 == 0) goto L65
            r4.add(r6)
            goto L65
        L86:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Laf
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r4, r0)
            r6.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            com.forsale.app.utils.analytics.listingfiltration.a r1 = (com.forsale.app.utils.analytics.listingfiltration.a) r1
            java.lang.String r1 = r1.a()
            r6.add(r1)
            goto L9b
        Laf:
            r6 = 0
        Lb0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.y0(zz.a):java.lang.Object");
    }

    public final GetListingsBody.FiltrationData A0() {
        return this.F;
    }

    public final ListingsIntention C0() {
        return this.K;
    }

    public final ListingDetailsSearchAnalyticsData D0() {
        return this.O;
    }

    public final SearchAnalyticsData E0() {
        return this.N;
    }

    public final Integer F0() {
        DistrictEntity districtEntity = this.f28104p;
        if (districtEntity != null) {
            return Integer.valueOf(districtEntity.getId());
        }
        return null;
    }

    public final int H0(ListingsResponse.UISettings settings) {
        o.i(settings, "settings");
        int i11 = a.f28116b[settings.getListingsSettings().getCardDisplay(ListingDecoratorTypes.CATEGORY_LISTINGS).ordinal()];
        return 1;
    }

    public final void R0(int i11) {
        if (i11 >= 2 && this.f28103o != null) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new CategoryListingsDecorator$logScrolledListingsAnalytics$1(this, i11, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e4, code lost:
        if (r9 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0110, code lost:
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x00a6 -> B:98:0x00a9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(boolean r8, boolean r9, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.T0(boolean, boolean, zz.a):java.lang.Object");
    }

    public void Z0(boolean z11) {
        this.R = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListingsDecorator)) {
            return false;
        }
        CategoryListingsDecorator categoryListingsDecorator = (CategoryListingsDecorator) obj;
        if (o.d(this.f28103o, categoryListingsDecorator.f28103o) && o.d(this.f28104p, categoryListingsDecorator.f28104p) && o.d(this.f28105q, categoryListingsDecorator.f28105q) && o.d(this.f28106r, categoryListingsDecorator.f28106r) && o.d(this.f28107s, categoryListingsDecorator.f28107s) && o.d(this.f28108t, categoryListingsDecorator.f28108t) && o.d(this.f28109u, categoryListingsDecorator.f28109u) && o.d(this.f28110v, categoryListingsDecorator.f28110v) && o.d(this.f28111w, categoryListingsDecorator.f28111w) && o.d(this.f28112x, categoryListingsDecorator.f28112x) && o.d(this.f28113y, categoryListingsDecorator.f28113y) && o.d(this.f28114z, categoryListingsDecorator.f28114z) && o.d(this.A, categoryListingsDecorator.A) && o.d(this.B, categoryListingsDecorator.B) && o.d(this.C, categoryListingsDecorator.C) && o.d(this.D, categoryListingsDecorator.D) && o.d(this.E, categoryListingsDecorator.E) && o.d(this.F, categoryListingsDecorator.F) && o.d(this.G, categoryListingsDecorator.G) && o.d(this.H, categoryListingsDecorator.H) && this.I == categoryListingsDecorator.I && o.d(this.J, categoryListingsDecorator.J) && this.K == categoryListingsDecorator.K && o.d(this.L, categoryListingsDecorator.L) && o.d(this.M, categoryListingsDecorator.M) && o.d(this.N, categoryListingsDecorator.N) && o.d(this.O, categoryListingsDecorator.O) && this.P == categoryListingsDecorator.P && o.d(this.Q, categoryListingsDecorator.Q)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[PHI: r1 
      PHI: (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:45:0x009b, B:36:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(com.forsale.app.datalayer.network.responses.ListingItemBrief r18, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.ListingsSettings r19, com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings r20, int r21, int r22, com.forsale.app.features.categories.listings.ListingDecoratorTypes r23, zz.a<? super kotlinx.coroutines.Deferred<? extends qc.b<com.forsale.app.datalayer.network.responses.ListingItemBrief>>> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$1
            if (r2 == 0) goto L17
            r2 = r1
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$1 r2 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$1) r2
            int r3 = r2.f28125i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f28125i = r3
            goto L1c
        L17:
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$1 r2 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f28123g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f28125i
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L59
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.f.b(r1)
            goto L9e
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            int r4 = r2.f28122f
            int r6 = r2.f28121e
            java.lang.Object r7 = r2.f28120d
            com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings r7 = (com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings) r7
            java.lang.Object r8 = r2.f28119c
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$ListingsSettings r8 = (com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.ListingsSettings) r8
            java.lang.Object r9 = r2.f28118b
            com.forsale.app.datalayer.network.responses.ListingItemBrief r9 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r9
            java.lang.Object r10 = r2.f28117a
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator r10 = (com.forsale.app.features.categories.listings.category.CategoryListingsDecorator) r10
            kotlin.f.b(r1)
            r12 = r4
            r14 = r6
            r11 = r7
            r16 = r10
            r10 = r8
            r8 = r16
            goto L82
        L59:
            kotlin.f.b(r1)
            r2.f28117a = r0
            r1 = r18
            r2.f28118b = r1
            r4 = r19
            r2.f28119c = r4
            r7 = r20
            r2.f28120d = r7
            r8 = r21
            r2.f28121e = r8
            r9 = r22
            r2.f28122f = r9
            r2.f28125i = r6
            java.lang.Object r6 = r0.y0(r2)
            if (r6 != r3) goto L7b
            return r3
        L7b:
            r10 = r4
            r11 = r7
            r14 = r8
            r12 = r9
            r8 = r0
            r9 = r1
            r1 = r6
        L82:
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2 r1 = new com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2
            r15 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 0
            r2.f28117a = r4
            r2.f28118b = r4
            r2.f28119c = r4
            r2.f28120d = r4
            r2.f28125i = r5
            java.lang.Object r1 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r1, r2)
            if (r1 != r3) goto L9e
            return r3
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.f(com.forsale.app.datalayer.network.responses.ListingItemBrief, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$ListingsSettings, com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings, int, int, com.forsale.app.features.categories.listings.ListingDecoratorTypes, zz.a):java.lang.Object");
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        CategoryEntity categoryEntity = this.f28103o;
        int i11 = 0;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        int i12 = hashCode * 31;
        DistrictEntity districtEntity = this.f28104p;
        if (districtEntity == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = districtEntity.hashCode();
        }
        int hashCode10 = (((((((((((((i12 + hashCode2) * 31) + this.f28105q.hashCode()) * 31) + this.f28106r.hashCode()) * 31) + this.f28107s.hashCode()) * 31) + this.f28108t.hashCode()) * 31) + this.f28109u.hashCode()) * 31) + this.f28110v.hashCode()) * 31;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28111w;
        if (categoryListingsAnalyticSource == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = categoryListingsAnalyticSource.hashCode();
        }
        int hashCode11 = (((((((((((((((((hashCode10 + hashCode3) * 31) + this.f28112x.hashCode()) * 31) + this.f28113y.hashCode()) * 31) + this.f28114z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31;
        GetListingsBody.FiltrationData filtrationData = this.F;
        if (filtrationData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = filtrationData.hashCode();
        }
        int hashCode12 = (((hashCode11 + hashCode4) * 31) + this.G.hashCode()) * 31;
        Pair<com.forsale.app.utils.analytics.listingfiltration.a, Integer> pair = this.H;
        if (pair == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = pair.hashCode();
        }
        int i13 = (hashCode12 + hashCode5) * 31;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace = this.I;
        if (listingsAnalytics$FiltersPlace == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = listingsAnalytics$FiltersPlace.hashCode();
        }
        int hashCode13 = (((((i13 + hashCode6) * 31) + this.J.hashCode()) * 31) + this.K.hashCode()) * 31;
        String str = this.L;
        if (str == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str.hashCode();
        }
        int hashCode14 = (((hashCode13 + hashCode7) * 31) + this.M.hashCode()) * 31;
        SearchAnalyticsData searchAnalyticsData = this.N;
        if (searchAnalyticsData == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = searchAnalyticsData.hashCode();
        }
        int i14 = (hashCode14 + hashCode8) * 31;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.O;
        if (listingDetailsSearchAnalyticsData == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = listingDetailsSearchAnalyticsData.hashCode();
        }
        int i15 = (i14 + hashCode9) * 31;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2 = this.P;
        if (listingsAnalytics$FiltersPlace2 != null) {
            i11 = listingsAnalytics$FiltersPlace2.hashCode();
        }
        return ((i15 + i11) * 31) + this.Q.hashCode();
    }

    public final CategoryListingsDecorator l0(CategoryEntity categoryEntity, DistrictEntity districtEntity, b0<Integer> totalPagesCountMutableLiveData, b0<ListingsResponse.UISettings> uiSettingsMutableLiveData, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ListingsRepository listingsRepository, ApplicationResourcesRepository arr, CategoryListingsAnalyticSource categoryListingsAnalyticSource, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, GAMRepository gamRepository, fj.b gamUtils, AggregatedAllAnalyticsLogger analyticsLogger, Deferred<FiltersMediator> filtersMediator, CategorySortingStateHandler sortingHandler, b0<Integer> totalListingsCount, GetListingsBody.FiltrationData filtrationData, ListingsFiltrationAnalytics filtrationAnalytics, Pair<? extends com.forsale.app.utils.analytics.listingfiltration.a, Integer> pair, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, l<? super Integer, ListingItemDetails> itemDetailsLambda, ListingsIntention intention, String str, AtomicBoolean predefinedFiltersConsumed, SearchAnalyticsData searchAnalyticsData, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2, nc.a getSwipeableInteractor) {
        o.i(totalPagesCountMutableLiveData, "totalPagesCountMutableLiveData");
        o.i(uiSettingsMutableLiveData, "uiSettingsMutableLiveData");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(listingsRepository, "listingsRepository");
        o.i(arr, "arr");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepository, "districtsRepository");
        o.i(gamRepository, "gamRepository");
        o.i(gamUtils, "gamUtils");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(filtersMediator, "filtersMediator");
        o.i(sortingHandler, "sortingHandler");
        o.i(totalListingsCount, "totalListingsCount");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(itemDetailsLambda, "itemDetailsLambda");
        o.i(intention, "intention");
        o.i(predefinedFiltersConsumed, "predefinedFiltersConsumed");
        o.i(getSwipeableInteractor, "getSwipeableInteractor");
        return new CategoryListingsDecorator(categoryEntity, districtEntity, totalPagesCountMutableLiveData, uiSettingsMutableLiveData, region, misc, listingsRepository, arr, categoryListingsAnalyticSource, categoriesRepositories, districtsRepository, gamRepository, gamUtils, analyticsLogger, filtersMediator, sortingHandler, totalListingsCount, filtrationData, filtrationAnalytics, pair, listingsAnalytics$FiltersPlace, itemDetailsLambda, intention, str, predefinedFiltersConsumed, searchAnalyticsData, listingDetailsSearchAnalyticsData, listingsAnalytics$FiltersPlace2, getSwipeableInteractor);
    }

    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    public boolean o() {
        return this.R;
    }

    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    public boolean p() {
        int i11;
        GetListingsBody.FiltrationData filtrationData = this.F;
        if (filtrationData != null) {
            i11 = filtrationData.getCount();
        } else {
            i11 = 0;
        }
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9  */
    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(zz.a<? super kotlin.Pair<java.lang.Integer, ? extends java.util.List<? extends qc.b<?>>>> r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.s(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d9  */
    @Override // com.forsale.app.features.categories.listings.PagedListingsDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(int r31, zz.a<? super kotlin.Pair<java.lang.Integer, ? extends java.util.List<? extends qc.b<?>>>> r32) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.t(int, zz.a):java.lang.Object");
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f28103o;
        DistrictEntity districtEntity = this.f28104p;
        b0<Integer> b0Var = this.f28105q;
        b0<ListingsResponse.UISettings> b0Var2 = this.f28106r;
        LiveData<RegionEntity> liveData = this.f28107s;
        LiveData<MasterDataMiscModel> liveData2 = this.f28108t;
        ListingsRepository listingsRepository = this.f28109u;
        ApplicationResourcesRepository applicationResourcesRepository = this.f28110v;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28111w;
        CategoriesRepositories categoriesRepositories = this.f28112x;
        DistrictsRepository districtsRepository = this.f28113y;
        GAMRepository gAMRepository = this.f28114z;
        fj.b bVar = this.A;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.B;
        Deferred<FiltersMediator> deferred = this.C;
        CategorySortingStateHandler categorySortingStateHandler = this.D;
        b0<Integer> b0Var3 = this.E;
        GetListingsBody.FiltrationData filtrationData = this.F;
        ListingsFiltrationAnalytics listingsFiltrationAnalytics = this.G;
        Pair<com.forsale.app.utils.analytics.listingfiltration.a, Integer> pair = this.H;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace = this.I;
        l<Integer, ListingItemDetails> lVar = this.J;
        ListingsIntention listingsIntention = this.K;
        String str = this.L;
        AtomicBoolean atomicBoolean = this.M;
        SearchAnalyticsData searchAnalyticsData = this.N;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.O;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2 = this.P;
        nc.a aVar = this.Q;
        return "CategoryListingsDecorator(category=" + categoryEntity + ", district=" + districtEntity + ", totalPagesCountMutableLiveData=" + b0Var + ", uiSettingsMutableLiveData=" + b0Var2 + ", region=" + liveData + ", misc=" + liveData2 + ", listingsRepository=" + listingsRepository + ", arr=" + applicationResourcesRepository + ", analyticSource=" + categoryListingsAnalyticSource + ", categoriesRepositories=" + categoriesRepositories + ", districtsRepository=" + districtsRepository + ", gamRepository=" + gAMRepository + ", gamUtils=" + bVar + ", analyticsLogger=" + aggregatedAllAnalyticsLogger + ", filtersMediator=" + deferred + ", sortingHandler=" + categorySortingStateHandler + ", totalListingsCount=" + b0Var3 + ", filtrationData=" + filtrationData + ", filtrationAnalytics=" + listingsFiltrationAnalytics + ", lastAppliedFilter=" + pair + ", lastAppliedFilterPlace=" + listingsAnalytics$FiltersPlace + ", itemDetailsLambda=" + lVar + ", intention=" + listingsIntention + ", searchKeyword=" + str + ", predefinedFiltersConsumed=" + atomicBoolean + ", searchAnalyticsData=" + searchAnalyticsData + ", listingDetailsSearchAnalyticsData=" + listingDetailsSearchAnalyticsData + ", filtersPlace=" + listingsAnalytics$FiltersPlace2 + ", getSwipeableInteractor=" + aVar + ")";
    }

    public final ListingsAnalytics$FiltersPlace z0() {
        return this.P;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CategoryListingsDecorator(com.forsale.app.datalayer.database.CategoryEntity r21, com.forsale.app.datalayer.database.DistrictEntity r22, androidx.lifecycle.b0<java.lang.Integer> r23, androidx.lifecycle.b0<com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings> r24, androidx.lifecycle.LiveData<com.forsale.app.datalayer.database.RegionEntity> r25, androidx.lifecycle.LiveData<com.forsale.app.datalayer.database.MasterDataMiscModel> r26, com.forsale.app.datalayer.repositories.ListingsRepository r27, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r28, com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource r29, com.forsale.app.datalayer.repositories.CategoriesRepositories r30, com.forsale.app.datalayer.repositories.DistrictsRepository r31, com.forsale.app.datalayer.repositories.GAMRepository r32, fj.b r33, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r34, kotlinx.coroutines.Deferred<com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator> r35, com.forsale.app.features.categories.listings.CategorySortingStateHandler r36, androidx.lifecycle.b0<java.lang.Integer> r37, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r38, com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r39, kotlin.Pair<? extends com.forsale.app.utils.analytics.listingfiltration.a, java.lang.Integer> r40, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r41, g00.l<? super java.lang.Integer, com.forsale.app.datalayer.network.responses.ListingItemDetails> r42, com.forsale.app.features.categories.listings.ListingsIntention r43, java.lang.String r44, java.util.concurrent.atomic.AtomicBoolean r45, com.forsale.app.features.search.SearchAnalyticsData r46, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r47, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r48, nc.a r49) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator.<init>(com.forsale.app.datalayer.database.CategoryEntity, com.forsale.app.datalayer.database.DistrictEntity, androidx.lifecycle.b0, androidx.lifecycle.b0, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, com.forsale.app.datalayer.repositories.ListingsRepository, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository, com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource, com.forsale.app.datalayer.repositories.CategoriesRepositories, com.forsale.app.datalayer.repositories.DistrictsRepository, com.forsale.app.datalayer.repositories.GAMRepository, fj.b, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger, kotlinx.coroutines.Deferred, com.forsale.app.features.categories.listings.CategorySortingStateHandler, androidx.lifecycle.b0, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics, kotlin.Pair, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, g00.l, com.forsale.app.features.categories.listings.ListingsIntention, java.lang.String, java.util.concurrent.atomic.AtomicBoolean, com.forsale.app.features.search.SearchAnalyticsData, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, nc.a):void");
    }
}
