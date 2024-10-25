package com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsVerticalStyles;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import g00.r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
/* compiled from: GeneralListingItemViewModel.kt */
/* loaded from: classes2.dex */
public final class GeneralListingItemViewModel extends DefaultListingItemViewModel {
    private final CategoryEntity.Classification U;
    private final ListingsVerticalStyles V;
    private final ListingDetailsSearchAnalyticsData W;

    /* compiled from: GeneralListingItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30846a;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.FOR_SALE_REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30846a = iArr;
        }
    }

    public /* synthetic */ GeneralListingItemViewModel(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData liveData, LiveData liveData2, ApplicationResourcesRepository applicationResourcesRepository, p pVar, int i11, int i12, String str, r rVar, boolean z11, CategoryEntity.Classification classification, CardDisplayTypes cardDisplayTypes, List list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingsVerticalStyles listingsVerticalStyles, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, SortingStates sortingStates, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingItemBrief, listingsSettings, liveData, liveData2, applicationResourcesRepository, pVar, i11, i12, (i13 & 256) != 0 ? null : str, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.generalListingsItem.GeneralListingItemViewModel.1
            public final void b(ListingItemBrief listingItemBrief2, int i14, int i15, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData2) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief2, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData2) {
                b(listingItemBrief2, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData2);
                return wz.p.f75480a;
            }
        } : rVar, (i13 & 1024) != 0 ? true : z11, classification, cardDisplayTypes, (i13 & 8192) != 0 ? null : list, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : listingsAnalytics$FiltersPlace, (32768 & i13) != 0 ? null : listingsVerticalStyles, (i13 & 65536) != 0 ? null : listingDetailsSearchAnalyticsData, sortingStates, list2);
    }

    private final Integer X() {
        int i11;
        UserType userType = m().getUserType();
        if (userType == null) {
            i11 = -1;
        } else {
            i11 = a.f30846a[userType.ordinal()];
        }
        if (i11 == 1) {
            return Integer.valueOf(gk.a.f56932a);
        }
        return null;
    }

    public final String T() {
        boolean z11;
        String description = m().getDescription();
        if (description != null) {
            if (this.V == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return description;
            }
        }
        return null;
    }

    public final ListingDetailsSearchAnalyticsData U() {
        return this.W;
    }

    public final Integer V() {
        return X();
    }

    public final boolean W() {
        if (this.U == CategoryEntity.Classification.PROPERTY) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingItemViewModel(ListingItemBrief item, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ApplicationResourcesRepository resourcesRepository, p<? super ListingItemBrief, ? super List<? extends Object>, wz.p> analyticLambda, int i11, int i12, String str, r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super ListingDetailsSearchAnalyticsData, wz.p> onItemClicked, boolean z11, CategoryEntity.Classification classification, CardDisplayTypes cardDisplayTypes, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingsVerticalStyles listingsVerticalStyles, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, SortingStates sortingState, List<Integer> swipingIds) {
        super(item, listingsSettings, region, misc, resourcesRepository, analyticLambda, i11, str, false, onItemClicked, z11, cardDisplayTypes, listingsVerticalStyles, list, listingsAnalytics$FiltersPlace, i12, sortingState, null, swipingIds, 131328, null);
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
        this.U = classification;
        this.V = listingsVerticalStyles;
        this.W = listingDetailsSearchAnalyticsData;
    }
}
