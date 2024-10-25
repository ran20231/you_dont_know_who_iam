package com.forsale.app.features.categories.listings.items;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingPlaceHolderImage;
import com.forsale.app.features.categories.listings.ListingsVerticalStyles;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.utils.LiveDataExtensions;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.app.utils.itemutils.TextHolder;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.AdRequest;
import falcon.chat.entities.ExtensionsKt;
import g00.l;
import g00.p;
import g00.r;
import hk.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
import qc.b;
import t9.q0;
import t9.y0;
import wz.h;
/* compiled from: DefaultListingItemViewModel.kt */
/* loaded from: classes2.dex */
public class DefaultListingItemViewModel extends b<ListingItemBrief> implements oc.a {
    private final ListingsAnalytics$FiltersPlace A;
    private final int B;
    private final SortingStates C;
    private final CoroutineScope D;
    private final List<Integer> E;
    private Integer F;
    private final boolean G;
    private final a.C0648a H;
    private final boolean I;
    private final hk.a J;
    private final String K;
    private final OneShotEventHandler<ListingItemBrief> L;
    private final h M;
    private final h N;
    private final h O;
    private final h P;
    private final h Q;
    private final ListingsResponse.UISettings.Label R;
    private final a.b S;
    private final h T;

    /* renamed from: c  reason: collision with root package name */
    private final ListingItemBrief f30552c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingsResponse.UISettings.ListingsSettings f30553d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<RegionEntity> f30554e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<MasterDataMiscModel> f30555f;

    /* renamed from: g  reason: collision with root package name */
    private final ApplicationResourcesRepository f30556g;

    /* renamed from: h  reason: collision with root package name */
    private final p<ListingItemBrief, List<? extends Object>, wz.p> f30557h;

    /* renamed from: i  reason: collision with root package name */
    private final String f30558i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f30559j;

    /* renamed from: x  reason: collision with root package name */
    private final r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p> f30560x;

    /* renamed from: y  reason: collision with root package name */
    private final ListingsVerticalStyles f30561y;

    /* renamed from: z  reason: collision with root package name */
    private final List<String> f30562z;

    /* compiled from: DefaultListingItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30564a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f30565b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f30566c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f30567d;

        static {
            int[] iArr = new int[ItemStatus.values().length];
            try {
                iArr[ItemStatus.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemStatus.COMMERCIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemStatus.COMMERCIAL_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemStatus.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ItemStatus.DRAFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ItemStatus.PINNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ItemStatus.WAITING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ItemStatus.QUARANTINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f30564a = iArr;
            int[] iArr2 = new int[ListingsVerticalStyles.values().length];
            try {
                iArr2[ListingsVerticalStyles.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ListingsVerticalStyles.JOBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ListingsVerticalStyles.AUTOMOTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ListingsVerticalStyles.ELECTRONICS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ListingsVerticalStyles.BUY_AND_SELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ListingsVerticalStyles.SERVICES.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f30565b = iArr2;
            int[] iArr3 = new int[ListingPlaceHolderImage.values().length];
            try {
                iArr3[ListingPlaceHolderImage.AUTOMOTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ListingPlaceHolderImage.BUY_SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ListingPlaceHolderImage.JOBS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[ListingPlaceHolderImage.PETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ListingPlaceHolderImage.PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[ListingPlaceHolderImage.SERVICES.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[ListingPlaceHolderImage.DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f30566c = iArr3;
            int[] iArr4 = new int[CardDisplayTypes.values().length];
            try {
                iArr4[CardDisplayTypes.STACKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[CardDisplayTypes.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            f30567d = iArr4;
        }
    }

    public /* synthetic */ DefaultListingItemViewModel(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData liveData, LiveData liveData2, ApplicationResourcesRepository applicationResourcesRepository, p pVar, int i11, String str, boolean z11, r rVar, boolean z12, CardDisplayTypes cardDisplayTypes, ListingsVerticalStyles listingsVerticalStyles, List list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, int i12, SortingStates sortingStates, CoroutineScope coroutineScope, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingItemBrief, listingsSettings, liveData, liveData2, applicationResourcesRepository, pVar, i11, (i13 & 128) != 0 ? null : str, (i13 & 256) != 0 ? false : z11, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.1
            public final void b(ListingItemBrief listingItemBrief2, int i14, int i15, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief2, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                b(listingItemBrief2, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData);
                return wz.p.f75480a;
            }
        } : rVar, (i13 & 1024) != 0 ? true : z12, (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? CardDisplayTypes.STACKED : cardDisplayTypes, (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : listingsVerticalStyles, (i13 & 8192) != 0 ? null : list, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : listingsAnalytics$FiltersPlace, (32768 & i13) != 0 ? 0 : i12, (65536 & i13) != 0 ? SortingStates.DEFAULT : sortingStates, (i13 & 131072) != 0 ? null : coroutineScope, list2);
    }

    private final String E() {
        return (String) this.P.getValue();
    }

    private final long H() {
        String str;
        String i11 = i();
        if (i11 == null) {
            i11 = "";
        }
        RegionEntity value = this.f30554e.getValue();
        if (value != null) {
            str = value.getUtcDiff();
        } else {
            str = null;
        }
        return TypeExtensionsKt.w(i11, str).getTime();
    }

    private final hk.a O(CardDisplayTypes cardDisplayTypes) {
        hk.a bVar;
        if (!this.I) {
            return null;
        }
        int i11 = a.f30567d[cardDisplayTypes.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                bVar = new a.b(null, 1, null);
            } else {
                bVar = new a.C0648a(null, 1, null);
            }
        } else {
            bVar = new a.b(null, 1, null);
        }
        return bVar;
    }

    public static /* synthetic */ void R(DefaultListingItemViewModel defaultListingItemViewModel, int i11, int i12, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                listingDetailsSearchAnalyticsData = null;
            }
            defaultListingItemViewModel.Q(i11, i12, listingDetailsSearchAnalyticsData);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemClicked");
    }

    private final ListingsResponse.UISettings.Label h() {
        return new ListingsResponse.UISettings.Label(this.f30556g.getString(y0.f70701u5, new Object[0]), this.f30556g.getString(y0.f70717v5, new Object[0]));
    }

    private final String i() {
        return (String) this.T.getValue();
    }

    private final String j() {
        return (String) this.O.getValue();
    }

    private final String w() {
        return (String) this.M.getValue();
    }

    private final String x() {
        return (String) this.N.getValue();
    }

    public final a.b A() {
        return this.S;
    }

    public final String B() {
        boolean z11;
        double price = this.f30552c.getPrice();
        if (price == Utils.DOUBLE_EPSILON) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        return TypeExtensionsKt.j0(price);
    }

    public final boolean C() {
        if (B() != null) {
            return true;
        }
        return false;
    }

    public final String D() {
        String str = null;
        if (B() == null) {
            return null;
        }
        String B = B();
        RegionEntity value = this.f30554e.getValue();
        if (value != null) {
            str = value.getCurrency();
        }
        return B + " " + str;
    }

    public final LiveData<RegionEntity> F() {
        return this.f30554e;
    }

    public final String G() {
        if (this.f30552c.getStatus() == ItemStatus.PINNED && this.C == SortingStates.DEFAULT) {
            return this.f30556g.getString(y0.f70787zb, new Object[0]);
        }
        return TypeExtensionsKt.s0(H());
    }

    public final String I() {
        return this.f30558i;
    }

    public final List<String> J() {
        return this.f30562z;
    }

    public final List<Integer> K() {
        return this.E;
    }

    public final String L() {
        return this.K;
    }

    public final String M() {
        String title = this.f30552c.getTitle();
        if (title == null) {
            return "";
        }
        return title;
    }

    public final hk.a N() {
        return this.J;
    }

    public final void P() {
        List<? extends Object> n11;
        this.L.i(this.f30552c);
        p<ListingItemBrief, List<? extends Object>, wz.p> pVar = this.f30557h;
        ListingItemBrief listingItemBrief = this.f30552c;
        n11 = kotlin.collections.r.n();
        pVar.invoke(listingItemBrief, n11);
    }

    public final void Q(int i11, int i12, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
        this.f30560x.d(this.f30552c, Integer.valueOf(i11), Integer.valueOf(i12), listingDetailsSearchAnalyticsData);
    }

    public void S(Integer num) {
        this.F = num;
    }

    @Override // oc.a
    public Integer a() {
        return this.F;
    }

    public final int g(int i11) {
        if (this.B > 0) {
            return i11 + 1;
        }
        return i11;
    }

    public final ListingsAnalytics$FiltersPlace k() {
        return this.A;
    }

    public final boolean l() {
        return this.I;
    }

    public final ListingItemBrief m() {
        return this.f30552c;
    }

    public final String n() {
        String value;
        a.C0648a c0648a = this.H;
        if (c0648a != null) {
            if (o.d(this.f30558i, AnalyticsDetailsSource.FOR_SALE_REALTY_PIN.getValue())) {
                c0648a = null;
            }
            if (c0648a != null && (value = AnalyticsDetailsSource.PINNED_ITEM.getValue()) != null) {
                return value;
            }
        }
        return this.f30558i;
    }

    public final LiveData<? extends String> o() {
        int i11;
        ListingsVerticalStyles listingsVerticalStyles = this.f30561y;
        if (listingsVerticalStyles == null) {
            i11 = -1;
        } else {
            i11 = a.f30565b[listingsVerticalStyles.ordinal()];
        }
        switch (i11) {
            case -1:
                return p();
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return r();
            case 2:
                return r();
            case 3:
            case 4:
            case 5:
                return p();
            case 6:
                return q();
        }
    }

    public final LiveData<String> p() {
        z<String> e11;
        LiveData b0Var;
        TextHolder catName = this.f30552c.getCatName();
        if (catName != null && (e11 = catName.e()) != null) {
            TextHolder parentCatName = this.f30552c.getParentCatName();
            if (parentCatName == null || (b0Var = parentCatName.e()) == null) {
                b0Var = new b0("");
            }
            return LiveDataExtensions.a(e11, b0Var, new p<String, String, String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$metaCatWithParent$1
                /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
                @Override // g00.p
                /* renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.String invoke(java.lang.String r2, java.lang.String r3) {
                    /*
                        r1 = this;
                        if (r3 == 0) goto Lb
                        boolean r0 = kotlin.text.k.v(r3)
                        if (r0 == 0) goto L9
                        goto Lb
                    L9:
                        r0 = 0
                        goto Lc
                    Lb:
                        r0 = 1
                    Lc:
                        if (r0 != 0) goto L20
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r3)
                        java.lang.String r3 = " , "
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        goto L22
                    L20:
                        java.lang.String r3 = ""
                    L22:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r3)
                        r0.append(r2)
                        java.lang.String r2 = r0.toString()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$metaCatWithParent$1.invoke(java.lang.String, java.lang.String):java.lang.String");
                }
            });
        }
        return null;
    }

    public final LiveData<String> q() {
        z<String> e11;
        LiveData<String> b11;
        TextHolder catName = this.f30552c.getCatName();
        if (catName == null || (e11 = catName.e()) == null || (b11 = Transformations.b(e11, new l<String, String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$metaText$1
            @Override // g00.l
            /* renamed from: b */
            public final String invoke(String str) {
                return str;
            }
        })) == null) {
            return new b0("");
        }
        return b11;
    }

    public final LiveData<String> r() {
        LiveData<String> b0Var;
        z<String> e11;
        TextHolder catName = this.f30552c.getCatName();
        if (catName == null || (e11 = catName.e()) == null || (b0Var = Transformations.b(e11, new l<String, String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$metaTextWithLocation$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // g00.l
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String invoke(java.lang.String r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel r0 = com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.this
                    com.forsale.app.datalayer.network.responses.ListingItemBrief r0 = r0.m()
                    java.lang.String r0 = r0.getDistrictName()
                    r1 = 1
                    if (r0 == 0) goto L16
                    boolean r2 = kotlin.text.k.v(r0)
                    if (r2 == 0) goto L14
                    goto L16
                L14:
                    r2 = 0
                    goto L17
                L16:
                    r2 = r1
                L17:
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L1b
                    goto L1c
                L1b:
                    r0 = 0
                L1c:
                    if (r0 != 0) goto L1f
                    goto L43
                L1f:
                    com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel r1 = com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.this
                    com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$Label r1 = com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel.e(r1)
                    java.lang.String r1 = r1.getLocalized()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r4)
                    java.lang.String r4 = " "
                    r2.append(r4)
                    r2.append(r1)
                    r2.append(r4)
                    r2.append(r0)
                    java.lang.String r4 = r2.toString()
                L43:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$metaTextWithLocation$1.invoke(java.lang.String):java.lang.String");
            }
        })) == null) {
            String districtName = this.f30552c.getDistrictName();
            if (districtName == null) {
                districtName = "";
            }
            b0Var = new b0<>(districtName);
        }
        return b0Var;
    }

    public final OneShotEventHandler<ListingItemBrief> s() {
        return this.L;
    }

    public final String t() {
        int i11;
        String j11;
        ItemStatus status = this.f30552c.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = a.f30564a[status.ordinal()];
        }
        if (i11 != 5) {
            if (i11 != 6) {
                if (i11 != 7) {
                    if (i11 != 8) {
                        j11 = null;
                    } else {
                        j11 = E();
                    }
                } else {
                    j11 = x();
                }
            } else {
                j11 = w();
            }
        } else {
            j11 = j();
        }
        if (j11 == null || ExtensionsKt.isNullOrEmpty(j11)) {
            return null;
        }
        return j11;
    }

    public final Drawable u() {
        int i11;
        Integer valueOf;
        ItemStatus status = this.f30552c.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = a.f30564a[status.ordinal()];
        }
        if (i11 != 5) {
            if (i11 != 6) {
                if (i11 != 7) {
                    if (i11 != 8) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(q0.f69828z2);
                    }
                } else {
                    valueOf = Integer.valueOf(q0.f69824y2);
                }
            } else {
                valueOf = Integer.valueOf(q0.f69811v1);
            }
        } else {
            valueOf = Integer.valueOf(q0.f69798s0);
        }
        if (valueOf == null) {
            return null;
        }
        return this.f30556g.getDrawable(valueOf.intValue());
    }

    public final boolean v() {
        return this.G;
    }

    public final a.C0648a y() {
        return this.H;
    }

    public final Drawable z() {
        int i11;
        switch (a.f30566c[this.f30553d.getPlaceholderImage().ordinal()]) {
            case 1:
                i11 = q0.f69815w1;
                break;
            case 2:
                i11 = q0.f69819x1;
                break;
            case 3:
                i11 = q0.f69827z1;
                break;
            case 4:
                i11 = q0.A1;
                break;
            case 5:
                i11 = q0.B1;
                break;
            case 6:
                i11 = q0.C1;
                break;
            case 7:
                i11 = q0.f69823y1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return this.f30556g.getDrawable(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultListingItemViewModel(ListingItemBrief item, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ApplicationResourcesRepository resourcesRepository, p<? super ListingItemBrief, ? super List<? extends Object>, wz.p> analyticLambda, int i11, String str, boolean z11, r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super ListingDetailsSearchAnalyticsData, wz.p> onItemClicked, boolean z12, CardDisplayTypes cardDisplayTypes, ListingsVerticalStyles listingsVerticalStyles, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, int i12, SortingStates sortingState, CoroutineScope coroutineScope, List<Integer> swipingIds) {
        super(i11, analyticLambda);
        h a11;
        h a12;
        h a13;
        h a14;
        h a15;
        h a16;
        o.i(item, "item");
        o.i(listingsSettings, "listingsSettings");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(analyticLambda, "analyticLambda");
        o.i(onItemClicked, "onItemClicked");
        o.i(cardDisplayTypes, "cardDisplayTypes");
        o.i(sortingState, "sortingState");
        o.i(swipingIds, "swipingIds");
        this.f30552c = item;
        this.f30553d = listingsSettings;
        this.f30554e = region;
        this.f30555f = misc;
        this.f30556g = resourcesRepository;
        this.f30557h = analyticLambda;
        this.f30558i = str;
        this.f30559j = z11;
        this.f30560x = onItemClicked;
        this.f30561y = listingsVerticalStyles;
        this.f30562z = list;
        this.A = listingsAnalytics$FiltersPlace;
        this.B = i12;
        this.C = sortingState;
        this.D = coroutineScope;
        this.E = swipingIds;
        ItemStatus status = item.getStatus();
        int i13 = status == null ? -1 : a.f30564a[status.ordinal()];
        boolean z13 = (i13 == -1 || i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? false : true;
        this.G = z13;
        this.H = (z13 && z12) ? new a.C0648a(null, 1, null) : null;
        String virtualTourThumb = item.getVirtualTourThumb();
        this.I = virtualTourThumb != null && virtualTourThumb.length() > 0;
        this.J = O(cardDisplayTypes);
        String virtualTourThumb2 = item.getVirtualTourThumb();
        this.K = virtualTourThumb2 == null ? item.getThumb() : virtualTourThumb2;
        this.L = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$pinImage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                LiveData liveData;
                liveData = DefaultListingItemViewModel.this.f30555f;
                MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) liveData.getValue();
                if (masterDataMiscModel != null) {
                    return masterDataMiscModel.getPinImage();
                }
                return null;
            }
        });
        this.M = a11;
        a12 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$pinWaitingImage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                LiveData liveData;
                liveData = DefaultListingItemViewModel.this.f30555f;
                MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) liveData.getValue();
                if (masterDataMiscModel != null) {
                    return masterDataMiscModel.getPinWaitingImage();
                }
                return null;
            }
        });
        this.N = a12;
        a13 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$draftImage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                LiveData liveData;
                liveData = DefaultListingItemViewModel.this.f30555f;
                MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) liveData.getValue();
                if (masterDataMiscModel != null) {
                    return masterDataMiscModel.getDraftImage();
                }
                return null;
            }
        });
        this.O = a13;
        a14 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$quarantineImage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                LiveData liveData;
                liveData = DefaultListingItemViewModel.this.f30555f;
                MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) liveData.getValue();
                if (masterDataMiscModel != null) {
                    return masterDataMiscModel.getQuarantineImage();
                }
                return null;
            }
        });
        this.P = a14;
        a15 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$featuredImage$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                LiveData liveData;
                liveData = DefaultListingItemViewModel.this.f30555f;
                MasterDataMiscModel masterDataMiscModel = (MasterDataMiscModel) liveData.getValue();
                if (masterDataMiscModel != null) {
                    return masterDataMiscModel.getFeaturedImage();
                }
                return null;
            }
        });
        this.Q = a15;
        this.R = h();
        this.S = TypeExtensionsKt.h0(item.isPrem()) ? new a.b(null, 1, null) : null;
        a16 = d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel$dateDisplayed$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return DefaultListingItemViewModel.this.m().getDateSort();
            }
        });
        this.T = a16;
    }
}
