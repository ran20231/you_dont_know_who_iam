package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingCardDisplayStyle;
import com.forsale.app.features.categories.listings.ListingDecoratorTypes;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.ListingsVerticalStyles;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenAttributes.AttributesListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingItemViewModel;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2", f = "CategoryListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$buildListingViewModelAsync$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Deferred<? extends DefaultListingItemViewModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28126a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f28127b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28128c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemBrief f28129d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingsResponse.UISettings.ListingsSettings f28130e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ PropertyItemSettings f28131f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f28132g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<String> f28133h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f28134i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsDecorator.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2$1", f = "CategoryListingsDecorator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super DefaultListingItemViewModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListingsResponse.UISettings.ListingsSettings f28136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsDecorator f28137c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PropertyItemSettings f28138d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f28139e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ListingItemBrief f28140f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<String> f28141g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<Integer> f28142h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f28143i;

        /* compiled from: CategoryListingsDecorator.kt */
        /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$buildListingViewModelAsync$2$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f28144a;

            static {
                int[] iArr = new int[ListingCardDisplayStyle.values().length];
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_ATTRIBUTES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_DESCRIPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f28144a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingsResponse.UISettings.ListingsSettings listingsSettings, CategoryListingsDecorator categoryListingsDecorator, PropertyItemSettings propertyItemSettings, int i11, ListingItemBrief listingItemBrief, List<String> list, List<Integer> list2, int i12, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28136b = listingsSettings;
            this.f28137c = categoryListingsDecorator;
            this.f28138d = propertyItemSettings;
            this.f28139e = i11;
            this.f28140f = listingItemBrief;
            this.f28141g = list;
            this.f28142h = list2;
            this.f28143i = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f28136b, this.f28137c, this.f28138d, this.f28139e, this.f28140f, this.f28141g, this.f28142h, this.f28143i, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveData liveData;
            LiveData liveData2;
            ApplicationResourcesRepository applicationResourcesRepository;
            p j11;
            int J0;
            DefaultListingItemViewModel bVar;
            LiveData liveData3;
            LiveData liveData4;
            ApplicationResourcesRepository applicationResourcesRepository2;
            p j12;
            ListingsTypes listingsTypes;
            boolean z11;
            SearchAnalyticsData.SearchSource searchSource;
            CategoryEntity categoryEntity;
            int J02;
            SortingStates G0;
            LiveData liveData5;
            LiveData liveData6;
            ApplicationResourcesRepository applicationResourcesRepository3;
            p j13;
            ListingsTypes listingsTypes2;
            boolean z12;
            SearchAnalyticsData.SearchSource searchSource2;
            CategoryEntity categoryEntity2;
            int J03;
            SortingStates G02;
            LiveData liveData7;
            LiveData liveData8;
            ApplicationResourcesRepository applicationResourcesRepository4;
            p j14;
            ListingsTypes listingsTypes3;
            boolean z13;
            SearchAnalyticsData.SearchSource searchSource3;
            CategoryEntity categoryEntity3;
            int J04;
            SortingStates G03;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28135a == 0) {
                kotlin.f.b(obj);
                int i11 = a.f28144a[this.f28136b.getCardDisplay(ListingDecoratorTypes.CATEGORY_LISTINGS).ordinal()];
                boolean z14 = false;
                SearchAnalyticsData.SearchSource searchSource4 = null;
                CategoryEntity.Classification classification = null;
                CategoryEntity.Classification classification2 = null;
                CategoryEntity.Classification classification3 = null;
                if (i11 == 1) {
                    liveData = this.f28137c.f28107s;
                    liveData2 = this.f28137c.f28108t;
                    CategoryListingsDecorator categoryListingsDecorator = this.f28137c;
                    boolean isForSaleRealtyPinned = this.f28138d.isForSaleRealtyPinned();
                    ListingsIntention C0 = this.f28137c.C0();
                    SearchAnalyticsData E0 = this.f28137c.E0();
                    if (E0 != null) {
                        searchSource4 = E0.e();
                    }
                    if (searchSource4 == SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES) {
                        z14 = true;
                    }
                    String m11 = categoryListingsDecorator.m(isForSaleRealtyPinned, C0, z14);
                    applicationResourcesRepository = this.f28137c.f28110v;
                    j11 = this.f28137c.j();
                    ListingsVerticalStyles verticalStyle = this.f28136b.getVerticalStyle();
                    ListingsAnalytics$FiltersPlace z02 = this.f28137c.z0();
                    ListingDetailsSearchAnalyticsData D0 = this.f28137c.D0();
                    J0 = this.f28137c.J0(this.f28139e);
                    bVar = new yc.b(this.f28140f, this.f28136b, liveData, liveData2, m11, applicationResourcesRepository, j11, verticalStyle, J0, this.f28141g, D0, z02, null, this.f28142h, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, null);
                } else if (i11 == 2) {
                    liveData3 = this.f28137c.f28107s;
                    liveData4 = this.f28137c.f28108t;
                    applicationResourcesRepository2 = this.f28137c.f28110v;
                    j12 = this.f28137c.j();
                    int i12 = r0.f69976l3;
                    listingsTypes = this.f28137c.X;
                    if (listingsTypes != ListingsTypes.HOT_ZONES) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    CategoryListingsDecorator categoryListingsDecorator2 = this.f28137c;
                    boolean isForSaleRealtyPinned2 = this.f28138d.isForSaleRealtyPinned();
                    ListingsIntention C02 = this.f28137c.C0();
                    SearchAnalyticsData E02 = this.f28137c.E0();
                    if (E02 != null) {
                        searchSource = E02.e();
                    } else {
                        searchSource = null;
                    }
                    if (searchSource == SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES) {
                        z14 = true;
                    }
                    String m12 = categoryListingsDecorator2.m(isForSaleRealtyPinned2, C02, z14);
                    CardDisplayTypes cardDisplayTypes = CardDisplayTypes.HORIZONTAL;
                    categoryEntity = this.f28137c.f28103o;
                    if (categoryEntity != null) {
                        classification3 = categoryEntity.getClassification();
                    }
                    ListingsVerticalStyles verticalStyle2 = this.f28136b.getVerticalStyle();
                    ListingsAnalytics$FiltersPlace z03 = this.f28137c.z0();
                    ListingDetailsSearchAnalyticsData D02 = this.f28137c.D0();
                    J02 = this.f28137c.J0(this.f28139e);
                    G0 = this.f28137c.G0();
                    bVar = new AttributesListingItemViewModel(this.f28140f, this.f28136b, liveData3, liveData4, applicationResourcesRepository2, j12, i12, J02, m12, null, z11, classification3, cardDisplayTypes, verticalStyle2, this.f28141g, z03, D02, G0, this.f28142h, AdRequest.MAX_CONTENT_URL_LENGTH, null);
                } else if (i11 != 3) {
                    liveData7 = this.f28137c.f28107s;
                    liveData8 = this.f28137c.f28108t;
                    applicationResourcesRepository4 = this.f28137c.f28110v;
                    j14 = this.f28137c.j();
                    int i13 = r0.f69976l3;
                    listingsTypes3 = this.f28137c.X;
                    if (listingsTypes3 != ListingsTypes.HOT_ZONES) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    CategoryListingsDecorator categoryListingsDecorator3 = this.f28137c;
                    boolean isForSaleRealtyPinned3 = this.f28138d.isForSaleRealtyPinned();
                    ListingsIntention C03 = this.f28137c.C0();
                    SearchAnalyticsData E03 = this.f28137c.E0();
                    if (E03 != null) {
                        searchSource3 = E03.e();
                    } else {
                        searchSource3 = null;
                    }
                    if (searchSource3 == SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES) {
                        z14 = true;
                    }
                    String m13 = categoryListingsDecorator3.m(isForSaleRealtyPinned3, C03, z14);
                    CardDisplayTypes cardDisplayTypes2 = CardDisplayTypes.HORIZONTAL;
                    categoryEntity3 = this.f28137c.f28103o;
                    if (categoryEntity3 != null) {
                        classification = categoryEntity3.getClassification();
                    }
                    ListingsVerticalStyles verticalStyle3 = this.f28136b.getVerticalStyle();
                    ListingsAnalytics$FiltersPlace z04 = this.f28137c.z0();
                    ListingDetailsSearchAnalyticsData D03 = this.f28137c.D0();
                    J04 = this.f28137c.J0(this.f28139e);
                    G03 = this.f28137c.G0();
                    bVar = new GeneralListingItemViewModel(this.f28140f, this.f28136b, liveData7, liveData8, applicationResourcesRepository4, j14, i13, J04, m13, null, z13, classification, cardDisplayTypes2, this.f28141g, z04, verticalStyle3, D03, G03, this.f28142h, AdRequest.MAX_CONTENT_URL_LENGTH, null);
                } else {
                    liveData5 = this.f28137c.f28107s;
                    liveData6 = this.f28137c.f28108t;
                    applicationResourcesRepository3 = this.f28137c.f28110v;
                    j13 = this.f28137c.j();
                    int i14 = r0.f69976l3;
                    listingsTypes2 = this.f28137c.X;
                    if (listingsTypes2 != ListingsTypes.HOT_ZONES) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    CategoryListingsDecorator categoryListingsDecorator4 = this.f28137c;
                    boolean isForSaleRealtyPinned4 = this.f28138d.isForSaleRealtyPinned();
                    ListingsIntention C04 = this.f28137c.C0();
                    SearchAnalyticsData E04 = this.f28137c.E0();
                    if (E04 != null) {
                        searchSource2 = E04.e();
                    } else {
                        searchSource2 = null;
                    }
                    if (searchSource2 == SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES) {
                        z14 = true;
                    }
                    String m14 = categoryListingsDecorator4.m(isForSaleRealtyPinned4, C04, z14);
                    CardDisplayTypes cardDisplayTypes3 = CardDisplayTypes.HORIZONTAL;
                    categoryEntity2 = this.f28137c.f28103o;
                    if (categoryEntity2 != null) {
                        classification2 = categoryEntity2.getClassification();
                    }
                    ListingsVerticalStyles verticalStyle4 = this.f28136b.getVerticalStyle();
                    ListingsAnalytics$FiltersPlace z05 = this.f28137c.z0();
                    ListingDetailsSearchAnalyticsData D04 = this.f28137c.D0();
                    J03 = this.f28137c.J0(this.f28139e);
                    G02 = this.f28137c.G0();
                    bVar = new DescriptionListingItemViewModel(this.f28140f, this.f28136b, liveData5, liveData6, applicationResourcesRepository3, j13, i14, J03, m14, null, z12, classification2, cardDisplayTypes3, this.f28141g, z05, verticalStyle4, D04, G02, this.f28142h, AdRequest.MAX_CONTENT_URL_LENGTH, null);
                }
                bVar.S(kotlin.coroutines.jvm.internal.a.d(this.f28143i));
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super DefaultListingItemViewModel> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$buildListingViewModelAsync$2(CategoryListingsDecorator categoryListingsDecorator, ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, PropertyItemSettings propertyItemSettings, int i11, List<String> list, int i12, zz.a<? super CategoryListingsDecorator$buildListingViewModelAsync$2> aVar) {
        super(2, aVar);
        this.f28128c = categoryListingsDecorator;
        this.f28129d = listingItemBrief;
        this.f28130e = listingsSettings;
        this.f28131f = propertyItemSettings;
        this.f28132g = i11;
        this.f28133h = list;
        this.f28134i = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        CategoryListingsDecorator$buildListingViewModelAsync$2 categoryListingsDecorator$buildListingViewModelAsync$2 = new CategoryListingsDecorator$buildListingViewModelAsync$2(this.f28128c, this.f28129d, this.f28130e, this.f28131f, this.f28132g, this.f28133h, this.f28134i, aVar);
        categoryListingsDecorator$buildListingViewModelAsync$2.f28127b = obj;
        return categoryListingsDecorator$buildListingViewModelAsync$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow i11;
        Deferred async$default;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28126a == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f28127b;
            nc.a l11 = this.f28128c.l();
            i11 = this.f28128c.i();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.f28130e, this.f28128c, this.f28131f, this.f28132g, this.f28129d, this.f28133h, nc.a.b(l11, (List) i11.getValue(), this.f28129d.getId(), 0, false, 12, null), this.f28134i, null), 3, null);
            return async$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Deferred<? extends DefaultListingItemViewModel>> aVar) {
        return ((CategoryListingsDecorator$buildListingViewModelAsync$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
