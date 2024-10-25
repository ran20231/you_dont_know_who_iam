package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.IncrementViewCounterResponse;
import com.forsale.app.datalayer.network.requestsbodies.AutoCompleteSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.requestsbodies.GetOtherUserListingsBody;
import com.forsale.app.datalayer.network.requestsbodies.IncrementViewCounterBody;
import com.forsale.app.datalayer.network.requestsbodies.RecommendedSectionsBody;
import com.forsale.app.datalayer.network.responses.HomeSectionsResponse;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse;
import i10.a;
import i10.o;
import java.util.List;
import wz.p;
/* compiled from: ListingsService.kt */
/* loaded from: classes2.dex */
public interface ListingsService {
    @o("Listings/autocompleteSearch")
    Object getAutoCompleteSearch(@a AutoCompleteSearchBody autoCompleteSearchBody, zz.a<? super List<AutoCompleteSearchResponse>> aVar);

    @o("Listings/homeSectionsRecommender")
    Object getHomeSections(@a p pVar, zz.a<? super HomeSectionsResponse> aVar);

    @o("Listings/getLatestListings")
    Object getLatestListings(@a GetListingsBody getListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("Listings/getListingDetails")
    Object getListingDetails(@a GetListingDetailsBody getListingDetailsBody, zz.a<? super ListingItemDetails> aVar);

    @o("Listings/getListings")
    Object getListings(@a GetListingsBody getListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("Listings/getOtherUserListings")
    Object getOtherUserListings(@a GetOtherUserListingsBody getOtherUserListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("Listings/getUserListings")
    Object getUserListings(@a GetOtherUserListingsBody getOtherUserListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("Listings/incrementViewCounter")
    Object incrementViewCounter(@a IncrementViewCounterBody incrementViewCounterBody, zz.a<? super IncrementViewCounterResponse> aVar);

    @o("Listings/recommendedSections")
    Object recommendedSections(@a RecommendedSectionsBody recommendedSectionsBody, zz.a<? super RecommendedSectionsResponse> aVar);
}
