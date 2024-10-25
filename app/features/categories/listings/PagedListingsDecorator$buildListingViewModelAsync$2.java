package com.forsale.app.features.categories.listings;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.PropertyItemSettings;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenAttributes.AttributesListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import t9.r0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagedListingsDecorator.kt */
@d(c = "com.forsale.app.features.categories.listings.PagedListingsDecorator$buildListingViewModelAsync$2", f = "PagedListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PagedListingsDecorator$buildListingViewModelAsync$2 extends SuspendLambda implements p<CoroutineScope, a<? super Deferred<? extends DefaultListingItemViewModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28015a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f28016b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PagedListingsDecorator f28017c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemBrief f28018d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingsResponse.UISettings.ListingsSettings f28019e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ListingDecoratorTypes f28020f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f28021g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ PropertyItemSettings f28022h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f28023i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagedListingsDecorator.kt */
    @d(c = "com.forsale.app.features.categories.listings.PagedListingsDecorator$buildListingViewModelAsync$2$1", f = "PagedListingsDecorator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.PagedListingsDecorator$buildListingViewModelAsync$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super DefaultListingItemViewModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListingsResponse.UISettings.ListingsSettings f28025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingDecoratorTypes f28026c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PagedListingsDecorator f28027d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ListingItemBrief f28028e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f28029f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<Integer> f28030g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ PropertyItemSettings f28031h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f28032i;

        /* compiled from: PagedListingsDecorator.kt */
        /* renamed from: com.forsale.app.features.categories.listings.PagedListingsDecorator$buildListingViewModelAsync$2$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f28033a;

            static {
                int[] iArr = new int[ListingCardDisplayStyle.values().length];
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_FOR_PROPERTY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_ATTRIBUTES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ListingCardDisplayStyle.FULL_SCREEN_TITLE_DESCRIPTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f28033a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingsResponse.UISettings.ListingsSettings listingsSettings, ListingDecoratorTypes listingDecoratorTypes, PagedListingsDecorator pagedListingsDecorator, ListingItemBrief listingItemBrief, int i11, List<Integer> list, PropertyItemSettings propertyItemSettings, int i12, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28025b = listingsSettings;
            this.f28026c = listingDecoratorTypes;
            this.f28027d = pagedListingsDecorator;
            this.f28028e = listingItemBrief;
            this.f28029f = i11;
            this.f28030g = list;
            this.f28031h = propertyItemSettings;
            this.f28032i = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f28025b, this.f28026c, this.f28027d, this.f28028e, this.f28029f, this.f28030g, this.f28031h, this.f28032i, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveData liveData;
            LiveData liveData2;
            ApplicationResourcesRepository applicationResourcesRepository;
            DefaultListingItemViewModel bVar;
            LiveData liveData3;
            LiveData liveData4;
            ApplicationResourcesRepository applicationResourcesRepository2;
            LiveData liveData5;
            LiveData liveData6;
            ApplicationResourcesRepository applicationResourcesRepository3;
            ListingsTypes listingsTypes;
            boolean z11;
            LiveData liveData7;
            LiveData liveData8;
            ApplicationResourcesRepository applicationResourcesRepository4;
            ListingsTypes listingsTypes2;
            boolean z12;
            CategoryEntity categoryEntity;
            LiveData liveData9;
            LiveData liveData10;
            ApplicationResourcesRepository applicationResourcesRepository5;
            ListingsTypes listingsTypes3;
            boolean z13;
            CategoryEntity categoryEntity2;
            LiveData liveData11;
            LiveData liveData12;
            ApplicationResourcesRepository applicationResourcesRepository6;
            ListingsTypes listingsTypes4;
            boolean z14;
            CategoryEntity categoryEntity3;
            b.f();
            if (this.f28024a == 0) {
                f.b(obj);
                int i11 = a.f28033a[this.f28025b.getCardDisplay(this.f28026c).ordinal()];
                if (i11 == 1) {
                    liveData = this.f28027d.f28000a;
                    liveData2 = this.f28027d.f28001b;
                    applicationResourcesRepository = this.f28027d.f28003d;
                    bVar = new xc.b(this.f28028e, this.f28025b, liveData, liveData2, this.f28029f, applicationResourcesRepository, null, this.f28027d.j(), this.f28027d.k(), this.f28030g, 64, null);
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        liveData5 = this.f28027d.f28000a;
                        liveData6 = this.f28027d.f28001b;
                        applicationResourcesRepository3 = this.f28027d.f28003d;
                        p<ListingItemBrief, List<? extends Object>, wz.p> j11 = this.f28027d.j();
                        int i12 = r0.f69976l3;
                        listingsTypes = this.f28027d.f28006g;
                        if (listingsTypes != ListingsTypes.HOT_ZONES) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bVar = new ForPropertyListingItemViewModel(this.f28028e, this.f28025b, liveData5, liveData6, applicationResourcesRepository3, j11, i12, PagedListingsDecorator.n(this.f28027d, this.f28031h.isForSaleRealtyPinned(), null, false, 6, null), null, z11, this.f28031h.isProperty(), CardDisplayTypes.HORIZONTAL, null, null, this.f28027d.k(), this.f28030g, 12544, null);
                    } else {
                        CategoryEntity.Classification classification = null;
                        if (i11 == 4) {
                            liveData7 = this.f28027d.f28000a;
                            liveData8 = this.f28027d.f28001b;
                            applicationResourcesRepository4 = this.f28027d.f28003d;
                            p<ListingItemBrief, List<? extends Object>, wz.p> j12 = this.f28027d.j();
                            int i13 = r0.f69976l3;
                            listingsTypes2 = this.f28027d.f28006g;
                            if (listingsTypes2 != ListingsTypes.HOT_ZONES) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String n11 = PagedListingsDecorator.n(this.f28027d, this.f28031h.isForSaleRealtyPinned(), null, false, 6, null);
                            CardDisplayTypes cardDisplayTypes = CardDisplayTypes.HORIZONTAL;
                            categoryEntity = this.f28027d.f28007h;
                            if (categoryEntity != null) {
                                classification = categoryEntity.getClassification();
                            }
                            bVar = new AttributesListingItemViewModel(this.f28028e, this.f28025b, liveData7, liveData8, applicationResourcesRepository4, j12, i13, this.f28029f, n11, null, z12, classification, cardDisplayTypes, this.f28025b.getVerticalStyle(), null, null, null, SortingStates.DEFAULT, this.f28030g, 115200, null);
                        } else if (i11 != 5) {
                            liveData11 = this.f28027d.f28000a;
                            liveData12 = this.f28027d.f28001b;
                            applicationResourcesRepository6 = this.f28027d.f28003d;
                            p<ListingItemBrief, List<? extends Object>, wz.p> j13 = this.f28027d.j();
                            int i14 = r0.f69976l3;
                            listingsTypes4 = this.f28027d.f28006g;
                            if (listingsTypes4 != ListingsTypes.HOT_ZONES) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String n12 = PagedListingsDecorator.n(this.f28027d, this.f28031h.isForSaleRealtyPinned(), null, false, 6, null);
                            CardDisplayTypes cardDisplayTypes2 = CardDisplayTypes.HORIZONTAL;
                            categoryEntity3 = this.f28027d.f28007h;
                            if (categoryEntity3 != null) {
                                classification = categoryEntity3.getClassification();
                            }
                            bVar = new AttributesListingItemViewModel(this.f28028e, this.f28025b, liveData11, liveData12, applicationResourcesRepository6, j13, i14, this.f28029f, n12, null, z14, classification, cardDisplayTypes2, this.f28025b.getVerticalStyle(), null, null, null, SortingStates.DEFAULT, this.f28030g, 115200, null);
                        } else {
                            liveData9 = this.f28027d.f28000a;
                            liveData10 = this.f28027d.f28001b;
                            applicationResourcesRepository5 = this.f28027d.f28003d;
                            p<ListingItemBrief, List<? extends Object>, wz.p> j14 = this.f28027d.j();
                            int i15 = r0.f69976l3;
                            listingsTypes3 = this.f28027d.f28006g;
                            if (listingsTypes3 != ListingsTypes.HOT_ZONES) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            String n13 = PagedListingsDecorator.n(this.f28027d, this.f28031h.isForSaleRealtyPinned(), null, false, 6, null);
                            CardDisplayTypes cardDisplayTypes3 = CardDisplayTypes.HORIZONTAL;
                            categoryEntity2 = this.f28027d.f28007h;
                            if (categoryEntity2 != null) {
                                classification = categoryEntity2.getClassification();
                            }
                            bVar = new DescriptionListingItemViewModel(this.f28028e, this.f28025b, liveData9, liveData10, applicationResourcesRepository5, j14, i15, this.f28029f, n13, null, z13, classification, cardDisplayTypes3, null, null, this.f28025b.getVerticalStyle(), null, SortingStates.DEFAULT, this.f28030g, 90624, null);
                        }
                    }
                } else {
                    ListingItemBrief listingItemBrief = this.f28028e;
                    ListingsResponse.UISettings.ListingsSettings listingsSettings = this.f28025b;
                    liveData3 = this.f28027d.f28000a;
                    liveData4 = this.f28027d.f28001b;
                    applicationResourcesRepository2 = this.f28027d.f28003d;
                    bVar = new yc.b(listingItemBrief, listingsSettings, liveData3, liveData4, null, applicationResourcesRepository2, this.f28027d.j(), null, this.f28029f, null, null, null, this.f28027d.k(), this.f28030g, 3728, null);
                }
                bVar.S(kotlin.coroutines.jvm.internal.a.d(this.f28032i));
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
    public PagedListingsDecorator$buildListingViewModelAsync$2(PagedListingsDecorator pagedListingsDecorator, ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, ListingDecoratorTypes listingDecoratorTypes, int i11, PropertyItemSettings propertyItemSettings, int i12, a<? super PagedListingsDecorator$buildListingViewModelAsync$2> aVar) {
        super(2, aVar);
        this.f28017c = pagedListingsDecorator;
        this.f28018d = listingItemBrief;
        this.f28019e = listingsSettings;
        this.f28020f = listingDecoratorTypes;
        this.f28021g = i11;
        this.f28022h = propertyItemSettings;
        this.f28023i = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        PagedListingsDecorator$buildListingViewModelAsync$2 pagedListingsDecorator$buildListingViewModelAsync$2 = new PagedListingsDecorator$buildListingViewModelAsync$2(this.f28017c, this.f28018d, this.f28019e, this.f28020f, this.f28021g, this.f28022h, this.f28023i, aVar);
        pagedListingsDecorator$buildListingViewModelAsync$2.f28016b = obj;
        return pagedListingsDecorator$buildListingViewModelAsync$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        b.f();
        if (this.f28015a == 0) {
            f.b(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f28016b, null, null, new AnonymousClass1(this.f28019e, this.f28020f, this.f28017c, this.f28018d, this.f28021g, nc.a.b(this.f28017c.l(), this.f28017c.i().getValue(), this.f28018d.getId(), 0, false, 12, null), this.f28022h, this.f28023i, null), 3, null);
            return async$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super Deferred<? extends DefaultListingItemViewModel>> aVar) {
        return ((PagedListingsDecorator$buildListingViewModelAsync$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
