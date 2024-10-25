package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsSettingsResponseModel;
import i10.f;
import i10.s;
import zz.a;
/* compiled from: ListingService.kt */
/* loaded from: classes2.dex */
public interface ListingService {
    @f("listings/{listingId}")
    Object getBuyerListingDetails(@s("listingId") String str, a<? super BuyerListingDetailsResponseModel> aVar);

    @f("listings/settings")
    Object getBuyerListingDetailsSettings(a<? super BuyerListingDetailsSettingsResponseModel> aVar);
}
