package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.IncrementCallClicksEntity;
import com.forsale.app.datalayer.network.entities.IncrementPushClicksResponse;
import com.forsale.app.datalayer.network.entities.IncrementViewCountBody;
import com.forsale.app.datalayer.network.entities.IncrementViewCountResponse;
import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.requestsbodies.IncrementPushClicksBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingAnalyticsBody;
import com.forsale.app.datalayer.network.responses.ListingAnalyticsResponse;
import i10.a;
import i10.o;
/* compiled from: AnalyticsService.kt */
/* loaded from: classes2.dex */
public interface AnalyticsService {
    @o("Analytics/getCallClicks")
    Object getCallClicks(@a ListingAnalyticsBody listingAnalyticsBody, zz.a<? super ListingAnalyticsResponse> aVar);

    @o("Analytics/getListingViewCounts")
    Object getListingViewCounts(@a ListingAnalyticsBody listingAnalyticsBody, zz.a<? super ListingAnalyticsResponse> aVar);

    @o("Analytics/incrementCallClicks")
    Object incrementCallClicks(@a IncrementCallClicksBody incrementCallClicksBody, zz.a<? super IncrementCallClicksEntity> aVar);

    @o("Analytics/incrementPowerPinViews")
    Object incrementPowerPinViews(@a IncrementViewCountBody incrementViewCountBody, zz.a<? super IncrementViewCountResponse> aVar);

    @o("Analytics/incrementPushMessageClicks")
    Object incrementPushMessageClicks(@a IncrementPushClicksBody incrementPushClicksBody, zz.a<? super IncrementPushClicksResponse> aVar);
}
