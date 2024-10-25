package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.RepostListingEntity;
import com.forsale.app.datalayer.network.entities.SellListingEntity;
import com.forsale.app.datalayer.network.requestsbodies.AboutToExpireRequestBody;
import com.forsale.app.datalayer.network.requestsbodies.AboutToExpireViewedRequestBody;
import com.forsale.app.datalayer.network.requestsbodies.AdDurationBody;
import com.forsale.app.datalayer.network.requestsbodies.AddAdditionalContactsBody;
import com.forsale.app.datalayer.network.requestsbodies.CheckFreeAdsAllowanceRequestBody;
import com.forsale.app.datalayer.network.requestsbodies.GetAddonsRequestBody;
import com.forsale.app.datalayer.network.requestsbodies.GetMyListingsBody;
import com.forsale.app.datalayer.network.requestsbodies.GetRecentlyViewedBody;
import com.forsale.app.datalayer.network.requestsbodies.RepostListingBody;
import com.forsale.app.datalayer.network.requestsbodies.SellListingBody;
import com.forsale.app.datalayer.network.requestsbodies.SetDoNotDisturbBody;
import com.forsale.app.datalayer.network.requestsbodies.ToggleAnonymityBody;
import com.forsale.app.datalayer.network.requestsbodies.ToggleAutoRepostBody;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.network.responses.AdDurationResponse;
import com.forsale.app.datalayer.network.responses.AddAdditionalContactsResponse;
import com.forsale.app.datalayer.network.responses.AddonsResponse;
import com.forsale.app.datalayer.network.responses.CheckFreeAdsAllowanceResponse;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.NewListingResponse;
import com.forsale.app.datalayer.network.responses.SetDoNotDisturbResponse;
import com.forsale.app.datalayer.network.responses.ToggleAnonymityResponse;
import com.forsale.app.datalayer.network.responses.ToggleAutoRepostResponse;
import i10.a;
import i10.o;
import java.util.List;
import wz.p;
/* compiled from: MyListingsService.kt */
/* loaded from: classes2.dex */
public interface MyListingsService {
    @o("MyListings/addAdditionalContacts")
    Object addAdditionalContacts(@a AddAdditionalContactsBody addAdditionalContactsBody, zz.a<? super AddAdditionalContactsResponse> aVar);

    @o("MyListings/checkFreeAdsAllowance")
    Object checkFreeAdsAllowanceAsync(@a CheckFreeAdsAllowanceRequestBody checkFreeAdsAllowanceRequestBody, zz.a<? super CheckFreeAdsAllowanceResponse> aVar);

    @o("MyListings/editListing")
    Object editListingAsync(@a ListingDetailsEntity listingDetailsEntity, zz.a<? super NewListingResponse> aVar);

    @o("MyListings/getAboutToExpireListings")
    Object getAboutToExpireListings(@a AboutToExpireRequestBody aboutToExpireRequestBody, zz.a<? super List<AboutToExpireListing>> aVar);

    @o("MyListings/getPaidAndFreeDurations")
    Object getAdDurationAsync(@a AdDurationBody adDurationBody, zz.a<? super AdDurationResponse> aVar);

    @o("MyListings/getAddons")
    Object getAddonsAsync(@a GetAddonsRequestBody getAddonsRequestBody, zz.a<? super AddonsResponse> aVar);

    @o("MyListings/getListings")
    Object getListings(@a GetMyListingsBody getMyListingsBody, zz.a<? super ListingsResponse> aVar);

    @o("MyListings/RecentlyViewedListings")
    Object getRecentlyViewedListings(@a GetRecentlyViewedBody getRecentlyViewedBody, zz.a<? super ListingsResponse> aVar);

    @o("MyListings/repostListing")
    Object repostListing(@a RepostListingBody repostListingBody, zz.a<? super RepostListingEntity> aVar);

    @o("MyListings/saveListing")
    Object saveListingAsync(@a ListingDetailsEntity listingDetailsEntity, zz.a<? super NewListingResponse> aVar);

    @o("MyListings/sellListing")
    Object sellListing(@a SellListingBody sellListingBody, zz.a<? super SellListingEntity> aVar);

    @o("MyListings/setAboutToExpireListingViewed")
    Object setAboutToExpireListingViewed(@a AboutToExpireViewedRequestBody aboutToExpireViewedRequestBody, zz.a<? super p> aVar);

    @o("MyListings/setNotDisturb")
    Object setNotDisturb(@a SetDoNotDisturbBody setDoNotDisturbBody, zz.a<? super SetDoNotDisturbResponse> aVar);

    @o("MyListings/toggleAnonymity")
    Object toggleAnonymity(@a ToggleAnonymityBody toggleAnonymityBody, zz.a<? super ToggleAnonymityResponse> aVar);

    @o("MyListings/toggleAutoRepost")
    Object toggleAutoRepost(@a ToggleAutoRepostBody toggleAutoRepostBody, zz.a<? super ToggleAutoRepostResponse> aVar);
}
