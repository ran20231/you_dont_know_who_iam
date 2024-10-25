package com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingCardDisplayStyle;
import com.forsale.app.features.categories.listings.ListingDecoratorTypes;
import com.forsale.app.features.categories.listings.ListingsVerticalStyles;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
/* compiled from: VerticalListingItemViewModel.kt */
/* loaded from: classes2.dex */
public final class VerticalListingItemViewModel extends DefaultListingItemViewModel {
    private final ListingCardDisplayStyle U;

    public /* synthetic */ VerticalListingItemViewModel(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData liveData, LiveData liveData2, ApplicationResourcesRepository applicationResourcesRepository, ListingsVerticalStyles listingsVerticalStyles, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingItemBrief, listingsSettings, liveData, liveData2, applicationResourcesRepository, (i11 & 32) != 0 ? null : listingsVerticalStyles, list);
    }

    private final List<String> V() {
        List<String> n11;
        List<ListingItemBrief.AttrInfo> attrsInfo = m().getAttrsInfo();
        if (attrsInfo == null) {
            n11 = r.n();
            return n11;
        }
        ArrayList arrayList = new ArrayList();
        for (ListingItemBrief.AttrInfo attrInfo : attrsInfo) {
            String attributeDisplayText = attrInfo.getAttributeDisplayText();
            if (attributeDisplayText != null) {
                arrayList.add(attributeDisplayText);
            }
        }
        return arrayList;
    }

    public final ListingCardDisplayStyle T() {
        return this.U;
    }

    public final List<String> U() {
        return V();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalListingItemViewModel(ListingItemBrief item, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ApplicationResourcesRepository resourcesRepository, ListingsVerticalStyles listingsVerticalStyles, List<Integer> swipingIds) {
        super(item, listingsSettings, region, misc, resourcesRepository, new p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel.1
            public final void b(ListingItemBrief listingItemBrief, List<? extends Object> list) {
                o.i(listingItemBrief, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief, List<? extends Object> list) {
                b(listingItemBrief, list);
                return wz.p.f75480a;
            }
        }, r0.f69846b3, null, false, new g00.r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel.2
            public final void b(ListingItemBrief listingItemBrief, int i11, int i12, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                o.i(listingItemBrief, "<anonymous parameter 0>");
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
                b(listingItemBrief, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData);
                return wz.p.f75480a;
            }
        }, true, CardDisplayTypes.STACKED, listingsVerticalStyles, null, null, 0, null, null, swipingIds, 254208, null);
        o.i(item, "item");
        o.i(listingsSettings, "listingsSettings");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(swipingIds, "swipingIds");
        this.U = listingsSettings.getCardDisplay(ListingDecoratorTypes.DEFAULT);
    }
}
