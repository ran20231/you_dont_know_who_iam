package com.forsale.app.features.categories.listingdetails.buyerscreen.otherads;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import g00.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: RecommendedListingsViewModel.kt */
/* loaded from: classes2.dex */
public final class RecommendedListingsViewModel extends DefaultListingItemViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedListingsViewModel(ListingItemBrief item, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ApplicationResourcesRepository resourcesRepository, List<Integer> swipingIds, r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super ListingDetailsSearchAnalyticsData, p> onItemClicked) {
        super(item, new ListingsResponse.UISettings.ListingsSettings(null, null, null, null, null, 0, 0, 127, null), region, misc, resourcesRepository, new g00.p<ListingItemBrief, List<? extends Object>, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel.2
            public final void b(ListingItemBrief brief, List<? extends Object> list) {
                o.i(brief, "brief");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(ListingItemBrief listingItemBrief, List<? extends Object> list) {
                b(listingItemBrief, list);
                return p.f75480a;
            }
        }, -1, null, false, onItemClicked, false, CardDisplayTypes.STACKED, null, null, null, -1, null, null, swipingIds, 217344, null);
        o.i(item, "item");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(swipingIds, "swipingIds");
        o.i(onItemClicked, "onItemClicked");
    }

    private final List<String> U() {
        List<String> n11;
        List<ListingItemBrief.AttrInfo> attrsInfo = m().getAttrsInfo();
        if (attrsInfo == null) {
            n11 = kotlin.collections.r.n();
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

    public final List<String> T() {
        return U();
    }
}
