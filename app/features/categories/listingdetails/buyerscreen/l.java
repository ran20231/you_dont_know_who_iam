package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.i0;
/* compiled from: BuyerListingDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26056a = new a(null);

    /* compiled from: BuyerListingDetailsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ z3.n c(a aVar, CategoryEntity categoryEntity, String str, String str2, ListingsIntention listingsIntention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                categoryEntity = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                listingsIntention = ListingsIntention.LISTINGS;
            }
            if ((i11 & 16) != 0) {
                advancedSearchBody = null;
            }
            if ((i11 & 32) != 0) {
                categoryListingsAnalyticSource = null;
            }
            if ((i11 & 64) != 0) {
                filtrationData = null;
            }
            if ((i11 & 128) != 0) {
                searchSource = SearchSource.NONE;
            }
            if ((i11 & 256) != 0) {
                searchAnalyticsData = null;
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                z11 = false;
            }
            return aVar.b(categoryEntity, str, str2, listingsIntention, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final z3.n a(MediaTypes mediaTypes, DetailsModel detailsModel, ItemArgs itemArgs, ShareText shareText) {
            return i0.f69248a.a(mediaTypes, detailsModel, itemArgs, shareText);
        }

        public final z3.n b(CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            kotlin.jvm.internal.o.i(intention, "intention");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            return i0.f69248a.d(categoryEntity, str, str2, intention, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final z3.n d(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, int i12, int i13, boolean z11, SearchSource searchSource, int i14, String str3, int i15, AnalyticListingsPayload analyticListingsPayload) {
            kotlin.jvm.internal.o.i(listingTypes, "listingTypes");
            kotlin.jvm.internal.o.i(listingSource, "listingSource");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            return i0.f69248a.e(listingTypes, str, i11, str2, iArr, advancedSearchBody, listingSource, i12, i13, z11, searchSource, i14, str3, i15, analyticListingsPayload);
        }
    }
}
