package com.forsale.app.features.categories.home.allverticals;

import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor;
import com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageSwipedInteractor;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessSectionInteractor;
import com.forsale.app.domainlayer.interactors.listingdetailsInteractors.GetListingDetailsInteractor;
import com.forsale.app.domainlayer.interactors.listingsInteractors.GetFeaturedCarouselSectionInteractor;
import com.forsale.app.features.categories.home.allverticals.f;
import com.forsale.app.features.categories.home.allverticals.g;
import com.forsale.app.features.categories.home.allverticals.i;
import com.forsale.app.features.categories.home.propertyhome.interactors.HotZoneInterActor;
import com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import g00.p;
import g00.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
/* compiled from: AllVerticalsViewModel.kt */
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel extends q0 {
    private final CoroutineDispatcher A;
    private final com.forsale.app.features.categories.home.allverticals.b B;
    private final CategoryEntity C;
    private final HomeVisitedSources D;
    private final CategoryListingsAnalyticSource E;
    private final b0<RegionEntity> F;
    private final b0<MasterDataMiscModel> G;
    private final wz.h H;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> I;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> J;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> K;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> L;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> M;
    private final MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> N;
    private final List<StateFlow<com.forsale.app.features.categories.home.allverticals.f>> O;
    private final MutableSharedFlow<com.forsale.app.features.categories.home.allverticals.a> P;
    private final SharedFlow<com.forsale.app.features.categories.home.allverticals.a> Q;
    private final MutableStateFlow<Boolean> R;
    private final StateFlow<Boolean> S;
    private final Flow<i> T;

    /* renamed from: a  reason: collision with root package name */
    private final ca.c f23382a;

    /* renamed from: b  reason: collision with root package name */
    private final ca.d f23383b;

    /* renamed from: c  reason: collision with root package name */
    private final MiscInterActor f23384c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f23385d;

    /* renamed from: e  reason: collision with root package name */
    private final pa.a f23386e;

    /* renamed from: f  reason: collision with root package name */
    private final GetBusinessCommercialAdsInteractor f23387f;

    /* renamed from: g  reason: collision with root package name */
    private final GetListingDetailsInteractor f23388g;

    /* renamed from: h  reason: collision with root package name */
    private final HotZoneInterActor f23389h;

    /* renamed from: i  reason: collision with root package name */
    private final ea.b f23390i;

    /* renamed from: j  reason: collision with root package name */
    private final da.a f23391j;

    /* renamed from: x  reason: collision with root package name */
    private final nc.a f23392x;

    /* renamed from: y  reason: collision with root package name */
    private final GetFeaturedCarouselSectionInteractor f23393y;

    /* renamed from: z  reason: collision with root package name */
    private final GetBusinessSectionInteractor f23394z;

    /* compiled from: AllVerticalsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$1", f = "AllVerticalsViewModel.kt", l = {173, 174, 175}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23402a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r5.f23402a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.f.b(r6)
                goto L49
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.f.b(r6)
                goto L3e
            L21:
                kotlin.f.b(r6)
                goto L33
            L25:
                kotlin.f.b(r6)
                com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.this
                r5.f23402a = r4
                java.lang.Object r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.f(r6, r5)
                if (r6 != r0) goto L33
                return r0
            L33:
                com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.this
                r5.f23402a = r3
                java.lang.Object r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.e(r6, r5)
                if (r6 != r0) goto L3e
                return r0
            L3e:
                com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.this
                r5.f23402a = r2
                java.lang.Object r6 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.g(r6, r5)
                if (r6 != r0) goto L49
                return r0
            L49:
                wz.p r6 = wz.p.f75480a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a extends e {

        /* compiled from: AllVerticalsViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0258a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final CategoryEntity f23404a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f23405b;

            public C0258a(CategoryEntity category, boolean z11) {
                o.i(category, "category");
                this.f23404a = category;
                this.f23405b = z11;
            }

            @Override // com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.a
            public boolean a() {
                return this.f23405b;
            }

            public final CategoryEntity b() {
                return this.f23404a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0258a)) {
                    return false;
                }
                C0258a c0258a = (C0258a) obj;
                if (o.d(this.f23404a, c0258a.f23404a) && this.f23405b == c0258a.f23405b) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f23404a.hashCode() * 31;
                boolean z11 = this.f23405b;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                return hashCode + i11;
            }

            public String toString() {
                CategoryEntity categoryEntity = this.f23404a;
                boolean z11 = this.f23405b;
                return "ForSaleFullScreen(category=" + categoryEntity + ", is4sale=" + z11 + ")";
            }
        }

        /* compiled from: AllVerticalsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final List<CategoryEntity> f23406a;

            /* renamed from: b  reason: collision with root package name */
            private final int f23407b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f23408c;

            public b(List<CategoryEntity> categories, int i11, boolean z11) {
                o.i(categories, "categories");
                this.f23406a = categories;
                this.f23407b = i11;
                this.f23408c = z11;
            }

            @Override // com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.a
            public boolean a() {
                return this.f23408c;
            }

            public final List<CategoryEntity> b() {
                return this.f23406a;
            }

            public final int c() {
                return this.f23407b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (o.d(this.f23406a, bVar.f23406a) && this.f23407b == bVar.f23407b && this.f23408c == bVar.f23408c) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.f23406a.hashCode() * 31) + Integer.hashCode(this.f23407b)) * 31;
                boolean z11 = this.f23408c;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                return hashCode + i11;
            }

            public String toString() {
                List<CategoryEntity> list = this.f23406a;
                int i11 = this.f23407b;
                boolean z11 = this.f23408c;
                return "GridCategories(categories=" + list + ", columnCount=" + i11 + ", is4sale=" + z11 + ")";
            }
        }

        boolean a();
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f23409a;

        /* renamed from: b  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f23410b;

        /* renamed from: c  reason: collision with root package name */
        private final c f23411c;

        /* renamed from: d  reason: collision with root package name */
        private final List<VerticalListingItemViewModel> f23412d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f23413e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f23414f;

        public b(ListingsResponse.UISettings.Label title, ListingsResponse.UISettings.Label subTitle, c cVar, List<VerticalListingItemViewModel> listings, boolean z11, boolean z12) {
            o.i(title, "title");
            o.i(subTitle, "subTitle");
            o.i(listings, "listings");
            this.f23409a = title;
            this.f23410b = subTitle;
            this.f23411c = cVar;
            this.f23412d = listings;
            this.f23413e = z11;
            this.f23414f = z12;
        }

        public final c b() {
            return this.f23411c;
        }

        public final List<VerticalListingItemViewModel> c() {
            return this.f23412d;
        }

        public final boolean d() {
            return this.f23413e;
        }

        public final ListingsResponse.UISettings.Label e() {
            return this.f23410b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f23409a, bVar.f23409a) && o.d(this.f23410b, bVar.f23410b) && o.d(this.f23411c, bVar.f23411c) && o.d(this.f23412d, bVar.f23412d) && this.f23413e == bVar.f23413e && this.f23414f == bVar.f23414f) {
                return true;
            }
            return false;
        }

        public final ListingsResponse.UISettings.Label f() {
            return this.f23409a;
        }

        public final boolean g() {
            return this.f23414f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f23409a.hashCode() * 31) + this.f23410b.hashCode()) * 31;
            c cVar = this.f23411c;
            if (cVar == null) {
                hashCode = 0;
            } else {
                hashCode = cVar.hashCode();
            }
            int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f23412d.hashCode()) * 31;
            boolean z11 = this.f23413e;
            int i11 = 1;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode3 + i12) * 31;
            boolean z12 = this.f23414f;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i13 + i11;
        }

        public String toString() {
            ListingsResponse.UISettings.Label label = this.f23409a;
            ListingsResponse.UISettings.Label label2 = this.f23410b;
            c cVar = this.f23411c;
            List<VerticalListingItemViewModel> list = this.f23412d;
            boolean z11 = this.f23413e;
            boolean z12 = this.f23414f;
            return "FeaturedSectionContent(title=" + label + ", subTitle=" + label2 + ", filler=" + cVar + ", listings=" + list + ", showSeeAll=" + z11 + ", isCommercial=" + z12 + ")";
        }
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f23415a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23416b;

        /* renamed from: c  reason: collision with root package name */
        private final String f23417c;

        public c(String str, String str2, String str3) {
            this.f23415a = str;
            this.f23416b = str2;
            this.f23417c = str3;
        }

        public final String a() {
            if (LocaleManager.f39597a.r()) {
                return this.f23415a;
            }
            return this.f23416b;
        }

        public final String b() {
            return this.f23417c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.d(this.f23415a, cVar.f23415a) && o.d(this.f23416b, cVar.f23416b) && o.d(this.f23417c, cVar.f23417c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f23415a;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.f23416b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.f23417c;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            String str = this.f23415a;
            String str2 = this.f23416b;
            String str3 = this.f23417c;
            return "FillerContent(imageAr=" + str + ", imageEn=" + str2 + ", phoneNumber=" + str3 + ")";
        }

        public /* synthetic */ c(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f23418a;

        /* renamed from: b  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f23419b;

        /* renamed from: c  reason: collision with root package name */
        private final List<VerticalListingItemViewModel> f23420c;

        public d(ListingsResponse.UISettings.Label title, ListingsResponse.UISettings.Label subTitle, List<VerticalListingItemViewModel> listings) {
            o.i(title, "title");
            o.i(subTitle, "subTitle");
            o.i(listings, "listings");
            this.f23418a = title;
            this.f23419b = subTitle;
            this.f23420c = listings;
        }

        public final List<VerticalListingItemViewModel> b() {
            return this.f23420c;
        }

        public final ListingsResponse.UISettings.Label c() {
            return this.f23419b;
        }

        public final ListingsResponse.UISettings.Label d() {
            return this.f23418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (o.d(this.f23418a, dVar.f23418a) && o.d(this.f23419b, dVar.f23419b) && o.d(this.f23420c, dVar.f23420c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f23418a.hashCode() * 31) + this.f23419b.hashCode()) * 31) + this.f23420c.hashCode();
        }

        public String toString() {
            ListingsResponse.UISettings.Label label = this.f23418a;
            ListingsResponse.UISettings.Label label2 = this.f23419b;
            List<VerticalListingItemViewModel> list = this.f23420c;
            return "NewArrivalsSectionContent(title=" + label + ", subTitle=" + label2 + ", listings=" + list + ")";
        }
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface e {

        /* compiled from: AllVerticalsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            public static final a f23426a = new a();

            private a() {
            }
        }
    }

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23430a;

        static {
            int[] iArr = new int[AllVerticalsSectionType.values().length];
            try {
                iArr[AllVerticalsSectionType.CATEGORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AllVerticalsSectionType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AllVerticalsSectionType.BUSINESS_COMMERCIAL_ADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AllVerticalsSectionType.AUTO_FEATURED_ADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AllVerticalsSectionType.BROWS_AND_EXPLORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AllVerticalsSectionType.GAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AllVerticalsSectionType.NEW_ARRIVALS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AllVerticalsSectionType.FEATURED_ADS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f23430a = iArr;
        }
    }

    public AllVerticalsViewModel(ca.c getCategoriesInteractor, ca.d getCategoryInterstitial, MiscInterActor miscInterActor, ApplicationResourcesRepository applicationResourcesRepository, pa.a allVerticalsAnalyticsTracker, GetBusinessCommercialAdsInteractor getBusinessCommercialAdsInteractor, GetListingDetailsInteractor getListingDetailsInteractors, HotZoneInterActor getHotZoneInterActor, ea.b getNewArrivalsInteractor, da.a gamForCategoryInteractor, nc.a getSwipeableListInteractor, GetFeaturedCarouselSectionInteractor getFeaturedCarouselSectionInteractor, GetBusinessSectionInteractor getBusinessSectionInteractor, CoroutineDispatcher ioDispatcher, k0 savedStateHandle) {
        wz.h a11;
        int y11;
        List X0;
        String str;
        StateFlow<com.forsale.app.features.categories.home.allverticals.f> stateFlow;
        o.i(getCategoriesInteractor, "getCategoriesInteractor");
        o.i(getCategoryInterstitial, "getCategoryInterstitial");
        o.i(miscInterActor, "miscInterActor");
        o.i(applicationResourcesRepository, "applicationResourcesRepository");
        o.i(allVerticalsAnalyticsTracker, "allVerticalsAnalyticsTracker");
        o.i(getBusinessCommercialAdsInteractor, "getBusinessCommercialAdsInteractor");
        o.i(getListingDetailsInteractors, "getListingDetailsInteractors");
        o.i(getHotZoneInterActor, "getHotZoneInterActor");
        o.i(getNewArrivalsInteractor, "getNewArrivalsInteractor");
        o.i(gamForCategoryInteractor, "gamForCategoryInteractor");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        o.i(getFeaturedCarouselSectionInteractor, "getFeaturedCarouselSectionInteractor");
        o.i(getBusinessSectionInteractor, "getBusinessSectionInteractor");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(savedStateHandle, "savedStateHandle");
        this.f23382a = getCategoriesInteractor;
        this.f23383b = getCategoryInterstitial;
        this.f23384c = miscInterActor;
        this.f23385d = applicationResourcesRepository;
        this.f23386e = allVerticalsAnalyticsTracker;
        this.f23387f = getBusinessCommercialAdsInteractor;
        this.f23388g = getListingDetailsInteractors;
        this.f23389h = getHotZoneInterActor;
        this.f23390i = getNewArrivalsInteractor;
        this.f23391j = gamForCategoryInteractor;
        this.f23392x = getSwipeableListInteractor;
        this.f23393y = getFeaturedCarouselSectionInteractor;
        this.f23394z = getBusinessSectionInteractor;
        this.A = ioDispatcher;
        com.forsale.app.features.categories.home.allverticals.b b11 = com.forsale.app.features.categories.home.allverticals.b.f23785d.b(savedStateHandle);
        this.B = b11;
        this.C = b11.b();
        this.D = b11.c();
        this.E = b11.a();
        this.F = new b0<>(RegionEntity.Companion.createDefaultRegion());
        this.G = new b0<>(MasterDataMiscModel.Companion.createDefaultMasterDataMisc());
        a11 = kotlin.d.a(new g00.a<List<? extends AllVerticalsSectionType>>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$sectionsList$2

            /* compiled from: Comparisons.kt */
            /* loaded from: classes2.dex */
            public static final class a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int a11;
                    a11 = yz.b.a(Integer.valueOf(((CategoryEntity.Sections) t11).getOrder()), Integer.valueOf(((CategoryEntity.Sections) t12).getOrder()));
                    return a11;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
                r0 = kotlin.collections.CollectionsKt___CollectionsKt.M0(r0, new com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$sectionsList$2.a());
             */
            @Override // g00.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<? extends com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType> invoke() {
                /*
                    r4 = this;
                    com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r0 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.this
                    com.forsale.app.datalayer.database.CategoryEntity r0 = r0.Q()
                    java.util.List r0 = r0.getSections()
                    if (r0 == 0) goto L4a
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$sectionsList$2$a r1 = new com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$sectionsList$2$a
                    r1.<init>()
                    java.util.List r0 = kotlin.collections.p.M0(r0, r1)
                    if (r0 == 0) goto L4a
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L24:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L40
                    java.lang.Object r2 = r0.next()
                    com.forsale.app.datalayer.database.CategoryEntity$Sections r2 = (com.forsale.app.datalayer.database.CategoryEntity.Sections) r2
                    com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType$a r3 = com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType.Companion
                    java.lang.String r2 = r2.getName()
                    com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType r2 = r3.a(r2)
                    if (r2 == 0) goto L24
                    r1.add(r2)
                    goto L24
                L40:
                    boolean r0 = r1.isEmpty()
                    if (r0 != 0) goto L47
                    goto L48
                L47:
                    r1 = 0
                L48:
                    if (r1 != 0) goto L4e
                L4a:
                    java.util.List r1 = com.forsale.app.features.categories.home.allverticals.h.a()
                L4e:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$sectionsList$2.invoke():java.util.List");
            }
        });
        this.H = a11;
        f.a aVar = com.forsale.app.features.categories.home.allverticals.f.f23805c;
        this.I = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.CATEGORY));
        this.J = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.BUSINESS_COMMERCIAL_ADS));
        this.K = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.BROWS_AND_EXPLORE));
        this.L = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.GAM));
        this.M = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.NEW_ARRIVALS));
        this.N = StateFlowKt.MutableStateFlow(aVar.a(AllVerticalsSectionType.FEATURED_ADS));
        List<AllVerticalsSectionType> N = N();
        y11 = s.y(N, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (AllVerticalsSectionType allVerticalsSectionType : N) {
            switch (f.f23430a[allVerticalsSectionType.ordinal()]) {
                case 1:
                    stateFlow = this.I;
                    break;
                case 2:
                    stateFlow = this.f23394z.d();
                    break;
                case 3:
                    stateFlow = this.J;
                    break;
                case 4:
                    stateFlow = this.f23393y.h();
                    break;
                case 5:
                    stateFlow = this.K;
                    break;
                case 6:
                    stateFlow = this.L;
                    break;
                case 7:
                    stateFlow = this.M;
                    break;
                case 8:
                    stateFlow = this.N;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(stateFlow);
        }
        this.O = arrayList;
        MutableSharedFlow<com.forsale.app.features.categories.home.allverticals.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.P = MutableSharedFlow$default;
        this.Q = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.R = MutableStateFlow;
        this.S = FlowKt.asStateFlow(MutableStateFlow);
        X0 = CollectionsKt___CollectionsKt.X0(arrayList);
        final Flow[] flowArr = (Flow[]) X0.toArray(new Flow[0]);
        this.T = new Flow<i>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$special$$inlined$combine$1

            /* compiled from: Zip.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$special$$inlined$combine$1$3", f = "AllVerticalsViewModel.kt", l = {292}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$special$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass3 extends SuspendLambda implements q<FlowCollector<? super i>, f[], zz.a<? super wz.p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f23398a;

                /* renamed from: b  reason: collision with root package name */
                private /* synthetic */ Object f23399b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f23400c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ AllVerticalsViewModel f23401d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(zz.a aVar, AllVerticalsViewModel allVerticalsViewModel) {
                    super(3, aVar);
                    this.f23401d = allVerticalsViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    boolean z11;
                    boolean z12;
                    i cVar;
                    boolean z13;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f23398a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            kotlin.f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.f.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f23399b;
                        f[] fVarArr = (f[]) ((Object[]) this.f23400c);
                        int length = fVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (o.d(fVarArr[i12].d(), g.c.f23810a)) {
                                    z11 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            cVar = i.b.f23813a;
                        } else {
                            int length2 = fVarArr.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 < length2) {
                                    if (!(fVarArr[i13].d() instanceof g.b)) {
                                        z12 = false;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    z12 = true;
                                    break;
                                }
                            }
                            if (z12) {
                                ArrayList arrayList = new ArrayList(fVarArr.length);
                                for (f fVar : fVarArr) {
                                    g d11 = fVar.d();
                                    o.g(d11, "null cannot be cast to non-null type com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionState.Error");
                                    arrayList.add("\n " + ((g.b) d11).a().getMessage());
                                }
                                cVar = new i.a(new Throwable("combined error of all errors in all sections " + arrayList));
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                for (f fVar2 : fVarArr) {
                                    if ((fVar2.d() instanceof g.a) && !this.f23401d.S(((g.a) fVar2.d()).a())) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        arrayList2.add(fVar2);
                                    }
                                }
                                cVar = new i.c(arrayList2);
                            }
                        }
                        this.f23398a = 1;
                        if (flowCollector.emit(cVar, this) == f11) {
                            return f11;
                        }
                    }
                    return wz.p.f75480a;
                }

                @Override // g00.q
                public final Object invoke(FlowCollector<? super i> flowCollector, f[] fVarArr, zz.a<? super wz.p> aVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(aVar, this.f23401d);
                    anonymousClass3.f23399b = flowCollector;
                    anonymousClass3.f23400c = fVarArr;
                    return anonymousClass3.invokeSuspend(wz.p.f75480a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super i> flowCollector, zz.a aVar2) {
                Object f11;
                final Flow[] flowArr2 = flowArr;
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new g00.a<f[]>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    /* renamed from: b */
                    public final f[] invoke() {
                        return new f[flowArr2.length];
                    }
                }, new AnonymousClass3(null, this), aVar2);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (combineInternal == f11) {
                    return combineInternal;
                }
                return wz.p.f75480a;
            }
        };
        if (this.C.isVertical()) {
            V();
        } else {
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.E;
            if (categoryListingsAnalyticSource != null) {
                str = categoryListingsAnalyticSource.b();
            } else {
                str = null;
            }
            Y(str);
        }
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBasicData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBasicData$1 r0 = (com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBasicData$1) r0
            int r1 = r0.f23434d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23434d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBasicData$1 r0 = new com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBasicData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f23432b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23434d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f23431a
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r0 = (com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel) r0
            kotlin.f.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor r5 = r4.f23384c
            r0.f23431a = r4
            r0.f23434d = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            xa.b r5 = (xa.b) r5
            androidx.lifecycle.b0<com.forsale.app.datalayer.database.RegionEntity> r1 = r0.F
            com.forsale.app.datalayer.database.RegionEntity r2 = r5.b()
            r1.postValue(r2)
            androidx.lifecycle.b0<com.forsale.app.datalayer.database.MasterDataMiscModel> r0 = r0.G
            com.forsale.app.datalayer.database.MasterDataMiscModel r5 = r5.a()
            r0.postValue(r5)
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.A(zz.a):java.lang.Object");
    }

    private final Object B(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.K, new AllVerticalsViewModel$fetchBrowseAndExplore$2(null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    private final Object C(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.J, new AllVerticalsViewModel$fetchBusinessCommercialAds$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    private final Object D(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.N, new AllVerticalsViewModel$fetchFeatured$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    private final Object E(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.L, new AllVerticalsViewModel$fetchGAM$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(zz.a<? super wz.p> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchInterstitial$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchInterstitial$1 r0 = (com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchInterstitial$1) r0
            int r1 = r0.f23446d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23446d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchInterstitial$1 r0 = new com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchInterstitial$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f23444b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23446d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f23443a
            com.google.android.gms.ads.admanager.AdManagerAdRequest r0 = (com.google.android.gms.ads.admanager.AdManagerAdRequest) r0
            kotlin.f.b(r7)
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f23443a
            com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r2 = (com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel) r2
            kotlin.f.b(r7)
            goto L53
        L40:
            kotlin.f.b(r7)
            ca.d r7 = r6.f23383b
            com.forsale.app.datalayer.database.CategoryEntity r2 = r6.C
            r0.f23443a = r6
            r0.f23446d = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            com.google.android.gms.ads.admanager.AdManagerAdRequest r7 = (com.google.android.gms.ads.admanager.AdManagerAdRequest) r7
            if (r7 == 0) goto L6f
            kotlinx.coroutines.flow.MutableSharedFlow<com.forsale.app.features.categories.home.allverticals.a> r4 = r2.P
            com.forsale.app.features.categories.home.allverticals.a$b r5 = new com.forsale.app.features.categories.home.allverticals.a$b
            com.forsale.app.datalayer.database.CategoryEntity r2 = r2.C
            int r2 = r2.getId()
            r5.<init>(r2, r7)
            r0.f23443a = r7
            r0.f23446d = r3
            java.lang.Object r7 = r4.emit(r5, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.F(zz.a):java.lang.Object");
    }

    private final Object G(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.M, new AllVerticalsViewModel$fetchNewArrivals$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    private final Object H(zz.a<? super wz.p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.I, new AllVerticalsViewModel$fetchNotBusinessCategories$2(this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return wz.p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(zz.a<? super wz.p> r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.I(zz.a):java.lang.Object");
    }

    private final List<AllVerticalsSectionType> N() {
        return (List) this.H.getValue();
    }

    private final void V() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AllVerticalsViewModel$logHomeScreenVisited$1(this, null), 3, null);
    }

    private final void Y(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AllVerticalsViewModel$recordCategoryVisited$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ListingItemBrief> Z(ListingsResponse.Listings listings, int i11) {
        return fk.a.f56248a.a(i11, listings.getPinnedShuffleItems(), listings.getPinnedItems());
    }

    public final Flow<i> J() {
        return this.T;
    }

    public final CategoryListingsAnalyticSource K() {
        return this.E;
    }

    public final StateFlow<Boolean> L() {
        return this.S;
    }

    public final SharedFlow<com.forsale.app.features.categories.home.allverticals.a> M() {
        return this.Q;
    }

    public final HomeVisitedSources O() {
        return this.D;
    }

    public final CategoryEntity Q() {
        return this.C;
    }

    public final <T> boolean S(T t11) {
        if (t11 instanceof Collection) {
            return ((Collection) t11).isEmpty();
        }
        if (t11 instanceof e) {
            return t11 instanceof e.a;
        }
        if (t11 == null) {
            return true;
        }
        return false;
    }

    public final void T() {
        this.f23386e.c();
        this.f23386e.b();
    }

    public final void X(AdsModel item, com.forsale.adserver.view.screens.detailsScreen.a commercialDetailsAnalyticPayload) {
        o.i(item, "item");
        o.i(commercialDetailsAnalyticPayload, "commercialDetailsAnalyticPayload");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AllVerticalsViewModel$navigateToCommercialDetails$1(this, item, commercialDetailsAnalyticPayload, null), 3, null);
    }

    public final void a0(List<String> sections, String maxVisitedSection, int i11) {
        o.i(sections, "sections");
        o.i(maxVisitedSection, "maxVisitedSection");
        this.f23386e.f(new LogVerticalPageScrolledInteractor.a(this.C.getSystemName(), maxVisitedSection, i11, sections.size(), null, sections));
    }

    public final void b0(String sectionName, int i11, int i12) {
        o.i(sectionName, "sectionName");
        this.f23386e.g(new LogVerticalPageSwipedInteractor.a(this.C.getSystemName(), i11, sectionName, i12));
    }

    public final void y(CategoryEntity category, String sectionName) {
        o.i(category, "category");
        o.i(sectionName, "sectionName");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AllVerticalsViewModel$decideNextDestination$1(category, this, sectionName, null), 3, null);
    }

    public final void z(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AllVerticalsViewModel$enablePagerScrollingState$1(this, z11, null), 3, null);
    }
}
