package com.forsale.app.features.categories.listings.items.forProperty;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.CardDisplayTypes;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.items.DefaultListingItemViewModel;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
/* compiled from: ForPropertyListingItemViewModel.kt */
/* loaded from: classes2.dex */
public final class ForPropertyListingItemViewModel extends DefaultListingItemViewModel {
    public static final a X = new a(null);
    public static final int Y = 8;
    private final boolean U;
    private final ListingDetailsSearchAnalyticsData V;
    private final boolean W;

    /* compiled from: ForPropertyListingItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ForPropertyListingItemViewModel> a(int i11) {
            List<ForPropertyListingItemViewModel> q11;
            q11 = r.q(new ForPropertyListingItemViewModel[i11]);
            return q11;
        }
    }

    /* compiled from: ForPropertyListingItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30714a;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.FOR_SALE_REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30714a = iArr;
        }
    }

    public /* synthetic */ ForPropertyListingItemViewModel(ListingItemBrief listingItemBrief, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData liveData, LiveData liveData2, ApplicationResourcesRepository applicationResourcesRepository, p pVar, int i11, String str, g00.r rVar, boolean z11, boolean z12, CardDisplayTypes cardDisplayTypes, List list, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, CoroutineScope coroutineScope, List list2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingItemBrief, listingsSettings, liveData, liveData2, applicationResourcesRepository, pVar, i11, (i12 & 128) != 0 ? null : str, (i12 & 256) != 0 ? new g00.r<ListingItemBrief, Integer, Integer, ListingDetailsSearchAnalyticsData, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel.1
            public final void b(ListingItemBrief listingItemBrief2, int i13, int i14, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData2) {
                o.i(listingItemBrief2, "<anonymous parameter 0>");
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief2, Integer num, Integer num2, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData2) {
                b(listingItemBrief2, num.intValue(), num2.intValue(), listingDetailsSearchAnalyticsData2);
                return wz.p.f75480a;
            }
        } : rVar, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? true : z11, (i12 & 1024) != 0 ? true : z12, cardDisplayTypes, (i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list, (i12 & 8192) != 0 ? null : listingDetailsSearchAnalyticsData, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : coroutineScope, list2);
    }

    private final List<Pair<String, String>> X() {
        ArrayList arrayList = new ArrayList();
        List<ListingItemBrief.AttrInfo> attrsInfo = m().getAttrsInfo();
        if (attrsInfo != null) {
            for (ListingItemBrief.AttrInfo attrInfo : attrsInfo) {
                arrayList.add(new Pair(attrInfo.getIconUrl(), String.valueOf(attrInfo.getAttributeDisplayText())));
            }
        }
        return arrayList;
    }

    private final List<String> Y() {
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

    private final Integer Z() {
        int i11;
        UserType userType = m().getUserType();
        if (userType == null) {
            i11 = -1;
        } else {
            i11 = b.f30714a[userType.ordinal()];
        }
        if (i11 == 1) {
            return Integer.valueOf(gk.a.f56932a);
        }
        return null;
    }

    public final List<Pair<String, String>> T() {
        return X();
    }

    public final List<String> U() {
        return Y();
    }

    public final Integer V() {
        return Z();
    }

    public final boolean W() {
        return this.U;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForPropertyListingItemViewModel(ListingItemBrief item, ListingsResponse.UISettings.ListingsSettings listingsSettings, LiveData<RegionEntity> region, LiveData<MasterDataMiscModel> misc, ApplicationResourcesRepository resourcesRepository, p<? super ListingItemBrief, ? super List<? extends Object>, wz.p> analyticLambda, int i11, String str, g00.r<? super ListingItemBrief, ? super Integer, ? super Integer, ? super ListingDetailsSearchAnalyticsData, wz.p> onItemClicked, boolean z11, boolean z12, CardDisplayTypes cardDisplayTypes, List<String> list, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, CoroutineScope coroutineScope, List<Integer> swipingIds) {
        super(item, listingsSettings, region, misc, resourcesRepository, analyticLambda, i11, str, false, onItemClicked, z11, cardDisplayTypes, null, list, null, -1, null, coroutineScope, swipingIds, 86272, null);
        o.i(item, "item");
        o.i(listingsSettings, "listingsSettings");
        o.i(region, "region");
        o.i(misc, "misc");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(analyticLambda, "analyticLambda");
        o.i(onItemClicked, "onItemClicked");
        o.i(cardDisplayTypes, "cardDisplayTypes");
        o.i(swipingIds, "swipingIds");
        this.U = z12;
        this.V = listingDetailsSearchAnalyticsData;
        String districtName = item.getDistrictName();
        this.W = !(districtName == null || districtName.length() == 0);
    }
}
